package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro_missao")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;

    private String dificuldadeMissao;

    // Um ninja para varias missoes
    @OneToMany(mappedBy = "missoes") // Mapeamento de tabelas
    private List<NinjaModel> ninja;

    public MissaoModel() {
    }

    public MissaoModel(Long id, String nomeMissao, String dificuldadeMissao) {
        this.id = id;
        this.nomeMissao = nomeMissao;
        this.dificuldadeMissao = dificuldadeMissao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getDificuldadeMissao() {
        return dificuldadeMissao;
    }

    public void setDificuldadeMissao(String dificuldadeMissao) {
        this.dificuldadeMissao = dificuldadeMissao;
    }

    @Override
    public String toString() {
        return "MissaoModel{" +
                "id=" + id +
                ", nomeMissao='" + nomeMissao + '\'' +
                ", dificuldadeMissao='" + dificuldadeMissao + '\'' +
                '}';
    }
}
