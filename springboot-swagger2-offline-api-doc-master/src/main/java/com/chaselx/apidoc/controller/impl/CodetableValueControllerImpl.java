package com.chaselx.apidoc.controller.impl;


import com.chaselx.apidoc.controller.CodetableValueController;
import com.chaselx.apidoc.enty.CodetableValue;
import com.chaselx.apidoc.enty.CompanyInputDto;
import com.chaselx.apidoc.enty.DeptInputDto;
import com.chaselx.apidoc.enty.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 资产码表子表的Rest实现
 * 
 * @author Administrator
 * @date 2019年3月13日
 */
@RestController
@RequestMapping("/codetablevalue")
public class CodetableValueControllerImpl  implements CodetableValueController {
	





    /** 添加公司 **/
    @Override
    @PostMapping(value="/addcompany", produces="application/json")
    public ResponseEntity addCompany(@RequestBody List<CompanyInputDto> obj, HttpServletRequest request) {

        return null;
    }



    /** 新增部门
     * 部门名称不能为空，
     * 所属公司不能为空
     * **/
    @Override
    @PostMapping(value="/adddepartment", produces="application/json")
    public ResponseEntity addDepartment(@RequestBody List<DeptInputDto> obj, HttpServletRequest request){


        return null;
    }


    /**
     * 修改部门
     */
    @Override
    @PostMapping(value="/updatedepartment", produces="application/json")
   public  ResponseEntity updateDepartment(@RequestBody List<DeptInputDto> obj, HttpServletRequest request){


        return null;
    }


    /** 删除部门或者公司 **/
    @Override
    @PostMapping(value="/delete", produces="application/json")
    public ResponseEntity deleteDepartment(@RequestBody List<String> childCodelist, HttpServletRequest request) {
//    	if(StringUtils.isEmpty(id)){
//    	    return ResponseEntity.failed(ResultEnum.PARAMETER_ERROR);
//        }


        return null;

    }

    /*查询部门列表*/
    @Override
    @PostMapping(value="/getCodetableValue", produces="application/json")
    public ResponseEntity<List<CodetableValue>> getCodetableValue(@RequestBody String parentChildID, HttpServletRequest request) {


        return null;
    }


//	@Override
//    @PostMapping(value="/add", produces="application/json")
//    public ResponseEntity<CodetableValue> add(@RequestBody CodetableValue codetableValue) {
//        boolean result = codetableValueService.add(codetableValue);
//		if(result){
//            return ResponseEntity.ok(ResultEnum.ADD_SUCCESS);
//        }
//        return ResponseEntity.failed(ResultEnum.ADD_FAILED);
//    }
//
//	@Override
//    @PostMapping(value="/update", produces="application/json")
//    public ResponseEntity<CodetableValue> update(@RequestBody CodetableValue codetableValue) {
//        boolean result = codetableValueService.update(codetableValue);
//		if(result){
//            return ResponseEntity.ok(ResultEnum.UPDATE_SUCCESS);
//        }
//        return ResponseEntity.failed(ResultEnum.UPDATE_fAILED);
//    }
//
//
//	@Override
//    @PostMapping(value="/get", produces="application/json")
//    public ResponseEntity<CodetableValue> getCodetableValue(@RequestBody CodetableValue codetableValue) {
//		CodetableValue result = codetableValueService.findById(codetableValue);
//		if(result == null){
//			// TODO: 替换枚举
//			throw new BusinessException("-1", "not found");
//		}
//		return ResponseEntity.ok(result);
//    }
//
//	@Override
//    @PostMapping(value="/getList", produces="application/json")
//    public ResponseEntity getList(@RequestBody CodetableValue codetableValue) {
//        // TODO query solr
//		return ResponseEntity.ok();
//    }
//
//	@Override
//    @PostMapping(value="/getListWithPage", produces="application/json")
//    public ResponseEntity<CodetableValue> getListWithPage(@RequestBody CodetableValue codetableValue) {
//        // TODO query solr
//		return ResponseEntity.ok();
//    }




    


    
    
    
    
}
