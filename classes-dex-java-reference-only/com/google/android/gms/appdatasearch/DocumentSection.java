package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DocumentSection
  extends AbstractSafeParcelable
{
  public static final d CREATOR = new d();
  public static final int a = Integer.parseInt("-1");
  private static final RegisterSectionInfo g = new RegisterSectionInfo.a("SsbContext").a(true).a("blob").a();
  final int b;
  public final String c;
  final RegisterSectionInfo d;
  public final int e;
  public final byte[] f;
  
  DocumentSection(int paramInt1, String paramString, RegisterSectionInfo paramRegisterSectionInfo, int paramInt2, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == a) || (h.a(paramInt2) != null)) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.android.gms.common.internal.d.b(bool, 32 + "Invalid section type " + paramInt2);
      this.b = paramInt1;
      this.c = paramString;
      this.d = paramRegisterSectionInfo;
      this.e = paramInt2;
      this.f = paramArrayOfByte;
      paramString = a();
      if (paramString == null) {
        break;
      }
      throw new IllegalArgumentException(paramString);
    }
  }
  
  public DocumentSection(String paramString, RegisterSectionInfo paramRegisterSectionInfo)
  {
    this(1, paramString, paramRegisterSectionInfo, a, null);
  }
  
  public DocumentSection(String paramString1, RegisterSectionInfo paramRegisterSectionInfo, String paramString2)
  {
    this(1, paramString1, paramRegisterSectionInfo, h.a(paramString2), null);
  }
  
  public DocumentSection(byte[] paramArrayOfByte, RegisterSectionInfo paramRegisterSectionInfo)
  {
    this(1, null, paramRegisterSectionInfo, a, paramArrayOfByte);
  }
  
  public static DocumentSection a(byte[] paramArrayOfByte)
  {
    return new DocumentSection(paramArrayOfByte, g);
  }
  
  public String a()
  {
    if ((this.e != a) && (h.a(this.e) == null))
    {
      int i = this.e;
      return 32 + "Invalid section type " + i;
    }
    if ((this.c != null) && (this.f != null)) {
      return "Both content and blobContent set";
    }
    return null;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d locald = CREATOR;
    d.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appdatasearch/DocumentSection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */