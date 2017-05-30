package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.om;
import java.util.List;

public class CreateAuthUriResponse
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<CreateAuthUriResponse> CREATOR = new a();
  @gc
  public final int a;
  @om(a="authUri")
  private String b;
  @om(a="registered")
  private boolean c;
  @om(a="providerId")
  private String d;
  @om(a="forExistingProvider")
  private boolean e;
  @om(a="allProviders")
  private StringList f;
  
  public CreateAuthUriResponse()
  {
    this.a = 1;
    this.f = StringList.b();
  }
  
  CreateAuthUriResponse(int paramInt, String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, StringList paramStringList)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramBoolean1;
    this.d = paramString2;
    this.e = paramBoolean2;
    if (paramStringList == null) {}
    for (paramString1 = StringList.b();; paramString1 = StringList.a(paramStringList))
    {
      this.f = paramString1;
      return;
    }
  }
  
  @Nullable
  public String a()
  {
    return this.b;
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  @Nullable
  public String c()
  {
    return this.d;
  }
  
  public boolean d()
  {
    return this.e;
  }
  
  public StringList e()
  {
    return this.f;
  }
  
  @Nullable
  public List<String> f()
  {
    return this.f.a();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/auth/api/model/CreateAuthUriResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */