package com.chaselx.apidoc.enty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 查询入库单返回的单据信息
 */
@ApiModel
public class MaterialInfoQuery implements Serializable {
    private static final long serialVersionUID = -1553800892967L;
    /**
     * 物料编码
     */
    @ApiModelProperty(value = "物料编码")
    private String materialCode;
    /**
     * 物料名称
     */
    @ApiModelProperty(value = "物料名称")
    private String materialName;
    /**
     * 物料分类
     */
    @ApiModelProperty(value = "物料分类")
    private String materialCategory;
    /**
     * 物料品牌
     */
    @ApiModelProperty(value = "物料品牌")
    private String materialBrand;
    /**
     * 规格型号
     */
    @ApiModelProperty(value = "规格型号")
    private String specificationType;
    /**
     * 数量   在字表
     */
    @ApiModelProperty(value = "数量")
    private Integer quantity;
    /**
     * 单价  在子表
     */
    @ApiModelProperty(value = "单价")
    private Long unitprice;
    /**
     * 总金额   在子表
     */
    @ApiModelProperty(value = "总金额")
    private Long money;

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialCategory() {
        return materialCategory;
    }

    public void setMaterialCategory(String materialCategory) {
        this.materialCategory = materialCategory;
    }

    public String getMaterialBrand() {
        return materialBrand;
    }

    public void setMaterialBrand(String materialBrand) {
        this.materialBrand = materialBrand;
    }

    public String getSpecificationType() {
        return specificationType;
    }

    public void setSpecificationType(String specificationType) {
        this.specificationType = specificationType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Long unitprice) {
        this.unitprice = unitprice;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }
}
