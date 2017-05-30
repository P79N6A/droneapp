package com.google.android.gms.internal;

import android.content.SharedPreferences;

class ub$2 extends ub<Integer> {
    ub$2(int i, String str, Integer num) {
        super(i, str, num, null);
    }

    public /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return b(sharedPreferences);
    }

    public Integer b(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(a(), ((Integer) b()).intValue()));
    }
}
