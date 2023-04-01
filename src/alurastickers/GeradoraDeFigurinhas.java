package alurastickers;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.InputStream;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import java.awt.image.BufferedImage;
import java.io.File;

public class GeradoraDeFigurinhas {

	public void cria(InputStream inputStream, String nomeArquivo) throws IOException {

		// Leitura da imagem
		BufferedImage imagemOriginal = ImageIO.read(inputStream);

		// Cria nova imagem em memória com transparencia e com tamanho novo, (em
		// memoria)
		int largura = imagemOriginal.getWidth();
		int altura = imagemOriginal.getHeight();
		int novaAltura = altura + 200;
		BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

		// Copiar a imagem original para nova imagem (em memoria),
		Graphics2D graficos = (Graphics2D) novaImagem.getGraphics();
		graficos.drawImage(imagemOriginal, 0, 0, null);

		// Configurando a Fonte
		Font fonte = new Font(Font.SANS_SERIF, Font.BOLD, 12);
		graficos.setFont(fonte);
		graficos.setColor(Color.yellow);

		// Escrever uma frase na nova imagem.
		graficos.drawString("FABI TE AMO", 130, novaAltura - 100);

		// Escrever a nova imagem em um arquivo
		ImageIO.write(novaImagem, "png", new File(nomeArquivo));

	}

}
