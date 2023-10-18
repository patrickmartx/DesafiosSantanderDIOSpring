package edu.patrick.consomeAPI.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.patrick.consomeAPI.model.Campeao;
import edu.patrick.consomeAPI.model.Jogador;
import edu.patrick.consomeAPI.repository.CampeaoRepository;
import edu.patrick.consomeAPI.repository.JogadorRepository;
import edu.patrick.consomeAPI.service.JogadorService;
import edu.patrick.consomeAPI.service.SwApiService;

@Service
public class JogadorServiceImpl implements JogadorService {
	
	@Autowired
	private JogadorRepository jogadorRepository;
	@Autowired
	private CampeaoRepository campeaoRepository;
	@Autowired
	private SwApiService swApiService;

	@Override
	public Iterable<Jogador> buscarTodos() {
		// TODO Auto-generated method stub
		return jogadorRepository.findAll();
	}

	@Override
	public Jogador buscarPorId(Long id) {
		// TODO Auto-generated method stub
		Optional<Jogador> jogador =  jogadorRepository.findById(id);
		return jogador.get();
	}

	@Override
	public void inserir(Jogador jogador) {
		// TODO Auto-generated method stub
		salvarJogadorComCampeao(jogador);
	}

	@Override
	public void atualizar(Long id, Jogador jogador) {
		// TODO Auto-generated method stub
		Optional<Jogador> clienteBd = jogadorRepository.findById(id);
		if (clienteBd.isPresent()) {
			salvarJogadorComCampeao(jogador);
		}
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		jogadorRepository.deleteById(id);

	}
	
	private void salvarJogadorComCampeao(Jogador jogador) {
		// Verificar se o Endereco do Cliente já existe (pelo CEP).
		
		Campeao novoCampeao = swApiService.consultarId(jogador.getIdCampeao());
		if (!campeaoRepository.existsById(novoCampeao.getName())) {
			campeaoRepository.save(novoCampeao);
		}
		
		jogador.setCampeao(novoCampeao);
		jogadorRepository.save(jogador);
	}

}
