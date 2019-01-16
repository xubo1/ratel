/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.trigger.trigger.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.trigger.trigger.entity.TestTrigger;
import com.jeesite.modules.trigger.trigger.dao.TestTriggerDao;

/**
 * test_triggerService
 * @author littleyellow
 * @version 2019-01-03
 */
@Service
@Transactional(readOnly=true)
public class TestTriggerService extends CrudService<TestTriggerDao, TestTrigger> {
	
	/**
	 * 获取单条数据
	 * @param testTrigger
	 * @return
	 */
	@Override
	public TestTrigger get(TestTrigger testTrigger) {
		return super.get(testTrigger);
	}
	
	/**
	 * 查询分页数据
	 * @param testTrigger 查询条件
	 * @param testTrigger.page 分页对象
	 * @return
	 */
	@Override
	public Page<TestTrigger> findPage(TestTrigger testTrigger) {
		return super.findPage(testTrigger);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param testTrigger
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(TestTrigger testTrigger) {
		super.save(testTrigger);
	}
	
	/**
	 * 更新状态
	 * @param testTrigger
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(TestTrigger testTrigger) {
		super.updateStatus(testTrigger);
	}
	
	/**
	 * 删除数据
	 * @param testTrigger
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(TestTrigger testTrigger) {
		super.delete(testTrigger);
	}
	
}