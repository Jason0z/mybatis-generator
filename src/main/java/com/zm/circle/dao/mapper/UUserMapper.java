package com.zm.circle.dao.mapper;

import com.zm.circle.model.UUser;
import com.zm.circle.model.UUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UUserMapper {
    long countByExample(UUserExample example);

    int deleteByExample(UUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(UUser record);

    int insertSelective(UUser record);

    List<UUser> selectByExample(UUserExample example);

    UUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UUser record, @Param("example") UUserExample example);

    int updateByExample(@Param("record") UUser record, @Param("example") UUserExample example);

    int updateByPrimaryKeySelective(UUser record);

    int updateByPrimaryKey(UUser record);
}