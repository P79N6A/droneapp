package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;
import com.google.android.gms.c.e.a;

public abstract interface ah
  extends IInterface
{
  public abstract e a();
  
  public abstract e b();
  
  public static abstract class a
    extends Binder
    implements ah
  {
    public static ah a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
      if ((localIInterface != null) && ((localIInterface instanceof ah))) {
        return (ah)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      e locale2 = null;
      e locale1 = null;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        locale2 = a();
        paramParcel2.writeNoException();
        paramParcel1 = locale1;
        if (locale2 != null) {
          paramParcel1 = locale2.asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
      locale1 = b();
      paramParcel2.writeNoException();
      paramParcel1 = locale2;
      if (locale1 != null) {
        paramParcel1 = locale1.asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    }
    
    private static class a
      implements ah
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        this.a = paramIBinder;
      }
      
      public e a()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGoogleCertificatesApi");
          this.a.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          e locale = e.a.a(localParcel2.readStrongBinder());
          return locale;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public IBinder asBinder()
      {
        return this.a;
      }
      
      public e b()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGoogleCertificatesApi");
          this.a.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          e locale = e.a.a(localParcel2.readStrongBinder());
          return locale;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */