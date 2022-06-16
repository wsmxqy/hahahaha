package com.neuedu.his.service.ifc;

import com.neuedu.his.pojo.Register;
import com.neuedu.his.vo.ResultVo;

/**
 * @author: wudagai
 * @date: 2022/6/15 10:17
 * @description:
 */
public interface IRegisterService {
    //挂号
    public ResultVo registered(Register register) throws Exception;
    //获取最大病历号
    public ResultVo queryMaxCaseNumber() throws  Exception;
}
