package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public abstract interface g
  extends IInterface
{
  public abstract void a(f paramf, GoogleSignInOptions paramGoogleSignInOptions);
  
  public abstract void b(f paramf, GoogleSignInOptions paramGoogleSignInOptions);
  
  public abstract void c(f paramf, GoogleSignInOptions paramGoogleSignInOptions);
  
  public static abstract class a
    extends Binder
    implements g
  {
    public static g a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
      if ((localIInterface != null) && ((localIInterface instanceof g))) {
        return (g)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      f localf1 = null;
      f localf2 = null;
      Object localObject = null;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return true;
      case 101: 
        paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        localf1 = f.a.a(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0) {
          localObject = (GoogleSignInOptions)GoogleSignInOptions.CREATOR.createFromParcel(paramParcel1);
        }
        a(localf1, (GoogleSignInOptions)localObject);
        paramParcel2.writeNoException();
        return true;
      case 102: 
        paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        localf2 = f.a.a(paramParcel1.readStrongBinder());
        localObject = localf1;
        if (paramParcel1.readInt() != 0) {
          localObject = (GoogleSignInOptions)GoogleSignInOptions.CREATOR.createFromParcel(paramParcel1);
        }
        b(localf2, (GoogleSignInOptions)localObject);
        paramParcel2.writeNoException();
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
      localf1 = f.a.a(paramParcel1.readStrongBinder());
      localObject = localf2;
      if (paramParcel1.readInt() != 0) {
        localObject = (GoogleSignInOptions)GoogleSignInOptions.CREATOR.createFromParcel(paramParcel1);
      }
      c(localf1, (GoogleSignInOptions)localObject);
      paramParcel2.writeNoException();
      return true;
    }
    
    private static class a
      implements g
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        this.a = paramIBinder;
      }
      
      /* Error */
      public void a(f paramf, GoogleSignInOptions paramGoogleSignInOptions)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +61 -> 77
        //   19: aload_1
        //   20: invokeinterface 37 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_2
        //   32: ifnull +50 -> 82
        //   35: aload_3
        //   36: iconst_1
        //   37: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   40: aload_2
        //   41: aload_3
        //   42: iconst_0
        //   43: invokevirtual 50	com/google/android/gms/auth/api/signin/GoogleSignInOptions:writeToParcel	(Landroid/os/Parcel;I)V
        //   46: aload_0
        //   47: getfield 17	com/google/android/gms/auth/api/signin/internal/g$a$a:a	Landroid/os/IBinder;
        //   50: bipush 101
        //   52: aload_3
        //   53: aload 4
        //   55: iconst_0
        //   56: invokeinterface 56 5 0
        //   61: pop
        //   62: aload 4
        //   64: invokevirtual 59	android/os/Parcel:readException	()V
        //   67: aload 4
        //   69: invokevirtual 62	android/os/Parcel:recycle	()V
        //   72: aload_3
        //   73: invokevirtual 62	android/os/Parcel:recycle	()V
        //   76: return
        //   77: aconst_null
        //   78: astore_1
        //   79: goto -53 -> 26
        //   82: aload_3
        //   83: iconst_0
        //   84: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   87: goto -41 -> 46
        //   90: astore_1
        //   91: aload 4
        //   93: invokevirtual 62	android/os/Parcel:recycle	()V
        //   96: aload_3
        //   97: invokevirtual 62	android/os/Parcel:recycle	()V
        //   100: aload_1
        //   101: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	102	0	this	a
        //   0	102	1	paramf	f
        //   0	102	2	paramGoogleSignInOptions	GoogleSignInOptions
        //   3	94	3	localParcel1	Parcel
        //   7	85	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	90	finally
        //   19	26	90	finally
        //   26	31	90	finally
        //   35	46	90	finally
        //   46	67	90	finally
        //   82	87	90	finally
      }
      
      public IBinder asBinder()
      {
        return this.a;
      }
      
      /* Error */
      public void b(f paramf, GoogleSignInOptions paramGoogleSignInOptions)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +61 -> 77
        //   19: aload_1
        //   20: invokeinterface 37 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_2
        //   32: ifnull +50 -> 82
        //   35: aload_3
        //   36: iconst_1
        //   37: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   40: aload_2
        //   41: aload_3
        //   42: iconst_0
        //   43: invokevirtual 50	com/google/android/gms/auth/api/signin/GoogleSignInOptions:writeToParcel	(Landroid/os/Parcel;I)V
        //   46: aload_0
        //   47: getfield 17	com/google/android/gms/auth/api/signin/internal/g$a$a:a	Landroid/os/IBinder;
        //   50: bipush 102
        //   52: aload_3
        //   53: aload 4
        //   55: iconst_0
        //   56: invokeinterface 56 5 0
        //   61: pop
        //   62: aload 4
        //   64: invokevirtual 59	android/os/Parcel:readException	()V
        //   67: aload 4
        //   69: invokevirtual 62	android/os/Parcel:recycle	()V
        //   72: aload_3
        //   73: invokevirtual 62	android/os/Parcel:recycle	()V
        //   76: return
        //   77: aconst_null
        //   78: astore_1
        //   79: goto -53 -> 26
        //   82: aload_3
        //   83: iconst_0
        //   84: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   87: goto -41 -> 46
        //   90: astore_1
        //   91: aload 4
        //   93: invokevirtual 62	android/os/Parcel:recycle	()V
        //   96: aload_3
        //   97: invokevirtual 62	android/os/Parcel:recycle	()V
        //   100: aload_1
        //   101: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	102	0	this	a
        //   0	102	1	paramf	f
        //   0	102	2	paramGoogleSignInOptions	GoogleSignInOptions
        //   3	94	3	localParcel1	Parcel
        //   7	85	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	90	finally
        //   19	26	90	finally
        //   26	31	90	finally
        //   35	46	90	finally
        //   46	67	90	finally
        //   82	87	90	finally
      }
      
      /* Error */
      public void c(f paramf, GoogleSignInOptions paramGoogleSignInOptions)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +61 -> 77
        //   19: aload_1
        //   20: invokeinterface 37 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_2
        //   32: ifnull +50 -> 82
        //   35: aload_3
        //   36: iconst_1
        //   37: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   40: aload_2
        //   41: aload_3
        //   42: iconst_0
        //   43: invokevirtual 50	com/google/android/gms/auth/api/signin/GoogleSignInOptions:writeToParcel	(Landroid/os/Parcel;I)V
        //   46: aload_0
        //   47: getfield 17	com/google/android/gms/auth/api/signin/internal/g$a$a:a	Landroid/os/IBinder;
        //   50: bipush 103
        //   52: aload_3
        //   53: aload 4
        //   55: iconst_0
        //   56: invokeinterface 56 5 0
        //   61: pop
        //   62: aload 4
        //   64: invokevirtual 59	android/os/Parcel:readException	()V
        //   67: aload 4
        //   69: invokevirtual 62	android/os/Parcel:recycle	()V
        //   72: aload_3
        //   73: invokevirtual 62	android/os/Parcel:recycle	()V
        //   76: return
        //   77: aconst_null
        //   78: astore_1
        //   79: goto -53 -> 26
        //   82: aload_3
        //   83: iconst_0
        //   84: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   87: goto -41 -> 46
        //   90: astore_1
        //   91: aload 4
        //   93: invokevirtual 62	android/os/Parcel:recycle	()V
        //   96: aload_3
        //   97: invokevirtual 62	android/os/Parcel:recycle	()V
        //   100: aload_1
        //   101: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	102	0	this	a
        //   0	102	1	paramf	f
        //   0	102	2	paramGoogleSignInOptions	GoogleSignInOptions
        //   3	94	3	localParcel1	Parcel
        //   7	85	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	90	finally
        //   19	26	90	finally
        //   26	31	90	finally
        //   35	46	90	finally
        //   46	67	90	finally
        //   82	87	90	finally
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */