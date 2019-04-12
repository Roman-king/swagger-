package com.chaselx.apidoc.controller;


import com.chaselx.apidoc.enty.CodetableValue;
import com.chaselx.apidoc.enty.CompanyInputDto;
import com.chaselx.apidoc.enty.DeptInputDto;
import com.chaselx.apidoc.enty.ResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * 资产码表子表服务端对外接口说明
 * 
 * @author Administrator
 * @date 2019年3月13日
 */
 @Api("组织架构")
public interface CodetableValueController {


    @ApiOperation(value="新增公司", produces = "application/json")
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    ResponseEntity addCompany(@RequestBody List<CompanyInputDto> obj, HttpServletRequest request);


    @ApiOperation(value="新增部门", produces = "application/json")
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    ResponseEntity addDepartment(@RequestBody List<DeptInputDto> obj, HttpServletRequest request);


    @ApiOperation(value="修改部门", produces = "application/json")
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    ResponseEntity updateDepartment(@RequestBody List<DeptInputDto> obj, HttpServletRequest request);


    @ApiOperation("删除部门")
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    ResponseEntity deleteDepartment(@RequestBody List<String> childCodelist, HttpServletRequest request);


    @ApiOperation("查询部门列表")
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    ResponseEntity<List<CodetableValue>> getCodetableValue(@RequestBody String parentChildID, HttpServletRequest request);





//	@ApiOperation("向数据库插入一条资产码表子表信息")
//    @ApiImplicitParam(name = "codetableValue", value = "资产码表子表数据传输载体", required = true, dataType = "CodetableValueDto", paramType = "body")
//    public ResponseEntity<CodetableValue> add(@RequestBody CodetableValue codetableValue);
//
//	@ApiOperation("更新数据库中一条资产码表子表信息")
//    @ApiImplicitParam(name = "codetableValue", value = "资产码表子表数据传输载体", required = true, dataType = "CodetableValue", paramType = "body")
//    public ResponseEntity<CodetableValue> update(@RequestBody CodetableValue codetableValue);

//    @ApiOperation("根据主键获取一条资产码表子表信息")
//    @ApiImplicitParam(name = "codetableValue", value = "资产码表子表数据传输载体", required = true, dataType = "CodetableValue", paramType = "body")
//    public ResponseEntity<CodetableValue> getCodetableValue(@RequestBody CodetableValue codetableValue);

//    @ApiOperation("根据自定义查询条件，获取数据列表(不分页)")
//    @ApiImplicitParam(name = "codetableValue",value = "资产码表子表查询实体", required = true, dataType = "CodetableValue", paramType = "body")
//    public ResponseEntity<CodetableValue> getList(@RequestBody CodetableValue codetableValue);
//
//    @ApiOperation("根据自定义查询条件，分页获取数据列表")
//    @ApiImplicitParam(name = "codetableValue",value = "资产码表子表查询实体", required = true, dataType = "CodetableValue", paramType = "body")
//    public ResponseEntity<CodetableValue> getListWithPage(@RequestBody CodetableValue codetableValue);





}
