package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApplicationMetadata
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ApplicationMetadata> CREATOR = new i();
  String a;
  String b;
  List<WebImage> c;
  List<String> d;
  String e;
  Uri f;
  private final int g;
  
  private ApplicationMetadata()
  {
    this.g = 1;
    this.c = new ArrayList();
    this.d = new ArrayList();
  }
  
  ApplicationMetadata(int paramInt, String paramString1, String paramString2, List<WebImage> paramList, List<String> paramList1, String paramString3, Uri paramUri)
  {
    this.g = paramInt;
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramList;
    this.d = paramList1;
    this.e = paramString3;
    this.f = paramUri;
  }
  
  int a()
  {
    return this.g;
  }
  
  public boolean a(String paramString)
  {
    return (this.d != null) && (this.d.contains(paramString));
  }
  
  public boolean a(List<String> paramList)
  {
    return (this.d != null) && (this.d.containsAll(paramList));
  }
  
  public String b()
  {
    return this.a;
  }
  
  public String c()
  {
    return this.b;
  }
  
  public List<String> d()
  {
    return Collections.unmodifiableList(this.d);
  }
  
  public String e()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof ApplicationMetadata)) {
        return false;
      }
      paramObject = (ApplicationMetadata)paramObject;
    } while ((f.a(this.a, ((ApplicationMetadata)paramObject).a)) && (f.a(this.c, ((ApplicationMetadata)paramObject).c)) && (f.a(this.b, ((ApplicationMetadata)paramObject).b)) && (f.a(this.d, ((ApplicationMetadata)paramObject).d)) && (f.a(this.e, ((ApplicationMetadata)paramObject).e)) && (f.a(this.f, ((ApplicationMetadata)paramObject).f)));
    return false;
  }
  
  public Uri f()
  {
    return this.f;
  }
  
  public List<WebImage> g()
  {
    return this.c;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { Integer.valueOf(this.g), this.a, this.b, this.c, this.d, this.e, this.f });
  }
  
  public String toString()
  {
    int j = 0;
    StringBuilder localStringBuilder = new StringBuilder().append("applicationId: ").append(this.a).append(", name: ").append(this.b).append(", images.count: ");
    if (this.c == null)
    {
      i = 0;
      localStringBuilder = localStringBuilder.append(i).append(", namespaces.count: ");
      if (this.d != null) {
        break label114;
      }
    }
    label114:
    for (int i = j;; i = this.d.size())
    {
      return i + ", senderAppIdentifier: " + this.e + ", senderAppLaunchUrl: " + this.f;
      i = this.c.size();
      break;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/ApplicationMetadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */