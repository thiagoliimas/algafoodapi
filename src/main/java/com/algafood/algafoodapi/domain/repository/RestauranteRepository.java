package com.algafood.algafoodapi.domain.repository;

import com.algafood.algafoodapi.domain.model.Cozinha;
import com.algafood.algafoodapi.domain.model.Restaurante;

import java.util.List;

public interface RestauranteRepository {

    List<Restaurante> getAll();

    Restaurante getById(Long id);

    Restaurante add(Restaurante cozinha);

    void remove(Restaurante cozinha);
}
