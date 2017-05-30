package com.fimi.kernel.b.a;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.io.File;

public class b
  extends com.fimi.kernel.b
  implements d
{
  private static b b;
  private final String a = b.class.getName();
  private it.a.a.b c = null;
  private c d = null;
  private com.fimi.kernel.b.c.b e = null;
  private a f = null;
  private String g;
  private String h;
  private File i;
  
  private boolean a(String paramString1, int paramInt, String paramString2, String paramString3, boolean paramBoolean)
  {
    try
    {
      this.c.a(paramBoolean);
      if (this.c.l()) {
        return true;
      }
      this.c.a(paramString1, paramInt);
      this.c.a(paramString2, paramString3);
      return true;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
    return false;
  }
  
  public static b b()
  {
    try
    {
      b = new b();
      b localb = b;
      return localb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected void a(Message paramMessage)
  {
    boolean bool = true;
    if (paramMessage.what == a.a.ordinal()) {
      if (paramMessage.arg1 != 1) {
        break label95;
      }
    }
    for (;;)
    {
      if (this.e != null) {
        this.e.a(bool, "SUCCESS");
      }
      if (((paramMessage.what == a.b.ordinal()) || (paramMessage.what == a.c.ordinal())) && (this.f != null)) {
        this.f.a(a.a.values()[paramMessage.arg1], paramMessage.arg2);
      }
      return;
      label95:
      bool = false;
    }
  }
  
  public void a(c paramc)
  {
    this.d = paramc;
  }
  
  public void a(com.fimi.kernel.b.c.b paramb)
  {
    this.e = paramb;
    a(new Runnable()
    {
      public void run()
      {
        Message localMessage = new Message();
        localMessage.what = b.a.a.ordinal();
        if (b.this.e()) {}
        for (localMessage.arg1 = 1;; localMessage.arg1 = 0)
        {
          b.a(b.this).sendMessage(localMessage);
          return;
        }
      }
    });
  }
  
  public void a(File paramFile, a parama)
  {
    try
    {
      this.c.a(paramFile, parama);
      return;
    }
    catch (Exception paramFile)
    {
      Log.d(this.a, paramFile.toString());
    }
  }
  
  public void a(String paramString, int paramInt, com.fimi.kernel.b.c.b paramb)
  {
    this.d.a(paramString);
    this.d.a(paramInt);
    a(paramb);
  }
  
  public void a(String paramString, a parama)
  {
    paramString = new File(paramString);
    if (parama != null) {}
    try
    {
      this.c.a(paramString, parama);
      return;
    }
    catch (Exception paramString)
    {
      Log.d(this.a, paramString.toString());
    }
    this.c.a(paramString);
    return;
  }
  
  public void a(String paramString, com.fimi.kernel.b.c.b paramb)
  {
    this.d.a(paramString);
    a(paramb);
  }
  
  public void a(String paramString1, String paramString2, a parama)
  {
    try
    {
      this.c.a(paramString1, new File(paramString2), parama);
      return;
    }
    catch (Exception paramString1)
    {
      Log.d(this.a, paramString1.toString());
    }
  }
  
  public boolean a(String paramString)
  {
    return a(paramString, this.d.b(), this.d.c(), this.d.d(), this.d.e());
  }
  
  public boolean a(String paramString, int paramInt)
  {
    return a(paramString, paramInt, this.d.c(), this.d.d(), this.d.e());
  }
  
  public boolean a(String paramString1, String paramString2)
  {
    try
    {
      this.c.b(paramString1, paramString2);
      return true;
    }
    catch (Exception paramString1)
    {
      Log.d(this.a, paramString1.toString());
    }
    return false;
  }
  
  public void b(File paramFile, a parama)
  {
    this.i = paramFile;
    this.f = parama;
    a(new Runnable()
    {
      public void run()
      {
        try
        {
          if (b.f(b.this).isFile()) {
            b.e(b.this).a(b.f(b.this), new a()
            {
              public void a(a.a paramAnonymous2a, int paramAnonymous2Int)
              {
                Message localMessage = new Message();
                localMessage.what = b.a.c.ordinal();
                localMessage.arg1 = paramAnonymous2a.ordinal();
                localMessage.arg2 = paramAnonymous2Int;
                b.g(b.this).sendMessage(localMessage);
              }
            });
          }
          return;
        }
        catch (Exception localException)
        {
          Log.d(b.h(b.this), localException.toString());
        }
      }
    });
  }
  
  public void b(String paramString, a parama)
  {
    this.f = parama;
    if (new File(paramString).isFile()) {
      b(this.i, parama);
    }
  }
  
  public void b(String paramString1, String paramString2, a parama)
  {
    this.f = parama;
    this.g = paramString1;
    this.h = paramString2;
    a(new Runnable()
    {
      public void run()
      {
        try
        {
          b.e(b.this).a(b.b(b.this), new File(b.c(b.this)), new a()
          {
            public void a(a.a paramAnonymous2a, int paramAnonymous2Int)
            {
              Message localMessage = new Message();
              localMessage.what = b.a.b.ordinal();
              localMessage.arg1 = paramAnonymous2a.ordinal();
              localMessage.arg2 = paramAnonymous2Int;
              b.d(b.this).sendMessage(localMessage);
            }
          });
          return;
        }
        catch (Exception localException) {}
      }
    });
  }
  
  public boolean b(String paramString)
  {
    try
    {
      this.c.e(paramString);
      return true;
    }
    catch (Exception paramString)
    {
      Log.d(this.a, paramString.toString());
    }
    return false;
  }
  
  public c c()
  {
    return this.d;
  }
  
  public boolean d()
  {
    return this.c.l();
  }
  
  public boolean e()
  {
    return a(this.d.a(), this.d.b(), this.d.c(), this.d.d(), this.d.e());
  }
  
  public String f()
  {
    try
    {
      String str = this.c.y();
      return str;
    }
    catch (Exception localException)
    {
      Log.d(this.a, localException.toString());
    }
    return null;
  }
  
  public String[] g()
  {
    try
    {
      String[] arrayOfString = this.c.D();
      return arrayOfString;
    }
    catch (Exception localException)
    {
      Log.d(this.a, localException.toString());
    }
    return null;
  }
  
  public void h()
  {
    try
    {
      this.c.c(true);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */