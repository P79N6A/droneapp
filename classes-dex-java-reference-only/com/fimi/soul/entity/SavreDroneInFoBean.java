package com.fimi.soul.entity;

import com.fimi.soul.drone.c.a.c;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public class SavreDroneInFoBean
  implements Serializable
{
  private ConcurrentHashMap<String, c> hashMap = new ConcurrentHashMap();
  
  public ConcurrentHashMap<String, c> getHashMap()
  {
    return this.hashMap;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/SavreDroneInFoBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */