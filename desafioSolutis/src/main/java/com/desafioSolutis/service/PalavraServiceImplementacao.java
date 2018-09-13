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
	PalavraRepositorio palavraRepositorio;	
	

	@Override
	public List<PalavraEntity> obterPalavrasAnteriores() {
		return palavraRepositorio.findAll();
	}

	@Override
	public String obterVogalValida(String palavra) {
		List<String> listaVogais =  Arrays.asList("A", "a", "E", "e", "I", "i", "O", "o", "U", "u");
		long inicio = System.currentTimeMillis();
		char [] letras = palavra.toCharArray();
		List<String> listaVogaisRepetidas = new ArrayList<String>();
		List<String> listaVogaisNRepetidas = new ArrayList<String>();
		if(!StringUtils.isEmpty(palavra) && palavra.length() >= 3) {
			for(int i=2; i < palavra.length(); i++) {
				if(listaVogais.contains(String.valueOf(letras[i-2])) && // verifica se eh vogal
						listaVogais.contains(String.valueOf(letras[i]))	&& // verifica se eh vogal
						!listaVogais.contains(String.valueOf(letras[i-1])) // meio tem que ser consoante
						) {
					if(listaVogaisNRepetidas.contains(String.valueOf(letras[i-2]))) {
						listaVogaisNRepetidas.remove(String.valueOf(letras[i-2]));
						listaVogaisRepetidas.add(String.valueOf(letras[i-2]));
					}else{
						listaVogaisNRepetidas.add(String.valueOf(letras[i-2]));
					}
					if(listaVogaisNRepetidas.contains(String.valueOf(letras[i]))) {
						listaVogaisNRepetidas.remove(String.valueOf(letras[i]));
						listaVogaisRepetidas.add(String.valueOf(letras[i]));
					}else{
						listaVogaisNRepetidas.add(String.valueOf(letras[i]));
					}
				}	
			}
		}		
		palavraRepositorio.save(new PalavraEntity(palavra, listaVogaisNRepetidas.get(listaVogaisNRepetidas.size()-1)));
		
		
		return new StringBuffer().append("string: ").append(palavra).append(" \n").append(" vogal:")
				.append(listaVogaisNRepetidas.get(listaVogaisNRepetidas.size()-1)).append(" \n ")
				.append("tempoTotal: ")
				.append(System.currentTimeMillis() - inicio).append("ms").toString()
				;
	}
	

}
