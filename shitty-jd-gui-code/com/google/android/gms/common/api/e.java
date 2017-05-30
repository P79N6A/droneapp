package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.d;

public class e
  implements m
{
  private final Status a;
  private final boolean b;
  
  public e(Status paramStatus, boolean paramBoolean)
  {
    this.a = ((Status)d.a(paramStatus, "Status must not be null"));
    this.b = paramBoolean;
  }
  
  public Status a()
  {
    return this.a;
  }
  
  public boolean b()
  {
    return this.b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof e)) {
        return false;
      }
      paramObject = (e)paramObject;
    } while ((this.a.equals(((e)paramObject).a)) && (this.b == ((e)paramObject).b));
    return false;
  }
  
  public final int hashCode()
  {
    int j = this.a.hashCode();
    if (this.b) {}
    for (int i = 1;; i = 0) {
      return i + (j + 527) * 31;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */