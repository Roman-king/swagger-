package com.chaselx.apidoc.enty;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * ClassName${Name}
 * Package:com.uitech.asset.api.assClenform.dto
 * Description:
 *
 * @data:2019/4/11 14:29
 * @outhor:yaoyuan
 */
public class CleanformAcDto implements Serializable {

    private static final long serialVersionUID = -1553068716078L;

    /**
     * 清理时间
     */
    @ApiModelProperty(value = "清理日期,必填")
    @NotBlank(message = "cleanDate不能为空")
    @JsonFormat(locale = "zh",timezone = "GMT+8",pattern="yyyy-MM-dd")
    private Date cleanDate;


    /**
     * 清理原因
     */
    @ApiModelProperty(value = "清理原因,必填")
    @NotBlank(message = "cleanReasons不能为空")
    private String cleanReasons;

    /**
     * 清理人
     */

    @ApiModelProperty(value = "清理人,必填")
    @NotBlank(message = "createName清理人不能为空")
    private String createName;

    /**
     *  资产编码集合
     */
    @ApiModelProperty(value = "资产编码必填,多个资产请用逗号隔开")
    @NotBlank(message = "assetsIds资产编码不能为空")
    private List<String> assetsIds;

    public Date getCleanDate() {
        return cleanDate;
    }

    public void setCleanDate(Date cleanDate) {
        this.cleanDate = cleanDate;
    }

    public String getCleanReasons() {
        return cleanReasons;
    }

    public void setCleanReasons(String cleanReasons) {
        this.cleanReasons = cleanReasons;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public List<String> getAssetsIds() {
        return assetsIds;
    }

    public void setAssetsIds(List<String> assetsIds) {
        this.assetsIds = assetsIds;
    }
}
