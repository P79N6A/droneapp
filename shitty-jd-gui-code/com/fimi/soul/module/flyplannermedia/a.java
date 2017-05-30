package com.fimi.soul.module.flyplannermedia;

import java.util.ArrayList;
import java.util.List;

public class a<T>
{
  private int a = 12;
  private int b = 0;
  private int c = 0;
  private List<List<T>> d = null;
  private a<T> e;
  
  public a() {}
  
  public a(List<T> paramList)
  {
    a(paramList);
  }
  
  public a(List<T> paramList, int paramInt)
  {
    this.a = paramInt;
    a(paramList);
  }
  
  private void a(List<T> paramList)
  {
    this.d = new ArrayList();
    int k = (paramList.size() - 1) / this.a;
    int i = 0;
    while (i < k + 1)
    {
      ArrayList localArrayList = new ArrayList();
      int j = 0;
      while (j < this.a)
      {
        int m = this.a * i + j;
        if (m < paramList.size()) {
          localArrayList.add(paramList.get(m));
        }
        j += 1;
      }
      this.d.add(localArrayList);
      i += 1;
    }
  }
  
  public int a()
  {
    return this.a;
  }
  
  public void a(a<T> parama)
  {
    this.e = parama;
  }
  
  public boolean b()
  {
    if ((this.e != null) && (this.c < this.a) && (this.b < this.d.size()) && (this.c < ((List)this.d.get(this.b)).size()))
    {
      Object localObject = ((List)this.d.get(this.b)).get(this.c);
      this.c += 1;
      this.e.a(localObject);
      return true;
    }
    return false;
  }
  
  public void c()
  {
    this.b = 0;
    this.c = 0;
  }
  
  public boolean d()
  {
    if ((this.b < this.d.size()) && (this.c >= ((List)this.d.get(this.b)).size()))
    {
      this.b += 1;
      this.c = 0;
      return true;
    }
    return false;
  }
  
  public static abstract interface a<T>
  {
    public abstract boolean a(T paramT);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/flyplannermedia/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */