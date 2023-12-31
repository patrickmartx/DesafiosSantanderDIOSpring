package edu.patrick.consomeAPI.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Campeao {
	
	@Id
	private String name;
	private String height;
	private String mass;
	private String gender;
	private String homeworld;

	
	
	
	public String getName() {
		return name;
		}

		public void setName(String name) {
		this.name = name;
		}

		public String getHeight() {
		return height;
		}

		public void setHeight(String height) {
		this.height = height;
		}

		public String getMass() {
		return mass;
		}

		public void setMass(String mass) {
		this.mass = mass;
		}

		public String getGender() {
		return gender;
		}

		public void setGender(String gender) {
		this.gender = gender;
		}

		public String getHomeworld() {
		return homeworld;
		}

		public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
		}
}
