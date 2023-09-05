package com.algafood.algafoodapi.di.notificacao;

import com.algafood.algafoodapi.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador{

    @Value("${notificador.email.host-servidor}")
    private String host;

    @Value("${notificador.email.port}")
    private Integer port;

    public NotificadorEmail() {
        System.out.println("Notificador de email REAL");
    }

    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando cliente %s através do email %s - Mensagem: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
        System.out.println("Host: " + host + " - Porta: " + port);
    }
}
