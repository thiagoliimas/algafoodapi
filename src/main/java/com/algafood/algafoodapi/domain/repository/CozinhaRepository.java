package com.algafood.algafoodapi.domain.repository;

import com.algafood.algafoodapi.domain.model.Cozinha;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CozinhaRepository {

    List<Cozinha> getAll();

    Cozinha getById(Long id);

    Cozinha add(Cozinha cozinha);

    void remove(Cozinha cozinha);
}
