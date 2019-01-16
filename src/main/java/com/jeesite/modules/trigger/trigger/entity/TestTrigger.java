/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.trigger.trigger.entity;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * test_triggerEntity
 * @author littleyellow
 * @version 2019-01-03
 */
@Table(name="test_trigger", alias="a", columns={
		@Column(name="triggerid", attrName="触发器id", label="triggerid", isPK=true),
		@Column(name="expression", attrName="表达式", label="expression"),
		@Column(name="description", attrName="描述", label="description"),
		@Column(name="thestatus", attrName="启用", label="thestatus"),
		@Column(name="value", attrName="告警状态", label="value"),
		@Column(name="priority", attrName="严重等级", label="priority"),
		@Column(name="lastchange", attrName="最后状态改变时间", label="lastchange"),
		@Column(name="error", attrName="错误", label="error"),
	}, orderBy="a.triggerid DESC"
)
public class TestTrigger extends DataEntity<TestTrigger> {
	
	private static final long serialVersionUID = 1L;
	private String 触发器id;		// triggerid
	private String 表达式;		// expression
	private String 描述;		// description
	private Long 启用;		// thestatus
	private Long 告警状态;		// value
	private String 严重等级;		// priority
	private Long 最后状态改变时间;		// lastchange
	private String 错误;		// error
	
	public TestTrigger() {
		this(null);
	}

	public TestTrigger(String id){
		super(id);
	}
	
	public String get触发器id() {
		return 触发器id;
	}

	public void set触发器id(String 触发器id) {
		this.触发器id = 触发器id;
	}
	
	@NotBlank(message="expression不能为空")
	@Length(min=0, max=2048, message="expression长度不能超过 2048 个字符")
	public String get表达式() {
		return 表达式;
	}

	public void set表达式(String 表达式) {
		this.表达式 = 表达式;
	}
	
	@NotBlank(message="description不能为空")
	@Length(min=0, max=255, message="description长度不能超过 255 个字符")
	public String get描述() {
		return 描述;
	}

	public void set描述(String 描述) {
		this.描述 = 描述;
	}
	
	public Long get启用() {
		return 启用;
	}

	public void set启用(Long 启用) {
		this.启用 = 启用;
	}
	
	public Long get告警状态() {
		return 告警状态;
	}

	public void set告警状态(Long 告警状态) {
		this.告警状态 = 告警状态;
	}
	
	@Length(min=0, max=2, message="priority长度不能超过 2 个字符")
	public String get严重等级() {
		return 严重等级;
	}

	public void set严重等级(String 严重等级) {
		this.严重等级 = 严重等级;
	}
	
	public Long get最后状态改变时间() {
		return 最后状态改变时间;
	}

	public void set最后状态改变时间(Long 最后状态改变时间) {
		this.最后状态改变时间 = 最后状态改变时间;
	}
	
	@Length(min=0, max=128, message="error长度不能超过 128 个字符")
	public String get错误() {
		return 错误;
	}

	public void set错误(String 错误) {
		this.错误 = 错误;
	}
	
}