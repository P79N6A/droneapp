package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.internal.kt.a;
import java.util.List;

public class kq extends kr {
    public kq(a aVar, List<String> list) {
        super(aVar, list);
    }

    protected String a(a aVar, String str, String str2, long j) {
        return str2;
    }

    protected void a(String str, String str2) {
        Log.e(str, str2);
    }

    protected void b(String str, String str2) {
        Log.w(str, str2);
    }

    protected void c(String str, String str2) {
        Log.i(str, str2);
    }

    protected void d(String str, String str2) {
        Log.d(str, str2);
    }
}
