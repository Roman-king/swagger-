package com.chaselx.apidoc.controller;


import com.chaselx.apidoc.enty.DepUsertInputDto;
import com.chaselx.apidoc.enty.Departmentuser;
import com.chaselx.apidoc.enty.ResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * 部门对应用户表服务端对外接口说明
 * 
 * @author Administrator
 * @date 2019年3月13日
 */
 @Api("部门人员")
public interface DepartmentuserController {


    @ApiOperation("删除部门人员")
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    ResponseEntity deleteByIds(@RequestBody List<String> userCodeList, HttpServletRequest request);

	@ApiOperation(value="新增部门人员", produces = "application/json")
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    public ResponseEntity add(@RequestBody List<DepUsertInputDto> obj, HttpServletRequest request);

	@ApiOperation(value="更新部门人员", produces = "application/json")
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    public ResponseEntity update(@RequestBody List<DepUsertInputDto> obj, HttpServletRequest request);

    @ApiOperation("查询部门人员列表")
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    ResponseEntity<List<Departmentuser>> getDepartmentUser(@RequestBody String departmentID, HttpServletRequest request);




//    @ApiOperation(value="根据主键获取一条部门用户表信息", produces = "application/json")
//    public ResponseEntity<Departmentuser> getDepartmentuser(@RequestBody Departmentuser departmentuser);

//    @ApiOperation("根据自定义查询条件，获取数据列表(不分页)")
//    @ApiImplicitParam(name = "departmentuser",value = "部门对应用户表查询实体", required = true, dataType = "Departmentuser", paramType = "body")
//    public ResponseEntity<Departmentuser> getList(@RequestBody Departmentuser departmentuser);
//
//    @ApiOperation("根据自定义查询条件，分页获取数据列表")
//    @ApiImplicitParam(name = "departmentuser",value = "部门对应用户表查询实体", required = true, dataType = "Departmentuser", paramType = "body")
//    public ResponseEntity<Departmentuser> getListWithPage(@RequestBody Departmentuser departmentuser);
//
    
    
}
