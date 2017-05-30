package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.a.a;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;

@aaa
public class aaz
  extends a.a
{
  private volatile aax a;
  private volatile aba b;
  private volatile aay c;
  
  public aaz(aay paramaay)
  {
    this.c = paramaay;
  }
  
  public void a(e parame)
  {
    if (this.a != null) {
      this.a.g();
    }
  }
  
  public void a(e parame, int paramInt)
  {
    if (this.a != null) {
      this.a.a(paramInt);
    }
  }
  
  public void a(e parame, RewardItemParcel paramRewardItemParcel)
  {
    if (this.c != null) {
      this.c.b(paramRewardItemParcel);
    }
  }
  
  public void a(aax paramaax)
  {
    this.a = paramaax;
  }
  
  public void a(aba paramaba)
  {
    this.b = paramaba;
  }
  
  public void b(e parame)
  {
    if (this.b != null) {
      this.b.a(f.a(parame).getClass().getName());
    }
  }
  
  public void b(e parame, int paramInt)
  {
    if (this.b != null) {
      this.b.a(f.a(parame).getClass().getName(), paramInt);
    }
  }
  
  public void c(e parame)
  {
    if (this.c != null) {
      this.c.G();
    }
  }
  
  public void d(e parame)
  {
    if (this.c != null) {
      this.c.H();
    }
  }
  
  public void e(e parame)
  {
    if (this.c != null) {
      this.c.I();
    }
  }
  
  public void f(e parame)
  {
    if (this.c != null) {
      this.c.J();
    }
  }
  
  public void g(e parame)
  {
    if (this.c != null) {
      this.c.K();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/aaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */