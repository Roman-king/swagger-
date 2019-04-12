package com.chaselx.apidoc.enty;

import java.io.Serializable;

public class QueryReturnListDto implements Serializable {
    private static final long serialVersionUID = -15531373115768L;

    private Returnform returnform = new Returnform();
    private AssetinfoLoginfo assetinfoLoginfo = new AssetinfoLoginfo();

    public Returnform getReturnform() {
        return returnform;
    }

    public void setReturnform(Returnform returnform) {
        this.returnform = returnform;
    }

    public AssetinfoLoginfo getAssetinfoLoginfo() {
        return assetinfoLoginfo;
    }

    public void setAssetinfoLoginfo(AssetinfoLoginfo assetinfoLoginfo) {

        this.assetinfoLoginfo = assetinfoLoginfo;
    }


}
