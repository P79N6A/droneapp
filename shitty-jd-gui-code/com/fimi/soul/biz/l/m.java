package com.fimi.soul.biz.l;

import android.content.Context;
import com.fimi.soul.biz.m.j;
import com.fimi.soul.entity.MessagePush;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.NetUtil;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

public class m
  implements j
{
  public PlaneMsg a(MessagePush paramMessagePush, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "addPushUserRegID"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramMessagePush.getUserID()));
    ((List)localObject).add(new BasicNameValuePair("miRegID", paramMessagePush.getMiRegID()));
    ((List)localObject).add(new BasicNameValuePair("appType", paramMessagePush.getAppType()));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramMessagePush = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localObject = paramContext.getString("errorMessage");
      String str1 = paramContext.getString("commandCode");
      String str2 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      paramMessagePush.setCommandCode(str1);
      paramMessagePush.setErrorCode(str2);
      paramMessagePush.setErrorMessage((String)localObject);
      paramMessagePush.setSuccess(bool);
      return paramMessagePush;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramMessagePush;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */