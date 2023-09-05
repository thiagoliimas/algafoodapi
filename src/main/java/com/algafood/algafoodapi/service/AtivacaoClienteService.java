package com.algafood.algafoodapi.service;

import com.algafood.algafoodapi.di.modelo.Cliente;
import com.algafood.algafoodapi.di.notificacao.NivelUrgencia;
import com.algafood.algafoodapi.di.notificacao.Notificador;
import com.algafood.algafoodapi.di.notificacao.TipoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired
    @TipoNotificador(NivelUrgencia.URGENTE)
    private Notificador notificador;

    public void ativar(Cliente cliente){
        cliente.ativar();
        notificador.notificar(cliente, "Cliente ativado com sucesso!");
    }
}
