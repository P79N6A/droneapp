package com.fimi.soul.drone.e;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class c {
    public static String a() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public static Date a(String str) {
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}