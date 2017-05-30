package com.fimi.kernel.view.percent;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class PercentLinearLayout
  extends LinearLayout
{
  private static final String a = "PercentLinearLayout";
  private a b = new a(this);
  
  public PercentLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private int getScreenHeight()
  {
    WindowManager localWindowManager = (WindowManager)getContext().getSystemService("window");
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics.heightPixels;
  }
  
  public LayoutParams a(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.b.a();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt2);
    int k = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.makeMeasureSpec(i, k);
    int m = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), View.MeasureSpec.getMode(paramInt1));
    Log.d("PercentLinearLayout", View.MeasureSpec.toString(paramInt2));
    i = j;
    if (k == 0)
    {
      i = j;
      if (getParent() != null)
      {
        i = j;
        if ((getParent() instanceof ScrollView))
        {
          Context localContext = getContext();
          if (!(localContext instanceof Activity)) {
            break label166;
          }
          i = ((Activity)localContext).findViewById(16908290).getMeasuredHeight();
          Log.d("PercentLinearLayout", "measuredHeight = " + i);
        }
      }
    }
    for (;;)
    {
      i = View.MeasureSpec.makeMeasureSpec(i, k);
      this.b.a(m, i);
      super.onMeasure(paramInt1, paramInt2);
      if (this.b.b()) {
        super.onMeasure(paramInt1, paramInt2);
      }
      return;
      label166:
      i = getScreenHeight();
      Log.d("PercentLinearLayout", "scHeight = " + i);
    }
  }
  
  public static class LayoutParams
    extends LinearLayout.LayoutParams
    implements a.b
  {
    private a.a a;
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      this.a = a.a(paramContext, paramAttributeSet);
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public a.a a()
    {
      return this.a;
    }
    
    protected void setBaseAttributes(TypedArray paramTypedArray, int paramInt1, int paramInt2)
    {
      a.a(this, paramTypedArray, paramInt1, paramInt2);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/view/percent/PercentLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */