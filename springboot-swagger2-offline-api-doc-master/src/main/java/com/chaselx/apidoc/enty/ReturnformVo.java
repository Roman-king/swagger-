/*
 * Powered By hivescm wms team
 * Web Site: http://www.hivescm.com
 * Since 2017
 */

package com.chaselx.apidoc.enty;


import java.io.Serializable;
import java.util.List;

/**
 * 退库单详情
 * 
 * @author Administrator
 * @date 2019-3-20
 */
public class ReturnformVo extends Returnform implements Serializable {

    private static final long serialVersionUID = -15530612928091L;

	/**
	 * 资产编码ids
	 */
	private List<String> assetsCoding;

	public List<String> getAssetsCoding() {
		return assetsCoding;
	}

	public void setAssetsCoding(List<String> assetsCoding) {
		this.assetsCoding = assetsCoding;
	}

	/**
	 * 资产日志
	 */
	private List<AssetinfoLoginfo> assetinfoLoginfoList;

	public List<AssetinfoLoginfo> getAssetinfoLoginfoList() {
		return assetinfoLoginfoList;
	}

	public void setAssetinfoLoginfoList(List<AssetinfoLoginfo> assetinfoLoginfoList) {
		this.assetinfoLoginfoList = assetinfoLoginfoList;
	}

}

