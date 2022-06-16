package com.neuedu.his.pojo;

import lombok.Data;

/**
 * @author: wudagai
 * @date: 2022/6/15 15:50
 * @description:
 */
@Data
public class RegisterLevel {
    private Integer id;
    private String  regist_code;
    private String  regist_name;
    private Double  regist_fee;
    private Integer  sequence_no;
    private Integer  delmark;


}
