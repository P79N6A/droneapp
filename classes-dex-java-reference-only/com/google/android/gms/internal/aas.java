package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.client.a.a;
import com.google.android.gms.common.internal.c;

@aaa
public class aas
  extends a.a
{
  private final String a;
  private final int b;
  
  public aas(String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof aas))) {}
    do
    {
      return false;
      paramObject = (aas)paramObject;
    } while ((!c.a(a(), ((aas)paramObject).a())) || (!c.a(Integer.valueOf(b()), Integer.valueOf(((aas)paramObject).b()))));
    return true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/aas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */