package com.algafood.algafoodapi.listener;

import com.algafood.algafoodapi.di.modelo.Cliente;
import com.algafood.algafoodapi.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    @EventListener
    public void notaFiscalEmitidaListener (ClienteAtivadoEvent clienteAtivadoEvent) {
        System.out.println("NF emitida para o cliente: " + clienteAtivadoEvent.getCliente().getNome());
    }
}
