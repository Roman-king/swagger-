package com.chaselx.apidoc.enty;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
@ApiModel
public class InToMaterial implements Serializable {

//    private String putinstorageStateId;
    /**
     * 存储仓库
     */
    @ApiModelProperty(value = "存储仓库")
    private String warehouseId;
    /**
     * 入库日期
     */
    @ApiModelProperty(value = "入库日期",example = "2011-10-10")
    private Date inboundDate;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;
    /**
     * 总金额
     */
    @ApiModelProperty(value = "总金额")
    private Long totalAmount;

    List<InToMeaterialDto> inToMeaterialDtos;

//    public String getPutinstorageStateId() {
//        return putinstorageStateId;
//    }
//
//    public void setPutinstorageStateId(String putinstorageStateId) {
//        this.putinstorageStateId = putinstorageStateId;
//    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Date getInboundDate() {
        return inboundDate;
    }

    public void setInboundDate(Date inboundDate) {
        this.inboundDate = inboundDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<InToMeaterialDto> getInToMeaterialDtos() {
        return inToMeaterialDtos;
    }

    public void setInToMeaterialDtos(List<InToMeaterialDto> inToMeaterialDtos) {
        this.inToMeaterialDtos = inToMeaterialDtos;
    }
}
