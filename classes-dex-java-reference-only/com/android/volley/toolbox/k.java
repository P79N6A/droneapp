package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.android.volley.n;
import com.android.volley.o;
import com.android.volley.p.a;
import com.android.volley.p.b;
import com.android.volley.u;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class k
{
  private final o a;
  private int b = 100;
  private final b c;
  private final HashMap<String, a> d = new HashMap();
  private final HashMap<String, a> e = new HashMap();
  private final Handler f = new Handler(Looper.getMainLooper());
  private Runnable g;
  
  public k(o paramo, b paramb)
  {
    this.a = paramo;
    this.c = paramb;
  }
  
  public static d a(final ImageView paramImageView, final int paramInt1, int paramInt2)
  {
    new d()
    {
      public void a(k.c paramAnonymousc, boolean paramAnonymousBoolean)
      {
        if (paramAnonymousc.b() != null) {
          paramImageView.setImageBitmap(paramAnonymousc.b());
        }
        while (paramInt1 == 0) {
          return;
        }
        paramImageView.setImageResource(paramInt1);
      }
      
      public void a(u paramAnonymousu)
      {
        if (this.a != 0) {
          paramImageView.setImageResource(this.a);
        }
      }
    };
  }
  
  private void a()
  {
    if (Looper.myLooper() != Looper.getMainLooper()) {
      throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
    }
  }
  
  private void a(String paramString, a parama)
  {
    this.e.put(paramString, parama);
    if (this.g == null)
    {
      this.g = new Runnable()
      {
        public void run()
        {
          Iterator localIterator1 = k.b(k.this).values().iterator();
          while (localIterator1.hasNext())
          {
            k.a locala = (k.a)localIterator1.next();
            Iterator localIterator2 = k.a.a(locala).iterator();
            while (localIterator2.hasNext())
            {
              k.c localc = (k.c)localIterator2.next();
              if (k.c.a(localc) != null) {
                if (locala.a() == null)
                {
                  k.c.a(localc, k.a.b(locala));
                  k.c.a(localc).a(localc, false);
                }
                else
                {
                  k.c.a(localc).a(locala.a());
                }
              }
            }
          }
          k.b(k.this).clear();
          k.a(k.this, null);
        }
      };
      this.f.postDelayed(this.g, this.b);
    }
  }
  
  private static String b(String paramString, int paramInt1, int paramInt2, ImageView.ScaleType paramScaleType)
  {
    return paramString.length() + 12 + "#W" + paramInt1 + "#H" + paramInt2 + "#S" + paramScaleType.ordinal() + paramString;
  }
  
  protected n<Bitmap> a(String paramString1, int paramInt1, int paramInt2, ImageView.ScaleType paramScaleType, final String paramString2)
  {
    new l(paramString1, new p.b()
    {
      public void a(Bitmap paramAnonymousBitmap)
      {
        k.this.a(paramString2, paramAnonymousBitmap);
      }
    }, paramInt1, paramInt2, paramScaleType, Bitmap.Config.RGB_565, new p.a()
    {
      public void a(u paramAnonymousu)
      {
        k.this.a(paramString2, paramAnonymousu);
      }
    });
  }
  
  public c a(String paramString, d paramd)
  {
    return a(paramString, paramd, 0, 0);
  }
  
  public c a(String paramString, d paramd, int paramInt1, int paramInt2)
  {
    return a(paramString, paramd, paramInt1, paramInt2, ImageView.ScaleType.CENTER_INSIDE);
  }
  
  public c a(String paramString, d paramd, int paramInt1, int paramInt2, ImageView.ScaleType paramScaleType)
  {
    a();
    String str = b(paramString, paramInt1, paramInt2, paramScaleType);
    Object localObject = this.c.a(str);
    if (localObject != null)
    {
      paramString = new c((Bitmap)localObject, paramString, null, null);
      paramd.a(paramString, true);
      return paramString;
    }
    localObject = new c(null, paramString, str, paramd);
    paramd.a((c)localObject, true);
    paramd = (a)this.d.get(str);
    if (paramd != null)
    {
      paramd.a((c)localObject);
      return (c)localObject;
    }
    paramString = a(paramString, paramInt1, paramInt2, paramScaleType, str);
    this.a.a(paramString);
    this.d.put(str, new a(paramString, (c)localObject));
    return (c)localObject;
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  protected void a(String paramString, Bitmap paramBitmap)
  {
    this.c.a(paramString, paramBitmap);
    a locala = (a)this.d.remove(paramString);
    if (locala != null)
    {
      a.a(locala, paramBitmap);
      a(paramString, locala);
    }
  }
  
  protected void a(String paramString, u paramu)
  {
    a locala = (a)this.d.remove(paramString);
    if (locala != null)
    {
      locala.a(paramu);
      a(paramString, locala);
    }
  }
  
  public boolean a(String paramString, int paramInt1, int paramInt2)
  {
    return a(paramString, paramInt1, paramInt2, ImageView.ScaleType.CENTER_INSIDE);
  }
  
  public boolean a(String paramString, int paramInt1, int paramInt2, ImageView.ScaleType paramScaleType)
  {
    a();
    paramString = b(paramString, paramInt1, paramInt2, paramScaleType);
    return this.c.a(paramString) != null;
  }
  
  private class a
  {
    private final n<?> b;
    private Bitmap c;
    private u d;
    private final LinkedList<k.c> e = new LinkedList();
    
    public a(k.c paramc)
    {
      this.b = paramc;
      Object localObject;
      this.e.add(localObject);
    }
    
    public u a()
    {
      return this.d;
    }
    
    public void a(k.c paramc)
    {
      this.e.add(paramc);
    }
    
    public void a(u paramu)
    {
      this.d = paramu;
    }
    
    public boolean b(k.c paramc)
    {
      this.e.remove(paramc);
      if (this.e.size() == 0)
      {
        this.b.l();
        return true;
      }
      return false;
    }
  }
  
  public static abstract interface b
  {
    public abstract Bitmap a(String paramString);
    
    public abstract void a(String paramString, Bitmap paramBitmap);
  }
  
  public class c
  {
    private Bitmap b;
    private final k.d c;
    private final String d;
    private final String e;
    
    public c(Bitmap paramBitmap, String paramString1, String paramString2, k.d paramd)
    {
      this.b = paramBitmap;
      this.e = paramString1;
      this.d = paramString2;
      this.c = paramd;
    }
    
    public void a()
    {
      if (this.c == null) {}
      k.a locala;
      do
      {
        do
        {
          do
          {
            return;
            locala = (k.a)k.a(k.this).get(this.d);
            if (locala == null) {
              break;
            }
          } while (!locala.b(this));
          k.a(k.this).remove(this.d);
          return;
          locala = (k.a)k.b(k.this).get(this.d);
        } while (locala == null);
        locala.b(this);
      } while (k.a.a(locala).size() != 0);
      k.b(k.this).remove(this.d);
    }
    
    public Bitmap b()
    {
      return this.b;
    }
    
    public String c()
    {
      return this.e;
    }
  }
  
  public static abstract interface d
    extends p.a
  {
    public abstract void a(k.c paramc, boolean paramBoolean);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */