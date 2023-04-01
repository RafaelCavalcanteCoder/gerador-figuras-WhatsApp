package alurastickers;

import java.io.IOException;
import java.io.InputStream;

import java.net.URL;

import java.util.List;

public class App {

	public static void main(String[] args) throws IOException, InterruptedException {

		// fazer uma conexao HTTP e buscar os top 250 filmes
		//ExtratorDeConteudo extrator = new ExtratorConteudoLinguagens();
		//String url = "http://localhost:8080/linguagens";
		String url = "http://localhost:8080/linguagens";
		ExtratorDeConteudo extrator = new ExtratorDeConteudoDoIMDB();

		ClienteHttp http = new ClienteHttp(); // criando uma referencia um objeto. // dentro da classe tem um metodo que
												// busca dados da URL.
		String json = http.buscaDados(url);// chamando o metodo buscaDados e passando a URL como parametro, aquela url
											// acima.

		// exibir e manipular os dados

		// String url =
		// "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2023-03-29&end_date=2023-03-29";
		// //url que quero passar
		// ExtratorDeConteudo extrator = new ExtratorDeConteudoDaNASA();

		List<Conteudo> conteudos = extrator.extraiConteudos(json);

		GeradoraDeFigurinhas geradora = new GeradoraDeFigurinhas();

		for (int i = 0; i < 2; i++) {
			Conteudo conteudo = conteudos.get(i);

			InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
			String nomeArquivo = "saida/" + conteudo.getTitulo() + ".png";

			geradora.cria(inputStream, nomeArquivo);
			System.out.println();

			System.out.println(conteudo.getTitulo());
			System.out.println();

		}
	}

}
