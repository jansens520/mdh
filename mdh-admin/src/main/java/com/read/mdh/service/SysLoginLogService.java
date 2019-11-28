package com.read.mdh.service;


import com.read.core.service.CurdService;
import com.read.mdh.model.SysLoginLog;

/**
 * 登录日志
 */
public interface SysLoginLogService extends CurdService<SysLoginLog> {
    /**
     * 记录登录日志
     * @param userName
     * @param ip
     * @return
     */
    int writeLoginLog(String userName, String ip);
}
