package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SignInButtonConfig
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<SignInButtonConfig> CREATOR = new g();
  final int a;
  private final int b;
  private final int c;
  @Deprecated
  private final Scope[] d;
  
  SignInButtonConfig(int paramInt1, int paramInt2, int paramInt3, Scope[] paramArrayOfScope)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramArrayOfScope;
  }
  
  public SignInButtonConfig(int paramInt1, int paramInt2, Scope[] paramArrayOfScope)
  {
    this(1, paramInt1, paramInt2, null);
  }
  
  public int a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.c;
  }
  
  @Deprecated
  public Scope[] c()
  {
    return this.d;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/SignInButtonConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */