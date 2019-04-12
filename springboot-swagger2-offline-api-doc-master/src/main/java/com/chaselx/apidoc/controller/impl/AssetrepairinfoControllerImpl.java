package com.chaselx.apidoc.controller.impl;


import com.chaselx.apidoc.controller.AssetRepairInfoController;
import com.chaselx.apidoc.enty.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * 资产维修单的Rest实现
 * 
 * @author 锅旭阳
 * @date 2019年3月21日
 */
@RestController
@RequestMapping("/assetrepairinfo")
public class AssetrepairinfoControllerImpl implements AssetRepairInfoController {
	

	@Override
    @PostMapping(value="/addAssetRepairInfo", produces="application/json")
    public ResponseEntity addAssetRepairInfo(@RequestBody AssetRepairInfoAcDto assetRepairInfoAcDto, HttpServletRequest request) {

            return null;
    }


    @Override
    @PostMapping(value="/getList", produces="application/json")
    public ResponseEntity<List<AssetRepairInfoDto>> getList(@RequestBody QueryListDto queryListDto, HttpServletRequest request) {
        // TODO query solr

        return null;
    }



    }
    
    
    
    
    
    
