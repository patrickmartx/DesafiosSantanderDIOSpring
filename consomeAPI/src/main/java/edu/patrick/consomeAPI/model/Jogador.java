package edu.patrick.consomeAPI.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Jogador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private Long idCampeao;
	@ManyToOne
	private Campeao campeao;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getIdCampeao() {
		return idCampeao;
	}
	public void setIdCampeao(Long idCampeao) {
		this.idCampeao = idCampeao;
	}
	public Campeao getCampeao() {
		return campeao;
	}
	public void setCampeao(Campeao campeao) {
		this.campeao = campeao;
	}
	
	
}
