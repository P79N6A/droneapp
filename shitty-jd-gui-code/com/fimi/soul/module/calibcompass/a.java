package com.fimi.soul.module.calibcompass;

import java.util.concurrent.ConcurrentHashMap;

public class a
{
  private static a a;
  private volatile ConcurrentHashMap<String, com.fimi.soul.module.b.a> b = new ConcurrentHashMap();
  
  public static a a()
  {
    if (a == null) {
      a = new a();
    }
    return a;
  }
  
  public void a(String paramString)
  {
    com.fimi.soul.module.b.a locala = (com.fimi.soul.module.b.a)this.b.get(paramString);
    if (locala != null) {
      locala.b();
    }
    this.b.remove(paramString);
  }
  
  public void a(String paramString, com.fimi.soul.module.b.a parama)
  {
    if (parama != null) {
      this.b.put(paramString, parama);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/calibcompass/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */