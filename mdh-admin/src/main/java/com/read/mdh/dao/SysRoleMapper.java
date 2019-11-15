package com.read.mdh.dao;

import java.util.List;

import com.read.mdh.model.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
    
    List<SysRole> findPage();

	List<SysRole> findAll();
	
	List<SysRole> findPageByName(@Param(value = "name") String name);
	
	List<SysRole> findByName(@Param(value = "name") String name);
}