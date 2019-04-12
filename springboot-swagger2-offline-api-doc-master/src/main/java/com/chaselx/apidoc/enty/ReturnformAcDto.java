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
 * 资产归还单 数据传输类
 * 
 * @author Administrator
 * @date 2019-3-20
 */
//@ApiModel("资产退库数据接收类 ")
public class ReturnformAcDto implements Serializable{

    private static final long serialVersionUID = -15534343061292939L;

	/**
	 * 归还时间
	 */
	@ApiModelProperty("退库时间，必填")
	private Date restitutionDate;

	/**
	 * 存放地
	 */
	@ApiModelProperty("资产存放地，必填")
	private String designatedarea;

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

	public Date getRestitutionDate() {
		return restitutionDate;
	}

	public void setRestitutionDate(Date restitutionDate) {
		this.restitutionDate = restitutionDate;
	}

	public String getDesignatedarea() {
		return designatedarea;
	}

	public void setDesignatedarea(String designatedarea) {
		this.designatedarea = designatedarea;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}

