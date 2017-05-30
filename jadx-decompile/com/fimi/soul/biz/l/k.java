package com.fimi.soul.biz.l;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.biz.m.h;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.update.a.a;
import com.fimi.soul.utils.NetUtil;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

public class k implements h {
    public PlaneMsg a(Context context) {
        return null;
    }

    public PlaneMsg a(User user, String str, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "applyX2"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        arrayList.add(new BasicNameValuePair("planeID", a.a().a(0).i()));
        arrayList.add(new BasicNameValuePair("sign", str));
        String b = NetUtil.b(com.fimi.soul.base.a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            b = jSONObject.getString("errorMessage");
            String string = jSONObject.getString("commandCode");
            String string2 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            int i = jSONObject.getInt(UriUtil.DATA_SCHEME);
            planeMsg.setCommandCode(string);
            planeMsg.setErrorCode(string2);
            planeMsg.setErrorMessage(b);
            planeMsg.setSuccess(z);
            planeMsg.setData(Integer.valueOf(i));
        } catch (JSONException e) {
            e.printStackTrace();
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
