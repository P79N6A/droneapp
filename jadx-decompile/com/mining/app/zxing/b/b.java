package com.mining.app.zxing.b;

import android.content.Intent;
import android.net.Uri;
import com.google.zxing.BarcodeFormat;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.Vector;
import java.util.regex.Pattern;

final class b {
    static final Vector<BarcodeFormat> a = new Vector(5);
    static final Vector<BarcodeFormat> b = new Vector(1);
    static final Vector<BarcodeFormat> c = new Vector(1);
    static final Vector<BarcodeFormat> d = new Vector(1);
    private static final Pattern e = Pattern.compile(Constants.ACCEPT_TIME_SEPARATOR_SP);

    static {
        a.add(BarcodeFormat.UPC_A);
        a.add(BarcodeFormat.UPC_E);
        a.add(BarcodeFormat.EAN_13);
        a.add(BarcodeFormat.EAN_8);
        a.add(BarcodeFormat.RSS14);
        b.add(BarcodeFormat.CODE_128);
        c.add(BarcodeFormat.QR_CODE);
        d.add(BarcodeFormat.DATA_MATRIX);
    }

    private b() {
    }

    static Vector<BarcodeFormat> a(Intent intent) {
        Iterable iterable = null;
        CharSequence stringExtra = intent.getStringExtra(com.mining.app.zxing.b.g.b.c);
        if (stringExtra != null) {
            iterable = Arrays.asList(e.split(stringExtra));
        }
        return a(iterable, intent.getStringExtra(com.mining.app.zxing.b.g.b.b));
    }

    static Vector<BarcodeFormat> a(Uri uri) {
        Iterable queryParameters = uri.getQueryParameters(com.mining.app.zxing.b.g.b.c);
        if (!(queryParameters == null || queryParameters.size() != 1 || queryParameters.get(0) == null)) {
            queryParameters = Arrays.asList(e.split((CharSequence) queryParameters.get(0)));
        }
        return a(queryParameters, uri.getQueryParameter(com.mining.app.zxing.b.g.b.b));
    }

    private static Vector<BarcodeFormat> a(Iterable<String> iterable, String str) {
        if (iterable != null) {
            Vector<BarcodeFormat> vector = new Vector();
            try {
                for (String valueOf : iterable) {
                    vector.add(BarcodeFormat.valueOf(valueOf));
                }
                return vector;
            } catch (IllegalArgumentException e) {
            }
        }
        if (str != null) {
            if (com.mining.app.zxing.b.g.b.e.equals(str)) {
                return a;
            }
            if (com.mining.app.zxing.b.g.b.g.equals(str)) {
                return c;
            }
            if (com.mining.app.zxing.b.g.b.h.equals(str)) {
                return d;
            }
            if (com.mining.app.zxing.b.g.b.f.equals(str)) {
                return b;
            }
        }
        return null;
    }
}
