package com.google.android.gms.internal;

import android.content.SharedPreferences;

class ub$3 extends ub<Long> {
    ub$3(int i, String str, Long l) {
        super(i, str, l, null);
    }

    public /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return b(sharedPreferences);
    }

    public Long b(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(a(), ((Long) b()).longValue()));
    }
}
