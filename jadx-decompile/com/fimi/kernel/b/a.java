package com.fimi.kernel.b;

import java.util.Map;
import org.json.JSONObject;

public interface a extends b {
    void a(String str, e<String> eVar);

    <T> void a(String str, e<T> eVar, Class<?> cls);

    void a(String str, Map<String, String> map, e<String> eVar);

    <T> void a(String str, Map<String, String> map, e<T> eVar, Class<?> cls);

    void a(String str, JSONObject jSONObject, e<JSONObject> eVar);

    void b(String str, e<String> eVar);

    <T> void b(String str, e<T> eVar, Class<?> cls);

    void b(String str, JSONObject jSONObject, e<JSONObject> eVar);

    void c(String str, e<JSONObject> eVar);

    void d(String str, e<JSONObject> eVar);
}
