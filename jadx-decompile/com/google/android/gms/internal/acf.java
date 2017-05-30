package com.google.android.gms.internal;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@aaa
public class acf {
    Map<Integer, Bitmap> a = new ConcurrentHashMap();
    private AtomicInteger b = new AtomicInteger(0);

    public int a(Bitmap bitmap) {
        if (bitmap == null) {
            b.a("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        this.a.put(Integer.valueOf(this.b.get()), bitmap);
        return this.b.getAndIncrement();
    }

    public Bitmap a(Integer num) {
        return (Bitmap) this.a.get(num);
    }

    public void b(Integer num) {
        this.a.remove(num);
    }
}
