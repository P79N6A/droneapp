package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ActionImpl
  extends AbstractSafeParcelable
  implements com.google.firebase.appindexing.a
{
  public static final Parcelable.Creator<ActionImpl> CREATOR = new a();
  public final int a;
  private final String b;
  private final String c;
  private final String d;
  private final String e;
  private final MetadataImpl f;
  private final String g;
  
  ActionImpl(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, MetadataImpl paramMetadataImpl, String paramString5)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramMetadataImpl;
    this.g = paramString5;
  }
  
  public ActionImpl(@NonNull String paramString1, @NonNull String paramString2, @NonNull String paramString3, String paramString4, @NonNull MetadataImpl paramMetadataImpl, String paramString5)
  {
    this.a = 1;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramMetadataImpl;
    this.g = paramString5;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public String d()
  {
    return this.e;
  }
  
  public MetadataImpl e()
  {
    return this.f;
  }
  
  public String f()
  {
    return this.g;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ActionImpl { ");
    localStringBuilder.append("{ actionType: '").append(this.b).append("' } ");
    localStringBuilder.append("{ objectName: '").append(this.c).append("' } ");
    localStringBuilder.append("{ objectUrl: '").append(this.d).append("' } ");
    if (this.e != null) {
      localStringBuilder.append("{ objectSameAs: '").append(this.e).append("' } ");
    }
    if (this.f != null) {
      localStringBuilder.append("{ metadata: '").append(this.f.toString()).append("' } ");
    }
    if (this.g != null) {
      localStringBuilder.append("{ actionStatus: '").append(this.g).append("' } ");
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
  
  public static class MetadataImpl
    extends AbstractSafeParcelable
  {
    public static final Parcelable.Creator<MetadataImpl> CREATOR = new i();
    public final int a;
    private int b = 0;
    private final boolean c;
    private final String d;
    private final String e;
    private final byte[] f;
    private final boolean g;
    
    MetadataImpl(int paramInt1, int paramInt2, boolean paramBoolean1, String paramString1, String paramString2, byte[] paramArrayOfByte, boolean paramBoolean2)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = paramBoolean1;
      this.d = paramString1;
      this.e = paramString2;
      this.f = paramArrayOfByte;
      this.g = paramBoolean2;
    }
    
    public MetadataImpl(boolean paramBoolean1, String paramString1, String paramString2, byte[] paramArrayOfByte, boolean paramBoolean2)
    {
      this.a = 1;
      this.c = paramBoolean1;
      this.d = paramString1;
      this.e = paramString2;
      this.f = paramArrayOfByte;
      this.g = paramBoolean2;
    }
    
    public int a()
    {
      return this.b;
    }
    
    public void a(int paramInt)
    {
      this.b = paramInt;
    }
    
    public boolean b()
    {
      return this.c;
    }
    
    public String c()
    {
      return this.d;
    }
    
    public String d()
    {
      return this.e;
    }
    
    public byte[] e()
    {
      return this.f;
    }
    
    public boolean f()
    {
      return this.g;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("MetadataImpl { ");
      localStringBuilder.append("{ eventStatus: '").append(this.b).append("' } ");
      localStringBuilder.append("{ uploadable: '").append(this.c).append("' } ");
      if (this.d != null) {
        localStringBuilder.append("{ completionToken: '").append(this.d).append("' } ");
      }
      if (this.e != null) {
        localStringBuilder.append("{ accountName: '").append(this.e).append("' } ");
      }
      if (this.f != null)
      {
        localStringBuilder.append("{ ssbContext: [ ");
        byte[] arrayOfByte = this.f;
        int j = arrayOfByte.length;
        int i = 0;
        while (i < j)
        {
          int k = arrayOfByte[i];
          localStringBuilder.append("0x").append(Integer.toHexString(k)).append(" ");
          i += 1;
        }
        localStringBuilder.append("] } ");
      }
      localStringBuilder.append("{ contextOnly: '").append(this.g).append("' } ");
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      i.a(this, paramParcel, paramInt);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/appindexing/internal/ActionImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */