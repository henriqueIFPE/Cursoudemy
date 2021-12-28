package com.ifpe.udemy.service;

import java.util.List;

import com.ifpe.udemy.models.Cargo;
import com.ifpe.udemy.models.Funcionario;

public interface FuncionarioService {

	
	void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);

	void excluir(Long id);
	
	Funcionario buscarPorId(Long id);
	
	List<Funcionario> buscarTodos();
	
}
