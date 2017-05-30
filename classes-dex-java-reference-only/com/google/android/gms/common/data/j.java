package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;

public abstract class j
{
  private int c;
  protected final DataHolder c_;
  protected int d_;
  
  public j(DataHolder paramDataHolder, int paramInt)
  {
    this.c_ = ((DataHolder)d.a(paramDataHolder));
    a(paramInt);
  }
  
  protected void a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.c_.g())) {}
    for (boolean bool = true;; bool = false)
    {
      d.a(bool);
      this.d_ = paramInt;
      this.c = this.c_.a(this.d_);
      return;
    }
  }
  
  protected void a(String paramString, CharArrayBuffer paramCharArrayBuffer)
  {
    this.c_.a(paramString, this.d_, this.c, paramCharArrayBuffer);
  }
  
  protected long b(String paramString)
  {
    return this.c_.a(paramString, this.d_, this.c);
  }
  
  public boolean b()
  {
    return !this.c_.h();
  }
  
  protected int c(String paramString)
  {
    return this.c_.b(paramString, this.d_, this.c);
  }
  
  protected boolean d(String paramString)
  {
    return this.c_.d(paramString, this.d_, this.c);
  }
  
  public boolean d_(String paramString)
  {
    return this.c_.a(paramString);
  }
  
  protected String e(String paramString)
  {
    return this.c_.c(paramString, this.d_, this.c);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof j))
    {
      paramObject = (j)paramObject;
      bool1 = bool2;
      if (c.a(Integer.valueOf(((j)paramObject).d_), Integer.valueOf(this.d_)))
      {
        bool1 = bool2;
        if (c.a(Integer.valueOf(((j)paramObject).c), Integer.valueOf(this.c)))
        {
          bool1 = bool2;
          if (((j)paramObject).c_ == this.c_) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  protected float f(String paramString)
  {
    return this.c_.e(paramString, this.d_, this.c);
  }
  
  protected byte[] g(String paramString)
  {
    return this.c_.f(paramString, this.d_, this.c);
  }
  
  protected Uri h(String paramString)
  {
    return this.c_.g(paramString, this.d_, this.c);
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { Integer.valueOf(this.d_), Integer.valueOf(this.c), this.c_ });
  }
  
  protected boolean i(String paramString)
  {
    return this.c_.h(paramString, this.d_, this.c);
  }
  
  protected int n_()
  {
    return this.d_;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/data/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */