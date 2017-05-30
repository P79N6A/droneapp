package com.fimi.kernel.utils;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

public class j<T> {

    static class a {
        String a;
        String b;

        a() {
        }

        public String a() {
            return this.a;
        }

        public void a(String str) {
            this.a = str;
        }

        public String b() {
            return this.b;
        }

        public void b(String str) {
            this.b = str;
        }
    }

    public static Object a(String str, Class cls) {
        Object obj = null;
        try {
            obj = new GsonBuilder().create().fromJson(str, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    public static String a(Object obj) {
        String str = null;
        try {
            str = new GsonBuilder().create().toJson(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public static String a(List<?> list) {
        String str = null;
        try {
            str = new GsonBuilder().create().toJson((Object) list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public static List<?> a(String str, TypeToken typeToken) {
        try {
            return (List) new GsonBuilder().create().fromJson(str, typeToken.getType());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void a(String[] strArr) {
        List<a> a = a("[{id:1,name:22},{id:2,name:33}]", new TypeToken<ArrayList<a>>() {
        });
        System.out.println(a.size());
        for (a b : a) {
            System.out.println(b.b());
        }
        System.out.println(((a) a("{id:1,name:22}", a.class)).b());
    }
}
