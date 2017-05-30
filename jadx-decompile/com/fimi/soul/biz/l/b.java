package com.fimi.soul.biz.l;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.m.c;
import com.fimi.soul.entity.BroadcastComment;
import com.fimi.soul.entity.BroadcastMode;
import com.fimi.soul.entity.Page;
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

public class b implements c {
    public PlaneMsg a(Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getBroadcastListPaging"));
        arrayList.add(new BasicNameValuePair("userID", a.b(context).getUserID()));
        arrayList.add(new BasicNameValuePair("xiaomiID", a.b(context).getXiaomiID()));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData(ae.a(BroadcastMode[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
            }
            if (!jSONObject.isNull("page")) {
                planeMsg.setPage((Page) ae.b(Page.class, jSONObject.getJSONObject("page").toString()));
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

    public PlaneMsg a(Context context, int i) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getNewBroadcastList"));
        arrayList.add(new BasicNameValuePair("userID", a.b(context).getUserID()));
        arrayList.add(new BasicNameValuePair("curPage", i + ""));
        arrayList.add(new BasicNameValuePair("pageSize", "10"));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData(ae.a(BroadcastMode[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
            }
            if (!jSONObject.isNull("page")) {
                planeMsg.setPage((Page) ae.b(Page.class, jSONObject.getJSONObject("page").toString()));
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

    public PlaneMsg a(Context context, BroadcastComment broadcastComment) {
        String broadcastID = broadcastComment.getBroadcastID();
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addBroadcastComment"));
        arrayList.add(new BasicNameValuePair("content", broadcastComment.getContent()));
        arrayList.add(new BasicNameValuePair("broadcastID", broadcastComment.getBroadcastID()));
        arrayList.add(new BasicNameValuePair("userID", broadcastComment.getUserID()));
        arrayList.add(new BasicNameValuePair("userCommentID", broadcastComment.getUserCommentID()));
        arrayList.add(new BasicNameValuePair("userCommentName", broadcastComment.getUserCommentName()));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            b = jSONObject.getString("errorMessage");
            String string = jSONObject.getString("commandCode");
            String string2 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (z) {
                return b(context, broadcastID, 1);
            }
            planeMsg.setCommandCode(string);
            planeMsg.setErrorCode(string2);
            planeMsg.setErrorMessage(b);
            planeMsg.setSuccess(z);
            return planeMsg;
        } catch (JSONException e) {
            e.printStackTrace();
            return planeMsg;
        }
    }

    public PlaneMsg a(Context context, String str, int i) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getBroadcastListPaging"));
        arrayList.add(new BasicNameValuePair("userID", str));
        arrayList.add(new BasicNameValuePair("curPage", i + ""));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData(ae.a(BroadcastMode[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
            }
            if (!jSONObject.isNull("page")) {
                planeMsg.setPage((Page) ae.b(Page.class, jSONObject.getJSONObject("page").toString()));
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

    public PlaneMsg a(Context context, String str, String str2) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addPraise"));
        arrayList.add(new BasicNameValuePair("broadcastID", str));
        arrayList.add(new BasicNameValuePair("userID", str2));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData((BroadcastMode) ae.b(BroadcastMode.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
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

    public PlaneMsg a(BroadcastMode broadcastMode, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addBroadcast"));
        arrayList.add(new BasicNameValuePair("content", broadcastMode.getContent()));
        arrayList.add(new BasicNameValuePair("imgUrl", broadcastMode.getImgUrl()));
        arrayList.add(new BasicNameValuePair("userID", broadcastMode.getUserID()));
        arrayList.add(new BasicNameValuePair("objectName", broadcastMode.getObjectName()));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData((BroadcastMode) ae.b(BroadcastMode.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
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

    public PlaneMsg a(String str, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getContentById"));
        arrayList.add(new BasicNameValuePair("contentid", str));
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
                planeMsg.setData((BroadcastMode) ae.b(BroadcastMode.class, jSONObject2));
                b = jSONObject2;
            }
            BroadcastMode broadcastMode = (BroadcastMode) ae.b(BroadcastMode.class, b);
            planeMsg.setCommandCode(string2);
            planeMsg.setData(broadcastMode);
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

    public PlaneMsg b(Context context, int i) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getHotBroadCastList"));
        arrayList.add(new BasicNameValuePair("userID", a.b(context).getUserID()));
        arrayList.add(new BasicNameValuePair("curPage", i + ""));
        arrayList.add(new BasicNameValuePair("pageSize", "10"));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData(ae.a(BroadcastMode[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
            }
            if (!jSONObject.isNull("page")) {
                planeMsg.setPage((Page) ae.b(Page.class, jSONObject.getJSONObject("page").toString()));
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

    public PlaneMsg b(Context context, String str, int i) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getBroadcastCommentList"));
        arrayList.add(new BasicNameValuePair("broadcastID", str));
        arrayList.add(new BasicNameValuePair("curPage", i + ""));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData(ae.a(BroadcastComment[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
            }
            if (!jSONObject.isNull("page")) {
                planeMsg.setPage((Page) ae.b(Page.class, jSONObject.getJSONObject("page").toString()));
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

    public PlaneMsg b(Context context, String str, String str2) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addBroadcastCommentPraise"));
        arrayList.add(new BasicNameValuePair("broadcastCommentID", str));
        arrayList.add(new BasicNameValuePair("userID", str2));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData((BroadcastComment) ae.b(BroadcastComment.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
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

    public PlaneMsg b(BroadcastMode broadcastMode, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "delBroadcast"));
        arrayList.add(new BasicNameValuePair("broadCastID", broadcastMode.getBroadcastID()));
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

    public boolean b(String str, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "delContentById"));
        arrayList.add(new BasicNameValuePair("contentid", str));
        try {
            return new JSONObject(NetUtil.b(a.j, arrayList, context)).getBoolean("success");
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public PlaneMsg c(Context context, String str, int i) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getAttentionBroadcastList"));
        arrayList.add(new BasicNameValuePair("userID", str));
        arrayList.add(new BasicNameValuePair("curPage", i + ""));
        arrayList.add(new BasicNameValuePair("pageSize", "10"));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData(ae.a(BroadcastMode[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
            }
            if (!jSONObject.isNull("page")) {
                planeMsg.setPage((Page) ae.b(Page.class, jSONObject.getJSONObject("page").toString()));
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

    public PlaneMsg c(BroadcastMode broadcastMode, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addInform"));
        arrayList.add(new BasicNameValuePair("userID", broadcastMode.getUserID()));
        arrayList.add(new BasicNameValuePair("content", broadcastMode.getContent()));
        arrayList.add(new BasicNameValuePair("broadcastID", broadcastMode.getBroadcastID()));
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

    public PlaneMsg c(String str, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getBroadCast"));
        arrayList.add(new BasicNameValuePair("broadcastID", str));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData((BroadcastMode) ae.b(BroadcastMode.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
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
}
