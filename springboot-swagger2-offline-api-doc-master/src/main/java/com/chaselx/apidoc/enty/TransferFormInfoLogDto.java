package com.chaselx.apidoc.enty;


import java.io.Serializable;

public class TransferFormInfoLogDto implements Serializable {
    private Transferform transferform = new Transferform();
    private AssetinfoLoginfo assetinfoLoginfo = new AssetinfoLoginfo();

    public Transferform getTransferform() {
        return transferform;
    }

    public void setTransferform(Transferform transferform) {
        this.transferform = transferform;
    }

    public AssetinfoLoginfo getAssetinfoLoginfo() {
        return assetinfoLoginfo;
    }

    public void setAssetinfoLoginfo(AssetinfoLoginfo assetinfoLoginfo) {
        this.assetinfoLoginfo = assetinfoLoginfo;

    }
}
