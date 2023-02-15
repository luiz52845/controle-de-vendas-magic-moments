package io.github.luizfernandes.Controle.de.vendas.Service;

import io.github.luizfernandes.Controle.de.vendas.Entity.Fotografo;
import io.github.luizfernandes.Controle.de.vendas.Repository.FotografoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class FotografoService {

    @Autowired
    private FotografoRepository fotografoRepository;

    public ResponseEntity<Fotografo> save(@RequestBody Fotografo fotografo) {
        return ResponseEntity.ok(fotografoRepository.save(fotografo));
    }

    public List<Fotografo> listarTodosFotografos() {
        return fotografoRepository.findAll();
    }

    public Optional<Fotografo> getFotografoById(Long id) {
        return fotografoRepository.findById(id);
    }

    public Optional<Fotografo> deleteFotografo(Long id) {
        var fotografo = getFotografoById(id);
        if (fotografo.isEmpty()) {
            return Optional.empty();
        }

        fotografoRepository.deleteById(id);
        return fotografo;
    }
    public Fotografo updateFotografo(Long id, Fotografo fotografo) {
        fotografo.setId(id);
        return fotografoRepository.save(fotografo);
    }


}
