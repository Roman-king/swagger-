package com.chaselx.apidoc.enty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class DeleteAssetinfo {
    @ApiModelProperty(value = "资产编码")
    private String assetsCoding;

    public String getAssetsCoding() {
        return assetsCoding;
    }

    public void setAssetsCoding(String assetsCoding) {
        this.assetsCoding = assetsCoding;
    }
}
