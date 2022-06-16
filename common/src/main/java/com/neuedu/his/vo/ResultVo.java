package com.neuedu.his.vo;

import com.neuedu.his.util.ResultCode;

/**
 * @author: wudagai
 * @date: 2022/6/9 8:44
 * @description:统一结果集响应对象
 */
public class ResultVo {
    private String message;
    private Integer code;
    private Object data; //model

    /**
     * 成功不返回model数据
     * @return
     */
    public static ResultVo ok(ResultCode resultCode){
        ResultVo resultVo=new ResultVo();
        resultVo.setMessage(resultCode.getMessage());
        resultVo.setCode(resultCode.getCode());
        return resultVo;
    }

    /**
     * 成功返回model数据
     * @param object
     * @return
     */
    public static ResultVo ok(Object object,ResultCode resultCode){
        ResultVo resultVo=new ResultVo();
        resultVo.setMessage(resultCode.getMessage());
        resultVo.setCode(resultCode.getCode());
        resultVo.setData(object);
        return resultVo;
    }

    /**
     * 失败
     * @return
     */
    public static ResultVo fail(ResultCode resultCode){
        ResultVo resultVo=new ResultVo();
        resultVo.setMessage(resultCode.getMessage());
        resultVo.setCode(resultCode.getCode());
        return resultVo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
