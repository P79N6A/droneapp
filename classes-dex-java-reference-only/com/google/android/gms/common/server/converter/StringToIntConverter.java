package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class StringToIntConverter
  extends AbstractSafeParcelable
  implements FastJsonResponse.a<String, Integer>
{
  public static final b CREATOR = new b();
  private final int a;
  private final HashMap<String, Integer> b;
  private final SparseArray<String> c;
  private final ArrayList<Entry> d;
  
  public StringToIntConverter()
  {
    this.a = 1;
    this.b = new HashMap();
    this.c = new SparseArray();
    this.d = null;
  }
  
  StringToIntConverter(int paramInt, ArrayList<Entry> paramArrayList)
  {
    this.a = paramInt;
    this.b = new HashMap();
    this.c = new SparseArray();
    this.d = null;
    a(paramArrayList);
  }
  
  private void a(ArrayList<Entry> paramArrayList)
  {
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      Entry localEntry = (Entry)paramArrayList.next();
      a(localEntry.b, localEntry.c);
    }
  }
  
  int a()
  {
    return this.a;
  }
  
  public StringToIntConverter a(String paramString, int paramInt)
  {
    this.b.put(paramString, Integer.valueOf(paramInt));
    this.c.put(paramInt, paramString);
    return this;
  }
  
  public String a(Integer paramInteger)
  {
    String str = (String)this.c.get(paramInteger.intValue());
    paramInteger = str;
    if (str == null)
    {
      paramInteger = str;
      if (this.b.containsKey("gms_unknown")) {
        paramInteger = "gms_unknown";
      }
    }
    return paramInteger;
  }
  
  ArrayList<Entry> b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new Entry(str, ((Integer)this.b.get(str)).intValue()));
    }
    return localArrayList;
  }
  
  public int c()
  {
    return 7;
  }
  
  public int d()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b localb = CREATOR;
    b.a(this, paramParcel, paramInt);
  }
  
  public static final class Entry
    extends AbstractSafeParcelable
  {
    public static final c CREATOR = new c();
    final int a;
    final String b;
    final int c;
    
    Entry(int paramInt1, String paramString, int paramInt2)
    {
      this.a = paramInt1;
      this.b = paramString;
      this.c = paramInt2;
    }
    
    Entry(String paramString, int paramInt)
    {
      this.a = 1;
      this.b = paramString;
      this.c = paramInt;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      c localc = CREATOR;
      c.a(this, paramParcel, paramInt);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/server/converter/StringToIntConverter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */