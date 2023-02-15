package io.github.luizfernandes.Controle.de.vendas.Service;

import io.github.luizfernandes.Controle.de.vendas.Entity.Venda;
import io.github.luizfernandes.Controle.de.vendas.Repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public ResponseEntity<Venda> save(@RequestBody Venda venda) {
       // venda.setDataVenda(LocalDateTime.now( ).plusDays(-2));
        return ResponseEntity.ok(vendaRepository.save(venda));
    }

    public List<Venda> listarTodasVendas() {
        return vendaRepository.findAll();
    }

    public Optional<Venda> getVendaById(Long id) {
        return vendaRepository.findById(id);
    }

    public Venda updateVenda(Long id, Venda fotografo) {
        fotografo.setId(id);
        return vendaRepository.save(fotografo);
    }


    public List<Venda> bustarEntreDatas(Date dataInicial, Date dataFinal) {
        return vendaRepository.findByDataVendaBetween(dataInicial , dataFinal );
    }

   // public List<Venda> buscarData(LocalDateTime dataInicial ) {
    //    return vendaRepository.buscarData(dataInicial );
  //  }
}
