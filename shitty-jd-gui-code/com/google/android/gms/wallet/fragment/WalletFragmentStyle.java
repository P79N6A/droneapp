package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.gms.R.style;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class WalletFragmentStyle
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<WalletFragmentStyle> CREATOR = new i();
  final int a;
  Bundle b;
  int c;
  
  public WalletFragmentStyle()
  {
    this.a = 1;
    this.b = new Bundle();
    this.b.putInt("buyButtonAppearanceDefault", 4);
    this.b.putInt("maskedWalletDetailsLogoImageTypeDefault", 3);
  }
  
  WalletFragmentStyle(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramBundle;
    this.c = paramInt2;
  }
  
  private static int a(long paramLong, DisplayMetrics paramDisplayMetrics)
  {
    int i = (int)(paramLong >>> 32);
    int j = (int)paramLong;
    switch (i)
    {
    default: 
      throw new IllegalStateException(36 + "Unexpected unit or type: " + i);
    case 129: 
      return j;
    case 128: 
      return TypedValue.complexToDimensionPixelSize(j, paramDisplayMetrics);
    case 0: 
      i = 0;
    }
    for (;;)
    {
      return Math.round(TypedValue.applyDimension(i, Float.intBitsToFloat(j), paramDisplayMetrics));
      i = 1;
      continue;
      i = 2;
      continue;
      i = 3;
      continue;
      i = 4;
      continue;
      i = 5;
    }
  }
  
  private static long a(int paramInt1, int paramInt2)
  {
    return paramInt1 << 32 | paramInt2 & 0xFFFFFFFF;
  }
  
  private static long a(TypedValue paramTypedValue)
  {
    switch (paramTypedValue.type)
    {
    default: 
      int i = paramTypedValue.type;
      throw new IllegalArgumentException(38 + "Unexpected dimension type: " + i);
    case 16: 
      return o(paramTypedValue.data);
    }
    return a(128, paramTypedValue.data);
  }
  
  private void a(TypedArray paramTypedArray, int paramInt, String paramString)
  {
    if (this.b.containsKey(paramString)) {}
    do
    {
      return;
      paramTypedArray = paramTypedArray.peekValue(paramInt);
    } while (paramTypedArray == null);
    this.b.putLong(paramString, a(paramTypedArray));
  }
  
  private void a(TypedArray paramTypedArray, int paramInt, String paramString1, String paramString2)
  {
    if ((this.b.containsKey(paramString1)) || (this.b.containsKey(paramString2))) {}
    do
    {
      return;
      paramTypedArray = paramTypedArray.peekValue(paramInt);
    } while (paramTypedArray == null);
    if ((paramTypedArray.type >= 28) && (paramTypedArray.type <= 31))
    {
      this.b.putInt(paramString1, paramTypedArray.data);
      return;
    }
    this.b.putInt(paramString2, paramTypedArray.resourceId);
  }
  
  private void b(TypedArray paramTypedArray, int paramInt, String paramString)
  {
    if (this.b.containsKey(paramString)) {}
    do
    {
      return;
      paramTypedArray = paramTypedArray.peekValue(paramInt);
    } while (paramTypedArray == null);
    this.b.putInt(paramString, paramTypedArray.data);
  }
  
  private static long c(int paramInt, float paramFloat)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException(30 + "Unrecognized unit: " + paramInt);
    }
    return a(paramInt, Float.floatToIntBits(paramFloat));
  }
  
  private static long o(int paramInt)
  {
    if (paramInt < 0)
    {
      if ((paramInt == -1) || (paramInt == -2)) {
        return a(129, paramInt);
      }
      throw new IllegalArgumentException(39 + "Unexpected dimension value: " + paramInt);
    }
    return c(0, paramInt);
  }
  
  public int a(String paramString, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    if (this.b.containsKey(paramString)) {
      paramInt = a(this.b.getLong(paramString), paramDisplayMetrics);
    }
    return paramInt;
  }
  
  public WalletFragmentStyle a(int paramInt)
  {
    this.c = paramInt;
    return this;
  }
  
  public WalletFragmentStyle a(int paramInt, float paramFloat)
  {
    this.b.putLong("buyButtonHeight", c(paramInt, paramFloat));
    return this;
  }
  
  public void a(Context paramContext)
  {
    if (this.c <= 0) {}
    for (int i = R.style.WalletFragmentDefaultStyle;; i = this.c)
    {
      paramContext = paramContext.obtainStyledAttributes(i, R.styleable.WalletFragmentStyle);
      a(paramContext, R.styleable.WalletFragmentStyle_buyButtonWidth, "buyButtonWidth");
      a(paramContext, R.styleable.WalletFragmentStyle_buyButtonHeight, "buyButtonHeight");
      b(paramContext, R.styleable.WalletFragmentStyle_buyButtonText, "buyButtonText");
      b(paramContext, R.styleable.WalletFragmentStyle_buyButtonAppearance, "buyButtonAppearance");
      b(paramContext, R.styleable.WalletFragmentStyle_maskedWalletDetailsTextAppearance, "maskedWalletDetailsTextAppearance");
      b(paramContext, R.styleable.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance, "maskedWalletDetailsHeaderTextAppearance");
      a(paramContext, R.styleable.WalletFragmentStyle_maskedWalletDetailsBackground, "maskedWalletDetailsBackgroundColor", "maskedWalletDetailsBackgroundResource");
      b(paramContext, R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance, "maskedWalletDetailsButtonTextAppearance");
      a(paramContext, R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonBackground, "maskedWalletDetailsButtonBackgroundColor", "maskedWalletDetailsButtonBackgroundResource");
      b(paramContext, R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoTextColor, "maskedWalletDetailsLogoTextColor");
      b(paramContext, R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoImageType, "maskedWalletDetailsLogoImageType");
      paramContext.recycle();
      return;
    }
  }
  
  public WalletFragmentStyle b(int paramInt)
  {
    this.b.putInt("buyButtonText", paramInt);
    return this;
  }
  
  public WalletFragmentStyle b(int paramInt, float paramFloat)
  {
    this.b.putLong("buyButtonWidth", c(paramInt, paramFloat));
    return this;
  }
  
  public WalletFragmentStyle c(int paramInt)
  {
    this.b.putLong("buyButtonHeight", o(paramInt));
    return this;
  }
  
  public WalletFragmentStyle d(int paramInt)
  {
    this.b.putLong("buyButtonWidth", o(paramInt));
    return this;
  }
  
  public WalletFragmentStyle e(int paramInt)
  {
    this.b.putInt("buyButtonAppearance", paramInt);
    return this;
  }
  
  public WalletFragmentStyle f(int paramInt)
  {
    this.b.putInt("maskedWalletDetailsTextAppearance", paramInt);
    return this;
  }
  
  public WalletFragmentStyle g(int paramInt)
  {
    this.b.putInt("maskedWalletDetailsHeaderTextAppearance", paramInt);
    return this;
  }
  
  public WalletFragmentStyle h(int paramInt)
  {
    this.b.remove("maskedWalletDetailsBackgroundResource");
    this.b.putInt("maskedWalletDetailsBackgroundColor", paramInt);
    return this;
  }
  
  public WalletFragmentStyle i(int paramInt)
  {
    this.b.remove("maskedWalletDetailsBackgroundColor");
    this.b.putInt("maskedWalletDetailsBackgroundResource", paramInt);
    return this;
  }
  
  public WalletFragmentStyle j(int paramInt)
  {
    this.b.putInt("maskedWalletDetailsButtonTextAppearance", paramInt);
    return this;
  }
  
  public WalletFragmentStyle k(int paramInt)
  {
    this.b.remove("maskedWalletDetailsButtonBackgroundResource");
    this.b.putInt("maskedWalletDetailsButtonBackgroundColor", paramInt);
    return this;
  }
  
  public WalletFragmentStyle l(int paramInt)
  {
    this.b.remove("maskedWalletDetailsButtonBackgroundColor");
    this.b.putInt("maskedWalletDetailsButtonBackgroundResource", paramInt);
    return this;
  }
  
  public WalletFragmentStyle m(int paramInt)
  {
    this.b.putInt("maskedWalletDetailsLogoImageType", paramInt);
    return this;
  }
  
  @Deprecated
  public WalletFragmentStyle n(int paramInt)
  {
    this.b.putInt("maskedWalletDetailsLogoTextColor", paramInt);
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface a
  {
    public static final int a = 4;
    public static final int b = 5;
    public static final int c = 6;
    @Deprecated
    public static final int d = 1;
    @Deprecated
    public static final int e = 2;
    @Deprecated
    public static final int f = 3;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface b
  {
    public static final int a = 5;
    public static final int b = 6;
    public static final int c = 7;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface c
  {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = -1;
    public static final int h = -2;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface d
  {
    @Deprecated
    public static final int a = 1;
    @Deprecated
    public static final int b = 2;
    public static final int c = 3;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/wallet/fragment/WalletFragmentStyle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */