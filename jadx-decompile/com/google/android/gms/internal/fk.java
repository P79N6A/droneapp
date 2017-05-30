package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

public abstract class fk {
    private static final ThreadLocal<fk> a = new ThreadLocal<fk>() {
        protected fk a() {
            if (VERSION.SDK_INT >= 16) {
                return new c();
            }
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                return new b(myLooper);
            }
            throw new IllegalStateException("The current thread must have a looper!");
        }

        protected /* synthetic */ Object initialValue() {
            return a();
        }
    };

    public static abstract class a {
        private Runnable a;
        private FrameCallback b;

        @TargetApi(16)
        FrameCallback a() {
            if (this.b == null) {
                this.b = new FrameCallback(this) {
                    final /* synthetic */ a a;

                    {
                        this.a = r1;
                    }

                    public void doFrame(long j) {
                        this.a.a(j);
                    }
                };
            }
            return this.b;
        }

        public abstract void a(long j);

        Runnable b() {
            if (this.a == null) {
                this.a = new Runnable(this) {
                    final /* synthetic */ a a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.a(System.nanoTime());
                    }
                };
            }
            return this.a;
        }
    }

    private static class b extends fk {
        private Handler a;

        public b(Looper looper) {
            this.a = new Handler(looper);
        }

        public void a(a aVar) {
            this.a.postDelayed(aVar.b(), 0);
        }
    }

    @TargetApi(16)
    private static class c extends fk {
        private Choreographer a = Choreographer.getInstance();

        public void a(a aVar) {
            this.a.postFrameCallback(aVar.a());
        }
    }

    public static fk a() {
        return (fk) a.get();
    }

    public abstract void a(a aVar);
}
