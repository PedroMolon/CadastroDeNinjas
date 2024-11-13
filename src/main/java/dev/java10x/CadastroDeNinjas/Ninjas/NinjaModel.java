package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

// Transforma a classe em uma entidade no banco do dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
// Annotations Lombok (Constructors, Getters, Setters)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id // marca que a variavel logo abaixo é um id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // estragégia para gerar o ID
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    // Coluna do email sera unica
    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "rank")
    private String rank;

    @Column(name = "idade")
    private int idade;

    // Varias missoes para um ninja
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign Key ou chave estrangeira
    private MissoesModel missoes;

}
