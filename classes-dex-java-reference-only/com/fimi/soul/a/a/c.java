package com.fimi.soul.a.a;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.view.Display;
import android.view.WindowManager;

public class c
{
  public int a;
  private Activity b;
  
  public c(Activity paramActivity)
  {
    this.b = paramActivity;
  }
  
  private void c()
  {
    this.b.setRequestedOrientation(this.a);
  }
  
  private void d()
  {
    int j = ((WindowManager)this.b.getSystemService("window")).getDefaultDisplay().getRotation();
    int i = this.b.getResources().getConfiguration().orientation;
    if (((j != 0) && (j != 2)) || ((i == 2) || (((j == 1) || (j == 3)) && (i == 1))))
    {
      i = 1;
      if (i == 0) {
        break label144;
      }
      switch (j)
      {
      }
    }
    for (;;)
    {
      c();
      return;
      i = 0;
      break;
      this.a = 0;
      continue;
      this.a = 9;
      continue;
      this.a = 8;
      continue;
      this.a = 1;
      continue;
      switch (j)
      {
      default: 
        break;
      case 0: 
        this.a = 1;
        break;
      case 1: 
        this.a = 0;
        break;
      case 2: 
        this.a = 9;
        break;
      case 3: 
        label144:
        this.a = 8;
      }
    }
  }
  
  private boolean e()
  {
    return PreferenceManager.getDefaultSharedPreferences(this.b.getApplicationContext()).getBoolean("pref_lock_screen_orientation", false);
  }
  
  public void a()
  {
    if (e()) {
      d();
    }
  }
  
  public void b()
  {
    if (this.a != -1)
    {
      this.a = -1;
      c();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */