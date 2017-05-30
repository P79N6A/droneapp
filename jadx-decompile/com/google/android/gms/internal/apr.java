package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;
import java.util.HashMap;
import java.util.Map;

public class apr {
    private apr a;
    private Map<String, ea> b;

    public apr() {
        this(null);
    }

    private apr(@Nullable apr com_google_android_gms_internal_apr) {
        this.b = null;
        this.a = com_google_android_gms_internal_apr;
    }

    public apr a() {
        return new apr(this);
    }

    public void a(String str, ea<?> eaVar) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(str, eaVar);
    }

    public boolean a(String str) {
        return (this.b == null || !this.b.containsKey(str)) ? this.a != null ? this.a.a(str) : false : true;
    }

    public ea<?> b(String str) {
        if (this.b != null && this.b.containsKey(str)) {
            return (ea) this.b.get(str);
        }
        if (this.a != null) {
            return this.a.b(str);
        }
        String str2 = "Trying to get a non existent symbol: ";
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public void b(String str, ea<?> eaVar) {
        if (this.b != null && this.b.containsKey(str)) {
            this.b.put(str, eaVar);
        } else if (this.a == null) {
            String str2 = "Trying to modify a non existent symbol: ";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else {
            this.a.b(str, eaVar);
        }
    }

    public void c(String str) {
        d.a(a(str));
        if (this.b == null || !this.b.containsKey(str)) {
            this.a.c(str);
        } else {
            this.b.remove(str);
        }
    }
}
