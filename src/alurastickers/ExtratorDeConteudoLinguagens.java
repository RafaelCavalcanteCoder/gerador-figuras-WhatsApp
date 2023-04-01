package alurastickers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoLinguagens implements ExtratorDeConteudo {

    public List<Conteudo> extraiConteudos(String json) {

        JsonParser parser = new JsonParser();

        List<Map<String, String>> listaDeAtributos = parser.parse(json);

        List<Conteudo> conteudoLinguagens = new ArrayList<>();

        for (Map<String, String> atributos : listaDeAtributos) {

            String titulo = atributos.get("title");
            String imagem = atributos.get("image");
            Conteudo conteudosLinguagens = new Conteudo(titulo, imagem);
            conteudoLinguagens.add(conteudosLinguagens);

        }
        return conteudoLinguagens;
    }
}
