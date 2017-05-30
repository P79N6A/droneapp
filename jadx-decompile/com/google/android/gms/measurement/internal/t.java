package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import java.util.Iterator;

public class t {
    final String a;
    final String b;
    final String c;
    final long d;
    final long e;
    final EventParams f;

    t(aj ajVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        d.a(str2);
        d.a(str3);
        this.a = str2;
        this.b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.c = str;
        this.d = j;
        this.e = j2;
        if (this.e != 0 && this.e > this.d) {
            ajVar.f().z().a("Event created with reverse previous/current timestamps");
        }
        this.f = a(ajVar, bundle);
    }

    private t(aj ajVar, String str, String str2, String str3, long j, long j2, EventParams eventParams) {
        d.a(str2);
        d.a(str3);
        d.a(eventParams);
        this.a = str2;
        this.b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.c = str;
        this.d = j;
        this.e = j2;
        if (this.e != 0 && this.e > this.d) {
            ajVar.f().z().a("Event created with reverse previous/current timestamps");
        }
        this.f = eventParams;
    }

    static EventParams a(aj ajVar, Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return new EventParams(new Bundle());
        }
        Bundle bundle2 = new Bundle(bundle);
        Iterator it = bundle2.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                ajVar.f().f().a("Param name can't be null");
                it.remove();
            } else {
                Object b = ajVar.o().b(str, bundle2.get(str));
                if (b == null) {
                    ajVar.f().z().a("Param value can't be null", str);
                    it.remove();
                } else {
                    ajVar.o().a(bundle2, str, b);
                }
            }
        }
        return new EventParams(bundle2);
    }

    t a(aj ajVar, long j) {
        return new t(ajVar, this.c, this.a, this.b, this.d, j, this.f);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.f);
        return new StringBuilder(((String.valueOf(str).length() + 33) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("Event{appId='").append(str).append("'").append(", name='").append(str2).append("'").append(", params=").append(valueOf).append("}").toString();
    }
}
