package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract interface f
  extends IInterface
{
  public abstract void a(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus);
  
  public abstract void a(Status paramStatus);
  
  public abstract void b(Status paramStatus);
  
  public static abstract class a
    extends Binder
    implements f
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }
    
    public static f a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof f))) {
        return (f)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        return true;
      case 101: 
        paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        GoogleSignInAccount localGoogleSignInAccount;
        if (paramParcel1.readInt() != 0)
        {
          localGoogleSignInAccount = (GoogleSignInAccount)GoogleSignInAccount.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label128;
          }
        }
        for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          a(localGoogleSignInAccount, paramParcel1);
          paramParcel2.writeNoException();
          return true;
          localGoogleSignInAccount = null;
          break;
        }
      case 102: 
        label128:
        paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          a(paramParcel1);
          paramParcel2.writeNoException();
          return true;
        }
      }
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        b(paramParcel1);
        paramParcel2.writeNoException();
        return true;
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
      
      public void a(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
            if (paramGoogleSignInAccount != null)
            {
              localParcel1.writeInt(1);
              paramGoogleSignInAccount.writeToParcel(localParcel1, 0);
              if (paramStatus != null)
              {
                localParcel1.writeInt(1);
                paramStatus.writeToParcel(localParcel1, 0);
                this.a.transact(101, localParcel1, localParcel2, 0);
                localParcel2.readException();
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            localParcel1.writeInt(0);
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      /* Error */
      public void a(Status paramStatus)
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
        //   18: aload_2
        //   19: iconst_1
        //   20: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   23: aload_1
        //   24: aload_2
        //   25: iconst_0
        //   26: invokevirtual 44	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
        //   29: aload_0
        //   30: getfield 17	com/google/android/gms/auth/api/signin/internal/f$a$a:a	Landroid/os/IBinder;
        //   33: bipush 102
        //   35: aload_2
        //   36: aload_3
        //   37: iconst_0
        //   38: invokeinterface 50 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 53	android/os/Parcel:readException	()V
        //   48: aload_3
        //   49: invokevirtual 56	android/os/Parcel:recycle	()V
        //   52: aload_2
        //   53: invokevirtual 56	android/os/Parcel:recycle	()V
        //   56: return
        //   57: aload_2
        //   58: iconst_0
        //   59: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   62: goto -33 -> 29
        //   65: astore_1
        //   66: aload_3
        //   67: invokevirtual 56	android/os/Parcel:recycle	()V
        //   70: aload_2
        //   71: invokevirtual 56	android/os/Parcel:recycle	()V
        //   74: aload_1
        //   75: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	76	0	this	a
        //   0	76	1	paramStatus	Status
        //   3	68	2	localParcel1	Parcel
        //   7	60	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	65	finally
        //   18	29	65	finally
        //   29	48	65	finally
        //   57	62	65	finally
      }
      
      public IBinder asBinder()
      {
        return this.a;
      }
      
      /* Error */
      public void b(Status paramStatus)
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
        //   18: aload_2
        //   19: iconst_1
        //   20: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   23: aload_1
        //   24: aload_2
        //   25: iconst_0
        //   26: invokevirtual 44	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
        //   29: aload_0
        //   30: getfield 17	com/google/android/gms/auth/api/signin/internal/f$a$a:a	Landroid/os/IBinder;
        //   33: bipush 103
        //   35: aload_2
        //   36: aload_3
        //   37: iconst_0
        //   38: invokeinterface 50 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 53	android/os/Parcel:readException	()V
        //   48: aload_3
        //   49: invokevirtual 56	android/os/Parcel:recycle	()V
        //   52: aload_2
        //   53: invokevirtual 56	android/os/Parcel:recycle	()V
        //   56: return
        //   57: aload_2
        //   58: iconst_0
        //   59: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   62: goto -33 -> 29
        //   65: astore_1
        //   66: aload_3
        //   67: invokevirtual 56	android/os/Parcel:recycle	()V
        //   70: aload_2
        //   71: invokevirtual 56	android/os/Parcel:recycle	()V
        //   74: aload_1
        //   75: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	76	0	this	a
        //   0	76	1	paramStatus	Status
        //   3	68	2	localParcel1	Parcel
        //   7	60	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	65	finally
        //   18	29	65	finally
        //   29	48	65	finally
        //   57	62	65	finally
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */