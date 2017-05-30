package com.google.android.gms.analytics.internal;

import java.util.Map;

public class n
  extends ag<o>
{
  public n(v paramv)
  {
    super(paramv, new a(paramv));
  }
  
  private static class a
    extends s
    implements ag.a<o>
  {
    private final o a = new o();
    
    public a(v paramv)
    {
      super();
    }
    
    public o a()
    {
      return this.a;
    }
    
    public void a(String paramString, int paramInt)
    {
      if ("ga_sessionTimeout".equals(paramString))
      {
        this.a.c = paramInt;
        return;
      }
      d("int configuration name not recognized", paramString);
    }
    
    public void a(String paramString1, String paramString2)
    {
      this.a.g.put(paramString1, paramString2);
    }
    
    public void a(String paramString, boolean paramBoolean)
    {
      int j = 1;
      int k = 1;
      int i = 1;
      if ("ga_autoActivityTracking".equals(paramString))
      {
        paramString = this.a;
        if (paramBoolean) {}
        for (;;)
        {
          paramString.d = i;
          return;
          i = 0;
        }
      }
      if ("ga_anonymizeIp".equals(paramString))
      {
        paramString = this.a;
        if (paramBoolean) {}
        for (i = j;; i = 0)
        {
          paramString.e = i;
          return;
        }
      }
      if ("ga_reportUncaughtExceptions".equals(paramString))
      {
        paramString = this.a;
        if (paramBoolean) {}
        for (i = k;; i = 0)
        {
          paramString.f = i;
          return;
        }
      }
      d("bool configuration name not recognized", paramString);
    }
    
    public void b(String paramString1, String paramString2)
    {
      if ("ga_trackingId".equals(paramString1))
      {
        this.a.a = paramString2;
        return;
      }
      if ("ga_sampleFrequency".equals(paramString1)) {
        try
        {
          this.a.b = Double.parseDouble(paramString2);
          return;
        }
        catch (NumberFormatException paramString1)
        {
          c("Error parsing ga_sampleFrequency value", paramString2, paramString1);
          return;
        }
      }
      d("string configuration name not recognized", paramString1);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */