package com.fimi.soul.module.a;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.Platform.ShareParams;
import cn.sharesdk.framework.PlatformActionListener;
import com.mob.tools.FakeActivity;
import java.util.ArrayList;
import java.util.HashMap;

public class c
  extends FakeActivity
{
  private e a;
  
  public c(e parame)
  {
    this.a = parame;
  }
  
  protected final void a(Platform paramPlatform)
  {
    this.a.b(paramPlatform);
  }
  
  protected final boolean a()
  {
    return this.a.a;
  }
  
  protected final Platform.ShareParams b(Platform paramPlatform)
  {
    if (this.a.c(paramPlatform)) {
      return this.a.d(paramPlatform);
    }
    return null;
  }
  
  protected final HashMap<String, Object> b()
  {
    return this.a.b;
  }
  
  protected final boolean c()
  {
    return this.a.c;
  }
  
  protected final boolean c(Platform paramPlatform)
  {
    return this.a.a(paramPlatform);
  }
  
  protected final ArrayList<a> d()
  {
    return this.a.d;
  }
  
  protected final HashMap<String, String> e()
  {
    return this.a.e;
  }
  
  protected final PlatformActionListener f()
  {
    return this.a.f;
  }
  
  protected final f g()
  {
    return this.a.g;
  }
  
  protected final boolean h()
  {
    return this.a.h;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */