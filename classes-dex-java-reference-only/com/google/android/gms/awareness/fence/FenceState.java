package com.google.android.gms.awareness.fence;

import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class FenceState
  extends AbstractSafeParcelable
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  
  public static FenceState a(Intent paramIntent)
  {
    return FenceStateImpl.b(paramIntent);
  }
  
  public abstract int a();
  
  public abstract int b();
  
  public abstract long c();
  
  public abstract String d();
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface a {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/fence/FenceState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */