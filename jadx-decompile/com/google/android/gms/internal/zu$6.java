package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.common.util.s;
import java.io.InputStream;

class zu$6 implements acc$a<c> {
    final /* synthetic */ boolean a;
    final /* synthetic */ double b;
    final /* synthetic */ boolean c;
    final /* synthetic */ String d;
    final /* synthetic */ zu e;

    zu$6(zu zuVar, boolean z, double d, boolean z2, String str) {
        this.e = zuVar;
        this.a = z;
        this.b = d;
        this.c = z2;
        this.d = str;
    }

    public c a() {
        this.e.a(2, this.a);
        return null;
    }

    @TargetApi(19)
    public c a(InputStream inputStream) {
        Bitmap decodeStream;
        Options options = new Options();
        options.inDensity = (int) (160.0d * this.b);
        if (!this.c) {
            options.inPreferredConfig = Config.RGB_565;
        }
        try {
            decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (Throwable e) {
            abr.b("Error grabbing image.", e);
            decodeStream = null;
        }
        if (decodeStream == null) {
            this.e.a(2, this.a);
            return null;
        }
        if (s.h()) {
            int width = decodeStream.getWidth();
            int height = decodeStream.getHeight();
            abr.e("Decoded image w: " + width + " h:" + height + " bytes: " + decodeStream.getAllocationByteCount());
        }
        return new c(new BitmapDrawable(Resources.getSystem(), decodeStream), Uri.parse(this.d), this.b);
    }

    public /* synthetic */ Object b() {
        return a();
    }

    @TargetApi(19)
    public /* synthetic */ Object b(InputStream inputStream) {
        return a(inputStream);
    }
}
