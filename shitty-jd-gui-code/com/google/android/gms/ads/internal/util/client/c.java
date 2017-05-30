package com.google.android.gms.ads.internal.util.client;

import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.internal.aaa;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@aaa
public class c
  implements a.a
{
  @Nullable
  private final String a;
  
  public c()
  {
    this(null);
  }
  
  public c(@Nullable String paramString)
  {
    this.a = paramString;
  }
  
  @WorkerThread
  public void a(String paramString)
  {
    for (;;)
    {
      try
      {
        localObject1 = String.valueOf(paramString);
        if (((String)localObject1).length() != 0)
        {
          localObject1 = "Pinging URL: ".concat((String)localObject1);
          b.a((String)localObject1);
          localObject1 = (HttpURLConnection)new URL(paramString).openConnection();
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        Object localObject1;
        int i;
        str1 = String.valueOf(localIndexOutOfBoundsException.getMessage());
        b.d(String.valueOf(paramString).length() + 32 + String.valueOf(str1).length() + "Error while parsing ping URL: " + paramString + ". " + str1);
        return;
      }
      catch (IOException localIOException)
      {
        String str1;
        String str2 = String.valueOf(localIOException.getMessage());
        b.d(String.valueOf(paramString).length() + 27 + String.valueOf(str2).length() + "Error while pinging URL: " + paramString + ". " + str2);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        String str3 = String.valueOf(localRuntimeException.getMessage());
        b.d(String.valueOf(paramString).length() + 27 + String.valueOf(str3).length() + "Error while pinging URL: " + paramString + ". " + str3);
      }
      try
      {
        ac.a().a(true, (HttpURLConnection)localObject1, this.a);
        i = ((HttpURLConnection)localObject1).getResponseCode();
        if ((i < 200) || (i >= 300)) {
          b.d(String.valueOf(paramString).length() + 65 + "Received non-success response code " + i + " from pinging URL: " + paramString);
        }
        ((HttpURLConnection)localObject1).disconnect();
        return;
      }
      finally
      {
        str1.disconnect();
      }
      localObject1 = new String("Pinging URL: ");
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/client/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */