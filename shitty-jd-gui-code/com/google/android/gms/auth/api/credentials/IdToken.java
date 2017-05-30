package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.internal.b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class IdToken
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<IdToken> CREATOR = new h();
  final int a;
  @NonNull
  private final String b;
  @NonNull
  private final String c;
  
  IdToken(int paramInt, @NonNull String paramString1, @NonNull String paramString2)
  {
    b.a(paramString1);
    if (!TextUtils.isEmpty(paramString2)) {}
    for (boolean bool = true;; bool = false)
    {
      d.b(bool, "id token string cannot be null or empty");
      this.a = paramInt;
      this.b = paramString1;
      this.c = paramString2;
      return;
    }
  }
  
  public IdToken(@NonNull String paramString1, @NonNull String paramString2)
  {
    this(1, paramString1, paramString2);
  }
  
  @NonNull
  public String a()
  {
    return this.b;
  }
  
  @NonNull
  public String b()
  {
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/IdToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */