package cn.sharesdk.framework.b.b;

import android.content.Context;
import android.text.TextUtils;
import cn.sharesdk.framework.b.a.e;

public class g
  extends c
{
  private static int a;
  private static long b;
  
  protected String a()
  {
    return "[RUN]";
  }
  
  protected void a(long paramLong)
  {
    b = paramLong;
  }
  
  public boolean a(Context paramContext)
  {
    e locale = e.a(paramContext);
    a = locale.g("insertRunEventCount");
    b = locale.f("lastInsertRunEventTime");
    return super.a(paramContext);
  }
  
  protected int b()
  {
    return 5000;
  }
  
  public void b(Context paramContext)
  {
    super.b(paramContext);
    paramContext = e.a(paramContext);
    paramContext.a("lastInsertRunEventTime", Long.valueOf(b));
    paramContext.a("insertRunEventCount", a);
  }
  
  protected int c()
  {
    return 5;
  }
  
  protected long d()
  {
    return a;
  }
  
  protected long e()
  {
    return b;
  }
  
  protected void f()
  {
    a += 1;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(super.toString());
    localStringBuilder.append('|');
    if (!TextUtils.isEmpty(this.m)) {
      localStringBuilder.append(this.m);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/cn/sharesdk/framework/b/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */