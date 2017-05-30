package com.fimi.soul.biz.update;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.fimi.kernel.b.e;
import com.fimi.kernel.b.e.b;
import com.fimi.kernel.utils.n;
import com.fimi.kernel.utils.z;
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

public class d
  extends c
{
  public static final String f = "firmware.zip";
  private static final String g = "x1";
  private b h = null;
  
  public static String a(String paramString)
  {
    if (paramString != null)
    {
      int i = paramString.indexOf('V');
      int j = paramString.indexOf('B');
      int k = paramString.indexOf("SP");
      if ((k > 0) && (i < k)) {
        return paramString.substring(i + 1, k);
      }
      if (i < j) {
        return paramString.substring(i + 1, j);
      }
    }
    return null;
  }
  
  public static String b()
  {
    return String.format("%s%s", new Object[] { j.p(), "firmware.zip" });
  }
  
  public static String c()
  {
    return String.format("%s%s", new Object[] { j.p(), "firmware-4k.zip" });
  }
  
  public static String d()
  {
    return "fimware.zip";
  }
  
  public static String e()
  {
    return n.b(d(), ".zip") + ".bin";
  }
  
  public void a(Context paramContext)
  {
    Object localObject = String.format("%s/%s/%s", new Object[] { j.a(), "firmware", "firmware.zip" });
    File localFile = new File(String.format("%s/%s", new Object[] { j.a(), "firmware" }));
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    localObject = new File((String)localObject);
    if (((File)localObject).exists()) {
      ((File)localObject).delete();
    }
    try
    {
      a(paramContext.getAssets().open("firmware.zip"), String.format("%s/%s/%s", new Object[] { j.a(), "firmware", "firmware.zip" }));
      return;
    }
    catch (Exception localException)
    {
      z.a(paramContext, "写文件出错：" + localException.getMessage());
    }
  }
  
  public void a(i parami)
  {
    if (i() == null)
    {
      parami.a(true, 0L, 0L, 0);
      return;
    }
    a(i(), b(), parami);
  }
  
  public void a(final k<UpdateVersonBean> paramk)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getDeviceVersion"));
    ((List)localObject).add(new BasicNameValuePair("sysID", "04"));
    ((List)localObject).add(new BasicNameValuePair("modelName", "x1"));
    NetUtil.a((List)localObject, com.fimi.kernel.c.a());
    localObject = String.format("%s?%s", new Object[] { "https://fimiservice-us.mi-ae.com/android/fimi.service", URLEncodedUtils.format((List)localObject, "UTF-8") });
    Log.d("Good", "请求url:" + (String)localObject);
    this.h.a((String)localObject, new e()
    {
      public void a(String paramAnonymousString)
      {
        Log.d("Good", paramAnonymousString);
        if ((paramAnonymousString != null) && (paramAnonymousString.length() > 0)) {}
        try
        {
          paramAnonymousString = (ServerResult)d.this.g().fromJson(paramAnonymousString, new TypeToken() {}.getType());
          if (paramAnonymousString != null)
          {
            d.this.b((UpdateVersonBean)paramAnonymousString.getData());
            d.this.c(d.this.i());
            paramk.a(paramAnonymousString.getData());
            return;
          }
        }
        catch (Exception paramAnonymousString)
        {
          paramk.a(d.this.j());
        }
      }
      
      public void b(String paramAnonymousString)
      {
        Log.d("Good", paramAnonymousString);
        paramk.a(d.this.j());
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
        int i = paramInputStream.read(arrayOfByte, 0, 512000);
        if (i == -1) {
          break;
        }
        paramString.write(arrayOfByte, 0, i);
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
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/update/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */