package io.github.luizfernandes.Controle.de.vendas.Controller;

import io.github.luizfernandes.Controle.de.vendas.Entity.Venda;
import io.github.luizfernandes.Controle.de.vendas.Service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping("venda")
    public ResponseEntity<Venda> save(@RequestBody Venda venda) {

        return vendaService.save(venda);
    }

    @PutMapping("venda/{id}")
    public Venda updateVenda(@PathVariable Long id, @RequestBody Venda venda) {
        return vendaService.updateVenda(id, venda);
    }

    @GetMapping("venda")
    public List<Venda> listarTodosFotografos() {
        return vendaService.listarTodasVendas();
    }

    @GetMapping("venda/{id}")
    public Optional<Venda> buscarFotografo(@PathVariable Long id) {
        return vendaService.getVendaById(id);
    }

    @GetMapping("between")
    public List<Venda> buscarVenda(
            @RequestParam("dataInicial") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dataInicial,
            @RequestParam("dataFinal")  @DateTimeFormat(pattern = "yyyy-MM-dd") Date dataFinal ) {

        return vendaService.bustarEntreDatas(dataInicial, dataFinal);
    }

    @GetMapping("dataVenda")
    public List<Venda> buscarPorData(
            @RequestParam("dataVenda") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dataVenda)
            {
        return vendaService.buscarPorData(dataVenda);
    }


}
