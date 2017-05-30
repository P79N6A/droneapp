package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.util.e;
import com.google.android.gms.tagmanager.aj;
import java.util.Date;
import java.util.Map;

public class aow implements e {
    private final Bundle a;
    private final String b;
    private final Date c;
    private final String d;
    private Map<String, Object> e;
    private boolean f;
    private final aj g;

    public aow(@Nullable String str, @Nullable Bundle bundle, String str2, Date date, boolean z, aj ajVar) {
        this.b = str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.a = bundle;
        this.c = date;
        this.d = str2;
        this.f = z;
        this.g = ajVar;
    }

    public long a() {
        return this.c.getTime();
    }

    public void a(boolean z) {
        this.f = z;
    }

    public long b() {
        return SystemClock.elapsedRealtime();
    }

    public long c() {
        return System.nanoTime();
    }

    public String d() {
        return this.b;
    }

    public Bundle e() {
        return this.a;
    }

    public String f() {
        return this.d;
    }

    @WorkerThread
    public Map<String, Object> g() {
        if (this.e == null) {
            try {
                this.e = this.g.a();
            } catch (RemoteException e) {
                String str = "Error calling measurement proxy:";
                String valueOf = String.valueOf(e.getMessage());
                aph.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        return this.e;
    }

    public boolean h() {
        return this.f;
    }
}
