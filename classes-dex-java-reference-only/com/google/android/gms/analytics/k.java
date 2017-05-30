package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class k
  implements r
{
  private static final Uri a;
  private final LogPrinter b = new LogPrinter(4, "GA/LogCatTransport");
  
  static
  {
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("uri");
    localBuilder.authority("local");
    a = localBuilder.build();
  }
  
  public Uri a()
  {
    return a;
  }
  
  public void a(l paraml)
  {
    Object localObject = new ArrayList(paraml.b());
    Collections.sort((List)localObject, new Comparator()
    {
      public int a(n paramAnonymousn1, n paramAnonymousn2)
      {
        return paramAnonymousn1.getClass().getCanonicalName().compareTo(paramAnonymousn2.getClass().getCanonicalName());
      }
    });
    paraml = new StringBuilder();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = ((n)((Iterator)localObject).next()).toString();
      if (!TextUtils.isEmpty(str))
      {
        if (paraml.length() != 0) {
          paraml.append(", ");
        }
        paraml.append(str);
      }
    }
    this.b.println(paraml.toString());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */