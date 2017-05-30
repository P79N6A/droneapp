package com.google.android.contextmanager.interest;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.qf.b;
import com.google.android.gms.internal.rc;
import com.google.android.gms.internal.rd;

public class InterestRecordStub
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<InterestRecordStub> CREATOR = new a();
  private final int a;
  private final qf.b b;
  
  InterestRecordStub(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    Object localObject = null;
    try
    {
      paramArrayOfByte = qf.b.a(paramArrayOfByte);
      this.b = paramArrayOfByte;
      return;
    }
    catch (rc paramArrayOfByte)
    {
      for (;;)
      {
        Log.e("InterestRecordStub", "Could not deserialize interest bytes.", paramArrayOfByte);
        paramArrayOfByte = (byte[])localObject;
      }
    }
  }
  
  int a()
  {
    return this.a;
  }
  
  byte[] b()
  {
    return rd.a(this.b);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/contextmanager/interest/InterestRecordStub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */