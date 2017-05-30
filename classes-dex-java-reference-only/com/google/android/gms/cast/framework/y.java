package com.google.android.gms.cast.framework;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.c.e;
import com.google.android.gms.c.e.a;

public abstract interface y
  extends IInterface
{
  public abstract int a(Intent paramIntent, int paramInt1, int paramInt2);
  
  public abstract IBinder a(Intent paramIntent);
  
  public abstract void a();
  
  public abstract void b();
  
  public abstract e c();
  
  public static abstract class a
    extends Binder
    implements y
  {
    public static y a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
      if ((localIInterface != null) && ((localIInterface instanceof y))) {
        return (y)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      Object localObject2 = null;
      Object localObject1 = null;
      e locale = null;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.cast.framework.IReconnectionService");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.IReconnectionService");
        a();
        paramParcel2.writeNoException();
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.IReconnectionService");
        localObject1 = locale;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
        }
        paramInt1 = a((Intent)localObject1, paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.IReconnectionService");
        localObject1 = localObject2;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
        }
        paramParcel1 = a((Intent)localObject1);
        paramParcel2.writeNoException();
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.IReconnectionService");
        b();
        paramParcel2.writeNoException();
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.cast.framework.IReconnectionService");
      locale = c();
      paramParcel2.writeNoException();
      paramParcel1 = (Parcel)localObject1;
      if (locale != null) {
        paramParcel1 = locale.asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    }
    
    private static class a
      implements y
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        this.a = paramIBinder;
      }
      
      /* Error */
      public int a(Intent paramIntent, int paramInt1, int paramInt2)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 4
        //   5: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 5
        //   10: aload 4
        //   12: ldc 27
        //   14: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +67 -> 85
        //   21: aload 4
        //   23: iconst_1
        //   24: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   27: aload_1
        //   28: aload 4
        //   30: iconst_0
        //   31: invokevirtual 41	android/content/Intent:writeToParcel	(Landroid/os/Parcel;I)V
        //   34: aload 4
        //   36: iload_2
        //   37: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   40: aload 4
        //   42: iload_3
        //   43: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   46: aload_0
        //   47: getfield 17	com/google/android/gms/cast/framework/y$a$a:a	Landroid/os/IBinder;
        //   50: iconst_2
        //   51: aload 4
        //   53: aload 5
        //   55: iconst_0
        //   56: invokeinterface 47 5 0
        //   61: pop
        //   62: aload 5
        //   64: invokevirtual 50	android/os/Parcel:readException	()V
        //   67: aload 5
        //   69: invokevirtual 54	android/os/Parcel:readInt	()I
        //   72: istore_2
        //   73: aload 5
        //   75: invokevirtual 57	android/os/Parcel:recycle	()V
        //   78: aload 4
        //   80: invokevirtual 57	android/os/Parcel:recycle	()V
        //   83: iload_2
        //   84: ireturn
        //   85: aload 4
        //   87: iconst_0
        //   88: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   91: goto -57 -> 34
        //   94: astore_1
        //   95: aload 5
        //   97: invokevirtual 57	android/os/Parcel:recycle	()V
        //   100: aload 4
        //   102: invokevirtual 57	android/os/Parcel:recycle	()V
        //   105: aload_1
        //   106: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	107	0	this	a
        //   0	107	1	paramIntent	Intent
        //   0	107	2	paramInt1	int
        //   0	107	3	paramInt2	int
        //   3	98	4	localParcel1	Parcel
        //   8	88	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	17	94	finally
        //   21	34	94	finally
        //   34	73	94	finally
        //   85	91	94	finally
      }
      
      /* Error */
      public IBinder a(Intent paramIntent)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 27
        //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +47 -> 62
        //   18: aload_2
        //   19: iconst_1
        //   20: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   23: aload_1
        //   24: aload_2
        //   25: iconst_0
        //   26: invokevirtual 41	android/content/Intent:writeToParcel	(Landroid/os/Parcel;I)V
        //   29: aload_0
        //   30: getfield 17	com/google/android/gms/cast/framework/y$a$a:a	Landroid/os/IBinder;
        //   33: iconst_3
        //   34: aload_2
        //   35: aload_3
        //   36: iconst_0
        //   37: invokeinterface 47 5 0
        //   42: pop
        //   43: aload_3
        //   44: invokevirtual 50	android/os/Parcel:readException	()V
        //   47: aload_3
        //   48: invokevirtual 62	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   51: astore_1
        //   52: aload_3
        //   53: invokevirtual 57	android/os/Parcel:recycle	()V
        //   56: aload_2
        //   57: invokevirtual 57	android/os/Parcel:recycle	()V
        //   60: aload_1
        //   61: areturn
        //   62: aload_2
        //   63: iconst_0
        //   64: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   67: goto -38 -> 29
        //   70: astore_1
        //   71: aload_3
        //   72: invokevirtual 57	android/os/Parcel:recycle	()V
        //   75: aload_2
        //   76: invokevirtual 57	android/os/Parcel:recycle	()V
        //   79: aload_1
        //   80: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	81	0	this	a
        //   0	81	1	paramIntent	Intent
        //   3	73	2	localParcel1	Parcel
        //   7	65	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	70	finally
        //   18	29	70	finally
        //   29	52	70	finally
        //   62	67	70	finally
      }
      
      public void a()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.cast.framework.IReconnectionService");
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
      
      public void b()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.cast.framework.IReconnectionService");
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
      
      public e c()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.cast.framework.IReconnectionService");
          this.a.transact(5, localParcel1, localParcel2, 0);
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


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */