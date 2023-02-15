package io.github.luizfernandes.Controle.de.vendas.Repository;


import io.github.luizfernandes.Controle.de.vendas.Entity.Venda;
import io.github.luizfernandes.Controle.de.vendas.Entity.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
}
