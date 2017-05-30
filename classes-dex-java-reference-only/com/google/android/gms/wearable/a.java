package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public abstract interface a
{
  public static final String a = "com.google.android.gms.wearable.CAPABILITY_CHANGED";
  public static final int b = 0;
  public static final int c = 1;
  public static final int d = 0;
  public static final int e = 1;
  
  public abstract i<d> a(g paramg, int paramInt);
  
  public abstract i<Status> a(g paramg, c paramc);
  
  public abstract i<Status> a(g paramg, c paramc, Uri paramUri, int paramInt);
  
  public abstract i<Status> a(g paramg, c paramc, String paramString);
  
  public abstract i<a> a(g paramg, String paramString);
  
  public abstract i<e> a(g paramg, String paramString, int paramInt);
  
  public abstract i<Status> b(g paramg, c paramc, String paramString);
  
  public abstract i<g> b(g paramg, String paramString);
  
  public static abstract interface a
    extends m
  {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface b {}
  
  public static abstract interface c
  {
    public abstract void a(b paramb);
  }
  
  public static abstract interface d
    extends m
  {
    public abstract Map<String, b> b();
  }
  
  public static abstract interface e
    extends m
  {
    public abstract b b();
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface f {}
  
  public static abstract interface g
    extends m
  {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/wearable/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */