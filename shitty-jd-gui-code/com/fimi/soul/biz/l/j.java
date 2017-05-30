package com.fimi.soul.biz.l;

import android.content.Context;
import com.fimi.soul.biz.m.g;
import com.fimi.soul.entity.HomePage;
import com.fimi.soul.entity.PageHomeIndexImage;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ae;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class j
  implements g
{
  public PlaneMsg a(Context paramContext)
  {
    return null;
  }
  
  public PlaneMsg a(HomePage paramHomePage, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getBroadCastNumber"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramHomePage.getUserID()));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramHomePage = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localObject = paramContext.getString("errorMessage");
      String str1 = paramContext.getString("commandCode");
      String str2 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      if (!paramContext.isNull("data")) {
        paramHomePage.setData((HomePage)ae.b(HomePage.class, paramContext.getJSONObject("data").toString()));
      }
      paramHomePage.setCommandCode(str1);
      paramHomePage.setErrorCode(str2);
      paramHomePage.setErrorMessage((String)localObject);
      paramHomePage.setSuccess(bool);
      return paramHomePage;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return paramHomePage;
    }
    catch (JsonParseException paramContext)
    {
      paramContext.printStackTrace();
      return paramHomePage;
    }
    catch (JsonMappingException paramContext)
    {
      paramContext.printStackTrace();
      return paramHomePage;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramHomePage;
  }
  
  public PlaneMsg a(String paramString, Context paramContext)
  {
    return null;
  }
  
  public PlaneMsg b(Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getIndexImages"));
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
        paramContext.setData(ae.a(PageHomeIndexImage[].class, ((JSONObject)localObject).getJSONArray("data").toString()));
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
  
  public PlaneMsg b(HomePage paramHomePage, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getUserByUserId"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramHomePage.getUserID()));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramHomePage = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localObject = paramContext.getString("errorMessage");
      String str1 = paramContext.getString("commandCode");
      String str2 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      if (!paramContext.isNull("data")) {
        paramHomePage.setData((HomePage)ae.b(HomePage.class, paramContext.getJSONObject("data").toString()));
      }
      paramHomePage.setCommandCode(str1);
      paramHomePage.setErrorCode(str2);
      paramHomePage.setErrorMessage((String)localObject);
      paramHomePage.setSuccess(bool);
      return paramHomePage;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return paramHomePage;
    }
    catch (JsonParseException paramContext)
    {
      paramContext.printStackTrace();
      return paramHomePage;
    }
    catch (JsonMappingException paramContext)
    {
      paramContext.printStackTrace();
      return paramHomePage;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramHomePage;
  }
  
  public boolean b(String paramString, Context paramContext)
  {
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */