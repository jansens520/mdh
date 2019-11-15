package com.read.mdh.service;

import com.read.core.service.CurdService;
import com.read.mdh.model.SysDept;

import java.util.List;

/**
 * 机构管理
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @return
	 */
	List<SysDept> findTree();
}
