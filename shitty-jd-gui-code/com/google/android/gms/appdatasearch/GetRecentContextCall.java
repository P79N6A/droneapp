package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class GetRecentContextCall
{
  public static class Request
    extends AbstractSafeParcelable
  {
    public static final f CREATOR = new f();
    final int a;
    public final Account b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    
    public Request()
    {
      this(null, false, false, false, null);
    }
    
    Request(int paramInt, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString)
    {
      this.a = paramInt;
      this.b = paramAccount;
      this.c = paramBoolean1;
      this.d = paramBoolean2;
      this.e = paramBoolean3;
      this.f = paramString;
    }
    
    public Request(Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString)
    {
      this(1, paramAccount, paramBoolean1, paramBoolean2, paramBoolean3, paramString);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      f localf = CREATOR;
      f.a(this, paramParcel, paramInt);
    }
  }
  
  public static class Response
    extends AbstractSafeParcelable
    implements m
  {
    public static final g CREATOR = new g();
    public Status a;
    public List<UsageInfo> b;
    @Deprecated
    public String[] c;
    final int d;
    
    public Response()
    {
      this.d = 1;
    }
    
    Response(int paramInt, Status paramStatus, List<UsageInfo> paramList, String[] paramArrayOfString)
    {
      this.d = paramInt;
      this.a = paramStatus;
      this.b = paramList;
      this.c = paramArrayOfString;
    }
    
    public Status a()
    {
      return this.a;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      g localg = CREATOR;
      g.a(this, paramParcel, paramInt);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appdatasearch/GetRecentContextCall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */