package com.fimi.soul.biz.l;

import android.content.Context;
import com.fimi.soul.biz.m.i;
import com.fimi.soul.entity.Plane;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
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

public class l
  implements i
{
  public PlaneMsg a(Context paramContext)
  {
    Object localObject1 = new ArrayList();
    ((List)localObject1).add(new BasicNameValuePair("commandCode", "getAllPlane"));
    localObject1 = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject1, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      Object localObject2 = new JSONObject((String)localObject1);
      localObject1 = ((JSONObject)localObject2).getString("errorMessage");
      String str1 = ((JSONObject)localObject2).getString("commandCode");
      String str2 = ((JSONObject)localObject2).getString("errorCode");
      boolean bool = ((JSONObject)localObject2).getBoolean("success");
      localObject2 = ae.a(Plane[].class, ((JSONObject)localObject2).getJSONArray("data").toString());
      paramContext.setCommandCode(str1);
      paramContext.setData(localObject2);
      paramContext.setErrorCode(str2);
      paramContext.setErrorMessage((String)localObject1);
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
  
  public PlaneMsg a(Plane paramPlane, Context paramContext)
  {
    Object localObject1 = new ArrayList();
    ((List)localObject1).add(new BasicNameValuePair("commandCode", "addPlane"));
    ((List)localObject1).add(new BasicNameValuePair("version", paramPlane.getVersion()));
    ((List)localObject1).add(new BasicNameValuePair("flyControlID", paramPlane.getFlyControlID()));
    ((List)localObject1).add(new BasicNameValuePair("rcIC", paramPlane.getRcIC()));
    ((List)localObject1).add(new BasicNameValuePair("userId", paramPlane.getUser().getUserIDs() + ""));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject1, paramContext);
    paramPlane = new PlaneMsg();
    try
    {
      Object localObject2 = new JSONObject(paramContext);
      paramContext = ((JSONObject)localObject2).getString("errorMessage");
      localObject1 = ((JSONObject)localObject2).getString("commandCode");
      String str = ((JSONObject)localObject2).getString("errorCode");
      boolean bool = ((JSONObject)localObject2).getBoolean("success");
      localObject2 = (User)ae.b(User.class, ((JSONObject)localObject2).getJSONObject("data").toString());
      paramPlane.setCommandCode((String)localObject1);
      paramPlane.setData(localObject2);
      paramPlane.setErrorCode(str);
      paramPlane.setErrorMessage(paramContext);
      paramPlane.setSuccess(bool);
      return paramPlane;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return paramPlane;
    }
    catch (JsonParseException paramContext)
    {
      paramContext.printStackTrace();
      return paramPlane;
    }
    catch (JsonMappingException paramContext)
    {
      paramContext.printStackTrace();
      return paramPlane;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramPlane;
  }
  
  public PlaneMsg a(String paramString, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getPlaneById"));
    ((List)localObject).add(new BasicNameValuePair("planeid", paramString));
    paramString = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      localObject = localJSONObject.getString("errorMessage");
      String str1 = localJSONObject.getString("commandCode");
      String str2 = localJSONObject.getString("errorCode");
      boolean bool = localJSONObject.getBoolean("success");
      if (!localJSONObject.isNull("data"))
      {
        paramString = localJSONObject.getJSONObject("data").toString();
        paramContext.setData((Plane)ae.b(Plane.class, paramString));
      }
      paramString = (User)ae.b(User.class, paramString);
      paramContext.setCommandCode(str1);
      paramContext.setData(paramString);
      paramContext.setErrorCode(str2);
      paramContext.setErrorMessage((String)localObject);
      paramContext.setSuccess(bool);
      return paramContext;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
      return paramContext;
    }
    catch (JsonParseException paramString)
    {
      paramString.printStackTrace();
      return paramContext;
    }
    catch (JsonMappingException paramString)
    {
      paramString.printStackTrace();
      return paramContext;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return paramContext;
  }
  
  public boolean b(String paramString, Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("commandCode", "delPlaneById"));
    localArrayList.add(new BasicNameValuePair("planeid", paramString));
    paramString = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", localArrayList, paramContext);
    try
    {
      boolean bool = new JSONObject(paramString).getBoolean("success");
      return bool;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */