package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.a.a;
import com.google.android.gms.cast.framework.media.b;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.images.WebImage;

public class aft extends a {
    private final ImageView a;
    private final Context b;
    private final int c;
    private final Bitmap d;
    private final com.google.android.gms.cast.framework.media.a e;
    private afn f;
    private Uri g;

    public aft(ImageView imageView, Context context, int i, int i2) {
        this.a = imageView;
        this.b = context.getApplicationContext();
        this.c = i;
        this.d = BitmapFactory.decodeResource(context.getResources(), i2);
        CastMediaOptions g = c.a(context).a().g();
        this.e = g != null ? g.e() : null;
    }

    private Uri a(MediaQueueItem mediaQueueItem) {
        if (mediaQueueItem == null) {
            return null;
        }
        MediaInfo b = mediaQueueItem.b();
        if (b == null) {
            return null;
        }
        if (this.e != null) {
            WebImage a = this.e.a(b.e(), this.c);
            if (!(a == null || a.b() == null)) {
                return a.b();
            }
        }
        return b.b(b, 0);
    }

    private void e() {
        com.google.android.gms.cast.framework.media.c a = a();
        if (a == null || !a.t()) {
            this.a.setImageBitmap(this.d);
            return;
        }
        final Uri a2 = a(a.r());
        if (a2 == null) {
            this.g = null;
            this.a.setImageBitmap(this.d);
        } else if (!f.a(this.g, a2)) {
            this.g = a2;
            this.a.setImageBitmap(this.d);
            this.f = new afn(this, this.b) {
                final /* synthetic */ aft b;

                protected void a(Bitmap bitmap) {
                    if (bitmap != null && f.a(this.b.g, a2)) {
                        this.b.a.setImageBitmap(bitmap);
                    }
                }

                protected /* synthetic */ void onPostExecute(Object obj) {
                    a((Bitmap) obj);
                }
            };
            this.f.a(a2);
        }
    }

    public void a(d dVar) {
        super.a(dVar);
        this.a.setImageBitmap(this.d);
        e();
    }

    public void b() {
        this.g = null;
        if (this.f != null) {
            this.f.cancel(true);
            this.f = null;
        }
        this.a.setImageBitmap(this.d);
        super.b();
    }

    public void c() {
        e();
    }
}
