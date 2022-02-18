package com.lidaye.mybatis.generator.dao;

import com.lidaye.mybatis.generator.entity.PosUser;
import com.lidaye.mybatis.generator.entity.PosUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PosUserMapper {
    long countByExample(PosUserExample example);

    int deleteByExample(PosUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PosUser record);

    int insertSelective(PosUser record);

    List<PosUser> selectByExample(PosUserExample example);

    PosUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PosUser record, @Param("example") PosUserExample example);

    int updateByExample(@Param("record") PosUser record, @Param("example") PosUserExample example);

    int updateByPrimaryKeySelective(PosUser record);

    int updateByPrimaryKey(PosUser record);
}