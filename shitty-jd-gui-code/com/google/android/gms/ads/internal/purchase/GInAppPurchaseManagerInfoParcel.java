package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.c.e;
import com.google.android.gms.c.e.a;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.yx;

@aaa
public final class GInAppPurchaseManagerInfoParcel
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final a CREATOR = new a();
  public final int a;
  public final k b;
  public final yx c;
  public final Context d;
  public final j e;
  
  GInAppPurchaseManagerInfoParcel(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4)
  {
    this.a = paramInt;
    this.b = ((k)f.a(e.a.a(paramIBinder1)));
    this.c = ((yx)f.a(e.a.a(paramIBinder2)));
    this.d = ((Context)f.a(e.a.a(paramIBinder3)));
    this.e = ((j)f.a(e.a.a(paramIBinder4)));
  }
  
  public GInAppPurchaseManagerInfoParcel(Context paramContext, k paramk, yx paramyx, j paramj)
  {
    this.a = 2;
    this.d = paramContext;
    this.b = paramk;
    this.c = paramyx;
    this.e = paramj;
  }
  
  public static GInAppPurchaseManagerInfoParcel a(Intent paramIntent)
  {
    try
    {
      paramIntent = paramIntent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
      paramIntent.setClassLoader(GInAppPurchaseManagerInfoParcel.class.getClassLoader());
      paramIntent = (GInAppPurchaseManagerInfoParcel)paramIntent.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
      return paramIntent;
    }
    catch (Exception paramIntent) {}
    return null;
  }
  
  public static void a(Intent paramIntent, GInAppPurchaseManagerInfoParcel paramGInAppPurchaseManagerInfoParcel)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", paramGInAppPurchaseManagerInfoParcel);
    paramIntent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", localBundle);
  }
  
  IBinder a()
  {
    return f.a(this.e).asBinder();
  }
  
  IBinder b()
  {
    return f.a(this.b).asBinder();
  }
  
  IBinder c()
  {
    return f.a(this.c).asBinder();
  }
  
  IBinder d()
  {
    return f.a(this.d).asBinder();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/purchase/GInAppPurchaseManagerInfoParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */