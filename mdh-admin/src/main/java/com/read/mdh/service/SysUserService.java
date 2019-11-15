package com.read.mdh.service;

import java.io.File;
import java.util.List;
import java.util.Set;

import com.read.core.page.PageRequest;
import com.read.core.service.CurdService;
import com.read.mdh.model.SysUser;
import com.read.mdh.model.SysUserRole;

public interface SysUserService extends CurdService<SysUser> {

    SysUser findByName(String username);

    /**
     * 查找用户的菜单权限标识集合
     * @param userName
     * @return
     */
    Set<String> findPermissions(String userName);

    /**
     * 查找用户的角色集合
     * @return
     */
    List<SysUserRole> findUserRoles(Long userId);

    /**
     * 生成用户信息Excel文件
     * @param pageRequest 要导出的分页查询参数
     * @return
     */
    File createUserExcelFile(PageRequest pageRequest);
}