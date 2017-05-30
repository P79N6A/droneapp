package com.fimi.soul.media.gallery;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.media.ThumbnailUtils;
import android.os.Handler;
import android.os.Message;
import android.support.v4.util.LruCache;
import com.fimi.kernel.utils.s;
import com.fimi.soul.utils.v;
import it.a.a.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class c {
    private static c b = null;
    public LruCache<String, Bitmap> a;
    private ExecutorService c = Executors.newFixedThreadPool(4);
    private Context d;
    private ArrayList<Bitmap> e = new ArrayList();

    public interface a {
        void a(Bitmap bitmap, String str);
    }

    private c(Context context) {
        this.d = context;
        this.a = new LruCache<String, Bitmap>(this, ((int) Runtime.getRuntime().maxMemory()) / 8) {
            final /* synthetic */ c a;

            @SuppressLint({"NewApi"})
            protected int a(String str, Bitmap bitmap) {
                return bitmap.getByteCount();
            }

            @SuppressLint({"NewApi"})
            protected /* synthetic */ int sizeOf(Object obj, Object obj2) {
                return a((String) obj, (Bitmap) obj2);
            }
        };
    }

    private int a(Options options, int i, int i2) {
        if (i == 0 || i == 0) {
            return 1;
        }
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i3 <= i && i4 <= i) {
            return 1;
        }
        int round = Math.round(((float) i3) / ((float) i));
        i3 = Math.round(((float) i4) / ((float) i));
        return round >= i3 ? i3 : round;
    }

    private Bitmap a(String str, int i, int i2) {
        Options options = new Options();
        options.inSampleSize = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inPreferredConfig = Config.RGB_565;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = a(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static c a(Context context) {
        if (b == null) {
            b = new c(context);
        }
        return b;
    }

    private void a(String str, Bitmap bitmap) {
        if (b(str) == null && bitmap != null) {
            this.e.add(bitmap);
            this.a.put(str, bitmap);
        }
    }

    private Bitmap b(String str) {
        return (Bitmap) this.a.get(str);
    }

    public Bitmap a(final String str, Point point, final a aVar) {
        Bitmap b = b(str);
        final Handler anonymousClass2 = new Handler(this) {
            final /* synthetic */ c c;

            public void handleMessage(Message message) {
                super.handleMessage(message);
                aVar.a((Bitmap) message.obj, str);
            }
        };
        if (b == null) {
            this.c.execute(new Runnable(this) {
                final /* synthetic */ c c;

                public void run() {
                    Bitmap bitmap = null;
                    if (v.c(str, this.c.d)) {
                        bitmap = ThumbnailUtils.createVideoThumbnail(str, 1);
                    } else {
                        try {
                            bitmap = s.a(this.c.d, str, (int) e.G);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    Message obtainMessage = anonymousClass2.obtainMessage();
                    obtainMessage.obj = bitmap;
                    anonymousClass2.sendMessage(obtainMessage);
                    this.c.a(str, bitmap);
                }
            });
        }
        return b;
    }

    public Bitmap a(String str, a aVar) {
        return a(str, null, aVar);
    }

    public void a() {
        if (this.a != null && this.a.size() > 0) {
            this.a.evictAll();
            for (int i = 0; i < this.e.size(); i++) {
                Bitmap bitmap = (Bitmap) this.e.get(i);
                if (!(bitmap == null || bitmap.isRecycled())) {
                    bitmap.recycle();
                }
            }
            this.e.clear();
        }
    }

    public synchronized void a(String str) {
        if (str != null) {
            if (this.a != null) {
                Bitmap bitmap = (Bitmap) this.a.remove(str);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        }
    }
}
