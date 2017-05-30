package com.google.android.gms.internal;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.s;

public class aih {
    private final Object a;

    public aih(Activity activity) {
        d.a(activity, "Activity must not be null");
        boolean z = s.a() || (activity instanceof FragmentActivity);
        d.b(z, "This Activity is not supported before platform version 11 (3.0 Honeycomb). Please use FragmentActivity instead.");
        this.a = activity;
    }

    public boolean a() {
        return this.a instanceof FragmentActivity;
    }

    public Activity b() {
        return (Activity) this.a;
    }

    public FragmentActivity c() {
        return (FragmentActivity) this.a;
    }
}
