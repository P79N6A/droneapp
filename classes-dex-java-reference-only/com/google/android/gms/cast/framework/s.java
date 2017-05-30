package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.LaunchOptions;

public abstract interface s
  extends IInterface
{
  public abstract int a();
  
  public abstract void a(int paramInt);
  
  public abstract void a(String paramString);
  
  public abstract void a(String paramString, LaunchOptions paramLaunchOptions);
  
  public abstract void a(String paramString1, String paramString2);
  
  public static abstract class a
    extends Binder
    implements s
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.cast.framework.ICastConnectionController");
    }
    
    public static s a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastConnectionController");
      if ((localIInterface != null) && ((localIInterface instanceof s))) {
        return (s)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.cast.framework.ICastConnectionController");
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ICastConnectionController");
        paramInt1 = a();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ICastConnectionController");
        a(paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ICastConnectionController");
        String str = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel1 = (LaunchOptions)LaunchOptions.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          a(str, paramParcel1);
          paramParcel2.writeNoException();
          return true;
        }
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ICastConnectionController");
        a(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ICastConnectionController");
      a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    }
    
    private static class a
      implements s
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
          localParcel1.writeInterfaceToken("com.google.android.gms.cast.framework.ICastConnectionController");
          this.a.transact(5, localParcel1, localParcel2, 0);
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
      
      public void a(int paramInt)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.cast.framework.ICastConnectionController");
          localParcel1.writeInt(paramInt);
          this.a.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void a(String paramString)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.cast.framework.ICastConnectionController");
          localParcel1.writeString(paramString);
          this.a.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public void a(String paramString, LaunchOptions paramLaunchOptions)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_3
        //   16: aload_1
        //   17: invokevirtual 53	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   20: aload_2
        //   21: ifnull +44 -> 65
        //   24: aload_3
        //   25: iconst_1
        //   26: invokevirtual 50	android/os/Parcel:writeInt	(I)V
        //   29: aload_2
        //   30: aload_3
        //   31: iconst_0
        //   32: invokevirtual 60	com/google/android/gms/cast/LaunchOptions:writeToParcel	(Landroid/os/Parcel;I)V
        //   35: aload_0
        //   36: getfield 17	com/google/android/gms/cast/framework/s$a$a:a	Landroid/os/IBinder;
        //   39: iconst_2
        //   40: aload_3
        //   41: aload 4
        //   43: iconst_0
        //   44: invokeinterface 37 5 0
        //   49: pop
        //   50: aload 4
        //   52: invokevirtual 40	android/os/Parcel:readException	()V
        //   55: aload 4
        //   57: invokevirtual 46	android/os/Parcel:recycle	()V
        //   60: aload_3
        //   61: invokevirtual 46	android/os/Parcel:recycle	()V
        //   64: return
        //   65: aload_3
        //   66: iconst_0
        //   67: invokevirtual 50	android/os/Parcel:writeInt	(I)V
        //   70: goto -35 -> 35
        //   73: astore_1
        //   74: aload 4
        //   76: invokevirtual 46	android/os/Parcel:recycle	()V
        //   79: aload_3
        //   80: invokevirtual 46	android/os/Parcel:recycle	()V
        //   83: aload_1
        //   84: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	85	0	this	a
        //   0	85	1	paramString	String
        //   0	85	2	paramLaunchOptions	LaunchOptions
        //   3	77	3	localParcel1	Parcel
        //   7	68	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	20	73	finally
        //   24	35	73	finally
        //   35	55	73	finally
        //   65	70	73	finally
      }
      
      public void a(String paramString1, String paramString2)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.cast.framework.ICastConnectionController");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          this.a.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
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
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */