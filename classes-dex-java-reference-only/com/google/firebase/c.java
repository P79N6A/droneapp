package com.google.firebase;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;

public class c
  extends Exception
{
  @Deprecated
  protected c() {}
  
  public c(@NonNull String paramString)
  {
    super(d.a(paramString, "Detail message must not be empty"));
  }
  
  public c(@NonNull String paramString, Throwable paramThrowable)
  {
    super(d.a(paramString, "Detail message must not be empty"), paramThrowable);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */