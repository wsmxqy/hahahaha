package com.neuedu.his.dao;

import java.util.List;

/**
 * @author: wudagai
 * @date: 2022/6/13 16:53
 * @description:
 */
public interface BaseMapper<T> {
    public List<T> selectMessageByCondition(T t) throws Exception;

    public int insertMessage(T t)throws Exception;

    public int updateMessage(T t)throws Exception;

    public int deleteMessage(List<Integer> ids)throws Exception;
}
