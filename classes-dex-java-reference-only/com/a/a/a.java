package com.a.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;

public abstract class a
  implements Cloneable
{
  ArrayList<a> a = null;
  
  public void a() {}
  
  public abstract void a(long paramLong);
  
  public abstract void a(Interpolator paramInterpolator);
  
  public void a(a parama)
  {
    if (this.a == null) {
      this.a = new ArrayList();
    }
    this.a.add(parama);
  }
  
  public void a(Object paramObject) {}
  
  public abstract a b(long paramLong);
  
  public void b() {}
  
  public void b(a parama)
  {
    if (this.a == null) {}
    do
    {
      return;
      this.a.remove(parama);
    } while (this.a.size() != 0);
    this.a = null;
  }
  
  public void c() {}
  
  public abstract long d();
  
  public abstract long e();
  
  public abstract boolean f();
  
  public boolean g()
  {
    return f();
  }
  
  public ArrayList<a> h()
  {
    return this.a;
  }
  
  public void i()
  {
    if (this.a != null)
    {
      this.a.clear();
      this.a = null;
    }
  }
  
  public a j()
  {
    try
    {
      a locala = (a)super.clone();
      if (this.a != null)
      {
        ArrayList localArrayList = this.a;
        locala.a = new ArrayList();
        int j = localArrayList.size();
        int i = 0;
        while (i < j)
        {
          locala.a.add(localArrayList.get(i));
          i += 1;
        }
      }
      return localCloneNotSupportedException;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError();
    }
  }
  
  public void k() {}
  
  public void l() {}
  
  public static abstract interface a
  {
    public abstract void a(a parama);
    
    public abstract void b(a parama);
    
    public abstract void c(a parama);
    
    public abstract void d(a parama);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */