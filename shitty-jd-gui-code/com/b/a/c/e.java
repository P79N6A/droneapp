package com.b.a.c;

import android.graphics.Bitmap;
import com.b.a.a.b.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class e
{
  private static final String a = "_";
  private static final String b = "x";
  
  public static String a(String paramString, com.b.a.b.a.e parame)
  {
    return paramString + "_" + parame.a() + "x" + parame.b();
  }
  
  public static Comparator<String> a()
  {
    new Comparator()
    {
      public int a(String paramAnonymousString1, String paramAnonymousString2)
      {
        return paramAnonymousString1.substring(0, paramAnonymousString1.lastIndexOf("_")).compareTo(paramAnonymousString2.substring(0, paramAnonymousString2.lastIndexOf("_")));
      }
    };
  }
  
  public static List<Bitmap> a(String paramString, c paramc)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramc.a().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str.startsWith(paramString)) {
        localArrayList.add(paramc.a(str));
      }
    }
    return localArrayList;
  }
  
  public static List<String> b(String paramString, c paramc)
  {
    ArrayList localArrayList = new ArrayList();
    paramc = paramc.a().iterator();
    while (paramc.hasNext())
    {
      String str = (String)paramc.next();
      if (str.startsWith(paramString)) {
        localArrayList.add(str);
      }
    }
    return localArrayList;
  }
  
  public static void c(String paramString, c paramc)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramc.a().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str.startsWith(paramString)) {
        localArrayList.add(str);
      }
    }
    paramString = localArrayList.iterator();
    while (paramString.hasNext()) {
      paramc.b((String)paramString.next());
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */