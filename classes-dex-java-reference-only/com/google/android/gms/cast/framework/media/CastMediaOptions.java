package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

public class CastMediaOptions
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<CastMediaOptions> CREATOR = new d();
  private static final m a = new m("CastMediaOptions");
  private final int b;
  private final String c;
  private final String d;
  private final e e;
  private final NotificationOptions f;
  
  CastMediaOptions(int paramInt, String paramString1, String paramString2, IBinder paramIBinder, NotificationOptions paramNotificationOptions)
  {
    this.b = paramInt;
    this.c = paramString1;
    this.d = paramString2;
    this.e = e.a.a(paramIBinder);
    this.f = paramNotificationOptions;
  }
  
  int a()
  {
    return this.b;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public NotificationOptions c()
  {
    return this.f;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public a e()
  {
    if (this.e != null) {
      try
      {
        a locala = (a)com.google.android.gms.c.f.a(this.e.b());
        return locala;
      }
      catch (RemoteException localRemoteException)
      {
        a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "getWrappedClientObject", e.class.getSimpleName() });
      }
    }
    return null;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof CastMediaOptions)) {
        return false;
      }
      paramObject = (CastMediaOptions)paramObject;
    } while ((com.google.android.gms.cast.internal.f.a(this.c, ((CastMediaOptions)paramObject).b())) && (com.google.android.gms.cast.internal.f.a(this.d, ((CastMediaOptions)paramObject).d)) && (com.google.android.gms.cast.internal.f.a(this.f, ((CastMediaOptions)paramObject).f)));
    return false;
  }
  
  public IBinder f()
  {
    if (this.e == null) {
      return null;
    }
    return this.e.asBinder();
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.c, this.d, this.f });
  }
  
  public String toString()
  {
    return String.format(Locale.ROOT, "CastMediaOptions(mediaIntentReceiverClassName=%s, expandedControllerActivityClassName=%s, notificationOptions=%s)", new Object[] { this.c, this.d, this.f });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
  
  public static final class a
  {
    private String a = MediaIntentReceiver.class.getName();
    private String b;
    private a c;
    private NotificationOptions d = new NotificationOptions.a().a();
    
    public a a(NotificationOptions paramNotificationOptions)
    {
      this.d = paramNotificationOptions;
      return this;
    }
    
    public a a(a parama)
    {
      this.c = parama;
      return this;
    }
    
    public a a(String paramString)
    {
      this.a = paramString;
      return this;
    }
    
    public CastMediaOptions a()
    {
      if (this.c == null) {}
      for (IBinder localIBinder = null;; localIBinder = this.c.a().asBinder()) {
        return new CastMediaOptions(1, this.a, this.b, localIBinder, this.d);
      }
    }
    
    public a b(String paramString)
    {
      this.b = paramString;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/CastMediaOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */