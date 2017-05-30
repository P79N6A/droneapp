package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

@Deprecated
public final class AppMetadata
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<AppMetadata> CREATOR = new c();
  private final int a;
  private final List<AppIdentifier> b;
  
  AppMetadata(int paramInt, List<AppIdentifier> paramList)
  {
    this.a = paramInt;
    this.b = ((List)d.a(paramList, "Must specify application identifiers"));
    d.a(paramList.size(), "Application identifiers cannot be empty");
  }
  
  public int a()
  {
    return this.a;
  }
  
  public List<AppIdentifier> b()
  {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/nearby/connection/dev/AppMetadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */