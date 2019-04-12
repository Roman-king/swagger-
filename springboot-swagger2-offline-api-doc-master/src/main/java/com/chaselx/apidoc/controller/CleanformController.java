/*
 * Powered By hivescm wms team
 * Web Site: http://www.hivescm.com
 * Since 2017
 */

package com.chaselx.apidoc.controller;

import com.chaselx.apidoc.enty.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 资产清理单服务端对外接口说明
 * 
 * @author yaoyuan
 * @date 2019-3-20
 */
 @Api("清理报废")
public interface CleanformController {

	@ApiOperation("新增资产清理单")
    @ApiImplicitParam(name = "cleanformAcDto",  required = true, dataType = "CleanformAcDto", paramType = "body")
    public ResponseEntity<Cleanform> add(@RequestBody CleanformAcDto cleanformAcDto, HttpServletRequest request);

    @ApiOperation("查询资产清理数据")
    @ApiImplicitParam(name = "QueryCleanformListDto",value = "查询报废清理列表", required = false, dataType = "QueryCleanformListDto", paramType = "body")
    public ResponseEntity<?> getCleanform(@RequestBody QueryCleanformListDto queryCleanformListDto, HttpServletRequest request);

}
