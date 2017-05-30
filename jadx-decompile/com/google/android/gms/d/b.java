package com.google.android.gms.d;

import android.content.Context;
import android.content.Intent;

public interface b {
    public static final String a = "com.google.android.gms.instantapps.DO_NOT_LAUNCH_INSTANT_APP";

    Intent a(Context context, String str, Intent intent);

    boolean a(Context context);
}
