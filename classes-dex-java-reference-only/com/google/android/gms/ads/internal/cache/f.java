package com.google.android.gms.ads.internal.cache;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface f
  extends IInterface
{
  public abstract CacheEntryParcel a(CacheOffering paramCacheOffering);
  
  public static abstract class a
    extends Binder
    implements f
  {
    public static f a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
      if ((localIInterface != null) && ((localIInterface instanceof f))) {
        return (f)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.ads.internal.cache.ICacheService");
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.cache.ICacheService");
      if (paramParcel1.readInt() != 0)
      {
        paramParcel1 = (CacheOffering)CacheOffering.CREATOR.createFromParcel(paramParcel1);
        paramParcel1 = a(paramParcel1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label102;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        paramParcel1 = null;
        break;
        label102:
        paramParcel2.writeInt(0);
      }
    }
    
    private static class a
      implements f
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        this.a = paramIBinder;
      }
      
      public CacheEntryParcel a(CacheOffering paramCacheOffering)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.cache.ICacheService");
            if (paramCacheOffering != null)
            {
              localParcel1.writeInt(1);
              paramCacheOffering.writeToParcel(localParcel1, 0);
              this.a.transact(1, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                paramCacheOffering = (CacheEntryParcel)CacheEntryParcel.CREATOR.createFromParcel(localParcel2);
                return paramCacheOffering;
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            paramCacheOffering = null;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      public IBinder asBinder()
      {
        return this.a;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/cache/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */