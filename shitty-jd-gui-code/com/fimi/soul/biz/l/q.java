package com.fimi.soul.biz.l;

import android.content.Context;
import android.text.TextUtils;
import com.fimi.kernel.c;
import com.fimi.soul.base.a;
import com.fimi.soul.entity.AppVersion;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.entity.UpgradeResultInfo;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ae;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

public class q
  implements com.fimi.soul.biz.m.q
{
  public PlaneMsg a(Context paramContext)
  {
    Object localObject1 = new ArrayList();
    ((List)localObject1).add(new BasicNameValuePair("commandCode", "getDeviceNewVersion"));
    localObject1 = NetUtil.a("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject1, paramContext, false);
    paramContext = new PlaneMsg();
    try
    {
      Object localObject2 = new JSONObject((String)localObject1);
      localObject1 = ((JSONObject)localObject2).getString("errorMessage");
      String str1 = ((JSONObject)localObject2).getString("commandCode");
      String str2 = ((JSONObject)localObject2).getString("errorCode");
      boolean bool = ((JSONObject)localObject2).getBoolean("success");
      localObject2 = ae.a(UpdateVersonBean[].class, ((JSONObject)localObject2).getJSONArray("data").toString());
      paramContext.setCommandCode(str1);
      paramContext.setData(localObject2);
      paramContext.setErrorCode(str2);
      paramContext.setErrorMessage((String)localObject1);
      paramContext.setSuccess(bool);
      return paramContext;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg a(Context paramContext, UpgradeResultInfo paramUpgradeResultInfo)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "commitDeviceVersion"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramUpgradeResultInfo.getUserID()));
    ((List)localObject).add(new BasicNameValuePair("jsonStr", paramUpgradeResultInfo.getJsonStr()));
    paramUpgradeResultInfo = NetUtil.a("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext, false);
    paramContext = new PlaneMsg();
    try
    {
      paramUpgradeResultInfo = new JSONObject(paramUpgradeResultInfo);
      localObject = paramUpgradeResultInfo.getString("errorMessage");
      String str = paramUpgradeResultInfo.getString("errorMessage");
      boolean bool = paramUpgradeResultInfo.getBoolean("success");
      paramContext.setCommandCode(paramUpgradeResultInfo.getString("commandCode"));
      paramContext.setErrorCode(str);
      paramContext.setErrorMessage((String)localObject);
      paramContext.setSuccess(bool);
      return paramContext;
    }
    catch (Exception paramUpgradeResultInfo)
    {
      paramUpgradeResultInfo.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg a(Context paramContext, String paramString)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getVersionContent"));
    ((List)localObject).add(new BasicNameValuePair("appversion", paramString));
    paramString = NetUtil.a("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext, false);
    paramContext = new PlaneMsg();
    try
    {
      paramString = new JSONObject(paramString);
      localObject = paramString.getString("errorMessage");
      String str1 = paramString.getString("errorMessage");
      boolean bool = paramString.getBoolean("success");
      String str2 = paramString.getString("commandCode");
      if (!paramString.isNull("data")) {
        paramContext.setData((AppVersion)ae.b(AppVersion.class, paramString.getJSONObject("data").toString()));
      }
      paramContext.setCommandCode(str2);
      paramContext.setErrorCode(str1);
      paramContext.setErrorMessage((String)localObject);
      paramContext.setSuccess(bool);
      return paramContext;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg a(String paramString, Context paramContext)
  {
    return null;
  }
  
  public PlaneMsg b(Context paramContext)
  {
    Object localObject1 = new ArrayList();
    ((List)localObject1).add(new BasicNameValuePair("commandCode", "getDeviceNewVersion"));
    Object localObject2 = a.b(c.a());
    if ((localObject2 != null) && (!TextUtils.isEmpty(((User)localObject2).getUserID()))) {
      ((List)localObject1).add(new BasicNameValuePair("userID", ((User)localObject2).getUserID()));
    }
    localObject1 = NetUtil.a("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject1, paramContext, false);
    paramContext = new PlaneMsg();
    try
    {
      localObject1 = new JSONObject((String)localObject1);
      localObject2 = ((JSONObject)localObject1).getString("errorMessage");
      String str1 = ((JSONObject)localObject1).getString("errorCode");
      boolean bool = ((JSONObject)localObject1).getBoolean("success");
      String str2 = ((JSONObject)localObject1).getString("commandCode");
      if (!((JSONObject)localObject1).isNull("data")) {
        paramContext.setData(ae.a(UpdateVersonBean[].class, ((JSONObject)localObject1).getJSONArray("data").toString()));
      }
      paramContext.setCommandCode(str2);
      paramContext.setErrorCode(str1);
      paramContext.setErrorMessage((String)localObject2);
      paramContext.setSuccess(bool);
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
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */