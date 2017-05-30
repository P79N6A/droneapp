package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

@aaa
public class um {
    private final Map<String, ul> a = new HashMap();
    @Nullable
    private final un b;

    public um(@Nullable un unVar) {
        this.b = unVar;
    }

    @Nullable
    public un a() {
        return this.b;
    }

    public void a(String str, ul ulVar) {
        this.a.put(str, ulVar);
    }

    public void a(String str, String str2, long j) {
        uj.a(this.b, (ul) this.a.get(str2), j, str);
        this.a.put(str, uj.a(this.b, j));
    }
}
