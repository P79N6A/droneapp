package com.fimi.soul.biz.e;

import android.text.TextUtils;
import com.fimi.kernel.utils.n;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.camera.entity.RelayEntity;
import com.fimi.soul.biz.update.l;
import com.fimi.soul.module.update.a.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class c
  implements com.fimi.kernel.b.c.d
{
  private static c b = new c();
  int a;
  private com.fimi.kernel.b.d.c c = (com.fimi.kernel.b.d.c)com.fimi.kernel.c.a(com.fimi.kernel.b.d.c);
  private String d;
  private String e;
  private JSONObject f = null;
  private List<a> g = new ArrayList();
  
  private c()
  {
    com.fimi.kernel.b.d.d locald = this.c.f();
    locald.a(com.fimi.soul.biz.camera.e.c());
    locald.a(8080);
    locald.b(10240);
    locald.b(true);
    locald.a(true);
    this.c.b(this);
  }
  
  public static c a()
  {
    try
    {
      if (b == null) {
        b = new c();
      }
      c localc = b;
      return localc;
    }
    finally {}
  }
  
  public void a(a parama)
  {
    this.g.add(parama);
  }
  
  public void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      RelayEntity localRelayEntity = new RelayEntity();
      l.c("msg:" + paramString);
      try
      {
        this.f = new JSONObject(paramString);
        this.f = new JSONObject(this.f.getJSONObject("system").toString());
        this.d = this.f.optString("device_type");
        localRelayEntity.setDevice_type(this.d);
        if ((TextUtils.isEmpty(this.e)) && (!TextUtils.isEmpty(this.f.getString("sw_version"))))
        {
          com.fimi.soul.module.update.a.a.a().a(new com.fimi.soul.module.update.a.e(this.e, 14, Integer.valueOf(n.n(this.f.getString("sw_version"))).intValue()));
          com.fimi.soul.module.update.a.a.a().a(14, Integer.valueOf(n.n(this.f.getString("sw_version"))).intValue());
        }
        this.e = this.f.getString("sw_version");
        if ((!TextUtils.isEmpty(this.e)) && (com.fimi.soul.module.update.a.a.a().b().get(Integer.valueOf(14)) == null))
        {
          com.fimi.soul.module.update.a.a.a().a(new com.fimi.soul.module.update.a.e(this.e, 14, Integer.valueOf(n.n(this.f.getString("sw_version"))).intValue()));
          com.fimi.soul.module.update.a.a.a().a(14, Integer.valueOf(n.n(this.f.getString("sw_version"))).intValue());
        }
        this.a = this.f.getInt("firmupg_finished");
        localRelayEntity.setFirmupg_finished(this.a);
        localRelayEntity.setSw_version(this.e);
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          paramString.printStackTrace();
        }
      }
      if ((this.g != null) && (this.g.size() > 0))
      {
        paramString = this.g.iterator();
        while (paramString.hasNext()) {
          ((a)paramString.next()).a(localRelayEntity);
        }
      }
    }
  }
  
  public void b()
  {
    x.a(new Runnable()
    {
      public void run()
      {
        c.a(c.this).d();
      }
    });
  }
  
  public void b(a parama)
  {
    this.g.remove(parama);
  }
  
  public int c()
  {
    return this.a;
  }
  
  public boolean d()
  {
    return this.a > 0;
  }
  
  public String e()
  {
    if (TextUtils.isEmpty(this.e))
    {
      b localb = (b)com.fimi.kernel.c.c().a("sp_firmware_cache", b.class);
      if (localb != null) {
        return localb.k() + "";
      }
    }
    return n.n(this.e) + "";
  }
  
  public com.fimi.kernel.b.d.c f()
  {
    return this.c;
  }
  
  public static abstract interface a
  {
    public abstract void a(RelayEntity paramRelayEntity);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */