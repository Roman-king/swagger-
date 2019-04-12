/*
 * Powered By hivescm wms team
 * Web Site: http://www.hivescm.com
 * Since 2017
 */

package com.chaselx.apidoc.enty;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 资产清理单
 * 
 * @author Administrator
 * @date 2019-3-20
 */
public class Cleanform implements Serializable {

    private static final long serialVersionUID = -1553068716009L;
	
	/**
	 * 资产清理编号
	 */
	private String cleanId;
	/**
	 * 资产编号
	 */
	private String assetsId;
	/**
	 * 公司编号
	 */
	private String tenantId;
	/**
	 * 清理时间
	 */
	@JsonFormat(locale = "zh",timezone = "GMT+8",pattern="yyyy-MM-dd")
	private Date cleanDate;
	/**
	 * 负责人
	 */
	private String approverId;
	/**
	 * 清理原因
	 */
	private String remark;
	/**
	 * 创建人
	 */
	private String createPerson;
	/**
	 * 创建时间
	 */
	@JsonFormat(locale = "zh",timezone = "GMT+8",pattern="yyyy-MM-dd")
	private Date createDate;
	/**
	 * 修改人
	 */
	private String updatePerson;
	/**
	 * 修改时间
	 */
	@JsonFormat(locale = "zh",timezone = "GMT+8",pattern="yyyy-MM-dd")
	private Date updateDate;
	/**
	 * 是否删除(0否/1是)
	 */
	private Integer deleteFlag;
	/**
	 * 单号(入库/转移/领用/维修)
	 */
	private String orderNo;
	/**
	 * 清理原因
	 */
	private String cleanReasons;
	/**
	 * 
	 */
	private String createName;
	/**
	 * 
	 */
	private String updateName;
	/**
	 * 负责人名称
	 */
	private String userRealName;

	/**
	 * 设置资产清理编号
	 */
	public void setCleanId(String cleanId) {
		this.cleanId = cleanId == null ? null : cleanId.trim();
	}
	/**
	 * 获取资产清理编号
	 */
	public String getCleanId() {
		return this.cleanId;
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
	 * 设置清理时间
	 */
	public void setCleanDate(Date cleanDate) {
		this.cleanDate = cleanDate;
	}
	/**
	 * 获取清理时间
	 */
	public Date getCleanDate() {
		return this.cleanDate;
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
	 * 设置清理原因
	 */
	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}
	/**
	 * 获取清理原因
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
	 * 设置清理原因
	 */
	public void setCleanReasons(String cleanReasons) {
		this.cleanReasons = cleanReasons == null ? null : cleanReasons.trim();
	}
	/**
	 * 获取清理原因
	 */
	public String getCleanReasons() {
		return this.cleanReasons;
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
	 * 设置负责人名称
	 */
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName == null ? null : userRealName.trim();
	}
	/**
	 * 获取负责人名称
	 */
	public String getUserRealName() {
		return this.userRealName;
	}

    @Override
	public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("Cleanform{");
	    builder.append("cleanId=");
	    builder.append(cleanId);
	    builder.append(",");
	    builder.append("assetsId=");
	    builder.append(assetsId);
	    builder.append(",");
	    builder.append("tenantId=");
	    builder.append(tenantId);
	    builder.append(",");
	    builder.append("cleanDate=");
	    builder.append(cleanDate);
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
	    builder.append("cleanReasons=");
	    builder.append(cleanReasons);
	    builder.append(",");
	    builder.append("createName=");
	    builder.append(createName);
	    builder.append(",");
	    builder.append("updateName=");
	    builder.append(updateName);
	    builder.append(",");
	    builder.append("userRealName=");
	    builder.append(userRealName);
	    builder.append("}");
	    return builder.toString();
	}

}

