package com.garygml.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.garygml.app.dao.GenericDao;

public abstract class JpaService<E> implements GenericService<E>{
	
	@Autowired
	private GenericDao<E> dao;
	
	@Override
	@Transactional
	public void persist(E entity){
		dao.persist(entity);
	}
	
	@Override
	@Transactional
	public void remove(E entity){
		dao.remove(entity);
	}
	

}
