package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.common.api.k;
import java.lang.ref.WeakReference;
import java.util.Map;

@aaa
public abstract class wi
  implements k
{
  protected Context a;
  protected String b;
  protected WeakReference<acy> c;
  
  public wi(acy paramacy)
  {
    this.a = paramacy.getContext();
    this.b = u.e().a(this.a, paramacy.o().b);
    this.c = new WeakReference(paramacy);
  }
  
  private void a(String paramString, Map<String, String> paramMap)
  {
    acy localacy = (acy)this.c.get();
    if (localacy != null) {
      localacy.a(paramString, paramMap);
    }
  }
  
  private String c(String paramString)
  {
    int i = -1;
    switch (paramString.hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        return "internal";
        if (paramString.equals("error"))
        {
          i = 0;
          continue;
          if (paramString.equals("playerFailed"))
          {
            i = 1;
            continue;
            if (paramString.equals("inProgress"))
            {
              i = 2;
              continue;
              if (paramString.equals("contentLengthMissing"))
              {
                i = 3;
                continue;
                if (paramString.equals("noCacheDir"))
                {
                  i = 4;
                  continue;
                  if (paramString.equals("expireFailed"))
                  {
                    i = 5;
                    continue;
                    if (paramString.equals("badUrl"))
                    {
                      i = 6;
                      continue;
                      if (paramString.equals("downloadTimeout"))
                      {
                        i = 7;
                        continue;
                        if (paramString.equals("sizeExceeded"))
                        {
                          i = 8;
                          continue;
                          if (paramString.equals("externalAbort")) {
                            i = 9;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;
      }
    }
    return "internal";
    return "io";
    return "network";
    return "policy";
  }
  
  public abstract void a();
  
  protected void a(String paramString1, String paramString2, int paramInt)
  {
    a.a.post(new wi.2(this, paramString1, paramString2, paramInt));
  }
  
  protected void a(String paramString1, String paramString2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    a.a.post(new wi.1(this, paramString1, paramString2, paramInt1, paramInt2, paramBoolean));
  }
  
  public void a(String paramString1, String paramString2, String paramString3, @Nullable String paramString4)
  {
    a.a.post(new wi.3(this, paramString1, paramString2, paramString3, paramString4));
  }
  
  public abstract boolean a(String paramString);
  
  protected String b(String paramString)
  {
    return ac.a().a(paramString);
  }
  
  public void b() {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/wi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */