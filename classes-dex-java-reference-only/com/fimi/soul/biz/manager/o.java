package com.fimi.soul.biz.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.fimi.kernel.utils.v;

public class o
{
  private static String a = "screenlight";
  private static String b = "soundmax";
  private static String c = "autoupdate";
  private static String d = "push_control";
  private static String e = "open_position";
  private static String f = "mapchangge";
  private static o g = null;
  private v h;
  
  public o(Context paramContext)
  {
    this.h = v.a(paramContext);
  }
  
  public static o a(Context paramContext)
  {
    if (g == null) {
      g = new o(paramContext);
    }
    return g;
  }
  
  public void a(boolean paramBoolean)
  {
    this.h.a().edit().putBoolean(d, paramBoolean).commit();
  }
  
  public boolean a()
  {
    return this.h.a().getBoolean(a, false);
  }
  
  public void b(boolean paramBoolean)
  {
    this.h.a().edit().putBoolean(e, paramBoolean).commit();
  }
  
  public boolean b()
  {
    return this.h.a().getBoolean(b, false);
  }
  
  public void c(boolean paramBoolean)
  {
    this.h.a().edit().putBoolean(c, paramBoolean).commit();
  }
  
  public boolean c()
  {
    return this.h.a().getBoolean(c, false);
  }
  
  public void d(boolean paramBoolean)
  {
    this.h.a().edit().putBoolean(b, paramBoolean).commit();
  }
  
  public boolean d()
  {
    return this.h.a().getBoolean(e, true);
  }
  
  public void e(boolean paramBoolean)
  {
    this.h.a().edit().putBoolean(a, paramBoolean).commit();
  }
  
  public boolean e()
  {
    return this.h.a().getBoolean(f, false);
  }
  
  public void f(boolean paramBoolean)
  {
    this.h.a().edit().putBoolean(f, paramBoolean).commit();
  }
  
  public boolean f()
  {
    return this.h.a().getBoolean(d, true);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */