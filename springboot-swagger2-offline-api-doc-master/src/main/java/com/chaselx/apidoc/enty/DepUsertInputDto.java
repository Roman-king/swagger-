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
@ApiModel("部门人员管理类 ")
public class DepUsertInputDto implements Serializable {

    private static final long serialVersionUID = -1552445647693L;

    @ApiModelProperty("所属部门,必填")
    private String departmentId;

    @ApiModelProperty("人员名称,必填")
    private String userName;

    @ApiModelProperty("人员编号,必填")
    private String userCode;

    @ApiModelProperty("人员手机号")
    private String userPhone;

    @ApiModelProperty("人员邮件")
    private String userEmail;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
