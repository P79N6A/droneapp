package com.google.android.gms.cast.framework.media;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;

public abstract interface e
  extends IInterface
{
  public abstract int a();
  
  public abstract WebImage a(MediaMetadata paramMediaMetadata, int paramInt);
  
  public abstract com.google.android.gms.c.e b();
  
  public static abstract class a
    extends Binder
    implements e
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.cast.framework.media.IImagePicker");
    }
    
    public static e a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
      if ((localIInterface != null) && ((localIInterface instanceof e))) {
        return (e)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      Object localObject = null;
      com.google.android.gms.c.e locale = null;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.cast.framework.media.IImagePicker");
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.media.IImagePicker");
        paramInt1 = a();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.media.IImagePicker");
        localObject = locale;
        if (paramParcel1.readInt() != 0) {
          localObject = (MediaMetadata)MediaMetadata.CREATOR.createFromParcel(paramParcel1);
        }
        paramParcel1 = a((MediaMetadata)localObject, paramParcel1.readInt());
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          return true;
          paramParcel2.writeInt(0);
        }
      }
      paramParcel1.enforceInterface("com.google.android.gms.cast.framework.media.IImagePicker");
      locale = b();
      paramParcel2.writeNoException();
      paramParcel1 = (Parcel)localObject;
      if (locale != null) {
        paramParcel1 = locale.asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    }
    
    private static class a
      implements e
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        this.a = paramIBinder;
      }
      
      public int a()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.cast.framework.media.IImagePicker");
          this.a.transact(3, localParcel1, localParcel2, 0);
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
      
      public WebImage a(MediaMetadata paramMediaMetadata, int paramInt)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.cast.framework.media.IImagePicker");
            if (paramMediaMetadata != null)
            {
              localParcel1.writeInt(1);
              paramMediaMetadata.writeToParcel(localParcel1, 0);
              localParcel1.writeInt(paramInt);
              this.a.transact(1, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                paramMediaMetadata = (WebImage)WebImage.CREATOR.createFromParcel(localParcel2);
                return paramMediaMetadata;
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            paramMediaMetadata = null;
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
      
      public com.google.android.gms.c.e b()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.cast.framework.media.IImagePicker");
          this.a.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          com.google.android.gms.c.e locale = com.google.android.gms.c.e.a.a(localParcel2.readStrongBinder());
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


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */