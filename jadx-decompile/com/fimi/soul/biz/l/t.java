package com.fimi.soul.biz.l;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.base.a;
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

public class t implements p {
    public t(Context context) {
    }

    private CityInfo a(Context context) {
        return null;
    }

    private PlaneMsg b(CityInfo cityInfo, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getweatherIDbyCity"));
        arrayList.add(new BasicNameValuePair("city", cityInfo.getCity()));
        arrayList.add(new BasicNameValuePair("town", cityInfo.getTown()));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData((CityInfo) ae.b(CityInfo.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
            }
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (JsonParseException e2) {
            e2.printStackTrace();
        } catch (JsonMappingException e3) {
            e3.printStackTrace();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return planeMsg;
    }

    public PlaneMsg a(Context context, CityInfo cityInfo) {
        return cityInfo != null ? a(cityInfo, context) : null;
    }

    public PlaneMsg a(CityInfo cityInfo, Context context) {
        String str = "http://weatherapi.market.xiaomi.com/wtr-v2/weather";
        PlaneMsg planeMsg = new PlaneMsg();
        PlaneMsg b = b(cityInfo, context);
        if (b.isSuccess()) {
            CityInfo cityInfo2 = (CityInfo) b.getData();
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("source", "fimi"));
            arrayList.add(new BasicNameValuePair("cityId", cityInfo2.getWeatherID()));
            String a = NetUtil.a(str, arrayList, context, true);
            if (a != null) {
                try {
                    if (!"".equalsIgnoreCase(a)) {
                        JSONObject jSONObject = new JSONObject(a);
                        Object obj = null;
                        if (!jSONObject.isNull("forecast")) {
                            jSONObject = jSONObject.getJSONObject("forecast");
                            obj = new WeatherInfo();
                            obj.setCity(cityInfo.getCity());
                            obj.setWD(jSONObject.getString("fx1"));
                            obj.setWS(jSONObject.getString("fl1"));
                            obj.setWeather(jSONObject.getString("weather1"));
                            obj.setTemp(jSONObject.getString("temp1"));
                            obj.setIndex_tr(jSONObject.getString("index_ls"));
                        }
                        planeMsg.setData(obj);
                        planeMsg.setSuccess(true);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            planeMsg.setSuccess(false);
            planeMsg.setErrorMessage("天气无法获取");
        } else {
            planeMsg.setSuccess(false);
        }
        return planeMsg;
    }
}
