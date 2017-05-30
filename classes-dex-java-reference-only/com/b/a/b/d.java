package com.b.a.b;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

public class d
{
  public static final String a = d.class.getSimpleName();
  static final String b = "Initialize ImageLoader with configuration";
  static final String c = "Destroy ImageLoader";
  static final String d = "Load image from memory cache [%s]";
  private static final String e = "Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.";
  private static final String f = "Wrong arguments were passed to displayImage() method (ImageView reference must not be null)";
  private static final String g = "ImageLoader must be init with configuration before using";
  private static final String h = "ImageLoader configuration can not be initialized with null";
  private static volatile d l;
  private e i;
  private f j;
  private com.b.a.b.f.a k = new com.b.a.b.f.d();
  
  private static Handler a(c paramc)
  {
    Handler localHandler = paramc.r();
    if (paramc.s()) {
      paramc = null;
    }
    do
    {
      do
      {
        return paramc;
        paramc = localHandler;
      } while (localHandler != null);
      paramc = localHandler;
    } while (Looper.myLooper() != Looper.getMainLooper());
    return new Handler();
  }
  
  public static d a()
  {
    if (l == null) {}
    try
    {
      if (l == null) {
        l = new d();
      }
      return l;
    }
    finally {}
  }
  
  private void m()
  {
    if (this.i == null) {
      throw new IllegalStateException("ImageLoader must be init with configuration before using");
    }
  }
  
  public Bitmap a(String paramString)
  {
    return a(paramString, null, null);
  }
  
  public Bitmap a(String paramString, com.b.a.b.a.e parame)
  {
    return a(paramString, parame, null);
  }
  
  public Bitmap a(String paramString, com.b.a.b.a.e parame, c paramc)
  {
    Object localObject = paramc;
    if (paramc == null) {
      localObject = this.i.r;
    }
    paramc = new c.a().a((c)localObject).f(true).d();
    localObject = new a(null);
    a(paramString, parame, paramc, (com.b.a.b.f.a)localObject);
    return ((a)localObject).a();
  }
  
  public Bitmap a(String paramString, c paramc)
  {
    return a(paramString, null, paramc);
  }
  
  public String a(ImageView paramImageView)
  {
    return this.j.a(new com.b.a.b.e.b(paramImageView));
  }
  
  public String a(com.b.a.b.e.a parama)
  {
    return this.j.a(parama);
  }
  
  public void a(e parame)
  {
    if (parame == null) {
      try
      {
        throw new IllegalArgumentException("ImageLoader configuration can not be initialized with null");
      }
      finally {}
    }
    if (this.i == null)
    {
      com.b.a.c.d.a("Initialize ImageLoader with configuration", new Object[0]);
      this.j = new f(parame);
      this.i = parame;
    }
    for (;;)
    {
      return;
      com.b.a.c.d.c("Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.", new Object[0]);
    }
  }
  
  public void a(com.b.a.b.f.a parama)
  {
    Object localObject = parama;
    if (parama == null) {
      localObject = new com.b.a.b.f.d();
    }
    this.k = ((com.b.a.b.f.a)localObject);
  }
  
  public void a(String paramString, ImageView paramImageView)
  {
    a(paramString, new com.b.a.b.e.b(paramImageView), null, null, null);
  }
  
  public void a(String paramString, ImageView paramImageView, c paramc)
  {
    a(paramString, new com.b.a.b.e.b(paramImageView), paramc, null, null);
  }
  
  public void a(String paramString, ImageView paramImageView, c paramc, com.b.a.b.f.a parama)
  {
    a(paramString, paramImageView, paramc, parama, null);
  }
  
  public void a(String paramString, ImageView paramImageView, c paramc, com.b.a.b.f.a parama, com.b.a.b.f.b paramb)
  {
    a(paramString, new com.b.a.b.e.b(paramImageView), paramc, parama, paramb);
  }
  
  public void a(String paramString, ImageView paramImageView, com.b.a.b.f.a parama)
  {
    a(paramString, new com.b.a.b.e.b(paramImageView), null, parama, null);
  }
  
  public void a(String paramString, com.b.a.b.a.e parame, c paramc, com.b.a.b.f.a parama)
  {
    a(paramString, parame, paramc, parama, null);
  }
  
  public void a(String paramString, com.b.a.b.a.e parame, c paramc, com.b.a.b.f.a parama, com.b.a.b.f.b paramb)
  {
    m();
    com.b.a.b.a.e locale = parame;
    if (parame == null) {
      locale = this.i.a();
    }
    if (paramc == null) {}
    for (parame = this.i.r;; parame = paramc)
    {
      a(paramString, new com.b.a.b.e.c(paramString, locale, com.b.a.b.a.h.b), parame, parama, paramb);
      return;
    }
  }
  
  public void a(String paramString, com.b.a.b.a.e parame, com.b.a.b.f.a parama)
  {
    a(paramString, parame, null, parama, null);
  }
  
  public void a(String paramString, c paramc, com.b.a.b.f.a parama)
  {
    a(paramString, null, paramc, parama, null);
  }
  
  public void a(String paramString, com.b.a.b.e.a parama)
  {
    a(paramString, parama, null, null, null);
  }
  
  public void a(String paramString, com.b.a.b.e.a parama, c paramc)
  {
    a(paramString, parama, paramc, null, null);
  }
  
  public void a(String paramString, com.b.a.b.e.a parama, c paramc, com.b.a.b.f.a parama1)
  {
    a(paramString, parama, paramc, parama1, null);
  }
  
  public void a(String paramString, com.b.a.b.e.a parama, c paramc, com.b.a.b.f.a parama1, com.b.a.b.f.b paramb)
  {
    m();
    if (parama == null) {
      throw new IllegalArgumentException("Wrong arguments were passed to displayImage() method (ImageView reference must not be null)");
    }
    if (parama1 == null) {
      parama1 = this.k;
    }
    for (;;)
    {
      if (paramc == null) {
        paramc = this.i.r;
      }
      for (;;)
      {
        if (TextUtils.isEmpty(paramString))
        {
          this.j.b(parama);
          parama1.a(paramString, parama.d());
          if (paramc.b()) {
            parama.a(paramc.b(this.i.a));
          }
          for (;;)
          {
            parama1.a(paramString, parama.d(), null);
            return;
            parama.a(null);
          }
        }
        com.b.a.b.a.e locale = com.b.a.c.b.a(parama, this.i.a());
        String str = com.b.a.c.e.a(paramString, locale);
        this.j.a(parama, str);
        parama1.a(paramString, parama.d());
        Bitmap localBitmap = this.i.n.a(str);
        if ((localBitmap != null) && (!localBitmap.isRecycled()))
        {
          com.b.a.c.d.a("Load image from memory cache [%s]", new Object[] { str });
          if (paramc.e())
          {
            paramString = new g(paramString, parama, locale, str, paramc, parama1, paramb, this.j.a(paramString));
            paramString = new i(this.j, localBitmap, paramString, a(paramc));
            if (paramc.s())
            {
              paramString.run();
              return;
            }
            this.j.a(paramString);
            return;
          }
          paramc.q().a(localBitmap, parama, com.b.a.b.a.f.c);
          parama1.a(paramString, parama.d(), localBitmap);
          return;
        }
        if (paramc.a()) {
          parama.a(paramc.a(this.i.a));
        }
        for (;;)
        {
          paramString = new g(paramString, parama, locale, str, paramc, parama1, paramb, this.j.a(paramString));
          paramString = new h(this.j, paramString, a(paramc));
          if (!paramc.s()) {
            break;
          }
          paramString.run();
          return;
          if (paramc.g()) {
            parama.a(null);
          }
        }
        this.j.a(paramString);
        return;
      }
    }
  }
  
  public void a(String paramString, com.b.a.b.e.a parama, com.b.a.b.f.a parama1)
  {
    a(paramString, parama, null, parama1, null);
  }
  
  public void a(String paramString, com.b.a.b.f.a parama)
  {
    a(paramString, null, null, parama, null);
  }
  
  public void a(boolean paramBoolean)
  {
    this.j.a(paramBoolean);
  }
  
  public void b(ImageView paramImageView)
  {
    this.j.b(new com.b.a.b.e.b(paramImageView));
  }
  
  public void b(com.b.a.b.e.a parama)
  {
    this.j.b(parama);
  }
  
  public void b(boolean paramBoolean)
  {
    this.j.b(paramBoolean);
  }
  
  public boolean b()
  {
    return this.i != null;
  }
  
  public com.b.a.a.b.c c()
  {
    m();
    return this.i.n;
  }
  
  public void d()
  {
    m();
    this.i.n.b();
  }
  
  @Deprecated
  public com.b.a.a.a.a e()
  {
    return f();
  }
  
  public com.b.a.a.a.a f()
  {
    m();
    return this.i.o;
  }
  
  @Deprecated
  public void g()
  {
    h();
  }
  
  public void h()
  {
    m();
    this.i.o.c();
  }
  
  public void i()
  {
    this.j.a();
  }
  
  public void j()
  {
    this.j.b();
  }
  
  public void k()
  {
    this.j.c();
  }
  
  public void l()
  {
    if (this.i != null) {
      com.b.a.c.d.a("Destroy ImageLoader", new Object[0]);
    }
    k();
    this.i.o.b();
    this.j = null;
    this.i = null;
  }
  
  private static class a
    extends com.b.a.b.f.d
  {
    private Bitmap a;
    
    public Bitmap a()
    {
      return this.a;
    }
    
    public void a(String paramString, View paramView, Bitmap paramBitmap)
    {
      this.a = paramBitmap;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */