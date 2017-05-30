package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.HashMap;
import java.util.Map;

public class em {
    Map<String, Object> a;
    private final Context b;
    private final eo c;
    private final e d;
    private String e;
    private final Map<String, Object> f;

    public em(Context context) {
        this(context, new HashMap(), new eo(context), h.d());
    }

    em(Context context, Map<String, Object> map, eo eoVar, e eVar) {
        this.e = null;
        this.a = new HashMap();
        this.b = context;
        this.d = eVar;
        this.c = eoVar;
        this.f = map;
    }

    public void a(String str) {
        this.e = str;
    }
}
