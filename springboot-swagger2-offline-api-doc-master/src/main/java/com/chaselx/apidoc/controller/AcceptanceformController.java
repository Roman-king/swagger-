package com.chaselx.apidoc.controller;


import com.chaselx.apidoc.enty.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * 资产领用单服务端对外接口说明
 * 
 * @author Administrator
 * @date 2019年3月13日
 */
 @Api("出库领用")
public interface AcceptanceformController {

	@ApiOperation("新增资产领用")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "acceptanceformAcDto", required = true, dataType = "AcceptanceformAcDto", paramType = "body"),
            @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    })
    public ResponseEntity addAcceptanceform(@RequestBody AcceptanceformAcDto acceptanceformAcDto, HttpServletRequest request);

    @ApiOperation("查询资产领用单信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "queryAcceptanceListDto", value = "资产领用单数据传输载体", required = true, dataType = "QueryAcceptanceListDto", paramType = "body"),
            @ApiImplicitParam(name = "Authorization" ,value = "tokenId",required = true, paramType="header")
    })
    public ResponseEntity<List<AcceptanceformDto>> getAcceptanceform(@RequestBody QueryAcceptanceListDto queryAcceptanceListDto, HttpServletRequest request);







//	@ApiOperation("更新数据库中一条资产领用单信息")
//    @ApiImplicitParam(name = "acceptanceform", value = "资产领用单数据传输载体", required = true, dataType = "Acceptanceform", paramType = "body")
//    public ResponseEntity<Acceptanceform> update(@RequestBody Acceptanceform acceptanceform);

//    @ApiOperation("查看部门")
//    @ApiImplicitParam(name = "deptDTO",value = "查看部门", required = false, dataType = "DeptDTO", paramType = "body")
//    public ResponseEntity<DeptDTO> selectDept(@RequestBody DeptDTO deptDTO);
//
//    @ApiOperation("删除数据库中一条资产领用单信息")
//    @ApiImplicitParam(name = "acceptanceform", value = "资产领用单数据传输载体", required = true, dataType = "Acceptanceform", paramType = "body")
//    public ResponseEntity<Acceptanceform> delete(@RequestBody Acceptanceform acceptanceform);
    


//    @ApiOperation("根据自定义查询条件，获取数据列表(不分页)")
//    @ApiImplicitParam(name = "acceptanceform",value = "资产领用单查询实体", required = true, dataType = "Acceptanceform", paramType = "body")
//    public ResponseEntity<Acceptanceform> getList(@RequestBody Acceptanceform acceptanceform);

//    @ApiOperation("根据自定义查询条件，分页获取数据列表")
//    @ApiImplicitParam(name = "acceptanceform",value = "资产领用单查询实体", required = true, dataType = "Acceptanceform", paramType = "body")
//    public ResponseEntity<Acceptanceform> getListWithPage(@RequestBody Acceptanceform acceptanceform);

//    @ApiOperation("查询闲置的资产单")
//    public List<Assetinfo> getAssectInfoList();
//
//    @ApiOperation("查询在用的资产单")
//    public List<Assetinfo> getNomalAssectInfoList();




    
}
