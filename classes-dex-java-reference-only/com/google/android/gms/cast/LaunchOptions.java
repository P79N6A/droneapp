package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

public class LaunchOptions
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<LaunchOptions> CREATOR = new l();
  private final int a;
  private boolean b;
  private String c;
  
  public LaunchOptions()
  {
    this(1, false, f.a(Locale.getDefault()));
  }
  
  LaunchOptions(int paramInt, boolean paramBoolean, String paramString)
  {
    this.a = paramInt;
    this.b = paramBoolean;
    this.c = paramString;
  }
  
  int a()
  {
    return this.a;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public boolean b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof LaunchOptions)) {
        return false;
      }
      paramObject = (LaunchOptions)paramObject;
    } while ((this.b == ((LaunchOptions)paramObject).b) && (f.a(this.c, ((LaunchOptions)paramObject).c)));
    return false;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { Boolean.valueOf(this.b), this.c });
  }
  
  public String toString()
  {
    return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[] { Boolean.valueOf(this.b), this.c });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    l.a(this, paramParcel, paramInt);
  }
  
  public static final class a
  {
    private LaunchOptions a = new LaunchOptions();
    
    public a a(Locale paramLocale)
    {
      this.a.a(f.a(paramLocale));
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      this.a.a(paramBoolean);
      return this;
    }
    
    public LaunchOptions a()
    {
      return this.a;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/LaunchOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */