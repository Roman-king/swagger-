/*
 * Powered By hivescm wms team
 * Web Site: http://www.hivescm.com
 * Since 2017
 */

package com.chaselx.apidoc.enty;

import java.io.Serializable;
import java.util.List;

/**
 * 资产归还单 数据传输类
 * 
 * @author Administrator
 * @date 2019-3-20
 */
public class ReturnformDto extends Returnform implements Serializable{

    private static final long serialVersionUID = -1553061292939L;
	

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
}

