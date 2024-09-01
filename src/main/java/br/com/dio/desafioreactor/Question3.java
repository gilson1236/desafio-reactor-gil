package br.com.dio.desafioreactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Question3 {

    /*
    Verifica se o usuário passado é valido, caso seja retorna void, caso contrário deve disparar uma exception
    (para esse desafio vamos considerar que o usário é valido quando ele tem uma senha com mais de 8 caractéres)
     */
    public Mono<Void> userIsValid(final User user){
        return Mono.fromRunnable(() -> {
            if(user.password() == null || user.password().length() < 9)
                throw new IllegalArgumentException("Senha de usuário inválida. Ela deve ter ao menos 9 caracteres");
        });
    }

}
