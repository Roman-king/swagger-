/*
 * Powered By hivescm wms team
 * Web Site: http://www.hivescm.com
 * Since 2017
 */

package com.chaselx.apidoc.enty;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 资产清理单 数据传输类
 * 
 * @author Administrator
 * @date 2019-3-20
 */
public class CleanformDto implements Serializable{


    private static final long serialVersionUID = -1553068716069L;

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
	 *
	 *  资产ID
	 */

	private  String  assInfoIds;


	public String getAssInfoIds() {
		return assInfoIds;
	}

	public void setAssInfoIds(String assInfoIds) {
		this.assInfoIds = assInfoIds;
	}

	/**
	 * 设置资产清理编号
	 */
	public void setCleanId(String value) {
		this.cleanId = value;
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
	public void setAssetsId(String value) {
		this.assetsId = value;
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
	public void setTenantId(String value) {
		this.tenantId = value;
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
	public void setCleanDate(Date value) {
		this.cleanDate = value;
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
	public void setApproverId(String value) {
		this.approverId = value;
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
	public void setRemark(String value) {
		this.remark = value;
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
	public void setCreatePerson(String value) {
		this.createPerson = value;
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
	public void setCreateDate(Date value) {
		this.createDate = value;
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
	public void setUpdatePerson(String value) {
		this.updatePerson = value;
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
	public void setUpdateDate(Date value) {
		this.updateDate = value;
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
	public void setDeleteFlag(Integer value) {
		this.deleteFlag = value;
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
	public void setOrderNo(String value) {
		this.orderNo = value;
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
	public void setCleanReasons(String value) {
		this.cleanReasons = value;
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
	public void setCreateName(String value) {
		this.createName = value;
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
	public void setUpdateName(String value) {
		this.updateName = value;
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
	public void setUserRealName(String value) {
		this.userRealName = value;
	}
	/**
	 * 获取负责人名称
	 */
	public String getUserRealName() {
		return this.userRealName;
	}

	public List<String> getAssetsIds() {
		return assetsIds;
	}

	public void setAssetsIds(List<String> assetsIds) {
		this.assetsIds = assetsIds;
	}

	private List<String> assetsIds;

	private List<AssetinfoLoginfo> loginfoList;

	public List<AssetinfoLoginfo> getLoginfoList() {
		return loginfoList;
	}

	public void setLoginfoList(List<AssetinfoLoginfo> loginfoList) {
		this.loginfoList = loginfoList;
	}
}

