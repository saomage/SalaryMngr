package com.hfut.mapper;

import java.util.List;


public interface BaseMapper<T> {
	public void delete(T t);

	public int insert(T t);

	public T selectByPrimaryKey(Integer id);

	public List<T> selectAll();

	public int updateByPrimaryKey(T t);
}
