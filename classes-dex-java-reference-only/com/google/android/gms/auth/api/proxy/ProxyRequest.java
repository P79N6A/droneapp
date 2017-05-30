package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Patterns;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProxyRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ProxyRequest> CREATOR = new d();
  public static final int a = 2;
  public static final int b = 0;
  public static final int c = 1;
  public static final int d = 2;
  public static final int e = 3;
  public static final int f = 4;
  public static final int g = 5;
  public static final int h = 6;
  public static final int i = 7;
  public static final int j = 7;
  final int k;
  public final String l;
  public final int m;
  public final long n;
  public final byte[] o;
  Bundle p;
  
  ProxyRequest(int paramInt1, String paramString, int paramInt2, long paramLong, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    this.k = paramInt1;
    this.l = paramString;
    this.m = paramInt2;
    this.n = paramLong;
    this.o = paramArrayOfByte;
    this.p = paramBundle;
  }
  
  public Map<String, String> a()
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(this.p.size());
    Iterator localIterator = this.p.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localLinkedHashMap.put(str, this.p.getString(str));
    }
    return Collections.unmodifiableMap(localLinkedHashMap);
  }
  
  public String toString()
  {
    String str = this.l;
    int i1 = this.m;
    return String.valueOf(str).length() + 42 + "ProxyRequest[ url: " + str + ", method: " + i1 + " ]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
  
  public static class a
  {
    private String a;
    private int b = ProxyRequest.b;
    private long c = 3000L;
    private byte[] d = null;
    private Bundle e = new Bundle();
    
    public a(String paramString)
    {
      com.google.android.gms.common.internal.d.a(paramString);
      if (Patterns.WEB_URL.matcher(paramString).matches())
      {
        this.a = paramString;
        return;
      }
      throw new IllegalArgumentException(String.valueOf(paramString).length() + 51 + "The supplied url [ " + paramString + "] is not match Patterns.WEB_URL!");
    }
    
    public a a(int paramInt)
    {
      if ((paramInt >= 0) && (paramInt <= ProxyRequest.j)) {}
      for (boolean bool = true;; bool = false)
      {
        com.google.android.gms.common.internal.d.b(bool, "Unrecognized http method code.");
        this.b = paramInt;
        return this;
      }
    }
    
    public a a(long paramLong)
    {
      if (paramLong >= 0L) {}
      for (boolean bool = true;; bool = false)
      {
        com.google.android.gms.common.internal.d.b(bool, "The specified timeout must be non-negative.");
        this.c = paramLong;
        return this;
      }
    }
    
    public a a(String paramString1, String paramString2)
    {
      com.google.android.gms.common.internal.d.a(paramString1, "Header name cannot be null or empty!");
      Bundle localBundle = this.e;
      String str = paramString2;
      if (paramString2 == null) {
        str = "";
      }
      localBundle.putString(paramString1, str);
      return this;
    }
    
    public a a(byte[] paramArrayOfByte)
    {
      this.d = paramArrayOfByte;
      return this;
    }
    
    public ProxyRequest a()
    {
      if (this.d == null) {
        this.d = new byte[0];
      }
      return new ProxyRequest(2, this.a, this.b, this.c, this.d, this.e);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/proxy/ProxyRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */