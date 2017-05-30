package com.b.a.c;

import android.graphics.Bitmap;
import com.b.a.a.b.c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class e {
    private static final String a = "_";
    private static final String b = "x";

    private e() {
    }

    public static String a(String str, com.b.a.b.a.e eVar) {
        return a + eVar.a() + b + eVar.b();
    }

    public static Comparator<String> a() {
        return new Comparator<String>() {
            public int a(String str, String str2) {
                return str.substring(0, str.lastIndexOf(e.a)).compareTo(str2.substring(0, str2.lastIndexOf(e.a)));
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((String) obj, (String) obj2);
            }
        };
    }

    public static List<Bitmap> a(String str, c cVar) {
        List<Bitmap> arrayList = new ArrayList();
        for (String str2 : cVar.a()) {
            if (str2.startsWith(str)) {
                arrayList.add(cVar.a(str2));
            }
        }
        return arrayList;
    }

    public static List<String> b(String str, c cVar) {
        List<String> arrayList = new ArrayList();
        for (String str2 : cVar.a()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static void c(String str, c cVar) {
        List<String> arrayList = new ArrayList();
        for (String str2 : cVar.a()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2);
            }
        }
        for (String str22 : arrayList) {
            cVar.b(str22);
        }
    }
}
