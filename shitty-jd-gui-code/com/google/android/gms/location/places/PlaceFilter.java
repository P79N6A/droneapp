package com.google.android.gms.location.places;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.c.a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class PlaceFilter
  extends AbstractPlaceFilter
{
  public static final t CREATOR = new t();
  private static final PlaceFilter f = new PlaceFilter();
  final int a;
  final List<Integer> b;
  final boolean c;
  final List<UserDataType> d;
  final List<String> e;
  private final Set<Integer> g;
  private final Set<UserDataType> h;
  private final Set<String> i;
  
  public PlaceFilter()
  {
    this(false, null);
  }
  
  PlaceFilter(int paramInt, @Nullable List<Integer> paramList, boolean paramBoolean, @Nullable List<String> paramList1, @Nullable List<UserDataType> paramList2)
  {
    this.a = paramInt;
    if (paramList == null)
    {
      paramList = Collections.emptyList();
      this.b = paramList;
      this.c = paramBoolean;
      if (paramList2 != null) {
        break label97;
      }
      paramList = Collections.emptyList();
      label36:
      this.d = paramList;
      if (paramList1 != null) {
        break label106;
      }
    }
    label97:
    label106:
    for (paramList = Collections.emptyList();; paramList = Collections.unmodifiableList(paramList1))
    {
      this.e = paramList;
      this.g = a(this.b);
      this.h = a(this.d);
      this.i = a(this.e);
      return;
      paramList = Collections.unmodifiableList(paramList);
      break;
      paramList = Collections.unmodifiableList(paramList2);
      break label36;
    }
  }
  
  public PlaceFilter(@Nullable Collection<Integer> paramCollection, boolean paramBoolean, @Nullable Collection<String> paramCollection1, @Nullable Collection<UserDataType> paramCollection2)
  {
    this(0, a(paramCollection), paramBoolean, a(paramCollection1), a(paramCollection2));
  }
  
  public PlaceFilter(boolean paramBoolean, @Nullable Collection<String> paramCollection)
  {
    this(null, paramBoolean, paramCollection, null);
  }
  
  @Deprecated
  public static PlaceFilter d()
  {
    return new a(null).a();
  }
  
  public boolean a()
  {
    return this.c;
  }
  
  public Set<String> b()
  {
    return this.i;
  }
  
  public Set<Integer> c()
  {
    return this.g;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof PlaceFilter)) {
        return false;
      }
      paramObject = (PlaceFilter)paramObject;
    } while ((this.g.equals(((PlaceFilter)paramObject).g)) && (this.c == ((PlaceFilter)paramObject).c) && (this.h.equals(((PlaceFilter)paramObject).h)) && (this.i.equals(((PlaceFilter)paramObject).i)));
    return false;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.g, Boolean.valueOf(this.c), this.h, this.i });
  }
  
  public String toString()
  {
    c.a locala = c.a(this);
    if (!this.g.isEmpty()) {
      locala.a("types", this.g);
    }
    locala.a("requireOpenNow", Boolean.valueOf(this.c));
    if (!this.i.isEmpty()) {
      locala.a("placeIds", this.i);
    }
    if (!this.h.isEmpty()) {
      locala.a("requestedUserDataTypes", this.h);
    }
    return locala.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    t.a(this, paramParcel, paramInt);
  }
  
  @Deprecated
  public static final class a
  {
    private Collection<Integer> a = null;
    private boolean b = false;
    private Collection<UserDataType> c = null;
    private String[] d = null;
    
    public PlaceFilter a()
    {
      return new PlaceFilter(null, false, null, null);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/location/places/PlaceFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */