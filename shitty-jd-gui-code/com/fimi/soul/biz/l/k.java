package com.fimi.soul.biz.l;

import android.content.Context;
import com.fimi.soul.biz.m.h;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.update.a.a;
import com.fimi.soul.module.update.a.e;
import com.fimi.soul.utils.NetUtil;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

public class k
  implements h
{
  public PlaneMsg a(Context paramContext)
  {
    return null;
  }
  
  public PlaneMsg a(User paramUser, String paramString, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "applyX2"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramUser.getUserID()));
    ((List)localObject).add(new BasicNameValuePair("planeID", a.a().a(0).i()));
    ((List)localObject).add(new BasicNameValuePair("sign", paramString));
    paramString = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramUser = new PlaneMsg();
    try
    {
      paramString = new JSONObject(paramString);
      paramContext = paramString.getString("errorMessage");
      localObject = paramString.getString("commandCode");
      String str = paramString.getString("errorCode");
      boolean bool = paramString.getBoolean("success");
      int i = paramString.getInt("data");
      paramUser.setCommandCode((String)localObject);
      paramUser.setErrorCode(str);
      paramUser.setErrorMessage(paramContext);
      paramUser.setSuccess(bool);
      paramUser.setData(Integer.valueOf(i));
      return paramUser;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
    return paramUser;
  }
  
  public PlaneMsg a(String paramString, Context paramContext)
  {
    return null;
  }
  
  public boolean b(String paramString, Context paramContext)
  {
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */