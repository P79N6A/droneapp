package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;
import com.google.android.gms.c.e.a;

public abstract interface aa
  extends IInterface
{
  public abstract e a();
  
  public abstract void a(ab paramab);
  
  public abstract void a(v paramv);
  
  public abstract void a(boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract e b();
  
  public abstract void b(ab paramab);
  
  public abstract void b(v paramv);
  
  public static abstract class a
    extends Binder
    implements aa
  {
    public static aa a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
      if ((localIInterface != null) && ((localIInterface instanceof aa))) {
        return (aa)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      e locale2 = null;
      e locale1 = null;
      boolean bool2 = false;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.cast.framework.ISessionManager");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ISessionManager");
        locale2 = a();
        paramParcel2.writeNoException();
        paramParcel1 = locale1;
        if (locale2 != null) {
          paramParcel1 = locale2.asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ISessionManager");
        a(ab.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ISessionManager");
        b(ab.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ISessionManager");
        a(v.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ISessionManager");
        b(v.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 6: 
        paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ISessionManager");
        if (paramParcel1.readInt() != 0) {}
        for (boolean bool1 = true;; bool1 = false)
        {
          if (paramParcel1.readInt() != 0) {
            bool2 = true;
          }
          a(bool1, bool2);
          paramParcel2.writeNoException();
          return true;
        }
      }
      paramParcel1.enforceInterface("com.google.android.gms.cast.framework.ISessionManager");
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
      implements aa
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
          localParcel1.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManager");
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
      
      /* Error */
      public void a(ab paramab)
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
        //   15: ifnull +42 -> 57
        //   18: aload_1
        //   19: invokeinterface 58 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 61	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/cast/framework/aa$a$a:a	Landroid/os/IBinder;
        //   34: iconst_2
        //   35: aload_2
        //   36: aload_3
        //   37: iconst_0
        //   38: invokeinterface 37 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 40	android/os/Parcel:readException	()V
        //   48: aload_3
        //   49: invokevirtual 52	android/os/Parcel:recycle	()V
        //   52: aload_2
        //   53: invokevirtual 52	android/os/Parcel:recycle	()V
        //   56: return
        //   57: aconst_null
        //   58: astore_1
        //   59: goto -34 -> 25
        //   62: astore_1
        //   63: aload_3
        //   64: invokevirtual 52	android/os/Parcel:recycle	()V
        //   67: aload_2
        //   68: invokevirtual 52	android/os/Parcel:recycle	()V
        //   71: aload_1
        //   72: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	73	0	this	a
        //   0	73	1	paramab	ab
        //   3	65	2	localParcel1	Parcel
        //   7	57	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	62	finally
        //   18	25	62	finally
        //   25	48	62	finally
      }
      
      /* Error */
      public void a(v paramv)
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
        //   15: ifnull +42 -> 57
        //   18: aload_1
        //   19: invokeinterface 65 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 61	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/cast/framework/aa$a$a:a	Landroid/os/IBinder;
        //   34: iconst_4
        //   35: aload_2
        //   36: aload_3
        //   37: iconst_0
        //   38: invokeinterface 37 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 40	android/os/Parcel:readException	()V
        //   48: aload_3
        //   49: invokevirtual 52	android/os/Parcel:recycle	()V
        //   52: aload_2
        //   53: invokevirtual 52	android/os/Parcel:recycle	()V
        //   56: return
        //   57: aconst_null
        //   58: astore_1
        //   59: goto -34 -> 25
        //   62: astore_1
        //   63: aload_3
        //   64: invokevirtual 52	android/os/Parcel:recycle	()V
        //   67: aload_2
        //   68: invokevirtual 52	android/os/Parcel:recycle	()V
        //   71: aload_1
        //   72: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	73	0	this	a
        //   0	73	1	paramv	v
        //   3	65	2	localParcel1	Parcel
        //   7	57	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	62	finally
        //   18	25	62	finally
        //   25	48	62	finally
      }
      
      /* Error */
      public void a(boolean paramBoolean1, boolean paramBoolean2)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 4
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 5
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 6
        //   13: aload 5
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: iload_1
        //   21: ifeq +57 -> 78
        //   24: iconst_1
        //   25: istore_3
        //   26: aload 5
        //   28: iload_3
        //   29: invokevirtual 70	android/os/Parcel:writeInt	(I)V
        //   32: iload_2
        //   33: ifeq +50 -> 83
        //   36: iload 4
        //   38: istore_3
        //   39: aload 5
        //   41: iload_3
        //   42: invokevirtual 70	android/os/Parcel:writeInt	(I)V
        //   45: aload_0
        //   46: getfield 17	com/google/android/gms/cast/framework/aa$a$a:a	Landroid/os/IBinder;
        //   49: bipush 6
        //   51: aload 5
        //   53: aload 6
        //   55: iconst_0
        //   56: invokeinterface 37 5 0
        //   61: pop
        //   62: aload 6
        //   64: invokevirtual 40	android/os/Parcel:readException	()V
        //   67: aload 6
        //   69: invokevirtual 52	android/os/Parcel:recycle	()V
        //   72: aload 5
        //   74: invokevirtual 52	android/os/Parcel:recycle	()V
        //   77: return
        //   78: iconst_0
        //   79: istore_3
        //   80: goto -54 -> 26
        //   83: iconst_0
        //   84: istore_3
        //   85: goto -46 -> 39
        //   88: astore 7
        //   90: aload 6
        //   92: invokevirtual 52	android/os/Parcel:recycle	()V
        //   95: aload 5
        //   97: invokevirtual 52	android/os/Parcel:recycle	()V
        //   100: aload 7
        //   102: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	103	0	this	a
        //   0	103	1	paramBoolean1	boolean
        //   0	103	2	paramBoolean2	boolean
        //   25	60	3	i	int
        //   1	36	4	j	int
        //   6	90	5	localParcel1	Parcel
        //   11	80	6	localParcel2	Parcel
        //   88	13	7	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   13	20	88	finally
        //   26	32	88	finally
        //   39	67	88	finally
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
          localParcel1.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManager");
          this.a.transact(7, localParcel1, localParcel2, 0);
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
      
      /* Error */
      public void b(ab paramab)
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
        //   15: ifnull +42 -> 57
        //   18: aload_1
        //   19: invokeinterface 58 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 61	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/cast/framework/aa$a$a:a	Landroid/os/IBinder;
        //   34: iconst_3
        //   35: aload_2
        //   36: aload_3
        //   37: iconst_0
        //   38: invokeinterface 37 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 40	android/os/Parcel:readException	()V
        //   48: aload_3
        //   49: invokevirtual 52	android/os/Parcel:recycle	()V
        //   52: aload_2
        //   53: invokevirtual 52	android/os/Parcel:recycle	()V
        //   56: return
        //   57: aconst_null
        //   58: astore_1
        //   59: goto -34 -> 25
        //   62: astore_1
        //   63: aload_3
        //   64: invokevirtual 52	android/os/Parcel:recycle	()V
        //   67: aload_2
        //   68: invokevirtual 52	android/os/Parcel:recycle	()V
        //   71: aload_1
        //   72: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	73	0	this	a
        //   0	73	1	paramab	ab
        //   3	65	2	localParcel1	Parcel
        //   7	57	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	62	finally
        //   18	25	62	finally
        //   25	48	62	finally
      }
      
      /* Error */
      public void b(v paramv)
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
        //   15: ifnull +42 -> 57
        //   18: aload_1
        //   19: invokeinterface 65 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 61	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/cast/framework/aa$a$a:a	Landroid/os/IBinder;
        //   34: iconst_5
        //   35: aload_2
        //   36: aload_3
        //   37: iconst_0
        //   38: invokeinterface 37 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 40	android/os/Parcel:readException	()V
        //   48: aload_3
        //   49: invokevirtual 52	android/os/Parcel:recycle	()V
        //   52: aload_2
        //   53: invokevirtual 52	android/os/Parcel:recycle	()V
        //   56: return
        //   57: aconst_null
        //   58: astore_1
        //   59: goto -34 -> 25
        //   62: astore_1
        //   63: aload_3
        //   64: invokevirtual 52	android/os/Parcel:recycle	()V
        //   67: aload_2
        //   68: invokevirtual 52	android/os/Parcel:recycle	()V
        //   71: aload_1
        //   72: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	73	0	this	a
        //   0	73	1	paramv	v
        //   3	65	2	localParcel1	Parcel
        //   7	57	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	62	finally
        //   18	25	62	finally
        //   25	48	62	finally
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */