package com.algafood.algafoodapi.listener;

import com.algafood.algafoodapi.di.notificacao.NivelUrgencia;
import com.algafood.algafoodapi.di.notificacao.Notificador;
import com.algafood.algafoodapi.di.notificacao.TipoNotificador;
import com.algafood.algafoodapi.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @Autowired
    @TipoNotificador(NivelUrgencia.URGENTE)
    private Notificador notificador;

    @EventListener
    public void clienteAtivadListener(ClienteAtivadoEvent clienteAtivadoEvent){
        notificador.notificar(clienteAtivadoEvent.getCliente(),
                "Cliente " + clienteAtivadoEvent.getCliente().getNome() + "  ativado com sucesso!");
    }
}
