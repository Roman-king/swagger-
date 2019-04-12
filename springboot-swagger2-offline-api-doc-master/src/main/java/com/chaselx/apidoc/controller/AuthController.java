package com.chaselx.apidoc.controller;

import com.chaselx.apidoc.enty.ResponseEntity;
import com.chaselx.apidoc.enty.TenantsecretDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

@Api("用户授权")
public interface AuthController {
//    @ApiOperation("向数据库添加一条用户信息")
//    @ApiImplicitParam(name = "tenantsecretDto", value = "创建用户", required = true, dataType = "TenantsecretDto", paramType = "body")
//    public ResponseEntity setUser(@RequestBody TenantsecretDto tenantsecretDto);

    //查询用户信息获取tokenId
    @ApiOperation("根据信息获取tokenid")
    @ApiImplicitParam(name = "tenantsecretDto", value = "获取token", required = true, dataType = "TenantsecretDto", paramType = "body")
    public ResponseEntity getTokenId(@RequestBody TenantsecretDto tenantsecretDto);
    //根据生成的token获取用户信息
    @ApiOperation("获取用户信息")
    @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    public ResponseEntity getUserMessage(HttpServletRequest request);

    @ApiOperation("通过ad域用户进行登录")
    @ApiImplicitParam(name = "tenantsecretDto", value = "获取token", required = true, dataType = "TenantsecretDto", paramType = "body")
    public ResponseEntity getAdTokenId(@RequestBody TenantsecretDto tenantsecretDto);
}
