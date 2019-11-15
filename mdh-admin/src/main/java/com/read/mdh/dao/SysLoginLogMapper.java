package com.read.mdh.dao;

import java.util.List;

import com.read.mdh.model.SysLog;
import com.read.mdh.model.SysLoginLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLoginLog record);

    int insertSelective(SysLoginLog record);

    SysLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLoginLog record);

    int updateByPrimaryKey(SysLoginLog record);
    
    List<SysLog> findPage();
    
    List<SysLog> findPageByUserName(@Param(value = "userName") String userName);
    
    List<SysLog> findPageByStatus(@Param(value = "status") String status);
}