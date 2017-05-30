package com.google.android.gms.ads.internal.cache;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abw;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@aaa
public class CacheOffering
  extends AbstractSafeParcelable
{
  public static final d CREATOR = new d();
  public final int a;
  @Nullable
  public final String b;
  public final long c;
  public final String d;
  public final String e;
  public final String f;
  public final Bundle g;
  public final boolean h;
  
  CacheOffering(int paramInt, @Nullable String paramString1, long paramLong, String paramString2, String paramString3, String paramString4, Bundle paramBundle, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramLong;
    if (paramString2 != null)
    {
      this.d = paramString2;
      if (paramString3 == null) {
        break label77;
      }
      label35:
      this.e = paramString3;
      if (paramString4 == null) {
        break label84;
      }
      label46:
      this.f = paramString4;
      if (paramBundle == null) {
        break label91;
      }
    }
    for (;;)
    {
      this.g = paramBundle;
      this.h = paramBoolean;
      return;
      paramString2 = "";
      break;
      label77:
      paramString3 = "";
      break label35;
      label84:
      paramString4 = "";
      break label46;
      label91:
      paramBundle = new Bundle();
    }
  }
  
  @Nullable
  public static CacheOffering a(Uri paramUri)
  {
    try
    {
      if (!"gcache".equals(paramUri.getScheme())) {
        return null;
      }
      localObject1 = paramUri.getPathSegments();
      if (((List)localObject1).size() != 2)
      {
        int i = ((List)localObject1).size();
        abr.d(62 + "Expected 2 path parts for namespace and id, found :" + i);
        return null;
      }
      str1 = (String)((List)localObject1).get(0);
      localObject1 = (String)((List)localObject1).get(1);
      str2 = paramUri.getHost();
      str3 = paramUri.getQueryParameter("url");
      bool = "1".equals(paramUri.getQueryParameter("read_only"));
      localObject2 = paramUri.getQueryParameter("expiration");
      if (localObject2 != null) {
        break label220;
      }
      l = 0L;
    }
    catch (NullPointerException paramUri)
    {
      Object localObject1;
      String str1;
      String str2;
      String str3;
      boolean bool;
      Object localObject2;
      long l;
      for (;;)
      {
        Iterator localIterator;
        abr.d("Unable to parse Uri into cache offering.", paramUri);
        return null;
        l = Long.parseLong((String)localObject2);
      }
      paramUri = new CacheOffering(1, str3, l, str2, str1, (String)localObject1, (Bundle)localObject2, bool);
      return paramUri;
    }
    catch (NumberFormatException paramUri)
    {
      label220:
      for (;;) {}
    }
    localObject2 = new Bundle();
    localIterator = u.g().a(paramUri).iterator();
    while (localIterator.hasNext())
    {
      String str4 = (String)localIterator.next();
      if (str4.startsWith("tag.")) {
        ((Bundle)localObject2).putString(str4.substring("tag.".length()), paramUri.getQueryParameter(str4));
      }
    }
  }
  
  @Nullable
  public static CacheOffering a(String paramString)
  {
    return a(Uri.parse(paramString));
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/cache/CacheOffering.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */