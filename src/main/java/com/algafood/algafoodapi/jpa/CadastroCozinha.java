package com.algafood.algafoodapi.jpa;

import com.algafood.algafoodapi.domain.model.Cozinha;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class CadastroCozinha {

    @PersistenceContext //Essa anotação substitui o @Autowired em caso de injeção de EntityManager simplismente pq é especifica do JPA
    private EntityManager manager;

    public List<Cozinha> listar (){
        List<Cozinha> cozinhaList = new ArrayList<>();
        TypedQuery<Cozinha> fromCozinha = manager.createQuery("from Cozinha", Cozinha.class); //Cozinha tem que ser escrito exatamente igual ao nome da classe considerando o maiusculo e o minusculo.
        return fromCozinha.getResultList();
    }

    public Cozinha getByIdCozinha(Long id){
        return manager.find(Cozinha.class, id);
    }

    @Transactional
    public Cozinha saveCozinha(Cozinha cozinha){
        return manager.merge(cozinha);
    }

    @Transactional
    public void removerCozinha(Cozinha cozinha){
        cozinha = getByIdCozinha(cozinha.getId());
        manager.remove(cozinha);
    }
}
