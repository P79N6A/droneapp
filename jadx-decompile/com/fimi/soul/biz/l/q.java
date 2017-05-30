package com.fimi.soul.biz.l;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.fimi.kernel.c;
import com.fimi.soul.base.a;
import com.fimi.soul.entity.AppVersion;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.entity.UpgradeResultInfo;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ae;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

public class q implements com.fimi.soul.biz.m.q {
    public PlaneMsg a(Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getDeviceNewVersion"));
        String a = NetUtil.a(a.j, arrayList, context, false);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(a);
            a = jSONObject.getString("errorMessage");
            String string = jSONObject.getString("commandCode");
            String string2 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            ArrayList a2 = ae.a(UpdateVersonBean[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString());
            planeMsg.setCommandCode(string);
            planeMsg.setData(a2);
            planeMsg.setErrorCode(string2);
            planeMsg.setErrorMessage(a);
            planeMsg.setSuccess(z);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public PlaneMsg a(Context context, UpgradeResultInfo upgradeResultInfo) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "commitDeviceVersion"));
        arrayList.add(new BasicNameValuePair("userID", upgradeResultInfo.getUserID()));
        arrayList.add(new BasicNameValuePair("jsonStr", upgradeResultInfo.getJsonStr()));
        String a = NetUtil.a(a.j, arrayList, context, false);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(a);
            a = jSONObject.getString("errorMessage");
            String string = jSONObject.getString("errorMessage");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(jSONObject.getString("commandCode"));
            planeMsg.setErrorCode(string);
            planeMsg.setErrorMessage(a);
            planeMsg.setSuccess(z);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public PlaneMsg a(Context context, String str) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getVersionContent"));
        arrayList.add(new BasicNameValuePair("appversion", str));
        String a = NetUtil.a(a.j, arrayList, context, false);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(a);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("errorMessage");
            boolean z = jSONObject.getBoolean("success");
            String string3 = jSONObject.getString("commandCode");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData((AppVersion) ae.b(AppVersion.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
            }
            planeMsg.setCommandCode(string3);
            planeMsg.setErrorCode(string2);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public PlaneMsg a(String str, Context context) {
        return null;
    }

    public PlaneMsg b(Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getDeviceNewVersion"));
        User b = a.b(c.a());
        if (!(b == null || TextUtils.isEmpty(b.getUserID()))) {
            arrayList.add(new BasicNameValuePair("userID", b.getUserID()));
        }
        String a = NetUtil.a(a.j, arrayList, context, false);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(a);
            a = jSONObject.getString("errorMessage");
            String string = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            String string2 = jSONObject.getString("commandCode");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData(ae.a(UpdateVersonBean[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
            }
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string);
            planeMsg.setErrorMessage(a);
            planeMsg.setSuccess(z);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public boolean b(String str, Context context) {
        return false;
    }
}
