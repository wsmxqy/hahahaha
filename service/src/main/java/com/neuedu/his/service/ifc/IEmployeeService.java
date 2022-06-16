package com.neuedu.his.service.ifc;

import com.neuedu.his.vo.ResultVo;

/**
 * @author: wudagai
 * @date: 2022/6/13 17:09
 * @description:
 */
public interface IEmployeeService {
    public ResultVo login(String name,String password) throws Exception;

    public ResultVo queryDocterByDepartmentId(Integer id) throws  Exception;

    ResultVo findLevelBydepartmentId(Integer department_id) throws Exception;
}
