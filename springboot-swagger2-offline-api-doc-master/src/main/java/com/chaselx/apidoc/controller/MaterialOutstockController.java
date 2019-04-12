package com.chaselx.apidoc.controller;

import com.chaselx.apidoc.enty.MaterialOutstockListDto;
import com.chaselx.apidoc.enty.MaterialOutstockQueryListDto;
import com.chaselx.apidoc.enty.ResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 出库相关的东西
 */
@Api("耗材出库")
public interface MaterialOutstockController {
    @ApiOperation("查询出库单")
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    public ResponseEntity<List<MaterialOutstockQueryListDto>> getAllMaterialOutstock(HttpServletRequest request);
    @ApiOperation("新建出库单")
    @ApiImplicitParams({
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header"),
    @ApiImplicitParam(name = "materialOutstockQueryListDtos" ,value = "新建出库单",required = true,dataType = "MaterialOutstockListDto", paramType="body")
    })
    public ResponseEntity addMaterialOutstock(@RequestBody MaterialOutstockListDto materialOutstockQueryListDtos, HttpServletRequest request) throws  Exception;
}
