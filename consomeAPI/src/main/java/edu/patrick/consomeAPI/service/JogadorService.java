package edu.patrick.consomeAPI.service;

import edu.patrick.consomeAPI.model.Jogador;

public interface JogadorService {
	
	Iterable<Jogador> buscarTodos();

	Jogador buscarPorId(Long id);

	void inserir(Jogador jogador);

	void atualizar(Long id, Jogador jogador);

	void deletar(Long id);

}
