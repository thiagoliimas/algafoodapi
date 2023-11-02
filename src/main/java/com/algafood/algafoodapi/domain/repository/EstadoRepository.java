package com.algafood.algafoodapi.domain.repository;

import com.algafood.algafoodapi.domain.model.Estado;

import java.util.List;

public interface EstadoRepository {

    List<Estado> getAll();

    Estado getById(Long id);

    Estado add(Estado estado);

    void remove (Estado estado);
}
