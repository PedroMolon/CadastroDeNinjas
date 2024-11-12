package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro_missao")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private RankMissao rankMissao;
    private NinjaModel ninja;

    public MissaoModel() {
    }

    public MissaoModel(Long id, String nomeMissao, RankMissao rankMissao) {
        this.id = id;
        this.nomeMissao = nomeMissao;
        this.rankMissao = rankMissao;
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

    public RankMissao getRankMissao() {
        return rankMissao;
    }

    public void setRankMissao(RankMissao rankMissao) {
        this.rankMissao = rankMissao;
    }

    @Override
    public String toString() {
        return "MissaoModel{" +
                "id=" + id +
                ", nome='" + nomeMissao + '\'' +
                ", rankMissao=" + rankMissao +
                '}';
    }
}
