package com.fimi.soul.biz.l;

import android.content.Context;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.m.j;
import com.fimi.soul.entity.MessagePush;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.NetUtil;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

public class m implements j {
    public PlaneMsg a(MessagePush messagePush, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addPushUserRegID"));
        arrayList.add(new BasicNameValuePair("userID", messagePush.getUserID()));
        arrayList.add(new BasicNameValuePair("miRegID", messagePush.getMiRegID()));
        arrayList.add(new BasicNameValuePair("appType", messagePush.getAppType()));
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
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return planeMsg;
    }
}
