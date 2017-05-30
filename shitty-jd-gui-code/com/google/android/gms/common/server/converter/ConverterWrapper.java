package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.a;

public class ConverterWrapper
  extends AbstractSafeParcelable
{
  public static final a CREATOR = new a();
  private final int a;
  private final StringToIntConverter b;
  
  ConverterWrapper(int paramInt, StringToIntConverter paramStringToIntConverter)
  {
    this.a = paramInt;
    this.b = paramStringToIntConverter;
  }
  
  private ConverterWrapper(StringToIntConverter paramStringToIntConverter)
  {
    this.a = 1;
    this.b = paramStringToIntConverter;
  }
  
  public static ConverterWrapper a(FastJsonResponse.a<?, ?> parama)
  {
    if ((parama instanceof StringToIntConverter)) {
      return new ConverterWrapper((StringToIntConverter)parama);
    }
    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
  }
  
  int a()
  {
    return this.a;
  }
  
  StringToIntConverter b()
  {
    return this.b;
  }
  
  public FastJsonResponse.a<?, ?> c()
  {
    if (this.b != null) {
      return this.b;
    }
    throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a locala = CREATOR;
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/server/converter/ConverterWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */