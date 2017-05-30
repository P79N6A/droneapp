package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class g
  implements Parcelable.Creator<GetRecentContextCall.Response>
{
  static void a(GetRecentContextCall.Response paramResponse, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramResponse.a, paramInt, false);
    b.c(paramParcel, 2, paramResponse.b, false);
    b.a(paramParcel, 3, paramResponse.c, false);
    b.a(paramParcel, 1000, paramResponse.d);
    b.a(paramParcel, i);
  }
  
  public GetRecentContextCall.Response a(Parcel paramParcel)
  {
    String[] arrayOfString = null;
    int j = a.b(paramParcel);
    int i = 0;
    Object localObject2 = null;
    Object localObject1 = null;
    if (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      Object localObject3;
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject3;
      }
      for (;;)
      {
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject3;
        break;
        localObject3 = (Status)a.a(paramParcel, k, Status.CREATOR);
        localObject1 = localObject2;
        localObject2 = localObject3;
        continue;
        localObject3 = a.c(paramParcel, k, UsageInfo.CREATOR);
        localObject2 = localObject1;
        localObject1 = localObject3;
        continue;
        arrayOfString = a.C(paramParcel, k);
        localObject3 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        continue;
        i = a.g(paramParcel, k);
        localObject3 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new GetRecentContextCall.Response(i, (Status)localObject1, (List)localObject2, arrayOfString);
  }
  
  public GetRecentContextCall.Response[] a(int paramInt)
  {
    return new GetRecentContextCall.Response[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appdatasearch/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */