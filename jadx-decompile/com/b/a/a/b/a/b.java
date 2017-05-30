package com.b.a.a.b.a;

import android.graphics.Bitmap;
import com.b.a.a.b.c;
import java.util.Collection;
import java.util.Comparator;

public class b implements c {
    private final c a;
    private final Comparator<String> b;

    public b(c cVar, Comparator<String> comparator) {
        this.a = cVar;
        this.b = comparator;
    }

    public Bitmap a(String str) {
        return this.a.a(str);
    }

    public Collection<String> a() {
        return this.a.a();
    }

    public boolean a(String str, Bitmap bitmap) {
        synchronized (this.a) {
            for (String str2 : this.a.a()) {
                if (this.b.compare(str, str2) == 0) {
                    break;
                }
            }
            String str22 = null;
            if (str22 != null) {
                this.a.b(str22);
            }
        }
        return this.a.a(str, bitmap);
    }

    public Bitmap b(String str) {
        return this.a.b(str);
    }

    public void b() {
        this.a.b();
    }
}
