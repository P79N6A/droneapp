package com.fimi.soul.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class an
{
  public static final int a = -1728053248;
  private static boolean i;
  private final a b;
  private boolean c;
  private boolean d;
  private boolean e;
  private boolean f;
  private View g;
  private View h;
  
  static
  {
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      i = "V6".equals((String)localClass.getDeclaredMethod("get", new Class[] { String.class }).invoke(localClass, new Object[] { "ro.miui.ui.version.name" }));
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  @TargetApi(19)
  public an(Activity paramActivity)
  {
    Window localWindow = paramActivity.getWindow();
    ViewGroup localViewGroup = (ViewGroup)localWindow.getDecorView();
    Object localObject;
    if (Build.VERSION.SDK_INT >= 19) {
      localObject = paramActivity.obtainStyledAttributes(new int[] { 16843759, 16843760 });
    }
    try
    {
      this.c = ((TypedArray)localObject).getBoolean(0, false);
      this.d = ((TypedArray)localObject).getBoolean(1, false);
      ((TypedArray)localObject).recycle();
      localObject = localWindow.getAttributes();
      if ((0x4000000 & ((WindowManager.LayoutParams)localObject).flags) != 0) {
        this.c = true;
      }
      if ((((WindowManager.LayoutParams)localObject).flags & 0x8000000) != 0) {
        this.d = true;
      }
      this.b = new a(paramActivity, this.c, this.d, null);
      if (!this.b.d()) {
        this.d = false;
      }
      if (this.c) {
        a(paramActivity, localViewGroup);
      }
      if (this.d) {
        b(paramActivity, localViewGroup);
      }
      return;
    }
    finally
    {
      ((TypedArray)localObject).recycle();
    }
  }
  
  private void a(Context paramContext, ViewGroup paramViewGroup)
  {
    this.g = new View(paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, this.b.b());
    paramContext.gravity = 48;
    if ((this.d) && (!this.b.a())) {
      paramContext.rightMargin = this.b.f();
    }
    this.g.setLayoutParams(paramContext);
    this.g.setBackgroundColor(-1728053248);
    this.g.setVisibility(8);
    paramViewGroup.addView(this.g);
  }
  
  private void b(Context paramContext, ViewGroup paramViewGroup)
  {
    this.h = new View(paramContext);
    if (this.b.a()) {
      paramContext = new FrameLayout.LayoutParams(-1, this.b.e());
    }
    for (paramContext.gravity = 80;; paramContext.gravity = 5)
    {
      this.h.setLayoutParams(paramContext);
      this.h.setBackgroundColor(-1728053248);
      this.h.setVisibility(8);
      paramViewGroup.addView(this.h);
      return;
      paramContext = new FrameLayout.LayoutParams(this.b.f(), -1);
    }
  }
  
  public a a()
  {
    return this.b;
  }
  
  public void a(float paramFloat)
  {
    b(paramFloat);
    c(paramFloat);
  }
  
  public void a(int paramInt)
  {
    c(paramInt);
    e(paramInt);
  }
  
  public void a(Drawable paramDrawable)
  {
    b(paramDrawable);
    c(paramDrawable);
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
    View localView;
    if (this.c)
    {
      localView = this.g;
      if (!paramBoolean) {
        break label29;
      }
    }
    label29:
    for (int j = 0;; j = 8)
    {
      localView.setVisibility(j);
      return;
    }
  }
  
  public void a(boolean paramBoolean, Activity paramActivity)
  {
    int j = 0;
    Object localObject;
    if (i) {
      localObject = paramActivity.getWindow().getClass();
    }
    try
    {
      Class localClass = Class.forName("android.view.MiuiWindowManager$LayoutParams");
      int k = localClass.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(localClass);
      localObject = ((Class)localObject).getMethod("setExtraFlags", new Class[] { Integer.TYPE, Integer.TYPE });
      paramActivity = paramActivity.getWindow();
      if (paramBoolean) {
        j = k;
      }
      ((Method)localObject).invoke(paramActivity, new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
      return;
    }
    catch (Exception paramActivity)
    {
      paramActivity.printStackTrace();
    }
  }
  
  @TargetApi(11)
  public void b(float paramFloat)
  {
    if ((this.c) && (Build.VERSION.SDK_INT >= 11)) {
      this.g.setAlpha(paramFloat);
    }
  }
  
  public void b(int paramInt)
  {
    d(paramInt);
    f(paramInt);
  }
  
  public void b(Drawable paramDrawable)
  {
    if (this.c) {
      this.g.setBackgroundDrawable(paramDrawable);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
    View localView;
    if (this.d)
    {
      localView = this.h;
      if (!paramBoolean) {
        break label29;
      }
    }
    label29:
    for (int j = 0;; j = 8)
    {
      localView.setVisibility(j);
      return;
    }
  }
  
  public boolean b()
  {
    return this.e;
  }
  
  @TargetApi(11)
  public void c(float paramFloat)
  {
    if ((this.d) && (Build.VERSION.SDK_INT >= 11)) {
      this.h.setAlpha(paramFloat);
    }
  }
  
  public void c(int paramInt)
  {
    if (this.c) {
      this.g.setBackgroundColor(paramInt);
    }
  }
  
  public void c(Drawable paramDrawable)
  {
    if (this.d) {
      this.h.setBackgroundDrawable(paramDrawable);
    }
  }
  
  public boolean c()
  {
    return this.f;
  }
  
  public void d(int paramInt)
  {
    if (this.c) {
      this.g.setBackgroundResource(paramInt);
    }
  }
  
  public void e(int paramInt)
  {
    if (this.d) {
      this.h.setBackgroundColor(paramInt);
    }
  }
  
  public void f(int paramInt)
  {
    if (this.d) {
      this.h.setBackgroundResource(paramInt);
    }
  }
  
  public static class a
  {
    private static final String a = "status_bar_height";
    private static final String b = "navigation_bar_height";
    private static final String c = "navigation_bar_height_landscape";
    private static final String d = "navigation_bar_width";
    private final boolean e;
    private final boolean f;
    private final int g;
    private final int h;
    private final boolean i;
    private final int j;
    private final int k;
    private final boolean l;
    private final float m;
    
    private a(Activity paramActivity, boolean paramBoolean1, boolean paramBoolean2)
    {
      Resources localResources = paramActivity.getResources();
      if (localResources.getConfiguration().orientation == 1)
      {
        bool1 = true;
        this.l = bool1;
        this.m = a(paramActivity);
        this.g = a(localResources, "status_bar_height");
        this.h = a(paramActivity);
        this.j = b(paramActivity);
        this.k = c(paramActivity);
        if (this.j <= 0) {
          break label116;
        }
      }
      label116:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.i = bool1;
        this.e = paramBoolean1;
        this.f = paramBoolean2;
        return;
        bool1 = false;
        break;
      }
    }
    
    @SuppressLint({"NewApi"})
    private float a(Activity paramActivity)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      if (Build.VERSION.SDK_INT >= 16) {
        paramActivity.getWindowManager().getDefaultDisplay().getRealMetrics(localDisplayMetrics);
      }
      for (;;)
      {
        return Math.min(localDisplayMetrics.widthPixels / localDisplayMetrics.density, localDisplayMetrics.heightPixels / localDisplayMetrics.density);
        paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      }
    }
    
    @TargetApi(14)
    private int a(Context paramContext)
    {
      int n = 0;
      if (Build.VERSION.SDK_INT >= 14)
      {
        TypedValue localTypedValue = new TypedValue();
        paramContext.getTheme().resolveAttribute(16843499, localTypedValue, true);
        n = paramContext.getResources().getDimensionPixelSize(localTypedValue.resourceId);
      }
      return n;
    }
    
    private int a(Resources paramResources, String paramString)
    {
      int n = 0;
      int i1 = paramResources.getIdentifier(paramString, "dimen", "android");
      if (i1 > 0) {
        n = paramResources.getDimensionPixelSize(i1);
      }
      return n;
    }
    
    @TargetApi(14)
    private int b(Context paramContext)
    {
      Resources localResources = paramContext.getResources();
      int i1 = 0;
      int n = i1;
      if (Build.VERSION.SDK_INT >= 14)
      {
        n = i1;
        if (!ViewConfiguration.get(paramContext).hasPermanentMenuKey()) {
          if (!this.l) {
            break label50;
          }
        }
      }
      label50:
      for (paramContext = "navigation_bar_height";; paramContext = "navigation_bar_height_landscape")
      {
        n = a(localResources, paramContext);
        return n;
      }
    }
    
    @TargetApi(14)
    private int c(Context paramContext)
    {
      Resources localResources = paramContext.getResources();
      int i1 = 0;
      int n = i1;
      if (Build.VERSION.SDK_INT >= 14)
      {
        n = i1;
        if (!ViewConfiguration.get(paramContext).hasPermanentMenuKey()) {
          n = a(localResources, "navigation_bar_width");
        }
      }
      return n;
    }
    
    public int a(boolean paramBoolean)
    {
      int i1 = 0;
      if (this.e) {}
      for (int n = this.g;; n = 0)
      {
        if (paramBoolean) {
          i1 = this.h;
        }
        return i1 + n;
      }
    }
    
    public boolean a()
    {
      return (this.m >= 600.0F) || (this.l);
    }
    
    public int b()
    {
      return this.g;
    }
    
    public int c()
    {
      return this.h;
    }
    
    public boolean d()
    {
      return this.i;
    }
    
    public int e()
    {
      return this.j;
    }
    
    public int f()
    {
      return this.k;
    }
    
    public int g()
    {
      if ((this.f) && (a())) {
        return this.j;
      }
      return 0;
    }
    
    public int h()
    {
      if ((this.f) && (!a())) {
        return this.k;
      }
      return 0;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */