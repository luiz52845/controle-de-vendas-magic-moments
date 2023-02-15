package io.github.luizfernandes.Controle.de.vendas.Service;

import io.github.luizfernandes.Controle.de.vendas.Entity.Fotografo;
import io.github.luizfernandes.Controle.de.vendas.Entity.Venda;
import io.github.luizfernandes.Controle.de.vendas.Entity.Vendedor;
import io.github.luizfernandes.Controle.de.vendas.Repository.VendaRepository;
import io.github.luizfernandes.Controle.de.vendas.Repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    public ResponseEntity<Vendedor> save(@RequestBody Vendedor vendedor) {
        return ResponseEntity.ok(vendedorRepository.save(vendedor));
    }

    public List<Vendedor> listarTodosVendedores() {
        return vendedorRepository.findAll();
    }

    public Optional<Vendedor> getVendedorById(Long id) {
        return vendedorRepository.findById(id);
    }

    public Optional<Vendedor> deleteFotografo(Long id) {
        var vendedor = getVendedorById(id);
        if (vendedor.isEmpty()) {
            return Optional.empty();
        }

        vendedorRepository.deleteById(id);
        return vendedor;
    }
    public Vendedor updateVendedor(Long id, Vendedor vendedor) {
        vendedor.setId(id);
        return vendedorRepository.save(vendedor);
    }
}
