package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;

public class mb {
    public static String a(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (Throwable e) {
                throw new IOException("Could not serialize number", e);
            }
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? "true" : "false";
        } else {
            try {
                JSONStringer jSONStringer = new JSONStringer();
                a(obj, jSONStringer);
                return jSONStringer.toString();
            } catch (Throwable e2) {
                throw new IOException("Failed to serialize JSON", e2);
            }
        }
    }

    public static String a(Map<String, Object> map) {
        return a((Object) map);
    }

    private static List<Object> a(JSONArray jSONArray) {
        List<Object> arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(b(jSONArray.get(i)));
        }
        return arrayList;
    }

    public static Map<String, Object> a(String str) {
        try {
            return a(new JSONObject(str));
        } catch (Throwable e) {
            throw new IOException(e);
        }
    }

    private static Map<String, Object> a(JSONObject jSONObject) {
        Map<String, Object> hashMap = new HashMap(jSONObject.length());
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            hashMap.put(str, b(jSONObject.get(str)));
        }
        return hashMap;
    }

    private static void a(Object obj, JSONStringer jSONStringer) {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                a(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
        } else if (obj instanceof Collection) {
            Collection<Object> collection = (Collection) obj;
            jSONStringer.array();
            for (Object a : collection) {
                a(a, jSONStringer);
            }
            jSONStringer.endArray();
        } else {
            jSONStringer.value(obj);
        }
    }

    private static Object b(Object obj) {
        return obj instanceof JSONObject ? a((JSONObject) obj) : obj instanceof JSONArray ? a((JSONArray) obj) : obj.equals(JSONObject.NULL) ? null : obj;
    }

    public static Object b(String str) {
        try {
            return b(new JSONTokener(str).nextValue());
        } catch (Throwable e) {
            throw new IOException(e);
        }
    }
}
