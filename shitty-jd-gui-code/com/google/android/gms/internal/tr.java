package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@aaa
public abstract class tr
{
  @Nullable
  private static MessageDigest b = null;
  protected Object a = new Object();
  
  @Nullable
  protected MessageDigest a()
  {
    for (;;)
    {
      MessageDigest localMessageDigest;
      int i;
      synchronized (this.a)
      {
        if (b != null)
        {
          localMessageDigest = b;
          return localMessageDigest;
        }
        i = 0;
        if (i >= 2) {}
      }
      try
      {
        b = MessageDigest.getInstance("MD5");
        i += 1;
        continue;
        localMessageDigest = b;
        return localMessageDigest;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        for (;;) {}
      }
    }
  }
  
  abstract byte[] a(String paramString);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/tr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */