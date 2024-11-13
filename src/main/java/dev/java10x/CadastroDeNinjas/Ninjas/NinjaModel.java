package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.*;

// Transforma a classe em uma entidade no banco do dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro_ninja")
// Annotations Lombok (Constructors, Getters, Setters)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id // marca que a variavel logo abaixo é um id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // estragégia para gerar o ID
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // Varias missoes para um ninja
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign Key ou chave estrangeira
    private MissaoModel missoes;

}
