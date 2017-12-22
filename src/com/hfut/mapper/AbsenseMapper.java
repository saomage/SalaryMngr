package com.hfut.mapper;

import com.hfut.bean.Absense;
import java.util.List;

public interface AbsenseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Absense record);

    Absense selectByPrimaryKey(Integer id);

    List<Absense> selectAll();

    int updateByPrimaryKey(Absense record);
}