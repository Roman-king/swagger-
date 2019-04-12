package com.chaselx.apidoc.enty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel
public class MaterialOutstockQueryListDto {

    /**
     * 出库单号-----
     */
    @ApiModelProperty(value = "出库单号")
    private String outStockCode;
    /**
     * 出库日期-----
     */
    @ApiModelProperty(value = "出库日期")
    private String outStockDate;
    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private String stockState;
    /**
     * 领用公司
     */
    @ApiModelProperty(value = "领用公司")
    private String useCompany;
    /**
     * 领用部门
     */
    @ApiModelProperty(value = "领用部门")
    private String useDepartment;
    /**
     * 领用人
     */
    @ApiModelProperty(value = "领用人")
    private String usePeople;

    /**
     * 经办人
     */
    @ApiModelProperty(value = "经办人")
    private String trustees;
    /**
     * 仓库ID
     */
    @ApiModelProperty(value = "仓库ID")
    private String warehouseId;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String mark;


    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    private List<MaterialInfoOutQuery> materialInfoOutQueryList;

    public String getOutStockCode() {
        return outStockCode;
    }

    public void setOutStockCode(String outStockCode) {
        this.outStockCode = outStockCode;
    }

    public String getOutStockDate() {
        return outStockDate;
    }

    public void setOutStockDate(String outStockDate) {
        this.outStockDate = outStockDate;
    }

    public String getStockState() {
        return stockState;
    }

    public void setStockState(String stockState) {
        this.stockState = stockState;
    }

    public String getUseCompany() {
        return useCompany;
    }

    public void setUseCompany(String useCompany) {
        this.useCompany = useCompany;
    }

    public String getUseDepartment() {
        return useDepartment;
    }

    public void setUseDepartment(String useDepartment) {
        this.useDepartment = useDepartment;
    }

    public String getUsePeople() {
        return usePeople;
    }

    public void setUsePeople(String usePeople) {
        this.usePeople = usePeople;
    }

    public String getTrustees() {
        return trustees;
    }

    public void setTrustees(String trustees) {
        this.trustees = trustees;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }




    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<MaterialInfoOutQuery> getMaterialInfoOutQueryList() {
        return materialInfoOutQueryList;
    }

    public void setMaterialInfoOutQueryList(List<MaterialInfoOutQuery> materialInfoOutQueryList) {
        this.materialInfoOutQueryList = materialInfoOutQueryList;
    }

    @Override
    public String toString() {
        return "MaterialOutstockQueryListDto{" +
                "outStockCode='" + outStockCode + '\'' +
                ", outStockDate='" + outStockDate + '\'' +
                ", stockState='" + stockState + '\'' +
                ", useCompany='" + useCompany + '\'' +
                ", useDepartment='" + useDepartment + '\'' +
                ", usePeople='" + usePeople + '\'' +
                ", trustees='" + trustees + '\'' +
                ", warehouseId='" + warehouseId + '\'' +
                ", mark='" + mark + '\'' +
                ", createDate=" + createDate +
                ", materialInfoOutQueryList=" + materialInfoOutQueryList +
                '}';
    }
}
