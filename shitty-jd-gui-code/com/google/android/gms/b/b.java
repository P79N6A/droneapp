package com.google.android.gms.b;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private final Uri a;
  
  private b(Uri paramUri)
  {
    this.a = paramUri;
  }
  
  public static b a(Uri paramUri)
  {
    paramUri = new b(paramUri);
    if (a(paramUri)) {
      return paramUri;
    }
    throw new IllegalArgumentException("AndroidAppUri validation failed.");
  }
  
  public static b a(String paramString, Uri paramUri)
  {
    paramString = new Uri.Builder().scheme("android-app").authority(paramString);
    if (paramUri != null)
    {
      paramString.appendPath(paramUri.getScheme());
      if (paramUri.getAuthority() != null) {
        paramString.appendPath(paramUri.getAuthority());
      }
      Iterator localIterator = paramUri.getPathSegments().iterator();
      while (localIterator.hasNext()) {
        paramString.appendPath((String)localIterator.next());
      }
      paramString.encodedQuery(paramUri.getEncodedQuery()).encodedFragment(paramUri.getEncodedFragment());
    }
    return new b(paramString.build());
  }
  
  private static boolean a(b paramb)
  {
    if (!"android-app".equals(paramb.a.getScheme())) {
      throw new IllegalArgumentException("android-app scheme is required.");
    }
    if (TextUtils.isEmpty(paramb.b())) {
      throw new IllegalArgumentException("Package name is empty.");
    }
    Uri localUri = a(paramb.b(), paramb.c()).a();
    if (!paramb.a.equals(localUri)) {
      throw new IllegalArgumentException("URI is not canonical.");
    }
    return true;
  }
  
  public Uri a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.a.getAuthority();
  }
  
  public Uri c()
  {
    List localList = this.a.getPathSegments();
    if (localList.size() > 0)
    {
      String str = (String)localList.get(0);
      Uri.Builder localBuilder = new Uri.Builder();
      localBuilder.scheme(str);
      if (localList.size() > 1)
      {
        localBuilder.authority((String)localList.get(1));
        int i = 2;
        while (i < localList.size())
        {
          localBuilder.appendPath((String)localList.get(i));
          i += 1;
        }
      }
      localBuilder.encodedQuery(this.a.getEncodedQuery());
      localBuilder.encodedFragment(this.a.getEncodedFragment());
      return localBuilder.build();
    }
    return null;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof b)) {
      return this.a.equals(((b)paramObject).a);
    }
    return false;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.a });
  }
  
  public String toString()
  {
    return this.a.toString();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */