package com.neuedu.his.pojo;

import lombok.Data;

/**
 * @author: wudagai
 * @date: 2022/6/15 15:08
 * @description:
 */
@Data
public class Department {
    private Integer id;
    private String dept_code;
    private String dept_name;
    private Integer dept_type;
    private Integer delmark;
}
