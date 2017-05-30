package com.google.firebase.auth.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.om;
import java.util.List;

public class GetAccountInfoUser
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<GetAccountInfoUser> CREATOR = new b();
  @gc
  public final int a;
  @om(a="localId")
  private String b;
  @om(a="email")
  private String c;
  @om(a="emailVerified")
  private boolean d;
  @om(a="displayName")
  private String e;
  @om(a="photoUrl")
  private String f;
  @om(a="providerUserInfo")
  private ProviderUserInfoList g;
  @om(a="passwordHash")
  private String h;
  
  public GetAccountInfoUser()
  {
    this.a = 1;
    this.g = new ProviderUserInfoList();
  }
  
  GetAccountInfoUser(int paramInt, String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4, ProviderUserInfoList paramProviderUserInfoList, String paramString5)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean;
    this.e = paramString3;
    this.f = paramString4;
    if (paramProviderUserInfoList == null) {}
    for (paramString1 = ProviderUserInfoList.b();; paramString1 = ProviderUserInfoList.a(paramProviderUserInfoList))
    {
      this.g = paramString1;
      this.h = paramString5;
      return;
    }
  }
  
  @Nullable
  public String a()
  {
    return this.c;
  }
  
  public boolean b()
  {
    return this.d;
  }
  
  @NonNull
  public String c()
  {
    return this.b;
  }
  
  @Nullable
  public String d()
  {
    return this.e;
  }
  
  @Nullable
  public String e()
  {
    return this.f;
  }
  
  @Nullable
  public Uri f()
  {
    if (!TextUtils.isEmpty(this.f)) {
      return Uri.parse(this.f);
    }
    return null;
  }
  
  @Nullable
  public String g()
  {
    return this.h;
  }
  
  @NonNull
  public List<ProviderUserInfo> h()
  {
    return this.g.a();
  }
  
  public ProviderUserInfoList i()
  {
    return this.g;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/auth/api/model/GetAccountInfoUser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */