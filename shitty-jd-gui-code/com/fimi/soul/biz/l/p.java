package com.fimi.soul.biz.l;

import android.content.Context;
import com.fimi.soul.biz.m.m;
import com.fimi.soul.entity.BatteryOverDischange;
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

public class p
  implements m
{
  public PlaneMsg a(Context paramContext)
  {
    return null;
  }
  
  public PlaneMsg a(String paramString, Context paramContext)
  {
    return null;
  }
  
  public boolean b(String paramString, Context paramContext)
  {
    return false;
  }
  
  public PlaneMsg c(String paramString, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "addFlyModelLog"));
    ((List)localObject).add(new BasicNameValuePair("jsonContent", paramString));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramString = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localObject = paramContext.getString("errorMessage");
      String str1 = paramContext.getString("commandCode");
      String str2 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      paramString.setCommandCode(str1);
      paramString.setErrorCode(str2);
      paramString.setErrorMessage((String)localObject);
      paramString.setSuccess(bool);
      paramString.setData(ae.b(BatteryOverDischange.class, paramContext.getJSONObject("data").toString()));
      return paramString;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return paramString;
    }
    catch (JsonParseException paramContext)
    {
      paramContext.printStackTrace();
      return paramString;
    }
    catch (JsonMappingException paramContext)
    {
      paramContext.printStackTrace();
      return paramString;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramString;
  }
  
  public PlaneMsg d(String paramString, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "addOverdischarge"));
    ((List)localObject).add(new BasicNameValuePair("jsonContent", paramString));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramString = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localObject = paramContext.getString("errorMessage");
      String str1 = paramContext.getString("commandCode");
      String str2 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      paramString.setCommandCode(str1);
      paramString.setErrorCode(str2);
      paramString.setErrorMessage((String)localObject);
      paramString.setSuccess(bool);
      paramString.setData(ae.b(BatteryOverDischange.class, paramContext.getJSONObject("data").toString()));
      return paramString;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return paramString;
    }
    catch (JsonParseException paramContext)
    {
      paramContext.printStackTrace();
      return paramString;
    }
    catch (JsonMappingException paramContext)
    {
      paramContext.printStackTrace();
      return paramString;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */