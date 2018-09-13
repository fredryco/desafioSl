package com.desafioSolutis.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafioSolutis.model.PalavraEntity;

@Repository("palavraRepositorio")
public interface PalavraRepositorio extends JpaRepository<PalavraEntity, Integer> {

}
