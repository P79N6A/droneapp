package com.b.a.a.b.a;

import android.graphics.Bitmap;
import com.b.a.a.b.b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class a extends b {
    private final List<Bitmap> a = Collections.synchronizedList(new LinkedList());

    public a(int i) {
        super(i);
    }

    protected Reference<Bitmap> a(Bitmap bitmap) {
        return new WeakReference(bitmap);
    }

    public boolean a(String str, Bitmap bitmap) {
        if (!super.a(str, bitmap)) {
            return false;
        }
        this.a.add(bitmap);
        return true;
    }

    protected int b(Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    public Bitmap b(String str) {
        Bitmap a = super.a(str);
        if (a != null) {
            this.a.remove(a);
        }
        return super.b(str);
    }

    public void b() {
        this.a.clear();
        super.b();
    }

    protected Bitmap d() {
        return (Bitmap) this.a.remove(0);
    }
}
