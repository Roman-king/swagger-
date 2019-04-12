package com.chaselx.apidoc.enty;

import java.io.Serializable;

public class QueryListDto implements Serializable {
    private static final long serialVersionUID = -1553137311578L;
    private AssetRepairInfo assetRepairInfo = new AssetRepairInfo();
    private AssetinfoLoginfo assetinfoLoginfo = new AssetinfoLoginfo();

    public AssetRepairInfo getAssetRepairInfo() {
        return assetRepairInfo;
    }

    public void setAssetRepairInfo(AssetRepairInfo assetRepairInfo) {
        this.assetRepairInfo = assetRepairInfo;
    }

    public AssetinfoLoginfo getAssetinfoLoginfo() {
        return assetinfoLoginfo;
    }

    public void setAssetinfoLoginfo(AssetinfoLoginfo assetinfoLoginfo) {

        this.assetinfoLoginfo = assetinfoLoginfo;
    }
}
