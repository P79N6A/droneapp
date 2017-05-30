package com.fimi.soul.biz.h;

import com.fimi.soul.drone.c.a.c;
import java.util.HashMap;

public class a
{
  public static a a;
  private volatile HashMap<Integer, c> b = new HashMap();
  
  public static a a()
  {
    if (a == null) {}
    try
    {
      if (a == null) {
        a = new a();
      }
      return a;
    }
    finally {}
  }
  
  public void a(HashMap<Integer, c> paramHashMap)
  {
    this.b = paramHashMap;
  }
  
  public HashMap<Integer, c> b()
  {
    return this.b;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */