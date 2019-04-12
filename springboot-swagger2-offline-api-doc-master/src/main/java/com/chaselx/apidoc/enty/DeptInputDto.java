package com.chaselx.apidoc.enty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 新增部门信息
 * </p>
 *
 * @author yanlm
 * @date 2019/03/13
 */
@ApiModel("部门管理类 ")
public class DeptInputDto implements Serializable {

    private static final long serialVersionUID = -1552445647692L;

    @ApiModelProperty("部门名称，必填")
    private String childName;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("部门编号，必填")
    private String childCode;

    @ApiModelProperty("所属部门")
    private String parentDeptId;

    @ApiModelProperty("所属公司，必填")
    private String parentCompanyId;


    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getChildCode() {
        return childCode;
    }

    public void setChildCode(String childCode) {
        this.childCode = childCode;
    }

    public String getParentDeptId() {
        return parentDeptId;
    }

    public void setParentDeptId(String parentDeptId) {
        this.parentDeptId = parentDeptId;
    }

    public String getParentCompanyId() {
        return parentCompanyId;
    }

    public void setParentCompanyId(String parentCompanyId) {
        this.parentCompanyId = parentCompanyId;
    }
}
