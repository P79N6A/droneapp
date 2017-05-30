package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.view.View.MeasureSpec;
import android.webkit.WebView;

protected final class zk$a extends AsyncTask<Void, Void, Boolean> {
    final /* synthetic */ zk a;
    private final WebView b;
    private Bitmap c;

    public zk$a(zk zkVar, WebView webView) {
        this.a = zkVar;
        this.b = webView;
    }

    protected synchronized Boolean a(Void... voidArr) {
        Boolean valueOf;
        int width = this.c.getWidth();
        int height = this.c.getHeight();
        if (width == 0 || height == 0) {
            valueOf = Boolean.valueOf(false);
        } else {
            int i = 0;
            for (int i2 = 0; i2 < width; i2 += 10) {
                for (int i3 = 0; i3 < height; i3 += 10) {
                    if (this.c.getPixel(i2, i3) != 0) {
                        i++;
                    }
                }
            }
            valueOf = Boolean.valueOf(((double) i) / (((double) (width * height)) / 100.0d) > 0.1d);
        }
        return valueOf;
    }

    protected void a(Boolean bool) {
        zk.c(this.a);
        if (bool.booleanValue() || this.a.c() || zk.d(this.a) <= 0) {
            this.a.c = bool.booleanValue();
            zk.e(this.a).a(this.a.a, true);
        } else if (zk.d(this.a) > 0) {
            if (abr.a(2)) {
                abr.a("Ad not detected, scheduling another run.");
            }
            zk.g(this.a).postDelayed(this.a, zk.f(this.a));
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Boolean) obj);
    }

    protected synchronized void onPreExecute() {
        this.c = Bitmap.createBitmap(zk.a(this.a), zk.b(this.a), Config.ARGB_8888);
        this.b.setVisibility(0);
        this.b.measure(MeasureSpec.makeMeasureSpec(zk.a(this.a), 0), MeasureSpec.makeMeasureSpec(zk.b(this.a), 0));
        this.b.layout(0, 0, zk.a(this.a), zk.b(this.a));
        this.b.draw(new Canvas(this.c));
        this.b.invalidate();
    }
}
