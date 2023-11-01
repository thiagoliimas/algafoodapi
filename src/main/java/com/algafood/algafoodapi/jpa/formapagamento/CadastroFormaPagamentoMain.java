package com.algafood.algafoodapi.jpa.formapagamento;

import com.algafood.algafoodapi.AlgafoodApiApplication;
import com.algafood.algafoodapi.domain.model.Cozinha;
import com.algafood.algafoodapi.domain.model.FormaPagamento;
import com.algafood.algafoodapi.domain.repository.CozinhaRepository;
import com.algafood.algafoodapi.domain.repository.FormaPagamentoRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

/*
Aqui se criou uma classe "main" para sair do contexo de web, ou seja, usar um método main
para rodar o Spring sem que seja necessário o envio de requisições
 */
public class CadastroFormaPagamentoMain {

    public static void main(String[] args) {

        //Aqui criamos um método que simula o contexto de uma aplicação web baseada na aplicação real
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE) //Tipo de apliação web queremos? NONE! Ou seja, nenhuma, não quermos aplicação web
                .run(args); //Aqui simula o método main

        FormaPagamentoRepository cozinhas = applicationContext.getBean(FormaPagamentoRepository.class);

        FormaPagamento cozinha1 = new FormaPagamento();
        cozinha1.setDescricao("Brasileira");

        FormaPagamento cozinha2 = new FormaPagamento();
        cozinha2.setDescricao("Japonesa");

        FormaPagamento cozinhaCriada1 = cozinhas.add(cozinha1);
        FormaPagamento cozinhaCriada2 = cozinhas.add(cozinha2);

        cozinhas.add(cozinha1);
        cozinhas.add(cozinha2);

        System.out.println(cozinhaCriada1.getDescricao());
        System.out.println(cozinhaCriada2.getDescricao());

    }
}
