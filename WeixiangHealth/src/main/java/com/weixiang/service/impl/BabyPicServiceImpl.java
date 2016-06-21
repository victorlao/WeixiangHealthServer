package com.weixiang.service.impl;

import com.weixiang.dao.wxhbaby.BabyPicMapper;
import com.weixiang.pojo.wxhbaby.BabyPic;
import com.weixiang.service.IBabyPicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lzq on 16/6/16.
 */

@Service("babyPicService")
public class BabyPicServiceImpl implements IBabyPicService {
    @Resource
    private BabyPicMapper babyPicMapper;

    public BabyPic babyPicById(int babyPicId) {
        return this.babyPicMapper.selectByPrimaryKey(babyPicId);
    }
}
