package edu.patrick.consomeAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.patrick.consomeAPI.model.Campeao;

public interface CampeaoRepository extends JpaRepository<Campeao, String> {

}
