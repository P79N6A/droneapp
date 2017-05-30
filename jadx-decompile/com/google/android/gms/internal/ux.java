package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

public class ux implements aeg {
    private final Executor a;

    private class a implements Runnable {
        final /* synthetic */ ux a;
        private final abd b;
        private final adf c;
        private final Runnable d;

        public a(ux uxVar, abd com_google_android_gms_internal_abd, adf com_google_android_gms_internal_adf, Runnable runnable) {
            this.a = uxVar;
            this.b = com_google_android_gms_internal_abd;
            this.c = com_google_android_gms_internal_adf;
            this.d = runnable;
        }

        public void run() {
            if (this.b.f()) {
                this.b.c("canceled-at-delivery");
                return;
            }
            if (this.c.a()) {
                this.b.a(this.c.a);
            } else {
                this.b.b(this.c.c);
            }
            if (this.c.d) {
                this.b.b("intermediate-response");
            } else {
                this.b.c("done");
            }
            if (this.d != null) {
                this.d.run();
            }
        }
    }

    public ux(final Handler handler) {
        this.a = new Executor(this) {
            final /* synthetic */ ux b;

            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public void a(abd<?> com_google_android_gms_internal_abd_, adf<?> com_google_android_gms_internal_adf_) {
        a(com_google_android_gms_internal_abd_, com_google_android_gms_internal_adf_, null);
    }

    public void a(abd<?> com_google_android_gms_internal_abd_, adf<?> com_google_android_gms_internal_adf_, Runnable runnable) {
        com_google_android_gms_internal_abd_.t();
        com_google_android_gms_internal_abd_.b("post-response");
        this.a.execute(new a(this, com_google_android_gms_internal_abd_, com_google_android_gms_internal_adf_, runnable));
    }

    public void a(abd<?> com_google_android_gms_internal_abd_, aii com_google_android_gms_internal_aii) {
        com_google_android_gms_internal_abd_.b("post-error");
        this.a.execute(new a(this, com_google_android_gms_internal_abd_, adf.a(com_google_android_gms_internal_aii), null));
    }
}
