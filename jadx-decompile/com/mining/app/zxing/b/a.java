package com.mining.app.zxing.b;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.util.Log;
import com.fimi.overseas.soul.R;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.mining.app.zxing.a.c;
import com.mining.app.zxing.activity.MipcaActivityCapture;
import java.util.Vector;

public final class a extends Handler {
    private static final String a = a.class.getSimpleName();
    private final MipcaActivityCapture b;
    private final d c;
    private a d = a.b;

    public a(MipcaActivityCapture mipcaActivityCapture, Vector<BarcodeFormat> vector, String str) {
        this.b = mipcaActivityCapture;
        this.c = new d(mipcaActivityCapture, vector, str, new com.mining.app.zxing.view.a(mipcaActivityCapture.a()));
        this.c.start();
        c.a().c();
        b();
    }

    private void b() {
        if (this.d == a.b) {
            this.d = a.a;
            c.a().a(this.c.a(), R.id.decode);
            c.a().b(this, R.id.auto_focus);
            this.b.c();
        }
    }

    public void a() {
        this.d = a.c;
        c.a().d();
        Message.obtain(this.c.a(), R.id.quit).sendToTarget();
        try {
            this.c.join();
        } catch (InterruptedException e) {
        }
        removeMessages(R.id.decode_succeeded);
        removeMessages(R.id.decode_failed);
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case R.id.auto_focus:
                if (this.d == a.a) {
                    c.a().b(this, R.id.auto_focus);
                    return;
                }
                return;
            case R.id.decode_failed:
                this.d = a.a;
                c.a().a(this.c.a(), R.id.decode);
                return;
            case R.id.decode_succeeded:
                Log.d(a, "Got decode succeeded message");
                this.d = a.b;
                Bundle data = message.getData();
                this.b.a((Result) message.obj, data == null ? null : (Bitmap) data.getParcelable(d.a));
                return;
            case R.id.launch_product_query:
                Log.d(a, "Got product query message");
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) message.obj));
                intent.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
                this.b.startActivity(intent);
                return;
            case R.id.restart_preview:
                Log.d(a, "Got restart preview message");
                b();
                return;
            case R.id.return_scan_result:
                Log.d(a, "Got return scan result message");
                this.b.setResult(-1, (Intent) message.obj);
                this.b.finish();
                return;
            default:
                return;
        }
    }
}
