package br.com.alura.linguagens.api;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguaguemRepository extends MongoRepository<Linguagem, String> { // herda todos os atributos e metodos
                                                                                   // do MongoRepository

}
