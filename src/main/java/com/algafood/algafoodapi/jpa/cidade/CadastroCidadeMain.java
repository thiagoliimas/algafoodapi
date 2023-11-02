package com.algafood.algafoodapi.jpa.cidade;

import com.algafood.algafoodapi.AlgafoodApiApplication;
import com.algafood.algafoodapi.domain.model.Cidade;
import com.algafood.algafoodapi.domain.model.Cozinha;
import com.algafood.algafoodapi.domain.model.Estado;
import com.algafood.algafoodapi.domain.repository.CidadeRepository;
import com.algafood.algafoodapi.domain.repository.CozinhaRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

/*
Aqui se criou uma classe "main" para sair do contexo de web, ou seja, usar um método main
para rodar o Spring sem que seja necessário o envio de requisições
 */
public class CadastroCidadeMain {

    public static void main(String[] args) {

        //Aqui criamos um método que simula o contexto de uma aplicação web baseada na aplicação real
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE) //Tipo de apliação web queremos? NONE! Ou seja, nenhuma, não quermos aplicação web
                .run(args); //Aqui simula o método main

        CidadeRepository cozinhas = applicationContext.getBean(CidadeRepository.class);

        Cidade cozinha1 = new Cidade();
        cozinha1.setNome("Limoeiro do Norte");
        Estado estado = new Estado();
        estado.setId(1L);
        cozinha1.setEstado(estado);

        Cidade cozinhaCriada1 = cozinhas.add(cozinha1);

        System.out.println(cozinhaCriada1.getNome());
    }
}
