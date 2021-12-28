package com.ifpe.udemy.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public abstract class AbstractDao<T, PK extends Serializable> {
	
	@SuppressWarnings("unchecked")
	private final Class<T> entityClass = 
			(Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	
	@PersistenceContext 
	private EntityManager entityManeger;
	
	protected EntityManager getEntityManager() {
		return entityManeger;
	}
	
	public void save(T entity) {
		entityManeger.persist(entity);
	}
	
	public void update(T entity) {
		entityManeger.merge(entity);
	}
	
	public void delete(PK id) {
		entityManeger.remove(entityManeger.getReference(entityClass, id));;
	}
	
	public T findById(PK id) {
		return entityManeger.find(entityClass, id);
	}
	
	public List<T> findAll(){
		return entityManeger
				.createQuery("from" + entityClass.getSimpleName(),entityClass)
				.getResultList();
	}
	
	
	protected List<T> createQuery(String jpql, Object... params){
		TypedQuery<T> query= entityManeger.createQuery(jpql, entityClass);
		for (int i = 0 ; i< params.length; i++) {
			query.setParameter(i+1,params[i]);	
		}
		return query.getResultList();
		
	}

}
