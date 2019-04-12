package com.chaselx.apidoc.controller;


import com.chaselx.apidoc.enty.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * 资产表服务端对外接口说明
 * 
 * @author 锅旭阳
 * @date 2019年3月13日
 */
 @Api("资产入库")
public interface AssetinfoController {

//	@ApiOperation("添加资产")
//    @ApiImplicitParam(name = "assetinfoAddDto", value = "资产数据传输载体", required = true, dataType = "Assetinfo", paramType = "body")
//    public ResponseEntity<Assetinfo> add(@RequestBody List<AssetinfoAddDto> assetinfoAddDto, HttpServletRequest request);
//
//	@ApiOperation("修改资产")
//    @ApiImplicitParam(name = "AssetinfoAddDto", value = "资产表数据传输载体", required = true, dataType = "AssetinfoAddDto", paramType = "body")
//    public ResponseEntity<Assetinfo> update(@RequestBody AssetinfoAddDto assetinfo, HttpServletRequest request);
//
//    @ApiOperation("删除资产")
//    @ApiImplicitParam(name = "assetinfoList", value = "资产表数据传输载体", required = true, dataType = "List<Assetinfo>", paramType = "body")
//    public ResponseEntity<String> delete(@RequestBody List<Assetinfo> assetinfoList, HttpServletRequest request);
//
//    @ApiOperation("根据主键获取一条资产表信息")
//    @ApiImplicitParam(name = "assetinfo", value = "资产表数据传输载体", required = true, dataType = "Assetinfo", paramType = "body")
//    public ResponseEntity<List<Assetinfo>> getAssetinfo(@RequestBody Assetinfo assetinfo, HttpServletRequest request);
//
//    /**
//     * 根据资产编码查询资产信息
//     */
//    @ApiOperation("根据产id获取数据")
//    @ApiImplicitParam(name = "assetsId" ,value = "资产编码",required = true,dataType = "String", paramType="path")
//    public ResponseEntity<AssetinfoQueryDto> getAssetinfoById(@PathVariable("assetsId") String assetsId);
    /**
     * 查询当前用户的列表信息
     */
    @ApiOperation("资产查询列表")
    @ApiImplicitParams({
    @ApiImplicitParam(name = "assetinfoParam" ,value = "资产查询列表",required = false,dataType = "AssetinfoParam", paramType="body"),
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    })
    public ResponseEntity<List<AssetinfoQueryDto>> getAssetinfoList(@RequestBody AssetinfoParam assetinfoParam, HttpServletRequest request);
    /**
     * 修改资产信息
     */
    @ApiOperation("修改资产信息")
    @ApiImplicitParams({
    @ApiImplicitParam(name = "assetinfoUpDateDtos" ,value = "资产修改表",required = true,dataType = "AssetinfoUpDateDto", paramType="body"),
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    })
    public ResponseEntity updateAssetinfos(@RequestBody List<AssetinfoUpDateDto> assetinfoUpDateDtos, HttpServletRequest request);

    /**
     * 删除资产信息
     * 只需要传递资产的编码即可
     */
    @ApiOperation("批量删除资产")
    @ApiImplicitParams({
    @ApiImplicitParam(name = "AssetsCodings" ,value = "批量删除资产信息",required = true,dataType = "DeleteAssetinfo", paramType="body"),
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    })
    public ResponseEntity deleteAssetinfoByCodings(@RequestBody List<DeleteAssetinfo> AssetsCodings, HttpServletRequest request);
    /**
     *  资产入库
     */
    @ApiOperation("资产批量入库")
    @ApiImplicitParams({
    @ApiImplicitParam(name = "assetinfoUpDateDtos" ,value = "资产修改表",required = true,dataType = "AssetinfoUpDateDto", paramType="body"),
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    })
    public ResponseEntity assetinfoputIn(@RequestBody List<AssetinfoUpDateDto> assetinfoUpDateDtos, HttpServletRequest request);
}
