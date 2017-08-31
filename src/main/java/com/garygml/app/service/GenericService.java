package com.garygml.app.service;

public interface GenericService<E> {
	
	public void persist(E entity);
	
	public void remove(E entity);
	
}
