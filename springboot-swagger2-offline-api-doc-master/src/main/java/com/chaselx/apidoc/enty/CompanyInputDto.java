package com.chaselx.apidoc.enty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 *  公司管理类
 * </p>
 *
 * @author yanlm
 * @date 2019/03/13
 */
@ApiModel("公司管理类 ")
public class CompanyInputDto implements Serializable {

        private static final long serialVersionUID = -1552445647692L;

        @ApiModelProperty("公司名称，必填")
        private String childName;

        @ApiModelProperty("排序")
        private Integer sort;

        @ApiModelProperty("公司编号，必填")
        private String childCode;


    /**
     * 设置码表名称
     */
    public void setChildName(String value) {
        this.childName = value;
    }
    /**
     * 获取码表名称
     */
    public String getChildName() {
        return this.childName;
    }
    /**
     * 设置排序
     */
    public void setSort(Integer value) {
        this.sort = value;
    }
    /**
     * 获取排序
     */
    public Integer getSort() {
        return this.sort;
    }
    /**
     * 设置编号
     */
    public void setChildCode(String value) {
        this.childCode = value;
    }
    /**
     * 获取编号
     */
    public String getChildCode() {
        return this.childCode;
    }
}
