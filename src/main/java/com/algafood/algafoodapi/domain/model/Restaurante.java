package com.algafood.algafoodapi.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "restaurante")
@Data
@EqualsAndHashCode(of = "id")
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(name = "taxa_frete", precision = 4, scale = 2)
    private BigDecimal taxaFrete;
}
