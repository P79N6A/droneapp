package com.google.android.gms.cast.framework;

import android.support.annotation.NonNull;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;

public class ae<T extends j>
  extends ab.a
{
  private final l<T> a;
  private final Class<T> b;
  
  public ae(@NonNull l<T> paraml, @NonNull Class<T> paramClass)
  {
    this.a = paraml;
    this.b = paramClass;
  }
  
  public int a()
  {
    return 9683208;
  }
  
  public void a(@NonNull e parame)
  {
    parame = (j)f.a(parame);
    if (this.b.isInstance(parame)) {
      this.a.a((j)this.b.cast(parame));
    }
  }
  
  public void a(@NonNull e parame, int paramInt)
  {
    parame = (j)f.a(parame);
    if (this.b.isInstance(parame)) {
      this.a.a((j)this.b.cast(parame), paramInt);
    }
  }
  
  public void a(@NonNull e parame, String paramString)
  {
    parame = (j)f.a(parame);
    if (this.b.isInstance(parame)) {
      this.a.a((j)this.b.cast(parame), paramString);
    }
  }
  
  public void a(@NonNull e parame, boolean paramBoolean)
  {
    parame = (j)f.a(parame);
    if (this.b.isInstance(parame)) {
      this.a.a((j)this.b.cast(parame), paramBoolean);
    }
  }
  
  public e b()
  {
    return f.a(this.a);
  }
  
  public void b(@NonNull e parame)
  {
    parame = (j)f.a(parame);
    if (this.b.isInstance(parame)) {
      this.a.b((j)this.b.cast(parame));
    }
  }
  
  public void b(@NonNull e parame, int paramInt)
  {
    parame = (j)f.a(parame);
    if (this.b.isInstance(parame)) {
      this.a.b((j)this.b.cast(parame), paramInt);
    }
  }
  
  public void b(@NonNull e parame, String paramString)
  {
    parame = (j)f.a(parame);
    if (this.b.isInstance(parame)) {
      this.a.b((j)this.b.cast(parame), paramString);
    }
  }
  
  public void c(@NonNull e parame, int paramInt)
  {
    parame = (j)f.a(parame);
    if (this.b.isInstance(parame)) {
      this.a.c((j)this.b.cast(parame), paramInt);
    }
  }
  
  public void d(@NonNull e parame, int paramInt)
  {
    parame = (j)f.a(parame);
    if (this.b.isInstance(parame)) {
      this.a.d((j)this.b.cast(parame), paramInt);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */