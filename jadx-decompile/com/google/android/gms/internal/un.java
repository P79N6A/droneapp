package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.u;
import com.tencent.tauth.AuthActivity;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@aaa
public class un {
    boolean a;
    private final List<ul> b = new LinkedList();
    private final Map<String, String> c = new LinkedHashMap();
    private final Object d = new Object();
    private String e;
    private ul f;
    @Nullable
    private un g;

    public un(boolean z, String str, String str2) {
        this.a = z;
        this.c.put(AuthActivity.ACTION_KEY, str);
        this.c.put("ad_format", str2);
    }

    public ul a() {
        return a(u.k().b());
    }

    @Nullable
    public ul a(long j) {
        return !this.a ? null : new ul(j, null, null);
    }

    public void a(@Nullable un unVar) {
        synchronized (this.d) {
            this.g = unVar;
        }
    }

    public void a(String str) {
        if (this.a) {
            synchronized (this.d) {
                this.e = str;
            }
        }
    }

    public void a(String str, String str2) {
        if (this.a && !TextUtils.isEmpty(str2)) {
            uh e = u.i().e();
            if (e != null) {
                synchronized (this.d) {
                    e.a(str).a(this.c, str, str2);
                }
            }
        }
    }

    public boolean a(ul ulVar, long j, String... strArr) {
        synchronized (this.d) {
            for (String ulVar2 : strArr) {
                this.b.add(new ul(j, ulVar2, ulVar));
            }
        }
        return true;
    }

    public boolean a(@Nullable ul ulVar, String... strArr) {
        return (!this.a || ulVar == null) ? false : a(ulVar, u.k().b(), strArr);
    }

    public void b() {
        synchronized (this.d) {
            this.f = a();
        }
    }

    public String c() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        synchronized (this.d) {
            for (ul ulVar : this.b) {
                long a = ulVar.a();
                String b = ulVar.b();
                ul ulVar2 = ulVar2.c();
                if (ulVar2 != null && a > 0) {
                    stringBuilder2.append(b).append('.').append(a - ulVar2.a()).append(',');
                }
            }
            this.b.clear();
            if (!TextUtils.isEmpty(this.e)) {
                stringBuilder2.append(this.e);
            } else if (stringBuilder2.length() > 0) {
                stringBuilder2.setLength(stringBuilder2.length() - 1);
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    Map<String, String> d() {
        Map<String, String> map;
        synchronized (this.d) {
            uh e = u.i().e();
            if (e == null || this.g == null) {
                map = this.c;
            } else {
                map = e.a(this.c, this.g.d());
            }
        }
        return map;
    }

    public ul e() {
        ul ulVar;
        synchronized (this.d) {
            ulVar = this.f;
        }
        return ulVar;
    }
}
