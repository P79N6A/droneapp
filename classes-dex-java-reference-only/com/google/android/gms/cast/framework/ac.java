package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;

public abstract interface ac
  extends IInterface
{
  public abstract int a();
  
  public abstract e a(String paramString);
  
  public abstract boolean b();
  
  public abstract String c();
  
  public static abstract class a
    extends Binder
    implements ac
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.cast.framework.ISessionProvider");
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
        paramParcel2.writeString("com.google.android.gms.cast.framework.ISessionProvider");
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ISessionProvider");
        paramInt1 = a();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ISessionProvider");
        paramParcel1 = a(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (paramParcel1 != null) {}
        for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
        {
          paramParcel2.writeStrongBinder(paramParcel1);
          return true;
        }
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ISessionProvider");
        boolean bool = b();
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          return true;
        }
      }
      paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ISessionProvider");
      paramParcel1 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */