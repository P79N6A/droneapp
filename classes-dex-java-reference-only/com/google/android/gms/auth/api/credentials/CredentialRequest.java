package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CredentialRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<CredentialRequest> CREATOR = new f();
  final int a;
  private final boolean b;
  private final String[] c;
  private final CredentialPickerConfig d;
  private final CredentialPickerConfig e;
  
  CredentialRequest(int paramInt, boolean paramBoolean, String[] paramArrayOfString, CredentialPickerConfig paramCredentialPickerConfig1, CredentialPickerConfig paramCredentialPickerConfig2)
  {
    this.a = paramInt;
    this.b = paramBoolean;
    this.c = ((String[])d.a(paramArrayOfString));
    paramArrayOfString = paramCredentialPickerConfig1;
    if (paramCredentialPickerConfig1 == null) {
      paramArrayOfString = new CredentialPickerConfig.a().a();
    }
    this.d = paramArrayOfString;
    paramArrayOfString = paramCredentialPickerConfig2;
    if (paramCredentialPickerConfig2 == null) {
      paramArrayOfString = new CredentialPickerConfig.a().a();
    }
    this.e = paramArrayOfString;
  }
  
  private CredentialRequest(a parama)
  {
    this(2, a.a(parama), a.b(parama), a.c(parama), a.d(parama));
  }
  
  @Deprecated
  public boolean a()
  {
    return b();
  }
  
  public boolean b()
  {
    return this.b;
  }
  
  @NonNull
  public String[] c()
  {
    return this.c;
  }
  
  @NonNull
  public CredentialPickerConfig d()
  {
    return this.d;
  }
  
  @NonNull
  public CredentialPickerConfig e()
  {
    return this.e;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
  
  public static final class a
  {
    private boolean a;
    private String[] b;
    private CredentialPickerConfig c;
    private CredentialPickerConfig d;
    
    public a a(CredentialPickerConfig paramCredentialPickerConfig)
    {
      this.c = paramCredentialPickerConfig;
      return this;
    }
    
    @Deprecated
    public a a(boolean paramBoolean)
    {
      return b(paramBoolean);
    }
    
    public a a(String... paramVarArgs)
    {
      String[] arrayOfString = paramVarArgs;
      if (paramVarArgs == null) {
        arrayOfString = new String[0];
      }
      this.b = arrayOfString;
      return this;
    }
    
    public CredentialRequest a()
    {
      if (this.b == null) {
        this.b = new String[0];
      }
      if ((!this.a) && (this.b.length == 0)) {
        throw new IllegalStateException("At least one authentication method must be specified");
      }
      return new CredentialRequest(this, null);
    }
    
    public a b(CredentialPickerConfig paramCredentialPickerConfig)
    {
      this.d = paramCredentialPickerConfig;
      return this;
    }
    
    public a b(boolean paramBoolean)
    {
      this.a = paramBoolean;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/CredentialRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */