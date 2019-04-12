package com.chaselx.apidoc.enty;


import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 资产日志表
 * 
 * @author 锅旭阳
 * @date 2019年3月13日
 */
public class AssetinfoLoginfo implements Serializable {

    private static final long serialVersionUID = -1552457965604L;
	
	/**
	 * 日志编号
	 */
	@ApiModelProperty("日志ID")
	private String loginfoId;
	/**
	 * 资产编号
	 */
	@ApiModelProperty("资产ID")
	private String assetsId;
	/**
	 * 资产编码
	 */
	@ApiModelProperty("资产编码")
	private String assetsCoding;
	/**
	 * 二维码name
	 */
	@ApiModelProperty("二维码name")
	private String assetQrCodeName;
	/**
	 * 资产二维码
	 */
	@ApiModelProperty("资产二维码")
	private String assetQrCode;
	/**
	 * 资产类别
	 */
	@ApiModelProperty("资产类别")
	private String categoryId;
	/**
	 * 资产类别name
	 */
	@ApiModelProperty("资产类别name")
	private String categoryName;
	/**
	 * 资产名称
	 */
	@ApiModelProperty("资产名称")
	private String assetName;
	/**
	 * 公司id
	 */
	@ApiModelProperty("公司id")
	private String tenantId;
	/**
	 * 状态name
	 */
	@ApiModelProperty("状态name")
	private String stateName;
	/**
	 * 操作类型
	 */
	@ApiModelProperty("操作类型")
	private String stateId;
	/**
	 * SN号
	 */
	@ApiModelProperty("SN号")
	private String snNo;
	/**
	 * 部门name
	 */
	@ApiModelProperty("部门name")
	private String departmentName;
	/**
	 * 使用部门
	 */
	@ApiModelProperty("使用部门")
	private String department;
	/**
	 * 使用地name
	 */
	@ApiModelProperty("使用地name")
	private String useToName;
	/**
	 * 使用地
	 */
	@ApiModelProperty("使用地")
	private String useTo;
	/**
	 * 使用人
	 */
	@ApiModelProperty("使用人")
	private String useName;
	/**
	 * 使用工位
	 */
	@ApiModelProperty("使用工位")
	private String userStation;
	/**
	 * 使用时间
	 */
	@ApiModelProperty("使用时间")
	private Date useDate;
	/**
	 * 供应商Name
	 */
	@ApiModelProperty("供应商Name")
	private String suppliersName;
	/**
	 * 供应商
	 */
	@ApiModelProperty("供应商")
	private String suppliers;
	/**
	 * 配置
	 */
	@ApiModelProperty("配置")
	private String configuration;
	/**
	 * 购置日期
	 */
	@ApiModelProperty("购置日期")
	private String purchaseDate;
	/**
	 * 入库日期
	 */
	@ApiModelProperty("入库日期")
	private Date inboundDate;
	/**
	 * 原值
	 */
	@ApiModelProperty("原值")
	private String original;
	/**
	 * 资产净值
	 */
	@ApiModelProperty("资产净值")
	private String assetValue;
	/**
	 * 折旧年限
	 */
	@ApiModelProperty("折旧年限")
	private String depreciation;
	/**
	 * 最小残值
	 */
	@ApiModelProperty("最小残值")
	private String smallValue;
	/**
	 * 图片上传
	 */
	@ApiModelProperty("图片上传")
	private String imageUpload;
	/**
	 * 上传路径
	 */
	@ApiModelProperty("上传路径")
	private String imageUploadUrl;
	/**
	 * 图片新名字
	 */
	@ApiModelProperty("图片新名字")
	private String imageUploadNew;
	/**
	 * 备注
	 */
	@ApiModelProperty("备注")
	private String remark;
	/**
	 * 自定义字段
	 */
	@ApiModelProperty("自定义字段")
	private String customField;
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
	private String orderId;
	/**
	 * 操作类型
	 */
	@ApiModelProperty("操作类型")
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
	@ApiModelProperty("清理时间")
	private Date cleanDate;
	/**
	 * 清理人
	 */
	@ApiModelProperty("清理人")
	private String cleanBy;
	/**
	 * 清理原因
	 */
	@ApiModelProperty("清理原因")
	private String cleanReasons;
	/**
	 * 归还时间
	 */
	@ApiModelProperty("归还时间")
	private Date returnTime;
	/**
	 * 归还人
	 */
	@ApiModelProperty("归还人")
	private String returnUser;
	/**
	 * 转移时间
	 */
	@ApiModelProperty("转移时间")
	private Date transferDate;
	/**
	 * 维修时间
	 */
	@ApiModelProperty("维修时间")
	private Date repairDate;
	/**
	 * 维修方式
	 */
	@ApiModelProperty("维修方式")
	private String repairType;
	/**
	 * 维修原因
	 */
	@ApiModelProperty("维修原因")
	private String repairReason;
	/**
	 * 负责人姓名
	 */
	@ApiModelProperty("负责人姓名")
	private String userRealName;
	/**
	 * 品牌
	 */
	@ApiModelProperty("品牌")
	private String brands;
	/**
	 * 来源
	 */
	@ApiModelProperty("来源")
	private String source;
	/**
	 * 品牌名称
	 */
	@ApiModelProperty("品牌名称")
	private String brandsName;
	/**
	 * 来源名称
	 */
	@ApiModelProperty("来源名称")
	private String sourceName;
	/**
	 * 渠道
	 */
	@ApiModelProperty("渠道")
	private String channe;
	/**
	 * sn带出的配置
	 */
	@ApiModelProperty("sn带出的配置")
	private String snconfiguration;
	/**
	 * 过保日期
	 */
	@ApiModelProperty("过保日期")
	private String overInsuranceTime;
	/**
	 * 预计报废时间
	 */
	@ApiModelProperty("预计报废时间")
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
	@ApiModelProperty("盘点人")
	private String inventoryPeople;
	/**
	 * 盘点时间
	 */
	@ApiModelProperty("盘点时间")
	private Date inventoryTime;
	/**
	 * 盘点结果
	 */
	@ApiModelProperty("盘点结果")
	private String inventoryResult;
	/**
	 * 盘点备注
	 */
	@ApiModelProperty("盘点备注")
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
	public void setLoginfoId(String loginfoId) {
		this.loginfoId = loginfoId == null ? null : loginfoId.trim();
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
	 * 设置资产编码
	 */
	public void setAssetsCoding(String assetsCoding) {
		this.assetsCoding = assetsCoding == null ? null : assetsCoding.trim();
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
	public void setAssetQrCodeName(String assetQrCodeName) {
		this.assetQrCodeName = assetQrCodeName == null ? null : assetQrCodeName.trim();
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
	public void setAssetQrCode(String assetQrCode) {
		this.assetQrCode = assetQrCode == null ? null : assetQrCode.trim();
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
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId == null ? null : categoryId.trim();
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
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName == null ? null : categoryName.trim();
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
	public void setAssetName(String assetName) {
		this.assetName = assetName == null ? null : assetName.trim();
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
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId == null ? null : tenantId.trim();
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
	public void setStateName(String stateName) {
		this.stateName = stateName == null ? null : stateName.trim();
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
	public void setStateId(String stateId) {
		this.stateId = stateId == null ? null : stateId.trim();
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
	public void setSnNo(String snNo) {
		this.snNo = snNo == null ? null : snNo.trim();
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
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName == null ? null : departmentName.trim();
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
	public void setDepartment(String department) {
		this.department = department == null ? null : department.trim();
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
	public void setUseToName(String useToName) {
		this.useToName = useToName == null ? null : useToName.trim();
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
	public void setUseTo(String useTo) {
		this.useTo = useTo == null ? null : useTo.trim();
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
	public void setUseName(String useName) {
		this.useName = useName == null ? null : useName.trim();
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
	 * 设置使用时间
	 */
	public void setUseDate(Date useDate) {
		this.useDate = useDate;
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
	public void setSuppliersName(String suppliersName) {
		this.suppliersName = suppliersName == null ? null : suppliersName.trim();
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
	public void setSuppliers(String suppliers) {
		this.suppliers = suppliers == null ? null : suppliers.trim();
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
	public void setConfiguration(String configuration) {
		this.configuration = configuration == null ? null : configuration.trim();
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
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate == null ? null : purchaseDate.trim();
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
	public void setInboundDate(Date inboundDate) {
		this.inboundDate = inboundDate;
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
	public void setOriginal(String original) {
		this.original = original == null ? null : original.trim();
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
	public void setAssetValue(String assetValue) {
		this.assetValue = assetValue == null ? null : assetValue.trim();
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
	public void setDepreciation(String depreciation) {
		this.depreciation = depreciation == null ? null : depreciation.trim();
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
	public void setSmallValue(String smallValue) {
		this.smallValue = smallValue == null ? null : smallValue.trim();
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
	public void setImageUpload(String imageUpload) {
		this.imageUpload = imageUpload == null ? null : imageUpload.trim();
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
	public void setImageUploadUrl(String imageUploadUrl) {
		this.imageUploadUrl = imageUploadUrl == null ? null : imageUploadUrl.trim();
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
	public void setImageUploadNew(String imageUploadNew) {
		this.imageUploadNew = imageUploadNew == null ? null : imageUploadNew.trim();
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
	 * 设置自定义字段
	 */
	public void setCustomField(String customField) {
		this.customField = customField == null ? null : customField.trim();
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
	public void setOrderId(String orderId) {
		this.orderId = orderId == null ? null : orderId.trim();
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
	public void setType(Integer type) {
		this.type = type;
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
	 * 设置清理人
	 */
	public void setCleanBy(String cleanBy) {
		this.cleanBy = cleanBy == null ? null : cleanBy.trim();
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
	 * 设置归还时间
	 */
	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
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
	public void setReturnUser(String returnUser) {
		this.returnUser = returnUser == null ? null : returnUser.trim();
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
	 * 设置维修时间
	 */
	public void setRepairDate(Date repairDate) {
		this.repairDate = repairDate;
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
	public void setRepairType(String repairType) {
		this.repairType = repairType == null ? null : repairType.trim();
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
	public void setRepairReason(String repairReason) {
		this.repairReason = repairReason == null ? null : repairReason.trim();
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
	 * 设置品牌
	 */
	public void setBrands(String brands) {
		this.brands = brands == null ? null : brands.trim();
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
	public void setSource(String source) {
		this.source = source == null ? null : source.trim();
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
	public void setBrandsName(String brandsName) {
		this.brandsName = brandsName == null ? null : brandsName.trim();
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
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName == null ? null : sourceName.trim();
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
	public void setChanne(String channe) {
		this.channe = channe == null ? null : channe.trim();
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
	public void setSnconfiguration(String snconfiguration) {
		this.snconfiguration = snconfiguration == null ? null : snconfiguration.trim();
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
	public void setOverInsuranceTime(String overInsuranceTime) {
		this.overInsuranceTime = overInsuranceTime == null ? null : overInsuranceTime.trim();
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
	public void setExpectedDiscardingTime(String expectedDiscardingTime) {
		this.expectedDiscardingTime = expectedDiscardingTime == null ? null : expectedDiscardingTime.trim();
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
	public void setPrintingStatus(Integer printingStatus) {
		this.printingStatus = printingStatus;
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
	public void setRepairState(String repairState) {
		this.repairState = repairState == null ? null : repairState.trim();
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
	public void setInventoryPeople(String inventoryPeople) {
		this.inventoryPeople = inventoryPeople == null ? null : inventoryPeople.trim();
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
	public void setInventoryTime(Date inventoryTime) {
		this.inventoryTime = inventoryTime;
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
	public void setInventoryResult(String inventoryResult) {
		this.inventoryResult = inventoryResult == null ? null : inventoryResult.trim();
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
	public void setInventoryRemark(String inventoryRemark) {
		this.inventoryRemark = inventoryRemark == null ? null : inventoryRemark.trim();
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
	public void setModel(String model) {
		this.model = model == null ? null : model.trim();
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
	public void setMeasuringUnit(String measuringUnit) {
		this.measuringUnit = measuringUnit == null ? null : measuringUnit.trim();
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
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
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
	public void setUsePeriod(String usePeriod) {
		this.usePeriod = usePeriod == null ? null : usePeriod.trim();
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
	public void setUseToId(String useToId) {
		this.useToId = useToId == null ? null : useToId.trim();
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
	public void setInventoryAssetType(String inventoryAssetType) {
		this.inventoryAssetType = inventoryAssetType == null ? null : inventoryAssetType.trim();
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
	public void setReplaceContent(String replaceContent) {
		this.replaceContent = replaceContent == null ? null : replaceContent.trim();
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
	public void setUserNameId(String userNameId) {
		this.userNameId = userNameId == null ? null : userNameId.trim();
	}
	/**
	 * 获取领用人ID
	 */
	public String getUserNameId() {
		return this.userNameId;
	}

    @Override
	public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("AssetinfoLoginfo{");
	    builder.append("loginfoId=");
	    builder.append(loginfoId);
	    builder.append(",");
	    builder.append("assetsId=");
	    builder.append(assetsId);
	    builder.append(",");
	    builder.append("assetsCoding=");
	    builder.append(assetsCoding);
	    builder.append(",");
	    builder.append("assetQrCodeName=");
	    builder.append(assetQrCodeName);
	    builder.append(",");
	    builder.append("assetQrCode=");
	    builder.append(assetQrCode);
	    builder.append(",");
	    builder.append("categoryId=");
	    builder.append(categoryId);
	    builder.append(",");
	    builder.append("categoryName=");
	    builder.append(categoryName);
	    builder.append(",");
	    builder.append("assetName=");
	    builder.append(assetName);
	    builder.append(",");
	    builder.append("tenantId=");
	    builder.append(tenantId);
	    builder.append(",");
	    builder.append("stateName=");
	    builder.append(stateName);
	    builder.append(",");
	    builder.append("stateId=");
	    builder.append(stateId);
	    builder.append(",");
	    builder.append("snNo=");
	    builder.append(snNo);
	    builder.append(",");
	    builder.append("departmentName=");
	    builder.append(departmentName);
	    builder.append(",");
	    builder.append("department=");
	    builder.append(department);
	    builder.append(",");
	    builder.append("useToName=");
	    builder.append(useToName);
	    builder.append(",");
	    builder.append("useTo=");
	    builder.append(useTo);
	    builder.append(",");
	    builder.append("useName=");
	    builder.append(useName);
	    builder.append(",");
	    builder.append("userStation=");
	    builder.append(userStation);
	    builder.append(",");
	    builder.append("useDate=");
	    builder.append(useDate);
	    builder.append(",");
	    builder.append("suppliersName=");
	    builder.append(suppliersName);
	    builder.append(",");
	    builder.append("suppliers=");
	    builder.append(suppliers);
	    builder.append(",");
	    builder.append("configuration=");
	    builder.append(configuration);
	    builder.append(",");
	    builder.append("purchaseDate=");
	    builder.append(purchaseDate);
	    builder.append(",");
	    builder.append("inboundDate=");
	    builder.append(inboundDate);
	    builder.append(",");
	    builder.append("original=");
	    builder.append(original);
	    builder.append(",");
	    builder.append("assetValue=");
	    builder.append(assetValue);
	    builder.append(",");
	    builder.append("depreciation=");
	    builder.append(depreciation);
	    builder.append(",");
	    builder.append("smallValue=");
	    builder.append(smallValue);
	    builder.append(",");
	    builder.append("imageUpload=");
	    builder.append(imageUpload);
	    builder.append(",");
	    builder.append("imageUploadUrl=");
	    builder.append(imageUploadUrl);
	    builder.append(",");
	    builder.append("imageUploadNew=");
	    builder.append(imageUploadNew);
	    builder.append(",");
	    builder.append("remark=");
	    builder.append(remark);
	    builder.append(",");
	    builder.append("customField=");
	    builder.append(customField);
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
	    builder.append("orderId=");
	    builder.append(orderId);
	    builder.append(",");
	    builder.append("type=");
	    builder.append(type);
	    builder.append(",");
	    builder.append("createName=");
	    builder.append(createName);
	    builder.append(",");
	    builder.append("updateName=");
	    builder.append(updateName);
	    builder.append(",");
	    builder.append("cleanDate=");
	    builder.append(cleanDate);
	    builder.append(",");
	    builder.append("cleanBy=");
	    builder.append(cleanBy);
	    builder.append(",");
	    builder.append("cleanReasons=");
	    builder.append(cleanReasons);
	    builder.append(",");
	    builder.append("returnTime=");
	    builder.append(returnTime);
	    builder.append(",");
	    builder.append("returnUser=");
	    builder.append(returnUser);
	    builder.append(",");
	    builder.append("transferDate=");
	    builder.append(transferDate);
	    builder.append(",");
	    builder.append("repairDate=");
	    builder.append(repairDate);
	    builder.append(",");
	    builder.append("repairType=");
	    builder.append(repairType);
	    builder.append(",");
	    builder.append("repairReason=");
	    builder.append(repairReason);
	    builder.append(",");
	    builder.append("userRealName=");
	    builder.append(userRealName);
	    builder.append(",");
	    builder.append("brands=");
	    builder.append(brands);
	    builder.append(",");
	    builder.append("source=");
	    builder.append(source);
	    builder.append(",");
	    builder.append("brandsName=");
	    builder.append(brandsName);
	    builder.append(",");
	    builder.append("sourceName=");
	    builder.append(sourceName);
	    builder.append(",");
	    builder.append("channe=");
	    builder.append(channe);
	    builder.append(",");
	    builder.append("snconfiguration=");
	    builder.append(snconfiguration);
	    builder.append(",");
	    builder.append("overInsuranceTime=");
	    builder.append(overInsuranceTime);
	    builder.append(",");
	    builder.append("expectedDiscardingTime=");
	    builder.append(expectedDiscardingTime);
	    builder.append(",");
	    builder.append("printingStatus=");
	    builder.append(printingStatus);
	    builder.append(",");
	    builder.append("repairState=");
	    builder.append(repairState);
	    builder.append(",");
	    builder.append("inventoryPeople=");
	    builder.append(inventoryPeople);
	    builder.append(",");
	    builder.append("inventoryTime=");
	    builder.append(inventoryTime);
	    builder.append(",");
	    builder.append("inventoryResult=");
	    builder.append(inventoryResult);
	    builder.append(",");
	    builder.append("inventoryRemark=");
	    builder.append(inventoryRemark);
	    builder.append(",");
	    builder.append("model=");
	    builder.append(model);
	    builder.append(",");
	    builder.append("measuringUnit=");
	    builder.append(measuringUnit);
	    builder.append(",");
	    builder.append("buyTime=");
	    builder.append(buyTime);
	    builder.append(",");
	    builder.append("usePeriod=");
	    builder.append(usePeriod);
	    builder.append(",");
	    builder.append("useToId=");
	    builder.append(useToId);
	    builder.append(",");
	    builder.append("inventoryAssetType=");
	    builder.append(inventoryAssetType);
	    builder.append(",");
	    builder.append("replaceContent=");
	    builder.append(replaceContent);
	    builder.append(",");
	    builder.append("userNameId=");
	    builder.append(userNameId);
	    builder.append("}");
	    return builder.toString();
	}

}

