package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CastDevice
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<CastDevice> CREATOR = new j();
  public static final int a = 1;
  public static final int b = 2;
  public static final int c = 4;
  public static final int d = 8;
  public static final int e = 32;
  String f;
  private final int g;
  private String h;
  private Inet4Address i;
  private String j;
  private String k;
  private String l;
  private int m;
  private List<WebImage> n;
  private int o;
  private int p;
  private String q;
  
  CastDevice(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, List<WebImage> paramList, int paramInt3, int paramInt4, String paramString6)
  {
    this.g = paramInt1;
    this.h = a(paramString1);
    this.f = a(paramString2);
    if (!TextUtils.isEmpty(this.f)) {}
    try
    {
      paramString1 = InetAddress.getByName(this.f);
      if ((paramString1 instanceof Inet4Address)) {
        this.i = ((Inet4Address)paramString1);
      }
      this.j = a(paramString3);
      this.k = a(paramString4);
      this.l = a(paramString5);
      this.m = paramInt2;
      if (paramList != null)
      {
        this.n = paramList;
        this.o = paramInt3;
        this.p = paramInt4;
        this.q = a(paramString6);
        return;
      }
    }
    catch (UnknownHostException paramString2)
    {
      for (;;)
      {
        paramString1 = this.f;
        paramString2 = String.valueOf(paramString2.getMessage());
        Log.i("CastDevice", String.valueOf(paramString1).length() + 48 + String.valueOf(paramString2).length() + "Unable to convert host address (" + paramString1 + ") to ipaddress: " + paramString2);
        continue;
        paramList = new ArrayList();
      }
    }
  }
  
  private static String a(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  public static CastDevice b(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    paramBundle.setClassLoader(CastDevice.class.getClassLoader());
    return (CastDevice)paramBundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
  }
  
  public int a()
  {
    return this.g;
  }
  
  public WebImage a(int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    if (this.n.isEmpty()) {
      return null;
    }
    if ((paramInt1 <= 0) || (paramInt2 <= 0)) {
      return (WebImage)this.n.get(0);
    }
    Iterator localIterator = this.n.iterator();
    Object localObject2 = null;
    WebImage localWebImage;
    int i1;
    int i2;
    if (localIterator.hasNext())
    {
      localWebImage = (WebImage)localIterator.next();
      i1 = localWebImage.c();
      i2 = localWebImage.d();
      if ((i1 >= paramInt1) && (i2 >= paramInt2))
      {
        if ((localObject2 != null) && ((((WebImage)localObject2).c() <= i1) || (((WebImage)localObject2).d() <= i2))) {
          break label210;
        }
        localObject2 = localWebImage;
      }
    }
    label210:
    for (;;)
    {
      break;
      if ((i1 < paramInt1) && (i2 < paramInt2) && ((localObject1 == null) || ((((WebImage)localObject1).c() < i1) && (((WebImage)localObject1).d() < i2))))
      {
        localObject1 = localWebImage;
        continue;
        if (localObject2 != null) {}
        for (;;)
        {
          return (WebImage)localObject2;
          if (localObject1 != null) {
            localObject2 = localObject1;
          } else {
            localObject2 = (WebImage)this.n.get(0);
          }
        }
      }
    }
  }
  
  public void a(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    paramBundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
  }
  
  public boolean a(int paramInt)
  {
    return (this.o & paramInt) == paramInt;
  }
  
  public boolean a(CastDevice paramCastDevice)
  {
    if (paramCastDevice == null) {}
    do
    {
      return false;
      if (this.h != null) {
        break;
      }
    } while (paramCastDevice.h != null);
    return true;
    return f.a(this.h, paramCastDevice.h);
  }
  
  public boolean a(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      return false;
    }
    int i2 = paramArrayOfInt.length;
    int i1 = 0;
    for (;;)
    {
      if (i1 >= i2) {
        break label33;
      }
      if (!a(paramArrayOfInt[i1])) {
        break;
      }
      i1 += 1;
    }
    label33:
    return true;
  }
  
  public String b()
  {
    if (this.h.startsWith("__cast_nearby__")) {
      return this.h.substring("__cast_nearby__".length() + 1);
    }
    return this.h;
  }
  
  public String c()
  {
    return this.h;
  }
  
  public Inet4Address d()
  {
    return this.i;
  }
  
  public String e()
  {
    return this.j;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      do
      {
        return true;
        if (!(paramObject instanceof CastDevice)) {
          return false;
        }
        paramObject = (CastDevice)paramObject;
        if (this.h != null) {
          break;
        }
      } while (((CastDevice)paramObject).h == null);
      return false;
    } while ((f.a(this.h, ((CastDevice)paramObject).h)) && (f.a(this.i, ((CastDevice)paramObject).i)) && (f.a(this.k, ((CastDevice)paramObject).k)) && (f.a(this.j, ((CastDevice)paramObject).j)) && (f.a(this.l, ((CastDevice)paramObject).l)) && (this.m == ((CastDevice)paramObject).m) && (f.a(this.n, ((CastDevice)paramObject).n)) && (this.o == ((CastDevice)paramObject).o) && (this.p == ((CastDevice)paramObject).p) && (f.a(this.q, ((CastDevice)paramObject).q)));
    return false;
  }
  
  public String f()
  {
    return this.k;
  }
  
  public String g()
  {
    return this.l;
  }
  
  public String h()
  {
    return this.q;
  }
  
  public int hashCode()
  {
    if (this.h == null) {
      return 0;
    }
    return this.h.hashCode();
  }
  
  public int i()
  {
    return this.m;
  }
  
  public List<WebImage> j()
  {
    return Collections.unmodifiableList(this.n);
  }
  
  public boolean k()
  {
    return !this.n.isEmpty();
  }
  
  public int l()
  {
    return this.o;
  }
  
  public int m()
  {
    return this.p;
  }
  
  public boolean n()
  {
    return !this.h.startsWith("__cast_nearby__");
  }
  
  public String toString()
  {
    return String.format("\"%s\" (%s)", new Object[] { this.j, this.h });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    j.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/CastDevice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */