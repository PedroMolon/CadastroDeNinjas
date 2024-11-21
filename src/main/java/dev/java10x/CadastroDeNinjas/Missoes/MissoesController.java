package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao) {
        return missoesService.criarMissao(missao);
    }

    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes() {
        return missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesPorId(@PathVariable Long id) {
        return missoesService.listarMissaoPorId(id);
    }

    @PutMapping("/alterar/{id}")
    public MissoesModel alterarMissao(@PathVariable Long id, @RequestBody MissoesModel missao) {
        return missoesService.alterarNinjaPorId(id, missao);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id) {
        missoesService.removerMissaoPorId(id);
    }

}
