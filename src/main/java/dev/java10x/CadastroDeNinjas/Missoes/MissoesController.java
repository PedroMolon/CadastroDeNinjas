package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @GetMapping("/missaoController")
    public String missaoController() {
        return "Classe Missao Controller";
    }

    @GetMapping("/listar")
    public String listarMissao() {
        return "Missoes listadas com sucesso";
    }

    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada com sucesso";
    }

    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao alterada com sucesso";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada com sucesso";
    }

}