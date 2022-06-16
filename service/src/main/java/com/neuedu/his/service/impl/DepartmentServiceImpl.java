package com.neuedu.his.service.impl;

import com.neuedu.his.dao.DepartmentMapper;
import com.neuedu.his.pojo.Department;
import com.neuedu.his.service.ifc.IDepartmentService;
import com.neuedu.his.service.ifc.IDeptTypeService;
import com.neuedu.his.util.ResultCode;
import com.neuedu.his.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: wudagai
 * @date: 2022/6/15 15:06
 * @description:
 */
@Service
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 根据科室类型查询科室信息
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public ResultVo queryDeptByDeptTypeId(Integer id) throws Exception {
        Department department=new Department();
        department.setDept_type(id);
        return ResultVo.ok(departmentMapper.selectMessageByCondition(department), ResultCode.SUCESS);
    }
}
