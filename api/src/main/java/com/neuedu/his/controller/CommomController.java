package com.neuedu.his.controller;

import com.neuedu.his.service.ifc.IEmployeeService;
import com.neuedu.his.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wudagai
 * @date: 2022/6/13 17:16
 * @description:
 */
@RestController
@CrossOrigin
@RequestMapping("/common")
public class CommomController {
    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping("/login")
    public ResultVo login(String username,String password) throws Exception {
        return employeeService.login(username,password);
    }
}
