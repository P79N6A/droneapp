package com.fimi.soul.biz.l;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.m.d;
import com.fimi.soul.entity.Describehistor;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ae;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

public class c implements d {
    public PlaneMsg a(Context context) {
        return null;
    }

    public PlaneMsg a(String str, Context context) {
        return null;
    }

    public PlaneMsg b(Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getBillBoardYear"));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            ArrayList a = ae.a(Describehistor[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
            planeMsg.setData(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public boolean b(String str, Context context) {
        return false;
    }

    public PlaneMsg c(Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getBillBoardMonth"));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            ArrayList a = ae.a(Describehistor[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
            planeMsg.setData(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public PlaneMsg d(Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getBillBoardWeek"));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            ArrayList a = ae.a(Describehistor[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
            planeMsg.setData(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public PlaneMsg e(Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getBillBoardDay"));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            ArrayList a = ae.a(Describehistor[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
            planeMsg.setData(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }
}
