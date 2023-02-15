package io.github.luizfernandes.Controle.de.vendas.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;

}
