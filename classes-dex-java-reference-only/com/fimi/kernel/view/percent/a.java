package com.fimi.kernel.view.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.fimi.kernel.R.styleable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a
{
  private static final String a = "PercentLayout";
  private static final String c = "^(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)%([wh]?)$";
  private final ViewGroup b;
  
  public a(ViewGroup paramViewGroup)
  {
    this.b = paramViewGroup;
  }
  
  private static a.a.a a(TypedArray paramTypedArray, int paramInt, boolean paramBoolean)
  {
    return a(paramTypedArray.getString(paramInt), paramBoolean);
  }
  
  private static a.a.a a(String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    if (paramString == null) {
      return null;
    }
    Object localObject = Pattern.compile("^(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)%([wh]?)$").matcher(paramString);
    if (!((Matcher)localObject).matches()) {
      throw new RuntimeException("the value of layout_xxxPercent invalid! ==>" + paramString);
    }
    int i = paramString.length();
    localObject = ((Matcher)localObject).group(1);
    paramString = paramString.substring(i - 1);
    float f = Float.parseFloat((String)localObject) / 100.0F;
    if (paramBoolean)
    {
      paramBoolean = bool;
      if (!paramString.equals("h")) {}
    }
    else
    {
      if (!paramString.equals("w")) {
        break label123;
      }
    }
    label123:
    for (paramBoolean = bool;; paramBoolean = false) {
      return new a.a.a(f, paramBoolean);
    }
  }
  
  public static a a(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.PercentLayout_Layout);
    paramAttributeSet = e(paramContext, c(paramContext, b(paramContext, d(paramContext, a(paramContext, null)))));
    Log.d("PercentLayout", "constructed: " + paramAttributeSet);
    paramContext.recycle();
    if (Log.isLoggable("PercentLayout", 3)) {
      Log.d("PercentLayout", "constructed: " + paramAttributeSet);
    }
    return paramAttributeSet;
  }
  
  private static a a(TypedArray paramTypedArray, a parama)
  {
    a.a.a locala1 = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_widthPercent, true);
    a locala = parama;
    if (locala1 != null)
    {
      if (Log.isLoggable("PercentLayout", 2)) {
        Log.v("PercentLayout", "percent width: " + locala1.a);
      }
      locala = a(parama);
      locala.a = locala1;
    }
    parama = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_heightPercent, false);
    paramTypedArray = locala;
    if (parama != null)
    {
      if (Log.isLoggable("PercentLayout", 2)) {
        Log.v("PercentLayout", "percent height: " + parama.a);
      }
      paramTypedArray = a(locala);
      paramTypedArray.b = parama;
    }
    return paramTypedArray;
  }
  
  @NonNull
  private static a a(a parama)
  {
    if (parama != null) {
      return parama;
    }
    return new a();
  }
  
  private void a(int paramInt1, int paramInt2, View paramView, a parama)
  {
    int i = paramView.getPaddingLeft();
    int j = paramView.getPaddingRight();
    int k = paramView.getPaddingTop();
    int m = paramView.getPaddingBottom();
    a.a.a locala = parama.n;
    if (locala != null)
    {
      if (locala.b)
      {
        i = paramInt1;
        i = (int)(i * locala.a);
      }
    }
    else
    {
      locala = parama.o;
      if (locala != null)
      {
        if (!locala.b) {
          break label179;
        }
        j = paramInt1;
        label82:
        j = (int)(j * locala.a);
      }
      locala = parama.p;
      if (locala != null)
      {
        if (!locala.b) {
          break label185;
        }
        k = paramInt1;
        label117:
        k = (int)(k * locala.a);
      }
      parama = parama.q;
      if (parama != null) {
        if (!parama.b) {
          break label191;
        }
      }
    }
    for (;;)
    {
      m = (int)(paramInt1 * parama.a);
      paramView.setPadding(i, k, j, m);
      return;
      i = paramInt2;
      break;
      label179:
      j = paramInt2;
      break label82;
      label185:
      k = paramInt2;
      break label117;
      label191:
      paramInt1 = paramInt2;
    }
  }
  
  public static void a(ViewGroup.LayoutParams paramLayoutParams, TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    paramLayoutParams.width = paramTypedArray.getLayoutDimension(paramInt1, 0);
    paramLayoutParams.height = paramTypedArray.getLayoutDimension(paramInt2, 0);
  }
  
  private void a(String paramString, int paramInt1, int paramInt2, View paramView, Class paramClass, a.a.a parama)
  {
    if (parama != null)
    {
      paramString = paramClass.getMethod(paramString, new Class[] { Integer.TYPE });
      paramString.setAccessible(true);
      if (!parama.b) {
        break label62;
      }
    }
    for (;;)
    {
      paramString.invoke(paramView, new Object[] { Integer.valueOf((int)(paramInt1 * parama.a)) });
      return;
      label62:
      paramInt1 = paramInt2;
    }
  }
  
  private static boolean a(View paramView, a parama)
  {
    boolean bool2 = false;
    int i = ViewCompat.getMeasuredWidthAndState(paramView);
    boolean bool1 = bool2;
    if (parama != null)
    {
      bool1 = bool2;
      if (parama.a != null)
      {
        bool1 = bool2;
        if (parama.r != null)
        {
          bool1 = bool2;
          if ((i & 0xFF000000) == 16777216)
          {
            bool1 = bool2;
            if (parama.a.a >= 0.0F)
            {
              bool1 = bool2;
              if (parama.r.width == -2) {
                bool1 = true;
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  private static a b(TypedArray paramTypedArray, a parama)
  {
    a.a.a locala = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_textSizePercent, false);
    paramTypedArray = parama;
    if (locala != null)
    {
      if (Log.isLoggable("PercentLayout", 2)) {
        Log.v("PercentLayout", "percent text size: " + locala.a);
      }
      paramTypedArray = a(parama);
      paramTypedArray.i = locala;
    }
    return paramTypedArray;
  }
  
  private void b(int paramInt1, int paramInt2, View paramView, a parama)
  {
    try
    {
      Class localClass = paramView.getClass();
      a("setMaxWidth", paramInt1, paramInt2, paramView, localClass, parama.j);
      a("setMaxHeight", paramInt1, paramInt2, paramView, localClass, parama.k);
      a("setMinWidth", paramInt1, paramInt2, paramView, localClass, parama.l);
      a("setMinHeight", paramInt1, paramInt2, paramView, localClass, parama.m);
      return;
    }
    catch (NoSuchMethodException paramView)
    {
      paramView.printStackTrace();
      return;
    }
    catch (InvocationTargetException paramView)
    {
      paramView.printStackTrace();
      return;
    }
    catch (IllegalAccessException paramView)
    {
      paramView.printStackTrace();
    }
  }
  
  private static boolean b(View paramView, a parama)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (parama != null)
    {
      bool1 = bool2;
      if (parama.b != null)
      {
        bool1 = bool2;
        if (parama.r != null)
        {
          bool1 = bool2;
          if ((ViewCompat.getMeasuredHeightAndState(paramView) & 0xFF000000) == 16777216)
          {
            bool1 = bool2;
            if (parama.b.a >= 0.0F)
            {
              bool1 = bool2;
              if (parama.r.height == -2) {
                bool1 = true;
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  private static a c(TypedArray paramTypedArray, a parama)
  {
    a.a.a locala = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_maxWidthPercent, true);
    if (locala != null)
    {
      a(parama);
      parama.j = locala;
    }
    locala = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_maxHeightPercent, false);
    if (locala != null)
    {
      a(parama);
      parama.k = locala;
    }
    locala = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_minWidthPercent, true);
    if (locala != null)
    {
      a(parama);
      parama.l = locala;
    }
    paramTypedArray = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_minHeightPercent, false);
    if (paramTypedArray != null)
    {
      a(parama);
      parama.m = paramTypedArray;
    }
    return parama;
  }
  
  private void c(int paramInt1, int paramInt2, View paramView, a parama)
  {
    parama = parama.i;
    if (parama == null) {
      return;
    }
    if (parama.b) {}
    for (;;)
    {
      float f = paramInt1;
      f = (int)(parama.a * f);
      if (!(paramView instanceof TextView)) {
        break;
      }
      ((TextView)paramView).setTextSize(0, f);
      return;
      paramInt1 = paramInt2;
    }
  }
  
  private static a d(TypedArray paramTypedArray, a parama)
  {
    a.a.a locala = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_marginPercent, true);
    Object localObject = parama;
    if (locala != null)
    {
      if (Log.isLoggable("PercentLayout", 2)) {
        Log.v("PercentLayout", "percent margin: " + locala.a);
      }
      localObject = a(parama);
      ((a)localObject).c = locala;
      ((a)localObject).d = locala;
      ((a)localObject).e = locala;
      ((a)localObject).f = locala;
    }
    locala = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_marginLeftPercent, true);
    parama = (a)localObject;
    if (locala != null)
    {
      if (Log.isLoggable("PercentLayout", 2)) {
        Log.v("PercentLayout", "percent left margin: " + locala.a);
      }
      parama = a((a)localObject);
      parama.c = locala;
    }
    locala = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_marginTopPercent, false);
    localObject = parama;
    if (locala != null)
    {
      if (Log.isLoggable("PercentLayout", 2)) {
        Log.v("PercentLayout", "percent top margin: " + locala.a);
      }
      localObject = a(parama);
      ((a)localObject).d = locala;
    }
    locala = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_marginRightPercent, true);
    parama = (a)localObject;
    if (locala != null)
    {
      if (Log.isLoggable("PercentLayout", 2)) {
        Log.v("PercentLayout", "percent right margin: " + locala.a);
      }
      parama = a((a)localObject);
      parama.e = locala;
    }
    locala = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_marginBottomPercent, false);
    localObject = parama;
    if (locala != null)
    {
      if (Log.isLoggable("PercentLayout", 2)) {
        Log.v("PercentLayout", "percent bottom margin: " + locala.a);
      }
      localObject = a(parama);
      ((a)localObject).f = locala;
    }
    locala = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_marginStartPercent, true);
    parama = (a)localObject;
    if (locala != null)
    {
      if (Log.isLoggable("PercentLayout", 2)) {
        Log.v("PercentLayout", "percent start margin: " + locala.a);
      }
      parama = a((a)localObject);
      parama.g = locala;
    }
    localObject = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_marginEndPercent, true);
    paramTypedArray = parama;
    if (localObject != null)
    {
      if (Log.isLoggable("PercentLayout", 2)) {
        Log.v("PercentLayout", "percent end margin: " + ((a.a.a)localObject).a);
      }
      paramTypedArray = a(parama);
      paramTypedArray.h = ((a.a.a)localObject);
    }
    return paramTypedArray;
  }
  
  private static a e(TypedArray paramTypedArray, a parama)
  {
    a.a.a locala = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_paddingPercent, true);
    Object localObject = parama;
    if (locala != null)
    {
      localObject = a(parama);
      ((a)localObject).n = locala;
      ((a)localObject).o = locala;
      ((a)localObject).q = locala;
      ((a)localObject).p = locala;
    }
    locala = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_paddingLeftPercent, true);
    parama = (a)localObject;
    if (locala != null)
    {
      parama = a((a)localObject);
      parama.n = locala;
    }
    locala = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_paddingRightPercent, true);
    localObject = parama;
    if (locala != null)
    {
      localObject = a(parama);
      ((a)localObject).o = locala;
    }
    locala = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_paddingTopPercent, true);
    parama = (a)localObject;
    if (locala != null)
    {
      parama = a((a)localObject);
      parama.p = locala;
    }
    localObject = a(paramTypedArray, R.styleable.PercentLayout_Layout_layout_paddingBottomPercent, true);
    paramTypedArray = parama;
    if (localObject != null)
    {
      paramTypedArray = a(parama);
      paramTypedArray.q = ((a.a.a)localObject);
    }
    return paramTypedArray;
  }
  
  public void a()
  {
    int j = this.b.getChildCount();
    int i = 0;
    if (i < j)
    {
      Object localObject = this.b.getChildAt(i);
      ViewGroup.LayoutParams localLayoutParams = ((View)localObject).getLayoutParams();
      if (Log.isLoggable("PercentLayout", 3)) {
        Log.d("PercentLayout", "should restore " + localObject + " " + localLayoutParams);
      }
      if ((localLayoutParams instanceof b))
      {
        localObject = ((b)localLayoutParams).a();
        if (Log.isLoggable("PercentLayout", 3)) {
          Log.d("PercentLayout", "using " + localObject);
        }
        if (localObject != null)
        {
          if (!(localLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
            break label159;
          }
          ((a)localObject).a((ViewGroup.MarginLayoutParams)localLayoutParams);
        }
      }
      for (;;)
      {
        i += 1;
        break;
        label159:
        ((a)localObject).a(localLayoutParams);
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (Log.isLoggable("PercentLayout", 3)) {
      Log.d("PercentLayout", "adjustChildren: " + this.b + " widthMeasureSpec: " + View.MeasureSpec.toString(paramInt1) + " heightMeasureSpec: " + View.MeasureSpec.toString(paramInt2));
    }
    int i = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (Log.isLoggable("PercentLayout", 3)) {
      Log.d("PercentLayout", "widthHint = " + i + " , heightHint = " + paramInt2);
    }
    int j = this.b.getChildCount();
    paramInt1 = 0;
    if (paramInt1 < j)
    {
      View localView = this.b.getChildAt(paramInt1);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      if (Log.isLoggable("PercentLayout", 3)) {
        Log.d("PercentLayout", "should adjust " + localView + " " + localLayoutParams);
      }
      a locala;
      if ((localLayoutParams instanceof b))
      {
        locala = ((b)localLayoutParams).a();
        if (Log.isLoggable("PercentLayout", 3)) {
          Log.d("PercentLayout", "using " + locala);
        }
        if (locala != null)
        {
          c(i, paramInt2, localView, locala);
          a(i, paramInt2, localView, locala);
          b(i, paramInt2, localView, locala);
          if (!(localLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
            break label318;
          }
          locala.a((ViewGroup.MarginLayoutParams)localLayoutParams, i, paramInt2);
        }
      }
      for (;;)
      {
        paramInt1 += 1;
        break;
        label318:
        locala.a(localLayoutParams, i, paramInt2);
      }
    }
  }
  
  public boolean b()
  {
    int j = this.b.getChildCount();
    int i = 0;
    boolean bool1 = false;
    View localView;
    ViewGroup.LayoutParams localLayoutParams;
    boolean bool2;
    a locala;
    if (i < j)
    {
      localView = this.b.getChildAt(i);
      localLayoutParams = localView.getLayoutParams();
      bool2 = bool1;
      if ((localLayoutParams instanceof b))
      {
        locala = ((b)localLayoutParams).a();
        bool2 = bool1;
        if (locala != null)
        {
          if (!a(localView, locala)) {
            break label122;
          }
          localLayoutParams.width = -2;
          bool1 = true;
        }
      }
    }
    label122:
    for (;;)
    {
      if (b(localView, locala)) {
        localLayoutParams.height = -2;
      }
      for (bool2 = true;; bool2 = bool1)
      {
        i += 1;
        bool1 = bool2;
        break;
        return bool1;
      }
    }
  }
  
  public static class a
  {
    public a a;
    public a b;
    public a c;
    public a d;
    public a e;
    public a f;
    public a g;
    public a h;
    public a i;
    public a j;
    public a k;
    public a l;
    public a m;
    public a n;
    public a o;
    public a p;
    public a q;
    final ViewGroup.MarginLayoutParams r = new ViewGroup.MarginLayoutParams(0, 0);
    
    public void a(ViewGroup.LayoutParams paramLayoutParams)
    {
      paramLayoutParams.width = this.r.width;
      paramLayoutParams.height = this.r.height;
    }
    
    public void a(ViewGroup.LayoutParams paramLayoutParams, int paramInt1, int paramInt2)
    {
      this.r.width = paramLayoutParams.width;
      this.r.height = paramLayoutParams.height;
      int i1;
      if (this.a != null)
      {
        if (this.a.b)
        {
          i1 = paramInt1;
          paramLayoutParams.width = ((int)(i1 * this.a.a));
        }
      }
      else if (this.b != null) {
        if (!this.b.b) {
          break label97;
        }
      }
      for (;;)
      {
        paramLayoutParams.height = ((int)(paramInt1 * this.b.a));
        return;
        i1 = paramInt2;
        break;
        label97:
        paramInt1 = paramInt2;
      }
    }
    
    public void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      a(paramMarginLayoutParams);
      paramMarginLayoutParams.leftMargin = this.r.leftMargin;
      paramMarginLayoutParams.topMargin = this.r.topMargin;
      paramMarginLayoutParams.rightMargin = this.r.rightMargin;
      paramMarginLayoutParams.bottomMargin = this.r.bottomMargin;
      MarginLayoutParamsCompat.setMarginStart(paramMarginLayoutParams, MarginLayoutParamsCompat.getMarginStart(this.r));
      MarginLayoutParamsCompat.setMarginEnd(paramMarginLayoutParams, MarginLayoutParamsCompat.getMarginEnd(this.r));
    }
    
    public void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt1, int paramInt2)
    {
      a(paramMarginLayoutParams, paramInt1, paramInt2);
      this.r.leftMargin = paramMarginLayoutParams.leftMargin;
      this.r.topMargin = paramMarginLayoutParams.topMargin;
      this.r.rightMargin = paramMarginLayoutParams.rightMargin;
      this.r.bottomMargin = paramMarginLayoutParams.bottomMargin;
      MarginLayoutParamsCompat.setMarginStart(this.r, MarginLayoutParamsCompat.getMarginStart(paramMarginLayoutParams));
      MarginLayoutParamsCompat.setMarginEnd(this.r, MarginLayoutParamsCompat.getMarginEnd(paramMarginLayoutParams));
      int i1;
      if (this.c != null)
      {
        if (this.c.b)
        {
          i1 = paramInt1;
          paramMarginLayoutParams.leftMargin = ((int)(i1 * this.c.a));
        }
      }
      else
      {
        if (this.d != null)
        {
          if (!this.d.b) {
            break label346;
          }
          i1 = paramInt1;
          label129:
          paramMarginLayoutParams.topMargin = ((int)(i1 * this.d.a));
        }
        if (this.e != null)
        {
          if (!this.e.b) {
            break label352;
          }
          i1 = paramInt1;
          label165:
          paramMarginLayoutParams.rightMargin = ((int)(i1 * this.e.a));
        }
        if (this.f != null)
        {
          if (!this.f.b) {
            break label358;
          }
          i1 = paramInt1;
          label201:
          paramMarginLayoutParams.bottomMargin = ((int)(i1 * this.f.a));
        }
        if (this.g != null)
        {
          if (!this.g.b) {
            break label364;
          }
          i1 = paramInt1;
          label237:
          MarginLayoutParamsCompat.setMarginStart(paramMarginLayoutParams, (int)(i1 * this.g.a));
        }
        if (this.h != null) {
          if (!this.h.b) {
            break label370;
          }
        }
      }
      for (;;)
      {
        MarginLayoutParamsCompat.setMarginEnd(paramMarginLayoutParams, (int)(paramInt1 * this.h.a));
        if (Log.isLoggable("PercentLayout", 3)) {
          Log.d("PercentLayout", "after fillMarginLayoutParams: (" + paramMarginLayoutParams.width + ", " + paramMarginLayoutParams.height + ")");
        }
        return;
        i1 = paramInt2;
        break;
        label346:
        i1 = paramInt2;
        break label129;
        label352:
        i1 = paramInt2;
        break label165;
        label358:
        i1 = paramInt2;
        break label201;
        label364:
        i1 = paramInt2;
        break label237;
        label370:
        paramInt1 = paramInt2;
      }
    }
    
    public String toString()
    {
      return "PercentLayoutInfo{widthPercent=" + this.a + ", heightPercent=" + this.b + ", leftMarginPercent=" + this.c + ", topMarginPercent=" + this.d + ", rightMarginPercent=" + this.e + ", bottomMarginPercent=" + this.f + ", startMarginPercent=" + this.g + ", endMarginPercent=" + this.h + ", textSizePercent=" + this.i + ", maxWidthPercent=" + this.j + ", maxHeightPercent=" + this.k + ", minWidthPercent=" + this.l + ", minHeightPercent=" + this.m + ", paddingLeftPercent=" + this.n + ", paddingRightPercent=" + this.o + ", paddingTopPercent=" + this.p + ", paddingBottomPercent=" + this.q + ", mPreservedParams=" + this.r + '}';
    }
    
    public static class a
    {
      public float a = -1.0F;
      public boolean b;
      
      public a() {}
      
      public a(float paramFloat, boolean paramBoolean)
      {
        this.a = paramFloat;
        this.b = paramBoolean;
      }
      
      public String toString()
      {
        return "PercentVal{percent=" + this.a + ", isBaseWidth=" + this.b + '}';
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract a.a a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/view/percent/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */