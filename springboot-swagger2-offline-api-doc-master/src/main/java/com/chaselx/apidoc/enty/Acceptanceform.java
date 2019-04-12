package com.chaselx.apidoc.enty;


import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 资产领用单
 * 
 * @author lqq
 * @date 2019年3月13日
 */

public class Acceptanceform implements Serializable {

    private static final long serialVersionUID = -1552442610849L;
	
	/**
	 * 资产领用编号
	 */
	@ApiModelProperty("资产领用ID")
	private String acceptanceId;
	/**
	 * 资产编号
	 */
	@ApiModelProperty("资产编号")
	private String assetsId;
	/**
	 * 单号(入库/转移/领用/维修)
	 */
	@ApiModelProperty("单号")
	private String orderNo;
	/**
	 * 公司编号
	 */
	@ApiModelProperty("租户ID")
	private String tenantId;
	/**
	 * 领用时间
	 */
	@ApiModelProperty("")
	private Date recipientsDate;
	/**
	 * 领用部门
	 */
	@ApiModelProperty("领用部门")
	private String department;
	/**
	 * 领用地
	 */
	@ApiModelProperty("领用地")
	private String recipientsTo;
	/**
	 * 领用人
	 */
	@ApiModelProperty("领用人")
	private String userId;
	/**
	 * 备注
	 */
	@ApiModelProperty("备注")
	private String remark;
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
	 * 创建人编号
	 */
	@ApiModelProperty("")
	private String approver;
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
	 * 
	 */
	@ApiModelProperty("")
	private String userRealName;
	/**
	 * 使用工位
	 */
	@ApiModelProperty("使用工位")
	private String userStation;
	/**
	 * 领用人ID
	 */
	@ApiModelProperty("领用人ID")
	private String userNameId;

	/**
	 * 设置资产领用编号
	 */
	public void setAcceptanceId(String acceptanceId) {
		this.acceptanceId = acceptanceId == null ? null : acceptanceId.trim();
	}
	/**
	 * 获取资产领用编号
	 */
	public String getAcceptanceId() {
		return this.acceptanceId;
	}
	/**
	 * 设置资产编号
	 */
	public void setAssetsId(String assetsId) {
		this.assetsId = assetsId == null ? null : assetsId.trim();
	}
	/**
	 * 获取资产编号
	 */
	public String getAssetsId() {
		return this.assetsId;
	}
	/**
	 * 设置单号(入库/转移/领用/维修)
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo == null ? null : orderNo.trim();
	}
	/**
	 * 获取单号(入库/转移/领用/维修)
	 */
	public String getOrderNo() {
		return this.orderNo;
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
	 * 设置领用时间
	 */
	public void setRecipientsDate(Date recipientsDate) {
		this.recipientsDate = recipientsDate;
	}
	/**
	 * 获取领用时间
	 */
	public Date getRecipientsDate() {
		return this.recipientsDate;
	}
	/**
	 * 设置领用部门
	 */
	public void setDepartment(String department) {
		this.department = department == null ? null : department.trim();
	}
	/**
	 * 获取领用部门
	 */
	public String getDepartment() {
		return this.department;
	}
	/**
	 * 设置领用地
	 */
	public void setRecipientsTo(String recipientsTo) {
		this.recipientsTo = recipientsTo == null ? null : recipientsTo.trim();
	}
	/**
	 * 获取领用地
	 */
	public String getRecipientsTo() {
		return this.recipientsTo;
	}
	/**
	 * 设置领用人
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}
	/**
	 * 获取领用人
	 */
	public String getUserId() {
		return this.userId;
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
	 * 设置创建人编号
	 */
	public void setApprover(String approver) {
		this.approver = approver == null ? null : approver.trim();
	}
	/**
	 * 获取创建人编号
	 */
	public String getApprover() {
		return this.approver;
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
	 * 设置
	 */
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName == null ? null : userRealName.trim();
	}
	/**
	 * 获取
	 */
	public String getUserRealName() {
		return this.userRealName;
	}
	/**
	 * 设置使用工位
	 */
	public void setUserStation(String userStation) {
		this.userStation = userStation == null ? null : userStation.trim();
	}
	/**
	 * 获取使用工位
	 */
	public String getUserStation() {
		return this.userStation;
	}
	/**
	 * 设置领用人ID
	 */
	public void setUserNameId(String userNameId) {
		this.userNameId = userNameId == null ? null : userNameId.trim();
	}
	/**
	 * 获取领用人ID
	 */
	public String getUserNameId() {
		return this.userNameId;
	}

    @Override
	public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("Acceptanceform{");
	    builder.append("acceptanceId=");
	    builder.append(acceptanceId);
	    builder.append(",");
	    builder.append("assetsId=");
	    builder.append(assetsId);
	    builder.append(",");
	    builder.append("orderNo=");
	    builder.append(orderNo);
	    builder.append(",");
	    builder.append("tenantId=");
	    builder.append(tenantId);
	    builder.append(",");
	    builder.append("recipientsDate=");
	    builder.append(recipientsDate);
	    builder.append(",");
	    builder.append("department=");
	    builder.append(department);
	    builder.append(",");
	    builder.append("recipientsTo=");
	    builder.append(recipientsTo);
	    builder.append(",");
	    builder.append("userId=");
	    builder.append(userId);
	    builder.append(",");
	    builder.append("remark=");
	    builder.append(remark);
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
	    builder.append("approver=");
	    builder.append(approver);
	    builder.append(",");
	    builder.append("createName=");
	    builder.append(createName);
	    builder.append(",");
	    builder.append("updateName=");
	    builder.append(updateName);
	    builder.append(",");
	    builder.append("userRealName=");
	    builder.append(userRealName);
	    builder.append(",");
	    builder.append("userStation=");
	    builder.append(userStation);
	    builder.append(",");
	    builder.append("userNameId=");
	    builder.append(userNameId);
	    builder.append("}");
	    return builder.toString();
	}

}

