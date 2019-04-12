package com.chaselx.apidoc.enty;

import java.io.Serializable;

//返回基类
public class ResponseEntity<T> implements Serializable {

    private static final long serialVersionUID = -2825436079063723409L;

    private static final String OK = "200";
    private static final String FAILED = "500";
    private static final String BUSSINESS_FAILED = "550";
    private static final String UNAUTHENTICATION = "401"; //未登录

    private String retCode;
    private String message;
    private T data;

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private static <T> ResponseEntity<T> buildResponse(String retCode, String message, T data){
        ResponseEntity<T> responseEntity = new ResponseEntity<T>();
        responseEntity.retCode = retCode;
        responseEntity.message = message;
        responseEntity.data = data;
        return responseEntity;
    }


    public static <T> ResponseEntity<T> ok(){
        return buildResponse(ResponseEntity.OK,"成功。",null);
    }
    public static <T> ResponseEntity<T> ok(T data){
        return buildResponse(ResponseEntity.OK,"成功。",data);
    }

    public static <T> ResponseEntity<T> ok(ResultEnum resultEnum, T data){
        return buildResponse(resultEnum.getCode(),resultEnum.getMsg(),data);
    }

    public static <T> ResponseEntity<T> ok(ResultEnum resultEnum){
        return buildResponse(resultEnum.getCode(),resultEnum.getMsg(),null);
    }

    public static <T> ResponseEntity<T> ok(String message, T data){
        return buildResponse(ResponseEntity.OK,message,data);
    }


    public static <T> ResponseEntity<T> failed(String message){
        return buildResponse(ResponseEntity.FAILED,message,null);
    }

    public static <T> ResponseEntity<T> failed(String code,String message){
        return buildResponse(code,message,null);
    }

    public static <T> ResponseEntity<T> failed(ResultEnum resultEnum) {
        return buildResponse(resultEnum.getCode(), resultEnum.getMsg(), null);
    }

    public static <T> ResponseEntity<T> businessFailed(String message){
        return buildResponse(ResponseEntity.BUSSINESS_FAILED,message,null);
    }

    public static <T> ResponseEntity<T> unauthentication(String message){
        return buildResponse(ResponseEntity.UNAUTHENTICATION,message,null);
    }

}

