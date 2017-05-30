package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract interface m
{
  public static final String a = "com.google.android.gms.wearable.MESSAGE_RECEIVED";
  public static final int b = 0;
  public static final int c = 1;
  public static final int d = -1;
  
  public abstract i<Status> a(g paramg, b paramb);
  
  public abstract i<Status> a(g paramg, b paramb, Uri paramUri, int paramInt);
  
  public abstract i<c> a(g paramg, String paramString1, String paramString2, byte[] paramArrayOfByte);
  
  public abstract i<Status> b(g paramg, b paramb);
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface a {}
  
  public static abstract interface b
  {
    public abstract void a(n paramn);
  }
  
  public static abstract interface c
    extends com.google.android.gms.common.api.m
  {
    public abstract int b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/wearable/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */