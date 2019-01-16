/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.trigger.trigger.web;

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
import com.jeesite.modules.trigger.trigger.entity.TestTrigger;
import com.jeesite.modules.trigger.trigger.service.TestTriggerService;

/**
 * test_triggerController
 * @author littleyellow
 * @version 2019-01-03
 */
@Controller
@RequestMapping(value = "${adminPath}/trigger/testTrigger")
public class TestTriggerController extends BaseController {

	@Autowired
	private TestTriggerService testTriggerService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public TestTrigger get(String 触发器id, boolean isNewRecord) {
		return testTriggerService.get(触发器id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("trigger:testTrigger:view")
	@RequestMapping(value = {"list", ""})
	public String list(TestTrigger testTrigger, Model model) {
		model.addAttribute("testTrigger", testTrigger);
		return "trigger/trigger/testTriggerList";
	}
	
	/**
	 * 查询列表数据
	 */
	//@RequiresPermissions("trigger:testTrigger:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<TestTrigger> listData(TestTrigger testTrigger, HttpServletRequest request, HttpServletResponse response) {
		testTrigger.setPage(new Page<>(request, response));
		Page<TestTrigger> page = testTriggerService.findPage(testTrigger);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("trigger:testTrigger:view")
	@RequestMapping(value = "form")
	public String form(TestTrigger testTrigger, Model model) {
		model.addAttribute("testTrigger", testTrigger);
		return "trigger/trigger/testTriggerForm";
	}

	/**
	 * 保存test_trigger
	 */
	@RequiresPermissions("trigger:testTrigger:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated TestTrigger testTrigger) {
		testTriggerService.save(testTrigger);
		return renderResult(Global.TRUE, text("保存test_trigger成功！"));
	}
	
	/**
	 * 停用test_trigger
	 */
	@RequiresPermissions("trigger:testTrigger:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(TestTrigger testTrigger) {
		testTrigger.setStatus(TestTrigger.STATUS_DISABLE);
		testTriggerService.updateStatus(testTrigger);
		return renderResult(Global.TRUE, text("停用test_trigger成功"));
	}
	
	/**
	 * 启用test_trigger
	 */
	@RequiresPermissions("trigger:testTrigger:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(TestTrigger testTrigger) {
		testTrigger.setStatus(TestTrigger.STATUS_NORMAL);
		testTriggerService.updateStatus(testTrigger);
		return renderResult(Global.TRUE, text("启用test_trigger成功"));
	}
	
	/**
	 * 删除test_trigger
	 */
	@RequiresPermissions("trigger:testTrigger:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(TestTrigger testTrigger) {
		testTriggerService.delete(testTrigger);
		return renderResult(Global.TRUE, text("删除test_trigger成功！"));
	}
	
}