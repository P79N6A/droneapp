package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class NearbyDevice
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<NearbyDevice> CREATOR = new a();
  public static final NearbyDevice a = new NearbyDevice("", g, h);
  private static final NearbyDeviceId[] g = new NearbyDeviceId[0];
  private static final String[] h = new String[0];
  final int b;
  @Deprecated
  final NearbyDeviceId c;
  @Deprecated
  @Nullable
  final String d;
  @Deprecated
  final NearbyDeviceId[] e;
  @Deprecated
  final String[] f;
  private final String i;
  
  NearbyDevice(int paramInt, @Nullable NearbyDeviceId paramNearbyDeviceId, @Nullable String paramString1, @Nullable String paramString2, @Nullable NearbyDeviceId[] paramArrayOfNearbyDeviceId, @Nullable String[] paramArrayOfString)
  {
    this.b = ((Integer)d.a(Integer.valueOf(paramInt))).intValue();
    paramNearbyDeviceId = paramString2;
    if (paramString2 == null) {
      paramNearbyDeviceId = "";
    }
    this.i = paramNearbyDeviceId;
    paramNearbyDeviceId = paramArrayOfNearbyDeviceId;
    if (paramArrayOfNearbyDeviceId == null) {
      paramNearbyDeviceId = g;
    }
    this.e = paramNearbyDeviceId;
    paramNearbyDeviceId = paramArrayOfString;
    if (paramArrayOfString == null) {
      paramNearbyDeviceId = h;
    }
    this.f = paramNearbyDeviceId;
    if (this.e.length == 0)
    {
      paramNearbyDeviceId = NearbyDeviceId.a;
      this.c = paramNearbyDeviceId;
      if (this.f.length != 0) {
        break label114;
      }
    }
    label114:
    for (paramNearbyDeviceId = null;; paramNearbyDeviceId = this.f[0])
    {
      this.d = paramNearbyDeviceId;
      return;
      paramNearbyDeviceId = this.e[0];
      break;
    }
  }
  
  @Deprecated
  public NearbyDevice(String paramString, NearbyDeviceId[] paramArrayOfNearbyDeviceId, String[] paramArrayOfString)
  {
    this(1, null, null, paramString, paramArrayOfNearbyDeviceId, paramArrayOfString);
  }
  
  public String a()
  {
    return this.i;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof NearbyDevice)) {
      return false;
    }
    paramObject = (NearbyDevice)paramObject;
    return c.a(this.i, ((NearbyDevice)paramObject).i);
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.i });
  }
  
  public String toString()
  {
    String str = this.i;
    return String.valueOf(str).length() + 21 + "NearbyDevice{handle=" + str + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/nearby/messages/devices/NearbyDevice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */