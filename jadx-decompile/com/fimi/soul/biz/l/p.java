package com.fimi.soul.biz.l;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.base.a;
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

public class p implements m {
    public PlaneMsg a(Context context) {
        return null;
    }

    public PlaneMsg a(String str, Context context) {
        return null;
    }

    public boolean b(String str, Context context) {
        return false;
    }

    public PlaneMsg c(String str, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addFlyModelLog"));
        arrayList.add(new BasicNameValuePair("jsonContent", str));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            b = jSONObject.getString("errorMessage");
            String string = jSONObject.getString("commandCode");
            String string2 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(string);
            planeMsg.setErrorCode(string2);
            planeMsg.setErrorMessage(b);
            planeMsg.setSuccess(z);
            planeMsg.setData(ae.b(BatteryOverDischange.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
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

    public PlaneMsg d(String str, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addOverdischarge"));
        arrayList.add(new BasicNameValuePair("jsonContent", str));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            b = jSONObject.getString("errorMessage");
            String string = jSONObject.getString("commandCode");
            String string2 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(string);
            planeMsg.setErrorCode(string2);
            planeMsg.setErrorMessage(b);
            planeMsg.setSuccess(z);
            planeMsg.setData(ae.b(BatteryOverDischange.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
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
}
