package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

@aaa
class wq
{
  private final Object[] a;
  
  wq(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    this.a = a(paramAdRequestParcel, paramString, paramInt);
  }
  
  private static String a(@Nullable Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = new TreeSet(paramBundle.keySet()).iterator();
    if (localIterator.hasNext())
    {
      Object localObject = paramBundle.get((String)localIterator.next());
      if (localObject == null) {
        localObject = "null";
      }
      for (;;)
      {
        localStringBuilder.append((String)localObject);
        break;
        if ((localObject instanceof Bundle)) {
          localObject = a((Bundle)localObject);
        } else {
          localObject = localObject.toString();
        }
      }
    }
    return localStringBuilder.toString();
  }
  
  private static Object[] a(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    HashSet localHashSet = new HashSet(Arrays.asList(((String)uf.ax.c()).split(",")));
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString);
    if (localHashSet.contains("networkType")) {
      localArrayList.add(Integer.valueOf(paramInt));
    }
    if (localHashSet.contains("birthday")) {
      localArrayList.add(Long.valueOf(paramAdRequestParcel.b));
    }
    if (localHashSet.contains("extras")) {
      localArrayList.add(a(paramAdRequestParcel.c));
    }
    if (localHashSet.contains("gender")) {
      localArrayList.add(Integer.valueOf(paramAdRequestParcel.d));
    }
    if (localHashSet.contains("keywords"))
    {
      if (paramAdRequestParcel.e != null) {
        localArrayList.add(paramAdRequestParcel.e.toString());
      }
    }
    else
    {
      if (localHashSet.contains("isTestDevice")) {
        localArrayList.add(Boolean.valueOf(paramAdRequestParcel.f));
      }
      if (localHashSet.contains("tagForChildDirectedTreatment")) {
        localArrayList.add(Integer.valueOf(paramAdRequestParcel.g));
      }
      if (localHashSet.contains("manualImpressionsEnabled")) {
        localArrayList.add(Boolean.valueOf(paramAdRequestParcel.h));
      }
      if (localHashSet.contains("publisherProvidedId")) {
        localArrayList.add(paramAdRequestParcel.i);
      }
      if (localHashSet.contains("location"))
      {
        if (paramAdRequestParcel.k == null) {
          break label447;
        }
        localArrayList.add(paramAdRequestParcel.k.toString());
      }
      label289:
      if (localHashSet.contains("contentUrl")) {
        localArrayList.add(paramAdRequestParcel.l);
      }
      if (localHashSet.contains("networkExtras")) {
        localArrayList.add(a(paramAdRequestParcel.m));
      }
      if (localHashSet.contains("customTargeting")) {
        localArrayList.add(a(paramAdRequestParcel.n));
      }
      if (localHashSet.contains("categoryExclusions"))
      {
        if (paramAdRequestParcel.o == null) {
          break label457;
        }
        localArrayList.add(paramAdRequestParcel.o.toString());
      }
    }
    for (;;)
    {
      if (localHashSet.contains("requestAgent")) {
        localArrayList.add(paramAdRequestParcel.p);
      }
      if (localHashSet.contains("requestPackage")) {
        localArrayList.add(paramAdRequestParcel.q);
      }
      return localArrayList.toArray();
      localArrayList.add(null);
      break;
      label447:
      localArrayList.add(null);
      break label289;
      label457:
      localArrayList.add(null);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof wq)) {
      return false;
    }
    paramObject = (wq)paramObject;
    return Arrays.equals(this.a, ((wq)paramObject).a);
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(this.a);
  }
  
  public String toString()
  {
    String str = String.valueOf(Arrays.toString(this.a));
    return String.valueOf(str).length() + 24 + "[InterstitialAdPoolKey " + str + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/wq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */