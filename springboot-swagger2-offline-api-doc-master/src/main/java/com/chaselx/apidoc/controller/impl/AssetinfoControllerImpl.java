package com.chaselx.apidoc.controller.impl;


import com.chaselx.apidoc.controller.AssetinfoController;
import com.chaselx.apidoc.enty.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 资产表的Rest实现
 * 
 * @author 锅旭阳
 * @date 2019年3月13日
 */
@RestController
@RequestMapping("/assetinfo")
public class AssetinfoControllerImpl  implements AssetinfoController {
	
    private final static Logger logger = LoggerFactory.getLogger(AssetinfoController.class);

    /**
     * 注入的资产表的Service接口实现
     */

//
//	@Override
//    @PostMapping(value="/add", produces="application/json")
//    public ResponseEntity<Assetinfo> add(@RequestBody List<AssetinfoAddDto> assetinfoAddDto, HttpServletRequest request ) {
//        ResponseEntity<Assetinfo> result = assetinfoService.addAssetInfo(this.getCurrentUser(request),assetinfoAddDto);
//        return result;
//    }
//
//	@Override
//    @PostMapping(value="/update", produces="application/json")
//    public ResponseEntity<Assetinfo> update(@RequestBody AssetinfoAddDto AssetinfoAddDto, HttpServletRequest request ) {
//
//        if(null == AssetinfoAddDto || null == AssetinfoAddDto.getAssetsCoding()||"" == AssetinfoAddDto.getAssetsCoding()){
//            return ResponseEntity.failed(ResultEnum.UPDATE_FAILED_NOT_EXIST);
//        }
//        User user = this.getCurrentUser(request);
//        return  assetinfoService.updateassetinfo(AssetinfoAddDto,user);
//
//    }
//
//	@Override
//    @PostMapping(value="/delete", produces="application/json")
//    public ResponseEntity<String> delete(@RequestBody List<Assetinfo> assetinfoList , HttpServletRequest request ) {
//        if(null == assetinfoList || !(assetinfoList.size()>0)){
//            return ResponseEntity.failed(ResultEnum.UPDATE_FAILED_NOT_EXIST);
//        }
//        User user = this.getCurrentUser(request);
//        ResponseEntity responseEntity = assetinfoService.deleteByAssetsId(assetinfoList,user);
//        return responseEntity;
//    }
    
//	@Override
//    @PostMapping(value="/get", produces="application/json")
//    public ResponseEntity<List<Assetinfo>> getAssetinfo(@RequestBody Assetinfo assetinfo, HttpServletRequest request) {
//        User user = this.getCurrentUser(request);
//        String tenantId = user.getTenantId();
//        assetinfo.setTenantId(tenantId);
//		List<Assetinfo> result = assetinfoService.findList(assetinfo);
//		if(result == null){
//            return ResponseEntity.failed(ResultEnum.INFORMATION_NOT_EXIST);
//		}
//		return ResponseEntity.ok(result);
//    }
//
//    @GetMapping(value = "/getAssetinfoById/{assetsId}",produces = "application/json")
//    @Override
//    public ResponseEntity<AssetinfoQueryDto> getAssetinfoById(@PathVariable("assetsId") String assetsId) {
//        //查询数据
//        AssetinfoQueryDto assetinfo =  assetinfoService.getAssetinfoById(assetsId);
//        return  ResponseEntity.ok(assetinfo);
//    }
    @PostMapping(value = "getAssetinfoList",produces = "application/json")
    @Override
    public ResponseEntity<List<AssetinfoQueryDto>> getAssetinfoList(@RequestBody(required = false) AssetinfoParam assetinfoParam, HttpServletRequest request) {


        return null;
    }
    @PostMapping(value = "updateAssetinfos",produces = "application/json")
    @Override
    public ResponseEntity updateAssetinfos(@RequestBody List<AssetinfoUpDateDto> assetinfoUpDateDtos, HttpServletRequest request) {


        return null;
    }

    @Override
    @PostMapping(value = "deleteAssetinfoByCodings",produces = "application/json")
    public ResponseEntity deleteAssetinfoByCodings(@RequestBody List<DeleteAssetinfo> AssetsCodings, HttpServletRequest request) {

        return ResponseEntity.failed("参数错误");
    }

    @Override
    @PostMapping(value = "assetinfoputIn",produces = "application/json")
    public ResponseEntity assetinfoputIn(@RequestBody List<AssetinfoUpDateDto> assetinfoUpDateDtos, HttpServletRequest request) {
        return null;
    }


    /**
     * @Description: entity转dto
     * @Title: entityToDto
     * @author 锅旭阳
     * @date 2019年3月13日
     * @param entity
     * @param dto
     * @return: void
     */






}
