package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.VisibleForTesting;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.internal.d;
import com.tencent.mm.sdk.platformtools.Util;
import java.util.Random;

public class aos {
    private final Context a;
    private final Random b;
    private final String c;

    public aos(Context context, String str) {
        this(context, str, new Random());
    }

    @VisibleForTesting
    aos(Context context, String str, Random random) {
        this.a = (Context) d.a(context);
        this.c = (String) d.a(str);
        this.b = random;
    }

    private long a(long j, long j2) {
        SharedPreferences g = g();
        long max = Math.max(0, g.getLong("FORBIDDEN_COUNT", 0));
        return (long) (((float) (((long) ((((float) max) / ((float) ((Math.max(0, g.getLong("SUCCESSFUL_COUNT", 0)) + max) + 1))) * ((float) (j2 - j)))) + j)) * this.b.nextFloat());
    }

    private SharedPreferences g() {
        Context context = this.a;
        String valueOf = String.valueOf("v5_gtmContainerRefreshPolicy_");
        String valueOf2 = String.valueOf(this.c);
        return context.getSharedPreferences(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), 0);
    }

    public long a() {
        return 43200000 + a(7200000, 259200000);
    }

    public long b() {
        return Util.MILLSECONDS_OF_HOUR + a(600000, 86400000);
    }

    public long c() {
        return Math.max(0, g().getLong("FORBIDDEN_COUNT", 0)) == 0 ? 0 : a(NotificationOptions.a, 600000) + NotificationOptions.a;
    }

    public boolean d() {
        return Math.max(0, g().getLong("FORBIDDEN_COUNT", 0)) > 0;
    }

    @SuppressLint({"CommitPrefEdits"})
    public void e() {
        SharedPreferences g = g();
        long j = g.getLong("FORBIDDEN_COUNT", 0);
        long j2 = g.getLong("SUCCESSFUL_COUNT", 0);
        Editor edit = g.edit();
        long min = j == 0 ? 3 : Math.min(10, 1 + j);
        j = Math.max(0, Math.min(j2, 10 - min));
        edit.putLong("FORBIDDEN_COUNT", min);
        edit.putLong("SUCCESSFUL_COUNT", j);
        apv.a(edit);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void f() {
        SharedPreferences g = g();
        long j = g.getLong("SUCCESSFUL_COUNT", 0);
        long j2 = g.getLong("FORBIDDEN_COUNT", 0);
        j = Math.min(10, j + 1);
        j2 = Math.max(0, Math.min(j2, 10 - j));
        Editor edit = g.edit();
        edit.putLong("SUCCESSFUL_COUNT", j);
        edit.putLong("FORBIDDEN_COUNT", j2);
        apv.a(edit);
    }
}
