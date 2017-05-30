package com.google.android.gms.internal;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.ProviderUserInfo;
import com.google.firebase.auth.w;

public class gm
  implements w
{
  @om(a="userId")
  @NonNull
  private String a;
  @om(a="providerId")
  @NonNull
  private String b;
  @om(a="displayName")
  @Nullable
  private String c;
  @om(a="photoUrl")
  @Nullable
  private String d;
  @gc
  @Nullable
  private Uri e;
  @om(a="email")
  @Nullable
  private String f;
  @om(a="isEmailVerified")
  private boolean g;
  
  public gm(@NonNull GetAccountInfoUser paramGetAccountInfoUser, @NonNull String paramString)
  {
    d.a(paramGetAccountInfoUser);
    d.a(paramString);
    this.a = d.a(paramGetAccountInfoUser.c());
    this.b = paramString;
    this.f = paramGetAccountInfoUser.a();
    this.c = paramGetAccountInfoUser.d();
    paramString = paramGetAccountInfoUser.f();
    if (paramString != null)
    {
      this.d = paramString.toString();
      this.e = paramString;
    }
    this.g = paramGetAccountInfoUser.b();
  }
  
  public gm(@NonNull ProviderUserInfo paramProviderUserInfo)
  {
    d.a(paramProviderUserInfo);
    this.a = d.a(paramProviderUserInfo.a());
    this.b = d.a(paramProviderUserInfo.e());
    this.c = paramProviderUserInfo.b();
    paramProviderUserInfo = paramProviderUserInfo.d();
    if (paramProviderUserInfo != null)
    {
      this.d = paramProviderUserInfo.toString();
      this.e = paramProviderUserInfo;
    }
    this.f = null;
    this.g = false;
  }
  
  public gm(@NonNull w paramw)
  {
    d.a(paramw);
    this.a = d.a(paramw.a());
    this.b = d.a(paramw.b());
    this.c = paramw.c();
    if (paramw.d() != null)
    {
      this.e = paramw.d();
      this.d = paramw.d().toString();
    }
    this.f = paramw.e();
    this.g = paramw.f();
  }
  
  @NonNull
  public String a()
  {
    return this.a;
  }
  
  @NonNull
  public String b()
  {
    return this.b;
  }
  
  @Nullable
  public String c()
  {
    return this.c;
  }
  
  @Nullable
  public Uri d()
  {
    if ((!TextUtils.isEmpty(this.d)) && (this.e == null)) {
      this.e = Uri.parse(this.d);
    }
    return this.e;
  }
  
  @Nullable
  public String e()
  {
    return this.f;
  }
  
  public boolean f()
  {
    return this.g;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/gm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */