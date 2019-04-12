package com.chaselx.apidoc.controller.impl;

import com.chaselx.apidoc.enty.ResponseEntity;
import com.chaselx.apidoc.enty.TenantsecretDto;
import com.chaselx.apidoc.controller.AuthController;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api("用户授权")
@RestController
@RequestMapping("auth")
public class AuthControllerImpl implements AuthController {

//    @Override
//    @PostMapping("setUser")
//    public ResponseEntity setUser(@RequestBody@Validated TenantsecretDto tenantsecretDto) {
//       //分析   1 先根据传递过来的tid 查看在数据库里面是不是有这个id 如果有则进行加密
//        return authService.setUser(tenantsecretDto);
//    }

    @Override
    @PostMapping("getTokenId")
    public ResponseEntity getTokenId(@RequestBody @Validated TenantsecretDto tenantsecretDto) {
        //登录换取tokenId
        //1 先查询  查询出结果
        //在换取用户信息

        return ResponseEntity.ok("");
    }

    @Override
    @PostMapping("getUserMessage")
    public ResponseEntity getUserMessage(HttpServletRequest request) {
       // tokenid = "eyJhbGciOiJIUzUxMiJ9.eyJleHAiOjE1NTQzNTU3MjAsImlhdCI6MTU1NDI2OTMyMCwiQ29tcGFueUlEIjoiMjhiMzAwN2MtZWVlNy00NmExLTg2ODctODExZWNmZTgyYjY5IiwiVGVuYW50SUQiOiJlMjkzYmE0Yi1jOTFjLTQ5ODItODQ3NS05MmQxYWIxZTc1NGYiLCJVc2VyTmFtZSI6IjEzNTIyODUzNjc3IiwiQ29tcGFueU5hbWUiOiJsY3J4In0.ZZxmEPvQUP9__gAeq5Bk48ax6OkVNC7cc4U6mELMLpmdni5PBshsWgWslKTHi70yQLRreCm51UkXmCNsl6Yarw";
        return ResponseEntity.ok();
    }

    @Override
    @PostMapping("getAdTokenId")
    public ResponseEntity getAdTokenId(@RequestBody@Validated TenantsecretDto tenantsecretDto) {
        return ResponseEntity.ok();
    }
}
