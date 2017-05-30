package org.b.a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.b.b;
import org.b.g;
import org.b.i;
import org.b.k;

public class d<T>
  extends b<T>
{
  private static final Pattern d = Pattern.compile("%([0-9]+)");
  private final String a;
  private final k<T> b;
  private final Object[] c;
  
  public d(String paramString, k<T> paramk, Object[] paramArrayOfObject)
  {
    this.a = paramString;
    this.b = paramk;
    this.c = ((Object[])paramArrayOfObject.clone());
  }
  
  @i
  public static <T> k<T> a(String paramString, k<T> paramk, Object... paramVarArgs)
  {
    return new d(paramString, paramk, paramVarArgs);
  }
  
  public void a(Object paramObject, g paramg)
  {
    this.b.a(paramObject, paramg);
  }
  
  public void a(g paramg)
  {
    Matcher localMatcher = d.matcher(this.a);
    for (int i = 0; localMatcher.find(); i = localMatcher.end())
    {
      paramg.a(this.a.substring(i, localMatcher.start()));
      paramg.a(this.c[Integer.parseInt(localMatcher.group(1))]);
    }
    if (i < this.a.length()) {
      paramg.a(this.a.substring(i));
    }
  }
  
  public boolean a(Object paramObject)
  {
    return this.b.a(paramObject);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/b/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */