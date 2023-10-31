package com.algafood.algafoodapi.infrastructure.repository;

import com.algafood.algafoodapi.domain.model.Restaurante;
import com.algafood.algafoodapi.domain.repository.RestauranteRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestauranteRepositoryImpl implements RestauranteRepository {

    @Autowired
    EntityManager manager;

    @Override
    public List<Restaurante> getAll(){
        List<Restaurante> restauranteList = new ArrayList<>();
        TypedQuery<Restaurante> fromRestaurante = manager.createQuery("from Restaurante", Restaurante.class); //Cozinha tem que ser escrito exatamente igual ao nome da classe considerando o maiusculo e o minusculo.
        return fromRestaurante.getResultList();
    }

    @Override
    public Restaurante getById(Long id){
        return manager.find(Restaurante.class, id);
    }

    @Transactional
    @Override
    public Restaurante add(Restaurante restaurante){
        return manager.merge(restaurante);
    }

    @Transactional
    @Override
    public void remove(Restaurante restaurante){
        restaurante = getById(restaurante.getId());
        manager.remove(restaurante);
    }
}
