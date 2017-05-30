package com.fimi.soul.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class am
{
  public static Map<String, String> a(String paramString)
  {
    paramString = new Scanner(paramString);
    HashMap localHashMap = new HashMap();
    while (paramString.hasNextLine())
    {
      String[] arrayOfString = paramString.nextLine().split("=");
      if ((arrayOfString != null) && (arrayOfString.length == 2)) {
        localHashMap.put(arrayOfString[0], arrayOfString[1]);
      }
    }
    return localHashMap;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */