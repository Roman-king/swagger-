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
 * 资产归还单
 * 
 * @author Administrator
 * @date 2019-3-20
 */
public class Returnform implements Serializable {

    private static final long serialVersionUID = -1553061292809L;
	
	/**
	 * 资产归还编号
	 */
	@ApiModelProperty("资产归还ID")
	private String returnId;
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
	 * 归还时间
	 */
	@ApiModelProperty("归还时间")
	private Date restitutionDate;
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
	 * 
	 */
	private String createName;
	/**
	 * 
	 */
	private String updateName;
	/**
	 * 累计打印二维码数量
	 */
	@ApiModelProperty("累计打印二维码数量")
	private String sumPrintCode;
	/**
	 * 负责人姓名
	 */
	@ApiModelProperty("负责人姓名")
	private String userRealName;
	/**
	 * 存放地
	 */
	@ApiModelProperty("存放地")
	private String designatedarea;
	/**
	 * 使用地ID
	 */
	@ApiModelProperty("使用地ID")
	private String designatedareaId;

	/**
	 * 设置资产归还编号
	 */
	public void setReturnId(String returnId) {
		this.returnId = returnId == null ? null : returnId.trim();
	}
	/**
	 * 获取资产归还编号
	 */
	public String getReturnId() {
		return this.returnId;
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
	 * 设置归还时间
	 */
	public void setRestitutionDate(Date restitutionDate) {
		this.restitutionDate = restitutionDate;
	}
	/**
	 * 获取归还时间
	 */
	public Date getRestitutionDate() {
		return this.restitutionDate;
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
	 * 设置累计打印二维码数量
	 */
	public void setSumPrintCode(String sumPrintCode) {
		this.sumPrintCode = sumPrintCode == null ? null : sumPrintCode.trim();
	}
	/**
	 * 获取累计打印二维码数量
	 */
	public String getSumPrintCode() {
		return this.sumPrintCode;
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
	 * 设置存放地
	 */
	public void setDesignatedarea(String designatedarea) {
		this.designatedarea = designatedarea == null ? null : designatedarea.trim();
	}
	/**
	 * 获取存放地
	 */
	public String getDesignatedarea() {
		return this.designatedarea;
	}
	/**
	 * 设置使用地ID
	 */
	public void setDesignatedareaId(String designatedareaId) {
		this.designatedareaId = designatedareaId == null ? null : designatedareaId.trim();
	}
	/**
	 * 获取使用地ID
	 */
	public String getDesignatedareaId() {
		return this.designatedareaId;
	}

    @Override
	public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("Returnform{");
	    builder.append("returnId=");
	    builder.append(returnId);
	    builder.append(",");
	    builder.append("assetsId=");
	    builder.append(assetsId);
	    builder.append(",");
	    builder.append("tenantId=");
	    builder.append(tenantId);
	    builder.append(",");
	    builder.append("restitutionDate=");
	    builder.append(restitutionDate);
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
	    builder.append("createName=");
	    builder.append(createName);
	    builder.append(",");
	    builder.append("updateName=");
	    builder.append(updateName);
	    builder.append(",");
	    builder.append("sumPrintCode=");
	    builder.append(sumPrintCode);
	    builder.append(",");
	    builder.append("userRealName=");
	    builder.append(userRealName);
	    builder.append(",");
	    builder.append("designatedarea=");
	    builder.append(designatedarea);
	    builder.append(",");
	    builder.append("designatedareaId=");
	    builder.append(designatedareaId);
	    builder.append("}");
	    return builder.toString();
	}

}

