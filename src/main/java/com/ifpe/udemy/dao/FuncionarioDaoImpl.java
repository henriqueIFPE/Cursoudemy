package com.ifpe.udemy.dao;

import org.springframework.stereotype.Repository;

import com.ifpe.udemy.models.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{

}
