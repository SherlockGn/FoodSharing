package com.gth.foodshare.dao;

import java.util.List;

import com.gth.foodshare.model.Mall;

public interface MallMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mall record);

    int insertSelective(Mall record);

    Mall selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mall record);

    int updateByPrimaryKeyWithBLOBs(Mall record);

    int updateByPrimaryKey(Mall record);
    
    List<Mall> findAll();
}