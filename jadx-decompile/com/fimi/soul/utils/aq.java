package com.fimi.soul.utils;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.android.volley.toolbox.k.b;

@TargetApi(12)
public class aq implements b {
    private static LruCache<String, Bitmap> a;
    private static aq b;

    public aq() {
        a = new LruCache<String, Bitmap>(this, ((int) Runtime.getRuntime().maxMemory()) / 8) {
            final /* synthetic */ aq a;

            protected int a(String str, Bitmap bitmap) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }

            protected /* synthetic */ int sizeOf(Object obj, Object obj2) {
                return a((String) obj, (Bitmap) obj2);
            }
        };
    }

    public static aq a() {
        if (b == null) {
            b = new aq();
        }
        return b;
    }

    public Bitmap a(String str) {
        return (Bitmap) a.get(str);
    }

    public void a(String str, int i, int i2) {
        a.remove(b(str, i, i2));
    }

    public void a(String str, Bitmap bitmap) {
        a.put(str, bitmap);
    }

    public String b(String str, int i, int i2) {
        return new StringBuilder(str.length() + 12).append("#W").append(i).append("#H").append(i2).append(str).toString();
    }

    public void b() {
        a.evictAll();
    }
}
