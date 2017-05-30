package com.google.android.gms.internal;

import android.content.SharedPreferences;

class ub$1 extends ub<Boolean> {
    ub$1(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    public /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return b(sharedPreferences);
    }

    public Boolean b(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(a(), ((Boolean) b()).booleanValue()));
    }
}
