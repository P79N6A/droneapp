package com.google.android.gms.nearby.messages;

import android.support.annotation.NonNull;
import com.google.android.gms.nearby.messages.internal.DistanceImpl;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract interface b
  extends Comparable<b>
{
  public static final b a = new DistanceImpl(1, NaN.0D);
  
  public abstract int a();
  
  public abstract int a(@NonNull b paramb);
  
  public abstract double b();
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface a
  {
    public static final int a = 1;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/nearby/messages/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */