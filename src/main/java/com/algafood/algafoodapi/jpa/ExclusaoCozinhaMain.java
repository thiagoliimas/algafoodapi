package com.algafood.algafoodapi.jpa;

import com.algafood.algafoodapi.AlgafoodApiApplication;
import com.algafood.algafoodapi.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

/*
Aqui se criou uma classe "main" para sair do contexo de web, ou seja, usar um método main
para rodar o Spring sem que seja necessário o envio de requisições
 */
public class ExclusaoCozinhaMain {

    public static void main(String[] args) {

        //Aqui criamos um método que simula o contexto de uma aplicação web baseada na aplicação real
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE) //Tipo de apliação web queremos? NONE! Ou seja, nenhuma, não quermos aplicação web
                .run(args); //Aqui simula o método main

        CadastroCozinha beanCadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

        beanCadastroCozinha.listar().forEach(p -> System.out.println(p.getNome()));

        Cozinha cozinha = new Cozinha();
        cozinha.setId(1L);
        cozinha.setNome("Tailandesa");

         Cozinha cozinha1 = beanCadastroCozinha.getByIdCozinha(cozinha.getId());

        beanCadastroCozinha.removerCozinha(cozinha1);
    }
}

//Ler: https://blog.algaworks.com/tutorial-jpa/

//Continuar em: Conhecendo o padrão Aggregate do DDD