package com.ifpe.udemy.service;

import java.util.List;

import com.ifpe.udemy.models.Cargo;
import com.ifpe.udemy.models.Departamento;

public interface DepartamentoService {

	void salvar(Departamento departamento);
	
	void editar(Departamento departamento);

	void excluir(Long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscarTodos();
	
}
