package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;
// JPA é uma abstração das querryes do banco de dados

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {



}
