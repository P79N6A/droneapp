package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.concurrent.TimeUnit;

public abstract class i<R extends m>
{
  @NonNull
  public abstract R a(long paramLong, @NonNull TimeUnit paramTimeUnit);
  
  @NonNull
  public <S extends m> q<S> a(@NonNull p<? super R, ? extends S> paramp)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract void a();
  
  public void a(@NonNull a parama)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract void a(@NonNull n<? super R> paramn);
  
  public abstract void a(@NonNull n<? super R> paramn, long paramLong, @NonNull TimeUnit paramTimeUnit);
  
  @NonNull
  public abstract R d();
  
  public abstract boolean e();
  
  @Nullable
  public Integer f()
  {
    throw new UnsupportedOperationException();
  }
  
  public static abstract interface a
  {
    public abstract void a(Status paramStatus);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */