package org.c.a.b;

import b.b.n;
import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.c.b.d.e;
import org.c.e.h;
import org.c.e.i;
import org.c.e.j;
import org.c.e.l;
import org.c.f.g;

public class b
{
  private static final String a = "malformed JUnit 3 test class: ";
  private final c b;
  
  private b(File paramFile)
  {
    this.b = c.a(paramFile);
  }
  
  public static b a(File paramFile)
  {
    return new b(paramFile);
  }
  
  @Deprecated
  public static b a(String paramString)
  {
    return a(new File(paramString));
  }
  
  private i a(List<org.c.e.c> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(a((org.c.e.c)paramList.next()));
    }
    return new b.1(this, localArrayList);
  }
  
  private l a(org.c.e.c paramc)
  {
    if (paramc.toString().equals("TestSuite with 0 tests")) {
      return g.a();
    }
    if (paramc.toString().startsWith("malformed JUnit 3 test class: ")) {
      return new e(new n(b(paramc)));
    }
    Class localClass = paramc.i();
    if (localClass == null) {
      throw new RuntimeException("Can't build a runner from description [" + paramc + "]");
    }
    paramc = paramc.k();
    if (paramc == null) {
      return i.a(localClass).a();
    }
    return i.a(localClass, paramc).a();
  }
  
  private void a(org.c.e.c paramc1, org.c.e.c paramc2, List<org.c.e.c> paramList)
  {
    if (paramc2.b().isEmpty()) {
      if (paramc2.toString().equals("warning(junit.framework.TestSuite$1)")) {
        paramList.add(org.c.e.c.a("malformed JUnit 3 test class: " + paramc1, new Annotation[0]));
      }
    }
    for (;;)
    {
      return;
      paramList.add(paramc2);
      return;
      paramc1 = paramc2.b().iterator();
      while (paramc1.hasNext()) {
        a(paramc2, (org.c.e.c)paramc1.next(), paramList);
      }
    }
  }
  
  private Class<?> b(org.c.e.c paramc)
  {
    try
    {
      paramc = Class.forName(paramc.toString().replace("malformed JUnit 3 test class: ", ""));
      return paramc;
    }
    catch (ClassNotFoundException paramc) {}
    return null;
  }
  
  private List<org.c.e.c> d(i parami)
  {
    ArrayList localArrayList = new ArrayList();
    a(null, parami.a().d(), localArrayList);
    return localArrayList;
  }
  
  public j a(Class<?> paramClass)
  {
    return a(i.a(paramClass));
  }
  
  public j a(i parami)
  {
    return a(parami, new h());
  }
  
  public j a(i parami, h paramh)
  {
    paramh.a(this.b.a());
    return paramh.a(b(parami).a());
  }
  
  public i b(i parami)
  {
    if ((parami instanceof org.c.b.c.c)) {
      return parami;
    }
    parami = d(parami);
    Collections.sort(parami, this.b.b());
    return a(parami);
  }
  
  public List<org.c.e.c> c(i parami)
  {
    return d(b(parami));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */