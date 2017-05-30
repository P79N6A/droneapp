package com.mining.app.zxing.b;

import android.os.Handler;
import android.os.Looper;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ResultPointCallback;
import com.mining.app.zxing.activity.MipcaActivityCapture;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

final class d extends Thread {
    public static final String a = "barcode_bitmap";
    private final MipcaActivityCapture b;
    private final Hashtable<DecodeHintType, Object> c = new Hashtable(3);
    private Handler d;
    private final CountDownLatch e = new CountDownLatch(1);

    d(MipcaActivityCapture mipcaActivityCapture, Vector<BarcodeFormat> vector, String str, ResultPointCallback resultPointCallback) {
        Object vector2;
        this.b = mipcaActivityCapture;
        if (vector == null || vector.isEmpty()) {
            vector2 = new Vector();
            vector2.addAll(b.b);
        }
        this.c.put(DecodeHintType.POSSIBLE_FORMATS, vector2);
        if (str != null) {
            this.c.put(DecodeHintType.CHARACTER_SET, str);
        }
        this.c.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, resultPointCallback);
    }

    Handler a() {
        try {
            this.e.await();
        } catch (InterruptedException e) {
        }
        return this.d;
    }

    public void run() {
        Looper.prepare();
        this.d = new c(this.b, this.c);
        this.e.countDown();
        Looper.loop();
    }
}
