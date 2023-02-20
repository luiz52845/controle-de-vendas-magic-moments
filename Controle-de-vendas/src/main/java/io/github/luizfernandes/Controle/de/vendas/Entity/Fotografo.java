package io.github.luizfernandes.Controle.de.vendas.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor

public class Fotografo {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String Nome;
    private String SobreNome;
    private String NomeCompleto;
    private String QrCode;

    public Fotografo() {
    }

    public Fotografo(String nome) {
        this.Nome = nome;
    }

}
