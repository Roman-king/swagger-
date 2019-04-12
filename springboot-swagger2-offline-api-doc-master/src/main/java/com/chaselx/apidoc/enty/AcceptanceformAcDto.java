package com.chaselx.apidoc.enty;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 资产领用单 数据传输类
 * 
 * @author Administrator
 * @date 2019年3月13日
 */
//@ApiModel("资产领用数据接收类 ")
public class AcceptanceformAcDto implements Serializable{

    private static final long serialVersionUID = -1551224426109174L;

	/**
	 * 领用时间
	 */
	@ApiModelProperty("领用时间，必填")
	private Date recipientsDate;
	/**
	 * 领用部门
	 */
	@ApiModelProperty("领用部门，必填	")
	private String department;
	/**
	 * 领用后使用地
	 */
	@ApiModelProperty("领用后使用地，必填")
	private String recipientsTo;
	/**
	 * 领用人
	 */
	@ApiModelProperty("领用后使用人，必填")
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



	public Date getRecipientsDate() {
		return recipientsDate;
	}

	public void setRecipientsDate(Date recipientsDate) {
		this.recipientsDate = recipientsDate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRecipientsTo() {
		return recipientsTo;
	}

	public void setRecipientsTo(String recipientsTo) {
		this.recipientsTo = recipientsTo;
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

