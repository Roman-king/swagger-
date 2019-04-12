package com.chaselx.apidoc.enty;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel
public class AssetinfoParam {
    //资产名称/资产编码/资产状态/使用人/使用地/使用部门/资产类别/入库时间
    /**
     * 资产名称
     */
    @ApiModelProperty(value = "资产名称")
    private String assetName;
    /**
     * 资产编码
     */
    @ApiModelProperty(value = "资产编码")
    private String assetsCoding;
    /**
     * 资产状态
     */
    @ApiModelProperty(value = "资产状态")
    private String state;
    /**
     * 使用人
     */
    @ApiModelProperty(value = "使用人")
    private String useName;
    /**
     * 使用地
     */
    @ApiModelProperty(value = "使用地")
    private String uSeTo;
    /**
     * 使用部门
     */
    @ApiModelProperty(value = "使用部门")
    private String department;
    /**
     * 资产类别
     */
    @ApiModelProperty(value = "资产类别")
    private String category;
    /**
     * 入库时间
     */

   // @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "入库时间",example = "2011-10-10")
    private Date inboundDate;

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetsCoding() {
        return assetsCoding;
    }

    public void setAssetsCoding(String assetsCoding) {
        this.assetsCoding = assetsCoding;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getuSeTo() {
        return uSeTo;
    }

    public void setuSeTo(String uSeTo) {
        this.uSeTo = uSeTo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getInboundDate() {
        return inboundDate;
    }

    public void setInboundDate(Date inboundDate) {
        this.inboundDate = inboundDate;
    }

    @Override
    public String toString() {
        return "AssetinfoParam{" +
                "assetName='" + assetName + '\'' +
                ", assetsCoding='" + assetsCoding + '\'' +
                ", state='" + state + '\'' +
                ", useName='" + useName + '\'' +
                ", uSeTo='" + uSeTo + '\'' +
                ", department='" + department + '\'' +
                ", category='" + category + '\'' +
                ", inboundDate=" + inboundDate +
                '}';
    }
}
