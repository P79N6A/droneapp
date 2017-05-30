package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.awareness.state.BeaconState.TypeFilter;
import com.google.android.gms.awareness.state.BeaconState.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.px.a;
import com.google.android.gms.internal.rc;
import com.google.android.gms.internal.rd;
import com.google.android.gms.internal.sw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class BeaconStateImpl
  extends AbstractSafeParcelable
  implements BeaconState
{
  public static final Parcelable.Creator<BeaconStateImpl> CREATOR = new b();
  private final int a;
  private final ArrayList<BeaconInfoImpl> b;
  
  BeaconStateImpl(int paramInt, ArrayList<BeaconInfoImpl> paramArrayList)
  {
    this.a = paramInt;
    this.b = paramArrayList;
  }
  
  public List<BeaconState.a> a()
  {
    return this.b;
  }
  
  int b()
  {
    return this.a;
  }
  
  ArrayList<BeaconInfoImpl> c()
  {
    return this.b;
  }
  
  public String toString()
  {
    if ((this.b == null) || (this.b.isEmpty())) {
      return "BeaconState: empty";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("BeaconState: ");
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      localStringBuilder.append((BeaconState.a)localIterator.next());
    }
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
  
  public static final class BeaconInfoImpl
    extends AbstractSafeParcelable
    implements BeaconState.a
  {
    public static final Parcelable.Creator<BeaconInfoImpl> CREATOR = new a();
    private final int a;
    private final String b;
    private final String c;
    private final byte[] d;
    
    BeaconInfoImpl(int paramInt, String paramString1, String paramString2, byte[] paramArrayOfByte)
    {
      this.a = paramInt;
      this.b = paramString1;
      this.c = paramString2;
      this.d = paramArrayOfByte;
    }
    
    public String a()
    {
      return this.b;
    }
    
    public String b()
    {
      return this.c;
    }
    
    public byte[] c()
    {
      return this.d;
    }
    
    int d()
    {
      return this.a;
    }
    
    public String toString()
    {
      if (this.d == null) {}
      for (String str1 = "<null>";; str1 = new String(this.d))
      {
        String str2 = this.b;
        String str3 = this.c;
        return String.valueOf(str2).length() + 6 + String.valueOf(str3).length() + String.valueOf(str1).length() + "(" + str2 + ", " + str3 + ", " + str1 + ")";
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      a.a(this, paramParcel, paramInt);
    }
  }
  
  public static class TypeFilterImpl
    extends BeaconState.TypeFilter
  {
    public static final Parcelable.Creator<TypeFilterImpl> CREATOR = new n();
    private final int a;
    private final px.a b;
    
    TypeFilterImpl(int paramInt, byte[] paramArrayOfByte)
    {
      this.a = paramInt;
      Object localObject = null;
      try
      {
        paramArrayOfByte = px.a.a(paramArrayOfByte);
        this.b = paramArrayOfByte;
        return;
      }
      catch (rc paramArrayOfByte)
      {
        for (;;)
        {
          sw.b("BeaconStateImpl", "Could not deserialize BeaconFence.BeaconTypeFilter");
          paramArrayOfByte = (byte[])localObject;
        }
      }
    }
    
    public TypeFilterImpl(String paramString1, String paramString2)
    {
      this.a = 1;
      this.b = new px.a();
      this.b.a = d.a(paramString1);
      this.b.b = d.a(paramString2);
    }
    
    public TypeFilterImpl(String paramString1, String paramString2, byte[] paramArrayOfByte)
    {
      this.a = 1;
      this.b = new px.a();
      this.b.a = d.a(paramString1);
      this.b.b = d.a(paramString2);
      this.b.c = ((byte[])d.a(paramArrayOfByte));
    }
    
    public String a()
    {
      if (this.b == null) {
        return null;
      }
      return this.b.a;
    }
    
    public String b()
    {
      if (this.b == null) {
        return null;
      }
      return this.b.b;
    }
    
    public byte[] c()
    {
      if ((this.b == null) || (this.b.c == null) || (this.b.c.length == 0)) {
        return null;
      }
      return this.b.c;
    }
    
    public px.a d()
    {
      return this.b;
    }
    
    int e()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      do
      {
        return true;
        if (!(paramObject instanceof TypeFilterImpl)) {
          return false;
        }
        paramObject = (TypeFilterImpl)paramObject;
      } while ((TextUtils.equals(a(), ((TypeFilterImpl)paramObject).a())) && (TextUtils.equals(b(), ((TypeFilterImpl)paramObject).b())) && (Arrays.equals(c(), ((TypeFilterImpl)paramObject).c())));
      return false;
    }
    
    byte[] f()
    {
      return rd.a(this.b);
    }
    
    public int hashCode()
    {
      int i = 0;
      String str1 = a();
      String str2 = b();
      if (c() == null) {}
      for (;;)
      {
        return c.a(new Object[] { str1, str2, Integer.valueOf(i) });
        i = Arrays.hashCode(c());
      }
    }
    
    public String toString()
    {
      String str2 = String.valueOf(a());
      String str3 = String.valueOf(b());
      if (c() == null) {}
      for (String str1 = "null";; str1 = new String(c())) {
        return String.valueOf(str2).length() + 4 + String.valueOf(str3).length() + String.valueOf(str1).length() + "(" + str2 + "," + str3 + "," + str1 + ")";
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      n.a(this, paramParcel, paramInt);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/BeaconStateImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */