package com.google.android.gms.cast.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;

public abstract class c
  extends d
{
  protected final Handler a = new Handler(Looper.getMainLooper());
  protected final e b;
  protected final long c;
  protected final Runnable d;
  protected boolean e;
  
  public c(String paramString1, e parame, String paramString2, String paramString3)
  {
    this(paramString1, parame, paramString2, paramString3, 1000L);
  }
  
  public c(String paramString1, e parame, String paramString2, String paramString3, long paramLong)
  {
    super(paramString1, paramString2, paramString3);
    this.b = parame;
    this.d = new a(null);
    this.c = paramLong;
    a(false);
  }
  
  public c(String paramString1, String paramString2, String paramString3)
  {
    this(paramString1, h.d(), paramString2, paramString3);
  }
  
  public void a()
  {
    a(false);
  }
  
  protected final void a(boolean paramBoolean)
  {
    if (this.e != paramBoolean)
    {
      this.e = paramBoolean;
      if (paramBoolean) {
        this.a.postDelayed(this.d, this.c);
      }
    }
    else
    {
      return;
    }
    this.a.removeCallbacks(this.d);
  }
  
  protected abstract boolean a(long paramLong);
  
  private class a
    implements Runnable
  {
    private a() {}
    
    public void run()
    {
      c.this.e = false;
      long l = c.this.b.b();
      boolean bool = c.this.a(l);
      c.this.a(bool);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */