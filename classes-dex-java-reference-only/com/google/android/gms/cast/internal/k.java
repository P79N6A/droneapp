package com.google.android.gms.cast.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;

public abstract interface k
  extends IInterface
{
  public abstract void a(int paramInt);
  
  public abstract void a(ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean);
  
  public abstract void a(ApplicationStatus paramApplicationStatus);
  
  public abstract void a(DeviceStatus paramDeviceStatus);
  
  public abstract void a(String paramString, double paramDouble, boolean paramBoolean);
  
  public abstract void a(String paramString, long paramLong);
  
  public abstract void a(String paramString, long paramLong, int paramInt);
  
  public abstract void a(String paramString1, String paramString2);
  
  public abstract void a(String paramString, byte[] paramArrayOfByte);
  
  public abstract void b(int paramInt);
  
  public abstract void c(int paramInt);
  
  public abstract void d(int paramInt);
  
  public abstract void e(int paramInt);
  
  public static abstract class a
    extends Binder
    implements k
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      boolean bool2 = false;
      boolean bool1 = false;
      String str2 = null;
      Object localObject = null;
      String str1 = null;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        a(paramParcel1.readInt());
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        paramParcel2 = str1;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (ApplicationMetadata)ApplicationMetadata.CREATOR.createFromParcel(paramParcel1);
        }
        str1 = paramParcel1.readString();
        str2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        a(paramParcel2, str1, str2, bool1);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        b(paramParcel1.readInt());
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        paramParcel2 = paramParcel1.readString();
        double d = paramParcel1.readDouble();
        bool1 = bool2;
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        a(paramParcel2, d, bool1);
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        a(paramParcel1.readString(), paramParcel1.readString());
        return true;
      case 6: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        a(paramParcel1.readString(), paramParcel1.createByteArray());
        return true;
      case 7: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        d(paramParcel1.readInt());
        return true;
      case 8: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        c(paramParcel1.readInt());
        return true;
      case 9: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        e(paramParcel1.readInt());
        return true;
      case 10: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        a(paramParcel1.readString(), paramParcel1.readLong(), paramParcel1.readInt());
        return true;
      case 11: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        a(paramParcel1.readString(), paramParcel1.readLong());
        return true;
      case 12: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        paramParcel2 = str2;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (ApplicationStatus)ApplicationStatus.CREATOR.createFromParcel(paramParcel1);
        }
        a(paramParcel2);
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      paramParcel2 = (Parcel)localObject;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (DeviceStatus)DeviceStatus.CREATOR.createFromParcel(paramParcel1);
      }
      a(paramParcel2);
      return true;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */