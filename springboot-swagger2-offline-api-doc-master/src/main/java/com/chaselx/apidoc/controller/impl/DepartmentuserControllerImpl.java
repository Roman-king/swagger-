package com.chaselx.apidoc.controller.impl;


import com.chaselx.apidoc.controller.DepartmentuserController;
import com.chaselx.apidoc.enty.DepUsertInputDto;
import com.chaselx.apidoc.enty.Departmentuser;
import com.chaselx.apidoc.enty.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 部门对应用户表的Rest实现
 * 
 * @author Administrator
 * @date 2019年3月13日
 */
@RestController
@RequestMapping("/departmentuser")
public class DepartmentuserControllerImpl  implements DepartmentuserController {




    /** 批量删除部门人员
     * 逻辑删除
     * **/
	@Override
    @PostMapping(value="/deletebyids", produces="application/json")
    public ResponseEntity deleteByIds(@RequestBody List<String> userCodeList, HttpServletRequest request) {


        return null;

    }


    /**
     * 增加部门人员
     * 人员名字不能为空
     * 所属部门不能为空
     */
	@Override
    @PostMapping(value="/add", produces="application/json")
    public ResponseEntity add(@RequestBody List<DepUsertInputDto> obj, HttpServletRequest request) {


        return null;

    }

    /**
     * 更新部门人员
     * 人员名字不能为空
     * 所属部门不能为空
     */
	@Override
    @PostMapping(value="/update", produces="application/json")
    public ResponseEntity update(@RequestBody List<DepUsertInputDto> obj, HttpServletRequest request) {

        return null;
    }

    /*查询部门人员*/
    @Override
    @PostMapping(value="/getDepartmentUser", produces="application/json")
    public ResponseEntity<List<Departmentuser>> getDepartmentUser(@RequestBody String departmentID, HttpServletRequest request) {

        return null;

    }

    /**
     *
     * 获取一条部门人员信息
     */
//	@Override
//    @PostMapping(value="/get", produces="application/json")
//    public ResponseEntity<Departmentuser> getDepartmentuser(@RequestBody Departmentuser departmentuser) {
//		Departmentuser result = departmentuserService.findById(departmentuser);
//		if(result == null){
//			// TODO: 替换枚举
//			throw new BusinessException("-1", "not found");
//		}
//		return ResponseEntity.ok(result);
//    }

//	@Override
//    @PostMapping(value="/getList", produces="application/json")
//    public ResponseEntity getList(@RequestBody Departmentuser departmentuser) {
//        // TODO query solr
//		return ResponseEntity.ok();
//    }
//
//	@Override
//    @PostMapping(value="/getListWithPage", produces="application/json")
//    public ResponseEntity<Departmentuser> getListWithPage(@RequestBody Departmentuser departmentuser) {
//        // TODO query solr
//		return ResponseEntity.ok();
//    }
//
//
//
//
//
//
//
//    /**
//     * @Description: entity转dto
//     * @Title: entityToDto
//     * @author Administrator
//     * @date 2019年3月13日
//     * @param entity
//     * @param dto
//     * @return: void
//     */
//    private void entityToDto(Departmentuser entity, DepartmentuserDto dto) {
//        // TODO 传递冗余信息
//    }
//
//    /**
//     * @Description: dto转entity
//     * @Title: dtoToEntity
//     * @author Administrator
//     * @date 2019年3月13日
//     * @param dto
//     * @param entity
//     * @return: void
//     */
//    private void dtoToEntity(DepartmentuserDto dto, Departmentuser entity) {
//		// TODO 添加dtoList转entityList的方法
//    }
//
//
    
    
    
    
}
