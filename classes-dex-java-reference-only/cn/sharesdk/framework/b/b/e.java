package cn.sharesdk.framework.b.b;

import android.content.Context;
import android.text.TextUtils;

public class e
  extends c
{
  private static int b;
  private static long c;
  public long a;
  
  protected String a()
  {
    return "[EXT]";
  }
  
  protected void a(long paramLong)
  {
    c = paramLong;
  }
  
  public boolean a(Context paramContext)
  {
    cn.sharesdk.framework.b.a.e locale = cn.sharesdk.framework.b.a.e.a(paramContext);
    b = locale.g("insertExitEventCount");
    c = locale.f("lastInsertExitEventTime");
    return super.a(paramContext);
  }
  
  protected int b()
  {
    return 5000;
  }
  
  public void b(Context paramContext)
  {
    super.b(paramContext);
    paramContext = cn.sharesdk.framework.b.a.e.a(paramContext);
    paramContext.a("lastInsertExitEventTime", Long.valueOf(c));
    paramContext.a("insertExitEventCount", b);
  }
  
  protected int c()
  {
    return 5;
  }
  
  protected long d()
  {
    return b;
  }
  
  protected long e()
  {
    return c;
  }
  
  protected void f()
  {
    b += 1;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(super.toString());
    localStringBuilder.append('|');
    if (!TextUtils.isEmpty(this.m)) {
      localStringBuilder.append(this.m);
    }
    localStringBuilder.append('|').append(Math.round((float)this.a / 1000.0F));
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/cn/sharesdk/framework/b/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */