package com.algafood.algafoodapi;

import com.algafood.algafoodapi.di.notificacao.NotificadorEmail;
import com.algafood.algafoodapi.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AlgaConfig {

    /*Essa classe de configuração serve para vc fazer injeção de dependencia de classe cujo construtor
    exige parametros que não são passados na forma simples de injeção de dependencia usando o @Autowired
    Para funcionar vc deve tirar o @Component da classe que deseja instnaciar e criar o aqui o metodo igual
    ao construtor da classe passando todas as informação necessário e anotando o metodo como @Bean*/

//    @Bean
//    @Primary
//    public NotificadorEmail notificadorEmail(){
//        NotificadorEmail notificadorEmail = new NotificadorEmail("smtp.algamail.com.br");
//        notificadorEmail.setCaixaAlta(true);
//        return notificadorEmail;
//    }

//    @Bean
//    public AtivacaoClienteService ativacaoClienteService(){
//        return new AtivacaoClienteService(notificadorEmail());
//    }
}
