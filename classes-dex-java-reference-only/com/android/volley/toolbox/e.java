package com.android.volley.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.b;
import com.android.volley.j;
import com.android.volley.n;
import com.android.volley.n.b;
import com.android.volley.p;

public class e
  extends n<Object>
{
  private final b a;
  private final Runnable b;
  
  public e(b paramb, Runnable paramRunnable)
  {
    super(0, null, null);
    this.a = paramb;
    this.b = paramRunnable;
  }
  
  protected p<Object> a(j paramj)
  {
    return null;
  }
  
  protected void b(Object paramObject) {}
  
  public boolean m()
  {
    this.a.b();
    if (this.b != null) {
      new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.b);
    }
    return true;
  }
  
  public n.b x()
  {
    return n.b.d;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */