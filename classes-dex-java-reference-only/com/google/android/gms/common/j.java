package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.util.i;
import com.google.android.gms.internal.ajo;
import com.google.android.gms.internal.ajp;

public class j
{
  private static final j a = new j();
  public static final int c = l.e;
  public static final String d = "com.google.android.gms";
  
  public static j b()
  {
    return a;
  }
  
  private String b(@Nullable Context paramContext, @Nullable String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("gcore_");
    localStringBuilder.append(c);
    localStringBuilder.append("-");
    if (!TextUtils.isEmpty(paramString)) {
      localStringBuilder.append(paramString);
    }
    localStringBuilder.append("-");
    if (paramContext != null) {
      localStringBuilder.append(paramContext.getPackageName());
    }
    localStringBuilder.append("-");
    if (paramContext != null) {}
    try
    {
      localStringBuilder.append(ajp.b(paramContext).b(paramContext.getPackageName(), 0).versionCode);
      return localStringBuilder.toString();
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
  
  public int a(Context paramContext)
  {
    int j = l.e(paramContext);
    int i = j;
    if (l.d(paramContext, j)) {
      i = 18;
    }
    return i;
  }
  
  @Nullable
  public PendingIntent a(Context paramContext, int paramInt1, int paramInt2)
  {
    return a(paramContext, paramInt1, paramInt2, null);
  }
  
  @Nullable
  public PendingIntent a(Context paramContext, int paramInt1, int paramInt2, @Nullable String paramString)
  {
    int i = paramInt1;
    if (i.a(paramContext))
    {
      i = paramInt1;
      if (paramInt1 == 2) {
        i = 42;
      }
    }
    paramString = a(paramContext, i, paramString);
    if (paramString == null) {
      return null;
    }
    return PendingIntent.getActivity(paramContext, paramInt2, paramString, 268435456);
  }
  
  @Nullable
  public Intent a(Context paramContext, int paramInt, @Nullable String paramString)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
    case 2: 
      return aa.a("com.google.android.gms", b(paramContext, paramString));
    case 42: 
      return aa.a();
    }
    return aa.a("com.google.android.gms");
  }
  
  public boolean a(int paramInt)
  {
    return l.g(paramInt);
  }
  
  public boolean a(Context paramContext, String paramString)
  {
    return l.a(paramContext, paramString);
  }
  
  @Deprecated
  @Nullable
  public Intent b(int paramInt)
  {
    return a(null, paramInt, null);
  }
  
  @Nullable
  public String b(Context paramContext)
  {
    return l.j(paramContext);
  }
  
  public boolean b(Context paramContext, int paramInt)
  {
    return l.d(paramContext, paramInt);
  }
  
  public int c(Context paramContext)
  {
    return l.m(paramContext);
  }
  
  public String c(int paramInt)
  {
    return l.d(paramInt);
  }
  
  public void d(Context paramContext)
  {
    l.f(paramContext);
  }
  
  public void e(Context paramContext)
  {
    l.i(paramContext);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */