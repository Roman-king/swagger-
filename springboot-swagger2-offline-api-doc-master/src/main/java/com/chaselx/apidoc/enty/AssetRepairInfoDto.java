package com.chaselx.apidoc.enty;

import java.io.Serializable;
import java.util.List;

/**
 * 资产维修单 数据传输类
 * 
 * @author 锅旭阳
 * @date 2019年3月21日
 */
public class AssetRepairInfoDto extends AssetRepairInfo implements Serializable{

    private static final long serialVersionUID = -1553137311578L;

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

