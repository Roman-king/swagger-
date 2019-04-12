package com.chaselx.apidoc.enty;


import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 资产维修单
 * 
 * @author 锅旭阳
 * @date 2019年3月21日
 */
public class AssetRepairInfo implements Serializable {

    private static final long serialVersionUID = -1553137311397L;
	
	/**
	 * 维修编号
	 */
	@ApiModelProperty("资产报修ID")
	private String assetrepairId;
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
	 * 维修时间
	 */
	@ApiModelProperty("报修时间")
	private Date maintainDate;
	/**
	 * 维修原因
	 */
	@ApiModelProperty("报修原因")
	private String maintainCause;
	/**
	 * 负责人
	 */
	@ApiModelProperty("负责人")
	private String approverId;
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
	 * 单号(入库/转移/领用/维修)
	 */
	@ApiModelProperty("单号")
	private String orderNo;
	/**
	 * 维修内容
	 */
	@ApiModelProperty("维修内容")
	private String maintainType;
	/**
	 * 
	 */
	private String createName;
	/**
	 * 
	 */
	private String updateName;
	/**
	 * 负责人姓名
	 */
	@ApiModelProperty("负责人姓名")
	private String userRealName;
	/**
	 * 维修成本
	 */
	@ApiModelProperty("报修花费")
	private String maintenanceCost;
	/**
	 * 维修状态
	 */
	@ApiModelProperty("维修状态")
	private String maintenanceState;
	/**
	 * 报修人
	 */
	@ApiModelProperty("报修人")
	private String ajournalist;
	/**
	 * 报修部门
	 */
	@ApiModelProperty("报修部门")
	private String mdepartment;
	/**
	 * 报修部门id
	 */
	@ApiModelProperty("报修部门id")
	private String mdepartmentId;
	/**
	 * 报修人id
	 */
	@ApiModelProperty("报修人id")
	private String ajournalistId;

	/**
	 * 设置维修编号
	 */
	public void setAssetrepairId(String assetrepairId) {
		this.assetrepairId = assetrepairId == null ? null : assetrepairId.trim();
	}
	/**
	 * 获取维修编号
	 */
	public String getAssetrepairId() {
		return this.assetrepairId;
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
	 * 设置维修时间
	 */
	public void setMaintainDate(Date maintainDate) {
		this.maintainDate = maintainDate;
	}
	/**
	 * 获取维修时间
	 */
	public Date getMaintainDate() {
		return this.maintainDate;
	}
	/**
	 * 设置维修原因
	 */
	public void setMaintainCause(String maintainCause) {
		this.maintainCause = maintainCause == null ? null : maintainCause.trim();
	}
	/**
	 * 获取维修原因
	 */
	public String getMaintainCause() {
		return this.maintainCause;
	}
	/**
	 * 设置负责人
	 */
	public void setApproverId(String approverId) {
		this.approverId = approverId == null ? null : approverId.trim();
	}
	/**
	 * 获取负责人
	 */
	public String getApproverId() {
		return this.approverId;
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
	 * 设置维修内容
	 */
	public void setMaintainType(String maintainType) {
		this.maintainType = maintainType == null ? null : maintainType.trim();
	}
	/**
	 * 获取维修内容
	 */
	public String getMaintainType() {
		return this.maintainType;
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
	 * 设置负责人姓名
	 */
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName == null ? null : userRealName.trim();
	}
	/**
	 * 获取负责人姓名
	 */
	public String getUserRealName() {
		return this.userRealName;
	}
	/**
	 * 设置维修成本
	 */
	public void setMaintenanceCost(String maintenanceCost) {
		this.maintenanceCost = maintenanceCost == null ? null : maintenanceCost.trim();
	}
	/**
	 * 获取维修成本
	 */
	public String getMaintenanceCost() {
		return this.maintenanceCost;
	}
	/**
	 * 设置维修状态
	 */
	public void setMaintenanceState(String maintenanceState) {
		this.maintenanceState = maintenanceState == null ? null : maintenanceState.trim();
	}
	/**
	 * 获取维修状态
	 */
	public String getMaintenanceState() {
		return this.maintenanceState;
	}
	/**
	 * 设置报修人
	 */
	public void setAjournalist(String ajournalist) {
		this.ajournalist = ajournalist == null ? null : ajournalist.trim();
	}
	/**
	 * 获取报修人
	 */
	public String getAjournalist() {
		return this.ajournalist;
	}
	/**
	 * 设置保修部门
	 */
	public void setMdepartment(String mdepartment) {
		this.mdepartment = mdepartment == null ? null : mdepartment.trim();
	}
	/**
	 * 获取保修部门
	 */
	public String getMdepartment() {
		return this.mdepartment;
	}
	/**
	 * 设置保修部门id
	 */
	public void setMdepartmentId(String mdepartmentId) {
		this.mdepartmentId = mdepartmentId == null ? null : mdepartmentId.trim();
	}
	/**
	 * 获取保修部门id
	 */
	public String getMdepartmentId() {
		return this.mdepartmentId;
	}
	/**
	 * 设置报修人id
	 */
	public void setAjournalistId(String ajournalistId) {
		this.ajournalistId = ajournalistId == null ? null : ajournalistId.trim();
	}
	/**
	 * 获取报修人id
	 */
	public String getAjournalistId() {
		return this.ajournalistId;
	}

    @Override
	public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("AssetRepairInfo{");
	    builder.append("assetrepairId=");
	    builder.append(assetrepairId);
	    builder.append(",");
	    builder.append("assetsId=");
	    builder.append(assetsId);
	    builder.append(",");
	    builder.append("tenantId=");
	    builder.append(tenantId);
	    builder.append(",");
	    builder.append("maintainDate=");
	    builder.append(maintainDate);
	    builder.append(",");
	    builder.append("maintainCause=");
	    builder.append(maintainCause);
	    builder.append(",");
	    builder.append("approverId=");
	    builder.append(approverId);
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
	    builder.append("orderNo=");
	    builder.append(orderNo);
	    builder.append(",");
	    builder.append("maintainType=");
	    builder.append(maintainType);
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
	    builder.append("maintenanceCost=");
	    builder.append(maintenanceCost);
	    builder.append(",");
	    builder.append("maintenanceState=");
	    builder.append(maintenanceState);
	    builder.append(",");
	    builder.append("ajournalist=");
	    builder.append(ajournalist);
	    builder.append(",");
	    builder.append("mdepartment=");
	    builder.append(mdepartment);
	    builder.append(",");
	    builder.append("mdepartmentId=");
	    builder.append(mdepartmentId);
	    builder.append(",");
	    builder.append("ajournalistId=");
	    builder.append(ajournalistId);
	    builder.append("}");
	    return builder.toString();
	}

}

