package com.b.a.c;

import java.io.File;

public final class a
{
  public static File a(String paramString, com.b.a.a.a.a parama)
  {
    paramString = parama.a(paramString);
    if ((paramString != null) && (paramString.exists())) {
      return paramString;
    }
    return null;
  }
  
  public static boolean b(String paramString, com.b.a.a.a.a parama)
  {
    paramString = parama.a(paramString);
    return (paramString != null) && (paramString.exists()) && (paramString.delete());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */