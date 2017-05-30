package com.fimi.soul.biz.l;

import android.content.Context;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.m.f;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ae;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

public class i
  implements f
{
  public PlaneMsg a(Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getActivePushMsg"));
    ((List)localObject).add(new BasicNameValuePair("userID", a.b(paramContext).getUserID()));
    ((List)localObject).add(new BasicNameValuePair("appType", "0"));
    localObject = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      localObject = new JSONObject((String)localObject);
      String str1 = ((JSONObject)localObject).getString("errorMessage");
      String str2 = ((JSONObject)localObject).getString("commandCode");
      String str3 = ((JSONObject)localObject).getString("errorCode");
      boolean bool = ((JSONObject)localObject).getBoolean("success");
      if (!((JSONObject)localObject).isNull("data")) {
        paramContext.setData((HistoryPushMessage)ae.b(HistoryPushMessage.class, ((JSONObject)localObject).getJSONObject("data").toString()));
      }
      paramContext.setCommandCode(str2);
      paramContext.setErrorCode(str3);
      paramContext.setErrorMessage(str1);
      paramContext.setSuccess(bool);
      return paramContext;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
      return paramContext;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
    return paramContext;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */