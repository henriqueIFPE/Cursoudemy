package com.ifpe.udemy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifpe.udemy.dao.DepartamentoDao;
import com.ifpe.udemy.models.Departamento;

@Service @Transactional(readOnly = false)
public class DepartamentoServicesImpl implements DepartamentoService{

	@Autowired
	private DepartamentoDao dao;
	
	
	
	@Override
	public void salvar(Departamento departamento) {
		dao.save(departamento);
		
	}

	@Override
	public void editar(Departamento departamento) {
		dao.update(departamento);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override	@Transactional(readOnly = true)
	public Departamento buscarPorId(Long id) {

		return dao.findById(id);
	}

	@Override 	@Transactional(readOnly = true)
	public List<Departamento> buscarTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	
	
}
