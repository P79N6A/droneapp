package com.fimi.soul.biz.camera.c;

import android.util.Log;
import com.fimi.kernel.utils.f;
import com.fimi.kernel.utils.u;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.c;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.biz.camera.entity.BaseX11Cmd;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11FileSystem;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.update.i;
import com.fimi.soul.biz.update.l;
import com.fimi.soul.utils.j;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

public class d
  extends a
{
  private static final String c = ;
  private i a;
  private boolean b;
  
  public d(c paramc)
  {
    super(paramc);
  }
  
  private void a(X11FileSystem paramX11FileSystem, X11RespCmd paramX11RespCmd)
  {
    paramX11FileSystem = paramX11FileSystem.getCurDownloadFile();
    if (paramX11FileSystem != null)
    {
      paramX11FileSystem.setMd5(paramX11RespCmd.getMd5sum());
      paramX11FileSystem.setSize(paramX11RespCmd.getSize());
      a().a(paramX11FileSystem);
    }
  }
  
  private void h()
  {
    Object localObject = a().k().getCurUploadFile();
    Log.d("Good", "发送文件" + localObject);
    long l3;
    long l1;
    if (localObject != null)
    {
      localObject = new File(((X11FileInfo)localObject).getLocalPath());
      l3 = ((File)localObject).length();
      this.b = false;
      Log.d("Good", "文件大小" + l3);
      if (((File)localObject).exists()) {
        l1 = 0L;
      }
    }
    for (;;)
    {
      try
      {
        localObject = new FileInputStream((File)localObject);
        byte[] arrayOfByte = new byte['਀'];
        int i = ((FileInputStream)localObject).read(arrayOfByte);
        if (i <= 0) {
          break;
        }
        if (this.b) {
          continue;
        }
        a(arrayOfByte, 0, i);
        long l2 = l1 + i;
        Log.d("Good", "已发送" + l2);
        l1 = l2;
        if (this.a == null) {
          continue;
        }
        if (l2 >= l3)
        {
          bool = true;
          this.a.a(bool, l2, l3, 0);
          l1 = l2;
          continue;
          return;
        }
      }
      catch (Exception localException)
      {
        Log.d("Good", localException.toString());
        localException.printStackTrace();
      }
      boolean bool = false;
    }
    Log.d("Good", "发送完毕,总长度为:" + l1);
    a().k().setCurDownloadFile(null);
    localException.close();
  }
  
  public void a(X11FileInfo paramX11FileInfo)
  {
    a().k().setCurDownloadFile(paramX11FileInfo);
    a(1285, paramX11FileInfo.getName());
  }
  
  public void a(i parami)
  {
    this.a = parami;
  }
  
  public void a(String paramString)
  {
    a(1283, paramString);
  }
  
  public void a(String paramString, int paramInt)
  {
    paramString = b(1287, paramString, null);
    paramString.setSent_size(paramInt);
    a(paramString);
  }
  
  public void a(String paramString, a parama)
  {
    new X11FileInfo();
    a(paramString, null, f.a(new Date(), "yyyyMMddHHmmss"), parama);
  }
  
  public void a(String paramString1, String paramString2, String paramString3, a parama)
  {
    X11FileInfo localX11FileInfo = null;
    switch (2.a[parama.ordinal()])
    {
    default: 
      parama = localX11FileInfo;
    }
    for (;;)
    {
      localX11FileInfo = new X11FileInfo();
      localX11FileInfo.setName(paramString1);
      localX11FileInfo.setCreateDate(paramString3);
      localX11FileInfo.setAbsolutePath(paramString2);
      a(1025, paramString2, parama);
      localX11FileInfo.setName(b.a(localX11FileInfo));
      localX11FileInfo.setLocalPath(c);
      localX11FileInfo.setRemotePath(a().k().getCurPath());
      a().k().setCurDownloadFile(localX11FileInfo);
      return;
      parama = "thumb";
      continue;
      parama = "fullview";
      continue;
      parama = "idr";
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd)
  {
    super.a(paramBoolean, paramX11RespCmd);
    X11FileSystem localX11FileSystem;
    if (paramBoolean) {
      localX11FileSystem = a().k();
    }
    switch (paramX11RespCmd.getMsg_id())
    {
    case 1282: 
    default: 
      return;
    case 1283: 
    case 1284: 
      localX11FileSystem.setCurPath(paramX11RespCmd.getPwd());
      return;
    case 1025: 
      a(localX11FileSystem, paramX11RespCmd);
      return;
    case 1285: 
      a(localX11FileSystem, paramX11RespCmd);
      return;
    }
    l.c("CMD_PUT_FILE:1286");
    Log.i("msg=", "进入");
    x.a(new Runnable()
    {
      public void run()
      {
        d.a(d.this);
      }
    });
  }
  
  public void b()
  {
    a(1284);
  }
  
  public void b(String paramString)
  {
    a(1282, String.format("%s -D -S", new Object[] { paramString }));
  }
  
  public void b(String paramString, int paramInt)
  {
    a(1027, paramString, paramInt + "");
  }
  
  public void c()
  {
    a("..");
  }
  
  public void c(String paramString)
  {
    a(1281, paramString);
  }
  
  public void d()
  {
    a(e.cv);
  }
  
  public void d(String paramString)
  {
    a(8, paramString);
  }
  
  public void e()
  {
    a(254);
  }
  
  public void e(String paramString)
  {
    X11FileInfo localX11FileInfo = new X11FileInfo();
    localX11FileInfo.setRemotePath(a().k().getCurPath());
    if (localX11FileInfo.getLocalPath() == null) {
      localX11FileInfo.setLocalPath(c);
    }
    localX11FileInfo.setName(paramString);
    a(localX11FileInfo);
  }
  
  public void f()
  {
    String str2 = a().k().getCurPath();
    String str1 = str2;
    if (str2 == null) {
      str1 = "";
    }
    b(str1);
  }
  
  public void f(String paramString)
  {
    a(1287, paramString);
  }
  
  public void g(String paramString)
  {
    a(1026, paramString);
  }
  
  public boolean g()
  {
    return this.b;
  }
  
  public void h(String paramString)
  {
    Object localObject1 = paramString.substring(paramString.lastIndexOf("/") + 1);
    localObject1 = b(1286, e.cx + "" + (String)localObject1, null);
    File localFile = new File(paramString);
    Object localObject2 = u.a(localFile);
    long l = localFile.length();
    ((BaseX11Cmd)localObject1).setMd5sum((String)localObject2);
    ((BaseX11Cmd)localObject1).setSize(l);
    localObject2 = new X11FileInfo();
    ((X11FileInfo)localObject2).setLocalPath(paramString);
    ((X11FileInfo)localObject2).setName(localFile.getName());
    a().k().setCurUploadFile((X11FileInfo)localObject2);
    a((BaseX11Cmd)localObject1);
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */