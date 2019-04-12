package com.chaselx.apidoc.enty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;
@ApiModel
public class MaterialPutinstorageQuery implements Serializable {
    private static final long serialVersionUID = -1558830892967L;
    /**
     * 入库编号
     */
    @ApiModelProperty(value = "入库编号")
    private String putinstorageCode;
    /**
     * 状态 1待入库  2已入库
     */
    @ApiModelProperty(value = "状态 1待入库  2已入库")
    private String putinstorageStateId;
    /**
     * 存储仓库
     * 根据仓库的名称查询仓库的名称
     */
    @ApiModelProperty(value = "存储仓库")
    private String warehouseId;
    /**
     * 总金额
     */
    @ApiModelProperty(value = "总金额")
    private Long totalAmount;

    /**
     * 经办人
     *  根据经办查询经办人
     */
    @ApiModelProperty(value = "经办人")
    private String agentPeople;
    /**
     * 入库日期
     */
    @ApiModelProperty(value = "入库日期")
    private String inboundDate;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    private List<MaterialInfoQuery> materialInfoQueries;

    public String getPutinstorageCode() {
        return putinstorageCode;
    }

    public void setPutinstorageCode(String putinstorageCode) {
        this.putinstorageCode = putinstorageCode;
    }

    public String getPutinstorageStateId() {
        return putinstorageStateId;
    }

    public void setPutinstorageStateId(String putinstorageStateId) {
        this.putinstorageStateId = putinstorageStateId;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getAgentPeople() {
        return agentPeople;
    }

    public void setAgentPeople(String agentPeople) {
        this.agentPeople = agentPeople;
    }

    public String getInboundDate() {
        return inboundDate;
    }

    public void setInboundDate(String inboundDate) {
        this.inboundDate = inboundDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<MaterialInfoQuery> getMaterialInfoQueries() {
        return materialInfoQueries;
    }

    public void setMaterialInfoQueries(List<MaterialInfoQuery> materialInfoQueries) {
        this.materialInfoQueries = materialInfoQueries;
    }
}
