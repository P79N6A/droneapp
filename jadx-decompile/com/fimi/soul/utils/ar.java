package com.fimi.soul.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.android.volley.o;
import com.android.volley.toolbox.k;
import com.android.volley.toolbox.k.c;
import com.android.volley.toolbox.k.d;
import com.android.volley.toolbox.t;
import com.android.volley.u;
import com.fimi.kernel.utils.n;

public class ar {
    private Context a = null;
    private int b;
    private int c;
    private int d;
    private Drawable e;
    private View f;
    private Drawable g;
    private Drawable h;
    private o i;
    private k j = null;
    private b k = null;
    private a l = null;

    public interface a {
        void a();
    }

    public interface b {
        void a(Bitmap bitmap);
    }

    public ar(Context context) {
        this.a = context;
        this.i = t.a(context);
        this.j = new k(this.i, aq.a());
    }

    public static ar a(Context context) {
        return new ar(context);
    }

    public int a() {
        return this.b;
    }

    public void a(int i) {
        this.e = this.a.getResources().getDrawable(i);
    }

    public void a(View view) {
        this.f = view;
    }

    public void a(final ImageView imageView, String str) {
        if (n.b(str)) {
            if (this.h != null) {
                if (this.f != null) {
                    this.f.setVisibility(4);
                }
                imageView.setVisibility(0);
                imageView.setImageDrawable(this.h);
            }
            if (this.l != null) {
                this.l.a();
                return;
            }
            return;
        }
        if (this.f != null) {
            this.f.setVisibility(0);
            imageView.setVisibility(4);
        } else if (this.e != null) {
            imageView.setImageDrawable(this.e);
            imageView.setVisibility(0);
        }
        imageView.setTag(str);
        this.j.a(str, new d(this) {
            final /* synthetic */ ar b;

            public void a(c cVar, boolean z) {
                Bitmap b = cVar.b();
                if (this.b.k != null) {
                    this.b.k.a(b);
                }
                if (this.b.l != null) {
                    this.b.l.a();
                }
                com.fimi.kernel.utils.k.a(ar.class, "获取到图片：" + b);
                if (cVar.c().equals(imageView.getTag())) {
                    if (b != null) {
                        imageView.setImageBitmap(b);
                    } else if (this.b.h != null) {
                        imageView.setImageDrawable(this.b.h);
                    }
                    if (this.b.f != null) {
                        this.b.f.setVisibility(4);
                    }
                    imageView.setVisibility(0);
                }
            }

            public void a(u uVar) {
                if (this.b.g != null) {
                    imageView.setImageDrawable(this.b.g);
                }
                if (this.b.l != null) {
                    this.b.l.a();
                }
                imageView.setVisibility(0);
                if (this.b.f != null) {
                    this.b.f.setVisibility(4);
                }
            }
        }, this.b, this.c);
    }

    public void a(a aVar) {
        this.l = aVar;
    }

    public void a(b bVar) {
        this.k = bVar;
    }

    public void a(String str) {
        if (!n.b(str)) {
            this.j.a(str, new d(this) {
                final /* synthetic */ ar a;

                {
                    this.a = r1;
                }

                public void a(c cVar, boolean z) {
                    Bitmap b = cVar.b();
                    if (this.a.k != null) {
                        this.a.k.a(b);
                    }
                    com.fimi.kernel.utils.k.a(ar.class, "获取到图片：" + b);
                }

                public void a(u uVar) {
                }
            }, this.b, this.c);
        }
    }

    public int b() {
        return this.c;
    }

    public void b(int i) {
        this.g = this.a.getResources().getDrawable(i);
    }

    public int c() {
        return this.d;
    }

    public void c(int i) {
        this.h = this.a.getResources().getDrawable(i);
    }

    public b d() {
        return this.k;
    }

    public void d(int i) {
        this.b = i;
    }

    public a e() {
        return this.l;
    }

    public void e(int i) {
        this.c = i;
    }

    public void f(int i) {
        this.d = i;
    }
}
