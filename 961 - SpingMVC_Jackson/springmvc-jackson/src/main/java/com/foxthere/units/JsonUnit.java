/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/25 14:30
 * @Author : NekoSilverfox
 * @FileName: JsonUnit
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.units;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

public class JsonUnit {
    public static String getDate(Object object) {
        return getDate(object, "yyyy-MM-dd HH:mm:ss");
    }

    public static String getDate(Object object, String dateFormat) {
        ObjectMapper mapper = new ObjectMapper();

        // 不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        // 自定义日期格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        mapper.setDateFormat(simpleDateFormat);

        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }
}
