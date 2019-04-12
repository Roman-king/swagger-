/*
 * Powered By hivescm wms team
 * Web Site: http://www.hivescm.com
 * Since 2017
 */

package com.chaselx.apidoc.enty;


import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 资产转移单
 * 
 * @author Administrator
 * @date 2019-3-20
 */
public class Transferform implements Serializable {

    private static final long serialVersionUID = -1553061145110L;
	
	/**
	 * 资产转移编号
	 */
	@ApiModelProperty("资产转移ID")
	private String transferId;
	/**
	 * 资产编号
	 */
	@ApiModelProperty("资产ID")
	private String assetsId;
	/**
	 * 公司编号
	 */
	@ApiModelProperty("租户ID")
	private String tenantId;
	/**
	 * 转移时间
	 */
	@ApiModelProperty("转移时间")
	private Date transferDate;
	/**
	 * 转移部门
	 */
	@ApiModelProperty("转移部门")
	private String department;
	/**
	 * 转移地
	 */
	@ApiModelProperty("转移地")
	private String transferTo;
	/**
	 * 转移人
	 */
	@ApiModelProperty("转移人")
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
	private Integer deleteFlag;
	/**
	 * 创建人编号
	 */
	@ApiModelProperty("创建人编号")
	private String approver;
	/**
	 * 单号(入库/转移/领用/维修)
	 */
	@ApiModelProperty("单号")
	private String orderNo;
	/**
	 * 
	 */
	private String createName;
	/**
	 * 
	 */
	private String updateName;
	/**
	 * 转移负责人
	 */
	@ApiModelProperty("转移负责人")
	private String userRealName;
	/**
	 * 使用工位
	 */
	@ApiModelProperty("使用工位")
	private String userStation;
	/**
	 * 转移人id
	 */
	@ApiModelProperty("转移人id")
	private String userNameId;

	/**
	 * 设置资产领用编号
	 */
	public void setTransferId(String transferId) {
		this.transferId = transferId == null ? null : transferId.trim();
	}
	/**
	 * 获取资产领用编号
	 */
	public String getTransferId() {
		return this.transferId;
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
	 * 设置转移时间
	 */
	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}
	/**
	 * 获取转移时间
	 */
	public Date getTransferDate() {
		return this.transferDate;
	}
	/**
	 * 设置转移部门
	 */
	public void setDepartment(String department) {
		this.department = department == null ? null : department.trim();
	}
	/**
	 * 获取转移部门
	 */
	public String getDepartment() {
		return this.department;
	}
	/**
	 * 设置转移地
	 */
	public void setTransferTo(String transferTo) {
		this.transferTo = transferTo == null ? null : transferTo.trim();
	}
	/**
	 * 获取转移地
	 */
	public String getTransferTo() {
		return this.transferTo;
	}
	/**
	 * 设置转移人
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}
	/**
	 * 获取转移人
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
	 * 设置转移负责人
	 */
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName == null ? null : userRealName.trim();
	}
	/**
	 * 获取转移负责人
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
	 * 设置转移人id
	 */
	public void setUserNameId(String userNameId) {
		this.userNameId = userNameId == null ? null : userNameId.trim();
	}
	/**
	 * 获取转移人id
	 */
	public String getUserNameId() {
		return this.userNameId;
	}

    @Override
	public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("Transferform{");
	    builder.append("transferId=");
	    builder.append(transferId);
	    builder.append(",");
	    builder.append("assetsId=");
	    builder.append(assetsId);
	    builder.append(",");
	    builder.append("tenantId=");
	    builder.append(tenantId);
	    builder.append(",");
	    builder.append("transferDate=");
	    builder.append(transferDate);
	    builder.append(",");
	    builder.append("department=");
	    builder.append(department);
	    builder.append(",");
	    builder.append("transferTo=");
	    builder.append(transferTo);
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
	    builder.append("orderNo=");
	    builder.append(orderNo);
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

