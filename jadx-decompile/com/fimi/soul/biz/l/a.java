package com.fimi.soul.biz.l;

import android.content.Context;
import com.facebook.common.util.UriUtil;
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

public class a implements com.fimi.soul.biz.m.a {
    public PlaneMsg a(Context context) {
        return null;
    }

    public PlaneMsg a(AddPlane addPlane, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addPlane"));
        arrayList.add(new BasicNameValuePair("userID", addPlane.getUserID() + ""));
        arrayList.add(new BasicNameValuePair("cloud_deck_ID", addPlane.getCloud_deck_ID() == null ? "" : addPlane.getCloud_deck_ID()));
        arrayList.add(new BasicNameValuePair("receiver_control_ID", addPlane.getReceiver_control_ID()));
        arrayList.add(new BasicNameValuePair("fly_control_ID", addPlane.getFly_control_ID()));
        arrayList.add(new BasicNameValuePair("remote_control_ID", addPlane.getRemote_control_ID()));
        arrayList.add(new BasicNameValuePair("charge_count", addPlane.getCharge_count() + ""));
        arrayList.add(new BasicNameValuePair("note", addPlane.getNote() == null ? "" : addPlane.getNote()));
        String b = NetUtil.b(com.fimi.soul.base.a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setData((AddPlaneback) ae.b(AddPlaneback.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
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

    public PlaneMsg a(String str, Context context) {
        return null;
    }

    public boolean b(String str, Context context) {
        return false;
    }
}
