package com.chaselx.apidoc.enty;

import java.io.Serializable;
import java.util.List;

/**
 * 资产领用单 数据传输类
 * 
 * @author Administrator
 * @date 2019年3月13日
 */
public class AcceptanceformDto extends Acceptanceform implements Serializable{

    private static final long serialVersionUID = -15524426109174L;



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

