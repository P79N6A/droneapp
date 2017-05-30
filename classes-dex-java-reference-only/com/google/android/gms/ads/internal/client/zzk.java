package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.ads.d;
import com.google.android.gms.internal.aaa;

@aaa
public final class zzk
{
  private final d[] a;
  private final String b;
  
  public zzk(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.getResources().obtainAttributes(paramAttributeSet, R.styleable.AdsAttrs);
    paramAttributeSet = paramContext.getString(R.styleable.AdsAttrs_adSize);
    String str = paramContext.getString(R.styleable.AdsAttrs_adSizes);
    int i;
    if (!TextUtils.isEmpty(paramAttributeSet))
    {
      i = 1;
      if (TextUtils.isEmpty(str)) {
        break label106;
      }
      label53:
      if ((i == 0) || (j != 0)) {
        break label112;
      }
    }
    for (this.a = a(paramAttributeSet);; this.a = a(str))
    {
      this.b = paramContext.getString(R.styleable.AdsAttrs_adUnitId);
      if (!TextUtils.isEmpty(this.b)) {
        return;
      }
      throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
      i = 0;
      break;
      label106:
      j = 0;
      break label53;
      label112:
      if ((i != 0) || (j == 0)) {
        break label133;
      }
    }
    label133:
    if (i != 0) {
      throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
    }
    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
  }
  
  private static d[] a(String paramString)
  {
    String[] arrayOfString1 = paramString.split("\\s*,\\s*");
    d[] arrayOfd = new d[arrayOfString1.length];
    int i = 0;
    if (i < arrayOfString1.length)
    {
      String str = arrayOfString1[i].trim();
      String[] arrayOfString2;
      if (str.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$"))
      {
        arrayOfString2 = str.split("[xX]");
        arrayOfString2[0] = arrayOfString2[0].trim();
        arrayOfString2[1] = arrayOfString2[1].trim();
      }
      for (;;)
      {
        try
        {
          if ("FULL_WIDTH".equals(arrayOfString2[0]))
          {
            j = -1;
            boolean bool = "AUTO_HEIGHT".equals(arrayOfString2[1]);
            if (!bool) {
              continue;
            }
            k = -2;
            arrayOfd[i] = new d(j, k);
            i += 1;
            break;
          }
          int j = Integer.parseInt(arrayOfString2[0]);
          continue;
          int k = Integer.parseInt(arrayOfString2[1]);
          continue;
          paramString = "Could not parse XML attribute \"adSize\": ".concat(paramString);
        }
        catch (NumberFormatException paramString)
        {
          paramString = String.valueOf(str);
          if (paramString.length() == 0) {}
        }
        for (;;)
        {
          throw new IllegalArgumentException(paramString);
          paramString = new String("Could not parse XML attribute \"adSize\": ");
        }
        if ("BANNER".equals(str))
        {
          arrayOfd[i] = d.c;
        }
        else if ("LARGE_BANNER".equals(str))
        {
          arrayOfd[i] = d.e;
        }
        else if ("FULL_BANNER".equals(str))
        {
          arrayOfd[i] = d.d;
        }
        else if ("LEADERBOARD".equals(str))
        {
          arrayOfd[i] = d.f;
        }
        else if ("MEDIUM_RECTANGLE".equals(str))
        {
          arrayOfd[i] = d.g;
        }
        else if ("SMART_BANNER".equals(str))
        {
          arrayOfd[i] = d.i;
        }
        else if ("WIDE_SKYSCRAPER".equals(str))
        {
          arrayOfd[i] = d.h;
        }
        else
        {
          if (!"FLUID".equals(str)) {
            break label353;
          }
          arrayOfd[i] = d.j;
        }
      }
      label353:
      paramString = String.valueOf(str);
      if (paramString.length() != 0) {}
      for (paramString = "Could not parse XML attribute \"adSize\": ".concat(paramString);; paramString = new String("Could not parse XML attribute \"adSize\": ")) {
        throw new IllegalArgumentException(paramString);
      }
    }
    if (arrayOfd.length == 0)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {}
      for (paramString = "Could not parse XML attribute \"adSize\": ".concat(paramString);; paramString = new String("Could not parse XML attribute \"adSize\": ")) {
        throw new IllegalArgumentException(paramString);
      }
    }
    return arrayOfd;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public d[] a(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.a.length != 1)) {
      throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */