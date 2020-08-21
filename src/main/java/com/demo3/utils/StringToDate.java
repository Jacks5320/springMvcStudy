package com.demo3.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义异常转换器
 */
public class StringToDate implements Converter<String, Date> {

    /**
     * 转换方法
     *
     * @param s 请求字符串
     * @return 转换类型
     */
    @Override
    public Date convert(String s) {

        //  保留原格式
        if (s.contains("/")) {
            //格式化日期
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            try {
                return df.parse(s);
            } catch (Exception e) {
                throw new RuntimeException("Date数据类型转换异常");
            }
        }
        //  添加新格式
        if (s.contains("-")) {
            //格式化日期
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return df.parse(s);
            } catch (Exception e) {
                throw new RuntimeException("Date数据类型转换异常");
            }
        }
        return null;
    }
}
