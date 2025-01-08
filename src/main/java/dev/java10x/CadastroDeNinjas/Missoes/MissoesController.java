package dev.java10x.CadastroDeNinjas.Missoes;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private final MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @PostMapping("/criar")
    public ResponseEntity<String> criarMissao(@RequestBody MissoesDTO missao) {
        MissoesDTO missaoDTO = missoesService.criarMissao(missao);
        return ResponseEntity.status(HttpStatus.CREATED)
        .body("Missão criada com sucesso: " + missaoDTO.getNomeMissao());
    }

    @GetMapping("/listar")
    public ResponseEntity<List<MissoesDTO>> listarMissoes() {
        List<MissoesDTO> missoes = missoesService.listarMissoes();
        return ResponseEntity.ok(missoes);
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarMissoesPorId(@PathVariable Long id) {
        MissoesDTO missao = missoesService.listarMissaoPorId(id);
        if (missao != null) {
            return ResponseEntity.ok(missao);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body("Missão com Id " + id + " não existe nos nossos registros");
        }
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarMissao(@PathVariable Long id, @RequestBody MissoesDTO missaoAtualizada) {
        MissoesDTO missao = missoesService.alterarNinjaPorId(id, missaoAtualizada);
        if (missao != null) {
            return ResponseEntity.ok(missao);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body("Missão com Id " + id + " não existe nos nossos registros");
        }
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarMissao(@PathVariable Long id) {
        if (missoesService.listarMissaoPorId(id) != null) {
            missoesService.removerMissaoPorId(id);
            return ResponseEntity.ok("Missão com Id " + id + " deletado com sucesso");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body("Missão com Id " + id + " não encontrado");
        }
    }

}