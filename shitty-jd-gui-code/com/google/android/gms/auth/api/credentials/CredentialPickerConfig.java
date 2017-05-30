package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CredentialPickerConfig
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new e();
  final int a;
  private final boolean b;
  private final boolean c;
  @Deprecated
  private final boolean d;
  private final int e;
  
  CredentialPickerConfig(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    if (paramInt1 < 2)
    {
      this.d = paramBoolean3;
      if (paramBoolean3) {}
      for (paramInt1 = i;; paramInt1 = 1)
      {
        this.e = paramInt1;
        return;
      }
    }
    if (paramInt2 == 3) {}
    for (paramBoolean1 = bool;; paramBoolean1 = false)
    {
      this.d = paramBoolean1;
      this.e = paramInt2;
      return;
    }
  }
  
  private CredentialPickerConfig(a parama)
  {
    this(2, a.a(parama), a.b(parama), false, a.c(parama));
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  @Deprecated
  public boolean c()
  {
    return this.e == 3;
  }
  
  int d()
  {
    return this.e;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel, paramInt);
  }
  
  public static class a
  {
    private boolean a = false;
    private boolean b = true;
    private int c = 1;
    
    public a a(int paramInt)
    {
      this.c = paramInt;
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      this.a = paramBoolean;
      return this;
    }
    
    public CredentialPickerConfig a()
    {
      return new CredentialPickerConfig(this, null);
    }
    
    public a b(boolean paramBoolean)
    {
      this.b = paramBoolean;
      return this;
    }
    
    @Deprecated
    public a c(boolean paramBoolean)
    {
      if (paramBoolean) {}
      for (int i = 3;; i = 1)
      {
        this.c = i;
        return this;
      }
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface b
  {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/CredentialPickerConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */