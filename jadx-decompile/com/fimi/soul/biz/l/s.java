package com.fimi.soul.biz.l;

import android.content.Context;
import android.location.Location;
import android.util.Log;
import com.facebook.common.util.UriUtil;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.m.o;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.entity.FlightTimeInfo;
import com.fimi.soul.entity.NearPerson;
import com.fimi.soul.entity.Page;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.Relation;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ae;
import com.fimi.soul.utils.ao;
import com.xiaomi.account.openauth.AuthorizeApi;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class s implements o {
    private static String a = XiaomiOAuthConstants.OPEN_API_PATH_PROFILE;
    private MyLocationManager b;

    public s(Context context) {
        this.b = MyLocationManager.a(context);
    }

    public PlaneMsg a(Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getAllUsers"));
        String str = a.j;
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            b = jSONObject.getString("errorMessage");
            String string = jSONObject.getString("commandCode");
            String string2 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            ArrayList a = ae.a(User[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString());
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

    public PlaneMsg a(Relation relation, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addUserRelation"));
        arrayList.add(new BasicNameValuePair("userID", relation.getUserID()));
        arrayList.add(new BasicNameValuePair("relationID", relation.getRelationID()));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData((Relation) ae.b(Relation.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
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

    public PlaneMsg a(User user, int i, String str, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "selectNearbyPerson"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        arrayList.add(new BasicNameValuePair("sex", user.getSex()));
        arrayList.add(new BasicNameValuePair("curLongitude", user.getCurLongitude()));
        arrayList.add(new BasicNameValuePair("curLatitude", user.getCurLatitude()));
        arrayList.add(new BasicNameValuePair("curPage", i + ""));
        arrayList.add(new BasicNameValuePair("pageSize", "20"));
        arrayList.add(new BasicNameValuePair("distance", str));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData(ae.a(NearPerson[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
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

    public PlaneMsg a(User user, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", MiPushClient.COMMAND_REGISTER));
        arrayList.add(new BasicNameValuePair(User.FN_NAME, user.getName()));
        arrayList.add(new BasicNameValuePair("signature", user.getSignature()));
        arrayList.add(new BasicNameValuePair("country", user.getCountry()));
        arrayList.add(new BasicNameValuePair("nickName", user.getNickName()));
        arrayList.add(new BasicNameValuePair("userIDs", user.getUserIDs()));
        arrayList.add(new BasicNameValuePair("xiaomiID", user.getXiaomiID()));
        arrayList.add(new BasicNameValuePair("device", user.getDevice()));
        arrayList.add(new BasicNameValuePair("sex", user.getSex()));
        arrayList.add(new BasicNameValuePair("phone", user.getPhone()));
        arrayList.add(new BasicNameValuePair("userImgUrl", user.getUserImgUrl()));
        Location c = this.b.c();
        if (c != null && com.fimi.soul.biz.manager.o.a(context).d()) {
            arrayList.add(new BasicNameValuePair("curLongitude", this.b.b() + ""));
            arrayList.add(new BasicNameValuePair("curLatitude", this.b.a() + ""));
        }
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                User user2 = (User) ae.b(User.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString());
                if (!(c == null || 0.0d == c.getLatitude() || 0.0d == c.getLongitude())) {
                    user2.setCurLongitude(this.b.b() + "");
                    user2.setCurLatitude(this.b.a() + "");
                }
                if (z) {
                    a.a(context, user2);
                }
                planeMsg.setData(user2);
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

    public PlaneMsg a(String str, int i, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "selectNickName"));
        arrayList.add(new BasicNameValuePair("nickName", str));
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
                planeMsg.setData(ae.a(User[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
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

    public PlaneMsg a(String str, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getUserById"));
        arrayList.add(new BasicNameValuePair("userid", str));
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
                planeMsg.setData((User) ae.b(User.class, jSONObject2));
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

    public PlaneMsg a(String str, String str2, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", com.google.firebase.a.a.a.k));
        arrayList.add(new BasicNameValuePair(User.FN_NAME, str));
        arrayList.add(new BasicNameValuePair("pwd", str2));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData((User) ae.b(User.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
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

    public PlaneMsg b(Context context) {
        PlaneMsg planeMsg = new PlaneMsg();
        String str = "";
        try {
            try {
                JSONObject jSONObject = new JSONObject(AuthorizeApi.doHttpGet(context, a, Long.parseLong("2882303761517518920"), com.fimi.soul.biz.g.a.c(context, 0), com.fimi.soul.biz.g.a.b(context, 0), com.fimi.soul.biz.g.a.a(context, 0)));
                if (jSONObject.getString("result").equals("ok")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(UriUtil.DATA_SCHEME);
                    User user = new User();
                    user.setXiaomiID(jSONObject2.getString("userId"));
                    user.setName(jSONObject2.getString("miliaoNick"));
                    user.setNickName(jSONObject2.getString("miliaoNick"));
                    user.setDevice(ao.a(context));
                    if (!jSONObject2.isNull("sex") && jSONObject2.getString("sex").equals(context.getResources().getString(R.string.man))) {
                        user.setSex("1");
                    } else if (!jSONObject2.isNull("sex") && jSONObject2.getString("sex").equals(context.getResources().getString(R.string.woman))) {
                        user.setSex("0");
                    }
                    return a(user, context);
                }
                if (jSONObject.getString("result").equals("error")) {
                    str = jSONObject.getString("description");
                    planeMsg.setErrorCode(jSONObject.getString(XiaomiOAuthConstants.EXTRA_CODE_2));
                    planeMsg.setErrorMessage(str);
                    planeMsg.setSuccess(false);
                }
                return planeMsg;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            str = context.getString(R.string.login_xiaomi_account_sync_fail);
            planeMsg.setErrorCode("110");
            planeMsg.setErrorMessage(str);
            planeMsg.setSuccess(false);
            a.a(str, s.class);
            return planeMsg;
        }
    }

    public PlaneMsg b(User user, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "editUserImage"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        arrayList.add(new BasicNameValuePair("userImgUrl", user.getUserImgUrl()));
        arrayList.add(new BasicNameValuePair("objectName", user.getObjectName()));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                User user2 = (User) ae.b(User.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString());
                if (z) {
                    a.a(context, user2);
                }
                planeMsg.setData(user2);
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

    public PlaneMsg b(String str, int i, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getUserRelations"));
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
                planeMsg.setData(ae.a(Relation[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
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

    public PlaneMsg b(String str, String str2, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "editPushRegID"));
        arrayList.add(new BasicNameValuePair("userID", str));
        arrayList.add(new BasicNameValuePair("regID", str2));
        String b = NetUtil.b(a.j, arrayList, context);
        a.a(b, s.class);
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
        arrayList.add(new BasicNameValuePair("commandCode", "delUserById"));
        arrayList.add(new BasicNameValuePair("userid", str));
        try {
            return new JSONObject(NetUtil.b(a.j, arrayList, context)).getBoolean("success");
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public PlaneMsg c(Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getDynamicDNZ"));
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
            planeMsg.setData(jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public PlaneMsg c(User user, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "editUser"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        arrayList.add(new BasicNameValuePair("sex", user.getSex()));
        arrayList.add(new BasicNameValuePair("signature", user.getSignature()));
        arrayList.add(new BasicNameValuePair("nickName", user.getNickName()));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                User user2 = (User) ae.b(User.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString());
                if (z) {
                    a.a(context, user2);
                }
                planeMsg.setData(user2);
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

    public PlaneMsg c(String str, int i, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getRelationUserList"));
        arrayList.add(new BasicNameValuePair("relationID", str));
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
                planeMsg.setData(ae.a(Relation[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
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

    public PlaneMsg c(String str, Context context) {
        List arrayList = new ArrayList();
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject;
            arrayList.add(new BasicNameValuePair("commandCode", "addPlaneActionList"));
            arrayList.add(new BasicNameValuePair("jsonContent", str));
            if (str != null) {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray != null) {
                    jSONObject = jSONArray.getJSONObject(0);
                    if (jSONObject != null && jSONObject.has("userID")) {
                        arrayList.add(new BasicNameValuePair("userID", jSONObject.getString("userID")));
                    }
                }
            }
            jSONObject = new JSONObject(NetUtil.b(a.j, arrayList, context));
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            Log.i("ljh", "rt : " + jSONObject.toString());
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
            planeMsg.setData(ae.b(FlightTimeInfo.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
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

    public PlaneMsg c(String str, String str2, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addPlaneAction"));
        arrayList.add(new BasicNameValuePair("planeID", str));
        arrayList.add(new BasicNameValuePair("userID", str2));
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
            b = jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString();
            if (b != null) {
                planeMsg.setData(ae.b(FlightTimeInfo.class, b));
            } else {
                planeMsg.setSuccess(false);
            }
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

    public PlaneMsg d(User user, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getIsAttention"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        arrayList.add(new BasicNameValuePair("relationID", user.getCountry()));
        String b = NetUtil.b(a.j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(b);
            b = jSONObject.getString("errorMessage");
            String string = jSONObject.getString("commandCode");
            String string2 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setData(jSONObject.getString(UriUtil.DATA_SCHEME));
            planeMsg.setCommandCode(string);
            planeMsg.setErrorCode(string2);
            planeMsg.setErrorMessage(b);
            planeMsg.setSuccess(z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public PlaneMsg e(User user, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "clearLocation"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        String b = NetUtil.b(a.j, arrayList, context);
        a.a(b, s.class);
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

    public PlaneMsg f(User user, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "exitAircraft"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        a.c(context);
        String b = NetUtil.b(a.j, arrayList, context);
        a.a(b, s.class);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            User user2;
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                String jSONObject2 = jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString();
                user2 = (User) ae.b(User.class, jSONObject2);
                planeMsg.setData(user);
                b = jSONObject2;
            }
            user2 = (User) ae.b(User.class, b);
            planeMsg.setCommandCode(string2);
            planeMsg.setData(user);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public PlaneMsg g(User user, Context context) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "editPhone"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        arrayList.add(new BasicNameValuePair("phone", user.getPhone()));
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
