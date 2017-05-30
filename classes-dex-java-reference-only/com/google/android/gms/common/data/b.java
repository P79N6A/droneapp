package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.api.k;
import java.util.Iterator;

public abstract interface b<T>
  extends k, Iterable<T>
{
  public abstract T a(int paramInt);
  
  public abstract void b();
  
  public abstract int c();
  
  @Deprecated
  public abstract void d();
  
  @Deprecated
  public abstract boolean e();
  
  public abstract Bundle f();
  
  public abstract Iterator<T> g();
  
  public abstract Iterator<T> iterator();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/data/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */