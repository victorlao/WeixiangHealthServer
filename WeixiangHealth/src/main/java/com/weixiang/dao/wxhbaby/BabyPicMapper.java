package com.weixiang.dao.wxhbaby;

import com.weixiang.pojo.wxhbaby.BabyPic;

public interface BabyPicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BabyPic record);

    int insertSelective(BabyPic record);

    BabyPic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BabyPic record);

    int updateByPrimaryKeyWithBLOBs(BabyPic record);

    int updateByPrimaryKey(BabyPic record);
}