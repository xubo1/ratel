/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.alert.alert.entity;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * t_alert_contacterEntity
 * @author littleyellow
 * @version 2019-01-14
 */
@Table(name="t_alert_contacter", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="name", attrName="name", label="姓名"),
		@Column(name="mobile", attrName="mobile", label="手机号码"),
		@Column(name="mobile_selected", attrName="mobileSelected", label="启用短信告警"),
		@Column(name="email", attrName="email", label="电子邮箱"),
		@Column(name="email_selected", attrName="emailSelected", label="启用邮件告警"),
	}, orderBy="a.id DESC"
)
public class AlertContacter extends DataEntity<AlertContacter> {
	
	private static final long serialVersionUID = 1L;
	private String name;		// 姓名
	private String mobile;		// 手机号码
	private Integer mobileSelected;		// 启用短信告警
	private String email;		// 电子邮箱
	private Integer emailSelected;		// 启用邮件告警
	
	public AlertContacter() {
		this(null);
	}

	public AlertContacter(String id){
		super(id);
	}
	
	@NotBlank(message="姓名不能为空")
	@Length(min=0, max=255, message="姓名长度不能超过 255 个字符")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=255, message="手机号码长度不能超过 255 个字符")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@NotNull(message="启用短信告警不能为空")
	public Integer getMobileSelected() {
		return mobileSelected;
	}

	public void setMobileSelected(Integer mobileSelected) {
		this.mobileSelected = mobileSelected;
	}
	
	@Length(min=0, max=255, message="电子邮箱长度不能超过 255 个字符")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@NotNull(message="启用邮件告警不能为空")
	public Integer getEmailSelected() {
		return emailSelected;
	}

	public void setEmailSelected(Integer emailSelected) {
		this.emailSelected = emailSelected;
	}
	
}