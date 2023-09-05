package com.algafood.algafoodapi.service;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    /* Quando vc precisa criar essa configuração de instancia porém a instancia depende de parametros
    que não estão definidos nesta classe, vc pode simplismente declarar o metodo como recebendo a dependencia que
    vc precisa e isso será gerenciado pelo spring e funcionará
     */

//    @Bean
//    public AtivacaoClienteService ativacaoClienteService(Notificador notificador){
//        return new AtivacaoClienteService(notificador);
//    }
}
