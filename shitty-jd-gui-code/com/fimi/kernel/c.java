package com.fimi.kernel;

import android.app.Activity;
import android.content.Context;
import com.fimi.kernel.b.d;
import com.fimi.kernel.c.a;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.view.b;

public final class c
{
  private static Context a = null;
  private static Activity b = null;
  private static String c = null;
  
  public static Context a()
  {
    return a;
  }
  
  public static <T> T a(d paramd)
  {
    return com.fimi.kernel.b.c.a(paramd);
  }
  
  public static void a(Activity paramActivity)
  {
    b = null;
    b = paramActivity;
    c = b.getClass().getName();
  }
  
  public static void a(Context paramContext)
  {
    a = paramContext;
  }
  
  public static b b()
  {
    return com.fimi.kernel.view.c.a();
  }
  
  public static void b(Activity paramActivity)
  {
    if (paramActivity.getClass().getName().equals(c))
    {
      b = null;
      c = null;
    }
  }
  
  public static a c()
  {
    return com.fimi.kernel.c.c.a();
  }
  
  public static Activity d()
  {
    return b;
  }
  
  public static v e()
  {
    return v.a(a());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */