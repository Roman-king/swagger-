package com.chaselx.apidoc.enty;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 资产码表子表
 * 
 * @author Administrator
 * @date 2019年3月13日
 */
@ApiModel("公司、部门实体类 ")
public class CodetableValue implements Serializable {

    private static final long serialVersionUID = -1552445647571L;
	
	/**
	 * 编号
	 */
	@ApiModelProperty("ID")
	private String childId;
	/**
	 * 租户编号
	 */
	@ApiModelProperty("租户ID")
	private String tenantId;
	/**
	 * 主表id（CodeTable）
	 */
	@ApiModelProperty("主表ID")
	private String codeId;
	/**
	 * 码表名称
	 */
	@ApiModelProperty("名称")
	private String childName;
	/**
	 * 备注
	 */
	@ApiModelProperty("备注")
	private String remark;
	/**
	 * (状态)是否启用
	 */
	@ApiModelProperty("是否启用")
	private String stateId;
	/**
	 * 创建人
	 */
	@ApiModelProperty("创建人")
	private String createPerson;
	/**
	 * 创建时间
	 */
	@ApiModelProperty("创建时间")
	private Date createDate;
	/**
	 * 修改人
	 */
	@ApiModelProperty("修改人")
	private String updatePerson;
	/**
	 * 修改时间
	 */
	@ApiModelProperty("修改时间")
	private Date updateDate;
	/**
	 * 是否删除(0否/1是)
	 */
	@ApiModelProperty("")
	private Integer deleteFlag;
	/**
	 *
	 */
	@ApiModelProperty("")
	private String createName;
	/**
	 *
	 */
	@ApiModelProperty("")
	private String updateName;
	/**
	 * 排序
	 */
	@ApiModelProperty("")
	private Integer sort = 0 ;
	/**
	 * 编号
	 */
	@ApiModelProperty("编号")
	private String childCode;
	/**
	 * 父节点ID
	 */
	@ApiModelProperty("父节点ID")
	private String parentChildId;
	/**
	 * 部门对应的公司id(E彩用的）
	 */
	@ApiModelProperty("")
	private String departmentOfCompany;

	/**
	 * 设置编号
	 */
	public void setChildId(String childId) {
		this.childId = childId == null ? null : childId.trim();
	}
	/**
	 * 获取编号
	 */
	public String getChildId() {
		return this.childId;
	}
	/**
	 * 设置公司编号
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId == null ? null : tenantId.trim();
	}
	/**
	 * 获取公司编号
	 */
	public String getTenantId() {
		return this.tenantId;
	}
	/**
	 * 设置主表id（CodeTable）
	 */
	public void setCodeId(String codeId) {
		this.codeId = codeId == null ? null : codeId.trim();
	}
	/**
	 * 获取主表id（CodeTable）
	 */
	public String getCodeId() {
		return this.codeId;
	}
	/**
	 * 设置码表名称
	 */
	public void setChildName(String childName) {
		this.childName = childName == null ? null : childName.trim();
	}
	/**
	 * 获取码表名称
	 */
	public String getChildName() {
		return this.childName;
	}
	/**
	 * 设置备注
	 */
	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}
	/**
	 * 获取备注
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * 设置(状态)是否启用
	 */
	public void setStateId(String stateId) {
		this.stateId = stateId == null ? null : stateId.trim();
	}
	/**
	 * 获取(状态)是否启用
	 */
	public String getStateId() {
		return this.stateId;
	}
	/**
	 * 设置创建人
	 */
	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson == null ? null : createPerson.trim();
	}
	/**
	 * 获取创建人
	 */
	public String getCreatePerson() {
		return this.createPerson;
	}
	/**
	 * 设置创建时间
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 获取创建时间
	 */
	public Date getCreateDate() {
		return this.createDate;
	}
	/**
	 * 设置修改人
	 */
	public void setUpdatePerson(String updatePerson) {
		this.updatePerson = updatePerson == null ? null : updatePerson.trim();
	}
	/**
	 * 获取修改人
	 */
	public String getUpdatePerson() {
		return this.updatePerson;
	}
	/**
	 * 设置修改时间
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * 获取修改时间
	 */
	public Date getUpdateDate() {
		return this.updateDate;
	}
	/**
	 * 设置是否删除(0否/1是)
	 */
	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	/**
	 * 获取是否删除(0否/1是)
	 */
	public Integer getDeleteFlag() {
		return this.deleteFlag;
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
	 * 设置排序
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * 获取排序
	 */
	public Integer getSort() {
		return this.sort;
	}
	/**
	 * 设置编号
	 */
	public void setChildCode(String childCode) {
		this.childCode = childCode == null ? null : childCode.trim();
	}
	/**
	 * 获取编号
	 */
	public String getChildCode() {
		return this.childCode;
	}
	/**
	 * 设置父节点ID
	 */
	public void setParentChildId(String parentChildId) {
		this.parentChildId = parentChildId == null ? null : parentChildId.trim();
	}
	/**
	 * 获取父节点ID
	 */
	public String getParentChildId() {
		return this.parentChildId;
	}
	/**
	 * 设置部门对应的公司id(E彩用的）
	 */
	public void setDepartmentOfCompany(String departmentOfCompany) {
		this.departmentOfCompany = departmentOfCompany == null ? null : departmentOfCompany.trim();
	}
	/**
	 * 获取部门对应的公司id(E彩用的）
	 */
	public String getDepartmentOfCompany() {
		return this.departmentOfCompany;
	}

    @Override
	public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("CodetableValue{");
	    builder.append("childId=");
	    builder.append(childId);
	    builder.append(",");
	    builder.append("tenantId=");
	    builder.append(tenantId);
	    builder.append(",");
	    builder.append("codeId=");
	    builder.append(codeId);
	    builder.append(",");
	    builder.append("childName=");
	    builder.append(childName);
	    builder.append(",");
	    builder.append("remark=");
	    builder.append(remark);
	    builder.append(",");
	    builder.append("stateId=");
	    builder.append(stateId);
	    builder.append(",");
	    builder.append("createPerson=");
	    builder.append(createPerson);
	    builder.append(",");
	    builder.append("createDate=");
	    builder.append(createDate);
	    builder.append(",");
	    builder.append("updatePerson=");
	    builder.append(updatePerson);
	    builder.append(",");
	    builder.append("updateDate=");
	    builder.append(updateDate);
	    builder.append(",");
	    builder.append("deleteFlag=");
	    builder.append(deleteFlag);
	    builder.append(",");
	    builder.append("createName=");
	    builder.append(createName);
	    builder.append(",");
	    builder.append("updateName=");
	    builder.append(updateName);
	    builder.append(",");
	    builder.append("sort=");
	    builder.append(sort);
	    builder.append(",");
	    builder.append("childCode=");
	    builder.append(childCode);
	    builder.append(",");
	    builder.append("parentChildId=");
	    builder.append(parentChildId);
	    builder.append(",");
	    builder.append("departmentOfCompany=");
	    builder.append(departmentOfCompany);
	    builder.append("}");
	    return builder.toString();
	}

}

