package com.google.firebase.auth.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.om;

public class ProviderUserInfo
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ProviderUserInfo> CREATOR = new e();
  @gc
  public final int a;
  @om(a="federatedId")
  private String b;
  @om(a="displayName")
  private String c;
  @om(a="photoUrl")
  private String d;
  @om(a="providerId")
  private String e;
  
  public ProviderUserInfo()
  {
    this.a = 1;
  }
  
  ProviderUserInfo(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
  }
  
  public String a()
  {
    return this.b;
  }
  
  @Nullable
  public String b()
  {
    return this.c;
  }
  
  @Nullable
  public String c()
  {
    return this.d;
  }
  
  @Nullable
  public Uri d()
  {
    if (!TextUtils.isEmpty(this.d)) {
      return Uri.parse(this.d);
    }
    return null;
  }
  
  public String e()
  {
    return this.e;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/auth/api/model/ProviderUserInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */