package org.c.f.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.c.f.a.k;

public class d
{
  private final String a;
  private final k b;
  private final List<Object> c;
  
  public d(String paramString, k paramk, List<Object> paramList)
  {
    a(paramString, "The name is missing.");
    a(paramk, "The test class is missing.");
    a(paramList, "The parameters are missing.");
    this.a = paramString;
    this.b = paramk;
    this.c = Collections.unmodifiableList(new ArrayList(paramList));
  }
  
  private static void a(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      throw new NullPointerException(paramString);
    }
  }
  
  public String a()
  {
    return this.a;
  }
  
  public k b()
  {
    return this.b;
  }
  
  public List<Object> c()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      paramObject = (d)paramObject;
    } while ((this.a.equals(((d)paramObject).a)) && (this.c.equals(((d)paramObject).c)) && (this.b.equals(((d)paramObject).b)));
    return false;
  }
  
  public int hashCode()
  {
    return 14747 * ((this.a.hashCode() + 14747) * 14747 + this.b.hashCode()) + this.c.hashCode();
  }
  
  public String toString()
  {
    return this.b.e() + " '" + this.a + "' with parameters " + this.c;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/f/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */