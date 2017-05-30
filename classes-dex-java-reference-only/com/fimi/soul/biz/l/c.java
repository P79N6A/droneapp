package com.fimi.soul.biz.l;

import android.content.Context;
import com.fimi.soul.biz.m.d;
import com.fimi.soul.entity.Describehistor;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ae;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

public class c
  implements d
{
  public PlaneMsg a(Context paramContext)
  {
    return null;
  }
  
  public PlaneMsg a(String paramString, Context paramContext)
  {
    return null;
  }
  
  public PlaneMsg b(Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getBillBoardYear"));
    localObject = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      localObject = new JSONObject((String)localObject);
      ArrayList localArrayList = ae.a(Describehistor[].class, ((JSONObject)localObject).get("data").toString());
      String str1 = ((JSONObject)localObject).getString("errorMessage");
      String str2 = ((JSONObject)localObject).getString("commandCode");
      String str3 = ((JSONObject)localObject).getString("errorCode");
      boolean bool = ((JSONObject)localObject).getBoolean("success");
      paramContext.setCommandCode(str2);
      paramContext.setErrorCode(str3);
      paramContext.setErrorMessage(str1);
      paramContext.setSuccess(bool);
      paramContext.setData(localArrayList);
      return paramContext;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return paramContext;
  }
  
  public boolean b(String paramString, Context paramContext)
  {
    return false;
  }
  
  public PlaneMsg c(Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getBillBoardMonth"));
    localObject = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      localObject = new JSONObject((String)localObject);
      ArrayList localArrayList = ae.a(Describehistor[].class, ((JSONObject)localObject).get("data").toString());
      String str1 = ((JSONObject)localObject).getString("errorMessage");
      String str2 = ((JSONObject)localObject).getString("commandCode");
      String str3 = ((JSONObject)localObject).getString("errorCode");
      boolean bool = ((JSONObject)localObject).getBoolean("success");
      paramContext.setCommandCode(str2);
      paramContext.setErrorCode(str3);
      paramContext.setErrorMessage(str1);
      paramContext.setSuccess(bool);
      paramContext.setData(localArrayList);
      return paramContext;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg d(Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getBillBoardWeek"));
    localObject = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      localObject = new JSONObject((String)localObject);
      ArrayList localArrayList = ae.a(Describehistor[].class, ((JSONObject)localObject).get("data").toString());
      String str1 = ((JSONObject)localObject).getString("errorMessage");
      String str2 = ((JSONObject)localObject).getString("commandCode");
      String str3 = ((JSONObject)localObject).getString("errorCode");
      boolean bool = ((JSONObject)localObject).getBoolean("success");
      paramContext.setCommandCode(str2);
      paramContext.setErrorCode(str3);
      paramContext.setErrorMessage(str1);
      paramContext.setSuccess(bool);
      paramContext.setData(localArrayList);
      return paramContext;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg e(Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getBillBoardDay"));
    localObject = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      localObject = new JSONObject((String)localObject);
      ArrayList localArrayList = ae.a(Describehistor[].class, ((JSONObject)localObject).get("data").toString());
      String str1 = ((JSONObject)localObject).getString("errorMessage");
      String str2 = ((JSONObject)localObject).getString("commandCode");
      String str3 = ((JSONObject)localObject).getString("errorCode");
      boolean bool = ((JSONObject)localObject).getBoolean("success");
      paramContext.setCommandCode(str2);
      paramContext.setErrorCode(str3);
      paramContext.setErrorMessage(str1);
      paramContext.setSuccess(bool);
      paramContext.setData(localArrayList);
      return paramContext;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return paramContext;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */