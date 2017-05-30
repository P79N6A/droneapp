package com.fimi.kernel.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class p
{
  public static final int a = Integer.MIN_VALUE;
  
  public static float a(int paramInt, float paramFloat, DisplayMetrics paramDisplayMetrics)
  {
    float f = paramFloat;
    switch (paramInt)
    {
    default: 
      f = 0.0F;
    case 0: 
      return f;
    case 1: 
      return paramFloat * paramDisplayMetrics.density;
    case 2: 
      return paramFloat * paramDisplayMetrics.scaledDensity;
    case 3: 
      return paramDisplayMetrics.xdpi * paramFloat * 0.013888889F;
    case 4: 
      return paramFloat * paramDisplayMetrics.xdpi;
    }
    return paramDisplayMetrics.xdpi * paramFloat * 0.03937008F;
  }
  
  public static float a(Context paramContext, float paramFloat)
  {
    return a(1, paramFloat, c.d(paramContext));
  }
  
  public static int a(int paramInt1, int paramInt2, float paramFloat)
  {
    if (paramFloat == 0.0F) {
      return 0;
    }
    float f1 = 1.0F;
    float f2 = paramInt1 / 720.0F;
    float f3 = paramInt2 / 1280.0F;
    try
    {
      f2 = Math.min(f2, f3);
      f1 = f2;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return Math.round(f1 * paramFloat + 0.5F);
  }
  
  public static int a(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((Activity)paramContext).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics.widthPixels;
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    paramContext = ((Activity)paramContext).findViewById(paramInt);
    if ((paramContext instanceof ViewGroup)) {
      paramContext = (ViewGroup)paramContext;
    }
  }
  
  public static void a(Context paramContext, Paint paramPaint, float paramFloat)
  {
    paramPaint.setTextSize(f(paramContext, paramFloat));
  }
  
  public static void a(Context paramContext, TextPaint paramTextPaint, float paramFloat)
  {
    paramTextPaint.setTextSize(f(paramContext, paramFloat));
  }
  
  public static void a(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams2 = paramView.getLayoutParams();
    ViewGroup.LayoutParams localLayoutParams1 = localLayoutParams2;
    if (localLayoutParams2 == null) {
      localLayoutParams1 = new ViewGroup.LayoutParams(-1, -2);
    }
    int j = ViewGroup.getChildMeasureSpec(0, 0, localLayoutParams1.width);
    int i = localLayoutParams1.height;
    if (i > 0) {}
    for (i = View.MeasureSpec.makeMeasureSpec(i, 1073741824);; i = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      paramView.measure(j, i);
      return;
    }
  }
  
  public static void a(View paramView, int paramInt)
  {
    paramView = paramView.findViewById(paramInt);
    if ((paramView instanceof ViewGroup)) {
      paramView = (ViewGroup)paramView;
    }
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2)
  {
    int i = e(paramView.getContext(), paramInt1);
    int j = e(paramView.getContext(), paramInt2);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null) {
      return;
    }
    if (paramInt1 != Integer.MIN_VALUE) {
      localLayoutParams.width = i;
    }
    if (paramInt2 != Integer.MIN_VALUE) {
      localLayoutParams.height = j;
    }
    paramView.setLayoutParams(localLayoutParams);
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.setPadding(e(paramView.getContext(), paramInt1), e(paramView.getContext(), paramInt2), e(paramView.getContext(), paramInt3), e(paramView.getContext(), paramInt4));
  }
  
  public static void a(AbsListView paramAbsListView, int paramInt1, int paramInt2)
  {
    paramInt1 = b(paramAbsListView, paramInt1, paramInt2);
    ViewGroup.LayoutParams localLayoutParams = paramAbsListView.getLayoutParams();
    localLayoutParams.height = paramInt1;
    ((ViewGroup.MarginLayoutParams)localLayoutParams).setMargins(0, 0, 0, 0);
    paramAbsListView.setLayoutParams(localLayoutParams);
  }
  
  public static void a(TextView paramTextView, float paramFloat)
  {
    paramTextView.setTextSize(f(paramTextView.getContext(), paramFloat));
  }
  
  public static float b(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((Activity)paramContext).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics.heightPixels;
  }
  
  public static float b(Context paramContext, float paramFloat)
  {
    return paramFloat / c.d(paramContext).density;
  }
  
  public static int b(View paramView)
  {
    a(paramView);
    return paramView.getMeasuredWidth();
  }
  
  public static int b(AbsListView paramAbsListView, int paramInt1, int paramInt2)
  {
    int i = 0;
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    paramAbsListView.measure(k, m);
    ListAdapter localListAdapter = (ListAdapter)paramAbsListView.getAdapter();
    if (localListAdapter == null) {
      return 0;
    }
    int n = localListAdapter.getCount();
    int j;
    if ((paramAbsListView instanceof ListView))
    {
      j = 0;
      paramInt1 = i;
      i = j;
      while (paramInt1 < n)
      {
        View localView = localListAdapter.getView(paramInt1, null, paramAbsListView);
        localView.measure(k, m);
        i += localView.getMeasuredHeight();
        paramInt1 += 1;
      }
      if (n == 0) {
        i = paramInt2;
      }
    }
    for (;;)
    {
      return i;
      i += ((ListView)paramAbsListView).getDividerHeight() * (n - 1);
      continue;
      if ((paramAbsListView instanceof GridView))
      {
        i = n % paramInt1;
        j = i;
        if (i > 0) {
          j = 1;
        }
        i = paramInt2;
        if (localListAdapter.getCount() != 0)
        {
          paramAbsListView = localListAdapter.getView(0, null, paramAbsListView);
          paramAbsListView.measure(k, m);
          paramInt1 = j + n / paramInt1;
          i = paramAbsListView.getMeasuredHeight() * paramInt1 + (paramInt1 - 1) * paramInt2;
        }
      }
      else
      {
        i = 0;
      }
    }
  }
  
  public static void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = e(paramView.getContext(), paramInt1);
    int j = e(paramView.getContext(), paramInt2);
    int k = e(paramView.getContext(), paramInt3);
    int m = e(paramView.getContext(), paramInt4);
    if ((paramView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams))
    {
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
      if (localMarginLayoutParams != null)
      {
        if (paramInt1 != Integer.MIN_VALUE) {
          localMarginLayoutParams.leftMargin = i;
        }
        if (paramInt3 != Integer.MIN_VALUE) {
          localMarginLayoutParams.rightMargin = k;
        }
        if (paramInt2 != Integer.MIN_VALUE) {
          localMarginLayoutParams.topMargin = j;
        }
        if (paramInt4 != Integer.MIN_VALUE) {
          localMarginLayoutParams.bottomMargin = m;
        }
        paramView.setLayoutParams(localMarginLayoutParams);
      }
    }
  }
  
  public static void b(TextView paramTextView, float paramFloat)
  {
    paramTextView.setTextSize(0, f(paramTextView.getContext(), paramFloat));
  }
  
  public static float c(Context paramContext, float paramFloat)
  {
    return a(2, paramFloat, c.d(paramContext));
  }
  
  public static int c(View paramView)
  {
    a(paramView);
    return paramView.getMeasuredHeight();
  }
  
  public static float d(Context paramContext, float paramFloat)
  {
    return paramFloat / c.d(paramContext).scaledDensity;
  }
  
  public static void d(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    if ((localViewParent != null) && ((localViewParent instanceof ViewGroup))) {
      ((ViewGroup)localViewParent).removeView(paramView);
    }
  }
  
  public static int e(Context paramContext, float paramFloat)
  {
    paramContext = c.d(paramContext);
    float f = paramFloat;
    if (paramContext.scaledDensity > 2.0F)
    {
      if (paramContext.widthPixels <= 720) {
        break label51;
      }
      f = paramFloat * (1.3F - 1.0F / paramContext.scaledDensity);
    }
    for (;;)
    {
      return a(paramContext.widthPixels, paramContext.heightPixels, f);
      label51:
      f = paramFloat;
      if (paramContext.widthPixels < 720) {
        f = paramFloat * (1.0F - 1.0F / paramContext.scaledDensity);
      }
    }
  }
  
  @SuppressLint({"NewApi"})
  public static void e(View paramView)
  {
    int k = Integer.MIN_VALUE;
    if ((paramView instanceof TextView))
    {
      localObject = (TextView)paramView;
      b((TextView)localObject, ((TextView)localObject).getTextSize());
    }
    Object localObject = paramView.getLayoutParams();
    if (localObject != null) {
      if ((((ViewGroup.LayoutParams)localObject).width == -2) || (((ViewGroup.LayoutParams)localObject).width == -1)) {
        break label210;
      }
    }
    label210:
    for (int i = ((ViewGroup.LayoutParams)localObject).width;; i = Integer.MIN_VALUE)
    {
      int j = k;
      if (((ViewGroup.LayoutParams)localObject).height != -2)
      {
        j = k;
        if (((ViewGroup.LayoutParams)localObject).height != -1) {
          j = ((ViewGroup.LayoutParams)localObject).height;
        }
      }
      a(paramView, i, j);
      a(paramView, paramView.getPaddingLeft(), paramView.getPaddingTop(), paramView.getPaddingRight(), paramView.getPaddingBottom());
      if ((paramView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams))
      {
        localObject = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
        if (localObject != null) {
          b(paramView, ((ViewGroup.MarginLayoutParams)localObject).leftMargin, ((ViewGroup.MarginLayoutParams)localObject).topMargin, ((ViewGroup.MarginLayoutParams)localObject).rightMargin, ((ViewGroup.MarginLayoutParams)localObject).bottomMargin);
        }
      }
      if (Build.VERSION.SDK_INT >= 16)
      {
        i = e(paramView.getContext(), paramView.getMinimumWidth());
        j = e(paramView.getContext(), paramView.getMinimumHeight());
        paramView.setMinimumWidth(i);
        paramView.setMinimumHeight(j);
      }
      return;
    }
  }
  
  public static int f(Context paramContext, float paramFloat)
  {
    paramContext = c.d(paramContext);
    if (paramContext.scaledDensity > 2.0F) {}
    return a(paramContext.widthPixels, paramContext.heightPixels, paramFloat);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */