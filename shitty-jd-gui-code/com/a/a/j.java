package com.a.a;

import android.view.animation.Interpolator;

public abstract class j
  implements Cloneable
{
  float a;
  Class b;
  boolean c = false;
  private Interpolator d = null;
  
  public static j a(float paramFloat)
  {
    return new b(paramFloat);
  }
  
  public static j a(float paramFloat1, float paramFloat2)
  {
    return new a(paramFloat1, paramFloat2);
  }
  
  public static j a(float paramFloat, int paramInt)
  {
    return new b(paramFloat, paramInt);
  }
  
  public static j a(float paramFloat, Object paramObject)
  {
    return new c(paramFloat, paramObject);
  }
  
  public static j b(float paramFloat)
  {
    return new a(paramFloat);
  }
  
  public static j c(float paramFloat)
  {
    return new c(paramFloat, null);
  }
  
  public void a(Interpolator paramInterpolator)
  {
    this.d = paramInterpolator;
  }
  
  public abstract void a(Object paramObject);
  
  public boolean a()
  {
    return this.c;
  }
  
  public abstract Object b();
  
  public float c()
  {
    return this.a;
  }
  
  public Interpolator d()
  {
    return this.d;
  }
  
  public void d(float paramFloat)
  {
    this.a = paramFloat;
  }
  
  public Class e()
  {
    return this.b;
  }
  
  public abstract j f();
  
  static class a
    extends j
  {
    float d;
    
    a(float paramFloat)
    {
      this.a = paramFloat;
      this.b = Float.TYPE;
    }
    
    a(float paramFloat1, float paramFloat2)
    {
      this.a = paramFloat1;
      this.d = paramFloat2;
      this.b = Float.TYPE;
      this.c = true;
    }
    
    public void a(Object paramObject)
    {
      if ((paramObject != null) && (paramObject.getClass() == Float.class))
      {
        this.d = ((Float)paramObject).floatValue();
        this.c = true;
      }
    }
    
    public Object b()
    {
      return Float.valueOf(this.d);
    }
    
    public float g()
    {
      return this.d;
    }
    
    public a h()
    {
      a locala = new a(c(), this.d);
      locala.a(d());
      return locala;
    }
  }
  
  static class b
    extends j
  {
    int d;
    
    b(float paramFloat)
    {
      this.a = paramFloat;
      this.b = Integer.TYPE;
    }
    
    b(float paramFloat, int paramInt)
    {
      this.a = paramFloat;
      this.d = paramInt;
      this.b = Integer.TYPE;
      this.c = true;
    }
    
    public void a(Object paramObject)
    {
      if ((paramObject != null) && (paramObject.getClass() == Integer.class))
      {
        this.d = ((Integer)paramObject).intValue();
        this.c = true;
      }
    }
    
    public Object b()
    {
      return Integer.valueOf(this.d);
    }
    
    public int g()
    {
      return this.d;
    }
    
    public b h()
    {
      b localb = new b(c(), this.d);
      localb.a(d());
      return localb;
    }
  }
  
  static class c
    extends j
  {
    Object d;
    
    c(float paramFloat, Object paramObject)
    {
      this.a = paramFloat;
      this.d = paramObject;
      boolean bool;
      if (paramObject != null)
      {
        bool = true;
        this.c = bool;
        if (!this.c) {
          break label48;
        }
      }
      label48:
      for (paramObject = paramObject.getClass();; paramObject = Object.class)
      {
        this.b = ((Class)paramObject);
        return;
        bool = false;
        break;
      }
    }
    
    public void a(Object paramObject)
    {
      this.d = paramObject;
      if (paramObject != null) {}
      for (boolean bool = true;; bool = false)
      {
        this.c = bool;
        return;
      }
    }
    
    public Object b()
    {
      return this.d;
    }
    
    public c g()
    {
      c localc = new c(c(), this.d);
      localc.a(d());
      return localc;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/a/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */