package com.chaselx.apidoc.enty;

import java.io.Serializable;

public class MaterialInfoOutMessage implements Serializable {
    //物料的编码  和物料的数量
    /**
     * 物料编码
     */
    private String materialCode;
    /**
     * 数量
     */
    private Integer quantity;

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
}
