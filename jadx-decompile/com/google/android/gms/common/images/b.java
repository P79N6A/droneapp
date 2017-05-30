package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.ajb;
import com.google.android.gms.internal.zzrv;
import it.a.a.e;
import java.lang.ref.WeakReference;

public abstract class b {
    final a a;
    protected int b = 0;
    protected int c = 0;
    protected boolean d = false;
    private boolean e = true;
    private boolean f = false;
    private boolean g = true;

    static final class a {
        public final Uri a;

        public a(Uri uri) {
            this.a = uri;
        }

        public boolean equals(Object obj) {
            return !(obj instanceof a) ? false : this == obj ? true : com.google.android.gms.common.internal.c.a(((a) obj).a, this.a);
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.c.a(this.a);
        }
    }

    public static final class b extends b {
        private WeakReference<ImageView> e;

        public b(ImageView imageView, int i) {
            super(null, i);
            n.a((Object) imageView);
            this.e = new WeakReference(imageView);
        }

        public b(ImageView imageView, Uri uri) {
            super(uri, 0);
            n.a((Object) imageView);
            this.e = new WeakReference(imageView);
        }

        private void a(ImageView imageView, Drawable drawable, boolean z, boolean z2, boolean z3) {
            Object obj = (z2 || z3) ? null : 1;
            if (obj != null && (imageView instanceof ajb)) {
                int a = ((ajb) imageView).a();
                if (this.c != 0 && a == this.c) {
                    return;
                }
            }
            boolean a2 = a(z, z2);
            Drawable a3 = a2 ? a(imageView.getDrawable(), drawable) : drawable;
            imageView.setImageDrawable(a3);
            if (imageView instanceof ajb) {
                ajb com_google_android_gms_internal_ajb = (ajb) imageView;
                com_google_android_gms_internal_ajb.a(z3 ? this.a.a : null);
                com_google_android_gms_internal_ajb.a(obj != null ? this.c : 0);
            }
            if (a2) {
                ((aja) a3).a(e.G);
            }
        }

        protected void a(Drawable drawable, boolean z, boolean z2, boolean z3) {
            ImageView imageView = (ImageView) this.e.get();
            if (imageView != null) {
                a(imageView, drawable, z, z2, z3);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            ImageView imageView = (ImageView) this.e.get();
            ImageView imageView2 = (ImageView) ((b) obj).e.get();
            boolean z = (imageView2 == null || imageView == null || !com.google.android.gms.common.internal.c.a(imageView2, imageView)) ? false : true;
            return z;
        }

        public int hashCode() {
            return 0;
        }
    }

    public static final class c extends b {
        private WeakReference<com.google.android.gms.common.images.ImageManager.a> e;

        public c(com.google.android.gms.common.images.ImageManager.a aVar, Uri uri) {
            super(uri, 0);
            n.a((Object) aVar);
            this.e = new WeakReference(aVar);
        }

        protected void a(Drawable drawable, boolean z, boolean z2, boolean z3) {
            if (!z2) {
                com.google.android.gms.common.images.ImageManager.a aVar = (com.google.android.gms.common.images.ImageManager.a) this.e.get();
                if (aVar != null) {
                    aVar.a(this.a.a, drawable, z3);
                }
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            c cVar = (c) obj;
            com.google.android.gms.common.images.ImageManager.a aVar = (com.google.android.gms.common.images.ImageManager.a) this.e.get();
            com.google.android.gms.common.images.ImageManager.a aVar2 = (com.google.android.gms.common.images.ImageManager.a) cVar.e.get();
            boolean z = aVar2 != null && aVar != null && com.google.android.gms.common.internal.c.a(aVar2, aVar) && com.google.android.gms.common.internal.c.a(cVar.a, this.a);
            return z;
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.c.a(this.a);
        }
    }

    public b(Uri uri, int i) {
        this.a = new a(uri);
        this.c = i;
    }

    private Drawable a(Context context, zzrv com_google_android_gms_internal_zzrv, int i) {
        return context.getResources().getDrawable(i);
    }

    protected aja a(Drawable drawable, Drawable drawable2) {
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof aja) {
            drawable = ((aja) drawable).b();
        }
        return new aja(drawable, drawable2);
    }

    public void a(int i) {
        this.c = i;
    }

    void a(Context context, Bitmap bitmap, boolean z) {
        n.a((Object) bitmap);
        a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    void a(Context context, zzrv com_google_android_gms_internal_zzrv) {
        if (this.g) {
            a(null, false, true, false);
        }
    }

    void a(Context context, zzrv com_google_android_gms_internal_zzrv, boolean z) {
        Drawable drawable = null;
        if (this.c != 0) {
            drawable = a(context, com_google_android_gms_internal_zzrv, this.c);
        }
        a(drawable, z, false, false);
    }

    protected abstract void a(Drawable drawable, boolean z, boolean z2, boolean z3);

    protected boolean a(boolean z, boolean z2) {
        return (!this.e || z2 || z) ? false : true;
    }
}
