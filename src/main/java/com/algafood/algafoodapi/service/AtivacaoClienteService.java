package com.algafood.algafoodapi.service;

import com.algafood.algafoodapi.di.modelo.Cliente;
import com.algafood.algafoodapi.di.notificacao.NivelUrgencia;
import com.algafood.algafoodapi.di.notificacao.Notificador;
import com.algafood.algafoodapi.di.notificacao.TipoNotificador;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired
    private ApplicationEventPublisher publisher;

    public void ativar(Cliente cliente){
        cliente.ativar();
        this.publisher.publishEvent(new ClienteAtivadoEvent(cliente));
    }
}
