package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.a.a;
import com.google.android.gms.cast.framework.media.b;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.images.WebImage;

public class afu extends a {
    private final ImageView a;
    private final Context b;
    private final int c;
    private final Bitmap d;
    private final View e;
    private final com.google.android.gms.cast.framework.media.a f;
    private afn g;
    private Uri h;
    private Bitmap i;

    public afu(ImageView imageView, Context context, int i, int i2) {
        com.google.android.gms.cast.framework.media.a aVar = null;
        this.a = imageView;
        this.b = context.getApplicationContext();
        this.c = i;
        this.d = BitmapFactory.decodeResource(context.getResources(), i2);
        this.e = null;
        CastMediaOptions g = c.a(context).a().g();
        if (g != null) {
            aVar = g.e();
        }
        this.f = aVar;
    }

    public afu(ImageView imageView, Context context, int i, View view) {
        com.google.android.gms.cast.framework.media.a aVar = null;
        this.a = imageView;
        this.b = context.getApplicationContext();
        this.c = i;
        this.e = view;
        this.d = null;
        CastMediaOptions g = c.a(context).a().g();
        if (g != null) {
            aVar = g.e();
        }
        this.f = aVar;
    }

    private Uri a(MediaInfo mediaInfo) {
        if (mediaInfo == null) {
            return null;
        }
        if (this.f != null) {
            WebImage a = this.f.a(mediaInfo.e(), this.c);
            if (!(a == null || a.b() == null)) {
                return a.b();
            }
        }
        return b.b(mediaInfo, 0);
    }

    private void e() {
        com.google.android.gms.cast.framework.media.c a = a();
        if (a == null || !a.t()) {
            this.h = null;
            f();
            return;
        }
        final Uri a2 = a(a.h());
        if (a2 == null) {
            this.h = null;
            f();
        } else if (!f.a(this.h, a2)) {
            this.h = a2;
            f();
            this.g = new afn(this, this.b) {
                final /* synthetic */ afu b;

                protected void a(Bitmap bitmap) {
                    if (bitmap != null && f.a(this.b.h, a2)) {
                        if (this.b.e != null) {
                            this.b.e.setVisibility(4);
                        }
                        this.b.a.setVisibility(0);
                        this.b.a.setImageBitmap(bitmap);
                        if (this.b.i != null) {
                            this.b.i.recycle();
                        }
                        this.b.i = bitmap;
                    }
                }

                protected /* synthetic */ void onPostExecute(Object obj) {
                    a((Bitmap) obj);
                }
            };
            this.g.a(a2);
        }
    }

    private void f() {
        if (this.e != null) {
            this.e.setVisibility(0);
            this.a.setVisibility(4);
        }
        if (this.d != null) {
            this.a.setImageBitmap(this.d);
        }
        if (this.i != null) {
            this.i.recycle();
            this.i = null;
        }
    }

    public void a(d dVar) {
        super.a(dVar);
        f();
        e();
    }

    public void b() {
        this.h = null;
        if (this.g != null) {
            this.g.cancel(true);
            this.g = null;
        }
        f();
        super.b();
    }

    public void c() {
        e();
    }
}
