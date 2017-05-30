package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.d;
import java.lang.ref.WeakReference;

public class aiw<R extends m> extends q<R> implements n<R> {
    private p<? super R, ? extends m> a = null;
    private aiw<? extends m> b = null;
    private volatile o<? super R> c = null;
    private i<R> d = null;
    private final Object e = new Object();
    private Status f = null;
    private final WeakReference<g> g;
    private final a h;
    private boolean i = false;

    private final class a extends Handler {
        final /* synthetic */ aiw a;

        public a(aiw com_google_android_gms_internal_aiw, Looper looper) {
            this.a = com_google_android_gms_internal_aiw;
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    i iVar = (i) message.obj;
                    synchronized (this.a.e) {
                        if (iVar == null) {
                            this.a.b.a(new Status(13, "Transform returned null"));
                        } else if (iVar instanceof ais) {
                            this.a.b.a(((ais) iVar).b());
                        } else {
                            this.a.b.a(iVar);
                        }
                    }
                    return;
                case 1:
                    RuntimeException runtimeException = (RuntimeException) message.obj;
                    String str = "TransformedResultImpl";
                    String str2 = "Runtime exception on the transformation worker thread: ";
                    String valueOf = String.valueOf(runtimeException.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    throw runtimeException;
                default:
                    Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + message.what);
                    return;
            }
        }
    }

    public aiw(WeakReference<g> weakReference) {
        d.a(weakReference, "GoogleApiClient reference must not be null");
        this.g = weakReference;
        g gVar = (g) this.g.get();
        this.h = new a(this, gVar != null ? gVar.c() : Looper.getMainLooper());
    }

    private void a(Status status) {
        synchronized (this.e) {
            this.f = status;
            b(this.f);
        }
    }

    private void b() {
        if (this.a != null || this.c != null) {
            g gVar = (g) this.g.get();
            if (!(this.i || this.a == null || gVar == null)) {
                gVar.a(this);
                this.i = true;
            }
            if (this.f != null) {
                b(this.f);
            } else if (this.d != null) {
                this.d.a(this);
            }
        }
    }

    private void b(Status status) {
        synchronized (this.e) {
            if (this.a != null) {
                Status a = this.a.a(status);
                d.a(a, "onFailure must not return null");
                this.b.a(a);
            } else if (c()) {
                this.c.a(status);
            }
        }
    }

    private void b(m mVar) {
        if (mVar instanceof k) {
            try {
                ((k) mVar).b();
            } catch (Throwable e) {
                String valueOf = String.valueOf(mVar);
                Log.w("TransformedResultImpl", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf).toString(), e);
            }
        }
    }

    private boolean c() {
        return (this.c == null || ((g) this.g.get()) == null) ? false : true;
    }

    @NonNull
    public <S extends m> q<S> a(@NonNull p<? super R, ? extends S> pVar) {
        q com_google_android_gms_internal_aiw;
        boolean z = true;
        synchronized (this.e) {
            d.a(this.a == null, "Cannot call then() twice.");
            if (this.c != null) {
                z = false;
            }
            d.a(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.a = pVar;
            com_google_android_gms_internal_aiw = new aiw(this.g);
            this.b = com_google_android_gms_internal_aiw;
            b();
        }
        return com_google_android_gms_internal_aiw;
    }

    void a() {
        this.c = null;
    }

    public void a(i<?> iVar) {
        synchronized (this.e) {
            this.d = iVar;
            b();
        }
    }

    public void a(final R r) {
        synchronized (this.e) {
            if (!r.a().f()) {
                a(r.a());
                b((m) r);
            } else if (this.a != null) {
                air.a().submit(new Runnable(this) {
                    final /* synthetic */ aiw b;

                    @WorkerThread
                    public void run() {
                        g gVar;
                        try {
                            ahn.i.set(Boolean.valueOf(true));
                            this.b.h.sendMessage(this.b.h.obtainMessage(0, this.b.a.a(r)));
                            ahn.i.set(Boolean.valueOf(false));
                            this.b.b(r);
                            gVar = (g) this.b.g.get();
                            if (gVar != null) {
                                gVar.b(this.b);
                            }
                        } catch (RuntimeException e) {
                            this.b.h.sendMessage(this.b.h.obtainMessage(1, e));
                            ahn.i.set(Boolean.valueOf(false));
                            this.b.b(r);
                            gVar = (g) this.b.g.get();
                            if (gVar != null) {
                                gVar.b(this.b);
                            }
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            ahn.i.set(Boolean.valueOf(false));
                            this.b.b(r);
                            gVar = (g) this.b.g.get();
                            if (gVar != null) {
                                gVar.b(this.b);
                            }
                        }
                    }
                });
            } else if (c()) {
                this.c.b(r);
            }
        }
    }

    public void a(@NonNull o<? super R> oVar) {
        boolean z = true;
        synchronized (this.e) {
            d.a(this.c == null, "Cannot call andFinally() twice.");
            if (this.a != null) {
                z = false;
            }
            d.a(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.c = oVar;
            b();
        }
    }
}
