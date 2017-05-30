package com.google.android.gms.contextmanager.fence.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.awareness.fence.i;
import com.google.android.gms.common.internal.d;

public class e extends com.google.android.gms.contextmanager.fence.internal.m.a {
    public static final com.google.android.gms.internal.sx.a<i, e> a = new com.google.android.gms.internal.sx.a<i, e>() {
        public e a(i iVar, Looper looper) {
            return new e(iVar, looper);
        }
    };
    private final i b;
    private final Handler c;

    private static class a implements Runnable {
        private final i a;
        private final FenceTriggerInfoImpl b;

        public a(i iVar, FenceTriggerInfoImpl fenceTriggerInfoImpl) {
            this.a = (i) d.a(iVar);
            this.b = (FenceTriggerInfoImpl) d.a(fenceTriggerInfoImpl);
        }

        public void run() {
            this.a.a(this.b.c(), this.b.b());
        }
    }

    private e(i iVar, Looper looper) {
        this.b = (i) d.a(iVar);
        this.c = com.google.android.gms.contextmanager.internal.d.a((Looper) d.a(looper));
    }

    public void a(FenceTriggerInfoImpl fenceTriggerInfoImpl) {
        this.c.post(new a(this.b, fenceTriggerInfoImpl));
    }
}
