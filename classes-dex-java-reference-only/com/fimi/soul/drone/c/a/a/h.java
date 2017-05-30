package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;
import com.fimi.soul.drone.h.i;

public final class h
{
  public static g a(int paramInt, c paramc)
  {
    g localg = null;
    Object localObject;
    switch (paramInt)
    {
    default: 
      localObject = null;
    }
    for (;;)
    {
      if (localObject != null)
      {
        ((com.fimi.soul.drone.h.a)localObject).a(paramInt);
        localg = new g((com.fimi.soul.drone.c.a)localObject);
        localg.a = paramInt;
        localg.a(paramc.d);
      }
      return localg;
      localObject = new i();
      continue;
      localObject = new com.fimi.soul.drone.h.g();
      continue;
      localObject = new i();
    }
  }
  
  public static c a(int paramInt1, int paramInt2, d paramd)
  {
    paramd = new c(paramd);
    paramd.b = paramInt1;
    paramd.c = paramInt2;
    return paramd;
  }
  
  public static c a(int paramInt, byte[] paramArrayOfByte)
  {
    c localc = new c(a(paramArrayOfByte));
    localc.b = paramArrayOfByte.length;
    localc.c = paramInt;
    return localc;
  }
  
  public static d a(byte[] paramArrayOfByte)
  {
    d locald = new d();
    int j = paramArrayOfByte.length;
    int i = 0;
    while (i < j)
    {
      locald.b(paramArrayOfByte[i]);
      i += 1;
    }
    return locald;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */