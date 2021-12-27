package com.ifpe.udemy.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{


	@Column(nullable = false, unique = true, length = 50)
	private String nome;

	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
