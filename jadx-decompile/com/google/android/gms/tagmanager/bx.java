package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class bx extends t {
    private static final String a = eg.RESOLUTION.toString();
    private final Context b;

    public bx(Context context) {
        super(a, new String[0]);
        this.b = context;
    }

    public a a(Map<String, a> map) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.b.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        return cw.f(i + "x" + displayMetrics.heightPixels);
    }

    public boolean a() {
        return true;
    }
}
