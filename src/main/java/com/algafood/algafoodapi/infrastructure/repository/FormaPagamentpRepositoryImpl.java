package com.algafood.algafoodapi.infrastructure.repository;

import com.algafood.algafoodapi.domain.model.FormaPagamento;
import com.algafood.algafoodapi.domain.repository.FormaPagamentoRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class FormaPagamentpRepositoryImpl implements FormaPagamentoRepository {

    @Autowired
    EntityManager manager;

    @Override
    public List<FormaPagamento> getAll() {
        var fromFormaPamgamento = manager.createQuery("from FormaPagamento", FormaPagamento.class);
        return fromFormaPamgamento.getResultList();
    }

    @Override
    public FormaPagamento getById(Long id) {
        return manager.find(FormaPagamento.class, id);
    }

    @Override
    @Transactional
    public FormaPagamento add(FormaPagamento formaPagamento) {
        return manager.merge(formaPagamento);
    }

    @Override
    @Transactional
    public void remove(FormaPagamento formaPagamento) {
        formaPagamento = getById(formaPagamento.getId());
        manager.remove(formaPagamento);
    }
}
