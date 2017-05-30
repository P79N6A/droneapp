package com.google.android.gms.iid;

import android.annotation.TargetApi;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MessengerCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MessengerCompat> CREATOR = new Parcelable.Creator()
  {
    public MessengerCompat a(Parcel paramAnonymousParcel)
    {
      paramAnonymousParcel = paramAnonymousParcel.readStrongBinder();
      if (paramAnonymousParcel != null) {
        return new MessengerCompat(paramAnonymousParcel);
      }
      return null;
    }
    
    public MessengerCompat[] a(int paramAnonymousInt)
    {
      return new MessengerCompat[paramAnonymousInt];
    }
  };
  Messenger a;
  c b;
  
  public MessengerCompat(Handler paramHandler)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.a = new Messenger(paramHandler);
      return;
    }
    this.b = new a(paramHandler);
  }
  
  public MessengerCompat(IBinder paramIBinder)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.a = new Messenger(paramIBinder);
      return;
    }
    this.b = c.a.a(paramIBinder);
  }
  
  public static int a(Message paramMessage)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return c(paramMessage);
    }
    return paramMessage.arg2;
  }
  
  @TargetApi(21)
  private static int c(Message paramMessage)
  {
    return paramMessage.sendingUid;
  }
  
  public IBinder a()
  {
    if (this.a != null) {
      return this.a.getBinder();
    }
    return this.b.asBinder();
  }
  
  public void b(Message paramMessage)
  {
    if (this.a != null)
    {
      this.a.send(paramMessage);
      return;
    }
    this.b.a(paramMessage);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    try
    {
      boolean bool = a().equals(((MessengerCompat)paramObject).a());
      return bool;
    }
    catch (ClassCastException paramObject) {}
    return false;
  }
  
  public int hashCode()
  {
    return a().hashCode();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.a != null)
    {
      paramParcel.writeStrongBinder(this.a.getBinder());
      return;
    }
    paramParcel.writeStrongBinder(this.b.asBinder());
  }
  
  private final class a
    extends c.a
  {
    Handler a;
    
    a(Handler paramHandler)
    {
      this.a = paramHandler;
    }
    
    public void a(Message paramMessage)
    {
      paramMessage.arg2 = Binder.getCallingUid();
      this.a.dispatchMessage(paramMessage);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/iid/MessengerCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */