package com.neuedu.his.service.impl;

import com.neuedu.his.dao.SettleCategoryMapper;
import com.neuedu.his.pojo.SettleCategory;
import com.neuedu.his.service.ifc.ISettleCategoryService;
import com.neuedu.his.util.ResultCode;
import com.neuedu.his.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: wudagai
 * @date: 2022/6/15 11:35
 * @description:
 */
@Service
public class SettleCategoryServiceImpl implements ISettleCategoryService {
    @Autowired
    private SettleCategoryMapper settleCategoryMapper;

    /**
     * 查询所有结算类别
     * @return
     * @throws Exception
     */
    @Override
    public ResultVo queryAllSettleCategory() throws Exception {
        return ResultVo.ok(settleCategoryMapper.selectMessageByCondition(new SettleCategory()), ResultCode.SUCESS);
    }
}
