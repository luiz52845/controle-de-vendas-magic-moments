package io.github.luizfernandes.Controle.de.vendas.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fotografo_id")
    private Fotografo fotografo;
    private String qualidade;
    private Boolean vinculado;
    private String motivo;
    private BigDecimal valorVenda;
    @ManyToOne
    @JoinColumn(name = "fotografo_vinculado_id")
    private Fotografo fotografoVinculado;
    private Long fotos;
    private Long fotosVendidas;
    @ManyToOne
    @JoinColumn(name = "vendedor_id")
    private Vendedor vendedor;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataVenda;


}
