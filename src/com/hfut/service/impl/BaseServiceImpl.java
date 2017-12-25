package com.hfut.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hfut.mapper.AbsenseMapper;
import com.hfut.mapper.AdminMapper;
import com.hfut.mapper.AllowanceMapper;
import com.hfut.mapper.BaseMapper;
import com.hfut.mapper.BasicSalaryMapper;
import com.hfut.mapper.CheckOffMapper;
import com.hfut.mapper.DepartmentMapper;
import com.hfut.mapper.EmployeeMapper;
import com.hfut.mapper.OvertimeMapper;
import com.hfut.service.IBaseService;

@Service
public class BaseServiceImpl<T> implements IBaseService<T> {

	@Autowired
	public AbsenseMapper absenseMapper;
	@Autowired
	public AdminMapper adminMapper;
	@Autowired
	public AllowanceMapper allowanceMapper;
	@Autowired
	public BasicSalaryMapper basicSalaryMapper;
	@Autowired
	public CheckOffMapper checkOffMapper;
	@Autowired
	public DepartmentMapper departmentMapper;
	@Autowired
	public EmployeeMapper employeeMapper;
	@Autowired
	public OvertimeMapper overtimeMapper;

	public BaseMapper<T> baseMapper;

	@PostConstruct
	public void init() {
		try {
			ParameterizedType genericSuperclass = (ParameterizedType) this
					.getClass().getGenericSuperclass();
			Class<T> clazz = (Class<T>) genericSuperclass
					.getActualTypeArguments()[0];
			String simpleName = clazz.getSimpleName();
			String mapperName = simpleName.substring(0, 1).toLowerCase()
					+ simpleName.substring(1) + "Mapper";
			Field field = this.getClass().getDeclaredField(mapperName);
			this.getClass().getField("baseMapper").set(this, field.get(this));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(T t) {
		if (t != null)
			baseMapper.delete(t);
	}

	@Override
	public void insert(T t) {
		if (t != null)
			baseMapper.insert(t);
	}

	@Override
	public T selectByPrimaryKey(Integer id) {
		if (id != null)
			return baseMapper.selectByPrimaryKey(id);
		return null;
	}

	@Override
	public List<T> list() {
		return baseMapper.selectAll();
	}

	@Override
	public void update(T t) {
		baseMapper.updateByPrimaryKey(t);
	}

}
