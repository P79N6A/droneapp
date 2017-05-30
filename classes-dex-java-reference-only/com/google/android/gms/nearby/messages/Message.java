package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import java.util.Arrays;

public class Message
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<Message> CREATOR = new o();
  public static final int a = 102400;
  public static final int b = 32;
  public static final String c = "__reserved_namespace";
  public static final String d = "__eddystone_uid";
  public static final String e = "__i_beacon_id";
  private static final NearbyDevice[] g = { NearbyDevice.a };
  final int f;
  private final byte[] h;
  private final String i;
  private final String j;
  private final NearbyDevice[] k;
  private final long l;
  
  Message(int paramInt, @Nullable byte[] paramArrayOfByte, @Nullable String paramString1, String paramString2, @Nullable NearbyDevice[] paramArrayOfNearbyDevice, long paramLong)
  {
    this.f = paramInt;
    this.i = ((String)d.a(paramString2));
    String str = paramString1;
    if (paramString1 == null) {
      str = "";
    }
    this.j = str;
    this.l = 0L;
    if (a(this.j, this.i)) {
      if (paramArrayOfByte == null)
      {
        bool = true;
        d.b(bool, "Content must be null for a device presence message.");
        this.h = paramArrayOfByte;
        if (paramArrayOfNearbyDevice != null)
        {
          paramArrayOfByte = paramArrayOfNearbyDevice;
          if (paramArrayOfNearbyDevice.length != 0) {}
        }
        else
        {
          paramArrayOfByte = g;
        }
        this.k = paramArrayOfByte;
        if (paramString2.length() > 32) {
          break label200;
        }
      }
    }
    label200:
    for (boolean bool = true;; bool = false)
    {
      d.b(bool, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", new Object[] { Integer.valueOf(paramString2.length()), Integer.valueOf(32) });
      return;
      bool = false;
      break;
      d.a(paramArrayOfByte);
      if (paramArrayOfByte.length <= 102400) {}
      for (bool = true;; bool = false)
      {
        d.b(bool, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(102400) });
        break;
      }
    }
  }
  
  public Message(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, "", "");
  }
  
  public Message(byte[] paramArrayOfByte, String paramString)
  {
    this(paramArrayOfByte, "", paramString);
  }
  
  public Message(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    this(paramArrayOfByte, paramString1, paramString2, g);
  }
  
  public Message(byte[] paramArrayOfByte, String paramString1, String paramString2, NearbyDevice[] paramArrayOfNearbyDevice)
  {
    this(paramArrayOfByte, paramString1, paramString2, paramArrayOfNearbyDevice, 0L);
  }
  
  public Message(byte[] paramArrayOfByte, String paramString1, String paramString2, NearbyDevice[] paramArrayOfNearbyDevice, long paramLong)
  {
    this(2, paramArrayOfByte, paramString1, paramString2, paramArrayOfNearbyDevice, paramLong);
  }
  
  @Deprecated
  public static boolean a(String paramString1, String paramString2)
  {
    return (paramString1.equals("__reserved_namespace")) && (paramString2.equals("__device_presence"));
  }
  
  public boolean a()
  {
    return "__reserved_namespace".equals(c());
  }
  
  public boolean a(String paramString)
  {
    return (a()) && (paramString.equals(b()));
  }
  
  public String b()
  {
    return this.i;
  }
  
  public String c()
  {
    return this.j;
  }
  
  public byte[] d()
  {
    return this.h;
  }
  
  public NearbyDevice[] e()
  {
    return this.k;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof Message)) {
        return false;
      }
      paramObject = (Message)paramObject;
    } while ((TextUtils.equals(this.j, ((Message)paramObject).j)) && (TextUtils.equals(this.i, ((Message)paramObject).i)) && (Arrays.equals(this.h, ((Message)paramObject).h)) && (0L == 0L));
    return false;
  }
  
  public long f()
  {
    return 0L;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.j, this.i, Integer.valueOf(Arrays.hashCode(this.h)), Long.valueOf(0L) });
  }
  
  public String toString()
  {
    String str1 = this.j;
    String str2 = this.i;
    if (this.h == null) {}
    for (int m = 0;; m = this.h.length)
    {
      String str3 = String.valueOf(Arrays.toString(e()));
      return String.valueOf(str1).length() + 69 + String.valueOf(str2).length() + String.valueOf(str3).length() + "Message{namespace='" + str1 + "', type='" + str2 + "', content=[" + m + " bytes], devices=" + str3 + "}";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    o.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/nearby/messages/Message.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */