package c.a;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract interface a
  extends IInterface
{
  public abstract Bundle a(Account paramAccount, Bundle paramBundle);
  
  public abstract Bundle b(Account paramAccount, Bundle paramBundle);
  
  public abstract Bundle c(Account paramAccount, Bundle paramBundle);
  
  public abstract void d(Account paramAccount, Bundle paramBundle);
  
  public static abstract class a
    extends Binder
    implements a
  {
    static final int a = 1;
    static final int b = 2;
    static final int c = 3;
    static final int d = 4;
    private static final String e = "miui.net.IXiaomiAuthService";
    
    public a()
    {
      attachInterface(this, "miui.net.IXiaomiAuthService");
    }
    
    public static a a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("miui.net.IXiaomiAuthService");
      if ((localIInterface != null) && ((localIInterface instanceof a))) {
        return (a)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      Account localAccount;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("miui.net.IXiaomiAuthService");
        return true;
      case 1: 
        paramParcel1.enforceInterface("miui.net.IXiaomiAuthService");
        if (paramParcel1.readInt() != 0)
        {
          localAccount = (Account)Account.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label152;
          }
          paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          paramParcel1 = a(localAccount, paramParcel1);
          paramParcel2.writeNoException();
          if (paramParcel1 == null) {
            break label157;
          }
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          return true;
          localAccount = null;
          break;
          paramParcel1 = null;
          break label117;
          paramParcel2.writeInt(0);
        }
      case 2: 
        paramParcel1.enforceInterface("miui.net.IXiaomiAuthService");
        if (paramParcel1.readInt() != 0)
        {
          localAccount = (Account)Account.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label247;
          }
          paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          paramParcel1 = b(localAccount, paramParcel1);
          paramParcel2.writeNoException();
          if (paramParcel1 == null) {
            break label252;
          }
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          return true;
          localAccount = null;
          break;
          paramParcel1 = null;
          break label212;
          paramParcel2.writeInt(0);
        }
      case 3: 
        label117:
        label152:
        label157:
        label212:
        label247:
        label252:
        paramParcel1.enforceInterface("miui.net.IXiaomiAuthService");
        if (paramParcel1.readInt() != 0)
        {
          localAccount = (Account)Account.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label342;
          }
          paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          label307:
          paramParcel1 = c(localAccount, paramParcel1);
          paramParcel2.writeNoException();
          if (paramParcel1 == null) {
            break label347;
          }
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          return true;
          localAccount = null;
          break;
          label342:
          paramParcel1 = null;
          break label307;
          label347:
          paramParcel2.writeInt(0);
        }
      }
      paramParcel1.enforceInterface("miui.net.IXiaomiAuthService");
      if (paramParcel1.readInt() != 0)
      {
        localAccount = (Account)Account.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label421;
        }
      }
      label421:
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        d(localAccount, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localAccount = null;
        break;
      }
    }
    
    private static class a
      implements a
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        this.a = paramIBinder;
      }
      
      public Bundle a(Account paramAccount, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("miui.net.IXiaomiAuthService");
            if (paramAccount != null)
            {
              localParcel1.writeInt(1);
              paramAccount.writeToParcel(localParcel1, 0);
              if (paramBundle != null)
              {
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                this.a.transact(1, localParcel1, localParcel2, 0);
                localParcel2.readException();
                if (localParcel2.readInt() == 0) {
                  break label126;
                }
                paramAccount = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
                return paramAccount;
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
          continue;
          label126:
          paramAccount = null;
        }
      }
      
      public String a()
      {
        return "miui.net.IXiaomiAuthService";
      }
      
      public IBinder asBinder()
      {
        return this.a;
      }
      
      public Bundle b(Account paramAccount, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("miui.net.IXiaomiAuthService");
            if (paramAccount != null)
            {
              localParcel1.writeInt(1);
              paramAccount.writeToParcel(localParcel1, 0);
              if (paramBundle != null)
              {
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                this.a.transact(2, localParcel1, localParcel2, 0);
                localParcel2.readException();
                if (localParcel2.readInt() == 0) {
                  break label126;
                }
                paramAccount = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
                return paramAccount;
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
          continue;
          label126:
          paramAccount = null;
        }
      }
      
      public Bundle c(Account paramAccount, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("miui.net.IXiaomiAuthService");
            if (paramAccount != null)
            {
              localParcel1.writeInt(1);
              paramAccount.writeToParcel(localParcel1, 0);
              if (paramBundle != null)
              {
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                this.a.transact(3, localParcel1, localParcel2, 0);
                localParcel2.readException();
                if (localParcel2.readInt() == 0) {
                  break label126;
                }
                paramAccount = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
                return paramAccount;
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
          continue;
          label126:
          paramAccount = null;
        }
      }
      
      public void d(Account paramAccount, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("miui.net.IXiaomiAuthService");
            if (paramAccount != null)
            {
              localParcel1.writeInt(1);
              paramAccount.writeToParcel(localParcel1, 0);
              if (paramBundle != null)
              {
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                this.a.transact(4, localParcel1, localParcel2, 0);
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
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */