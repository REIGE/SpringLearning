package com.reige.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CustomDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        try {
            //进行日期转换
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(source);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
