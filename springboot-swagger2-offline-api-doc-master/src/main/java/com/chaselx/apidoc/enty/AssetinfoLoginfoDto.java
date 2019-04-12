package com.chaselx.apidoc.enty;

import java.io.Serializable;
import java.util.Date;

/**
 * 资产日志表 数据传输类
 * 
 * @author 锅旭阳
 * @date 2019年3月13日
 */
public class AssetinfoLoginfoDto implements Serializable{	

    private static final long serialVersionUID = -1552457965828L;
	
	/**
	 * 日志编号
	 */
	private String loginfoId;
	/**
	 * 资产编号
	 */
	private String assetsId;
	/**
	 * 资产编码
	 */
	private String assetsCoding;
	/**
	 * 二维码name
	 */
	private String assetQrCodeName;
	/**
	 * 资产二维码
	 */
	private String assetQrCode;
	/**
	 * 资产类别
	 */
	private String categoryId;
	/**
	 * 资产类别name
	 */
	private String categoryName;
	/**
	 * 资产名称
	 */
	private String assetName;
	/**
	 * 公司id
	 */
	private String tenantId;
	/**
	 * 状态name
	 */
	private String stateName;
	/**
	 * 操作类型
	 */
	private String stateId;
	/**
	 * SN号
	 */
	private String snNo;
	/**
	 * 部门name
	 */
	private String departmentName;
	/**
	 * 使用部门
	 */
	private String department;
	/**
	 * 使用地name
	 */
	private String useToName;
	/**
	 * 使用地
	 */
	private String useTo;
	/**
	 * 使用人
	 */
	private String useName;
	/**
	 * 使用工位
	 */
	private String userStation;
	/**
	 * 使用时间
	 */
	private Date useDate;
	/**
	 * 供应商Name
	 */
	private String suppliersName;
	/**
	 * 供应商
	 */
	private String suppliers;
	/**
	 * 配置
	 */
	private String configuration;
	/**
	 * 购置日期
	 */
	private String purchaseDate;
	/**
	 * 入库日期
	 */
	private Date inboundDate;
	/**
	 * 原值
	 */
	private String original;
	/**
	 * 资产净值
	 */
	private String assetValue;
	/**
	 * 折旧年限
	 */
	private String depreciation;
	/**
	 * 最小残值
	 */
	private String smallValue;
	/**
	 * 图片上传
	 */
	private String imageUpload;
	/**
	 * 上传路径
	 */
	private String imageUploadUrl;
	/**
	 * 图片新名字
	 */
	private String imageUploadNew;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 自定义字段
	 */
	private String customField;
	/**
	 * 创建人
	 */
	private String createPerson;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 修改人
	 */
	private String updatePerson;
	/**
	 * 修改时间
	 */
	private Date updateDate;
	/**
	 * 是否删除(0否/1是)
	 */
	private Integer deleteFlag;
	/**
	 * 单号(入库/转移/领用/维修)
	 */
	private String orderId;
	/**
	 * 操作类型
	 */
	private Integer type;
	/**
	 * 
	 */
	private String createName;
	/**
	 * 
	 */
	private String updateName;
	/**
	 * 清理时间
	 */
	private Date cleanDate;
	/**
	 * 清理人
	 */
	private String cleanBy;
	/**
	 * 清理原因
	 */
	private String cleanReasons;
	/**
	 * 归还时间
	 */
	private Date returnTime;
	/**
	 * 归还人
	 */
	private String returnUser;
	/**
	 * 转移时间
	 */
	private Date transferDate;
	/**
	 * 维修时间
	 */
	private Date repairDate;
	/**
	 * 维修方式
	 */
	private String repairType;
	/**
	 * 维修原因
	 */
	private String repairReason;
	/**
	 * 负责人姓名
	 */
	private String userRealName;
	/**
	 * 品牌
	 */
	private String brands;
	/**
	 * 来源
	 */
	private String source;
	/**
	 * 品牌名称
	 */
	private String brandsName;
	/**
	 * 来源名称
	 */
	private String sourceName;
	/**
	 * 渠道
	 */
	private String channe;
	/**
	 * sn带出的配置
	 */
	private String snconfiguration;
	/**
	 * 过保日期
	 */
	private String overInsuranceTime;
	/**
	 * 预计报废时间
	 */
	private String expectedDiscardingTime;
	/**
	 * 0 未打印，1 审核中 2 已打印
	 */
	private Integer printingStatus;
	/**
	 * 
	 */
	private String repairState;
	/**
	 * 盘点人
	 */
	private String inventoryPeople;
	/**
	 * 盘点时间
	 */
	private Date inventoryTime;
	/**
	 * 盘点结果
	 */
	private String inventoryResult;
	/**
	 * 盘点备注
	 */
	private String inventoryRemark;
	/**
	 * 领用人ID
	 */
	private String model;
	/**
	 * 领用人ID
	 */
	private String measuringUnit;
	/**
	 * 领用人ID
	 */
	private Date buyTime;
	/**
	 * 领用人ID
	 */
	private String usePeriod;
	/**
	 * 领用人ID
	 */
	private String useToId;
	/**
	 * 领用人ID
	 */
	private String inventoryAssetType;
	/**
	 * 领用人ID
	 */
	private String replaceContent;
	/**
	 * 领用人ID
	 */
	private String userNameId;

	/**
	 * 设置日志编号
	 */	
	public void setLoginfoId(String value) {
		this.loginfoId = value;
	}
	/**
	 * 获取日志编号
	 */
	public String getLoginfoId() {
		return this.loginfoId;
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
	 * 设置资产编码
	 */	
	public void setAssetsCoding(String value) {
		this.assetsCoding = value;
	}
	/**
	 * 获取资产编码
	 */
	public String getAssetsCoding() {
		return this.assetsCoding;
	}
	/**
	 * 设置二维码name
	 */	
	public void setAssetQrCodeName(String value) {
		this.assetQrCodeName = value;
	}
	/**
	 * 获取二维码name
	 */
	public String getAssetQrCodeName() {
		return this.assetQrCodeName;
	}
	/**
	 * 设置资产二维码
	 */	
	public void setAssetQrCode(String value) {
		this.assetQrCode = value;
	}
	/**
	 * 获取资产二维码
	 */
	public String getAssetQrCode() {
		return this.assetQrCode;
	}
	/**
	 * 设置资产类别
	 */	
	public void setCategoryId(String value) {
		this.categoryId = value;
	}
	/**
	 * 获取资产类别
	 */
	public String getCategoryId() {
		return this.categoryId;
	}
	/**
	 * 设置资产类别name
	 */	
	public void setCategoryName(String value) {
		this.categoryName = value;
	}
	/**
	 * 获取资产类别name
	 */
	public String getCategoryName() {
		return this.categoryName;
	}
	/**
	 * 设置资产名称
	 */	
	public void setAssetName(String value) {
		this.assetName = value;
	}
	/**
	 * 获取资产名称
	 */
	public String getAssetName() {
		return this.assetName;
	}
	/**
	 * 设置公司id
	 */	
	public void setTenantId(String value) {
		this.tenantId = value;
	}
	/**
	 * 获取公司id
	 */
	public String getTenantId() {
		return this.tenantId;
	}
	/**
	 * 设置状态name
	 */	
	public void setStateName(String value) {
		this.stateName = value;
	}
	/**
	 * 获取状态name
	 */
	public String getStateName() {
		return this.stateName;
	}
	/**
	 * 设置操作类型
	 */	
	public void setStateId(String value) {
		this.stateId = value;
	}
	/**
	 * 获取操作类型
	 */
	public String getStateId() {
		return this.stateId;
	}
	/**
	 * 设置SN号
	 */	
	public void setSnNo(String value) {
		this.snNo = value;
	}
	/**
	 * 获取SN号
	 */
	public String getSnNo() {
		return this.snNo;
	}
	/**
	 * 设置部门name
	 */	
	public void setDepartmentName(String value) {
		this.departmentName = value;
	}
	/**
	 * 获取部门name
	 */
	public String getDepartmentName() {
		return this.departmentName;
	}
	/**
	 * 设置使用部门
	 */	
	public void setDepartment(String value) {
		this.department = value;
	}
	/**
	 * 获取使用部门
	 */
	public String getDepartment() {
		return this.department;
	}
	/**
	 * 设置使用地name
	 */	
	public void setUseToName(String value) {
		this.useToName = value;
	}
	/**
	 * 获取使用地name
	 */
	public String getUseToName() {
		return this.useToName;
	}
	/**
	 * 设置使用地
	 */	
	public void setUseTo(String value) {
		this.useTo = value;
	}
	/**
	 * 获取使用地
	 */
	public String getUseTo() {
		return this.useTo;
	}
	/**
	 * 设置使用人
	 */	
	public void setUseName(String value) {
		this.useName = value;
	}
	/**
	 * 获取使用人
	 */
	public String getUseName() {
		return this.useName;
	}
	/**
	 * 设置使用工位
	 */	
	public void setUserStation(String value) {
		this.userStation = value;
	}
	/**
	 * 获取使用工位
	 */
	public String getUserStation() {
		return this.userStation;
	}
	/**
	 * 设置使用时间
	 */	
	public void setUseDate(Date value) {
		this.useDate = value;
	}
	/**
	 * 获取使用时间
	 */
	public Date getUseDate() {
		return this.useDate;
	}
	/**
	 * 设置供应商Name
	 */	
	public void setSuppliersName(String value) {
		this.suppliersName = value;
	}
	/**
	 * 获取供应商Name
	 */
	public String getSuppliersName() {
		return this.suppliersName;
	}
	/**
	 * 设置供应商
	 */	
	public void setSuppliers(String value) {
		this.suppliers = value;
	}
	/**
	 * 获取供应商
	 */
	public String getSuppliers() {
		return this.suppliers;
	}
	/**
	 * 设置配置
	 */	
	public void setConfiguration(String value) {
		this.configuration = value;
	}
	/**
	 * 获取配置
	 */
	public String getConfiguration() {
		return this.configuration;
	}
	/**
	 * 设置购置日期
	 */	
	public void setPurchaseDate(String value) {
		this.purchaseDate = value;
	}
	/**
	 * 获取购置日期
	 */
	public String getPurchaseDate() {
		return this.purchaseDate;
	}
	/**
	 * 设置入库日期
	 */	
	public void setInboundDate(Date value) {
		this.inboundDate = value;
	}
	/**
	 * 获取入库日期
	 */
	public Date getInboundDate() {
		return this.inboundDate;
	}
	/**
	 * 设置原值
	 */	
	public void setOriginal(String value) {
		this.original = value;
	}
	/**
	 * 获取原值
	 */
	public String getOriginal() {
		return this.original;
	}
	/**
	 * 设置资产净值
	 */	
	public void setAssetValue(String value) {
		this.assetValue = value;
	}
	/**
	 * 获取资产净值
	 */
	public String getAssetValue() {
		return this.assetValue;
	}
	/**
	 * 设置折旧年限
	 */	
	public void setDepreciation(String value) {
		this.depreciation = value;
	}
	/**
	 * 获取折旧年限
	 */
	public String getDepreciation() {
		return this.depreciation;
	}
	/**
	 * 设置最小残值
	 */	
	public void setSmallValue(String value) {
		this.smallValue = value;
	}
	/**
	 * 获取最小残值
	 */
	public String getSmallValue() {
		return this.smallValue;
	}
	/**
	 * 设置图片上传
	 */	
	public void setImageUpload(String value) {
		this.imageUpload = value;
	}
	/**
	 * 获取图片上传
	 */
	public String getImageUpload() {
		return this.imageUpload;
	}
	/**
	 * 设置上传路径
	 */	
	public void setImageUploadUrl(String value) {
		this.imageUploadUrl = value;
	}
	/**
	 * 获取上传路径
	 */
	public String getImageUploadUrl() {
		return this.imageUploadUrl;
	}
	/**
	 * 设置图片新名字
	 */	
	public void setImageUploadNew(String value) {
		this.imageUploadNew = value;
	}
	/**
	 * 获取图片新名字
	 */
	public String getImageUploadNew() {
		return this.imageUploadNew;
	}
	/**
	 * 设置备注
	 */	
	public void setRemark(String value) {
		this.remark = value;
	}
	/**
	 * 获取备注
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * 设置自定义字段
	 */	
	public void setCustomField(String value) {
		this.customField = value;
	}
	/**
	 * 获取自定义字段
	 */
	public String getCustomField() {
		return this.customField;
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
	public void setOrderId(String value) {
		this.orderId = value;
	}
	/**
	 * 获取单号(入库/转移/领用/维修)
	 */
	public String getOrderId() {
		return this.orderId;
	}
	/**
	 * 设置操作类型
	 */	
	public void setType(Integer value) {
		this.type = value;
	}
	/**
	 * 获取操作类型
	 */
	public Integer getType() {
		return this.type;
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
	 * 设置清理人
	 */	
	public void setCleanBy(String value) {
		this.cleanBy = value;
	}
	/**
	 * 获取清理人
	 */
	public String getCleanBy() {
		return this.cleanBy;
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
	 * 设置归还时间
	 */	
	public void setReturnTime(Date value) {
		this.returnTime = value;
	}
	/**
	 * 获取归还时间
	 */
	public Date getReturnTime() {
		return this.returnTime;
	}
	/**
	 * 设置归还人
	 */	
	public void setReturnUser(String value) {
		this.returnUser = value;
	}
	/**
	 * 获取归还人
	 */
	public String getReturnUser() {
		return this.returnUser;
	}
	/**
	 * 设置转移时间
	 */	
	public void setTransferDate(Date value) {
		this.transferDate = value;
	}
	/**
	 * 获取转移时间
	 */
	public Date getTransferDate() {
		return this.transferDate;
	}
	/**
	 * 设置维修时间
	 */	
	public void setRepairDate(Date value) {
		this.repairDate = value;
	}
	/**
	 * 获取维修时间
	 */
	public Date getRepairDate() {
		return this.repairDate;
	}
	/**
	 * 设置维修方式
	 */	
	public void setRepairType(String value) {
		this.repairType = value;
	}
	/**
	 * 获取维修方式
	 */
	public String getRepairType() {
		return this.repairType;
	}
	/**
	 * 设置维修原因
	 */	
	public void setRepairReason(String value) {
		this.repairReason = value;
	}
	/**
	 * 获取维修原因
	 */
	public String getRepairReason() {
		return this.repairReason;
	}
	/**
	 * 设置负责人姓名
	 */	
	public void setUserRealName(String value) {
		this.userRealName = value;
	}
	/**
	 * 获取负责人姓名
	 */
	public String getUserRealName() {
		return this.userRealName;
	}
	/**
	 * 设置品牌
	 */	
	public void setBrands(String value) {
		this.brands = value;
	}
	/**
	 * 获取品牌
	 */
	public String getBrands() {
		return this.brands;
	}
	/**
	 * 设置来源
	 */	
	public void setSource(String value) {
		this.source = value;
	}
	/**
	 * 获取来源
	 */
	public String getSource() {
		return this.source;
	}
	/**
	 * 设置品牌名称
	 */	
	public void setBrandsName(String value) {
		this.brandsName = value;
	}
	/**
	 * 获取品牌名称
	 */
	public String getBrandsName() {
		return this.brandsName;
	}
	/**
	 * 设置来源名称
	 */	
	public void setSourceName(String value) {
		this.sourceName = value;
	}
	/**
	 * 获取来源名称
	 */
	public String getSourceName() {
		return this.sourceName;
	}
	/**
	 * 设置渠道
	 */	
	public void setChanne(String value) {
		this.channe = value;
	}
	/**
	 * 获取渠道
	 */
	public String getChanne() {
		return this.channe;
	}
	/**
	 * 设置sn带出的配置
	 */	
	public void setSnconfiguration(String value) {
		this.snconfiguration = value;
	}
	/**
	 * 获取sn带出的配置
	 */
	public String getSnconfiguration() {
		return this.snconfiguration;
	}
	/**
	 * 设置过保日期
	 */	
	public void setOverInsuranceTime(String value) {
		this.overInsuranceTime = value;
	}
	/**
	 * 获取过保日期
	 */
	public String getOverInsuranceTime() {
		return this.overInsuranceTime;
	}
	/**
	 * 设置预计报废时间
	 */	
	public void setExpectedDiscardingTime(String value) {
		this.expectedDiscardingTime = value;
	}
	/**
	 * 获取预计报废时间
	 */
	public String getExpectedDiscardingTime() {
		return this.expectedDiscardingTime;
	}
	/**
	 * 设置0 未打印，1 审核中 2 已打印
	 */	
	public void setPrintingStatus(Integer value) {
		this.printingStatus = value;
	}
	/**
	 * 获取0 未打印，1 审核中 2 已打印
	 */
	public Integer getPrintingStatus() {
		return this.printingStatus;
	}
	/**
	 * 设置
	 */	
	public void setRepairState(String value) {
		this.repairState = value;
	}
	/**
	 * 获取
	 */
	public String getRepairState() {
		return this.repairState;
	}
	/**
	 * 设置盘点人
	 */	
	public void setInventoryPeople(String value) {
		this.inventoryPeople = value;
	}
	/**
	 * 获取盘点人
	 */
	public String getInventoryPeople() {
		return this.inventoryPeople;
	}
	/**
	 * 设置盘点时间
	 */	
	public void setInventoryTime(Date value) {
		this.inventoryTime = value;
	}
	/**
	 * 获取盘点时间
	 */
	public Date getInventoryTime() {
		return this.inventoryTime;
	}
	/**
	 * 设置盘点结果
	 */	
	public void setInventoryResult(String value) {
		this.inventoryResult = value;
	}
	/**
	 * 获取盘点结果
	 */
	public String getInventoryResult() {
		return this.inventoryResult;
	}
	/**
	 * 设置盘点备注
	 */	
	public void setInventoryRemark(String value) {
		this.inventoryRemark = value;
	}
	/**
	 * 获取盘点备注
	 */
	public String getInventoryRemark() {
		return this.inventoryRemark;
	}
	/**
	 * 设置领用人ID
	 */	
	public void setModel(String value) {
		this.model = value;
	}
	/**
	 * 获取领用人ID
	 */
	public String getModel() {
		return this.model;
	}
	/**
	 * 设置领用人ID
	 */	
	public void setMeasuringUnit(String value) {
		this.measuringUnit = value;
	}
	/**
	 * 获取领用人ID
	 */
	public String getMeasuringUnit() {
		return this.measuringUnit;
	}
	/**
	 * 设置领用人ID
	 */	
	public void setBuyTime(Date value) {
		this.buyTime = value;
	}
	/**
	 * 获取领用人ID
	 */
	public Date getBuyTime() {
		return this.buyTime;
	}
	/**
	 * 设置领用人ID
	 */	
	public void setUsePeriod(String value) {
		this.usePeriod = value;
	}
	/**
	 * 获取领用人ID
	 */
	public String getUsePeriod() {
		return this.usePeriod;
	}
	/**
	 * 设置领用人ID
	 */	
	public void setUseToId(String value) {
		this.useToId = value;
	}
	/**
	 * 获取领用人ID
	 */
	public String getUseToId() {
		return this.useToId;
	}
	/**
	 * 设置领用人ID
	 */	
	public void setInventoryAssetType(String value) {
		this.inventoryAssetType = value;
	}
	/**
	 * 获取领用人ID
	 */
	public String getInventoryAssetType() {
		return this.inventoryAssetType;
	}
	/**
	 * 设置领用人ID
	 */	
	public void setReplaceContent(String value) {
		this.replaceContent = value;
	}
	/**
	 * 获取领用人ID
	 */
	public String getReplaceContent() {
		return this.replaceContent;
	}
	/**
	 * 设置领用人ID
	 */	
	public void setUserNameId(String value) {
		this.userNameId = value;
	}
	/**
	 * 获取领用人ID
	 */
	public String getUserNameId() {
		return this.userNameId;
	}

}

