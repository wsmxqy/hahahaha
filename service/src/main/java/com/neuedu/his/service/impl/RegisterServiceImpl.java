package com.neuedu.his.service.impl;

import com.neuedu.his.dao.RegisterMapper;
import com.neuedu.his.pojo.Register;
import com.neuedu.his.service.ifc.IRegisterService;
import com.neuedu.his.util.ResultCode;
import com.neuedu.his.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: wudagai
 * @date: 2022/6/15 10:19
 * @description:
 */
@Service
public class RegisterServiceImpl implements IRegisterService {
    @Autowired
    private RegisterMapper registerMapper;

    /**
     * 挂号
     * @param register
     * @return
     * @throws Exception
     */
    @Override
    public ResultVo registered(Register register) throws Exception {
        registerMapper.insertMessage(register);
        return ResultVo.ok(ResultCode.SUCESS);
    }

    /**
     * 获取最大病历号
     * @return
     * @throws Exception
     */
    @Override
    public ResultVo queryMaxCaseNumber() throws Exception {
        return ResultVo.ok(registerMapper.selectMaxCaseNumber(),ResultCode.SUCESS);
    }
}
