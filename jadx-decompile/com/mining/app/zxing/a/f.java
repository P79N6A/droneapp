package com.mining.app.zxing.a;

import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.os.Handler;
import android.util.Log;

final class f implements PreviewCallback {
    private static final String a = f.class.getSimpleName();
    private final b b;
    private final boolean c;
    private Handler d;
    private int e;

    f(b bVar, boolean z) {
        this.b = bVar;
        this.c = z;
    }

    void a(Handler handler, int i) {
        this.d = handler;
        this.e = i;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point a = this.b.a();
        if (!this.c) {
            camera.setPreviewCallback(null);
        }
        if (this.d != null) {
            this.d.obtainMessage(this.e, a.x, a.y, bArr).sendToTarget();
            this.d = null;
            return;
        }
        Log.d(a, "Got preview callback, but no handler for it");
    }
}
