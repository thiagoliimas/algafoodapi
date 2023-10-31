package com.algafood.algafoodapi.infrastructure.repository;

import com.algafood.algafoodapi.domain.model.Cozinha;
import com.algafood.algafoodapi.domain.repository.CozinhaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CozinhaRepositoryImpl implements CozinhaRepository {

    @Autowired
    EntityManager manager;

    @Override
    public List<Cozinha> getAll(){
        List<Cozinha> cozinhaList = new ArrayList<>();
        TypedQuery<Cozinha> fromCozinha = manager.createQuery("from Cozinha", Cozinha.class); //Cozinha tem que ser escrito exatamente igual ao nome da classe considerando o maiusculo e o minusculo.
        return fromCozinha.getResultList();
    }

    @Override
    public Cozinha getById(Long id){
        return manager.find(Cozinha.class, id);
    }

    @Transactional
    @Override
    public Cozinha add(Cozinha cozinha){
        return manager.merge(cozinha);
    }

    @Transactional
    @Override
    public void remove(Cozinha cozinha){
        cozinha = getById(cozinha.getId());
        manager.remove(cozinha);
    }
}
