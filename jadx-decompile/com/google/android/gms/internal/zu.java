package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.ads.internal.formats.f;
import com.google.android.gms.ads.internal.formats.i;
import com.google.android.gms.ads.internal.formats.j;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.abi.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class zu implements Callable<abi> {
    private static final long a = TimeUnit.SECONDS.toMillis(60);
    private final Context b;
    private final acc c;
    private final q d;
    private final ro e;
    private final zt f;
    private final Object g = new Object();
    private final a h;
    private final un i;
    private boolean j;
    private int k;
    private List<String> l;
    private JSONObject m;

    public zu(Context context, q qVar, acc com_google_android_gms_internal_acc, ro roVar, a aVar, un unVar) {
        this.b = context;
        this.d = qVar;
        this.c = com_google_android_gms_internal_acc;
        this.h = aVar;
        this.e = roVar;
        this.i = unVar;
        this.f = a(context, aVar, qVar, roVar);
        this.f.a();
        this.j = false;
        this.k = -2;
        this.l = null;
    }

    private i.a a(a aVar, JSONObject jSONObject, String str) {
        if (b() || aVar == null || jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("tracking_urls_and_actions");
        String[] c = c(jSONObject2, "impression_tracking_urls");
        this.l = c == null ? null : Arrays.asList(c);
        this.m = jSONObject2.optJSONObject("active_view");
        i.a a = aVar.a(this, jSONObject);
        if (a == null) {
            b.b("Failed to retrieve ad assets.");
            return null;
        }
        a.a(new j(this.b, this.d, this.f, this.e, jSONObject, a, this.h.a.k, str));
        return a;
    }

    private aco<c> a(JSONObject jSONObject, boolean z, boolean z2) {
        String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (!TextUtils.isEmpty(string)) {
            return z2 ? new acm(new c(null, Uri.parse(string), optDouble)) : this.c.a(string, new 6(this, z, optDouble, optBoolean, string));
        } else {
            a(0, z);
            return new acm(null);
        }
    }

    private JSONObject a(String str) {
        if (b()) {
            return null;
        }
        acl com_google_android_gms_internal_acl = new acl();
        this.f.a(new 1(this, new b(this), com_google_android_gms_internal_acl, str));
        return (JSONObject) com_google_android_gms_internal_acl.get(a, TimeUnit.MILLISECONDS);
    }

    private void a(i.a aVar) {
        if (aVar instanceof f) {
            f fVar = (f) aVar;
            b bVar = new b(this);
            vt 3 = new 3(this, fVar);
            bVar.a = 3;
            this.f.a(new 4(this, 3));
        }
    }

    private void a(vd vdVar, String str) {
        try {
            vh c = this.d.c(vdVar.l());
            if (c != null) {
                c.a(vdVar, str);
            }
        } catch (Throwable e) {
            b.d(new StringBuilder(String.valueOf(str).length() + 40).append("Failed to call onCustomClick for asset ").append(str).append(".").toString(), e);
        }
    }

    private abi b(i.a aVar) {
        int i;
        synchronized (this.g) {
            i = this.k;
            if (aVar == null && this.k == -2) {
                i = 0;
            }
        }
        return new abi(this.h.a.c, null, this.h.b.d, i, this.h.b.f, this.l, this.h.b.l, this.h.b.k, this.h.a.i, false, null, null, null, null, null, 0, this.h.d, this.h.b.g, this.h.f, this.h.g, this.h.b.o, this.m, i != -2 ? null : aVar, null, null, null, this.h.b.F, this.h.b.G, null, this.h.b.J, this.h.b.N);
    }

    private Integer b(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException e) {
            return null;
        }
    }

    private static List<Drawable> b(List<c> list) {
        List<Drawable> arrayList = new ArrayList();
        for (c a : list) {
            arrayList.add((Drawable) com.google.android.gms.c.f.a(a.a()));
        }
        return arrayList;
    }

    private String[] c(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        return strArr;
    }

    public abi a() {
        try {
            this.f.b();
            String uuid = UUID.randomUUID().toString();
            JSONObject a = a(uuid);
            i.a a2 = a(a(a), a, uuid);
            a(a2);
            return b(a2);
        } catch (CancellationException e) {
            if (!this.j) {
                a(0);
            }
            return b(null);
        } catch (ExecutionException e2) {
            if (this.j) {
                a(0);
            }
            return b(null);
        } catch (InterruptedException e3) {
            if (this.j) {
                a(0);
            }
            return b(null);
        } catch (Throwable e4) {
            b.d("Malformed native JSON response.", e4);
            if (this.j) {
                a(0);
            }
            return b(null);
        } catch (Throwable e42) {
            b.d("Timeout when loading native ad.", e42);
            if (this.j) {
                a(0);
            }
            return b(null);
        }
    }

    public aco<acy> a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return new acm(null);
        }
        if (!TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            return a(this.b, this.e, this.h, this.i, this.d).a(optJSONObject);
        }
        b.d("Required field 'vast_xml' is missing");
        return new acm(null);
    }

    public aco<c> a(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return a(jSONObject2, z, z2);
    }

    zt a(Context context, a aVar, q qVar, ro roVar) {
        return new zt(context, aVar, qVar, roVar);
    }

    protected a a(JSONObject jSONObject) {
        if (b() || jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("template_id");
        boolean z = this.h.a.z != null ? this.h.a.z.b : false;
        boolean z2 = this.h.a.z != null ? this.h.a.z.d : false;
        if ("2".equals(string)) {
            return new zw(z, z2);
        }
        if ("1".equals(string)) {
            return new zx(z, z2);
        }
        if ("3".equals(string)) {
            String string2 = jSONObject.getString("custom_template_id");
            acl com_google_android_gms_internal_acl = new acl();
            abv.a.post(new 2(this, com_google_android_gms_internal_acl, string2));
            if (com_google_android_gms_internal_acl.get(a, TimeUnit.MILLISECONDS) != null) {
                return new zy(z);
            }
            string2 = "No handler for custom template: ";
            String valueOf = String.valueOf(jSONObject.getString("custom_template_id"));
            b.b(valueOf.length() != 0 ? string2.concat(valueOf) : new String(string2));
        } else {
            a(0);
        }
        return null;
    }

    zv a(Context context, ro roVar, a aVar, un unVar, q qVar) {
        return new zv(context, roVar, aVar, unVar, qVar);
    }

    public List<aco<c>> a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) {
        JSONArray jSONArray = z ? jSONObject.getJSONArray(str) : jSONObject.optJSONArray(str);
        List<aco<c>> arrayList = new ArrayList();
        if (jSONArray == null || jSONArray.length() == 0) {
            a(0, z);
            return arrayList;
        }
        int length = z3 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(a(jSONObject2, z, z2));
        }
        return arrayList;
    }

    public Future<c> a(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return a(jSONObject2, optBoolean, z);
    }

    public void a(int i) {
        synchronized (this.g) {
            this.j = true;
            this.k = i;
        }
    }

    public void a(int i, boolean z) {
        if (z) {
            a(i);
        }
    }

    public aco<com.google.android.gms.ads.internal.formats.a> b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return new acm(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer b = b(optJSONObject, "text_color");
        Integer b2 = b(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        int i = (this.h.a.z == null || this.h.a.z.a < 2) ? 1 : this.h.a.z.e;
        List arrayList = new ArrayList();
        if (optJSONObject.optJSONArray(com.fimi.kernel.a.b) != null) {
            arrayList = a(optJSONObject, com.fimi.kernel.a.b, false, false, true);
        } else {
            arrayList.add(a(optJSONObject, "image", false, false));
        }
        return acn.a(acn.a(arrayList), new 5(this, optString, b2, b, optInt, optInt3, optInt2, i));
    }

    public boolean b() {
        boolean z;
        synchronized (this.g) {
            z = this.j;
        }
        return z;
    }

    public /* synthetic */ Object call() {
        return a();
    }
}
