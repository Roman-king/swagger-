package com.chaselx.apidoc.enty;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@ApiModel
public class MaterialOutstockListDto implements Serializable {
    /**
     * 出库日期-----
     */
    @ApiModelProperty(value = "出库日期")
    private Date outStockDate;

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

//    /**
//     * 经办人
//     */
//    private String trustees;
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




    private List<MaterialInfoOutMessage> materialInfoOutQueryList;






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
//
//    public String getTrustees() {
//        return trustees;
//    }
//
//    public void setTrustees(String trustees) {
//        this.trustees = trustees;
//    }

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

    public Date getOutStockDate() {
        return outStockDate;
    }

    public void setOutStockDate(Date outStockDate) {
        this.outStockDate = outStockDate;
    }

    public List<MaterialInfoOutMessage> getMaterialInfoOutQueryList() {
        return materialInfoOutQueryList;
    }

    public void setMaterialInfoOutQueryList(List<MaterialInfoOutMessage> materialInfoOutQueryList) {
        this.materialInfoOutQueryList = materialInfoOutQueryList;
    }

    @Override
    public String toString() {
        return "MaterialOutstockQueryListDto{" +
                ", outStockDate='" + outStockDate + '\'' +
                ", useCompany='" + useCompany + '\'' +
                ", useDepartment='" + useDepartment + '\'' +
                ", usePeople='" + usePeople + '\'' +
              //  ", trustees='" + trustees + '\'' +
                ", warehouseId='" + warehouseId + '\'' +
                ", mark='" + mark + '\'' +
                ", materialInfoOutQueryList=" + materialInfoOutQueryList +
                '}';
    }
}
