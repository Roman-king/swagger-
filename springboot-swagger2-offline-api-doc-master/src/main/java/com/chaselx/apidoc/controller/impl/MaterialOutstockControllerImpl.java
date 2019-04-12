package com.chaselx.apidoc.controller.impl;

import com.chaselx.apidoc.controller.MaterialOutstockController;
import com.chaselx.apidoc.enty.MaterialOutstockListDto;
import com.chaselx.apidoc.enty.MaterialOutstockQueryListDto;
import com.chaselx.apidoc.enty.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("outstock")
public class MaterialOutstockControllerImpl implements MaterialOutstockController {


    @Override
    @PostMapping(value = "getAllMaterialOutstock" ,produces = "application/json")
    public ResponseEntity<List<MaterialOutstockQueryListDto>> getAllMaterialOutstock(HttpServletRequest request) {
        //封装要返回的数据实体类
        return null;
    }

    @Override
    @PostMapping(value = "addMaterialOutstock",produces = "application/json")
    public ResponseEntity addMaterialOutstock(@RequestBody MaterialOutstockListDto materialOutstockQueryListDtos, HttpServletRequest request) throws  Exception {

        return null;
    }
}
