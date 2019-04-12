/*
 * Powered By hivescm wms team
 * Web Site: http://www.hivescm.com
 * Since 2017
 */

package com.chaselx.apidoc.enty;


import java.io.Serializable;
import java.util.List;

/**
 * 资产转移单 数据传输类
 * 
 * @author Administrator
 * @date 2019-3-20
 */
public class TransferformDto extends Transferform implements Serializable{

    private static final long serialVersionUID = -15530612145242L;

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
	private List<AssetinfoLoginfo> loginfoList;

	public List<AssetinfoLoginfo> getLoginfoList() {
		return loginfoList;
	}

	public void setLoginfoList(List<AssetinfoLoginfo> loginfoList) {

		this.loginfoList = loginfoList;
	}
}

