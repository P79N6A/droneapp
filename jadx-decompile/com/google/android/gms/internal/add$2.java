package com.google.android.gms.internal;

class add$2 implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ add c;

    add$2(add com_google_android_gms_internal_add, int i, int i2) {
        this.c = com_google_android_gms_internal_add;
        this.a = i;
        this.b = i2;
    }

    public void run() {
        boolean z = false;
        synchronized (add.b(this.c)) {
            boolean z2 = this.a != this.b;
            boolean z3 = !add.c(this.c) && this.b == 1;
            boolean z4 = z2 && this.b == 1;
            boolean z5 = z2 && this.b == 2;
            z2 = z2 && this.b == 3;
            add com_google_android_gms_internal_add = this.c;
            if (add.c(this.c) || z3) {
                z = true;
            }
            add.a(com_google_android_gms_internal_add, z);
            if (add.d(this.c) == null) {
                return;
            }
            if (z3) {
                try {
                    add.d(this.c).a();
                } catch (Throwable e) {
                    abr.d("Unable to call onVideoStart()", e);
                }
            }
            if (z4) {
                try {
                    add.d(this.c).b();
                } catch (Throwable e2) {
                    abr.d("Unable to call onVideoPlay()", e2);
                }
            }
            if (z5) {
                try {
                    add.d(this.c).c();
                } catch (Throwable e22) {
                    abr.d("Unable to call onVideoPause()", e22);
                }
            }
            if (z2) {
                try {
                    add.d(this.c).d();
                } catch (Throwable e222) {
                    abr.d("Unable to call onVideoEnd()", e222);
                }
            }
        }
    }
}
