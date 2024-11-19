package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/ninjaController")
    public String ninjaController() {
        return "Classe Ninja Controller";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    // Mostrar todos os ninjas (CREATE)
    @GetMapping("/todos")
    public String mostrarTodosNinjas() {
        return "Mostrar ninja";
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosNinjasPorId() {
        return "Mostrar ninja por id";
    }

    // Alterar dados dos ninja (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjasPorId() {
        return "Alterar ninja por id";
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId() {
        return "Ninja deletado por id";
    }

}
