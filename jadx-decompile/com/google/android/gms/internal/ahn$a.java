package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;

public class ahn$a<R extends m> extends Handler {
    public ahn$a() {
        this(Looper.getMainLooper());
    }

    public ahn$a(Looper looper) {
        super(looper);
    }

    public void a() {
        removeMessages(2);
    }

    public void a(n<? super R> nVar, R r) {
        sendMessage(obtainMessage(1, new Pair(nVar, r)));
    }

    public void a(ahn<R> com_google_android_gms_internal_ahn_R, long j) {
        sendMessageDelayed(obtainMessage(2, com_google_android_gms_internal_ahn_R), j);
    }

    protected void b(n<? super R> nVar, R r) {
        try {
            nVar.a(r);
        } catch (RuntimeException e) {
            ahn.c(r);
            throw e;
        }
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                Pair pair = (Pair) message.obj;
                b((n) pair.first, (m) pair.second);
                return;
            case 2:
                ((ahn) message.obj).d(Status.d);
                return;
            default:
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
                return;
        }
    }
}
