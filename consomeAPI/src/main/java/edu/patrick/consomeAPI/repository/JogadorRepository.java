package edu.patrick.consomeAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.patrick.consomeAPI.model.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long> {
	
}
