package com.fimi.soul.biz.l;

import android.content.Context;
import android.text.TextUtils;
import com.fimi.soul.biz.m.l;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ao;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class n
  implements l
{
  private Context a;
  private String b;
  
  public n(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public PlaneMsg a(String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("ssid", paramString1 + ",pwd=" + paramString2));
    paramString2 = NetUtil.a(this.b + "action/setWifi", localArrayList, this.a, true);
    paramString1 = new PlaneMsg();
    try
    {
      if ((!TextUtils.isEmpty(paramString2)) && (paramString2.contains("ok"))) {
        paramString1.setSuccess(true);
      }
      return paramString1;
    }
    catch (Exception paramString2)
    {
      paramString2.printStackTrace();
    }
    return paramString1;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public PlaneMsg b()
  {
    Object localObject = new ArrayList();
    String str = NetUtil.a(this.b + "dir.log", (List)localObject, this.a, true);
    localObject = new PlaneMsg();
    try
    {
      if (!TextUtils.isEmpty(str))
      {
        ((PlaneMsg)localObject).setData(ao.c(str));
        ((PlaneMsg)localObject).setSuccess(true);
      }
      return (PlaneMsg)localObject;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return (PlaneMsg)localObject;
  }
  
  public PlaneMsg c()
  {
    Object localObject = new ArrayList();
    String str = NetUtil.a(this.b + "action/getDir", (List)localObject, this.a, true);
    localObject = new PlaneMsg();
    try
    {
      if (!TextUtils.isEmpty(str)) {
        ((PlaneMsg)localObject).setSuccess(true);
      }
      return (PlaneMsg)localObject;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return (PlaneMsg)localObject;
  }
  
  public PlaneMsg d()
  {
    Object localObject = new ArrayList();
    String str = NetUtil.a(this.b + "action/reboot", (List)localObject, this.a, true);
    localObject = new PlaneMsg();
    try
    {
      if ((!TextUtils.isEmpty(str)) && (str.contains("ok"))) {
        ((PlaneMsg)localObject).setSuccess(true);
      }
      return (PlaneMsg)localObject;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return (PlaneMsg)localObject;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */