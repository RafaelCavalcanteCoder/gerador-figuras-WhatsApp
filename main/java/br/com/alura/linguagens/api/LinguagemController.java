package br.com.alura.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// controller alguem faz uma requisição na web, e essa requição vai chegar em
// algum lugar na
// nossa aplicação, pra poder entender o que esta sendo solicitado e devolver
// uma resposta depois.
@RestController
public class LinguagemController {

    // private List<Linguagem> linguagens = List.of(new
    // Linguagem("Java","https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png",
    // 1),
    // new
    // Linguagem("PHP","https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png",2));

    // criar um objeto magicamente usando essa anotação. pq ela é complexa pra ser
    @Autowired // inicializada.
    private LinguaguemRepository repositorio;

    @GetMapping("/linguagens") // quando o navegador acessa/chama o endereço faz
    // uma requisiçã do tipo get buscar
    public List<Linguagem> obterLinguagens() {
        List<Linguagem> linguagens = repositorio.findAll(); // repositorio extender de repositorio MongoDB ,
        return linguagens;
    }

}
