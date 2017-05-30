package com.google.android.gms.internal;

import android.content.SharedPreferences;

class ub$4 extends ub<String> {
    ub$4(int i, String str, String str2) {
        super(i, str, str2, null);
    }

    public /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return b(sharedPreferences);
    }

    public String b(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(a(), (String) b());
    }
}
