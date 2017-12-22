package com.hfut.mapper;

import com.hfut.bean.Allowance;
import java.util.List;

public interface AllowanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Allowance record);

    Allowance selectByPrimaryKey(Integer id);

    List<Allowance> selectAll();

    int updateByPrimaryKey(Allowance record);
}