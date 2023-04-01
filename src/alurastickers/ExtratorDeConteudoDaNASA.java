package alurastickers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDaNASA implements ExtratorDeConteudo {
	
	public List<Conteudo> extraiConteudos(String json){
		
	//extrair só os dados que me interessam (titulo, poster, classificação).
	JsonParser parser = new JsonParser();
	List<Map<String, String>> listaDeAtributosJson = parser.parse(json); //conteudo da body que consigo acessar pelo codificar json.
		
	List<Conteudo> conteudos = new ArrayList<>(); //array blocao de memoria pra fazer a lista.
	
	for(Map<String, String> atributos : listaDeAtributosJson) {
		String titulo = atributos.get("title");
		String UrlImagem = atributos.get("url");
		Conteudo conteudo =new Conteudo(titulo, UrlImagem); 
		conteudos.add(conteudo); //adicionando conteudo que engloba : body, json, listaDeAtributosJson, e o get do title e url.
		//popular a lista.
	}
	return conteudos;
	
	}

}
