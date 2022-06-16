package com.neuedu.his.controller;

import com.neuedu.his.pojo.Register;
import com.neuedu.his.service.ifc.*;
import com.neuedu.his.vo.ResultVo;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wudagai
 * @date: 2022/6/15 10:22
 * @description:
 */
@RestController
@CrossOrigin
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private IRegisterService registerService;

    @Autowired
    private IDeptTypeService deptTypeService;

    @Autowired
    private ISettleCategoryService settleCategoryService;

    @Autowired
    private IDepartmentService departmentService;

    @Autowired
    private IEmployeeService employeeService;
    /**
     * 挂号数据接口
     * @return
     * args:Register:挂号信息
     */
    @RequestMapping("/addRegister")
    public ResultVo addRegister(Register register){
        System.out.println(register);
        return null;
    }

    /**
     * 获取最大病历号
     * @return
     * @throws Exception
     */
    @RequestMapping("/findMaxCaseNumber")
    public ResultVo findMaxCaseNumber() throws Exception {
        return registerService.queryMaxCaseNumber();
    }
    /**
     * 查询所有结算类别
     * @return
     */
    @RequestMapping("/findAllSettleCategory")
    public ResultVo findAllSettleCategory() throws Exception {
        return settleCategoryService.queryAllSettleCategory();
    }

    /**
     * 查询所有科室类别
     * @return
     */
    @RequestMapping("/findAllDeptType")
    public ResultVo findAllDeptType() throws Exception {
        return deptTypeService.queryAllDeptType();
    }

    /**
     *根据科室类型查询科室信息
     * @param deptTypeId
     * @return
     * @throws Exception
     */
    @RequestMapping("/findDeptByDeptTypeId")
    public ResultVo findDeptByDeptTypeId(Integer deptTypeId) throws Exception {
        return departmentService.queryDeptByDeptTypeId(deptTypeId);
    }

    /**
     * 通过科室查询医生信息
     * @param department_id
     * @return
     * @throws Exception
     */
    @RequestMapping("/findDocterByDepratmentId")
    public ResultVo findDocterByDepratmentId(Integer department_id) throws Exception{
        return employeeService.queryDocterByDepartmentId(department_id);
    }

    /**
     * 通过科室查询该科室的挂号级别
     * @return
     * @throws Exception
     */
    @RequestMapping("/findLevelBydepartmentId")
    public ResultVo findLevelBydepartmentId(Integer department_id) throws Exception{
        return employeeService.findLevelBydepartmentId(department_id);
    }
}
