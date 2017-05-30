package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.u;

@aaa
public class abo
{
  private final Object a = new Object();
  private int b;
  private int c;
  private final abl d;
  private final String e;
  
  abo(abl paramabl, String paramString)
  {
    this.d = paramabl;
    this.e = paramString;
  }
  
  public abo(String paramString)
  {
    this(u.i(), paramString);
  }
  
  public Bundle a()
  {
    synchronized (this.a)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("pmnli", this.b);
      localBundle.putInt("pmnll", this.c);
      return localBundle;
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    synchronized (this.a)
    {
      this.b = paramInt1;
      this.c = paramInt2;
      this.d.a(this.e, this);
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/abo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */