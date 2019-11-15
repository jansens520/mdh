package com.read.mdh.service;

import java.util.List;

import com.read.core.service.CurdService;
import com.read.mdh.model.SysMenu;
import com.read.mdh.model.SysRole;
import com.read.mdh.model.SysRoleMenu;

/**
 * 角色管理
 */
public interface SysRoleService extends CurdService<SysRole> {

	/**
	 * 查询全部
	 * @return
	 */
	List<SysRole> findAll();

	/**
	 * 查询角色菜单集合
	 * @return
	 */
	List<SysMenu> findRoleMenus(Long roleId);

	/**
	 * 保存角色菜单
	 * @param records
	 * @return
	 */
	int saveRoleMenus(List<SysRoleMenu> records);

	/**
	 * 根据名称查询
	 * @param name
	 * @return
	 */
	List<SysRole> findByName(String name);

}
