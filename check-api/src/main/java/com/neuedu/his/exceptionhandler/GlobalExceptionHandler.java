package com.neuedu.his.exceptionhandler;

import com.neuedu.his.util.ResultCode;
import com.neuedu.his.vo.ResultVo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: wudagai
 * @date: 2022/6/9 11:12
 * @description:
 */
@ControllerAdvice  //标注这个类是一个异常处理器,负责监视Controller是否有异常出现
@ResponseBody
public class GlobalExceptionHandler {

    /**
     * 定义异常处理器方法,处理异常
     *
     * ExceptionHandler:标注这个方法是异常处理器方法
     */

    @ExceptionHandler(Exception.class) //只要出现Exception都会被该处理器捕获
    public ResultVo ExceptionHandler(Exception e){
        e.printStackTrace();
        return ResultVo.fail(ResultCode.FALL_EXCEPTION);
    }
}
