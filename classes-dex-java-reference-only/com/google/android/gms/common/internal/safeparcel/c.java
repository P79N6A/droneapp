package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.Iterator;

public final class c
{
  public static <T extends SafeParcelable> T a(Intent paramIntent, String paramString, Parcelable.Creator<T> paramCreator)
  {
    paramIntent = paramIntent.getByteArrayExtra(paramString);
    if (paramIntent == null) {
      return null;
    }
    return a(paramIntent, paramCreator);
  }
  
  public static <T extends SafeParcelable> T a(byte[] paramArrayOfByte, Parcelable.Creator<T> paramCreator)
  {
    d.a(paramCreator);
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
    localParcel.setDataPosition(0);
    paramArrayOfByte = (SafeParcelable)paramCreator.createFromParcel(localParcel);
    localParcel.recycle();
    return paramArrayOfByte;
  }
  
  public static <T extends SafeParcelable> void a(T paramT, Intent paramIntent, String paramString)
  {
    paramIntent.putExtra(paramString, a(paramT));
  }
  
  public static <T extends SafeParcelable> byte[] a(T paramT)
  {
    Parcel localParcel = Parcel.obtain();
    paramT.writeToParcel(localParcel, 0);
    paramT = localParcel.marshall();
    localParcel.recycle();
    return paramT;
  }
  
  public static <T extends SafeParcelable> ArrayList<T> b(Intent paramIntent, String paramString, Parcelable.Creator<T> paramCreator)
  {
    paramString = (ArrayList)paramIntent.getSerializableExtra(paramString);
    if (paramString == null) {
      return null;
    }
    paramIntent = new ArrayList(paramString.size());
    paramString = paramString.iterator();
    while (paramString.hasNext()) {
      paramIntent.add(a((byte[])paramString.next(), paramCreator));
    }
    return paramIntent;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/safeparcel/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */