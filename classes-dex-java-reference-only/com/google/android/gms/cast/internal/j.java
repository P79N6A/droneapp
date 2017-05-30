package com.google.android.gms.cast.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;

public abstract interface j
  extends IInterface
{
  public abstract void a();
  
  public abstract void a(double paramDouble1, double paramDouble2, boolean paramBoolean);
  
  public abstract void a(String paramString);
  
  public abstract void a(String paramString, LaunchOptions paramLaunchOptions);
  
  public abstract void a(String paramString1, String paramString2);
  
  public abstract void a(String paramString1, String paramString2, long paramLong);
  
  public abstract void a(String paramString1, String paramString2, long paramLong, String paramString3);
  
  public abstract void a(String paramString1, String paramString2, JoinOptions paramJoinOptions);
  
  public abstract void a(String paramString, boolean paramBoolean);
  
  public abstract void a(String paramString, byte[] paramArrayOfByte, long paramLong);
  
  public abstract void a(boolean paramBoolean1, double paramDouble, boolean paramBoolean2);
  
  public abstract void b();
  
  public abstract void b(String paramString);
  
  public abstract void c();
  
  public abstract void c(String paramString);
  
  public static abstract class a
    extends Binder
    implements j
  {
    public static j a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      if ((localIInterface != null) && ((localIInterface instanceof j))) {
        return (j)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      boolean bool2 = false;
      boolean bool1 = false;
      double d1;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.cast.internal.ICastDeviceController");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        a();
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        paramParcel2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        a(paramParcel2, bool1);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        a(paramParcel1.readString(), paramParcel1.readString());
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        b();
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        a(paramParcel1.readString());
        return true;
      case 6: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        c();
        return true;
      case 7: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        d1 = paramParcel1.readDouble();
        double d2 = paramParcel1.readDouble();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a(d1, d2, bool1);
          return true;
        }
      case 8: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          d1 = paramParcel1.readDouble();
          if (paramParcel1.readInt() != 0) {
            bool2 = true;
          }
          a(bool1, d1, bool2);
          return true;
        }
      case 9: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        a(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readLong());
        return true;
      case 10: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        a(paramParcel1.readString(), paramParcel1.createByteArray(), paramParcel1.readLong());
        return true;
      case 11: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        b(paramParcel1.readString());
        return true;
      case 12: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        c(paramParcel1.readString());
        return true;
      case 13: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        paramParcel2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel1 = (LaunchOptions)LaunchOptions.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          a(paramParcel2, paramParcel1);
          return true;
        }
      case 14: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        paramParcel2 = paramParcel1.readString();
        String str = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel1 = (JoinOptions)JoinOptions.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          a(paramParcel2, str, paramParcel1);
          return true;
        }
      }
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      a(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readLong(), paramParcel1.readString());
      return true;
    }
    
    private static class a
      implements j
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        this.a = paramIBinder;
      }
      
      public void a()
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
          this.a.transact(1, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      /* Error */
      public void a(double paramDouble1, double paramDouble2, boolean paramBoolean)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 6
        //   3: invokestatic 24	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 7
        //   8: aload 7
        //   10: ldc 26
        //   12: invokevirtual 30	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload 7
        //   17: dload_1
        //   18: invokevirtual 44	android/os/Parcel:writeDouble	(D)V
        //   21: aload 7
        //   23: dload_3
        //   24: invokevirtual 44	android/os/Parcel:writeDouble	(D)V
        //   27: iload 5
        //   29: ifeq +32 -> 61
        //   32: aload 7
        //   34: iload 6
        //   36: invokevirtual 48	android/os/Parcel:writeInt	(I)V
        //   39: aload_0
        //   40: getfield 17	com/google/android/gms/cast/internal/j$a$a:a	Landroid/os/IBinder;
        //   43: bipush 7
        //   45: aload 7
        //   47: aconst_null
        //   48: iconst_1
        //   49: invokeinterface 36 5 0
        //   54: pop
        //   55: aload 7
        //   57: invokevirtual 39	android/os/Parcel:recycle	()V
        //   60: return
        //   61: iconst_0
        //   62: istore 6
        //   64: goto -32 -> 32
        //   67: astore 8
        //   69: aload 7
        //   71: invokevirtual 39	android/os/Parcel:recycle	()V
        //   74: aload 8
        //   76: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	77	0	this	a
        //   0	77	1	paramDouble1	double
        //   0	77	3	paramDouble2	double
        //   0	77	5	paramBoolean	boolean
        //   1	62	6	i	int
        //   6	64	7	localParcel	Parcel
        //   67	8	8	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   8	27	67	finally
        //   32	55	67	finally
      }
      
      public void a(String paramString)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
          localParcel.writeString(paramString);
          this.a.transact(5, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      /* Error */
      public void a(String paramString, LaunchOptions paramLaunchOptions)
      {
        // Byte code:
        //   0: invokestatic 24	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: aload_3
        //   5: ldc 26
        //   7: invokevirtual 30	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   10: aload_3
        //   11: aload_1
        //   12: invokevirtual 51	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   15: aload_2
        //   16: ifnull +34 -> 50
        //   19: aload_3
        //   20: iconst_1
        //   21: invokevirtual 48	android/os/Parcel:writeInt	(I)V
        //   24: aload_2
        //   25: aload_3
        //   26: iconst_0
        //   27: invokevirtual 58	com/google/android/gms/cast/LaunchOptions:writeToParcel	(Landroid/os/Parcel;I)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/cast/internal/j$a$a:a	Landroid/os/IBinder;
        //   34: bipush 13
        //   36: aload_3
        //   37: aconst_null
        //   38: iconst_1
        //   39: invokeinterface 36 5 0
        //   44: pop
        //   45: aload_3
        //   46: invokevirtual 39	android/os/Parcel:recycle	()V
        //   49: return
        //   50: aload_3
        //   51: iconst_0
        //   52: invokevirtual 48	android/os/Parcel:writeInt	(I)V
        //   55: goto -25 -> 30
        //   58: astore_1
        //   59: aload_3
        //   60: invokevirtual 39	android/os/Parcel:recycle	()V
        //   63: aload_1
        //   64: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	65	0	this	a
        //   0	65	1	paramString	String
        //   0	65	2	paramLaunchOptions	LaunchOptions
        //   3	57	3	localParcel	Parcel
        // Exception table:
        //   from	to	target	type
        //   4	15	58	finally
        //   19	30	58	finally
        //   30	45	58	finally
        //   50	55	58	finally
      }
      
      public void a(String paramString1, String paramString2)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
          localParcel.writeString(paramString1);
          localParcel.writeString(paramString2);
          this.a.transact(3, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void a(String paramString1, String paramString2, long paramLong)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
          localParcel.writeString(paramString1);
          localParcel.writeString(paramString2);
          localParcel.writeLong(paramLong);
          this.a.transact(9, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void a(String paramString1, String paramString2, long paramLong, String paramString3)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
          localParcel.writeString(paramString1);
          localParcel.writeString(paramString2);
          localParcel.writeLong(paramLong);
          localParcel.writeString(paramString3);
          this.a.transact(15, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      /* Error */
      public void a(String paramString1, String paramString2, JoinOptions paramJoinOptions)
      {
        // Byte code:
        //   0: invokestatic 24	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 4
        //   5: aload 4
        //   7: ldc 26
        //   9: invokevirtual 30	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   12: aload 4
        //   14: aload_1
        //   15: invokevirtual 51	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   18: aload 4
        //   20: aload_2
        //   21: invokevirtual 51	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   24: aload_3
        //   25: ifnull +38 -> 63
        //   28: aload 4
        //   30: iconst_1
        //   31: invokevirtual 48	android/os/Parcel:writeInt	(I)V
        //   34: aload_3
        //   35: aload 4
        //   37: iconst_0
        //   38: invokevirtual 69	com/google/android/gms/cast/JoinOptions:writeToParcel	(Landroid/os/Parcel;I)V
        //   41: aload_0
        //   42: getfield 17	com/google/android/gms/cast/internal/j$a$a:a	Landroid/os/IBinder;
        //   45: bipush 14
        //   47: aload 4
        //   49: aconst_null
        //   50: iconst_1
        //   51: invokeinterface 36 5 0
        //   56: pop
        //   57: aload 4
        //   59: invokevirtual 39	android/os/Parcel:recycle	()V
        //   62: return
        //   63: aload 4
        //   65: iconst_0
        //   66: invokevirtual 48	android/os/Parcel:writeInt	(I)V
        //   69: goto -28 -> 41
        //   72: astore_1
        //   73: aload 4
        //   75: invokevirtual 39	android/os/Parcel:recycle	()V
        //   78: aload_1
        //   79: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	80	0	this	a
        //   0	80	1	paramString1	String
        //   0	80	2	paramString2	String
        //   0	80	3	paramJoinOptions	JoinOptions
        //   3	71	4	localParcel	Parcel
        // Exception table:
        //   from	to	target	type
        //   5	24	72	finally
        //   28	41	72	finally
        //   41	57	72	finally
        //   63	69	72	finally
      }
      
      /* Error */
      public void a(String paramString, boolean paramBoolean)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore_3
        //   2: invokestatic 24	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   5: astore 4
        //   7: aload 4
        //   9: ldc 26
        //   11: invokevirtual 30	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload 4
        //   16: aload_1
        //   17: invokevirtual 51	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   20: iload_2
        //   21: ifeq +30 -> 51
        //   24: aload 4
        //   26: iload_3
        //   27: invokevirtual 48	android/os/Parcel:writeInt	(I)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/cast/internal/j$a$a:a	Landroid/os/IBinder;
        //   34: iconst_2
        //   35: aload 4
        //   37: aconst_null
        //   38: iconst_1
        //   39: invokeinterface 36 5 0
        //   44: pop
        //   45: aload 4
        //   47: invokevirtual 39	android/os/Parcel:recycle	()V
        //   50: return
        //   51: iconst_0
        //   52: istore_3
        //   53: goto -29 -> 24
        //   56: astore_1
        //   57: aload 4
        //   59: invokevirtual 39	android/os/Parcel:recycle	()V
        //   62: aload_1
        //   63: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	64	0	this	a
        //   0	64	1	paramString	String
        //   0	64	2	paramBoolean	boolean
        //   1	52	3	i	int
        //   5	53	4	localParcel	Parcel
        // Exception table:
        //   from	to	target	type
        //   7	20	56	finally
        //   24	45	56	finally
      }
      
      public void a(String paramString, byte[] paramArrayOfByte, long paramLong)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
          localParcel.writeString(paramString);
          localParcel.writeByteArray(paramArrayOfByte);
          localParcel.writeLong(paramLong);
          this.a.transact(10, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      /* Error */
      public void a(boolean paramBoolean1, double paramDouble, boolean paramBoolean2)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 6
        //   3: invokestatic 24	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 7
        //   8: aload 7
        //   10: ldc 26
        //   12: invokevirtual 30	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: iload_1
        //   16: ifeq +57 -> 73
        //   19: iconst_1
        //   20: istore 5
        //   22: aload 7
        //   24: iload 5
        //   26: invokevirtual 48	android/os/Parcel:writeInt	(I)V
        //   29: aload 7
        //   31: dload_2
        //   32: invokevirtual 44	android/os/Parcel:writeDouble	(D)V
        //   35: iload 4
        //   37: ifeq +42 -> 79
        //   40: iload 6
        //   42: istore 5
        //   44: aload 7
        //   46: iload 5
        //   48: invokevirtual 48	android/os/Parcel:writeInt	(I)V
        //   51: aload_0
        //   52: getfield 17	com/google/android/gms/cast/internal/j$a$a:a	Landroid/os/IBinder;
        //   55: bipush 8
        //   57: aload 7
        //   59: aconst_null
        //   60: iconst_1
        //   61: invokeinterface 36 5 0
        //   66: pop
        //   67: aload 7
        //   69: invokevirtual 39	android/os/Parcel:recycle	()V
        //   72: return
        //   73: iconst_0
        //   74: istore 5
        //   76: goto -54 -> 22
        //   79: iconst_0
        //   80: istore 5
        //   82: goto -38 -> 44
        //   85: astore 8
        //   87: aload 7
        //   89: invokevirtual 39	android/os/Parcel:recycle	()V
        //   92: aload 8
        //   94: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	95	0	this	a
        //   0	95	1	paramBoolean1	boolean
        //   0	95	2	paramDouble	double
        //   0	95	4	paramBoolean2	boolean
        //   20	61	5	i	int
        //   1	40	6	j	int
        //   6	82	7	localParcel	Parcel
        //   85	8	8	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   8	15	85	finally
        //   22	35	85	finally
        //   44	67	85	finally
      }
      
      public IBinder asBinder()
      {
        return this.a;
      }
      
      public void b()
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
          this.a.transact(4, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void b(String paramString)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
          localParcel.writeString(paramString);
          this.a.transact(11, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void c()
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
          this.a.transact(6, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void c(String paramString)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
          localParcel.writeString(paramString);
          this.a.transact(12, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */