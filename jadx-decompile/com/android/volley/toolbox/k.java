package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.android.volley.n;
import com.android.volley.o;
import com.android.volley.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class k {
    private final o a;
    private int b = 100;
    private final b c;
    private final HashMap<String, a> d = new HashMap();
    private final HashMap<String, a> e = new HashMap();
    private final Handler f = new Handler(Looper.getMainLooper());
    private Runnable g;

    public interface d extends com.android.volley.p.a {
        void a(c cVar, boolean z);
    }

    private class a {
        final /* synthetic */ k a;
        private final n<?> b;
        private Bitmap c;
        private u d;
        private final LinkedList<c> e = new LinkedList();

        public a(k kVar, n<?> nVar, c cVar) {
            this.a = kVar;
            this.b = nVar;
            this.e.add(cVar);
        }

        public u a() {
            return this.d;
        }

        public void a(c cVar) {
            this.e.add(cVar);
        }

        public void a(u uVar) {
            this.d = uVar;
        }

        public boolean b(c cVar) {
            this.e.remove(cVar);
            if (this.e.size() != 0) {
                return false;
            }
            this.b.l();
            return true;
        }
    }

    public interface b {
        Bitmap a(String str);

        void a(String str, Bitmap bitmap);
    }

    public class c {
        final /* synthetic */ k a;
        private Bitmap b;
        private final d c;
        private final String d;
        private final String e;

        public c(k kVar, Bitmap bitmap, String str, String str2, d dVar) {
            this.a = kVar;
            this.b = bitmap;
            this.e = str;
            this.d = str2;
            this.c = dVar;
        }

        public void a() {
            if (this.c != null) {
                a aVar = (a) this.a.d.get(this.d);
                if (aVar == null) {
                    aVar = (a) this.a.e.get(this.d);
                    if (aVar != null) {
                        aVar.b(this);
                        if (aVar.e.size() == 0) {
                            this.a.e.remove(this.d);
                        }
                    }
                } else if (aVar.b(this)) {
                    this.a.d.remove(this.d);
                }
            }
        }

        public Bitmap b() {
            return this.b;
        }

        public String c() {
            return this.e;
        }
    }

    public k(o oVar, b bVar) {
        this.a = oVar;
        this.c = bVar;
    }

    public static d a(final ImageView imageView, final int i, final int i2) {
        return new d() {
            public void a(c cVar, boolean z) {
                if (cVar.b() != null) {
                    imageView.setImageBitmap(cVar.b());
                } else if (i != 0) {
                    imageView.setImageResource(i);
                }
            }

            public void a(u uVar) {
                if (i2 != 0) {
                    imageView.setImageResource(i2);
                }
            }
        };
    }

    private void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        }
    }

    private void a(String str, a aVar) {
        this.e.put(str, aVar);
        if (this.g == null) {
            this.g = new Runnable(this) {
                final /* synthetic */ k a;

                {
                    this.a = r1;
                }

                public void run() {
                    for (a aVar : this.a.e.values()) {
                        Iterator it = aVar.e.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            if (cVar.c != null) {
                                if (aVar.a() == null) {
                                    cVar.b = aVar.c;
                                    cVar.c.a(cVar, false);
                                } else {
                                    cVar.c.a(aVar.a());
                                }
                            }
                        }
                    }
                    this.a.e.clear();
                    this.a.g = null;
                }
            };
            this.f.postDelayed(this.g, (long) this.b);
        }
    }

    private static String b(String str, int i, int i2, ScaleType scaleType) {
        return new StringBuilder(str.length() + 12).append("#W").append(i).append("#H").append(i2).append("#S").append(scaleType.ordinal()).append(str).toString();
    }

    protected n<Bitmap> a(String str, int i, int i2, ScaleType scaleType, final String str2) {
        return new l(str, new com.android.volley.p.b<Bitmap>(this) {
            final /* synthetic */ k b;

            public void a(Bitmap bitmap) {
                this.b.a(str2, bitmap);
            }
        }, i, i2, scaleType, Config.RGB_565, new com.android.volley.p.a(this) {
            final /* synthetic */ k b;

            public void a(u uVar) {
                this.b.a(str2, uVar);
            }
        });
    }

    public c a(String str, d dVar) {
        return a(str, dVar, 0, 0);
    }

    public c a(String str, d dVar, int i, int i2) {
        return a(str, dVar, i, i2, ScaleType.CENTER_INSIDE);
    }

    public c a(String str, d dVar, int i, int i2, ScaleType scaleType) {
        a();
        String b = b(str, i, i2, scaleType);
        Bitmap a = this.c.a(b);
        if (a != null) {
            c cVar = new c(this, a, str, null, null);
            dVar.a(cVar, true);
            return cVar;
        }
        cVar = new c(this, null, str, b, dVar);
        dVar.a(cVar, true);
        a aVar = (a) this.d.get(b);
        if (aVar != null) {
            aVar.a(cVar);
            return cVar;
        }
        n a2 = a(str, i, i2, scaleType, b);
        this.a.a(a2);
        this.d.put(b, new a(this, a2, cVar));
        return cVar;
    }

    public void a(int i) {
        this.b = i;
    }

    protected void a(String str, Bitmap bitmap) {
        this.c.a(str, bitmap);
        a aVar = (a) this.d.remove(str);
        if (aVar != null) {
            aVar.c = bitmap;
            a(str, aVar);
        }
    }

    protected void a(String str, u uVar) {
        a aVar = (a) this.d.remove(str);
        if (aVar != null) {
            aVar.a(uVar);
            a(str, aVar);
        }
    }

    public boolean a(String str, int i, int i2) {
        return a(str, i, i2, ScaleType.CENTER_INSIDE);
    }

    public boolean a(String str, int i, int i2, ScaleType scaleType) {
        a();
        return this.c.a(b(str, i, i2, scaleType)) != null;
    }
}
