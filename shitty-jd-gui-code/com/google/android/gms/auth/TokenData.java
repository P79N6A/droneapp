package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class TokenData
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final k CREATOR = new k();
  final int a;
  private final String b;
  private final Long c;
  private final boolean d;
  private final boolean e;
  private final List<String> f;
  
  TokenData(int paramInt, String paramString, Long paramLong, boolean paramBoolean1, boolean paramBoolean2, List<String> paramList)
  {
    this.a = paramInt;
    this.b = d.a(paramString);
    this.c = paramLong;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.f = paramList;
  }
  
  @Nullable
  public static TokenData a(Bundle paramBundle, String paramString)
  {
    paramBundle.setClassLoader(TokenData.class.getClassLoader());
    paramBundle = paramBundle.getBundle(paramString);
    if (paramBundle == null) {
      return null;
    }
    paramBundle.setClassLoader(TokenData.class.getClassLoader());
    return (TokenData)paramBundle.getParcelable("TokenData");
  }
  
  public String a()
  {
    return this.b;
  }
  
  @Nullable
  public Long b()
  {
    return this.c;
  }
  
  public boolean c()
  {
    return this.d;
  }
  
  public boolean d()
  {
    return this.e;
  }
  
  @Nullable
  public List<String> e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof TokenData)) {}
    do
    {
      return false;
      paramObject = (TokenData)paramObject;
    } while ((!TextUtils.equals(this.b, ((TokenData)paramObject).b)) || (!c.a(this.c, ((TokenData)paramObject).c)) || (this.d != ((TokenData)paramObject).d) || (this.e != ((TokenData)paramObject).e) || (!c.a(this.f, ((TokenData)paramObject).f)));
    return true;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    k.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/TokenData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */