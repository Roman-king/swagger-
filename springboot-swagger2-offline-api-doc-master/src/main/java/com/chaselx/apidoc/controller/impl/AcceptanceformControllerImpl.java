package com.chaselx.apidoc.controller.impl;


import com.chaselx.apidoc.controller.AcceptanceformController;
import com.chaselx.apidoc.enty.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * 资产领用单的Rest实现
 * 
 * @author Administrator
 * @date 2019年3月13日
 */
@RestController
@RequestMapping("/acceptanceform")
public class AcceptanceformControllerImpl implements AcceptanceformController {

	@Override
    @PostMapping(value="/addAcceptanceform", produces="application/json")
    public ResponseEntity addAcceptanceform(@RequestBody AcceptanceformAcDto acceptanceformAcDto, HttpServletRequest request) {


        return null;



    }


    @Override
    @PostMapping(value="/getAcceptanceform", produces="application/json")
    public ResponseEntity<List<AcceptanceformDto>> getAcceptanceform(@RequestBody QueryAcceptanceListDto queryAcceptanceListDto, HttpServletRequest request) {
        return null;
    }

    
//	@Override
//    @PostMapping(value="/update", produces="application/json")
//    public ResponseEntity<Acceptanceform> update(@RequestBody Acceptanceform acceptanceform) {
//        boolean result = acceptanceformService.update(acceptanceform);
//		if(result){
//            return ResponseEntity.ok(ResultEnum.UPDATE_SUCCESS);
//        }
//        return ResponseEntity.failed(ResultEnum.UPDATE_fAILED);
//    }

//    @Override
//    @PostMapping(value="/selectDept", produces="application/json")
//    public ResponseEntity<DeptDTO> selectDept(@RequestBody DeptDTO deptData) {
//        List<CodetableValue> code = codetableValueService.findByDeptName(deptData.getDeptName());
//        if(null==code && code.size()==0){
//            throw new BusinessException("-1", "没有该部门");
//        }
//        DeptDTO data = new DeptDTO();
//        List<Departmentuser> userList = departmentuserService.findByDeptId(code.get(0).getChildId());
//        List<String> userNameList = userList.stream().map(Departmentuser::getUserName).collect(Collectors.toList());
//        data.setUserName(userNameList);
//        return ResponseEntity.ok(data);
//    }

//    @Override
//    @PostMapping(value="/delete", produces="application/json")
//    public ResponseEntity<Acceptanceform> delete(@RequestBody Acceptanceform acceptanceform) {
//        boolean result = acceptanceformService.delete(acceptanceform);
//		if(result){
//            return ResponseEntity.ok(ResultEnum.DEL_SUCCESS);
//        }
//		return ResponseEntity.failed(ResultEnum.DEL_FAILED);
//    }
    

    
//	@Override
//    @PostMapping(value="/getList", produces="application/json")
//    public ResponseEntity getList(@RequestBody Acceptanceform acceptanceform) {
//        // TODO query solr
//
//		return ResponseEntity.ok();
//    }
    
//	@Override
//    @PostMapping(value="/getListWithPage", produces="application/json")
//    public ResponseEntity<Acceptanceform> getListWithPage(@RequestBody Acceptanceform acceptanceform) {
//        // TODO query solr
//		return ResponseEntity.ok();
//    }

//    @Override
//    @PostMapping(value="/getAssectInfoList", produces="application/json")
//    public List<Assetinfo> getAssectInfoList() {
//	    List<Assetinfo> assetInfoList = acceptanceformService.findLeave();
//        return assetInfoList;
//    }
//
//    @Override
//    @PostMapping(value="/getNomalAssectInfoList", produces="application/json")
//    public List<Assetinfo> getNomalAssectInfoList() {
//        List<Assetinfo> assetInfoList = acceptanceformService.findNomal();
//        return assetInfoList;
//    }


    /**
     * @Description: entity转dto
     * @Title: entityToDto
     * @author Administrator
     * @date 2019年3月13日
     * @param entity
     * @param dto
     * @return: void
     */

    
    
    
    
    
    
}
