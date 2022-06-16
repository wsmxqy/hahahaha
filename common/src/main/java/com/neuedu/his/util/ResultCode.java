package com.neuedu.his.util;

/**
 * @author: wudagai
 * @date: 2022/6/9 9:51
 * @description:状态码管理枚举类
 */
public enum ResultCode {
    //通用状态
    SUCESS("操作成功",10000),
    FAIL("操作失败",30000),
    PARAM_NULL_FALL("请求参数不能为空",30001),
    FALL_EXCEPTION("系统异常",99999),

    //用户模块--主要业务 成功以4开头 失败以5开头
    USER_LOGIN_SUCCESS("登录成功",40000),
    USER_LOGIN_FAIL("登录失败",50000);
    //订单模块--主要业务

    private String message;
    private Integer code;

    ResultCode(String message, Integer code) {
        this.message = message;
        this.code = code;
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
    }}
