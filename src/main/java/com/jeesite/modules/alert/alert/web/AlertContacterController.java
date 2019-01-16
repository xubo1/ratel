/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.alert.alert.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.alert.alert.entity.AlertContacter;
import com.jeesite.modules.alert.alert.service.AlertContacterService;

/**
 * t_alert_contacterController
 * @author littleyellow
 * @version 2019-01-14
 */
@Controller
@RequestMapping(value = "${adminPath}/alert/alertContacter")
public class AlertContacterController extends BaseController {

	@Autowired
	private AlertContacterService alertContacterService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public AlertContacter get(String id, boolean isNewRecord) {
		return alertContacterService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("alert:alertContacter:view")
	@RequestMapping(value = {"list", ""})
	public String list(AlertContacter alertContacter, Model model) {
		model.addAttribute("alertContacter", alertContacter);
		return "alert/alert/alertContacterList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("alert:alertContacter:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<AlertContacter> listData(AlertContacter alertContacter, HttpServletRequest request, HttpServletResponse response) {
		alertContacter.setPage(new Page<>(request, response));
		Page<AlertContacter> page = alertContacterService.findPage(alertContacter);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("alert:alertContacter:view")
	@RequestMapping(value = "form")
	public String form(AlertContacter alertContacter, Model model) {
		model.addAttribute("alertContacter", alertContacter);
		return "alert/alert/alertContacterForm";
	}

	/**
	 * 保存contactor
	 */
	@RequiresPermissions("alert:alertContacter:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated AlertContacter alertContacter) {
		alertContacterService.save(alertContacter);
		return renderResult(Global.TRUE, text("保存contactor成功！"));
	}
	
	/**
	 * 停用contactor
	 */
	@RequiresPermissions("alert:alertContacter:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(AlertContacter alertContacter) {
		alertContacter.setStatus(AlertContacter.STATUS_DISABLE);
		alertContacterService.updateStatus(alertContacter);
		return renderResult(Global.TRUE, text("停用contactor成功"));
	}
	
	/**
	 * 启用contactor
	 */
	@RequiresPermissions("alert:alertContacter:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(AlertContacter alertContacter) {
		alertContacter.setStatus(AlertContacter.STATUS_NORMAL);
		alertContacterService.updateStatus(alertContacter);
		return renderResult(Global.TRUE, text("启用contactor成功"));
	}
	
	/**
	 * 删除contactor
	 */
	@RequiresPermissions("alert:alertContacter:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(AlertContacter alertContacter) {
		alertContacterService.delete(alertContacter);
		return renderResult(Global.TRUE, text("删除contactor成功！"));
	}
	
}