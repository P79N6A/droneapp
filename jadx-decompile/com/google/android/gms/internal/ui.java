package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.text.TextUtils;

@aaa
public class ui {
    @Nullable
    public uh a(@Nullable ug ugVar) {
        if (ugVar == null) {
            throw new IllegalArgumentException("CSI configuration can't be null. ");
        } else if (!ugVar.a()) {
            abr.e("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        } else if (ugVar.c() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(ugVar.d())) {
            return new uh(ugVar.c(), ugVar.d(), ugVar.b(), ugVar.e());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
