package com.ifpe.udemy.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "ENDERECOS")
public class Endereco extends AbstractEntity<Long> {

	@Column(nullable = false)
	private String logradoro;
	
	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false)
	private String cidade;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 2)
	private UF uf;
	
	
}
