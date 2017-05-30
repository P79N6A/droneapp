package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.c.a;
import com.google.android.gms.ads.internal.client.d;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.util.f;
import java.util.HashMap;
import java.util.Map;

@aaa
public class add
  extends c.a
{
  private final acy a;
  private final Object b = new Object();
  private final float c;
  private int d;
  private d e;
  private boolean f;
  private boolean g;
  private float h;
  private boolean i = true;
  private float j;
  
  public add(acy paramacy, float paramFloat)
  {
    this.a = paramacy;
    this.c = paramFloat;
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    u.e().a(new add.2(this, paramInt1, paramInt2));
  }
  
  private void a(String paramString)
  {
    a(paramString, null);
  }
  
  private void a(String paramString, @Nullable Map<String, String> paramMap)
  {
    if (paramMap == null) {}
    for (paramMap = new HashMap();; paramMap = new HashMap(paramMap))
    {
      paramMap.put("action", paramString);
      u.e().a(new add.1(this, paramMap));
      return;
    }
  }
  
  public void a()
  {
    a("play");
  }
  
  public void a(float paramFloat1, int paramInt, boolean paramBoolean, float paramFloat2)
  {
    synchronized (this.b)
    {
      this.h = paramFloat1;
      this.g = paramBoolean;
      int k = this.d;
      this.d = paramInt;
      this.j = paramFloat2;
      a(k, paramInt);
      return;
    }
  }
  
  public void a(d paramd)
  {
    synchronized (this.b)
    {
      this.e = paramd;
      return;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (String str = "mute";; str = "unmute")
    {
      a(str);
      return;
    }
  }
  
  public void b()
  {
    a("pause");
  }
  
  public void b(boolean paramBoolean)
  {
    for (;;)
    {
      synchronized (this.b)
      {
        this.i = paramBoolean;
        if (paramBoolean)
        {
          ??? = "1";
          a("initialState", f.c("muteStart", ???));
          return;
        }
      }
      ??? = "0";
    }
  }
  
  public boolean c()
  {
    synchronized (this.b)
    {
      boolean bool = this.g;
      return bool;
    }
  }
  
  public int d()
  {
    synchronized (this.b)
    {
      int k = this.d;
      return k;
    }
  }
  
  public float e()
  {
    return this.c;
  }
  
  public float f()
  {
    synchronized (this.b)
    {
      float f1 = this.h;
      return f1;
    }
  }
  
  public float g()
  {
    synchronized (this.b)
    {
      float f1 = this.j;
      return f1;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/add.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */