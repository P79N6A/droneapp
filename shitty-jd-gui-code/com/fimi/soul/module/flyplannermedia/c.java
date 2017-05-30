package com.fimi.soul.module.flyplannermedia;

import com.fimi.soul.entity.WifiDistanceFile;
import java.util.Comparator;

public class c
  implements Comparator<WifiDistanceFile>
{
  public int a(WifiDistanceFile paramWifiDistanceFile1, WifiDistanceFile paramWifiDistanceFile2)
  {
    return -paramWifiDistanceFile1.getName().compareTo(paramWifiDistanceFile2.getName());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/flyplannermedia/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */