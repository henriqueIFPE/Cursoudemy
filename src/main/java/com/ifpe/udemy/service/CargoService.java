package com.ifpe.udemy.service;

import java.util.List;

import com.ifpe.udemy.models.Cargo;

public interface CargoService {
	
	
	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);

	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();
}
