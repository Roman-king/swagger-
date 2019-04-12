/*
 * Powered By hivescm wms team
 * Web Site: http://www.hivescm.com
 * Since 2017
 */

package com.chaselx.apidoc.controller.impl;

import com.chaselx.apidoc.controller.CleanformController;
import com.chaselx.apidoc.enty.CleanformAcDto;
import com.chaselx.apidoc.enty.CleanformDto;
import com.chaselx.apidoc.enty.QueryCleanformListDto;
import com.chaselx.apidoc.enty.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 资产清理单的Rest实现
 * 
 * @author yaoyuan
 * @date 2019-3-20
 */
@RestController
@RequestMapping("/cleanform")
public class CleanformControllerImpl  implements CleanformController {


    /**
     *
     *
     *
     * @param request
     * @return 新增资产报废
     */

    @PostMapping(value="/add", produces="application/json")
    @Override
    public ResponseEntity add(@RequestBody CleanformAcDto cleanformAcDto , HttpServletRequest request) {

        return null;
    }

    /**
     *
     * @param
     * @param request
     * @return 根据用户自定义条件查询清理列表，如果有条件则按照条件查询，如果没有查询当前公司归属下的所有清理列表
     */
    @PostMapping(value = "/getList",produces = "application/json")
    @Override
    public ResponseEntity<?> getCleanform(@RequestBody(required = false) QueryCleanformListDto queryCleanformListDto, HttpServletRequest request) {
        //根据当前登录信息获取到用户的信息列表
        return null;
    }
    

}
