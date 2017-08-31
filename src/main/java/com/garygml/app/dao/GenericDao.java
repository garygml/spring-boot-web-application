package com.garygml.app.dao;

import javax.persistence.EntityManager;

public interface GenericDao<E> {

	public void persist(E entity);

	public void remove(E entity);

	public EntityManager getEntityManager();

}
