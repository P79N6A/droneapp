package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class i
  implements Parcelable.Creator<ApplicationMetadata>
{
  static void a(ApplicationMetadata paramApplicationMetadata, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramApplicationMetadata.a());
    b.a(paramParcel, 2, paramApplicationMetadata.b(), false);
    b.a(paramParcel, 3, paramApplicationMetadata.c(), false);
    b.c(paramParcel, 4, paramApplicationMetadata.g(), false);
    b.b(paramParcel, 5, paramApplicationMetadata.d(), false);
    b.a(paramParcel, 6, paramApplicationMetadata.e(), false);
    b.a(paramParcel, 7, paramApplicationMetadata.f(), paramInt, false);
    b.a(paramParcel, i);
  }
  
  public ApplicationMetadata a(Parcel paramParcel)
  {
    Uri localUri = null;
    int j = a.b(paramParcel);
    int i = 0;
    String str1 = null;
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = null;
    String str2 = null;
    String str3 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        i = a.g(paramParcel, k);
        break;
      case 2: 
        str3 = a.q(paramParcel, k);
        break;
      case 3: 
        str2 = a.q(paramParcel, k);
        break;
      case 4: 
        localArrayList2 = a.c(paramParcel, k, WebImage.CREATOR);
        break;
      case 5: 
        localArrayList1 = a.E(paramParcel, k);
        break;
      case 6: 
        str1 = a.q(paramParcel, k);
        break;
      case 7: 
        localUri = (Uri)a.a(paramParcel, k, Uri.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new ApplicationMetadata(i, str3, str2, localArrayList2, localArrayList1, str1, localUri);
  }
  
  public ApplicationMetadata[] a(int paramInt)
  {
    return new ApplicationMetadata[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */