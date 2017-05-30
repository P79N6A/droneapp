package com.fimi.soul.biz.g;

import android.content.Context;
import com.fimi.kernel.utils.v;

public class a
{
  public static String a(Context paramContext, int paramInt)
  {
    return d(paramContext, paramInt).f("macAlgorithm");
  }
  
  public static void a(Context paramContext, int paramInt, String paramString)
  {
    d(paramContext, paramInt).a("macAlgorithm", paramString);
  }
  
  public static String b(Context paramContext, int paramInt)
  {
    return d(paramContext, paramInt).f("mackey");
  }
  
  public static void b(Context paramContext, int paramInt, String paramString)
  {
    d(paramContext, paramInt).a("mackey", paramString);
  }
  
  public static String c(Context paramContext, int paramInt)
  {
    return d(paramContext, paramInt).f("accessToken");
  }
  
  public static void c(Context paramContext, int paramInt, String paramString)
  {
    d(paramContext, paramInt).a("accessToken", paramString);
  }
  
  private static v d(Context paramContext, int paramInt)
  {
    return v.a(paramContext);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */