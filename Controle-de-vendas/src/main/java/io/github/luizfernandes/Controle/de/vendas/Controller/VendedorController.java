package io.github.luizfernandes.Controle.de.vendas.Controller;

import io.github.luizfernandes.Controle.de.vendas.Entity.Fotografo;
import io.github.luizfernandes.Controle.de.vendas.Entity.Vendedor;
import io.github.luizfernandes.Controle.de.vendas.Service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    @PostMapping("vendedor")
    public ResponseEntity<Vendedor> save (@RequestBody Vendedor vendedor){
        return vendedorService.save(vendedor);
    }

    @PutMapping("vendedor/{id}")
    public Vendedor updateFotografo(@PathVariable Long id, @RequestBody Vendedor fotografo) {
        return vendedorService.updateVendedor(id, fotografo);
    }

    @GetMapping("vendedor")
    public List<Vendedor> listarTodosFotografos() {
        return vendedorService.listarTodosVendedores();
    }

    @GetMapping("vendedor/{id}")
    public Optional<Vendedor> buscarFotografo(@PathVariable Long id) {
        return vendedorService.getVendedorById(id);
    }

    @DeleteMapping("vendedor/{id}")
    public void excluirFotografo(@PathVariable Long id) {
        vendedorService.deleteFotografo(id);
    }


}
