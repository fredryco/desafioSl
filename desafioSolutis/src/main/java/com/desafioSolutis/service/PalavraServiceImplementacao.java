package com.desafioSolutis.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.desafioSolutis.model.PalavraEntity;
import com.desafioSolutis.repositorio.PalavraRepositorio;

@Component
public class PalavraServiceImplementacao implements PalavraService{

	@Autowired
	PalavraRegras palavraRegras;
	
	@Autowired
	PalavraRepositorio palavraRepositorio;
	

	@Override
	public List<PalavraEntity> obterPalavrasAnteriores() {
		return palavraRepositorio.findAll();
	}

	@Override
	public String obterVogalValida(String palavra) {
		return palavraRegras.obterVogalValida(palavra);
	}
	

}
