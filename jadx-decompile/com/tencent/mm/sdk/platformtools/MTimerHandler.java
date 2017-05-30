package com.tencent.mm.sdk.platformtools;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class MTimerHandler extends Handler {
    private static int av;
    private final boolean aG;
    private long aH = 0;
    private final CallBack aI;
    private final int aw;

    public interface CallBack {
        boolean onTimerExpired();
    }

    public MTimerHandler(Looper looper, CallBack callBack, boolean z) {
        super(looper);
        this.aI = callBack;
        this.aw = d();
        this.aG = z;
    }

    public MTimerHandler(CallBack callBack, boolean z) {
        this.aI = callBack;
        this.aw = d();
        this.aG = z;
    }

    private static int d() {
        if (av >= 8192) {
            av = 0;
        }
        int i = av + 1;
        av = i;
        return i;
    }

    protected void finalize() {
        stopTimer();
        super.finalize();
    }

    public void handleMessage(Message message) {
        if (message.what == this.aw && this.aI != null && this.aI.onTimerExpired() && this.aG) {
            sendEmptyMessageDelayed(this.aw, this.aH);
        }
    }

    public void startTimer(long j) {
        this.aH = j;
        stopTimer();
        sendEmptyMessageDelayed(this.aw, j);
    }

    public void stopTimer() {
        removeMessages(this.aw);
    }

    public boolean stopped() {
        return !hasMessages(this.aw);
    }
}
