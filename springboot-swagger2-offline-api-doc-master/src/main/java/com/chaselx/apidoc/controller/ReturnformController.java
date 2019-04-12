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
 * 资产归还单服务端对外接口说明
 *
 * @author Administrator
 * @date 2019-3-20
 */
@Api("资产退库")
public interface ReturnformController {

    @ApiOperation("新增资产退库单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "returnformAcDto", value = "资产归还单数据传输载体", required = true, dataType = "ReturnformAcDto", paramType = "body"),
            @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    })
    public ResponseEntity addReturnform(@RequestBody ReturnformAcDto returnformAcDto, HttpServletRequest request);

    @ApiOperation("查询资产退库数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "returnListDto", value = "资产归还单数据传输载体", required = true, dataType = "QueryReturnListDto", paramType = "body"),
            @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    })
    public ResponseEntity<List<ReturnformVo>> getReturnform(@RequestBody QueryReturnListDto returnListDto, HttpServletRequest request);

}
