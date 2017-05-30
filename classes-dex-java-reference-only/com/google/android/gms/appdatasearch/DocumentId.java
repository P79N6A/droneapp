package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DocumentId
  extends AbstractSafeParcelable
{
  public static final c CREATOR = new c();
  final int a;
  final String b;
  final String c;
  final String d;
  
  DocumentId(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
  }
  
  public DocumentId(String paramString1, String paramString2, String paramString3)
  {
    this(1, paramString1, paramString2, paramString3);
  }
  
  public String toString()
  {
    return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[] { this.b, this.c, this.d });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c localc = CREATOR;
    c.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appdatasearch/DocumentId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */