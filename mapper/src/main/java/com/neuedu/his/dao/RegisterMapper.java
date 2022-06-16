package com.neuedu.his.dao;

import com.neuedu.his.pojo.Employee;
import com.neuedu.his.pojo.Register;

import java.util.List;

/**
 * @author: wudagai
 * @date: 2022/6/13 16:56
 * @description:
 */
public interface RegisterMapper extends BaseMapper<Register>{
    public String selectMaxCaseNumber() throws Exception;

}
