package com.google.android.gms.common.images;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.util.LruCache;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.zzrv;
import com.tencent.mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager {
    private static final Object a = new Object();
    private static HashSet<Uri> b = new HashSet();
    private static ImageManager c;
    private static ImageManager d;
    private final Context e;
    private final Handler f = new Handler(Looper.getMainLooper());
    private final ExecutorService g = Executors.newFixedThreadPool(4);
    private final c h;
    private final zzrv i;
    private final Map<b, ImageReceiver> j;
    private final Map<Uri, ImageReceiver> k;
    private final Map<Uri, Long> l;

    @KeepName
    private final class ImageReceiver extends ResultReceiver {
        final /* synthetic */ ImageManager a;
        private final Uri b;
        private final ArrayList<b> c = new ArrayList();

        ImageReceiver(ImageManager imageManager, Uri uri) {
            this.a = imageManager;
            super(new Handler(Looper.getMainLooper()));
            this.b = uri;
        }

        public void a() {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", this.b);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            this.a.e.sendBroadcast(intent);
        }

        public void a(b bVar) {
            n.a("ImageReceiver.addImageRequest() must be called in the main thread");
            this.c.add(bVar);
        }

        public void b(b bVar) {
            n.a("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.c.remove(bVar);
        }

        public void onReceiveResult(int i, Bundle bundle) {
            this.a.g.execute(new d(this.a, this.b, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    public interface a {
        void a(Uri uri, Drawable drawable, boolean z);
    }

    @TargetApi(11)
    private static final class b {
        static int a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    private static final class c extends LruCache<a, Bitmap> {
        public c(Context context) {
            super(a(context));
        }

        @TargetApi(11)
        private static int a(Context context) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            int memoryClass = (((context.getApplicationInfo().flags & 1048576) != 0 ? 1 : null) == null || !s.a()) ? activityManager.getMemoryClass() : b.a(activityManager);
            return (int) (((float) (memoryClass * 1048576)) * 0.33f);
        }

        protected int a(a aVar, Bitmap bitmap) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        protected void a(boolean z, a aVar, Bitmap bitmap, Bitmap bitmap2) {
            super.entryRemoved(z, aVar, bitmap, bitmap2);
        }

        protected /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            a(z, (a) obj, (Bitmap) obj2, (Bitmap) obj3);
        }

        protected /* synthetic */ int sizeOf(Object obj, Object obj2) {
            return a((a) obj, (Bitmap) obj2);
        }
    }

    private final class d implements Runnable {
        final /* synthetic */ ImageManager a;
        private final Uri b;
        private final ParcelFileDescriptor c;

        public d(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.a = imageManager;
            this.b = uri;
            this.c = parcelFileDescriptor;
        }

        public void run() {
            n.b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            boolean z = false;
            Bitmap bitmap = null;
            if (this.c != null) {
                try {
                    bitmap = BitmapFactory.decodeFileDescriptor(this.c.getFileDescriptor());
                } catch (Throwable e) {
                    String valueOf = String.valueOf(this.b);
                    Log.e("ImageManager", new StringBuilder(String.valueOf(valueOf).length() + 34).append("OOM while loading bitmap for uri: ").append(valueOf).toString(), e);
                    z = true;
                }
                try {
                    this.c.close();
                } catch (Throwable e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.a.f.post(new g(this.a, this.b, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e3) {
                String valueOf2 = String.valueOf(this.b);
                Log.w("ImageManager", new StringBuilder(String.valueOf(valueOf2).length() + 32).append("Latch interrupted while posting ").append(valueOf2).toString());
            }
        }
    }

    private final class e implements Runnable {
        final /* synthetic */ ImageManager a;
        private final b b;

        public e(ImageManager imageManager, b bVar) {
            this.a = imageManager;
            this.b = bVar;
        }

        public void run() {
            n.a("LoadImageRunnable must be executed on the main thread");
            ImageReceiver imageReceiver = (ImageReceiver) this.a.j.get(this.b);
            if (imageReceiver != null) {
                this.a.j.remove(this.b);
                imageReceiver.b(this.b);
            }
            a aVar = this.b.a;
            if (aVar.a == null) {
                this.b.a(this.a.e, this.a.i, true);
                return;
            }
            Bitmap a = this.a.a(aVar);
            if (a != null) {
                this.b.a(this.a.e, a, true);
                return;
            }
            Long l = (Long) this.a.l.get(aVar.a);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < Util.MILLSECONDS_OF_HOUR) {
                    this.b.a(this.a.e, this.a.i, true);
                    return;
                }
                this.a.l.remove(aVar.a);
            }
            this.b.a(this.a.e, this.a.i);
            imageReceiver = (ImageReceiver) this.a.k.get(aVar.a);
            if (imageReceiver == null) {
                imageReceiver = new ImageReceiver(this.a, aVar.a);
                this.a.k.put(aVar.a, imageReceiver);
            }
            imageReceiver.a(this.b);
            if (!(this.b instanceof com.google.android.gms.common.images.b.c)) {
                this.a.j.put(this.b, imageReceiver);
            }
            synchronized (ImageManager.a) {
                if (!ImageManager.b.contains(aVar.a)) {
                    ImageManager.b.add(aVar.a);
                    imageReceiver.a();
                }
            }
        }
    }

    @TargetApi(14)
    private static final class f implements ComponentCallbacks2 {
        private final c a;

        public f(c cVar) {
            this.a = cVar;
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
            this.a.evictAll();
        }

        public void onTrimMemory(int i) {
            if (i >= 60) {
                this.a.evictAll();
            } else if (i >= 20) {
                this.a.trimToSize(this.a.size() / 2);
            }
        }
    }

    private final class g implements Runnable {
        final /* synthetic */ ImageManager a;
        private final Uri b;
        private final Bitmap c;
        private final CountDownLatch d;
        private boolean e;

        public g(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.a = imageManager;
            this.b = uri;
            this.c = bitmap;
            this.e = z;
            this.d = countDownLatch;
        }

        private void a(ImageReceiver imageReceiver, boolean z) {
            ArrayList a = imageReceiver.c;
            int size = a.size();
            for (int i = 0; i < size; i++) {
                b bVar = (b) a.get(i);
                if (z) {
                    bVar.a(this.a.e, this.c, false);
                } else {
                    this.a.l.put(this.b, Long.valueOf(SystemClock.elapsedRealtime()));
                    bVar.a(this.a.e, this.a.i, false);
                }
                if (!(bVar instanceof com.google.android.gms.common.images.b.c)) {
                    this.a.j.remove(bVar);
                }
            }
        }

        public void run() {
            n.a("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.c != null;
            if (this.a.h != null) {
                if (this.e) {
                    this.a.h.evictAll();
                    System.gc();
                    this.e = false;
                    this.a.f.post(this);
                    return;
                } else if (z) {
                    this.a.h.put(new a(this.b), this.c);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) this.a.k.remove(this.b);
            if (imageReceiver != null) {
                a(imageReceiver, z);
            }
            this.d.countDown();
            synchronized (ImageManager.a) {
                ImageManager.b.remove(this.b);
            }
        }
    }

    private ImageManager(Context context, boolean z) {
        this.e = context.getApplicationContext();
        if (z) {
            this.h = new c(this.e);
            if (s.d()) {
                c();
            }
        } else {
            this.h = null;
        }
        this.i = new zzrv();
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new HashMap();
    }

    private Bitmap a(a aVar) {
        return this.h == null ? null : (Bitmap) this.h.get(aVar);
    }

    public static ImageManager a(Context context) {
        return a(context, false);
    }

    public static ImageManager a(Context context, boolean z) {
        if (z) {
            if (d == null) {
                d = new ImageManager(context, true);
            }
            return d;
        }
        if (c == null) {
            c = new ImageManager(context, false);
        }
        return c;
    }

    @TargetApi(14)
    private void c() {
        this.e.registerComponentCallbacks(new f(this.h));
    }

    public void a(ImageView imageView, int i) {
        a(new com.google.android.gms.common.images.b.b(imageView, i));
    }

    public void a(ImageView imageView, Uri uri) {
        a(new com.google.android.gms.common.images.b.b(imageView, uri));
    }

    public void a(ImageView imageView, Uri uri, int i) {
        b bVar = new com.google.android.gms.common.images.b.b(imageView, uri);
        bVar.a(i);
        a(bVar);
    }

    public void a(a aVar, Uri uri) {
        a(new com.google.android.gms.common.images.b.c(aVar, uri));
    }

    public void a(a aVar, Uri uri, int i) {
        b cVar = new com.google.android.gms.common.images.b.c(aVar, uri);
        cVar.a(i);
        a(cVar);
    }

    public void a(b bVar) {
        n.a("ImageManager.loadImage() must be called in the main thread");
        new e(this, bVar).run();
    }
}
