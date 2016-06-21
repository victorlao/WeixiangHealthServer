package com.weixiang.dao.wxhbabylist;

import com.weixiang.pojo.wxhbabylist.Pushnews;

public interface PushnewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pushnews record);

    int insertSelective(Pushnews record);

    Pushnews selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pushnews record);

    int updateByPrimaryKeyWithBLOBs(Pushnews record);

    int updateByPrimaryKey(Pushnews record);
}