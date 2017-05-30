package com.fimi.soul.biz.l;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.base.a;
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
import org.json.JSONException;
import org.json.JSONObject;

public class l implements i {
    public PlaneMsg a(Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getAllPlane"));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            b = jSONObject.getString("errorMessage");
            String string = jSONObject.getString("commandCode");
            String string2 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            ArrayList a = ae.a(Plane[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString());
            planeMsg.setCommandCode(string);
            planeMsg.setData(a);
            planeMsg.setErrorCode(string2);
            planeMsg.setErrorMessage(b);
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

    public PlaneMsg a(Plane plane, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addPlane"));
        arrayList.add(new BasicNameValuePair("version", plane.getVersion()));
        arrayList.add(new BasicNameValuePair("flyControlID", plane.getFlyControlID()));
        arrayList.add(new BasicNameValuePair("rcIC", plane.getRcIC()));
        arrayList.add(new BasicNameValuePair("userId", plane.getUser().getUserIDs() + ""));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            User user = (User) ae.b(User.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString());
            planeMsg.setCommandCode(string2);
            planeMsg.setData(user);
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

    public PlaneMsg a(String str, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getPlaneById"));
        arrayList.add(new BasicNameValuePair("planeid", str));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                String jSONObject2 = jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString();
                planeMsg.setData((Plane) ae.b(Plane.class, jSONObject2));
                b = jSONObject2;
            }
            User user = (User) ae.b(User.class, b);
            planeMsg.setCommandCode(string2);
            planeMsg.setData(user);
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

    public boolean b(String str, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "delPlaneById"));
        arrayList.add(new BasicNameValuePair("planeid", str));
        try {
            return new JSONObject(NetUtil.b(a.j, arrayList, context)).getBoolean("success");
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }
}
