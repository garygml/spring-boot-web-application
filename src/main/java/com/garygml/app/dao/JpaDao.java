package com.garygml.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class JpaDao<E> implements GenericDao<E> {
	
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	@Override
	public void persist(E entity) {
		entityManager.persist(entity);
	}

	@Override
	public void remove(E entity) {
		entityManager.remove(entity);
	}

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	

}
