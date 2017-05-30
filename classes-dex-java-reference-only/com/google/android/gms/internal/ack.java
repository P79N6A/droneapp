package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.u;

@aaa
public final class ack
{
  private final View a;
  private Activity b;
  private boolean c;
  private boolean d;
  private boolean e;
  private ViewTreeObserver.OnGlobalLayoutListener f;
  private ViewTreeObserver.OnScrollChangedListener g;
  
  public ack(Activity paramActivity, View paramView, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    this.b = paramActivity;
    this.a = paramView;
    this.f = paramOnGlobalLayoutListener;
    this.g = paramOnScrollChangedListener;
  }
  
  private void e()
  {
    if (!this.c)
    {
      if (this.f != null)
      {
        if (this.b != null) {
          u.e().a(this.b, this.f);
        }
        u.C().a(this.a, this.f);
      }
      if (this.g != null)
      {
        if (this.b != null) {
          u.e().a(this.b, this.g);
        }
        u.C().a(this.a, this.g);
      }
      this.c = true;
    }
  }
  
  private void f()
  {
    if (this.b == null) {}
    while (!this.c) {
      return;
    }
    if ((this.f != null) && (this.b != null)) {
      u.g().a(this.b, this.f);
    }
    if ((this.g != null) && (this.b != null)) {
      u.e().b(this.b, this.g);
    }
    this.c = false;
  }
  
  public void a()
  {
    this.e = true;
    if (this.d) {
      e();
    }
  }
  
  public void a(Activity paramActivity)
  {
    this.b = paramActivity;
  }
  
  public void b()
  {
    this.e = false;
    f();
  }
  
  public void c()
  {
    this.d = true;
    if (this.e) {
      e();
    }
  }
  
  public void d()
  {
    this.d = false;
    f();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/ack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */