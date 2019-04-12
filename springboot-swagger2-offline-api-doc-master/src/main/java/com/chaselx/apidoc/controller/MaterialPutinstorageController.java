package com.chaselx.apidoc.controller;

import com.chaselx.apidoc.enty.InToMaterial;
import com.chaselx.apidoc.enty.JiShiKuCun;
import com.chaselx.apidoc.enty.MaterialPutinstorageQuery;
import com.chaselx.apidoc.enty.ResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 和入库相关的代码
 */
@Api("耗材入库")
public interface MaterialPutinstorageController {
    /**
     * 查询所有
     */
 @ApiOperation("查询入库单")
 @ApiImplicitParam(name = "Authorization" ,value = "查询入库单",required = true, paramType="header")
public ResponseEntity<List<MaterialPutinstorageQuery>> getAllaterialPutinstorage(HttpServletRequest request);
 @ApiOperation("新建入库单")
 @ApiImplicitParams({
   @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header"),
   @ApiImplicitParam(name = "toMaterials" ,value = "添加入库单",required = true,dataType = "InToMaterial", paramType="body")
 })
public ResponseEntity addMaterial(HttpServletRequest request, @RequestBody List<InToMaterial> toMaterials);

 @ApiOperation("及时库存查询")
 @ApiImplicitParams({
 @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
 })
public ResponseEntity<List<JiShiKuCun>> getJiShi(HttpServletRequest request);

}
