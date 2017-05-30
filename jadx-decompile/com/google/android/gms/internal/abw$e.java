package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;

@TargetApi(18)
public class abw$e extends abw$d {
    public boolean a(View view) {
        return super.a(view) || view.getWindowId() != null;
    }

    public int c() {
        return 14;
    }
}
