/*
 * Powered By hivescm wms team
 * Web Site: http://www.hivescm.com
 * Since 2017
 */

package com.chaselx.apidoc.enty;

import java.io.Serializable;


/**
 * 资产清理单 查询bean
 * 
 * @author Administrator
 * @date 2019-3-22
 */
public class QueryCleanformListDto implements Serializable {

    private static final long serialVersionUID = -1553346538428L;
    
	private Cleanform cleanform =new Cleanform();

	private AssetinfoLoginfo assetinfoLoginfo = new AssetinfoLoginfo();


	public Cleanform getCleanform() {
		return cleanform;
	}

	public void setCleanform(Cleanform cleanform) {
		this.cleanform = cleanform;
	}

	public AssetinfoLoginfo getAssetinfoLoginfo() {
		return assetinfoLoginfo;
	}

	public void setAssetinfoLoginfo(AssetinfoLoginfo assetinfoLoginfo) {
		this.assetinfoLoginfo = assetinfoLoginfo;
	}

}

