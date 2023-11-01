package com.algafood.algafoodapi.jpa.restaurante;

import com.algafood.algafoodapi.AlgafoodApiApplication;
import com.algafood.algafoodapi.domain.model.Restaurante;
import com.algafood.algafoodapi.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

/*
Aqui se criou uma classe "main" para sair do contexo de web, ou seja, usar um método main
para rodar o Spring sem que seja necessário o envio de requisições
 */
public class CadastroRestauranteMain {

    public static void main(String[] args) {

        //Aqui criamos um método que simula o contexto de uma aplicação web baseada na aplicação real
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE) //Tipo de apliação web queremos? NONE! Ou seja, nenhuma, não quermos aplicação web
                .run(args); //Aqui simula o método main

        RestauranteRepository cozinhas = applicationContext.getBean(RestauranteRepository.class);

        Restaurante cozinha1 = new Restaurante();
        cozinha1.setNome("Brasileira");

        Restaurante cozinha2 = new Restaurante();
        cozinha2.setNome("Japonesa");

        Restaurante cozinhaCriada1 = cozinhas.add(cozinha1);
        Restaurante cozinhaCriada2 = cozinhas.add(cozinha2);

        System.out.println(cozinhaCriada1.getNome());
        System.out.println(cozinhaCriada2.getNome());

    }
}
