package edu.patrick.consomeAPI.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.patrick.consomeAPI.model.Campeao;

@FeignClient(name = "swapi", url = "https://swapi.dev/api")
public interface SwApiService {
	
	@GetMapping("/people/{id}/?format=json")
	Campeao consultarId(@PathVariable("id") Long idCampeao);
}
