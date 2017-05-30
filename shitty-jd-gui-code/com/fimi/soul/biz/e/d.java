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
import org.json.JSONException;
import org.json.JSONObject;

public class d
  implements com.fimi.kernel.b.c.d
{
  private static d b = new d();
  int a;
  private com.fimi.kernel.b.d.c c = (com.fimi.kernel.b.d.c)com.fimi.kernel.c.a(com.fimi.kernel.b.d.c);
  private String d;
  private String e;
  private volatile String f = "5G";
  private int g;
  private boolean h = false;
  private boolean i = false;
  private JSONObject j = null;
  private String k;
  private String l;
  private List<a> m = new ArrayList();
  
  private d()
  {
    com.fimi.kernel.b.d.d locald = this.c.f();
    locald.a(com.fimi.soul.biz.camera.e.b());
    locald.a(8080);
    locald.b(10240);
    locald.b(true);
    locald.a(true);
    this.c.b(this);
  }
  
  public static d a()
  {
    try
    {
      if (b == null) {
        b = new d();
      }
      d locald = b;
      return locald;
    }
    finally {}
  }
  
  private void f(String paramString)
  {
    try
    {
      paramString = (JSONObject)new JSONObject(paramString).get("fwdap");
      this.k = paramString.getString("ssid");
      this.l = paramString.getString("key");
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public void a(com.fimi.kernel.b.c.d paramd)
  {
    this.c.b(paramd);
  }
  
  public void a(a parama)
  {
    this.m.add(parama);
  }
  
  public void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      l.b(paramString);
      this.i = true;
      RelayEntity localRelayEntity = new RelayEntity();
      for (;;)
      {
        try
        {
          this.j = new JSONObject(paramString);
          String str1 = this.j.getJSONObject("system").toString();
          String str2 = this.j.getJSONObject("camera").toString();
          this.j = new JSONObject(str1);
          this.f = this.j.optString("device_type");
          localRelayEntity.setDevice_type(this.f);
          if ((TextUtils.isEmpty(this.d)) && (!TextUtils.isEmpty(this.j.getString("sw_version"))))
          {
            if (!"4K".equalsIgnoreCase(this.f)) {
              continue;
            }
            com.fimi.soul.module.update.a.a.a().a(new com.fimi.soul.module.update.a.e(this.e, 15, Integer.valueOf(n.n(this.j.getString("sw_version"))).intValue()));
            com.fimi.soul.module.update.a.a.a().a(15, Integer.valueOf(n.n(this.j.getString("sw_version"))).intValue());
          }
          this.d = this.j.getString("sw_version");
          this.e = this.j.getString("hw_version");
          this.a = this.j.getInt("firmupg_finished");
          localRelayEntity.setFirmupg_finished(this.a);
          localRelayEntity.setHw_version(this.e);
          localRelayEntity.setSw_version(this.d);
          this.j = new JSONObject(str2);
          this.g = this.j.getInt("quality");
          this.h = this.j.getBoolean("connected");
          localRelayEntity.setQuality(this.g);
          localRelayEntity.setIsConnectCamera(this.h);
          if (!paramString.contains("fwdap")) {
            continue;
          }
          f(paramString);
        }
        catch (JSONException paramString)
        {
          l.b("e:" + paramString.getMessage().toString());
          paramString.printStackTrace();
          continue;
          this.k = null;
          this.l = null;
          continue;
        }
        if ((this.m == null) || (this.m.size() <= 0)) {
          return;
        }
        paramString = this.m.iterator();
        if (!paramString.hasNext()) {
          return;
        }
        ((a)paramString.next()).a(localRelayEntity);
        continue;
        com.fimi.soul.module.update.a.a.a().a(new com.fimi.soul.module.update.a.e(this.e, 11, Integer.valueOf(n.n(this.j.getString("sw_version"))).intValue()));
        com.fimi.soul.module.update.a.a.a().a(11, Integer.valueOf(n.n(this.j.getString("sw_version"))).intValue());
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public void b()
  {
    this.c.g();
    this.c.d();
  }
  
  public void b(a parama)
  {
    this.m.remove(parama);
  }
  
  public void b(String paramString)
  {
    this.d = paramString;
  }
  
  public void b(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public void c()
  {
    x.a(new Runnable()
    {
      public void run()
      {
        d.a(d.this).d();
      }
    });
  }
  
  public void c(String paramString)
  {
    this.f = paramString;
  }
  
  public String d()
  {
    if (TextUtils.isEmpty(this.d))
    {
      b localb = (b)com.fimi.kernel.c.c().a("sp_firmware_cache", b.class);
      if (localb != null) {
        return localb.e() + "";
      }
    }
    return this.d;
  }
  
  public void d(String paramString)
  {
    this.l = paramString;
  }
  
  public String e()
  {
    return this.e;
  }
  
  public void e(String paramString)
  {
    this.k = paramString;
  }
  
  public int f()
  {
    return this.g;
  }
  
  public int g()
  {
    return this.a;
  }
  
  public boolean h()
  {
    return this.a > 0;
  }
  
  public boolean i()
  {
    return "4K".equalsIgnoreCase(this.f);
  }
  
  public boolean j()
  {
    return TextUtils.isEmpty(this.f);
  }
  
  public boolean k()
  {
    return "4K".equalsIgnoreCase(this.f);
  }
  
  public boolean l()
  {
    return "5G".equalsIgnoreCase(this.f);
  }
  
  public boolean m()
  {
    return this.h;
  }
  
  public boolean n()
  {
    return this.i;
  }
  
  public com.fimi.kernel.b.d.c o()
  {
    return this.c;
  }
  
  public String p()
  {
    return this.l;
  }
  
  public String q()
  {
    return this.k;
  }
  
  public static abstract interface a
  {
    public abstract void a(RelayEntity paramRelayEntity);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */