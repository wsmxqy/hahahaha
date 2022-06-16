package com.neuedu.his.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author: wudagai
 * @date: 2022/6/13 16:56
 * @description:
 */
@Data
public class Register {
    private Integer id;
    private  String case_number;
    private  String real_name;
    private  String gender;
    private  String card_number;
    private Date birthday;
    private  Integer age;
    private  String age_type;
    private  String home_address;
    private  Date visit_date;
    private  Integer deptment_id;
    private  Integer employee_id;
    private  Integer regist_level_id;
    private  Integer settle_category_id;
    private  String is_book;
    private  String regist_method;
    private  Integer visit_state;//本次看诊状态（1-已挂号 2-医生接诊 3-看诊结束 4-已退号）
    private  Double regist_money;


}
