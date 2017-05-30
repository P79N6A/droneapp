package com.fimi.soul.utils;

import com.google.gson.Gson;
import java.lang.reflect.Type;

public class ad {
    public static Gson a = new Gson();

    public static <T> T a(String str, Class<T> cls) {
        return a.fromJson(str, (Class) cls);
    }

    public static <T> T a(String str, Type type) {
        return a.fromJson(str, type);
    }

    public static String a(Object obj) {
        return a.toJson(obj);
    }
}
