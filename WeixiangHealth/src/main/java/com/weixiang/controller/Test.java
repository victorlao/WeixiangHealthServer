package com.weixiang.controller;

import com.weixiang.pojo.wxhbaby.BabyPic;
import com.weixiang.pojo.wxhbabylist.Pushnews;
import com.weixiang.service.IBabyPicService;
import com.weixiang.service.IPushnewsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by lzq on 16/6/3.
 */

@Controller
@RequestMapping("/test")
public class Test extends BaseController{
    @Resource
    private IPushnewsService service;

    @Resource
    private IBabyPicService babyPicService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(int id) {
        BabyPic babyPic = babyPicService.babyPicById(id);
        if (babyPic != null) {
            System.out.println(babyPic.getPicpath());
        }
        Pushnews pushnews = service.pushnewsById(id);
        if (pushnews != null) {
            System.out.println(pushnews.getTitle());
        }
        return "";
    }

}
