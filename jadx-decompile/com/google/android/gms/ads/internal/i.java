package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abu;
import com.google.android.gms.internal.oq;
import com.google.android.gms.internal.rn;
import com.google.android.gms.internal.uf;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@aaa
class i implements oq, Runnable {
    CountDownLatch a = new CountDownLatch(1);
    private final List<Object[]> b = new Vector();
    private final AtomicReference<oq> c = new AtomicReference();
    private v d;

    public i(v vVar) {
        this.d = vVar;
        if (ac.a().b()) {
            abu.a((Runnable) this);
        } else {
            run();
        }
    }

    private Context b(Context context) {
        if (!((Boolean) uf.n.c()).booleanValue()) {
            return context;
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    private void b() {
        if (!this.b.isEmpty()) {
            for (Object[] objArr : this.b) {
                if (objArr.length == 1) {
                    ((oq) this.c.get()).a((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((oq) this.c.get()).a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.b.clear();
        }
    }

    protected oq a(String str, Context context, boolean z) {
        return rn.a(str, context, z);
    }

    public String a(Context context) {
        if (a()) {
            oq oqVar = (oq) this.c.get();
            if (oqVar != null) {
                b();
                return oqVar.a(b(context));
            }
        }
        return "";
    }

    public String a(Context context, String str, View view) {
        if (a()) {
            oq oqVar = (oq) this.c.get();
            if (oqVar != null) {
                b();
                return oqVar.a(b(context), str, view);
            }
        }
        return "";
    }

    public void a(int i, int i2, int i3) {
        oq oqVar = (oq) this.c.get();
        if (oqVar != null) {
            b();
            oqVar.a(i, i2, i3);
            return;
        }
        this.b.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public void a(MotionEvent motionEvent) {
        oq oqVar = (oq) this.c.get();
        if (oqVar != null) {
            b();
            oqVar.a(motionEvent);
            return;
        }
        this.b.add(new Object[]{motionEvent});
    }

    protected void a(oq oqVar) {
        this.c.set(oqVar);
    }

    protected boolean a() {
        try {
            this.a.await();
            return true;
        } catch (Throwable e) {
            b.d("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public void run() {
        try {
            boolean z = !((Boolean) uf.F.c()).booleanValue() || this.d.e.e;
            a(a(this.d.e.b, b(this.d.c), z));
        } finally {
            this.a.countDown();
            this.d = null;
        }
    }
}
