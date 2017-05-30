package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.util.e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@aaa
public class un
{
  boolean a;
  private final List<ul> b = new LinkedList();
  private final Map<String, String> c = new LinkedHashMap();
  private final Object d = new Object();
  private String e;
  private ul f;
  @Nullable
  private un g;
  
  public un(boolean paramBoolean, String paramString1, String paramString2)
  {
    this.a = paramBoolean;
    this.c.put("action", paramString1);
    this.c.put("ad_format", paramString2);
  }
  
  public ul a()
  {
    return a(u.k().b());
  }
  
  @Nullable
  public ul a(long paramLong)
  {
    if (!this.a) {
      return null;
    }
    return new ul(paramLong, null, null);
  }
  
  public void a(@Nullable un paramun)
  {
    synchronized (this.d)
    {
      this.g = paramun;
      return;
    }
  }
  
  public void a(String paramString)
  {
    if (!this.a) {
      return;
    }
    synchronized (this.d)
    {
      this.e = paramString;
      return;
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    if ((!this.a) || (TextUtils.isEmpty(paramString2))) {}
    uh localuh;
    do
    {
      return;
      localuh = u.i().e();
    } while (localuh == null);
    synchronized (this.d)
    {
      localuh.a(paramString1).a(this.c, paramString1, paramString2);
      return;
    }
  }
  
  public boolean a(ul paramul, long paramLong, String... paramVarArgs)
  {
    synchronized (this.d)
    {
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        ul localul = new ul(paramLong, paramVarArgs[i], paramul);
        this.b.add(localul);
        i += 1;
      }
      return true;
    }
  }
  
  public boolean a(@Nullable ul paramul, String... paramVarArgs)
  {
    if ((!this.a) || (paramul == null)) {
      return false;
    }
    return a(paramul, u.k().b(), paramVarArgs);
  }
  
  public void b()
  {
    synchronized (this.d)
    {
      this.f = a();
      return;
    }
  }
  
  public String c()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    synchronized (this.d)
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        ul localul = (ul)localIterator.next();
        long l1 = localul.a();
        String str2 = localul.b();
        localul = localul.c();
        if ((localul != null) && (l1 > 0L))
        {
          long l2 = localul.a();
          localStringBuilder.append(str2).append('.').append(l1 - l2).append(',');
        }
      }
    }
    this.b.clear();
    if (!TextUtils.isEmpty(this.e)) {
      ((StringBuilder)localObject2).append(this.e);
    }
    for (;;)
    {
      String str1 = ((StringBuilder)localObject2).toString();
      return str1;
      if (str1.length() > 0) {
        str1.setLength(str1.length() - 1);
      }
    }
  }
  
  Map<String, String> d()
  {
    synchronized (this.d)
    {
      Object localObject2 = u.i().e();
      if ((localObject2 == null) || (this.g == null))
      {
        localObject2 = this.c;
        return (Map<String, String>)localObject2;
      }
      localObject2 = ((uh)localObject2).a(this.c, this.g.d());
      return (Map<String, String>)localObject2;
    }
  }
  
  public ul e()
  {
    synchronized (this.d)
    {
      ul localul = this.f;
      return localul;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/un.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */