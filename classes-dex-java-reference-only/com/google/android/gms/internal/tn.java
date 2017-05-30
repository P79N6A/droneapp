package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

@aaa
public class tn
{
  private final int a;
  private final int b;
  private final int c;
  private final ts d;
  private final Object e = new Object();
  private ArrayList<String> f = new ArrayList();
  private ArrayList<String> g = new ArrayList();
  private int h = 0;
  private int i = 0;
  private int j = 0;
  private int k;
  private String l = "";
  private String m = "";
  
  public tn(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = new ts(paramInt4);
  }
  
  private String a(ArrayList<String> paramArrayList, int paramInt)
  {
    if (paramArrayList.isEmpty()) {
      paramArrayList = "";
    }
    Object localObject;
    do
    {
      return paramArrayList;
      localObject = new StringBuffer();
      paramArrayList = paramArrayList.iterator();
      do
      {
        if (!paramArrayList.hasNext()) {
          break;
        }
        ((StringBuffer)localObject).append((String)paramArrayList.next());
        ((StringBuffer)localObject).append(' ');
      } while (((StringBuffer)localObject).length() <= paramInt);
      ((StringBuffer)localObject).deleteCharAt(((StringBuffer)localObject).length() - 1);
      localObject = ((StringBuffer)localObject).toString();
      paramArrayList = (ArrayList<String>)localObject;
    } while (((String)localObject).length() < paramInt);
    return ((String)localObject).substring(0, paramInt);
  }
  
  private void c(@Nullable String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() < this.c)) {
      return;
    }
    synchronized (this.e)
    {
      this.f.add(paramString);
      this.h += paramString.length();
      if (paramBoolean) {
        this.g.add(paramString);
      }
      return;
    }
  }
  
  int a(int paramInt1, int paramInt2)
  {
    return this.a * paramInt1 + this.b * paramInt2;
  }
  
  public void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  public void a(String arg1, boolean paramBoolean)
  {
    c(???, paramBoolean);
    synchronized (this.e)
    {
      if (this.j < 0) {
        abr.a("ActivityContent: negative number of WebViews.");
      }
      g();
      return;
    }
  }
  
  public boolean a()
  {
    for (;;)
    {
      synchronized (this.e)
      {
        if (this.j == 0)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public String b()
  {
    return this.l;
  }
  
  public void b(String paramString, boolean paramBoolean)
  {
    c(paramString, paramBoolean);
  }
  
  public String c()
  {
    return this.m;
  }
  
  public void d()
  {
    synchronized (this.e)
    {
      this.k -= 100;
      return;
    }
  }
  
  public void e()
  {
    synchronized (this.e)
    {
      this.j -= 1;
      return;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof tn)) {}
    do
    {
      return false;
      if (paramObject == this) {
        return true;
      }
      paramObject = (tn)paramObject;
    } while ((((tn)paramObject).b() == null) || (!((tn)paramObject).b().equals(b())));
    return true;
  }
  
  public void f()
  {
    synchronized (this.e)
    {
      this.j += 1;
      return;
    }
  }
  
  public void g()
  {
    synchronized (this.e)
    {
      int n = a(this.h, this.i);
      if (n > this.k)
      {
        this.k = n;
        this.l = this.d.a(this.f);
        this.m = this.d.a(this.g);
      }
      return;
    }
  }
  
  public int h()
  {
    return this.k;
  }
  
  public int hashCode()
  {
    return b().hashCode();
  }
  
  int i()
  {
    return this.h;
  }
  
  public String toString()
  {
    int n = this.i;
    int i1 = this.k;
    int i2 = this.h;
    String str1 = String.valueOf(a(this.f, 100));
    String str2 = String.valueOf(a(this.g, 100));
    String str3 = this.l;
    String str4 = this.m;
    return String.valueOf(str1).length() + 133 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + "ActivityContent fetchId: " + n + " score:" + i1 + " total_length:" + i2 + "\n text: " + str1 + "\n viewableText" + str2 + "\n signture: " + str3 + "\n viewableSignture: " + str4;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/tn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */