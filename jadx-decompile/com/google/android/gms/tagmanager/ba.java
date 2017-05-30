package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class ba extends t {
    private static final String a = eg.MOBILE_ADWORDS_UNIQUE_ID.toString();
    private final Context b;

    public ba(Context context) {
        super(a, new String[0]);
        this.b = context;
    }

    public a a(Map<String, a> map) {
        Object a = a(this.b);
        return a == null ? cw.g() : cw.f(a);
    }

    protected String a(Context context) {
        return Secure.getString(context.getContentResolver(), "android_id");
    }

    public boolean a() {
        return true;
    }
}
