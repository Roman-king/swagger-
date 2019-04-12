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
 * 资产维修单服务端对外接口说明
 * 
 * @author 锅旭阳
 * @date 2019年3月21日
 */
 @Api("资产维修")
public interface AssetRepairInfoController {

	@ApiOperation("新增资产维修单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "assetRepairInfoAcDto", value = "资产维修单数据传输载体", required = true, dataType = "AssetRepairInfoAcDto", paramType = "body"),
            @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    })
    public ResponseEntity addAssetRepairInfo(@RequestBody AssetRepairInfoAcDto assetRepairInfoAcDto, HttpServletRequest request);

    @ApiOperation("查询资产维修数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "queryListDto",value = "资产维修单查询实体", required = true, dataType = "QueryListDto", paramType = "body"),
            @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    })
    public ResponseEntity<List<AssetRepairInfoDto>> getList(@RequestBody QueryListDto queryListDto, HttpServletRequest request);



    
    
}
