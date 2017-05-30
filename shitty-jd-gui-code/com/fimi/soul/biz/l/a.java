package com.fimi.soul.biz.l;

import android.content.Context;
import com.fimi.soul.entity.AddPlane;
import com.fimi.soul.entity.AddPlaneback;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ae;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONException;
import org.json.JSONObject;

public class a
  implements com.fimi.soul.biz.m.a
{
  public PlaneMsg a(Context paramContext)
  {
    return null;
  }
  
  public PlaneMsg a(AddPlane paramAddPlane, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "addPlane"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramAddPlane.getUserID() + ""));
    String str1;
    if (paramAddPlane.getCloud_deck_ID() == null)
    {
      str1 = "";
      ((List)localObject).add(new BasicNameValuePair("cloud_deck_ID", str1));
      ((List)localObject).add(new BasicNameValuePair("receiver_control_ID", paramAddPlane.getReceiver_control_ID()));
      ((List)localObject).add(new BasicNameValuePair("fly_control_ID", paramAddPlane.getFly_control_ID()));
      ((List)localObject).add(new BasicNameValuePair("remote_control_ID", paramAddPlane.getRemote_control_ID()));
      ((List)localObject).add(new BasicNameValuePair("charge_count", paramAddPlane.getCharge_count() + ""));
      if (paramAddPlane.getNote() != null) {
        break label339;
      }
    }
    label339:
    for (paramAddPlane = "";; paramAddPlane = paramAddPlane.getNote())
    {
      ((List)localObject).add(new BasicNameValuePair("note", paramAddPlane));
      paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
      paramAddPlane = new PlaneMsg();
      try
      {
        paramContext = new JSONObject(paramContext);
        str1 = paramContext.getString("errorMessage");
        localObject = paramContext.getString("commandCode");
        String str2 = paramContext.getString("errorCode");
        boolean bool = paramContext.getBoolean("success");
        paramAddPlane.setData((AddPlaneback)ae.b(AddPlaneback.class, paramContext.getJSONObject("data").toString()));
        paramAddPlane.setCommandCode((String)localObject);
        paramAddPlane.setErrorCode(str2);
        paramAddPlane.setErrorMessage(str1);
        paramAddPlane.setSuccess(bool);
        return paramAddPlane;
      }
      catch (JSONException paramContext)
      {
        paramContext.printStackTrace();
        return paramAddPlane;
      }
      catch (JsonParseException paramContext)
      {
        paramContext.printStackTrace();
        return paramAddPlane;
      }
      catch (JsonMappingException paramContext)
      {
        paramContext.printStackTrace();
        return paramAddPlane;
      }
      catch (IOException paramContext)
      {
        paramContext.printStackTrace();
      }
      str1 = paramAddPlane.getCloud_deck_ID();
      break;
    }
    return paramAddPlane;
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


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */