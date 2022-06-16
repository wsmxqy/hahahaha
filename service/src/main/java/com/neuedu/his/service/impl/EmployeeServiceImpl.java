package com.neuedu.his.service.impl;

import com.neuedu.his.dao.EmployeeMapper;
import com.neuedu.his.dao.RegisterLevelMapper;
import com.neuedu.his.pojo.Employee;
import com.neuedu.his.pojo.RegisterLevel;
import com.neuedu.his.service.ifc.IEmployeeService;
import com.neuedu.his.util.ResultCode;
import com.neuedu.his.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: wudagai
 * @date: 2022/6/13 17:10
 * @description:
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private RegisterLevelMapper registerLevelMapper;
    /**
     * 用户登录
     * @param name
     * @param password
     * @return
     * @throws Exception
     */
    @Override
    public ResultVo login(String name, String password) throws Exception {
        if(name==null || name.trim().equals("")||password==null || password.trim().equals("")){
            return ResultVo.fail(ResultCode.PARAM_NULL_FALL);
        }else{
            Employee e=new Employee();
            e.setRealname(name);
            e.setPassword(password);
            List<Employee> employees=employeeMapper.selectMessageByCondition(e);
            if(employees.size()>0){
                return ResultVo.ok(employees.get(0),ResultCode.USER_LOGIN_SUCCESS);
            }
        }
        return ResultVo.fail(ResultCode.USER_LOGIN_FAIL);
    }

    /**
     * 通过科室查询医生信息
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public ResultVo queryDocterByDepartmentId(Integer id) throws Exception {
        Employee employee=new Employee();
        employee.setDeptment_id(id);
        return ResultVo.ok(employeeMapper.selectMessageByCondition(employee),ResultCode.SUCESS);
    }

    /**
     * 通过科室查询挂号级别
     * @param department_id
     * @return
     * @throws Exception
     */
    @Override
    public ResultVo findLevelBydepartmentId(Integer department_id) throws Exception {
        Employee employee=new Employee();
        employee.setDeptment_id(department_id);
        List<Employee> employees= employeeMapper.selectMessageByCondition(employee);
        Set<Integer> leveIds=new HashSet<>();
        for(Employee e :employees){
            //获取挂号级别id 并且去重复
            leveIds.add(e.getRegist_level_id());
        }
        List<RegisterLevel> registerLevels=new ArrayList<>();//储存挂号级别信息
        //通过leveId查询级别信息
        for(Integer levelid:leveIds){
            RegisterLevel registerLevel=new RegisterLevel();
            registerLevel.setId(levelid);
            registerLevels.add(registerLevelMapper.selectMessageByCondition(registerLevel).get(0));
        }
        return ResultVo.ok(registerLevels,ResultCode.SUCESS);
    }


}
