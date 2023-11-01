package com.algafood.algafoodapi.domain.repository;

import com.algafood.algafoodapi.domain.model.Permissao;

import java.util.List;

public interface PermissaoRepository {

    List<Permissao> getAll();

    Permissao getById(Long id);

    Permissao add(Permissao permissao);

    void remove(Permissao permissao);
}
