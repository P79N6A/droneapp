package com.google.android.gms.auth.a;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract interface c
  extends IInterface
{
  public abstract void a(Account paramAccount);
  
  public abstract void a(boolean paramBoolean);
  
  public static abstract class a
    extends Binder
    implements c
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.auth.account.IWorkAccountCallback");
    }
    
    public static c a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountCallback");
      if ((localIInterface != null) && ((localIInterface instanceof c))) {
        return (c)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.auth.account.IWorkAccountCallback");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.auth.account.IWorkAccountCallback");
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel1 = (Account)Account.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          a(paramParcel1);
          return true;
        }
      }
      paramParcel1.enforceInterface("com.google.android.gms.auth.account.IWorkAccountCallback");
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        a(bool);
        return true;
      }
    }
    
    private static class a
      implements c
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        this.a = paramIBinder;
      }
      
      /* Error */
      public void a(Account paramAccount)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: aload_2
        //   5: ldc 27
        //   7: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   10: aload_1
        //   11: ifnull +33 -> 44
        //   14: aload_2
        //   15: iconst_1
        //   16: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   19: aload_1
        //   20: aload_2
        //   21: iconst_0
        //   22: invokevirtual 41	android/accounts/Account:writeToParcel	(Landroid/os/Parcel;I)V
        //   25: aload_0
        //   26: getfield 17	com/google/android/gms/auth/a/c$a$a:a	Landroid/os/IBinder;
        //   29: iconst_1
        //   30: aload_2
        //   31: aconst_null
        //   32: iconst_1
        //   33: invokeinterface 47 5 0
        //   38: pop
        //   39: aload_2
        //   40: invokevirtual 50	android/os/Parcel:recycle	()V
        //   43: return
        //   44: aload_2
        //   45: iconst_0
        //   46: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   49: goto -24 -> 25
        //   52: astore_1
        //   53: aload_2
        //   54: invokevirtual 50	android/os/Parcel:recycle	()V
        //   57: aload_1
        //   58: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	59	0	this	a
        //   0	59	1	paramAccount	Account
        //   3	51	2	localParcel	Parcel
        // Exception table:
        //   from	to	target	type
        //   4	10	52	finally
        //   14	25	52	finally
        //   25	39	52	finally
        //   44	49	52	finally
      }
      
      /* Error */
      public void a(boolean paramBoolean)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore_2
        //   2: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   5: astore_3
        //   6: aload_3
        //   7: ldc 27
        //   9: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   12: iload_1
        //   13: ifeq +27 -> 40
        //   16: aload_3
        //   17: iload_2
        //   18: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   21: aload_0
        //   22: getfield 17	com/google/android/gms/auth/a/c$a$a:a	Landroid/os/IBinder;
        //   25: iconst_2
        //   26: aload_3
        //   27: aconst_null
        //   28: iconst_1
        //   29: invokeinterface 47 5 0
        //   34: pop
        //   35: aload_3
        //   36: invokevirtual 50	android/os/Parcel:recycle	()V
        //   39: return
        //   40: iconst_0
        //   41: istore_2
        //   42: goto -26 -> 16
        //   45: astore 4
        //   47: aload_3
        //   48: invokevirtual 50	android/os/Parcel:recycle	()V
        //   51: aload 4
        //   53: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	54	0	this	a
        //   0	54	1	paramBoolean	boolean
        //   1	41	2	i	int
        //   5	43	3	localParcel	Parcel
        //   45	7	4	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   6	12	45	finally
        //   16	35	45	finally
      }
      
      public IBinder asBinder()
      {
        return this.a;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */