package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.om;

public class VerifyAssertionRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<VerifyAssertionRequest> CREATOR = new h();
  @gc
  public final int a;
  @om(a="requestUri")
  private String b;
  @om(a="idToken")
  private String c;
  @gc
  private String d;
  @gc
  private String e;
  @gc
  private String f;
  @gc
  @Nullable
  private String g;
  @om(a="postBody")
  private String h;
  @om(a="oauthTokenSecret")
  private String i;
  @om(a="returnSecureToken")
  private boolean j;
  
  public VerifyAssertionRequest()
  {
    this.a = 2;
    this.j = true;
  }
  
  VerifyAssertionRequest(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramString5;
    this.g = paramString6;
    this.h = paramString7;
    this.i = paramString8;
    this.j = paramBoolean;
  }
  
  public VerifyAssertionRequest(@Nullable String paramString1, @Nullable String paramString2, String paramString3, @Nullable String paramString4, @Nullable String paramString5)
  {
    this.a = 2;
    this.b = "http://localhost";
    this.d = paramString1;
    this.e = paramString2;
    this.i = paramString5;
    this.j = true;
    if ((TextUtils.isEmpty(this.d)) && (TextUtils.isEmpty(this.e))) {
      throw new IllegalArgumentException("Both idToken, and accessToken cannot be null");
    }
    this.f = d.a(paramString3);
    this.g = paramString4;
    paramString1 = new StringBuilder();
    if (!TextUtils.isEmpty(this.d)) {
      paramString1.append("id_token").append("=").append(this.d).append("&");
    }
    if (!TextUtils.isEmpty(this.e)) {
      paramString1.append("access_token").append("=").append(this.e).append("&");
    }
    if (!TextUtils.isEmpty(this.g)) {
      paramString1.append("identifier").append("=").append(this.g).append("&");
    }
    if (!TextUtils.isEmpty(this.i)) {
      paramString1.append("oauth_token_secret").append("=").append(this.i).append("&");
    }
    paramString1.append("providerId").append("=").append(this.f);
    this.h = paramString1.toString();
  }
  
  public String a()
  {
    return this.b;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public String d()
  {
    return this.e;
  }
  
  public String e()
  {
    return this.f;
  }
  
  public String f()
  {
    return this.i;
  }
  
  public boolean g()
  {
    return this.j;
  }
  
  @Nullable
  public String h()
  {
    return this.g;
  }
  
  public String i()
  {
    return this.h;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/auth/api/model/VerifyAssertionRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */