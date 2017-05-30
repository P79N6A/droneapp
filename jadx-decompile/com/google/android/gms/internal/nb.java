package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.firebase.appindexing.g;
import com.google.firebase.b;
import java.util.Random;

public class nb {
    static nd a = new ne();
    static e b = new h();
    private static Random c = new Random();
    private b d;
    private long e;
    private volatile boolean f;

    public nb(b bVar, long j) {
        this.d = bVar;
        this.e = j;
    }

    public void a() {
        this.f = true;
    }

    public void a(@NonNull nk nkVar) {
        a(nkVar, true);
    }

    public void a(@NonNull nk nkVar, boolean z) {
        d.a(nkVar);
        long b = b.b() + this.e;
        if (z) {
            nkVar.a(ng.a(this.d), this.d.a());
        } else {
            nkVar.b(ng.a(this.d));
        }
        int i = 1000;
        while (b.b() + ((long) i) <= b && !nkVar.h() && a(nkVar.g())) {
            try {
                a.a(c.nextInt(it.a.a.e.G) + i);
                if (i < g.g) {
                    if (nkVar.g() != -2) {
                        i *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i = 1000;
                    }
                }
                if (!this.f) {
                    nkVar.a();
                    if (z) {
                        nkVar.a(ng.a(this.d), this.d.a());
                    } else {
                        nkVar.b(ng.a(this.d));
                    }
                } else {
                    return;
                }
            } catch (InterruptedException e) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public boolean a(int i) {
        return (i >= 500 && i < 600) || i == -2 || i == 429;
    }

    public void b() {
        this.f = false;
    }
}
