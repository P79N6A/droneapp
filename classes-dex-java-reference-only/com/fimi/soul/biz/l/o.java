package com.fimi.soul.biz.l;

import android.content.Context;
import android.util.Log;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.SoftInfo;
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

public class o
{
  public PlaneMsg a(Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getSoftInfo"));
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
        paramContext.setData((SoftInfo)ae.b(SoftInfo.class, ((JSONObject)localObject).getJSONObject("data").toString()));
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
    catch (JsonParseException localJsonParseException)
    {
      localJsonParseException.printStackTrace();
      return paramContext;
    }
    catch (JsonMappingException localJsonMappingException)
    {
      localJsonMappingException.printStackTrace();
      return paramContext;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg a(String paramString1, String paramString2, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "addSuggestion"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramString1));
    ((List)localObject).add(new BasicNameValuePair("content", paramString2));
    paramString2 = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    Log.i("zhej", paramString2);
    paramString1 = new PlaneMsg();
    try
    {
      paramString2 = new JSONObject(paramString2);
      paramContext = paramString2.getString("errorMessage");
      localObject = paramString2.getString("commandCode");
      String str = paramString2.getString("errorCode");
      boolean bool = paramString2.getBoolean("success");
      paramString1.setCommandCode((String)localObject);
      paramString1.setErrorCode(str);
      paramString1.setErrorMessage(paramContext);
      paramString1.setSuccess(bool);
      return paramString1;
    }
    catch (JSONException paramString2)
    {
      paramString2.printStackTrace();
    }
    return paramString1;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */