package com.fimi.kernel.b.b;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c
  implements b.d
{
  private static int c = 3;
  private static c d;
  private static List<b> e;
  List<String> a;
  private a b;
  private b f;
  private Context g;
  private String h;
  
  public static c a(Context paramContext)
  {
    try
    {
      if (d == null)
      {
        d = new c();
        d.g = paramContext;
      }
      d.g = paramContext;
      paramContext = d;
      return paramContext;
    }
    finally {}
  }
  
  private boolean b(b paramb)
  {
    paramb.a(paramb);
    String str = paramb.m();
    Iterator localIterator = e.iterator();
    while (localIterator.hasNext()) {
      if (((b)localIterator.next()).m().equals(str))
      {
        e.remove(paramb);
        if (this.f != null) {
          this.f.a(e, false, paramb);
        }
        return true;
      }
    }
    return false;
  }
  
  public b a(Context paramContext, String paramString)
  {
    b localb = null;
    Object localObject;
    if (paramString == null)
    {
      localObject = null;
      return (b)localObject;
    }
    for (;;)
    {
      int i;
      try
      {
        if (e == null) {
          break label281;
        }
        i = 0;
        if (i >= e.size()) {
          break label300;
        }
        if ((!((b)e.get(i)).b().equals(paramString)) && (!((b)e.get(i)).m().equals(paramString))) {
          break label274;
        }
        localb = (b)e.get(i);
      }
      finally {}
      if ((this.a == null) || (this.a.size() > 0)) {
        this.a = f.a(paramContext).a();
      }
      if ((this.a != null) && (this.a.size() > 0))
      {
        localObject = this.a.iterator();
        if (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          if ((!str.endsWith(paramString)) && (!str.equals(paramString))) {
            continue;
          }
          paramContext = f.a(paramContext).a(paramContext, str, new f.a()
          {
            public void a(b paramAnonymousb)
            {
              if ((paramAnonymousb != null) && (c.this.b() < c.f())) {
                paramAnonymousb.c();
              }
            }
          });
          localObject = paramContext;
          if (paramContext == null) {
            break;
          }
          e.add(paramContext);
          paramContext.b(this);
          localObject = paramContext;
          if (this.f == null) {
            break;
          }
          this.f.a(e, true, paramContext);
          localObject = paramContext;
          break;
          label274:
          i += 1;
          continue;
          label281:
          e = new ArrayList();
          continue;
        }
      }
      paramContext = localb;
      continue;
      label300:
      localb = null;
      localObject = localb;
      if (localb != null) {
        break;
      }
    }
  }
  
  public void a()
  {
    if ((e != null) && (e.size() == 0)) {
      f.a(this.g).c();
    }
  }
  
  public void a(b.a parama, b paramb)
  {
    if ((parama != b.a.e) || (paramb.m().equals(this.h))) {
      return;
    }
    this.h = paramb.m();
    int i = b();
    if (this.b != null) {
      this.b.a(paramb, i);
    }
    c();
  }
  
  public void a(a parama)
  {
    this.b = parama;
  }
  
  public void a(b paramb)
  {
    this.f = paramb;
  }
  
  /* Error */
  public void a(String paramString1, String paramString2, long paramLong, Boolean paramBoolean, String paramString3)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 60	com/fimi/kernel/b/b/c:e	Ljava/util/List;
    //   5: ifnonnull +13 -> 18
    //   8: new 127	java/util/ArrayList
    //   11: dup
    //   12: invokespecial 128	java/util/ArrayList:<init>	()V
    //   15: putstatic 60	com/fimi/kernel/b/b/c:e	Ljava/util/List;
    //   18: getstatic 60	com/fimi/kernel/b/b/c:e	Ljava/util/List;
    //   21: invokeinterface 94 1 0
    //   26: iconst_1
    //   27: isub
    //   28: istore 7
    //   30: iload 7
    //   32: iflt +77 -> 109
    //   35: getstatic 60	com/fimi/kernel/b/b/c:e	Ljava/util/List;
    //   38: iload 7
    //   40: invokeinterface 98 2 0
    //   45: checkcast 51	com/fimi/kernel/b/b/b
    //   48: invokevirtual 58	com/fimi/kernel/b/b/b:m	()Ljava/lang/String;
    //   51: aload_1
    //   52: invokevirtual 82	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   55: ifeq +94 -> 149
    //   58: getstatic 60	com/fimi/kernel/b/b/c:e	Ljava/util/List;
    //   61: iload 7
    //   63: invokeinterface 98 2 0
    //   68: checkcast 51	com/fimi/kernel/b/b/b
    //   71: getstatic 60	com/fimi/kernel/b/b/c:e	Ljava/util/List;
    //   74: iload 7
    //   76: invokeinterface 98 2 0
    //   81: checkcast 51	com/fimi/kernel/b/b/b
    //   84: invokevirtual 54	com/fimi/kernel/b/b/b:a	(Lcom/fimi/kernel/b/b/b;)V
    //   87: getstatic 60	com/fimi/kernel/b/b/c:e	Ljava/util/List;
    //   90: iload 7
    //   92: invokeinterface 151 2 0
    //   97: pop
    //   98: aload_0
    //   99: getfield 48	com/fimi/kernel/b/b/c:g	Landroid/content/Context;
    //   102: invokestatic 107	com/fimi/kernel/b/b/f:a	(Landroid/content/Context;)Lcom/fimi/kernel/b/b/f;
    //   105: aload_1
    //   106: invokevirtual 154	com/fimi/kernel/b/b/f:d	(Ljava/lang/String;)V
    //   109: aload_0
    //   110: getfield 48	com/fimi/kernel/b/b/c:g	Landroid/content/Context;
    //   113: aload_1
    //   114: aload_2
    //   115: lload_3
    //   116: aload 5
    //   118: aload 6
    //   120: new 10	com/fimi/kernel/b/b/c$2
    //   123: dup
    //   124: aload_0
    //   125: invokespecial 155	com/fimi/kernel/b/b/c$2:<init>	(Lcom/fimi/kernel/b/b/c;)V
    //   128: invokestatic 158	com/fimi/kernel/b/b/b:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Boolean;Ljava/lang/String;Lcom/fimi/kernel/b/b/b$e;)Lcom/fimi/kernel/b/b/b;
    //   131: astore_1
    //   132: aload_1
    //   133: ifnull +13 -> 146
    //   136: getstatic 60	com/fimi/kernel/b/b/c:e	Ljava/util/List;
    //   139: aload_1
    //   140: invokeinterface 122 2 0
    //   145: pop
    //   146: aload_0
    //   147: monitorexit
    //   148: return
    //   149: iload 7
    //   151: iconst_1
    //   152: isub
    //   153: istore 7
    //   155: goto -125 -> 30
    //   158: astore_1
    //   159: aload_0
    //   160: monitorexit
    //   161: aload_1
    //   162: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	this	c
    //   0	163	1	paramString1	String
    //   0	163	2	paramString2	String
    //   0	163	3	paramLong	long
    //   0	163	5	paramBoolean	Boolean
    //   0	163	6	paramString3	String
    //   28	126	7	i	int
    // Exception table:
    //   from	to	target	type
    //   2	18	158	finally
    //   18	30	158	finally
    //   35	109	158	finally
    //   109	132	158	finally
    //   136	146	158	finally
  }
  
  public boolean a(b paramb)
  {
    if (paramb != null)
    {
      f.a(this.g).d(paramb.m());
      return b(paramb);
    }
    return false;
  }
  
  public int b()
  {
    int i = 0;
    for (;;)
    {
      try
      {
        Iterator localIterator = e.iterator();
        if (localIterator.hasNext())
        {
          b.a locala1 = ((b)localIterator.next()).g();
          b.a locala2 = b.a.d;
          if (locala1 == locala2) {
            i += 1;
          }
        }
        else
        {
          return i;
        }
      }
      finally {}
    }
  }
  
  public void c()
  {
    if (b() < c)
    {
      Iterator localIterator = e.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (localb.g() == b.a.c) {
          localb.c();
        }
      }
    }
  }
  
  public void d()
  {
    if ((e != null) && (e.size() > 0))
    {
      Iterator localIterator = e.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if ((localb.g() == b.a.d) || (localb.g() == b.a.c)) {
          localb.e();
        }
      }
    }
  }
  
  public void e()
  {
    if ((e != null) && (e.size() > 0))
    {
      Iterator localIterator = e.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (localb.g() == b.a.b) {
          if (b() < c) {
            localb.c();
          } else {
            localb.d();
          }
        }
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(b paramb, int paramInt);
  }
  
  public static abstract interface b
  {
    public abstract void a(List<b> paramList, boolean paramBoolean, b paramb);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/b/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */