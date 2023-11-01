package com.algafood.algafoodapi.domain.repository;

import com.algafood.algafoodapi.domain.model.Cozinha;
import com.algafood.algafoodapi.domain.model.FormaPagamento;

import java.util.List;

public interface FormaPagamentoRepository {

    List<FormaPagamento> getAll();

    FormaPagamento getById(Long id);

    FormaPagamento add(FormaPagamento formaPagamento);

    void remove(FormaPagamento formaPagamento);
}
