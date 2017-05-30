package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.internal.hr.a;
import com.google.firebase.b;
import com.google.firebase.b$b;
import com.google.firebase.database.connection.idl.ConnectionConfig;
import com.google.firebase.database.connection.idl.c;
import com.google.firebase.database.d;
import com.google.firebase.database.g;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public class gw implements il {
    private final Context a;
    private final Set<String> b = new HashSet();
    private final b c;

    public gw(b bVar) {
        this.c = bVar;
        if (this.c == null) {
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
        }
        this.a = this.c.a();
    }

    public hr a(ic icVar, hn hnVar, hp hpVar, a aVar) {
        final hr a = c.a(this.a, new ConnectionConfig(hpVar, icVar.g(), icVar.f(), icVar.j(), g.g(), icVar.n()), hnVar, aVar);
        this.c.a(new b$b(this) {
            final /* synthetic */ gw b;

            public void a(boolean z) {
                if (z) {
                    a.d("app_in_background");
                } else {
                    a.e("app_in_background");
                }
            }
        });
        return a;
    }

    public hy a(ScheduledExecutorService scheduledExecutorService) {
        return new gu(this.c, scheduledExecutorService);
    }

    public ig a(ic icVar) {
        return new gv();
    }

    public jp a(ic icVar, String str) {
        String o = icVar.o();
        String stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(o).length()).append(str).append("_").append(o).toString();
        if (this.b.contains(stringBuilder)) {
            throw new d(new StringBuilder(String.valueOf(o).length() + 47).append("SessionPersistenceKey '").append(o).append("' has already been used.").toString());
        }
        this.b.add(stringBuilder);
        return new jm(icVar, new gx(this.a, icVar, stringBuilder), new jn(icVar.k()));
    }

    public kt a(ic icVar, kt.a aVar, List<String> list) {
        return new kq(aVar, list);
    }

    public ip b(ic icVar) {
        final ks a = icVar.a("RunLoop");
        return new me(this) {
            final /* synthetic */ gw b;

            public void a(final Throwable th) {
                final String b = me.b(th);
                a.a(b, th);
                new Handler(this.b.a.getMainLooper()).post(new Runnable(this) {
                    final /* synthetic */ AnonymousClass1 c;

                    public void run() {
                        throw new RuntimeException(b, th);
                    }
                });
                e().shutdownNow();
            }
        };
    }

    public String c(ic icVar) {
        return VERSION.SDK_INT + "/Android";
    }
}
