/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.alert.alert.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.alert.alert.entity.AlertContacter;
import com.jeesite.modules.alert.alert.dao.AlertContacterDao;

/**
 * t_alert_contacterService
 * @author littleyellow
 * @version 2019-01-14
 */
@Service
@Transactional(readOnly=true)
public class AlertContacterService extends CrudService<AlertContacterDao, AlertContacter> {
	
	/**
	 * 获取单条数据
	 * @param alertContacter
	 * @return
	 */
	@Override
	public AlertContacter get(AlertContacter alertContacter) {
		return super.get(alertContacter);
	}
	
	/**
	 * 查询分页数据
	 * @param alertContacter 查询条件
	 * @param alertContacter.page 分页对象
	 * @return
	 */
	@Override
	public Page<AlertContacter> findPage(AlertContacter alertContacter) {
		return super.findPage(alertContacter);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param alertContacter
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(AlertContacter alertContacter) {
		super.save(alertContacter);
	}
	
	/**
	 * 更新状态
	 * @param alertContacter
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(AlertContacter alertContacter) {
		super.updateStatus(alertContacter);
	}
	
	/**
	 * 删除数据
	 * @param alertContacter
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(AlertContacter alertContacter) {
		super.delete(alertContacter);
	}
	
}