package com.google.firebase.messaging;

import java.util.Locale;

public final class b
  extends Exception
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 3;
  public static final int e = 4;
  private final int f = a(paramString);
  
  b(String paramString)
  {
    super(paramString);
  }
  
  private int a(String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    paramString = paramString.toLowerCase(Locale.US);
    int i = -1;
    switch (paramString.hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        return 0;
      case 0: 
      case 1: 
        return 1;
        if (paramString.equals("invalid_parameters"))
        {
          i = 0;
          continue;
          if (paramString.equals("missing_to"))
          {
            i = 1;
            continue;
            if (paramString.equals("messagetoobig"))
            {
              i = 2;
              continue;
              if (paramString.equals("service_not_available"))
              {
                i = 3;
                continue;
                if (paramString.equals("toomanymessages")) {
                  i = 4;
                }
              }
            }
          }
        }
        break;
      }
    }
    return 2;
    return 3;
    return 4;
  }
  
  public int a()
  {
    return this.f;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/messaging/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */