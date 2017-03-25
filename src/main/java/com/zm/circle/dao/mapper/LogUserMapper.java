package com.zm.circle.dao.mapper;

import com.zm.circle.model.LogUser;
import com.zm.circle.model.LogUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogUserMapper {
    long countByExample(LogUserExample example);

    int deleteByExample(LogUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(LogUser record);

    int insertSelective(LogUser record);

    List<LogUser> selectByExample(LogUserExample example);

    LogUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LogUser record, @Param("example") LogUserExample example);

    int updateByExample(@Param("record") LogUser record, @Param("example") LogUserExample example);

    int updateByPrimaryKeySelective(LogUser record);

    int updateByPrimaryKey(LogUser record);
}