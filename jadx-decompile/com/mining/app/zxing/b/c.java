package com.mining.app.zxing.b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.fimi.overseas.soul.R;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;
import com.mining.app.zxing.a.e;
import com.mining.app.zxing.activity.MipcaActivityCapture;
import java.util.Hashtable;

final class c extends Handler {
    private static final String a = c.class.getSimpleName();
    private final MipcaActivityCapture b;
    private final MultiFormatReader c = new MultiFormatReader();

    c(MipcaActivityCapture mipcaActivityCapture, Hashtable<DecodeHintType, Object> hashtable) {
        this.c.setHints(hashtable);
        this.b = mipcaActivityCapture;
    }

    private void a(byte[] bArr, int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        Result result = null;
        byte[] bArr2 = new byte[bArr.length];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                bArr2[(((i4 * i2) + i2) - i3) - 1] = bArr[(i3 * i) + i4];
            }
        }
        e a = com.mining.app.zxing.a.c.a().a(bArr2, i2, i);
        try {
            result = this.c.decodeWithState(new BinaryBitmap(new HybridBinarizer(a)));
        } catch (ReaderException e) {
        } finally {
            a = this.c;
            a.reset();
        }
        if (result != null) {
            Log.d(a, "Found barcode (" + (System.currentTimeMillis() - currentTimeMillis) + " ms):\n" + result.toString());
            Message obtain = Message.obtain(this.b.b(), R.id.decode_succeeded, result);
            Bundle bundle = new Bundle();
            bundle.putParcelable(d.a, a.c());
            obtain.setData(bundle);
            obtain.sendToTarget();
            return;
        }
        Message.obtain(this.b.b(), R.id.decode_failed).sendToTarget();
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case R.id.decode:
                a((byte[]) message.obj, message.arg1, message.arg2);
                return;
            case R.id.quit:
                Looper.myLooper().quit();
                return;
            default:
                return;
        }
    }
}
