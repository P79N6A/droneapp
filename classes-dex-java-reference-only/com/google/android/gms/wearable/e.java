package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract interface e
{
  public static final String a = "com.google.android.gms.wearable.DATA_CHANGED";
  public static final int b = 0;
  public static final int c = 1;
  
  public abstract com.google.android.gms.common.api.i<j> a(com.google.android.gms.common.api.g paramg);
  
  public abstract com.google.android.gms.common.api.i<a> a(com.google.android.gms.common.api.g paramg, Uri paramUri);
  
  public abstract com.google.android.gms.common.api.i<j> a(com.google.android.gms.common.api.g paramg, Uri paramUri, int paramInt);
  
  public abstract com.google.android.gms.common.api.i<e> a(com.google.android.gms.common.api.g paramg, Asset paramAsset);
  
  public abstract com.google.android.gms.common.api.i<a> a(com.google.android.gms.common.api.g paramg, PutDataRequest paramPutDataRequest);
  
  public abstract com.google.android.gms.common.api.i<Status> a(com.google.android.gms.common.api.g paramg, b paramb);
  
  public abstract com.google.android.gms.common.api.i<Status> a(com.google.android.gms.common.api.g paramg, b paramb, Uri paramUri, int paramInt);
  
  public abstract com.google.android.gms.common.api.i<e> a(com.google.android.gms.common.api.g paramg, i parami);
  
  public abstract com.google.android.gms.common.api.i<j> b(com.google.android.gms.common.api.g paramg, Uri paramUri);
  
  public abstract com.google.android.gms.common.api.i<c> b(com.google.android.gms.common.api.g paramg, Uri paramUri, int paramInt);
  
  public abstract com.google.android.gms.common.api.i<Status> b(com.google.android.gms.common.api.g paramg, b paramb);
  
  public abstract com.google.android.gms.common.api.i<c> c(com.google.android.gms.common.api.g paramg, Uri paramUri);
  
  public static abstract interface a
    extends m
  {
    public abstract h b();
  }
  
  public static abstract interface b
  {
    public abstract void a(g paramg);
  }
  
  public static abstract interface c
    extends m
  {
    public abstract int b();
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface d {}
  
  public static abstract interface e
    extends k, m
  {
    public abstract ParcelFileDescriptor c();
    
    public abstract InputStream d();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/wearable/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */