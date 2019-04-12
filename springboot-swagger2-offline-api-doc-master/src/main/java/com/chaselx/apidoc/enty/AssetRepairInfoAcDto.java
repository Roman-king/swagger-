package com.chaselx.apidoc.enty;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 资产维修单 数据传输类
 *
 */
//@ApiModel("资产维修数据接收类 ")
public class AssetRepairInfoAcDto implements Serializable{

    private static final long serialVersionUID = -15531878737311578L;

	/**
	 * 维修时间
	 */
	@ApiModelProperty("报修时间，必填")
	private Date maintainDate;
	/**
	 * 维修原因
	 */
	@ApiModelProperty("报修原因，必填")
	private String maintainCause;
	/**
	 * 报修人
	 */
	@ApiModelProperty("报修人，必填")
	private String ajournalist;
	/**
	 * 维修内容
	 */
	@ApiModelProperty("维修内容")
	private String maintainType;
	/**
	 * 报修部门
	 */
	@ApiModelProperty("报修部门，必填")
	private String mdepartment;
	/**
	 * 维修成本
	 */
	@ApiModelProperty("报修花费")
	private String maintenanceCost;

	/**
	 * 备注
	 */
	@ApiModelProperty("备注")
	private String remark;

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


	public Date getMaintainDate() {
		return maintainDate;
	}

	public void setMaintainDate(Date maintainDate) {
		this.maintainDate = maintainDate;
	}

	public String getMaintainCause() {
		return maintainCause;
	}

	public void setMaintainCause(String maintainCause) {
		this.maintainCause = maintainCause;
	}

	public String getAjournalist() {
		return ajournalist;
	}

	public void setAjournalist(String ajournalist) {
		this.ajournalist = ajournalist;
	}

	public String getMaintainType() {
		return maintainType;
	}

	public void setMaintainType(String maintainType) {
		this.maintainType = maintainType;
	}

	public String getMdepartment() {
		return mdepartment;
	}

	public void setMdepartment(String mdepartment) {
		this.mdepartment = mdepartment;
	}

	public String getMaintenanceCost() {
		return maintenanceCost;
	}

	public void setMaintenanceCost(String maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


}

