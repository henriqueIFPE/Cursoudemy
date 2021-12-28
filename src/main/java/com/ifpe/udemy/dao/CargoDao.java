package com.ifpe.udemy.dao;

import java.util.List;

import com.ifpe.udemy.models.Cargo;


public interface CargoDao {

	void save(Cargo cargo);
	
	void update(Cargo cargo);
	
	void delete (Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
	
}
