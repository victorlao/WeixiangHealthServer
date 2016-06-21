package com.weixiang.service.impl;

import com.weixiang.dao.wxhbabylist.PushnewsMapper;
import com.weixiang.pojo.wxhbabylist.Pushnews;
import com.weixiang.service.IPushnewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lzq on 16/6/16.
 */

@Service("pushnewsService")
public class PushnewsServiceImpl implements IPushnewsService {

    @Resource
    private PushnewsMapper pushnewsMapper;
    public Pushnews pushnewsById(int pushnewsId) {
        return this.pushnewsMapper.selectByPrimaryKey(pushnewsId);
    }
}
