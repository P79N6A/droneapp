package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.om;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringList
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<StringList> CREATOR = new g();
  @gc
  public final int a;
  @om(a="values")
  private List<String> b;
  
  public StringList()
  {
    this(null);
  }
  
  StringList(int paramInt, List<String> paramList)
  {
    this.a = paramInt;
    if ((paramList == null) || (paramList.isEmpty()))
    {
      this.b = Collections.emptyList();
      return;
    }
    this.b = Collections.unmodifiableList(paramList);
  }
  
  public StringList(@Nullable List<String> paramList)
  {
    this.a = 1;
    this.b = new ArrayList();
    if ((paramList != null) && (!paramList.isEmpty())) {
      this.b.addAll(paramList);
    }
  }
  
  public static StringList a(StringList paramStringList)
  {
    if (paramStringList != null) {}
    for (paramStringList = paramStringList.a();; paramStringList = null) {
      return new StringList(paramStringList);
    }
  }
  
  public static StringList b()
  {
    return new StringList(null);
  }
  
  public List<String> a()
  {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/auth/api/model/StringList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */