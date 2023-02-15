package io.github.luizfernandes.Controle.de.vendas.Controller;

import io.github.luizfernandes.Controle.de.vendas.Entity.Fotografo;
import io.github.luizfernandes.Controle.de.vendas.Repository.FotografoRepository;
import io.github.luizfernandes.Controle.de.vendas.Service.FotografoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FotografoController {

    @Autowired
    private FotografoService fotografoService;

    @PostMapping("fotografo")
    public ResponseEntity<Fotografo> save(@RequestBody Fotografo fotografo) {
        return fotografoService.save(fotografo);
    }

    @PutMapping("fotografo/{id}")
    public Fotografo updateFotografo(@PathVariable Long id, @RequestBody Fotografo fotografo) {
        return fotografoService.updateFotografo(id, fotografo);
    }

    @GetMapping("fotografo")
    public List<Fotografo> listarTodosFotografos() {
        return fotografoService.listarTodosFotografos();
    }

    @GetMapping("fotografo/{id}")
    public Optional<Fotografo> buscarFotografo(@PathVariable Long id) {
        return fotografoService.getFotografoById(id);
    }

    @DeleteMapping("fotografo/{id}")
    public void excluirFotografo(@PathVariable Long id) {
        fotografoService.deleteFotografo(id);
        //return fotografoRepository.delete(id);
    }
}
