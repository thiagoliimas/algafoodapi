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
public class ExclusaoPermissaoMain {

    public static void main(String[] args) {

        //Aqui criamos um método que simula o contexto de uma aplicação web baseada na aplicação real
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE) //Tipo de apliação web queremos? NONE! Ou seja, nenhuma, não quermos aplicação web
                .run(args); //Aqui simula o método main

        PermissaoRepository cozinhas = applicationContext.getBean(PermissaoRepository.class);

        cozinhas.getAll().forEach(p -> System.out.println(p.getNome()));

        Permissao cozinha = new Permissao();
        cozinha.setId(1L);
        cozinha.setNome("Administrador");

        Permissao cozinha1 = cozinhas.getById(cozinha.getId());

        cozinhas.remove(cozinha1);
    }
}

//Ler: https://blog.algaworks.com/tutorial-jpa/

//Continuar em: 3.14. Conhecendo e implementando o padrão Repository