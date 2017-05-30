package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.df.a;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class pr implements oq {
    protected MotionEvent a;
    protected LinkedList<MotionEvent> b = new LinkedList();
    protected long c = 0;
    protected long d = 0;
    protected long e = 0;
    protected long f = 0;
    protected long g = 0;
    protected long h = 0;
    protected long i = 0;
    protected boolean j = false;
    protected DisplayMetrics k;
    private boolean l = false;

    protected pr(Context context) {
        try {
            ln.a();
            this.k = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
        }
    }

    private String a(Context context, String str, boolean z, View view) {
        boolean z2 = true;
        if (z) {
            try {
                a a = a(context, view);
                this.l = true;
            } catch (NoSuchAlgorithmException e) {
                return Integer.toString(7);
            } catch (UnsupportedEncodingException e2) {
                return Integer.toString(7);
            } catch (Throwable th) {
                return Integer.toString(3);
            }
        }
        a = b(context);
        if (a == null || a.g() == 0) {
            return Integer.toString(5);
        }
        if (a(z)) {
            z2 = false;
        }
        return ln.a(a, str, z2);
    }

    private static boolean a(rx rxVar) {
        return (rxVar == null || rxVar.d == null || rxVar.g == null) ? false : true;
    }

    private static boolean a(boolean z) {
        return !((Boolean) uf.bc.c()).booleanValue() ? true : ((Boolean) uf.bu.c()).booleanValue() && z;
    }

    private boolean b(rx rxVar) {
        return (this.k == null || rxVar == null || rxVar.e == null || rxVar.h == null) ? false : true;
    }

    protected abstract long a(StackTraceElement[] stackTraceElementArr);

    protected abstract a a(Context context, View view);

    public String a(Context context) {
        return a(context, null, false, null);
    }

    public String a(Context context, String str) {
        return a(context, str, null);
    }

    public String a(Context context, String str, View view) {
        return a(context, str, true, view);
    }

    public void a(int i, int i2, int i3) {
        if (this.a != null) {
            this.a.recycle();
        }
        if (this.k != null) {
            this.a = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * this.k.density, ((float) i2) * this.k.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.a = null;
        }
        this.j = false;
    }

    public void a(MotionEvent motionEvent) {
        if (this.l) {
            this.f = 0;
            this.e = 0;
            this.d = 0;
            this.c = 0;
            this.g = 0;
            this.i = 0;
            this.h = 0;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.b.clear();
            this.a = null;
            this.l = false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.c++;
                break;
            case 1:
                this.a = MotionEvent.obtain(motionEvent);
                this.b.add(this.a);
                if (this.b.size() > 6) {
                    ((MotionEvent) this.b.remove()).recycle();
                }
                this.e++;
                try {
                    this.g = a(new Throwable().getStackTrace());
                    break;
                } catch (rs e) {
                    break;
                }
            case 2:
                this.d += (long) (motionEvent.getHistorySize() + 1);
                if (((Boolean) uf.bk.c()).booleanValue() || ((Boolean) uf.bf.c()).booleanValue()) {
                    try {
                        rx b = b(motionEvent);
                        if (a(b)) {
                            this.h += b.d.longValue() + b.g.longValue();
                        }
                        if (b(b)) {
                            this.i = (b.h.longValue() + b.e.longValue()) + this.i;
                            break;
                        }
                    } catch (rs e2) {
                        break;
                    }
                }
                break;
            case 3:
                this.f++;
                break;
        }
        this.j = true;
    }

    protected abstract a b(Context context);

    protected abstract rx b(MotionEvent motionEvent);
}
