package com.zm.circle.dao.mapper;

import com.zm.circle.model.RRecord;
import com.zm.circle.model.RRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RRecordMapper {
    long countByExample(RRecordExample example);

    int deleteByExample(RRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(RRecord record);

    int insertSelective(RRecord record);

    List<RRecord> selectByExample(RRecordExample example);

    RRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RRecord record, @Param("example") RRecordExample example);

    int updateByExample(@Param("record") RRecord record, @Param("example") RRecordExample example);

    int updateByPrimaryKeySelective(RRecord record);

    int updateByPrimaryKey(RRecord record);
}