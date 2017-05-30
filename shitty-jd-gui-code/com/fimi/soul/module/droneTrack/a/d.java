package com.fimi.soul.module.droneTrack.a;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class d
{
  private e a;
  private e b;
  private e c;
  private e d;
  private com.fimi.soul.module.droneTrack.e e;
  private Handler f = new Handler();
  private Runnable g = new Runnable()
  {
    public void run()
    {
      if ((d.a(d.this).a()) && (d.b(d.this).a()) && (d.c(d.this).a()) && (d.d(d.this).a()))
      {
        LinkedHashMap localLinkedHashMap = b.a().b();
        d.a(d.this).b().size();
        d.b(d.this).b().size();
        d.c(d.this).b().size();
        d.d(d.this).b().size();
        localLinkedHashMap.putAll(d.a(d.this).b());
        d.a(d.this, localLinkedHashMap, d.b(d.this).b());
        d.a(d.this, localLinkedHashMap, d.c(d.this).b());
        d.a(d.this, localLinkedHashMap, d.d(d.this).b());
        Collections.sort(new ArrayList(localLinkedHashMap.entrySet()), new Comparator()
        {
          public int a(Map.Entry<Integer, List<Object>> paramAnonymous2Entry1, Map.Entry<Integer, List<Object>> paramAnonymous2Entry2)
          {
            return ((Integer)paramAnonymous2Entry1.getKey()).intValue() - ((Integer)paramAnonymous2Entry2.getKey()).intValue();
          }
        });
        if (d.e(d.this) != null) {
          d.e(d.this).a();
        }
        return;
      }
      d.f(d.this).postDelayed(this, 1000L);
    }
  };
  
  public d(com.fimi.soul.module.droneTrack.e parame)
  {
    this.e = parame;
    this.a = new e();
    this.b = new e();
    this.c = new e();
    this.d = new e();
  }
  
  private void a(HashMap<Integer, List<Object>> paramHashMap1, HashMap<Integer, List<Object>> paramHashMap2)
  {
    int i = paramHashMap1.size();
    paramHashMap2 = paramHashMap2.entrySet().iterator();
    while (paramHashMap2.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramHashMap2.next();
      paramHashMap1.put(Integer.valueOf(((Integer)localEntry.getKey()).intValue() + i), localEntry.getValue());
    }
  }
  
  public e a()
  {
    return this.d;
  }
  
  public e b()
  {
    return this.c;
  }
  
  public e c()
  {
    return this.b;
  }
  
  public e d()
  {
    return this.a;
  }
  
  public void e()
  {
    this.f.post(this.g);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneTrack/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */