package com.google.android.gms.internal;

import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class aqc {
    private static final Map<String, a> a;

    private static final class a {
        public static final String[] a = new String[]{fh.ARG0.toString(), fh.ARG1.toString()};
        private final String b;
        private final String[] c;

        public a(String str) {
            this.b = str;
            this.c = a;
        }

        public a(String str, String[] strArr) {
            this.b = str;
            this.c = strArr;
        }

        public String a() {
            return this.b;
        }

        public String[] b() {
            return this.c;
        }
    }

    static {
        Map hashMap = new HashMap();
        hashMap.put(eg.CONTAINS.toString(), new a("contains"));
        hashMap.put(eg.ENDS_WITH.toString(), new a("endsWith"));
        hashMap.put(eg.EQUALS.toString(), new a("equals"));
        hashMap.put(eg.GREATER_EQUALS.toString(), new a("greaterEquals"));
        hashMap.put(eg.GREATER_THAN.toString(), new a("greaterThan"));
        hashMap.put(eg.LESS_EQUALS.toString(), new a("lessEquals"));
        hashMap.put(eg.LESS_THAN.toString(), new a("lessThan"));
        hashMap.put(eg.REGEX.toString(), new a("regex", new String[]{fh.ARG0.toString(), fh.ARG1.toString(), fh.IGNORE_CASE.toString()}));
        hashMap.put(eg.STARTS_WITH.toString(), new a("startsWith"));
        a = hashMap;
    }

    public static ei a(String str, Map<String, ea<?>> map, apr com_google_android_gms_internal_apr) {
        if (a.containsKey(str)) {
            a aVar = (a) a.get(str);
            List a = a(aVar.b(), map);
            List arrayList = new ArrayList();
            arrayList.add(new ej("gtmUtils"));
            ei eiVar = new ei(Constants.VIA_REPORT_TYPE_WPA_STATE, arrayList);
            arrayList = new ArrayList();
            arrayList.add(eiVar);
            arrayList.add(new ej("mobile"));
            eiVar = new ei("17", arrayList);
            arrayList = new ArrayList();
            arrayList.add(eiVar);
            arrayList.add(new ej(aVar.a()));
            arrayList.add(new ef(a));
            return new ei("2", arrayList);
        }
        throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 47).append("Fail to convert ").append(str).append(" to the internal representation").toString());
    }

    public static String a(eg egVar) {
        return a(egVar.toString());
    }

    public static String a(String str) {
        return a.containsKey(str) ? ((a) a.get(str)).a() : null;
    }

    private static List<ea<?>> a(String[] strArr, Map<String, ea<?>> map) {
        List<ea<?>> arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            if (map.containsKey(strArr[i])) {
                arrayList.add((ea) map.get(strArr[i]));
            } else {
                arrayList.add(ee.e);
            }
        }
        return arrayList;
    }
}
