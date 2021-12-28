package com.ifpe.udemy.dao;

import java.util.List;

import com.ifpe.udemy.models.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);
	
	void delete (Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
	
	
}
