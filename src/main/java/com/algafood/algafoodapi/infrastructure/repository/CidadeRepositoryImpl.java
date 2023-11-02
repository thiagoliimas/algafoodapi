package com.algafood.algafoodapi.infrastructure.repository;

import com.algafood.algafoodapi.domain.model.Cidade;
import com.algafood.algafoodapi.domain.repository.CidadeRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CidadeRepositoryImpl implements CidadeRepository {

    @Autowired
    EntityManager manager;

    @Override
    public List<Cidade> getAll() {
        return manager.createQuery("from Cidade", Cidade.class).getResultList();
    }

    @Override
    public Cidade getById(Long id) {
        return manager.find(Cidade.class, id);
    }

    @Override
    @Transactional
    public Cidade add(Cidade cidade) {
        return manager.merge(cidade);
    }

    @Override
    @Transactional
    public void remove(Cidade cidade) {
        cidade = getById(cidade.getId());
        manager.remove(cidade);
    }
}
