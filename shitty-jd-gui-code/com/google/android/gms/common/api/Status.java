package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.c.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class Status
  extends AbstractSafeParcelable
  implements m, ReflectedParcelable
{
  public static final Parcelable.Creator<Status> CREATOR = new y();
  public static final Status a = new Status(0);
  public static final Status b = new Status(14);
  public static final Status c = new Status(8);
  public static final Status d = new Status(15);
  public static final Status e = new Status(16);
  public static final Status f = new Status(17);
  public static final Status g = new Status(18);
  private final int h;
  private final int i;
  private final String j;
  private final PendingIntent k;
  
  public Status(int paramInt)
  {
    this(paramInt, null);
  }
  
  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this.h = paramInt1;
    this.i = paramInt2;
    this.j = paramString;
    this.k = paramPendingIntent;
  }
  
  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }
  
  public Status(int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramString, paramPendingIntent);
  }
  
  private String k()
  {
    if (this.j != null) {
      return this.j;
    }
    return f.b(this.i);
  }
  
  public Status a()
  {
    return this;
  }
  
  public void a(Activity paramActivity, int paramInt)
  {
    if (!e()) {
      return;
    }
    paramActivity.startIntentSenderForResult(this.k.getIntentSender(), paramInt, null, 0, 0, 0);
  }
  
  PendingIntent b()
  {
    return this.k;
  }
  
  @Nullable
  public String c()
  {
    return this.j;
  }
  
  int d()
  {
    return this.h;
  }
  
  public boolean e()
  {
    return this.k != null;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Status)) {}
    do
    {
      return false;
      paramObject = (Status)paramObject;
    } while ((this.h != ((Status)paramObject).h) || (this.i != ((Status)paramObject).i) || (!c.a(this.j, ((Status)paramObject).j)) || (!c.a(this.k, ((Status)paramObject).k)));
    return true;
  }
  
  public boolean f()
  {
    return this.i <= 0;
  }
  
  public boolean g()
  {
    return this.i == 16;
  }
  
  public boolean h()
  {
    return this.i == 14;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k });
  }
  
  public int i()
  {
    return this.i;
  }
  
  public PendingIntent j()
  {
    return this.k;
  }
  
  public String toString()
  {
    return c.a(this).a("statusCode", k()).a("resolution", this.k).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    y.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/Status.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */