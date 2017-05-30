package com.google.android.gms.analytics.internal;

public abstract class t
  extends s
{
  private boolean a;
  
  protected t(v paramv)
  {
    super(paramv);
  }
  
  public boolean C()
  {
    return this.a;
  }
  
  protected void D()
  {
    if (!C()) {
      throw new IllegalStateException("Not initialized");
    }
  }
  
  public void E()
  {
    a();
    this.a = true;
  }
  
  protected abstract void a();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */