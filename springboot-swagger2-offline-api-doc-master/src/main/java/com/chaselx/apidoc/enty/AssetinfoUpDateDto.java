package com.chaselx.apidoc.enty;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel
public class AssetinfoUpDateDto implements Serializable {
    private static final long serialVersionUID = -1552641683128L;

    @ApiModelProperty(value = "资产编码", required = true)
    private String assetsCoding;

    /**
     * 资产类别
     */
    @ApiModelProperty(value = "资产类别", required = true)
    private String categoryId;
    /**
     * 资产名称
     */
    @ApiModelProperty(value = "资产名称", required = true)
    private String assetName;


    /**
     * SN号
     */
    @ApiModelProperty(value = "SN号")
    private String snNo;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

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
     * 入库日期
     */
    @ApiModelProperty(value = "入库日期")
    private Date inboundDate;
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
    private Date buyTime;
    /**
     * 使用期限（入库+月=预计报废）
     */
    @ApiModelProperty(value = "使用期限")
    private String usePeriod;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAssetsCoding() {
        return assetsCoding;
    }

    public void setAssetsCoding(String assetsCoding) {
        this.assetsCoding = assetsCoding;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getSnNo() {
        return snNo;
    }

    public void setSnNo(String snNo) {
        this.snNo = snNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getChanne() {
        return channe;
    }

    public void setChanne(String channe) {
        this.channe = channe;
    }

    public String getSnconfiguration() {
        return snconfiguration;
    }

    public void setSnconfiguration(String snconfiguration) {
        this.snconfiguration = snconfiguration;
    }

    public String getOverInsuranceTime() {
        return overInsuranceTime;
    }

    public void setOverInsuranceTime(String overInsuranceTime) {
        this.overInsuranceTime = overInsuranceTime;
    }

    public Date getInboundDate() {
        return inboundDate;
    }

    public void setInboundDate(Date inboundDate) {
        this.inboundDate = inboundDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMeasuringUnit() {
        return measuringUnit;
    }

    public void setMeasuringUnit(String measuringUnit) {
        this.measuringUnit = measuringUnit;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public String getUsePeriod() {
        return usePeriod;
    }

    public void setUsePeriod(String usePeriod) {
        this.usePeriod = usePeriod;
    }
}
