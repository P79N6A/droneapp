package com.google.firebase.c;

import android.net.Uri;
import android.net.Uri.Builder;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.nc;
import com.google.android.gms.internal.ng;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class h {
    private String a;
    private d b;
    private i c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private long j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private Map<String, String> p;
    private String[] q;

    public static class a {
        h a;
        boolean b;

        public a() {
            this.a = new h();
        }

        public a(h hVar) {
            this.a = new h(false);
        }

        a(JSONObject jSONObject) {
            this.a = new h();
            if (jSONObject != null) {
                a(jSONObject);
                this.b = true;
            }
        }

        a(JSONObject jSONObject, i iVar) {
            this(jSONObject);
            this.a.c = iVar;
        }

        private void a(JSONObject jSONObject) {
            this.a.e = jSONObject.optString("generation");
            this.a.a = jSONObject.optString(User.FN_NAME);
            this.a.d = jSONObject.optString("bucket");
            this.a.g = jSONObject.optString("metageneration");
            this.a.h = jSONObject.optString("timeCreated");
            this.a.i = jSONObject.optString("updated");
            this.a.j = jSONObject.optLong("size");
            this.a.k = jSONObject.optString("md5Hash");
            this.a.b(jSONObject.optString("downloadTokens"));
            e(jSONObject.optString("contentType"));
            if (jSONObject.has("metadata")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    a(str, jSONObject2.getString(str));
                }
            }
            d(jSONObject.optString("cacheControl"));
            c(jSONObject.optString("contentDisposition"));
            b(jSONObject.optString("'contentEncoding"));
            a(jSONObject.optString("'contentLanguage"));
        }

        public a a(String str) {
            this.a.o = str;
            return this;
        }

        public a a(String str, String str2) {
            if (this.a.p == null) {
                this.a.p = new HashMap();
            }
            this.a.p.put(str, str2);
            return this;
        }

        public h a() {
            return new h(this.b);
        }

        public a b(String str) {
            this.a.n = str;
            return this;
        }

        public a c(String str) {
            this.a.m = str;
            return this;
        }

        public a d(String str) {
            this.a.l = str;
            return this;
        }

        public a e(String str) {
            this.a.f = str;
            return this;
        }
    }

    public h() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    private h(@NonNull h hVar, boolean z) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        d.a(hVar);
        this.a = hVar.a;
        this.b = hVar.b;
        this.c = hVar.c;
        this.d = hVar.d;
        this.f = hVar.f;
        this.l = hVar.l;
        this.m = hVar.m;
        this.n = hVar.n;
        this.o = hVar.o;
        if (hVar.p != null) {
            this.p = new HashMap(hVar.p);
        }
        this.q = hVar.q;
        if (z) {
            this.k = hVar.k;
            this.j = hVar.j;
            this.i = hVar.i;
            this.h = hVar.h;
            this.g = hVar.g;
            this.e = hVar.e;
        }
    }

    private void b(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            this.q = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
    }

    public String a() {
        return this.f;
    }

    public String a(@NonNull String str) {
        return (this.p == null || TextUtils.isEmpty(str)) ? null : (String) this.p.get(str);
    }

    @NonNull
    public Set<String> b() {
        return this.p == null ? Collections.emptySet() : this.p.keySet();
    }

    @NonNull
    public String c() {
        return this.a != null ? this.a : "";
    }

    @Nullable
    public String d() {
        String c = c();
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        int lastIndexOf = c.lastIndexOf(47);
        return lastIndexOf != -1 ? c.substring(lastIndexOf + 1) : c;
    }

    @Nullable
    public String e() {
        return this.d;
    }

    @Nullable
    public String f() {
        return this.e;
    }

    @Nullable
    public String g() {
        return this.g;
    }

    public long h() {
        return ng.a(this.h);
    }

    public long i() {
        return ng.a(this.i);
    }

    public long j() {
        return this.j;
    }

    @Nullable
    public String k() {
        return this.k;
    }

    @Nullable
    public Uri l() {
        List m = m();
        return (m == null || m.size() <= 0) ? null : (Uri) m.get(0);
    }

    @Nullable
    public List<Uri> m() {
        List arrayList = new ArrayList();
        if (!(this.q == null || this.c == null)) {
            try {
                Object c = this.c.h().c(this.c.o());
                if (!TextUtils.isEmpty(c)) {
                    for (Object obj : this.q) {
                        if (!TextUtils.isEmpty(obj)) {
                            arrayList.add(Uri.parse(new StringBuilder((String.valueOf(c).length() + 17) + String.valueOf(obj).length()).append(c).append("?alt=media&token=").append(obj).toString()));
                        }
                    }
                }
            } catch (Throwable e) {
                Log.e("StorageMetadata", "Unexpected error getting DownloadUrls.", e);
            }
        }
        return arrayList;
    }

    @Nullable
    public String n() {
        return this.l;
    }

    @Nullable
    public String o() {
        return this.m;
    }

    @Nullable
    public String p() {
        return this.n;
    }

    @Nullable
    public String q() {
        return this.o;
    }

    @Nullable
    public i r() {
        if (this.c != null || this.b == null) {
            return this.c;
        }
        String e = e();
        String c = c();
        if (TextUtils.isEmpty(e) || TextUtils.isEmpty(c)) {
            return null;
        }
        try {
            return new i(new Builder().scheme("gs").authority(e).encodedPath(nc.a(c)).build(), this.b);
        } catch (Throwable e2) {
            Log.e("StorageMetadata", new StringBuilder((String.valueOf(e).length() + 38) + String.valueOf(c).length()).append("Unable to create a valid default Uri. ").append(e).append(c).toString(), e2);
            throw new IllegalStateException(e2);
        }
    }

    @NonNull
    JSONObject s() {
        JSONObject jSONObject = new JSONObject();
        if (a() != null) {
            jSONObject.put("contentType", a());
        }
        if (this.p != null) {
            jSONObject.put("metadata", new JSONObject(this.p));
        }
        if (n() != null) {
            jSONObject.put("cacheControl", n());
        }
        if (o() != null) {
            jSONObject.put("contentDisposition", o());
        }
        if (p() != null) {
            jSONObject.put("'contentEncoding", p());
        }
        if (q() != null) {
            jSONObject.put("'contentLanguage", q());
        }
        return jSONObject;
    }
}
