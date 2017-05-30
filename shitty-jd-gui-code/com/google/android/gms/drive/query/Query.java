package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Query
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<Query> CREATOR = new d();
  final LogicalFilter a;
  final String b;
  final SortOrder c;
  final List<String> d;
  final boolean e;
  final List<DriveSpace> f;
  final boolean g;
  final int h;
  private final Set<DriveSpace> i;
  
  private Query(int paramInt, LogicalFilter paramLogicalFilter, String paramString, SortOrder paramSortOrder, List<String> paramList, boolean paramBoolean1, List<DriveSpace> paramList1, Set<DriveSpace> paramSet, boolean paramBoolean2)
  {
    this.h = paramInt;
    this.a = paramLogicalFilter;
    this.b = paramString;
    this.c = paramSortOrder;
    this.d = paramList;
    this.e = paramBoolean1;
    this.f = paramList1;
    this.i = paramSet;
    this.g = paramBoolean2;
  }
  
  Query(int paramInt, LogicalFilter paramLogicalFilter, String paramString, SortOrder paramSortOrder, List<String> paramList, boolean paramBoolean1, List<DriveSpace> paramList1, boolean paramBoolean2) {}
  
  private Query(LogicalFilter paramLogicalFilter, String paramString, SortOrder paramSortOrder, List<String> paramList, boolean paramBoolean1, Set<DriveSpace> paramSet, boolean paramBoolean2) {}
  
  public Filter a()
  {
    return this.a;
  }
  
  @Deprecated
  public String b()
  {
    return this.b;
  }
  
  public SortOrder c()
  {
    return this.c;
  }
  
  public List<String> d()
  {
    return this.d;
  }
  
  public boolean e()
  {
    return this.e;
  }
  
  public Set<DriveSpace> f()
  {
    return this.i;
  }
  
  public boolean g()
  {
    return this.g;
  }
  
  public String toString()
  {
    return String.format(Locale.US, "Query[%s,%s,PageToken=%s,Spaces=%s]", new Object[] { this.a, this.c, this.b, this.f });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
  
  public static class a
  {
    private final List<Filter> a = new ArrayList();
    private String b;
    private SortOrder c;
    private List<String> d;
    private boolean e;
    private Set<DriveSpace> f;
    private boolean g;
    
    public a() {}
    
    public a(Query paramQuery)
    {
      this.a.add(paramQuery.a());
      this.b = paramQuery.b();
      this.c = paramQuery.c();
      this.d = paramQuery.d();
      this.e = paramQuery.e();
      this.f = paramQuery.f();
      this.g = paramQuery.g();
    }
    
    public a a(Filter paramFilter)
    {
      if (!(paramFilter instanceof MatchAllFilter)) {
        this.a.add(paramFilter);
      }
      return this;
    }
    
    public a a(SortOrder paramSortOrder)
    {
      this.c = paramSortOrder;
      return this;
    }
    
    @Deprecated
    public a a(String paramString)
    {
      this.b = paramString;
      return this;
    }
    
    public Query a()
    {
      return new Query(new LogicalFilter(Operator.f, this.a), this.b, this.c, this.d, this.e, this.f, this.g, null);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/drive/query/Query.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */