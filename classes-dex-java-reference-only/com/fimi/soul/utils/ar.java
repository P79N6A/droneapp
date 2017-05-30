package com.fimi.soul.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.android.volley.o;
import com.android.volley.toolbox.k.c;
import com.android.volley.toolbox.k.d;
import com.android.volley.toolbox.t;
import com.android.volley.u;
import com.fimi.kernel.utils.n;

public class ar
{
  private Context a = null;
  private int b;
  private int c;
  private int d;
  private Drawable e;
  private View f;
  private Drawable g;
  private Drawable h;
  private o i;
  private com.android.volley.toolbox.k j = null;
  private b k = null;
  private a l = null;
  
  public ar(Context paramContext)
  {
    this.a = paramContext;
    this.i = t.a(paramContext);
    this.j = new com.android.volley.toolbox.k(this.i, aq.a());
  }
  
  public static ar a(Context paramContext)
  {
    return new ar(paramContext);
  }
  
  public int a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    this.e = this.a.getResources().getDrawable(paramInt);
  }
  
  public void a(View paramView)
  {
    this.f = paramView;
  }
  
  public void a(final ImageView paramImageView, String paramString)
  {
    if (n.b(paramString))
    {
      if (this.h != null)
      {
        if (this.f != null) {
          this.f.setVisibility(4);
        }
        paramImageView.setVisibility(0);
        paramImageView.setImageDrawable(this.h);
      }
      if (this.l != null) {
        this.l.a();
      }
      return;
    }
    if (this.f != null)
    {
      this.f.setVisibility(0);
      paramImageView.setVisibility(4);
    }
    for (;;)
    {
      paramImageView.setTag(paramString);
      this.j.a(paramString, new k.d()
      {
        public void a(k.c paramAnonymousc, boolean paramAnonymousBoolean)
        {
          Bitmap localBitmap = paramAnonymousc.b();
          if (ar.d(ar.this) != null) {
            ar.d(ar.this).a(localBitmap);
          }
          if (ar.b(ar.this) != null) {
            ar.b(ar.this).a();
          }
          com.fimi.kernel.utils.k.a(ar.class, "获取到图片：" + localBitmap);
          if (!paramAnonymousc.c().equals(paramImageView.getTag())) {
            return;
          }
          if (localBitmap != null) {
            paramImageView.setImageBitmap(localBitmap);
          }
          for (;;)
          {
            if (ar.c(ar.this) != null) {
              ar.c(ar.this).setVisibility(4);
            }
            paramImageView.setVisibility(0);
            return;
            if (ar.e(ar.this) != null) {
              paramImageView.setImageDrawable(ar.e(ar.this));
            }
          }
        }
        
        public void a(u paramAnonymousu)
        {
          if (ar.a(ar.this) != null) {
            paramImageView.setImageDrawable(ar.a(ar.this));
          }
          if (ar.b(ar.this) != null) {
            ar.b(ar.this).a();
          }
          paramImageView.setVisibility(0);
          if (ar.c(ar.this) != null) {
            ar.c(ar.this).setVisibility(4);
          }
        }
      }, this.b, this.c);
      return;
      if (this.e != null)
      {
        paramImageView.setImageDrawable(this.e);
        paramImageView.setVisibility(0);
      }
    }
  }
  
  public void a(a parama)
  {
    this.l = parama;
  }
  
  public void a(b paramb)
  {
    this.k = paramb;
  }
  
  public void a(String paramString)
  {
    if (n.b(paramString)) {
      return;
    }
    this.j.a(paramString, new k.d()
    {
      public void a(k.c paramAnonymousc, boolean paramAnonymousBoolean)
      {
        paramAnonymousc = paramAnonymousc.b();
        if (ar.d(ar.this) != null) {
          ar.d(ar.this).a(paramAnonymousc);
        }
        com.fimi.kernel.utils.k.a(ar.class, "获取到图片：" + paramAnonymousc);
      }
      
      public void a(u paramAnonymousu) {}
    }, this.b, this.c);
  }
  
  public int b()
  {
    return this.c;
  }
  
  public void b(int paramInt)
  {
    this.g = this.a.getResources().getDrawable(paramInt);
  }
  
  public int c()
  {
    return this.d;
  }
  
  public void c(int paramInt)
  {
    this.h = this.a.getResources().getDrawable(paramInt);
  }
  
  public b d()
  {
    return this.k;
  }
  
  public void d(int paramInt)
  {
    this.b = paramInt;
  }
  
  public a e()
  {
    return this.l;
  }
  
  public void e(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void f(int paramInt)
  {
    this.d = paramInt;
  }
  
  public static abstract interface a
  {
    public abstract void a();
  }
  
  public static abstract interface b
  {
    public abstract void a(Bitmap paramBitmap);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */