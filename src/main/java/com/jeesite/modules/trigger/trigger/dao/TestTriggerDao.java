/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.trigger.trigger.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.trigger.trigger.entity.TestTrigger;

/**
 * test_triggerDAO接口
 * @author littleyellow
 * @version 2019-01-03
 */
@MyBatisDao
public interface TestTriggerDao extends CrudDao<TestTrigger> {
	
}