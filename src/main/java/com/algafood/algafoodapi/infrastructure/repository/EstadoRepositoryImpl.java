package com.algafood.algafoodapi.infrastructure.repository;

import com.algafood.algafoodapi.domain.model.Estado;
import com.algafood.algafoodapi.domain.repository.EstadoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EstadoRepositoryImpl implements EstadoRepository {

    @Autowired
    EntityManager manager;

    @Override
    public List<Estado> getAll() {
        return manager.createQuery("from Estado", Estado.class).getResultList();
    }

    @Override
    public Estado getById(Long id) {
        return manager.find(Estado.class, id);
    }

    @Override
    public Estado add(Estado estado) {
        return manager.merge(estado);
    }

    @Override
    public void remove(Estado estado) {
        estado = getById(estado.getId());
        manager.remove(estado);
    }
}
