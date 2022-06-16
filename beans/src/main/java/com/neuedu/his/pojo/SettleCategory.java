package com.neuedu.his.pojo;

import lombok.Data;

/**
 * @author: wudagai
 * @date: 2022/6/15 11:23
 * @description:结算类别
 */
@Data
public class SettleCategory {
    private Integer id;
    private String settle_code;
    private String settle_name;
    private Integer sequence_no;
    private Integer delmark;


}
