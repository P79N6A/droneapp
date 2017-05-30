package com.fimi.soul.biz.l;

import android.content.Context;
import com.fimi.soul.biz.m.p;
import com.fimi.soul.entity.CityInfo;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.WeatherInfo;
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

public class t
  implements p
{
  public t(Context paramContext) {}
  
  private CityInfo a(Context paramContext)
  {
    return null;
  }
  
  private PlaneMsg b(CityInfo paramCityInfo, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getweatherIDbyCity"));
    ((List)localObject).add(new BasicNameValuePair("city", paramCityInfo.getCity()));
    ((List)localObject).add(new BasicNameValuePair("town", paramCityInfo.getTown()));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramCityInfo = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localObject = paramContext.getString("errorMessage");
      String str1 = paramContext.getString("commandCode");
      String str2 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      if (!paramContext.isNull("data")) {
        paramCityInfo.setData((CityInfo)ae.b(CityInfo.class, paramContext.getJSONObject("data").toString()));
      }
      paramCityInfo.setCommandCode(str1);
      paramCityInfo.setErrorCode(str2);
      paramCityInfo.setErrorMessage((String)localObject);
      paramCityInfo.setSuccess(bool);
      return paramCityInfo;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return paramCityInfo;
    }
    catch (JsonParseException paramContext)
    {
      paramContext.printStackTrace();
      return paramCityInfo;
    }
    catch (JsonMappingException paramContext)
    {
      paramContext.printStackTrace();
      return paramCityInfo;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramCityInfo;
  }
  
  public PlaneMsg a(Context paramContext, CityInfo paramCityInfo)
  {
    if (paramCityInfo != null) {
      return a(paramCityInfo, paramContext);
    }
    return null;
  }
  
  public PlaneMsg a(CityInfo paramCityInfo, Context paramContext)
  {
    PlaneMsg localPlaneMsg = new PlaneMsg();
    Object localObject = b(paramCityInfo, paramContext);
    if (((PlaneMsg)localObject).isSuccess())
    {
      localObject = (CityInfo)((PlaneMsg)localObject).getData();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new BasicNameValuePair("source", "fimi"));
      localArrayList.add(new BasicNameValuePair("cityId", ((CityInfo)localObject).getWeatherID()));
      paramContext = NetUtil.a("http://weatherapi.market.xiaomi.com/wtr-v2/weather", localArrayList, paramContext, true);
      if (paramContext != null) {}
      try
      {
        if (!"".equalsIgnoreCase(paramContext))
        {
          localObject = new JSONObject(paramContext);
          paramContext = null;
          if (!((JSONObject)localObject).isNull("forecast"))
          {
            localObject = ((JSONObject)localObject).getJSONObject("forecast");
            paramContext = new WeatherInfo();
            paramContext.setCity(paramCityInfo.getCity());
            paramContext.setWD(((JSONObject)localObject).getString("fx1"));
            paramContext.setWS(((JSONObject)localObject).getString("fl1"));
            paramContext.setWeather(((JSONObject)localObject).getString("weather1"));
            paramContext.setTemp(((JSONObject)localObject).getString("temp1"));
            paramContext.setIndex_tr(((JSONObject)localObject).getString("index_ls"));
          }
          localPlaneMsg.setData(paramContext);
          localPlaneMsg.setSuccess(true);
          return localPlaneMsg;
        }
        localPlaneMsg.setSuccess(false);
        localPlaneMsg.setErrorMessage("天气无法获取");
        return localPlaneMsg;
      }
      catch (JSONException paramCityInfo)
      {
        paramCityInfo.printStackTrace();
        return localPlaneMsg;
      }
    }
    localPlaneMsg.setSuccess(false);
    return localPlaneMsg;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */