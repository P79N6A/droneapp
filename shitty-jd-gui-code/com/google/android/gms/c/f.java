package com.google.android.gms.c;

import java.lang.reflect.Field;

public final class f<T>
  extends e.a
{
  private final T a;
  
  private f(T paramT)
  {
    this.a = paramT;
  }
  
  public static <T> e a(T paramT)
  {
    return new f(paramT);
  }
  
  public static <T> T a(e parame)
  {
    if ((parame instanceof f)) {
      return (T)((f)parame).a;
    }
    parame = parame.asBinder();
    Object localObject = parame.getClass().getDeclaredFields();
    if (localObject.length == 1)
    {
      localObject = localObject[0];
      if (!((Field)localObject).isAccessible())
      {
        ((Field)localObject).setAccessible(true);
        try
        {
          parame = ((Field)localObject).get(parame);
          return parame;
        }
        catch (NullPointerException parame)
        {
          throw new IllegalArgumentException("Binder object is null.", parame);
        }
        catch (IllegalAccessException parame)
        {
          throw new IllegalArgumentException("Could not access the field in remoteBinder.", parame);
        }
      }
      throw new IllegalArgumentException("IObjectWrapper declared field not private!");
    }
    int i = localObject.length;
    throw new IllegalArgumentException(64 + "Unexpected number of IObjectWrapper declared fields: " + i);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */