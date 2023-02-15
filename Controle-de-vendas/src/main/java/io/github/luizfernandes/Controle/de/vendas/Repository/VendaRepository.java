package io.github.luizfernandes.Controle.de.vendas.Repository;


import io.github.luizfernandes.Controle.de.vendas.Entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface VendaRepository extends JpaRepository<Venda, Long> {

    //@Query("SELECT e FROM venda e WHERE e.dataHora BETWEEN ?1 AND ?2")

    //@Query( "SELECT * FROM venda v WHERE data_venda BETWEEN :dataInicial  AND :dataFinal;")

   // @Query("SELECT * FROM venda v WHERE v.data_venda >= :dataInicial AND v.data_venda <= :dataFinal")
   // List<Venda> buscarEntreDatas(
     //       @Param("dataInicial") LocalDateTime dataInicial,
      //      @Param("dataFinal") LocalDateTime dataFinal);

  //  @Query("SELECT * FROM venda  WHERE data_venda = :dataInicial")
  //  List<Venda> buscarData(
   //         @Param("dataInicial") LocalDateTime dataInicial);


//    @Query(value ="SELECT * FROM venda  WHERE data_venda =: dataInicial")
//    List<Venda> buscarData( LocalDateTime dataInicial);

    List<Venda> findByDataVendaBetween(Date dataInicial, Date dataFinal);
}
