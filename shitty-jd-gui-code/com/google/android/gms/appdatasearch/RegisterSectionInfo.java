package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class RegisterSectionInfo
  extends AbstractSafeParcelable
{
  public static final i CREATOR = new i();
  final int a;
  public final String b;
  public final String c;
  public final boolean d;
  public final int e;
  public final boolean f;
  public final String g;
  public final Feature[] h;
  final int[] i;
  public final String j;
  
  RegisterSectionInfo(int paramInt1, String paramString1, String paramString2, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, String paramString3, Feature[] paramArrayOfFeature, int[] paramArrayOfInt, String paramString4)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean1;
    this.e = paramInt2;
    this.f = paramBoolean2;
    this.g = paramString3;
    this.h = paramArrayOfFeature;
    this.i = paramArrayOfInt;
    this.j = paramString4;
  }
  
  RegisterSectionInfo(String paramString1, String paramString2, boolean paramBoolean1, int paramInt, boolean paramBoolean2, String paramString3, Feature[] paramArrayOfFeature, int[] paramArrayOfInt, String paramString4)
  {
    this(2, paramString1, paramString2, paramBoolean1, paramInt, paramBoolean2, paramString3, paramArrayOfFeature, paramArrayOfInt, paramString4);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i locali = CREATOR;
    i.a(this, paramParcel, paramInt);
  }
  
  public static final class a
  {
    private final String a;
    private String b;
    private boolean c;
    private int d;
    private boolean e;
    private final List<Feature> f;
    private BitSet g;
    private String h;
    
    public a(String paramString)
    {
      this.a = paramString;
      this.d = 1;
      this.f = new ArrayList();
    }
    
    public a a(int paramInt)
    {
      if (this.g == null) {
        this.g = new BitSet();
      }
      this.g.set(paramInt);
      return this;
    }
    
    public a a(String paramString)
    {
      this.b = paramString;
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      this.c = paramBoolean;
      return this;
    }
    
    public RegisterSectionInfo a()
    {
      int i = 0;
      if (this.g != null)
      {
        int[] arrayOfInt2 = new int[this.g.cardinality()];
        int j = this.g.nextSetBit(0);
        for (;;)
        {
          arrayOfInt1 = arrayOfInt2;
          if (j < 0) {
            break;
          }
          arrayOfInt2[i] = j;
          j = this.g.nextSetBit(j + 1);
          i += 1;
        }
      }
      int[] arrayOfInt1 = null;
      return new RegisterSectionInfo(this.a, this.b, this.c, this.d, this.e, null, (Feature[])this.f.toArray(new Feature[this.f.size()]), arrayOfInt1, this.h);
    }
    
    public a b(String paramString)
    {
      this.h = paramString;
      return this;
    }
    
    public a b(boolean paramBoolean)
    {
      this.e = paramBoolean;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appdatasearch/RegisterSectionInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */