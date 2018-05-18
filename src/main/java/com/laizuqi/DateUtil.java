package com.laizuqi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Archie on 2018/5/9.
 * 时间工具类
 */
public class DateUtil {


    public static Date stringToDate(String str,String pattern) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.parse(str);
    }

    /**
     * 格式化日期
     */
    public static String formatDate(String str,String pattern) throws ParseException {
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat (pattern);
        return ft.format(dNow);
    }



}
