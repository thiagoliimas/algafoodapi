package com.algafood.algafoodapi.jpa.permissao;

import com.algafood.algafoodapi.AlgafoodApiApplication;
import com.algafood.algafoodapi.domain.model.Permissao;
import com.algafood.algafoodapi.domain.repository.PermissaoRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

/*
Aqui se criou uma classe "main" para sair do contexo de web, ou seja, usar um método main
para rodar o Spring sem que seja necessário o envio de requisições
 */
public class CadastroPermissaoMain {

    public static void main(String[] args) {

        //Aqui criamos um método que simula o contexto de uma aplicação web baseada na aplicação real
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE) //Tipo de apliação web queremos? NONE! Ou seja, nenhuma, não quermos aplicação web
                .run(args); //Aqui simula o método main

        PermissaoRepository cozinhas = applicationContext.getBean(PermissaoRepository.class);

        Permissao cozinha1 = new Permissao();
        cozinha1.setNome("Consultor");

        Permissao cozinhaCriada1 = cozinhas.add(cozinha1);

        System.out.println(cozinhaCriada1.getNome());

//        Criar model, repository, repositoryImpl e a parte de teste de estado e cidade da aula 3.20
    }
}
