package com.algafood.algafoodapi.di.notificacao;

import com.algafood.algafoodapi.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
@TipoNotificador(NivelUrgencia.NORMAL)
public class NotificadorSMS implements Notificador{

    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando cliente %s através do SMS %s - Mensagem: %s\n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
