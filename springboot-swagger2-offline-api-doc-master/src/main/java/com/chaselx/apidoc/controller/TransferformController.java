/*
 * Powered By hivescm wms team
 * Web Site: http://www.hivescm.com
 * Since 2017
 */

package com.chaselx.apidoc.controller;

import com.chaselx.apidoc.enty.ResponseEntity;
import com.chaselx.apidoc.enty.TransferFormInfoLogDto;
import com.chaselx.apidoc.enty.TransferformAcDto;
import com.chaselx.apidoc.enty.TransferformDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 资产转移单服务端对外接口说明
 * 
 * @author Administrator
 * @date 2019-3-20
 */
 @Api("资产转移")
public interface TransferformController {

	@ApiOperation("新建资产转移单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "transferformAcDto", value = "添加转移资产", required = true, dataType = "TransferformAcDto", paramType = "body"),
            @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    })
    public ResponseEntity addTransferForm(@RequestBody TransferformAcDto transferformAcDto, HttpServletRequest request);

    @ApiOperation("查询资产转移数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "transferFormInfoLogDto", value = "查询资产转移数据", required = true, dataType = "TransferFormInfoLogDto", paramType = "body"),
            @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    })
    public ResponseEntity<List<TransferformDto>> getTransferform(@RequestBody TransferFormInfoLogDto transferFormInfoLogDto, HttpServletRequest request);

    
    //
    //    public ResponseEntity<?> delete(@RequestBody TransferformDto transferformDto);
    //    @ApiImplicitParam(name = "transferformDto", value = "资产转移单数据传输载体", required = true, dataType = "TransferformDto", paramType = "body")
    //    @ApiOperation("删除数据库中一条资产转移单信息")
    //
    //    public ResponseEntity<?> update(@RequestBody TransferformDto transferformDto);
    //    @ApiImplicitParam(name = "transferformDto", value = "资产转移单数据传输载体", required = true, dataType = "TransferformDto", paramType = "body")
//	@ApiOperation("更新数据库中一条资产转移单信息")


    
}
