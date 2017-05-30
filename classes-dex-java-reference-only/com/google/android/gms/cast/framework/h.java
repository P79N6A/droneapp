package com.google.android.gms.cast.framework;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.StringRes;
import android.support.v7.app.MediaRouteButton;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.afj;
import com.google.android.gms.internal.afk;

public abstract interface h
{
  public abstract void a();
  
  public abstract void b();
  
  public static class a
  {
    private Activity a;
    private View b;
    private int c;
    private String d;
    private h.b e;
    private boolean f;
    private float g;
    private String h;
    
    public a(Activity paramActivity, MediaRouteButton paramMediaRouteButton)
    {
      this.a = ((Activity)d.a(paramActivity));
      this.b = ((View)d.a(paramMediaRouteButton));
    }
    
    @TargetApi(11)
    public a(Activity paramActivity, MenuItem paramMenuItem)
    {
      this.a = ((Activity)d.a(paramActivity));
      if (s.a()) {
        this.b = ((MenuItem)d.a(paramMenuItem)).getActionView();
      }
    }
    
    public a a()
    {
      this.f = true;
      return this;
    }
    
    public a a(float paramFloat)
    {
      this.g = paramFloat;
      return this;
    }
    
    public a a(@ColorRes int paramInt)
    {
      this.c = this.a.getResources().getColor(paramInt);
      return this;
    }
    
    public a a(h.b paramb)
    {
      this.e = paramb;
      return this;
    }
    
    public a a(String paramString)
    {
      this.d = paramString;
      return this;
    }
    
    public Activity b()
    {
      return this.a;
    }
    
    public a b(@StringRes int paramInt)
    {
      this.d = this.a.getResources().getString(paramInt);
      return this;
    }
    
    public a b(String paramString)
    {
      this.h = paramString;
      return this;
    }
    
    public View c()
    {
      return this.b;
    }
    
    public a c(@DimenRes int paramInt)
    {
      this.g = this.a.getResources().getDimension(paramInt);
      return this;
    }
    
    public a d(@StringRes int paramInt)
    {
      this.h = this.a.getResources().getString(paramInt);
      return this;
    }
    
    public h.b d()
    {
      return this.e;
    }
    
    public int e()
    {
      return this.c;
    }
    
    public boolean f()
    {
      return this.f;
    }
    
    public String g()
    {
      return this.d;
    }
    
    public String h()
    {
      return this.h;
    }
    
    public float i()
    {
      return this.g;
    }
    
    public h j()
    {
      if (s.e()) {
        return new afj(this);
      }
      return new afk(this);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a();
  }
  
  public static class c
  {
    public static void a(Context paramContext)
    {
      PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putBoolean("googlecast-introOverlayShown", true).apply();
    }
    
    public static boolean b(Context paramContext)
    {
      return PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean("googlecast-introOverlayShown", false);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */