package com.algafood.algafoodapi.di.notificacao;

import com.algafood.algafoodapi.di.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);
}
