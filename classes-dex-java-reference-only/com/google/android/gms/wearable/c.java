package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract interface c
{
  public static final String a = "com.google.android.gms.wearable.CHANNEL_EVENT";
  
  public abstract i<Status> a(g paramg, a parama);
  
  public abstract i<c> a(g paramg, String paramString1, String paramString2);
  
  public abstract i<Status> b(g paramg, a parama);
  
  public static abstract interface a
  {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    
    public abstract void a(Channel paramChannel);
    
    public abstract void a(Channel paramChannel, int paramInt1, int paramInt2);
    
    public abstract void b(Channel paramChannel, int paramInt1, int paramInt2);
    
    public abstract void c(Channel paramChannel, int paramInt1, int paramInt2);
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface b {}
  
  public static abstract interface c
    extends m
  {
    public abstract Channel b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/wearable/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */