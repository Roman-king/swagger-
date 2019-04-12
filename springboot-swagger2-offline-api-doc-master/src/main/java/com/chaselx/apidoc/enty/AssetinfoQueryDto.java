package com.chaselx.apidoc.enty;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class AssetinfoQueryDto implements Serializable {
    private static final long serialVersionUID = -1552442010974L;

    /**
     * 资产编号
     */
    private String assetsId;
    @ApiModelProperty(value = "资产编码", required = true)
    private String assetsCoding;
    /**
     * 资产二维码
     */
    @ApiModelProperty(value = "资产二维码")
    private String assetQrCode;
    /**
     * 资产类别
     */
    @ApiModelProperty(value = "资产类别")
    private String categoryId;
    /**
     * 资产名称
     */
    @ApiModelProperty(value = "资产名称")
    private String assetName;
    /**
     * 公司id
     */
    @ApiModelProperty(value = "公司id")
    private String tenantId;
    /**
     * 资产状态
     */
    @ApiModelProperty(value = "资产状态")
    private String stateId;
    /**
     * SN号
     */
    @ApiModelProperty(value = "SN号")
    private String snNo;
    /**
     * 使用部门
     */
    @ApiModelProperty(value = "使用部门")
    private String department;
    /**
     * 使用地
     */
    @ApiModelProperty(value = "使用地")
    private String useTo;
    /**
     * 使用人
     */
    @ApiModelProperty(value = "使用人")
    private String useName;
    /**
     * 使用工位
     */
    @ApiModelProperty(value = "使用工位")
    private String userStation;
    /**
     * 供应商
     */
    @ApiModelProperty(value = "供应商")
    private String suppliers;
    /**
     * 配置
     */
    @ApiModelProperty(value = "配置")
    private String configuration;
    /**
     * 购置日期(保修起始)
     */
    @ApiModelProperty(value = "购置日期(保修起始)")
    private String purchaseDate;
    /**
     * 入库日期
     */
    @ApiModelProperty(value = "入库日期")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date inboundDate;
    /**
     * 原值
     */
    @ApiModelProperty(value = "原值")
    private String original;
    /**
     * 资产净值
     */
    @ApiModelProperty(value = "资产净值")
    private String assetValue;
    /**
     * 折旧年限
     */
    @ApiModelProperty(value = "折旧年限")
    private String depreciation;
    /**
     * 最小残值
     */
    @ApiModelProperty(value = "最小残值")
    private String smallValue;
    /**
     * 图片上传
     */
    @ApiModelProperty(value = "图片上传")
    private String imageUpload;


    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;
    /**
     * 自定义字段
     */
    @ApiModelProperty(value = "自定义字段")
    private String customField;
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private String createPerson;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createDate;
    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人")
    private String updatePerson;
    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    private Date updateDate;
    /**
     * 是否删除(0否/1是)
     */
    @ApiModelProperty(value = "是否删除(0否/1是)")
    private Integer deleteFlag;
    /**
     *
     */
    @ApiModelProperty(value = "创建人")
    private String createName;
    /**
     *
     */
    @ApiModelProperty(value = "修改人")
    private String updateName;
    /**
     * 清理时间
     */
    @ApiModelProperty(value = "清理时间")
    private Date cleanDate;
    /**
     * 清理人
     */
    @ApiModelProperty(value = "清理人")
    private String cleanBy;
    /**
     * 清理原因
     */
    @ApiModelProperty(value = "清理原因")
    private String cleanReasons;
    /**
     * 领用时间
     */
    @ApiModelProperty(value = "领用时间")
    private String recipientsDate;
    /**
     * 负责人姓名
     */
    @ApiModelProperty(value = "负责人姓名")
    private String userRealName;
    /**
     * 品牌
     */
    @ApiModelProperty(value = "品牌")
    private String brands;
    /**
     * 来源
     */
    @ApiModelProperty(value = "来源")
    private String source;
    /**
     * 渠道
     */
    @ApiModelProperty(value = "渠道")
    private String channe;
    /**
     * sn带出的配置
     */
    @ApiModelProperty(value = "sn带出的配置")
    private String snconfiguration;
    /**
     * 过保日期
     */
    @ApiModelProperty(value = "过保日期")
    private String overInsuranceTime;
    /**
     * 预计报废时间
     */
    @ApiModelProperty(value = "预计报废时间")
    private String expectedDiscardingTime;
    /**
     * 0 未打印，1 审核中 2 已打印
     */
    @ApiModelProperty(value = "0 未打印，1 审核中 2 已打印")
    private Integer printingStatus;
    /**
     * 型号
     */
    @ApiModelProperty(value = "型号")
    private String model;
    /**
     * 计量单位
     */
    @ApiModelProperty(value = "计量单位")
    private String measuringUnit;
    /**
     * 购入时间
     */
    @ApiModelProperty(value = "购入时间")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date buyTime;
    /**
     * 使用期限（入库+月=预计报废）
     */
    @ApiModelProperty(value = "使用期限")
    private String usePeriod;
    /**
     * 使用地名称（暂时没有用）
     */
    @ApiModelProperty(value = "使用地名称")
    private String useToId;
    /**
     * 使用人id
     */
    @ApiModelProperty(value = "使用人")
    private String userNameId;
    /**
     * 资产所属公司ID，默认-1表示全部
     */
    @ApiModelProperty(value = "资产所属公司")
    private String corpId;

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
     * 设置资产状态
     */
    public void setStateId(String stateId) {
        this.stateId = stateId == null ? null : stateId.trim();
    }
    /**
     * 获取资产状态
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
     * 设置领用时间
     */
    public void setRecipientsDate(String recipientsDate) {
        this.recipientsDate = recipientsDate == null ? null : recipientsDate.trim();
    }
    /**
     * 获取领用时间
     */
    public String getRecipientsDate() {
        return this.recipientsDate;
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
     * 设置型号
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }
    /**
     * 获取型号
     */
    public String getModel() {
        return this.model;
    }
    /**
     * 设置计量单位
     */
    public void setMeasuringUnit(String measuringUnit) {
        this.measuringUnit = measuringUnit == null ? null : measuringUnit.trim();
    }
    /**
     * 获取计量单位
     */
    public String getMeasuringUnit() {
        return this.measuringUnit;
    }
    /**
     * 设置购入时间
     */
    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }
    /**
     * 获取购入时间
     */
    public Date getBuyTime() {
        return this.buyTime;
    }
    /**
     * 设置使用期限（入库+月=预计报废）
     */
    public void setUsePeriod(String usePeriod) {
        this.usePeriod = usePeriod == null ? null : usePeriod.trim();
    }
    /**
     * 获取使用期限（入库+月=预计报废）
     */
    public String getUsePeriod() {
        return this.usePeriod;
    }
    /**
     * 设置使用地名称（暂时没有用）
     */
    public void setUseToId(String useToId) {
        this.useToId = useToId == null ? null : useToId.trim();
    }
    /**
     * 获取使用地名称（暂时没有用）
     */
    public String getUseToId() {
        return this.useToId;
    }
    /**
     * 设置使用人id
     */
    public void setUserNameId(String userNameId) {
        this.userNameId = userNameId == null ? null : userNameId.trim();
    }
    /**
     * 获取使用人id
     */
    public String getUserNameId() {
        return this.userNameId;
    }
    /**
     * 设置资产所属公司ID，默认-1表示全部
     */
    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }
    /**
     * 获取资产所属公司ID，默认-1表示全部
     */
    public String getCorpId() {
        return this.corpId;
    }
}
