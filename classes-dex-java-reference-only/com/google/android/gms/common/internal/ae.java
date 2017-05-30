package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;
import com.google.android.gms.c.e.a;

public abstract interface ae
  extends IInterface
{
  public abstract e a();
  
  public abstract int b();
  
  public static abstract class a
    extends Binder
    implements ae
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.common.internal.ICertData");
    }
    
    public static ae a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
      if ((localIInterface != null) && ((localIInterface instanceof ae))) {
        return (ae)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.common.internal.ICertData");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.common.internal.ICertData");
        paramParcel1 = a();
        paramParcel2.writeNoException();
        if (paramParcel1 != null) {}
        for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
        {
          paramParcel2.writeStrongBinder(paramParcel1);
          return true;
        }
      }
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.ICertData");
      paramInt1 = b();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    }
    
    private static class a
      implements ae
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
          localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.ICertData");
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
      
      public int b()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.ICertData");
          this.a.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
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


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */