package com.fimi.soul.biz.j;

import android.content.Context;
import android.content.res.Resources;
import com.fimi.kernel.d.b;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.ac;
import com.fimi.soul.drone.h.y;

public class e
  implements d.b
{
  private a a;
  private b b;
  private boolean c;
  private int d;
  private int e;
  private boolean f;
  
  public e(a parama)
  {
    this.a = parama;
    parama.a(this);
    this.b = b.b(parama.d);
  }
  
  private void a(y paramy)
  {
    boolean bool = true;
    for (;;)
    {
      try
      {
        if ((paramy.g() & 0xF) == 1) {
          if ((this.c) || (!bool) || (this.a.ac())) {}
        }
        switch (this.e)
        {
        case 0: 
          if ((this.c) && (!bool) && (!this.a.ac()))
          {
            if (!this.a.al().j()) {
              break label177;
            }
            a(a(2131362048));
          }
          if (this.c != bool) {
            this.c = bool;
          }
          return;
          bool = false;
          continue;
          a(a(2131362048));
          break;
        case 1: 
          a(a(2131362049));
        }
      }
      finally {}
      continue;
      a(a(2131362050));
      continue;
      label177:
      a(a(2131362673));
    }
  }
  
  private void c()
  {
    for (;;)
    {
      try
      {
        if (!this.f)
        {
          this.f = true;
          this.d = this.e;
        }
        if (this.d != this.e) {}
        switch (this.e)
        {
        case 0: 
          this.d = this.e;
          return;
        }
      }
      finally {}
      a(a(2131362064));
      continue;
      a(a(2131362065));
      continue;
      a(a(2131362066));
    }
  }
  
  public String a(int paramInt)
  {
    return this.a.d.getResources().getString(paramInt);
  }
  
  public void a()
  {
    this.a.b(this);
    this.c = false;
  }
  
  public void a(String paramString)
  {
    this.b.a(paramString);
  }
  
  public void b()
  {
    this.a.a(this);
  }
  
  public void onDroneEvent(d.a parama, a parama1)
  {
    switch (1.a[parama.ordinal()])
    {
    default: 
      return;
    }
    this.e = parama1.aj().d();
    parama = parama1.r();
    c();
    a(parama);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/j/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */