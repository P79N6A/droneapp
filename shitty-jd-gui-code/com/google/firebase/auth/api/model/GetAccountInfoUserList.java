package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.gc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetAccountInfoUserList
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<GetAccountInfoUserList> CREATOR = new c();
  @gc
  public final int a;
  private List<GetAccountInfoUser> b;
  
  public GetAccountInfoUserList()
  {
    this.a = 1;
    this.b = new ArrayList();
  }
  
  GetAccountInfoUserList(int paramInt, List<GetAccountInfoUser> paramList)
  {
    this.a = paramInt;
    if (paramList == null) {}
    for (paramList = Collections.emptyList();; paramList = Collections.unmodifiableList(paramList))
    {
      this.b = paramList;
      return;
    }
  }
  
  public List<GetAccountInfoUser> a()
  {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/auth/api/model/GetAccountInfoUserList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */