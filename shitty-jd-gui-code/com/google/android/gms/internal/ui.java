package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.text.TextUtils;

@aaa
public class ui
{
  @Nullable
  public uh a(@Nullable ug paramug)
  {
    if (paramug == null) {
      throw new IllegalArgumentException("CSI configuration can't be null. ");
    }
    if (!paramug.a())
    {
      abr.e("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
      return null;
    }
    if (paramug.c() == null) {
      throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
    if (TextUtils.isEmpty(paramug.d())) {
      throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
    }
    return new uh(paramug.c(), paramug.d(), paramug.b(), paramug.e());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/ui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */