package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.RawRes;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.i;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class f {
    private static f g;
    private final a a;
    private final Context b;
    private final e c;
    private final cl d;
    private final ConcurrentMap<String, dl> e;
    private final dq f;

    public interface a {
        dm a(Context context, f fVar, Looper looper, String str, int i, dq dqVar);
    }

    f(Context context, a aVar, e eVar, cl clVar) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.b = context.getApplicationContext();
        this.d = clVar;
        this.a = aVar;
        this.e = new ConcurrentHashMap();
        this.c = eVar;
        this.c.a(new b(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void a(Map<String, Object> map) {
                Object obj = map.get(e.b);
                if (obj != null) {
                    this.a.a(obj.toString());
                }
            }
        });
        this.c.a(new cj(this.b));
        this.f = new dq();
        c();
        d();
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public static f a(Context context) {
        f fVar;
        synchronized (f.class) {
            if (g == null) {
                if (context == null) {
                    aw.a("TagManager.getInstance requires non-null context.");
                    throw new NullPointerException();
                }
                g = new f(context, new a() {
                    public dm a(Context context, f fVar, Looper looper, String str, int i, dq dqVar) {
                        return new dm(context, fVar, looper, str, i, dqVar);
                    }
                }, new e(new du(context)), cm.c());
            }
            fVar = g;
        }
        return fVar;
    }

    private void a(String str) {
        for (dl a : this.e.values()) {
            a.a(str);
        }
    }

    @TargetApi(14)
    private void c() {
        if (VERSION.SDK_INT >= 14) {
            this.b.registerComponentCallbacks(new ComponentCallbacks2(this) {
                final /* synthetic */ f a;

                {
                    this.a = r1;
                }

                public void onConfigurationChanged(Configuration configuration) {
                }

                public void onLowMemory() {
                }

                public void onTrimMemory(int i) {
                    if (i == 20) {
                        this.a.b();
                    }
                }
            });
        }
    }

    private void d() {
        g.a(this.b);
    }

    public int a(dl dlVar) {
        this.e.put(dlVar.e(), dlVar);
        return this.e.size();
    }

    public i<b> a(String str, @RawRes int i) {
        i a = this.a.a(this.b, this, null, str, i, this.f);
        a.b();
        return a;
    }

    public i<b> a(String str, @RawRes int i, Handler handler) {
        i a = this.a.a(this.b, this, handler.getLooper(), str, i, this.f);
        a.b();
        return a;
    }

    public e a() {
        return this.c;
    }

    public void a(boolean z) {
        aw.a(z ? 2 : 5);
    }

    synchronized boolean a(Uri uri) {
        boolean z;
        bs a = bs.a();
        if (a.a(uri)) {
            String d = a.d();
            switch (a.b()) {
                case NONE:
                    dl dlVar = (dl) this.e.get(d);
                    if (dlVar != null) {
                        dlVar.b(null);
                        dlVar.d();
                        break;
                    }
                    break;
                case CONTAINER:
                case CONTAINER_DEBUG:
                    for (String str : this.e.keySet()) {
                        dl dlVar2 = (dl) this.e.get(str);
                        if (str.equals(d)) {
                            dlVar2.b(a.c());
                            dlVar2.d();
                        } else if (dlVar2.f() != null) {
                            dlVar2.b(null);
                            dlVar2.d();
                        }
                    }
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public i<b> b(String str, @RawRes int i) {
        i a = this.a.a(this.b, this, null, str, i, this.f);
        a.c();
        return a;
    }

    public i<b> b(String str, @RawRes int i, Handler handler) {
        i a = this.a.a(this.b, this, handler.getLooper(), str, i, this.f);
        a.c();
        return a;
    }

    public void b() {
        this.d.a();
    }

    public boolean b(dl dlVar) {
        return this.e.remove(dlVar.e()) != null;
    }

    public i<b> c(String str, @RawRes int i) {
        i a = this.a.a(this.b, this, null, str, i, this.f);
        a.g();
        return a;
    }

    public i<b> c(String str, @RawRes int i, Handler handler) {
        i a = this.a.a(this.b, this, handler.getLooper(), str, i, this.f);
        a.g();
        return a;
    }
}
