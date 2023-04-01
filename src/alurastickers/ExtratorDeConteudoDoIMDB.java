package alurastickers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDoIMDB implements ExtratorDeConteudo  {
	
	public List<Conteudo> extraiConteudos(String json) {
		
		JsonParser parser = new JsonParser();
		
	List<Map<String, String>> listaDeAtributos = parser.parse(json);
	
	List<Conteudo> conteudoImbd = new ArrayList<>();
	
	for(Map<String, String> atributos : listaDeAtributos) {
		
		String titulo = atributos.get("title");
		String imagem = atributos.get("image");		
		Conteudo conteudosImdb = new Conteudo(titulo, imagem);
		conteudoImbd.add(conteudosImdb);
		
	}
	return conteudoImbd;
	}			
}	
		
	



