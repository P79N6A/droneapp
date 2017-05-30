package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

public final class SubscribeRequest
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<SubscribeRequest> CREATOR = new y();
  final int a;
  public final j b;
  public final Strategy c;
  public final k d;
  public final MessageFilter e;
  public final PendingIntent f;
  public final int g;
  @Deprecated
  public final String h;
  @Deprecated
  public final String i;
  public final byte[] j;
  @Deprecated
  public final boolean k;
  public final o l;
  @Deprecated
  public final boolean m;
  @Deprecated
  public final ClientAppContext n;
  public final boolean o;
  
  public SubscribeRequest(int paramInt1, IBinder paramIBinder1, Strategy paramStrategy, IBinder paramIBinder2, MessageFilter paramMessageFilter, PendingIntent paramPendingIntent, int paramInt2, String paramString1, String paramString2, byte[] paramArrayOfByte, boolean paramBoolean1, IBinder paramIBinder3, boolean paramBoolean2, ClientAppContext paramClientAppContext, boolean paramBoolean3)
  {
    this.a = paramInt1;
    this.b = j.a.a(paramIBinder1);
    this.c = paramStrategy;
    this.d = k.a.a(paramIBinder2);
    this.e = paramMessageFilter;
    this.f = paramPendingIntent;
    this.g = paramInt2;
    this.h = paramString1;
    this.i = paramString2;
    this.j = paramArrayOfByte;
    this.k = paramBoolean1;
    if (paramIBinder3 == null) {}
    for (paramIBinder1 = null;; paramIBinder1 = o.a.a(paramIBinder3))
    {
      this.l = paramIBinder1;
      this.m = paramBoolean2;
      this.n = ClientAppContext.a(paramClientAppContext, paramString2, paramString1, paramBoolean2);
      this.o = paramBoolean3;
      return;
    }
  }
  
  public SubscribeRequest(IBinder paramIBinder1, Strategy paramStrategy, IBinder paramIBinder2, MessageFilter paramMessageFilter, PendingIntent paramPendingIntent, int paramInt, byte[] paramArrayOfByte, IBinder paramIBinder3, boolean paramBoolean)
  {
    this(3, paramIBinder1, paramStrategy, paramIBinder2, paramMessageFilter, paramPendingIntent, paramInt, null, null, paramArrayOfByte, false, paramIBinder3, false, null, paramBoolean);
  }
  
  IBinder a()
  {
    if (this.d == null) {
      return null;
    }
    return this.d.asBinder();
  }
  
  IBinder b()
  {
    if (this.b == null) {
      return null;
    }
    return this.b.asBinder();
  }
  
  IBinder c()
  {
    if (this.l == null) {
      return null;
    }
    return this.l.asBinder();
  }
  
  public String toString()
  {
    String str1 = String.valueOf(this.b);
    String str2 = String.valueOf(this.c);
    String str3 = String.valueOf(this.d);
    String str4 = String.valueOf(this.e);
    String str5 = String.valueOf(this.f);
    int i1 = this.g;
    if (this.j == null) {}
    int i2;
    for (Object localObject = null;; localObject = 19 + "<" + i2 + " bytes>")
    {
      String str6 = String.valueOf(this.l);
      boolean bool1 = this.m;
      String str7 = String.valueOf(this.n);
      boolean bool2 = this.o;
      String str8 = this.h;
      String str9 = this.i;
      boolean bool3 = this.k;
      return String.valueOf(str1).length() + 295 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(localObject).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(str8).length() + String.valueOf(str9).length() + "SubscribeRequest{messageListener=" + str1 + ", strategy=" + str2 + ", callback=" + str3 + ", filter=" + str4 + ", pendingIntent=" + str5 + ", messageListenerKey=" + i1 + ", hint=" + (String)localObject + ", subscribeCallback=" + str6 + ", useRealClientApiKey=" + bool1 + ", clientAppContext=" + str7 + ", isDiscardPendingIntent=" + bool2 + ", zeroPartyPackageName=" + str8 + ", realClientPackageName=" + str9 + ", isIgnoreNearbyPermission=" + bool3 + "}";
      i2 = this.j.length;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    y.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/nearby/messages/internal/SubscribeRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */