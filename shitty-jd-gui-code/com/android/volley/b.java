package com.android.volley;

import java.util.Collections;
import java.util.Map;

public abstract interface b
{
  public abstract a a(String paramString);
  
  public abstract void a();
  
  public abstract void a(String paramString, a parama);
  
  public abstract void a(String paramString, boolean paramBoolean);
  
  public abstract void b();
  
  public abstract void b(String paramString);
  
  public static class a
  {
    public byte[] a;
    public String b;
    public long c;
    public long d;
    public long e;
    public long f;
    public Map<String, String> g = Collections.emptyMap();
    
    public boolean a()
    {
      return this.e < System.currentTimeMillis();
    }
    
    public boolean b()
    {
      return this.f < System.currentTimeMillis();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */