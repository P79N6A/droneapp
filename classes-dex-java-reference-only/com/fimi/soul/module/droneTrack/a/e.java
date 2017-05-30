package com.fimi.soul.module.droneTrack.a;

import com.fimi.kernel.utils.r;
import com.fimi.kernel.utils.x;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.ao;
import com.fimi.soul.drone.h.d;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.drone.h.y;
import com.fimi.soul.drone.h.z;
import com.fimi.soul.module.droneTrack.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class e
{
  private static final String c = com.fimi.soul.biz.h.c.a().b();
  int a = 0;
  LinkedHashMap<Integer, List<Object>> b;
  private volatile String d;
  private List<Object> e = new ArrayList();
  private volatile Object f;
  private boolean g;
  
  public Object a(int paramInt, f paramf)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 2: 
      localObject = new y();
      ((y)localObject).a(paramf.a(), paramf.a(), paramf.a(), paramf.a(), paramf.a(), paramf.b(), paramf.b(), paramf.b(), paramf.a(), paramf.a(), paramf.b(), paramf.b(), paramf.a(), paramf.a());
      return localObject;
    case 3: 
      localObject = new ag();
      ((ag)localObject).a(paramf.b(), paramf.a(), paramf.f(), paramf.f(), paramf.g(), paramf.f(), paramf.a());
      return localObject;
    case 4: 
      localObject = new z();
      ((z)localObject).a(paramf.f(), paramf.f(), paramf.g(), paramf.a(), paramf.a(), paramf.a(), paramf.a(), paramf.a(), paramf.a());
      return localObject;
    case 5: 
      localObject = new d();
      ((d)localObject).a(paramf.a(), paramf.a(), paramf.a(), paramf.a(), paramf.a(), paramf.a(), paramf.b(), paramf.b(), paramf.a(), paramf.a(), paramf.a(), paramf.a(), paramf.a());
      return localObject;
    case 7: 
      localObject = new com.fimi.soul.drone.h.a.b();
      ((com.fimi.soul.drone.h.a.b)localObject).a(paramf.a(), paramf.b(), paramf.f(), paramf.f(), paramf.a(), paramf.b(), paramf.a(), paramf.a(), paramf.a(), paramf.a(), paramf.a());
      return localObject;
    case 9: 
      localObject = new q();
      ((q)localObject).a(paramf.c(), paramf.c());
      return localObject;
    case 11: 
      localObject = new com.fimi.soul.drone.h.a.e();
      ((com.fimi.soul.drone.h.a.e)localObject).a(paramf.a(), paramf.a(), paramf.a(), paramf.a(), paramf.a(), paramf.a(), paramf.a());
      return localObject;
    case 99: 
      localObject = new ao();
      ((ao)localObject).a(paramf.a(), paramf.a(), paramf.a(), paramf.a(), paramf.a(), paramf.a());
      return localObject;
    case 198: 
      localObject = new com.fimi.soul.drone.h.e();
      ((com.fimi.soul.drone.h.e)localObject).a(paramf.b(), paramf.b(), paramf.b(), paramf.b(), paramf.b());
      b.a().a((com.fimi.soul.drone.h.e)localObject);
      return localObject;
    case 105: 
      localObject = new ad();
      ((ad)localObject).a(paramf.a());
      ((ad)localObject).h(paramf.b());
      ((ad)localObject).g(paramf.b());
      ((ad)localObject).f(paramf.b());
      ((ad)localObject).e(paramf.b());
      ((ad)localObject).d(paramf.b());
      ((ad)localObject).c(paramf.b());
      ((ad)localObject).b(paramf.b());
      ((ad)localObject).a(paramf.b());
      return localObject;
    }
    Object localObject = new com.fimi.soul.drone.h.c();
    ((com.fimi.soul.drone.h.c)localObject).a(paramf.a(), paramf.a(), paramf.a());
    b.a().a((com.fimi.soul.drone.h.c)localObject);
    return localObject;
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public void a(final String[] paramArrayOfString)
  {
    x.b(new Runnable()
    {
      public void run()
      {
        int i = 0;
        e.this.a(false);
        e.this.b = new LinkedHashMap();
        int j = paramArrayOfString.length;
        for (;;)
        {
          if (i < j)
          {
            Object localObject1 = r.a(paramArrayOfString[i], e.c());
            try
            {
              Object localObject2 = ((String)localObject1).substring(((String)localObject1).indexOf("fe"), ((String)localObject1).length()).replace(" ", "");
              int k = Integer.parseInt(((String)localObject2).substring(4, 6), 16);
              localObject2 = ((String)localObject2).substring(6, ((String)localObject2).length() - 4).toCharArray();
              localObject1 = ((String)localObject1).substring(0, ((String)localObject1).indexOf("fe") - 8);
              localObject2 = new f((char[])localObject2);
              if (e.a(e.this) == null) {
                e.a(e.this, (String)localObject1);
              }
              e.a(e.this, e.this.a(k, (f)localObject2));
              if (((String)localObject1).equals(e.a(e.this)))
              {
                if (e.b(e.this) != null)
                {
                  if ((e.b(e.this) instanceof com.fimi.soul.drone.h.a.e)) {}
                  e.c(e.this).add(e.b(e.this));
                }
              }
              else
              {
                localObject2 = e.this;
                ((e)localObject2).a += 1;
                e.a(e.this, (String)localObject1);
                localObject1 = new ArrayList();
                ((List)localObject1).addAll(e.c(e.this));
                e.this.b.put(Integer.valueOf(e.this.a), localObject1);
                e.c(e.this).clear();
                if (e.b(e.this) != null) {
                  e.c(e.this).add(e.b(e.this));
                }
              }
            }
            catch (Exception localException) {}
          }
          e.this.a(true);
          return;
          i += 1;
        }
      }
    });
  }
  
  public boolean a()
  {
    return this.g;
  }
  
  public LinkedHashMap<Integer, List<Object>> b()
  {
    return this.b;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneTrack/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */