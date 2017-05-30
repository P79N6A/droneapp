package com.fimi.kernel.b.e;

import com.android.volley.d;
import com.android.volley.n;
import com.android.volley.o;
import com.android.volley.p;
import com.android.volley.toolbox.s;
import com.android.volley.toolbox.t;
import com.android.volley.u;
import com.fimi.kernel.b.a;
import com.fimi.kernel.b.e;
import com.fimi.kernel.c;
import java.util.Map;
import org.json.JSONObject;

public class b implements a {
    o a;

    public b() {
        this.a = null;
        this.a = t.a(c.a());
    }

    private void a(int i, String str, final e<String> eVar) {
        n sVar = new s(i, str, new com.android.volley.p.b<String>(this) {
            final /* synthetic */ b b;

            public void a(String str) {
                if (eVar != null) {
                    eVar.a(str);
                }
            }
        }, new p.a(this) {
            final /* synthetic */ b b;

            public void a(u uVar) {
                eVar.b(uVar.getMessage());
            }
        });
        sVar.a(new d(3000, 1, 1.0f));
        this.a.a(sVar);
    }

    private <T> void a(int i, String str, Map<String, String> map, e<T> eVar, Class<?> cls) {
        this.a.a(new a(i, str, map, eVar, cls));
    }

    private void a(int i, String str, JSONObject jSONObject, final e<JSONObject> eVar) {
        this.a.a(new com.android.volley.toolbox.n(i, str, jSONObject, new com.android.volley.p.b<JSONObject>(this) {
            final /* synthetic */ b b;

            public void a(JSONObject jSONObject) {
                if (eVar != null) {
                    eVar.a(jSONObject);
                }
            }
        }, null));
    }

    public void a(String str, e<String> eVar) {
        a(0, str, (e) eVar);
    }

    public <T> void a(String str, e<T> eVar, Class<?> cls) {
        a(0, str, null, eVar, cls);
    }

    public void a(String str, Map<String, String> map, final e<String> eVar) {
        final Map<String, String> map2 = map;
        this.a.a(new s(this, 1, str, new com.android.volley.p.b<String>(this) {
            final /* synthetic */ b b;

            public void a(String str) {
                if (eVar != null) {
                    eVar.a(str);
                }
            }
        }, new p.a(this) {
            final /* synthetic */ b b;

            public void a(u uVar) {
                eVar.b(uVar.getMessage());
            }
        }) {
            final /* synthetic */ b b;

            protected Map<String, String> s() {
                return map2;
            }
        });
    }

    public <T> void a(String str, Map<String, String> map, e<T> eVar, Class<?> cls) {
        a(1, str, map, eVar, cls);
    }

    public void a(String str, JSONObject jSONObject, e<JSONObject> eVar) {
        a(1, str, jSONObject, (e) eVar);
    }

    public void b(String str, e<String> eVar) {
        a(1, str, (e) eVar);
    }

    public <T> void b(String str, e<T> eVar, Class<?> cls) {
        a(1, str, null, eVar, cls);
    }

    public void b(String str, JSONObject jSONObject, e<JSONObject> eVar) {
        a(0, str, jSONObject, (e) eVar);
    }

    public void c(String str, e<JSONObject> eVar) {
        a(1, str, null, (e) eVar);
    }

    public void d(String str, e<JSONObject> eVar) {
        a(0, str, null, (e) eVar);
    }
}
