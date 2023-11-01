package com.algafood.algafoodapi.infrastructure.repository;

import com.algafood.algafoodapi.domain.model.FormaPagamento;
import com.algafood.algafoodapi.domain.model.Permissao;
import com.algafood.algafoodapi.domain.repository.PermissaoRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class PermissaoRepositoryImpl implements PermissaoRepository {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Permissao> getAll() {
        return entityManager.createQuery("from Permissao", Permissao.class).getResultList();
    }

    public Permissao getById(Long id) {
        return entityManager.find(Permissao.class, id);
    }

    @Override
    @Transactional
    public Permissao add(Permissao permissao) {
        return entityManager.merge(permissao);
    }

    @Override
    @Transactional
    public void remove(Permissao permissao) {
        permissao = getById(permissao.getId());
        entityManager.remove(permissao);
    }
}
