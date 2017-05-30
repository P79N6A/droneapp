package com.fimi.soul.biz.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import java.util.concurrent.atomic.AtomicInteger;

public class h
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 3;
  public static final int e = 4;
  private static h g;
  private AtomicInteger f = new AtomicInteger(0);
  private SharedPreferences h;
  
  public h(Context paramContext)
  {
    this.h = PreferenceManager.getDefaultSharedPreferences(paramContext);
    a(this.h.getInt("action_model_type", 0));
  }
  
  public static h a(Context paramContext)
  {
    if (g == null) {
      g = new h(paramContext);
    }
    return g;
  }
  
  public AtomicInteger a()
  {
    return this.f;
  }
  
  public void a(int paramInt)
  {
    this.f.set(paramInt);
    this.h.edit().putInt("action_model_type", paramInt).commit();
  }
  
  public boolean b()
  {
    return (1 == this.f.get()) || (2 == this.f.get()) || (3 == this.f.get());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */