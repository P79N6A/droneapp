package com.google.android.gms.cast.internal;

import com.google.android.gms.common.api.a.g;
import com.google.android.gms.internal.agv;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public final class l
{
  public static final a.g<e> a = new a.g();
  public static final a.g<agv> b = new a.g();
  public static final a.g<Object> c = new a.g();
  public static final a.g<Object> d = new a.g();
  public static final Charset e;
  public static final String f = f.b("com.google.cast.multizone");
  
  static
  {
    Object localObject = null;
    try
    {
      Charset localCharset = Charset.forName("UTF-8");
      localObject = localCharset;
    }
    catch (UnsupportedCharsetException localUnsupportedCharsetException)
    {
      for (;;) {}
    }
    catch (IllegalCharsetNameException localIllegalCharsetNameException)
    {
      for (;;) {}
    }
    e = (Charset)localObject;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/internal/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */