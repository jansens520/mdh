package com.read.mdh.controller;

import java.util.List;

import com.read.core.http.HttpResult;
import com.read.core.page.PageRequest;
import com.read.mdh.model.SysLoginLog;
import com.read.mdh.service.SysLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录日志控制器
 */
@RestController
@RequestMapping("loginlog")
public class SysLoginLogController {

	@Autowired
	private SysLoginLogService sysLoginLogService;

	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysLoginLogService.findPage(pageRequest));
	}
	
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysLoginLog> records) {
		return HttpResult.ok(sysLoginLogService.delete(records));
	}
}
