package com.chaselx.apidoc.controller.impl;

import com.chaselx.apidoc.controller.ReturnformController;
import com.chaselx.apidoc.enty.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 资产归还单的Rest实现
 *
 * @author Administrator
 * @date 2019-3-20
 */
@RestController
@RequestMapping("/returnform")
public class ReturnformControllerImpl implements ReturnformController {


    @Override
    @PostMapping(value="/addReturnform", produces="application/json")
    public ResponseEntity addReturnform(@RequestBody ReturnformAcDto returnformAcDto, HttpServletRequest request) {


        return null;


    }

    /*查询退库单*/
    @Override
    @PostMapping(value="/getReturnform", produces="application/json")
    public ResponseEntity<List<ReturnformVo>> getReturnform(@RequestBody QueryReturnListDto returnListDto, HttpServletRequest request) {

          return null;

    }
    




}
