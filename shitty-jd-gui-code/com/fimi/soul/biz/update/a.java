package com.fimi.soul.biz.update;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.fimi.kernel.b.a.a.a;
import com.fimi.kernel.b.d;
import com.fimi.kernel.b.e;
import com.fimi.soul.entity.APConfig;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.ServerResult;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.j;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class a
  extends c
{
  private static final String f = "KEY_APUPDATEBIZ_LASTEST_VERSION";
  private static final int g = 1;
  private static final String h = "ar934x_US";
  private static String k = "192.168.42.100";
  private static final String l = "192.168.42.150";
  private static final int q = 3;
  private com.fimi.kernel.b.a.b i = null;
  private com.fimi.kernel.b.e.b j = null;
  private String m;
  private long n;
  private long o;
  private int p;
  private boolean r = false;
  private com.fimi.soul.biz.e.b s = null;
  private i t;
  
  public a()
  {
    if (com.fimi.soul.biz.a.a.a().b() == 1) {
      return;
    }
    k = "192.168.100.1";
  }
  
  public static String c()
  {
    return j.p();
  }
  
  public static String d()
  {
    return String.format("%s%s", new Object[] { j.p(), "vmlinux_" });
  }
  
  protected void a(Message paramMessage)
  {
    super.a(paramMessage);
    if (paramMessage.what == 1) {
      if (paramMessage.arg1 != 1) {
        break label47;
      }
    }
    label47:
    for (int i1 = 1; i1 != 0; i1 = 0)
    {
      this.t.a(false, paramMessage.arg2, 100L, 0);
      return;
    }
    this.t.a(true, 0L, 0L, 0);
  }
  
  public void a(i parami)
  {
    if (i() == null)
    {
      parami.a(true, 0L, 0L, 0);
      return;
    }
    i().getUrl();
    this.m = d();
    a(i(), this.m, parami);
  }
  
  public void a(final i parami, Context paramContext, FirmwareInfo paramFirmwareInfo)
  {
    if (paramFirmwareInfo.getSysId() == 15) {
      this.m = String.format("%s/%s/%s", new Object[] { j.a(), "firmware", l.a(paramFirmwareInfo.getFileEncode(), paramFirmwareInfo.getVersion()) });
    }
    for (;;)
    {
      paramContext = new File(String.format("%s/%s", new Object[] { j.a(), "firmware" }));
      if (!paramContext.exists()) {
        paramContext.mkdir();
      }
      new File(this.m);
      if (new File(this.m).isFile()) {
        break;
      }
      parami.a(true, 0L, 0L, 0);
      return;
      if (paramFirmwareInfo.getSysId() == 14) {
        this.m = String.format("%s/%s/%s", new Object[] { j.a(), "firmware", l.b(paramFirmwareInfo.getFileEncode(), paramFirmwareInfo.getVersion()) });
      } else {
        this.m = String.format("%s/%s/%s", new Object[] { j.a(), "firmware", l.a(paramFirmwareInfo.getFileEncode()) });
      }
    }
    if (this.i != null)
    {
      this.i.h();
      this.i = null;
    }
    this.i = ((com.fimi.kernel.b.a.b)com.fimi.kernel.c.a(d.a));
    paramContext = this.i.c();
    if (paramFirmwareInfo.getSysId() == 14)
    {
      paramContext.a(true);
      paramContext.a("192.168.42.150");
    }
    for (;;)
    {
      paramContext.a(21);
      this.i.a(new com.fimi.kernel.b.c.b()
      {
        public void a(boolean paramAnonymousBoolean, String paramAnonymousString)
        {
          if (!paramAnonymousBoolean)
          {
            parami.a(true, 0L, 0L, 0);
            return;
          }
          paramAnonymousString = new File(a.e(a.this));
          a.a(a.this, paramAnonymousString.length());
          a.b(a.this, 0L);
          a.h(a.this).b(paramAnonymousString, new com.fimi.kernel.b.a.a()
          {
            public void a(a.a paramAnonymous2a, int paramAnonymous2Int)
            {
              a.b(a.this, a.f(a.this) + paramAnonymous2Int);
              if ((paramAnonymous2a == a.a.d) || (paramAnonymous2a == a.a.c)) {}
              for (boolean bool = true;; bool = false)
              {
                a.4.this.a.a(bool, a.f(a.this), a.g(a.this), 0);
                return;
              }
            }
          });
        }
      });
      return;
      paramContext.a(k);
    }
  }
  
  public void a(final k<UpdateVersonBean> paramk)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getDeviceVersion"));
    ((List)localObject).add(new BasicNameValuePair("sysID", "5"));
    ((List)localObject).add(new BasicNameValuePair("modelName", "ar934x_US"));
    NetUtil.a((List)localObject, com.fimi.kernel.c.a());
    localObject = String.format("%s?%s", new Object[] { "https://fimiservice-us.mi-ae.com/android/fimi.service", URLEncodedUtils.format((List)localObject, "UTF-8") });
    Log.d("Good", "请求url:" + (String)localObject);
    this.j.a((String)localObject, new e()
    {
      public void a(String paramAnonymousString)
      {
        Log.d("Good", paramAnonymousString);
        if ((paramAnonymousString != null) && (paramAnonymousString.length() > 0)) {}
        try
        {
          paramAnonymousString = (ServerResult)a.this.g().fromJson(paramAnonymousString, new TypeToken() {}.getType());
          if (paramAnonymousString != null)
          {
            a.this.b((UpdateVersonBean)paramAnonymousString.getData());
            a.this.c(a.this.i());
            paramk.a(paramAnonymousString.getData());
            return;
          }
        }
        catch (Exception paramAnonymousString)
        {
          paramk.a(a.this.j());
        }
      }
      
      public void b(String paramAnonymousString)
      {
        paramk.a(a.this.j());
      }
    });
  }
  
  public void a(InputStream paramInputStream, String paramString)
  {
    try
    {
      paramString = new FileOutputStream(paramString, true);
      byte[] arrayOfByte = new byte[512000];
      for (;;)
      {
        int i1 = paramInputStream.read(arrayOfByte, 0, 512000);
        if (i1 == -1) {
          break;
        }
        paramString.write(arrayOfByte, 0, i1);
      }
      paramString.close();
    }
    catch (Exception paramInputStream)
    {
      paramInputStream.printStackTrace();
      return;
    }
    paramInputStream.close();
  }
  
  public void b(i parami)
  {
    if (this.i != null) {
      this.i.h();
    }
    this.t = parami;
    a(new Runnable()
    {
      public void run()
      {
        a.a(a.this, 0);
        a.a(a.this, true);
        String str = String.format("http://%s:8080/upgrade", new Object[] { a.f() });
        while (a.a(a.this)) {
          try
          {
            a.d(a.this).a(str, new e()
            {
              public void a(String paramAnonymous2String)
              {
                Log.d("Good", paramAnonymous2String);
                try
                {
                  int i = Integer.parseInt(paramAnonymous2String.trim().replace("\n", ""));
                  paramAnonymous2String = new Message();
                  paramAnonymous2String.what = 1;
                  if (i < 100)
                  {
                    paramAnonymous2String.arg1 = 1;
                    paramAnonymous2String.arg2 = i;
                  }
                  for (;;)
                  {
                    a.b(a.this).sendMessage(paramAnonymous2String);
                    return;
                    paramAnonymous2String.arg1 = 0;
                    paramAnonymous2String.arg2 = 0;
                    a.a(a.this, false);
                  }
                  return;
                }
                catch (Exception paramAnonymous2String)
                {
                  Log.d("Good", "Error");
                  a.c(a.this);
                }
              }
              
              public void b(String paramAnonymous2String)
              {
                a.c(a.this);
              }
            });
            Thread.sleep(500L);
          }
          catch (InterruptedException localInterruptedException)
          {
            localInterruptedException.printStackTrace();
          }
        }
      }
    });
  }
  
  public void b(final k<UpdateVersonBean> paramk)
  {
    this.s.b(new e()
    {
      public void a(APConfig paramAnonymousAPConfig)
      {
        UpdateVersonBean localUpdateVersonBean = new UpdateVersonBean();
        if ((paramAnonymousAPConfig != null) && (paramAnonymousAPConfig.getVersion() != null))
        {
          paramAnonymousAPConfig = paramAnonymousAPConfig.getVersion().split("_");
          localUpdateVersonBean.setNewVersion(paramAnonymousAPConfig[(paramAnonymousAPConfig.length - 1)]);
          a.this.a(localUpdateVersonBean);
        }
        paramk.a(localUpdateVersonBean);
      }
      
      public void b(APConfig paramAnonymousAPConfig)
      {
        paramk.a(new UpdateVersonBean());
      }
    });
  }
  
  public boolean b()
  {
    if ((i() != null) && (h() != null)) {
      try
      {
        int i1 = Integer.parseInt(i().getNewVersion());
        int i2 = Integer.parseInt(h().getNewVersion());
        if (i1 > i2) {
          return true;
        }
      }
      catch (Exception localException) {}
    }
    return false;
  }
  
  public void e()
  {
    try
    {
      if (this.i != null) {
        this.i.h();
      }
      return;
    }
    catch (Exception localException)
    {
      l.b("e:" + localException.getMessage().toString());
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/update/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */