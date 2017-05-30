package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.om;

public class GetTokenResponse
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<GetTokenResponse> CREATOR = new d();
  @gc
  public final int a;
  @om(a="refresh_token")
  private String b;
  @om(a="access_token")
  private String c;
  @om(a="expires_in")
  private Long d;
  @om(a="token_type")
  private String e;
  @om(a="issued_at")
  private Long f;
  
  public GetTokenResponse()
  {
    this.a = 1;
    this.f = Long.valueOf(System.currentTimeMillis());
  }
  
  GetTokenResponse(int paramInt, String paramString1, String paramString2, Long paramLong1, String paramString3, Long paramLong2)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramLong1;
    this.e = paramString3;
    this.f = paramLong2;
  }
  
  public void a(@NonNull String paramString)
  {
    this.b = com.google.android.gms.common.internal.d.a(paramString);
  }
  
  public boolean a()
  {
    long l1 = this.f.longValue();
    long l2 = this.d.longValue();
    return h.d().a() + 300000L < l1 + l2 * 1000L;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public long d()
  {
    if (this.d == null) {
      return 0L;
    }
    return this.d.longValue();
  }
  
  @Nullable
  public String e()
  {
    return this.e;
  }
  
  public long f()
  {
    return this.f.longValue();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/auth/api/model/GetTokenResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */