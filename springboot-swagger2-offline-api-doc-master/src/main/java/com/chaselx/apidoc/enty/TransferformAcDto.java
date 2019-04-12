/*
 * Powered By hivescm wms team
 * Web Site: http://www.hivescm.com
 * Since 2017
 */

package com.chaselx.apidoc.enty;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 资产转移单 数据传输类
 * 
 * @author Administrator
 * @date 2019-3-20
 */
//@ApiModel("资产转移数据接收类 ")
public class TransferformAcDto implements Serializable{

    private static final long serialVersionUID = -15530612145242L;

	/**
	 * 转移时间
	 */
	@ApiModelProperty("转移时间，必填")
	private Date transferDate;
	/**
	 * 转移部门
	 */
	@ApiModelProperty("转移后使用部门，必填")
	private String department;
	/**
	 * 转移地
	 */
	@ApiModelProperty("转移后使用地，必填")
	private String transferTo;
	/**
	 * 转移人
	 */
	@ApiModelProperty("转移后使用人，必填")
	private String userId;
	/**
	 * 备注
	 */
	@ApiModelProperty("备注")
	private String remark;
	/**
	 * 使用工位
	 */
	@ApiModelProperty("使用工位")
	private String userStation;

	/**
	 * 资产编码ids
	 */
	@ApiModelProperty("资产编码ids，必填")
	private List<String> assetsCoding;

	public List<String> getAssetsCoding() {
		return assetsCoding;
	}

	public void setAssetsCoding(List<String> assetsCoding) {
		this.assetsCoding = assetsCoding;
	}


	public Date getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTransferTo() {
		return transferTo;
	}

	public void setTransferTo(String transferTo) {
		this.transferTo = transferTo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUserStation() {
		return userStation;
	}

	public void setUserStation(String userStation) {
		this.userStation = userStation;
	}

}

