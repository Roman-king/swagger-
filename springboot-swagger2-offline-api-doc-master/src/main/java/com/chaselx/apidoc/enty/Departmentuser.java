package com.chaselx.apidoc.enty;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 部门对应用户表
 * 
 * @author Administrator
 * @date 2019年3月13日
 */
@ApiModel("部门人员实体类 ")
public class Departmentuser implements Serializable {

    private static final long serialVersionUID = -1552445813575L;
	
	/**
	 * 部门对应用户表ID
	 */
	@ApiModelProperty("人员ID")
	private String departmentUserId;
	/**
	 * 
	 */
	@ApiModelProperty("租户ID")
	private String tenantId;
	/**
	 * 部门ID
	 */
	@ApiModelProperty("部门ID")
	private String departmentId;
	/**
	 * 用户名
	 */
	@ApiModelProperty("用户名")
	private String userName;
	/**
	 * 用户手机号
	 */
	@ApiModelProperty("人员手机号")
	private String userPhone;
	/**
	 * 用户邮件
	 */
	@ApiModelProperty("人员邮件")
	private String userEmail;
	/**
	 * 备注
	 */
	@ApiModelProperty("备注")
	private String comments;
	/**
	 * 
	 */
	@ApiModelProperty("人员编码")
	private String userCode;
	/**
	 * 是否删除
	 */
	private Integer deleFlag;
	/**
	 * 
	 */
	private String createName;
	/**
	 * 
	 */
	@ApiModelProperty("")
	private Date createDate;
	/**
	 *
	 */
	@ApiModelProperty("")
	private String updateName;
	/**
	 *
	 */
	@ApiModelProperty("")
	private Date updateDate;

	/**
	 * 设置部门对应用户表ID
	 */
	public void setDepartmentUserId(String departmentUserId) {
		this.departmentUserId = departmentUserId == null ? null : departmentUserId.trim();
	}
	/**
	 * 获取部门对应用户表ID
	 */
	public String getDepartmentUserId() {
		return this.departmentUserId;
	}
	/**
	 * 设置
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId == null ? null : tenantId.trim();
	}
	/**
	 * 获取
	 */
	public String getTenantId() {
		return this.tenantId;
	}
	/**
	 * 设置部门ID
	 */
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId == null ? null : departmentId.trim();
	}
	/**
	 * 获取部门ID
	 */
	public String getDepartmentId() {
		return this.departmentId;
	}
	/**
	 * 设置用户名
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}
	/**
	 * 获取用户名
	 */
	public String getUserName() {
		return this.userName;
	}
	/**
	 * 设置用户手机号
	 */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone == null ? null : userPhone.trim();
	}
	/**
	 * 获取用户手机号
	 */
	public String getUserPhone() {
		return this.userPhone;
	}
	/**
	 * 设置用户邮件
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail == null ? null : userEmail.trim();
	}
	/**
	 * 获取用户邮件
	 */
	public String getUserEmail() {
		return this.userEmail;
	}
	/**
	 * 设置备注
	 */
	public void setComments(String comments) {
		this.comments = comments == null ? null : comments.trim();
	}
	/**
	 * 获取备注
	 */
	public String getComments() {
		return this.comments;
	}
	/**
	 * 设置
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode == null ? null : userCode.trim();
	}
	/**
	 * 获取
	 */
	public String getUserCode() {
		return this.userCode;
	}
	/**
	 * 设置是否删除
	 */
	public void setDeleFlag(Integer deleFlag) {
		this.deleFlag = deleFlag;
	}
	/**
	 * 获取是否删除
	 */
	public Integer getDeleFlag() {
		return this.deleFlag;
	}
	/**
	 * 设置
	 */
	public void setCreateName(String createName) {
		this.createName = createName == null ? null : createName.trim();
	}
	/**
	 * 获取
	 */
	public String getCreateName() {
		return this.createName;
	}
	/**
	 * 设置
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 获取
	 */
	public Date getCreateDate() {
		return this.createDate;
	}
	/**
	 * 设置
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName == null ? null : updateName.trim();
	}
	/**
	 * 获取
	 */
	public String getUpdateName() {
		return this.updateName;
	}
	/**
	 * 设置
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * 获取
	 */
	public Date getUpdateDate() {
		return this.updateDate;
	}

    @Override
	public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("Departmentuser{");
	    builder.append("departmentUserId=");
	    builder.append(departmentUserId);
	    builder.append(",");
	    builder.append("tenantId=");
	    builder.append(tenantId);
	    builder.append(",");
	    builder.append("departmentId=");
	    builder.append(departmentId);
	    builder.append(",");
	    builder.append("userName=");
	    builder.append(userName);
	    builder.append(",");
	    builder.append("userPhone=");
	    builder.append(userPhone);
	    builder.append(",");
	    builder.append("userEmail=");
	    builder.append(userEmail);
	    builder.append(",");
	    builder.append("comments=");
	    builder.append(comments);
	    builder.append(",");
	    builder.append("userCode=");
	    builder.append(userCode);
	    builder.append(",");
	    builder.append("deleFlag=");
	    builder.append(deleFlag);
	    builder.append(",");
	    builder.append("createName=");
	    builder.append(createName);
	    builder.append(",");
	    builder.append("createDate=");
	    builder.append(createDate);
	    builder.append(",");
	    builder.append("updateName=");
	    builder.append(updateName);
	    builder.append(",");
	    builder.append("updateDate=");
	    builder.append(updateDate);
	    builder.append("}");
	    return builder.toString();
	}

}

