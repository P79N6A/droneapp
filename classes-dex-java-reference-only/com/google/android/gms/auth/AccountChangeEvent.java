package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AccountChangeEvent
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new f();
  final int a;
  final long b;
  final String c;
  final int d;
  final int e;
  final String f;
  
  AccountChangeEvent(int paramInt1, long paramLong, String paramString1, int paramInt2, int paramInt3, String paramString2)
  {
    this.a = paramInt1;
    this.b = paramLong;
    this.c = ((String)d.a(paramString1));
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramString2;
  }
  
  public AccountChangeEvent(long paramLong, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    this.a = 1;
    this.b = paramLong;
    this.c = ((String)d.a(paramString1));
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramString2;
  }
  
  public String a()
  {
    return this.c;
  }
  
  public int b()
  {
    return this.d;
  }
  
  public int c()
  {
    return this.e;
  }
  
  public String d()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof AccountChangeEvent)) {
        break;
      }
      paramObject = (AccountChangeEvent)paramObject;
    } while ((this.a == ((AccountChangeEvent)paramObject).a) && (this.b == ((AccountChangeEvent)paramObject).b) && (c.a(this.c, ((AccountChangeEvent)paramObject).c)) && (this.d == ((AccountChangeEvent)paramObject).d) && (this.e == ((AccountChangeEvent)paramObject).e) && (c.a(this.f, ((AccountChangeEvent)paramObject).f)));
    return false;
    return false;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f });
  }
  
  public String toString()
  {
    String str1 = "UNKNOWN";
    switch (this.d)
    {
    }
    for (;;)
    {
      String str2 = this.c;
      String str3 = this.f;
      int i = this.e;
      return String.valueOf(str2).length() + 91 + String.valueOf(str1).length() + String.valueOf(str3).length() + "AccountChangeEvent {accountName = " + str2 + ", changeType = " + str1 + ", changeData = " + str3 + ", eventIndex = " + i + "}";
      str1 = "ADDED";
      continue;
      str1 = "REMOVED";
      continue;
      str1 = "RENAMED_TO";
      continue;
      str1 = "RENAMED_FROM";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/AccountChangeEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */