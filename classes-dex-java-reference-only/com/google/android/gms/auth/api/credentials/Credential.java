package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.internal.b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

public class Credential
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<Credential> CREATOR = new d();
  public static final String a = "com.google.android.gms.credentials.Credential";
  final int b;
  private final String c;
  @Nullable
  private final String d;
  @Nullable
  private final Uri e;
  private final List<IdToken> f;
  @Nullable
  private final String g;
  @Nullable
  private final String h;
  @Nullable
  private final String i;
  @Nullable
  private final String j;
  
  Credential(int paramInt, String paramString1, String paramString2, Uri paramUri, List<IdToken> paramList, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.b = paramInt;
    paramString1 = ((String)com.google.android.gms.common.internal.d.a(paramString1, "credential identifier cannot be null")).trim();
    com.google.android.gms.common.internal.d.a(paramString1, "credential identifier cannot be empty");
    this.c = paramString1;
    paramString1 = paramString2;
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (TextUtils.isEmpty(paramString2.trim())) {
        paramString1 = null;
      }
    }
    this.d = paramString1;
    this.e = paramUri;
    if (paramList == null) {}
    for (paramString1 = Collections.emptyList();; paramString1 = Collections.unmodifiableList(paramList))
    {
      this.f = paramString1;
      this.g = paramString3;
      if ((paramString3 == null) || (!paramString3.isEmpty())) {
        break;
      }
      throw new IllegalArgumentException("password cannot be empty");
    }
    if (!TextUtils.isEmpty(paramString4)) {
      b.a(paramString4);
    }
    this.h = paramString4;
    this.i = paramString5;
    this.j = paramString6;
    if ((!TextUtils.isEmpty(this.g)) && (!TextUtils.isEmpty(this.h))) {
      throw new IllegalStateException("password and accountType cannot both be set");
    }
  }
  
  public String a()
  {
    return this.c;
  }
  
  @Nullable
  public String b()
  {
    return this.d;
  }
  
  @Nullable
  public Uri c()
  {
    return this.e;
  }
  
  public List<IdToken> d()
  {
    return this.f;
  }
  
  @Nullable
  public String e()
  {
    return this.g;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof Credential)) {
        return false;
      }
      paramObject = (Credential)paramObject;
    } while ((TextUtils.equals(this.c, ((Credential)paramObject).c)) && (TextUtils.equals(this.d, ((Credential)paramObject).d)) && (c.a(this.e, ((Credential)paramObject).e)) && (TextUtils.equals(this.g, ((Credential)paramObject).g)) && (TextUtils.equals(this.h, ((Credential)paramObject).h)) && (TextUtils.equals(this.i, ((Credential)paramObject).i)));
    return false;
  }
  
  @Nullable
  public String f()
  {
    return this.i;
  }
  
  @Nullable
  public String g()
  {
    return this.h;
  }
  
  public String h()
  {
    return this.j;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.c, this.d, this.e, this.g, this.h, this.i });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
  
  public static class a
  {
    private final String a;
    private String b;
    private Uri c;
    private List<IdToken> d;
    private String e;
    private String f;
    private String g;
    private String h;
    
    public a(Credential paramCredential)
    {
      this.a = Credential.a(paramCredential);
      this.b = Credential.b(paramCredential);
      this.c = Credential.c(paramCredential);
      this.d = Credential.d(paramCredential);
      this.e = Credential.e(paramCredential);
      this.f = Credential.f(paramCredential);
      this.g = Credential.g(paramCredential);
      this.h = Credential.h(paramCredential);
    }
    
    public a(String paramString)
    {
      this.a = paramString;
    }
    
    public a a(Uri paramUri)
    {
      this.c = paramUri;
      return this;
    }
    
    public a a(String paramString)
    {
      this.b = paramString;
      return this;
    }
    
    public Credential a()
    {
      return new Credential(3, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
    
    public a b(String paramString)
    {
      this.e = paramString;
      return this;
    }
    
    public a c(String paramString)
    {
      this.f = paramString;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/Credential.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */