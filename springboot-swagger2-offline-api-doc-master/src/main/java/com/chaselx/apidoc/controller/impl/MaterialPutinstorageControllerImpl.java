package com.chaselx.apidoc.controller.impl;

import com.chaselx.apidoc.controller.MaterialPutinstorageController;
import com.chaselx.apidoc.enty.InToMaterial;
import com.chaselx.apidoc.enty.JiShiKuCun;
import com.chaselx.apidoc.enty.MaterialPutinstorageQuery;
import com.chaselx.apidoc.enty.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/materia")
public class MaterialPutinstorageControllerImpl  implements MaterialPutinstorageController {

    @Override
    @PostMapping(value = "getInputOrder",produces = "application/json")
    public ResponseEntity<List<MaterialPutinstorageQuery>> getAllaterialPutinstorage(HttpServletRequest request) {


        return null;
    }
    @PostMapping(value = "addMaterial",produces = "application/json")
    @Override
    public ResponseEntity addMaterial(HttpServletRequest request, @RequestBody List<InToMaterial> toMaterials) {

        return null;
    }

    @Override
    @PostMapping(value = "getJiShi",produces = "application/json")
    public ResponseEntity<List<JiShiKuCun>> getJiShi(HttpServletRequest request) {

        return null;
    }
}
