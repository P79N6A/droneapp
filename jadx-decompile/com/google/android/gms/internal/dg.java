package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.fimi.soul.entity.User;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.dv.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class dg {
    public static aqd a(Object obj) {
        String string;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        int i = 1;
        int i2 = 0;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            string = jSONObject.getString(User.FN_NAME);
            jSONArray = jSONObject.getJSONArray("params");
            jSONArray2 = jSONObject.getJSONArray("instructions");
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray4 = (JSONArray) obj;
            d.b(jSONArray4.length() >= 3);
            String string2 = jSONArray4.getString(1);
            jSONArray2 = jSONArray4.getJSONArray(2);
            jSONArray3 = new JSONArray();
            while (i < jSONArray2.length()) {
                d.b(jSONArray2.get(i) instanceof String);
                jSONArray3.put(jSONArray2.get(i));
                i++;
            }
            jSONArray = new JSONArray();
            for (int i3 = 3; i3 < jSONArray4.length(); i3++) {
                jSONArray.put(jSONArray4.get(i3));
            }
            jSONArray2 = jSONArray;
            string = string2;
            jSONArray = jSONArray3;
        } else {
            throw new IllegalArgumentException("invalid JSON in runtime section");
        }
        List arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            arrayList.add(jSONArray.getString(i4));
        }
        List arrayList2 = new ArrayList();
        while (i2 < jSONArray2.length()) {
            jSONArray3 = jSONArray2.getJSONArray(i2);
            if (jSONArray3.length() != 0) {
                arrayList2.add(b(jSONArray3));
            }
            i2++;
        }
        return new aqd(null, string, arrayList, arrayList2);
    }

    static dv a(String str) {
        Object obj = new JSONObject(str).get("resource");
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            a aVar = new a();
            aVar.a(jSONObject.optString("version"));
            List a = a(jSONObject.getJSONArray("macros"));
            List a2 = a(jSONObject.getJSONArray("tags"), a);
            List a3 = a(jSONObject.getJSONArray("predicates"), a);
            for (dw a4 : a(jSONObject.getJSONArray("macros"), a)) {
                aVar.a(a4);
            }
            JSONArray jSONArray = jSONObject.getJSONArray("rules");
            for (int i = 0; i < jSONArray.length(); i++) {
                aVar.a(a(jSONArray.getJSONArray(i), a2, a3));
            }
            return aVar.a();
        }
        throw new de("Resource map not found");
    }

    static dw a(JSONObject jSONObject, List<String> list) {
        dw.a aVar = new dw.a();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            dz a = a(jSONObject.get(str), (List) list).a();
            if ("push_after_evaluate".equals(str)) {
                aVar.a(a);
            } else {
                aVar.a(str, a);
            }
        }
        return aVar.a();
    }

    static dx a(JSONArray jSONArray, List<dw> list, List<dw> list2) {
        dx.a aVar = new dx.a();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            int i2;
            if (jSONArray2.getString(0).equals("if")) {
                for (i2 = 1; i2 < jSONArray2.length(); i2++) {
                    aVar.a((dw) list2.get(jSONArray2.getInt(i2)));
                }
            } else if (jSONArray2.getString(0).equals("unless")) {
                for (i2 = 1; i2 < jSONArray2.length(); i2++) {
                    aVar.b((dw) list2.get(jSONArray2.getInt(i2)));
                }
            } else if (jSONArray2.getString(0).equals(b.c)) {
                for (i2 = 1; i2 < jSONArray2.length(); i2++) {
                    aVar.c((dw) list.get(jSONArray2.getInt(i2)));
                }
            } else if (jSONArray2.getString(0).equals("block")) {
                for (i2 = 1; i2 < jSONArray2.length(); i2++) {
                    aVar.d((dw) list.get(jSONArray2.getInt(i2)));
                }
            } else {
                String str = "Unknown Rule property: ";
                String valueOf = String.valueOf(jSONArray2.getString(0));
                c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        return aVar.a();
    }

    static dz.a a(Object obj, List<String> list) {
        int i = 2;
        String valueOf;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            String string = jSONArray.getString(0);
            if (string.equals("escape")) {
                dz.a a = a(jSONArray.get(1), (List) list);
                while (i < jSONArray.length()) {
                    a.a(jSONArray.getInt(i));
                    i++;
                }
                return a;
            } else if (string.equals("list")) {
                List arrayList = new ArrayList();
                for (int i2 = 1; i2 < jSONArray.length(); i2++) {
                    arrayList.add(a(jSONArray.get(i2), (List) list).a());
                }
                r0 = new dz.a(2, arrayList);
                r0.a(true);
                return r0;
            } else if (string.equals("map")) {
                Map hashMap = new HashMap();
                for (i = 1; i < jSONArray.length(); i += 2) {
                    hashMap.put(a(jSONArray.get(i), (List) list).a(), a(jSONArray.get(i + 1), (List) list).a());
                }
                r0 = new dz.a(3, hashMap);
                r0.a(true);
                return r0;
            } else if (string.equals("macro")) {
                dz.a aVar = new dz.a(4, list.get(jSONArray.getInt(1)));
                aVar.a(true);
                return aVar;
            } else if (string.equals("template")) {
                List arrayList2 = new ArrayList();
                for (i = 1; i < jSONArray.length(); i++) {
                    arrayList2.add(a(jSONArray.get(i), (List) list).a());
                }
                r0 = new dz.a(7, arrayList2);
                r0.a(true);
                return r0;
            } else {
                valueOf = String.valueOf(obj);
                c(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Invalid value type: ").append(valueOf).toString());
                return null;
            }
        } else if (obj instanceof Boolean) {
            return new dz.a(8, obj);
        } else {
            if (obj instanceof Integer) {
                return new dz.a(6, obj);
            }
            if (obj instanceof String) {
                return new dz.a(1, obj);
            }
            valueOf = String.valueOf(obj);
            c(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Invalid value type: ").append(valueOf).toString());
            return null;
        }
    }

    static List<String> a(JSONArray jSONArray) {
        List<String> arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getJSONObject(i).getString("instance_name"));
        }
        return arrayList;
    }

    static List<dw> a(JSONArray jSONArray, List<String> list) {
        List<dw> arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(a(jSONArray.getJSONObject(i), (List) list));
        }
        return arrayList;
    }

    @Nullable
    static dy b(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONArray optJSONArray = jSONObject.optJSONArray("runtime");
        if (optJSONArray == null) {
            return null;
        }
        dy.a aVar = new dy.a();
        Object obj = jSONObject.get("resource");
        if (obj instanceof JSONObject) {
            aVar.a(((JSONObject) obj).optString("version"));
            for (int i = 0; i < optJSONArray.length(); i++) {
                Object obj2 = optJSONArray.get(i);
                if (!(obj2 instanceof JSONArray) || ((JSONArray) obj2).length() != 0) {
                    aVar.a(a(obj2));
                }
            }
            return aVar.a();
        }
        throw new de("Resource map not found");
    }

    private static ei b(JSONArray jSONArray) {
        int i = 1;
        d.b(jSONArray.length() > 0);
        String string = jSONArray.getString(0);
        List arrayList = new ArrayList();
        while (i < jSONArray.length()) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() != 0) {
                    arrayList.add(b(jSONArray2));
                }
            } else if (obj == JSONObject.NULL) {
                arrayList.add(ee.d);
            } else {
                arrayList.add(ek.a(obj));
            }
            i++;
        }
        return new ei(string, arrayList);
    }

    private static void c(String str) {
        aph.a(str);
        throw new de(str);
    }
}
