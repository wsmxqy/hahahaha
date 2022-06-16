package com.neuedu.his.service.ifc;

import com.neuedu.his.vo.ResultVo;

/**
 * @author: wudagai
 * @date: 2022/6/15 15:05
 * @description:
 */
public interface IDepartmentService {

    public ResultVo queryDeptByDeptTypeId(Integer id) throws Exception;
}
