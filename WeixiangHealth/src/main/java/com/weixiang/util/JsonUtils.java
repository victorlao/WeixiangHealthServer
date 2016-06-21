package com.weixiang.util;

import com.alibaba.fastjson.JSON;

/**
 * Created by lzq on 16/6/17.
 */
public class JsonUtils {
    public static String toJsonString(Object obj) {
        return JSON.toJSONString(obj);
    }
    public static Object parseJson(String jsonString) {
        return JSON.parse(jsonString);
    }
}
