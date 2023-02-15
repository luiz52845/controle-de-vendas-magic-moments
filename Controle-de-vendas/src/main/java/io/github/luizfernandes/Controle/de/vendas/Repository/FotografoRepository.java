package io.github.luizfernandes.Controle.de.vendas.Repository;


import io.github.luizfernandes.Controle.de.vendas.Entity.Fotografo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FotografoRepository extends JpaRepository<Fotografo, Long> {
}
