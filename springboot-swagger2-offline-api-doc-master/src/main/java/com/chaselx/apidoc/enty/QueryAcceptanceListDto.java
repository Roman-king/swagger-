package com.chaselx.apidoc.enty;


import java.io.Serializable;

public class QueryAcceptanceListDto implements Serializable {
    private static final long serialVersionUID = -15531373115768L;

    private Acceptanceform acceptanceform = new Acceptanceform();
    private AssetinfoLoginfo assetinfoLoginfo = new AssetinfoLoginfo();

    public Acceptanceform getAcceptanceform() {
        return acceptanceform;
    }

    public void setAcceptanceform(Acceptanceform acceptanceform) {
        this.acceptanceform = acceptanceform;
    }

    public AssetinfoLoginfo getAssetinfoLoginfo() {
        return assetinfoLoginfo;
    }

    public void setAssetinfoLoginfo(AssetinfoLoginfo assetinfoLoginfo) {

        this.assetinfoLoginfo = assetinfoLoginfo;
    }


}
