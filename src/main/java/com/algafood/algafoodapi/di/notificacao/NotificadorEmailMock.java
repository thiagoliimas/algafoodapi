package com.algafood.algafoodapi.di.notificacao;

import com.algafood.algafoodapi.di.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("des")
@TipoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmailMock implements Notificador{

    public NotificadorEmailMock() {
        System.out.println("Notificador de email MOCK");
    }

    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Mock: Notificação seria enviada para o cliente %s através do email %s - Mensagem: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
