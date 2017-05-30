package com.google.android.gms.common;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.R.styleable;
import com.google.android.gms.c.h.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.zzah;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SignInButton
  extends FrameLayout
  implements View.OnClickListener
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 0;
  public static final int e = 1;
  public static final int f = 2;
  private int g;
  private int h;
  private View i;
  private View.OnClickListener j = null;
  
  public SignInButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
    a(this.g, this.h);
  }
  
  private static Button a(Context paramContext, int paramInt1, int paramInt2)
  {
    zzah localzzah = new zzah(paramContext);
    localzzah.a(paramContext.getResources(), paramInt1, paramInt2);
    return localzzah;
  }
  
  private void a(Context paramContext)
  {
    if (this.i != null) {
      removeView(this.i);
    }
    try
    {
      this.i = h.a(paramContext, this.g, this.h);
      addView(this.i);
      this.i.setEnabled(isEnabled());
      this.i.setOnClickListener(this);
      return;
    }
    catch (h.a locala)
    {
      for (;;)
      {
        Log.w("SignInButton", "Sign in button not found, using placeholder instead");
        this.i = a(paramContext, this.g, this.h);
      }
    }
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, R.styleable.SignInButton, 0, 0);
    try
    {
      this.g = paramContext.getInt(R.styleable.SignInButton_buttonSize, 0);
      this.h = paramContext.getInt(R.styleable.SignInButton_colorScheme, 2);
      return;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.g = paramInt1;
    this.h = paramInt2;
    a(getContext());
  }
  
  @Deprecated
  public void a(int paramInt1, int paramInt2, Scope[] paramArrayOfScope)
  {
    a(paramInt1, paramInt2);
  }
  
  public void onClick(View paramView)
  {
    if ((this.j != null) && (paramView == this.i)) {
      this.j.onClick(this);
    }
  }
  
  public void setColorScheme(int paramInt)
  {
    a(this.g, paramInt);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.i.setEnabled(paramBoolean);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.j = paramOnClickListener;
    if (this.i != null) {
      this.i.setOnClickListener(this);
    }
  }
  
  @Deprecated
  public void setScopes(Scope[] paramArrayOfScope)
  {
    a(this.g, this.h);
  }
  
  public void setSize(int paramInt)
  {
    a(paramInt, this.h);
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface a {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface b {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/SignInButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */