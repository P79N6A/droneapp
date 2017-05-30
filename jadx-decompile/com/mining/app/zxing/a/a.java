package com.mining.app.zxing.a;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.os.Handler;
import android.util.Log;

final class a implements AutoFocusCallback {
    private static final String a = a.class.getSimpleName();
    private static final long b = 1500;
    private Handler c;
    private int d;

    a() {
    }

    void a(Handler handler, int i) {
        this.c = handler;
        this.d = i;
    }

    public void onAutoFocus(boolean z, Camera camera) {
        if (this.c != null) {
            this.c.sendMessageDelayed(this.c.obtainMessage(this.d, Boolean.valueOf(z)), b);
            this.c = null;
            return;
        }
        Log.d(a, "Got auto-focus callback, but no handler for it");
    }
}
