package com.algafood.algafoodapi.domain.repository;

import com.algafood.algafoodapi.domain.model.Cozinha;

import java.util.List;

public interface CozinhaRepository {

    List<Cozinha> getAll();

    Cozinha getById(Long id);

    Cozinha add(Cozinha cozinha);

    void remove(Cozinha cozinha);
}
