package com.tencent.open.a;

import android.os.Environment;
import android.text.TextUtils;
import com.tencent.open.utils.Global;
import java.io.File;

public class f
{
  public static f a = null;
  protected static final b c;
  public static final String d = c.a;
  protected a b = new a(c);
  
  static
  {
    int i = c.s;
    long l = c.t;
    c = new b(c(), i, c.m, c.n, c.h, c.o, 10, c.k, l);
  }
  
  public static f a()
  {
    if (a == null) {}
    try
    {
      if (a == null) {
        a = new f();
      }
      return a;
    }
    finally {}
  }
  
  public static final void a(String paramString1, String paramString2)
  {
    a().a(1, paramString1, paramString2, null);
  }
  
  public static final void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    a().a(2, paramString1, paramString2, paramThrowable);
  }
  
  public static void b()
  {
    try
    {
      a().d();
      if (a != null) {
        a = null;
      }
      return;
    }
    finally {}
  }
  
  public static final void b(String paramString1, String paramString2)
  {
    a().a(2, paramString1, paramString2, null);
  }
  
  public static final void b(String paramString1, String paramString2, Throwable paramThrowable)
  {
    a().a(16, paramString1, paramString2, paramThrowable);
  }
  
  protected static File c()
  {
    Object localObject2 = Global.getPackageName();
    Object localObject1 = localObject2;
    if (TextUtils.isEmpty((CharSequence)localObject2)) {
      localObject1 = "default";
    }
    localObject1 = c.i + File.separator + (String)localObject1;
    localObject2 = d.c.b();
    if ((localObject2 != null) && (((d.d)localObject2).c() > c.l)) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        return new File(Environment.getExternalStorageDirectory(), (String)localObject1);
      }
      return new File(Global.getFilesDir(), (String)localObject1);
    }
  }
  
  public static final void c(String paramString1, String paramString2)
  {
    a().a(4, paramString1, paramString2, null);
  }
  
  public static final void d(String paramString1, String paramString2)
  {
    a().a(8, paramString1, paramString2, null);
  }
  
  public static final void e(String paramString1, String paramString2)
  {
    a().a(16, paramString1, paramString2, null);
  }
  
  protected void a(int paramInt, String paramString1, String paramString2, Throwable paramThrowable)
  {
    e.a.b(paramInt, Thread.currentThread(), System.currentTimeMillis(), paramString1, paramString2, paramThrowable);
    if ((!d.a.a(c.c, paramInt)) || (this.b == null)) {
      return;
    }
    this.b.b(paramInt, Thread.currentThread(), System.currentTimeMillis(), paramString1, paramString2, paramThrowable);
  }
  
  protected void d()
  {
    if (this.b != null)
    {
      this.b.a();
      this.b.b();
      this.b = null;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/open/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */