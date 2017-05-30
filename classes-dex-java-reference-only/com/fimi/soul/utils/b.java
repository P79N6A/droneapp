package com.fimi.soul.utils;

import android.content.res.AssetManager;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class b
{
  public static float a(float paramFloat, String paramString)
  {
    double d = 0.0D;
    if (paramString.equalsIgnoreCase("m")) {
      d = paramFloat * 3.2808399D;
    }
    for (;;)
    {
      return new BigDecimal(d).setScale(1, 4).floatValue();
      if (paramString.equalsIgnoreCase("ft")) {
        d = paramFloat * 0.3048D;
      } else if (paramString.equalsIgnoreCase("mph")) {
        d = paramFloat * 2.236936D;
      }
    }
  }
  
  public static String a(double paramDouble, String paramString)
  {
    double d = 0.0D;
    if (paramString.equalsIgnoreCase("m")) {
      d = 3.2808399D * paramDouble;
    }
    for (;;)
    {
      return new DecimalFormat("###.00").format(d);
      if (paramString.equalsIgnoreCase("ft")) {
        d = 0.3048D * paramDouble;
      } else if (paramString.equalsIgnoreCase("mph")) {
        d = 2.236936D * paramDouble;
      }
    }
  }
  
  public static boolean a(AssetManager paramAssetManager, String paramString1, String paramString2)
  {
    boolean bool2 = false;
    paramAssetManager = paramAssetManager.list(paramString1);
    int j = paramAssetManager.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (paramAssetManager[i].equals(paramString2)) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */