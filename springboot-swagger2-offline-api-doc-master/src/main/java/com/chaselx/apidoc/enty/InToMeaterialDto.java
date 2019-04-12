package com.chaselx.apidoc.enty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 */
@ApiModel
public class InToMeaterialDto implements Serializable {
    /**
     * 物料编码
     */
    @ApiModelProperty(value = "物料编码")
    private String materialCode;
    /**
     *数量
     */
    @ApiModelProperty(value = "数量")
    private Integer quantity;
    /**
     * 单价
     */
    @ApiModelProperty(value = "单价")
    private BigDecimal unitprice;
    /**
     * 总金额
     */
    @ApiModelProperty(value = "总金额")
    private BigDecimal money;

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
