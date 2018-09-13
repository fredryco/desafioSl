package com.desafioSolutis.service;

import java.util.List;

import com.desafioSolutis.model.PalavraEntity;

public interface PalavraService {
	String obterVogalValida(String palavra);
	List<PalavraEntity> obterPalavrasAnteriores();
}
