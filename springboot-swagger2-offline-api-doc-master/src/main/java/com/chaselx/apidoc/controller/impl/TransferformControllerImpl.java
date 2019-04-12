/*
 * Powered By hivescm wms team
 * Web Site: http://www.hivescm.com
 * Since 2017
 */

package com.chaselx.apidoc.controller.impl;

import com.chaselx.apidoc.controller.TransferformController;
import com.chaselx.apidoc.enty.ResponseEntity;
import com.chaselx.apidoc.enty.TransferFormInfoLogDto;
import com.chaselx.apidoc.enty.TransferformAcDto;
import com.chaselx.apidoc.enty.TransferformDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 资产转移单的Rest实现
 * 
 * @author Administrator
 * @date 2019-3-20
 */
@RestController
@RequestMapping("/transferform")
public class TransferformControllerImpl  implements TransferformController {

	
    @PostMapping(value="/addTransferForm", produces="application/json")
    public ResponseEntity addTransferForm(@RequestBody TransferformAcDto transferformAcDto, HttpServletRequest request) {

        return null;
    }

    @Override
    @PostMapping(value="/getTransferform", produces="application/json")
    public ResponseEntity<List<TransferformDto>> getTransferform(@RequestBody TransferFormInfoLogDto transferFormInfoLogDto, HttpServletRequest request) {
        //查询转移单信息

        return null;
    }


}
