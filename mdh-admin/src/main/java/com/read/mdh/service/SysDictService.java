package com.read.mdh.service;

import com.read.core.service.CurdService;
import com.read.mdh.model.SysDict;

import java.util.List;
/**
 * 字典管理
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
