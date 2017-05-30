package com.google.android.gms.internal;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.x;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@aaa
class wt
{
  final AdRequestParcel a;
  final String b;
  final int c;
  
  wt(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    this.a = paramAdRequestParcel;
    this.b = paramString;
    this.c = paramInt;
  }
  
  wt(wr paramwr)
  {
    this(paramwr.a(), paramwr.c(), paramwr.b());
  }
  
  static wt a(String paramString)
  {
    Object localObject3 = paramString.split("\000");
    if (localObject3.length != 3) {
      throw new IOException("Incorrect field count for QueueSeed.");
    }
    paramString = Parcel.obtain();
    try
    {
      Object localObject1 = new String(Base64.decode(localObject3[0], 0), "UTF-8");
      int i = Integer.parseInt(localObject3[1]);
      localObject3 = Base64.decode(localObject3[2], 0);
      paramString.unmarshall((byte[])localObject3, 0, localObject3.length);
      paramString.setDataPosition(0);
      localObject1 = new wt((AdRequestParcel)AdRequestParcel.CREATOR.createFromParcel(paramString), (String)localObject1, i);
      return (wt)localObject1;
    }
    catch (Throwable localThrowable)
    {
      throw new IOException("Malformed QueueSeed encoding.", localThrowable);
    }
    finally
    {
      paramString.recycle();
    }
  }
  
  String a()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      String str1 = Base64.encodeToString(this.b.getBytes("UTF-8"), 0);
      String str2 = Integer.toString(this.c);
      this.a.writeToParcel(localParcel, 0);
      String str3 = Base64.encodeToString(localParcel.marshall(), 0);
      str1 = String.valueOf(str1).length() + 2 + String.valueOf(str2).length() + String.valueOf(str3).length() + str1 + "\000" + str2 + "\000" + str3;
      return str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      abr.b("QueueSeed encode failed because UTF-8 is not available.");
      return "";
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/wt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */