package br.com.alura.linguagens.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens") // aqui é o nome do banco de dados do mongoDb
public class Linguagem {
    @Id // identificar unico de cada documento. para gerar automaticamente.
    private String id; // recebe o id do de cada item relacionado no banco de dados.
    private String title;
    private String image;
    private int ranking;

    public Linguagem() { // precisa criar um construtor para ele consiga usar essa classe. mas o Spring
                         // já faz a magica aqui.

    }

    public Linguagem(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;

    }

    public String getImage() {
        return image;
    }

    public int getRanking() {
        return ranking;
    }
}
