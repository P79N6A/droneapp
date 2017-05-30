package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions.a;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CastOptions
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<CastOptions> CREATOR = new o();
  private final int a;
  private final String b;
  private final List<String> c;
  private final boolean d;
  private final LaunchOptions e;
  private final boolean f;
  private final CastMediaOptions g;
  private final boolean h;
  private final double i;
  
  CastOptions(int paramInt, String paramString, List<String> paramList, boolean paramBoolean1, LaunchOptions paramLaunchOptions, boolean paramBoolean2, CastMediaOptions paramCastMediaOptions, boolean paramBoolean3, double paramDouble)
  {
    this.a = paramInt;
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = "";
    }
    this.b = str;
    if (paramList == null) {}
    for (paramInt = 0;; paramInt = paramList.size())
    {
      this.c = new ArrayList(paramInt);
      if (paramInt > 0) {
        this.c.addAll(paramList);
      }
      this.d = paramBoolean1;
      paramString = paramLaunchOptions;
      if (paramLaunchOptions == null) {
        paramString = new LaunchOptions();
      }
      this.e = paramString;
      this.f = paramBoolean2;
      this.g = paramCastMediaOptions;
      this.h = paramBoolean3;
      this.i = paramDouble;
      return;
    }
  }
  
  int a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public List<String> c()
  {
    return Collections.unmodifiableList(this.c);
  }
  
  public boolean d()
  {
    return this.d;
  }
  
  public LaunchOptions e()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof CastOptions)) {
        return false;
      }
      paramObject = (CastOptions)paramObject;
    } while ((f.a(this.b, ((CastOptions)paramObject).b)) && (f.a(this.c, ((CastOptions)paramObject).c)) && (this.d == ((CastOptions)paramObject).d) && (f.a(this.e, ((CastOptions)paramObject).e)) && (this.f == ((CastOptions)paramObject).f) && (f.a(this.g, ((CastOptions)paramObject).g)) && (this.h == ((CastOptions)paramObject).h()) && (this.i == ((CastOptions)paramObject).i()));
    return false;
  }
  
  public boolean f()
  {
    return this.f;
  }
  
  public CastMediaOptions g()
  {
    return this.g;
  }
  
  public boolean h()
  {
    return this.h;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.b, this.c, Boolean.valueOf(this.d), this.e, Boolean.valueOf(this.f), this.g, Boolean.valueOf(this.h), Double.valueOf(this.i) });
  }
  
  public double i()
  {
    return this.i;
  }
  
  public String toString()
  {
    return "CastOptions(" + String.format("receiverApplicationId=%s", new Object[] { this.b }) + ", " + String.format("supportedNamespaces=%s", new Object[] { this.c }) + ", " + String.format("stopReceiverApplicationWhenEndingSession=%b", new Object[] { Boolean.valueOf(this.d) }) + ", " + String.format("launchOptions=%s", new Object[] { this.e }) + ", " + String.format("resumeSavedSession=%s", new Object[] { Boolean.valueOf(this.f) }) + ", " + String.format("castMediaOptions=%s", new Object[] { this.g }) + ", " + String.format("enableReconnectionService=%s", new Object[] { Boolean.valueOf(this.h) }) + ")";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    o.a(this, paramParcel, paramInt);
  }
  
  public static final class a
  {
    private String a;
    private List<String> b = new ArrayList();
    private boolean c;
    private LaunchOptions d = new LaunchOptions();
    private boolean e = true;
    private CastMediaOptions f = new CastMediaOptions.a().a();
    private boolean g = true;
    private double h = 0.05000000074505806D;
    
    public a a(double paramDouble)
    {
      if ((paramDouble <= 0.0D) || (paramDouble > 0.5D)) {
        throw new IllegalArgumentException("volumeDelta must be greater than 0 and less or equal to 0.5");
      }
      this.h = paramDouble;
      return this;
    }
    
    public a a(LaunchOptions paramLaunchOptions)
    {
      this.d = paramLaunchOptions;
      return this;
    }
    
    public a a(CastMediaOptions paramCastMediaOptions)
    {
      this.f = paramCastMediaOptions;
      return this;
    }
    
    public a a(String paramString)
    {
      this.a = paramString;
      return this;
    }
    
    public a a(List<String> paramList)
    {
      this.b = paramList;
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      this.c = paramBoolean;
      return this;
    }
    
    public CastOptions a()
    {
      return new CastOptions(1, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
    
    public a b(boolean paramBoolean)
    {
      this.e = paramBoolean;
      return this;
    }
    
    public a c(boolean paramBoolean)
    {
      this.g = paramBoolean;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/CastOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */