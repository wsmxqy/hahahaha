package com.neuedu.his.pojo;

import lombok.Data;

/**
 * @author: wudagai
 * @date: 2022/6/13 16:51
 * @description:
 */
@Data
public class Employee {
    private Integer id;
    private String realname;
    private String password;
    private Integer deptment_id;
    private Integer regist_level_id;
    private Integer delmark;
    private Integer role;
}
