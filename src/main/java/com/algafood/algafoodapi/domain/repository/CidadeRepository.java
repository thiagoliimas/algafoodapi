package com.algafood.algafoodapi.domain.repository;

import com.algafood.algafoodapi.domain.model.Cidade;

import java.util.List;

public interface CidadeRepository {

    List<Cidade> getAll();

    Cidade getById(Long id);

    Cidade add(Cidade cidade);

    void remove(Cidade cidade);
}
