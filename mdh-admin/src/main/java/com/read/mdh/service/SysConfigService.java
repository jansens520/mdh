package com.read.mdh.service;

import com.read.core.service.CurdService;
import com.read.mdh.model.SysConfig;

import java.util.List;

/**
 * 系统配置管理
 */
public interface SysConfigService extends CurdService<SysConfig> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysConfig> findByLable(String lable);
}
