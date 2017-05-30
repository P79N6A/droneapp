package com.fimi.soul.biz.l;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.m.n;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.SumFlyDataByMonth;
import com.fimi.soul.entity.UpdateDroneItem;
import com.fimi.soul.entity.UpdatePlannerBackdata;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ae;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

public class r implements n {
    public PlaneMsg a(Context context) {
        return null;
    }

    public PlaneMsg a(UpdateDroneItem updateDroneItem, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addPlaneAction"));
        arrayList.add(new BasicNameValuePair("flyJourney", updateDroneItem.getDistance() + ""));
        arrayList.add(new BasicNameValuePair("flyTimeSum", updateDroneItem.getSportTime() + ""));
        arrayList.add(new BasicNameValuePair("flyFileUrl", updateDroneItem.getUploadurl()));
        arrayList.add(new BasicNameValuePair("planeID", updateDroneItem.getPlaneID() == null ? "123" : updateDroneItem.getPlaneID()));
        arrayList.add(new BasicNameValuePair("userID", a.b(context).getUserID()));
        arrayList.add(new BasicNameValuePair("startDate", updateDroneItem.getRecord_time()));
        arrayList.add(new BasicNameValuePair("endDate", updateDroneItem.getEndddata()));
        arrayList.add(new BasicNameValuePair("year", updateDroneItem.getYear() + ""));
        arrayList.add(new BasicNameValuePair("month", updateDroneItem.getMonth() + ""));
        arrayList.add(new BasicNameValuePair("maxHight", updateDroneItem.getMaxhight() + ""));
        arrayList.add(new BasicNameValuePair("latitude", updateDroneItem.getLatitude() + ""));
        arrayList.add(new BasicNameValuePair("latitude", updateDroneItem.getLongitude() + ""));
        arrayList.add(new BasicNameValuePair("fcType ", updateDroneItem.getFcType()));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            UpdatePlannerBackdata updatePlannerBackdata = (UpdatePlannerBackdata) ae.b(UpdatePlannerBackdata.class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
            planeMsg.setData(updatePlannerBackdata);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public PlaneMsg a(String str, Context context) {
        return null;
    }

    public PlaneMsg a(String str, String str2, int i, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getPlaneActionListByMonth"));
        arrayList.add(new BasicNameValuePair("userID", str));
        arrayList.add(new BasicNameValuePair("monthDate", str2));
        arrayList.add(new BasicNameValuePair("curPage", "1"));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            ArrayList a = ae.a(UpdatePlannerBackdata[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
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

    public PlaneMsg b(UpdateDroneItem updateDroneItem, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "delPlaneActoin"));
        arrayList.add(new BasicNameValuePair("planeActionID", updateDroneItem.getFlag() + ""));
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public boolean b(String str, Context context) {
        return false;
    }

    public PlaneMsg c(String str, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addPlaneActionList"));
        arrayList.add(new BasicNameValuePair("jsonContent", str));
        String a = NetUtil.a(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(a);
            ArrayList a2 = ae.a(UpdatePlannerBackdata[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
            planeMsg.setData(a2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public PlaneMsg d(String str, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getPlaneActionListByUserID"));
        arrayList.add(new BasicNameValuePair("userID", str));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            ArrayList a = ae.a(UpdatePlannerBackdata[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
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

    public PlaneMsg e(String str, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "sumFlyDataByMonth"));
        arrayList.add(new BasicNameValuePair("userID", str));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            ArrayList a = ae.a(SumFlyDataByMonth[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
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
