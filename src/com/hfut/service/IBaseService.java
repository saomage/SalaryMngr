package com.hfut.service;

import java.util.List;

public interface IBaseService<T> {

	public void delete(T t);

	public void insert(T t);

	public T selectByPrimaryKey(Integer id);

	public List<T> list();

	public void update(T t);
}
