package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class ProxyCard
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ProxyCard> CREATOR = new w();
  String a;
  String b;
  int c;
  int d;
  private final int e;
  
  ProxyCard(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    this.e = paramInt1;
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  public int a()
  {
    return this.e;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public String c()
  {
    return this.b;
  }
  
  public int d()
  {
    return this.c;
  }
  
  public int e()
  {
    return this.d;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    w.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/wallet/ProxyCard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */