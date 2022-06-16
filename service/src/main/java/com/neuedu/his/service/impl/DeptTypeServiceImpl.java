package com.neuedu.his.service.impl;

import com.neuedu.his.dao.DeptTypeMapper;
import com.neuedu.his.pojo.DeptType;
import com.neuedu.his.service.ifc.IDeptTypeService;
import com.neuedu.his.util.ResultCode;
import com.neuedu.his.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: wudagai
 * @date: 2022/6/15 14:28
 * @description:
 */
@Service
public class DeptTypeServiceImpl implements IDeptTypeService {

    @Autowired
    private DeptTypeMapper deptTypeMapper;

    @Override
    public ResultVo queryAllDeptType() throws Exception {
        return ResultVo.ok(deptTypeMapper.selectMessageByCondition(new DeptType()), ResultCode.SUCESS);
    }
}
