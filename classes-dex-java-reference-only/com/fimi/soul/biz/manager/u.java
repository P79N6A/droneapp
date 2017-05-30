package com.fimi.soul.biz.manager;

import android.content.Context;
import android.util.Log;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.x;
import com.fimi.soul.entity.FdsMsg;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

public class u
{
  private static u d;
  g a;
  b b;
  private Context c;
  private LinkedList<File> e = new LinkedList();
  private com.fimi.soul.drone.e.a f;
  
  public u(Context paramContext)
  {
    this.c = paramContext;
  }
  
  public static u a(Context paramContext)
  {
    if (d == null) {
      d = new u(paramContext);
    }
    return d;
  }
  
  private void a(FdsMsg paramFdsMsg, final File paramFile, com.fimi.soul.drone.e.a parama)
  {
    final ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("commandCode", "uploadFlyLog"));
    if (com.fimi.soul.base.a.b(this.c).getUserID() != null)
    {
      parama = com.fimi.soul.base.a.b(this.c).getUserID();
      localArrayList.add(new BasicNameValuePair("userID", parama));
      localArrayList.add(new BasicNameValuePair("planeSsid", com.fimi.soul.module.update.a.a.a().a(0).i()));
      localArrayList.add(new BasicNameValuePair("binVersion", com.fimi.soul.module.update.a.a.a().a(0).b() + ""));
      localArrayList.add(new BasicNameValuePair("fileFdsUrl", paramFdsMsg.getUrl()));
      localArrayList.add(new BasicNameValuePair("currentTime", ao.b(System.currentTimeMillis())));
      paramFdsMsg = paramFile.getParentFile().getName();
      if (!paramFdsMsg.equals("NoFly")) {
        break label376;
      }
      localArrayList.add(new BasicNameValuePair("isInSky", "1"));
      label222:
      localArrayList.add(new BasicNameValuePair("appType", "0"));
      if (!paramFile.getName().endsWith(".sf")) {
        break label429;
      }
      localArrayList.add(new BasicNameValuePair("flyLogType", "2"));
    }
    for (;;)
    {
      paramFdsMsg = paramFile.getName().substring(0, paramFile.getName().lastIndexOf(".")).split(" ");
      if ((paramFdsMsg != null) && (paramFdsMsg.length > 0)) {
        localArrayList.add(new BasicNameValuePair("createFlieTime", paramFdsMsg[0] + " " + paramFdsMsg[1].replace('-', ':')));
      }
      x.b(new Runnable()
      {
        public void run()
        {
          String str = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", localArrayList, u.b(u.this));
          PlaneMsg localPlaneMsg = new PlaneMsg();
          localPlaneMsg.setFile(paramFile);
          try
          {
            if ("true".equals(new JSONObject(str).getString("success")))
            {
              if (u.this.b != null)
              {
                localPlaneMsg.setSuccess(true);
                u.this.b.a(localPlaneMsg, paramFile.getPath());
                return;
              }
              localPlaneMsg.setSuccess(false);
              u.this.b.a(localPlaneMsg, paramFile.getPath());
              return;
            }
          }
          catch (Exception localException)
          {
            Log.e("good", localException.toString());
            localPlaneMsg.setSuccess(false);
            u.this.b.a(localPlaneMsg, paramFile.getPath());
          }
        }
      });
      return;
      parama = "000";
      break;
      label376:
      if (paramFdsMsg.equals("AirFly"))
      {
        localArrayList.add(new BasicNameValuePair("isInSky", "0"));
        break label222;
      }
      localArrayList.add(new BasicNameValuePair("isInSky", "0"));
      break label222;
      label429:
      localArrayList.add(new BasicNameValuePair("flyLogType", "0"));
    }
  }
  
  public void a()
  {
    int j = 0;
    for (;;)
    {
      int i;
      try
      {
        File localFile1 = new File(j.a() + "/fw_upgrade/FMLink_Up_Log/");
        localFile1.mkdirs();
        File[] arrayOfFile;
        int k;
        File localFile2;
        if (localFile1.exists())
        {
          arrayOfFile = localFile1.listFiles();
          k = arrayOfFile.length;
          i = 0;
          if (i < k)
          {
            localFile2 = arrayOfFile[i];
            if (localFile2 != null)
            {
              localFile2 = new File(localFile1, localFile2.getName());
              if ((localFile2 != null) && (localFile2.exists())) {
                localFile2.delete();
              }
            }
          }
          else
          {
            localFile1.delete();
          }
        }
        else
        {
          localFile1 = new File(j.a() + "/fw_upgrade/FMLink_Down_Log/");
          localFile1.mkdirs();
          if (localFile1.exists())
          {
            arrayOfFile = localFile1.listFiles();
            k = arrayOfFile.length;
            i = 0;
            if (i < k)
            {
              localFile2 = arrayOfFile[i];
              if (localFile2 == null) {
                break label383;
              }
              localFile2 = new File(localFile1, localFile2.getName());
              if ((localFile2 == null) || (!localFile2.exists())) {
                break label383;
              }
              localFile2.delete();
              break label383;
            }
            localFile1.delete();
          }
          localFile1 = new File(ao.o(this.c));
          if (localFile1.exists()) {
            localFile1.delete();
          }
          localFile1 = new File(j.a() + "/" + "SAVEDRONEINFO/");
          localFile1.mkdirs();
          if (localFile1.exists())
          {
            arrayOfFile = localFile1.listFiles();
            k = arrayOfFile.length;
            i = j;
            if (i < k)
            {
              localFile2 = arrayOfFile[i];
              if ((localFile2 == null) || (!localFile2.exists())) {
                break label390;
              }
              localFile2.delete();
              break label390;
            }
            localFile1.delete();
          }
          return;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return;
      }
      i += 1;
      continue;
      label383:
      i += 1;
      continue;
      label390:
      i += 1;
    }
  }
  
  public void a(g paramg)
  {
    this.a = paramg;
  }
  
  public void a(b paramb)
  {
    this.b = paramb;
  }
  
  public void a(File paramFile)
  {
    f.a(this.c).a(paramFile, new a());
  }
  
  public void b()
  {
    this.e.clear();
    this.f = ((com.fimi.soul.drone.e.a)c.c().a("0", com.fimi.soul.drone.e.a.class));
    if (this.f != null) {
      new StringBuilder().append(this.f.d()).append("").append(this.f.e()).append("").append(this.f.g()).toString();
    }
    File localFile1 = new File(j.a() + "/" + "SAVEDRONEINFO/");
    localFile1.mkdirs();
    if ((localFile1.exists()) && (ao.c(this.c)))
    {
      File[] arrayOfFile = localFile1.listFiles();
      int j = arrayOfFile.length;
      int i = 0;
      while (i < j)
      {
        File localFile2 = arrayOfFile[i];
        if (localFile2 != null)
        {
          localFile2 = new File(localFile1, localFile2.getName());
          if ((localFile2 != null) && (localFile2.exists())) {
            localFile2.delete();
          }
        }
        i += 1;
      }
      localFile1.delete();
    }
  }
  
  public void b(File paramFile)
  {
    f.a(this.c).a(paramFile);
  }
  
  public void c()
  {
    f.a(this.c).a();
  }
  
  public void c(File paramFile)
  {
    f.a(this.c).b(paramFile, new a());
  }
  
  public b d()
  {
    return this.b;
  }
  
  public void d(File paramFile)
  {
    f.a(this.c).b(paramFile);
  }
  
  class a
    implements com.fimi.soul.biz.m.e
  {
    a() {}
    
    public void a(long paramLong1, long paramLong2, String paramString)
    {
      if ((u.this.a != null) && (paramLong2 / 100L != 0L)) {
        u.this.a.a((int)(paramLong1 / (paramLong2 / 100L)), paramString);
      }
    }
    
    public void a(PlaneMsg paramPlaneMsg, File paramFile)
    {
      FdsMsg localFdsMsg = (FdsMsg)paramPlaneMsg.getData();
      if (u.a(u.this) == null) {
        u.a(u.this, (com.fimi.soul.drone.e.a)c.c().a("0", com.fimi.soul.drone.e.a.class));
      }
      if (com.fimi.soul.base.a.b(u.b(u.this)).getUserID() == null) {}
      do
      {
        return;
        if (paramPlaneMsg.isSuccess()) {
          u.a(u.this, localFdsMsg, paramFile, u.a(u.this));
        }
      } while (u.this.b == null);
      u.this.b.a(paramPlaneMsg, paramFile.getPath());
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(PlaneMsg paramPlaneMsg, String paramString);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */