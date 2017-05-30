package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class HintRequest
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<HintRequest> CREATOR = new g();
  final int a;
  private final CredentialPickerConfig b;
  private final boolean c;
  private final boolean d;
  private final String[] e;
  
  HintRequest(int paramInt, CredentialPickerConfig paramCredentialPickerConfig, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString)
  {
    this.a = paramInt;
    this.b = ((CredentialPickerConfig)d.a(paramCredentialPickerConfig));
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = ((String[])d.a(paramArrayOfString));
  }
  
  private HintRequest(a parama)
  {
    this(1, a.a(parama), a.b(parama), a.c(parama), a.d(parama));
  }
  
  @NonNull
  public CredentialPickerConfig a()
  {
    return this.b;
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  public boolean c()
  {
    return this.d;
  }
  
  @NonNull
  public String[] d()
  {
    return this.e;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
  
  public static final class a
  {
    private boolean a;
    private boolean b;
    private String[] c;
    private CredentialPickerConfig d = new CredentialPickerConfig.a().a();
    
    public a a(@NonNull CredentialPickerConfig paramCredentialPickerConfig)
    {
      this.d = ((CredentialPickerConfig)d.a(paramCredentialPickerConfig));
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      this.a = paramBoolean;
      return this;
    }
    
    public a a(String... paramVarArgs)
    {
      String[] arrayOfString = paramVarArgs;
      if (paramVarArgs == null) {
        arrayOfString = new String[0];
      }
      this.c = arrayOfString;
      return this;
    }
    
    public HintRequest a()
    {
      if (this.c == null) {
        this.c = new String[0];
      }
      if ((!this.a) && (!this.b) && (this.c.length == 0)) {
        throw new IllegalStateException("At least one authentication method must be specified");
      }
      return new HintRequest(this, null);
    }
    
    public a b(boolean paramBoolean)
    {
      this.b = paramBoolean;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/HintRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */