package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // controlador para api's rest
@RequestMapping // rotas
public class Controller {

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World!";
    }

}
