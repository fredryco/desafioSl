package com.desafioSolutis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.desafioSolutis.model.PalavraEntity;
import com.desafioSolutis.service.PalavraService;

@RestController
public class PalavraController {
	
	@Autowired
	PalavraService palavraService;
	
	
	@RequestMapping(value = "/verificaVogal", method = RequestMethod.GET)
    public List<PalavraEntity> obterPalavrasAnteriores() {
		return palavraService.obterPalavrasAnteriores();
	}

    @RequestMapping(value = "/verificaVogal/{palavra}", method = RequestMethod.GET)
    public String obterVogalValida(@PathVariable("palavra") String palavra) {
		return palavraService.obterVogalValida(palavra);
}

}
