package com.fimi.soul.base;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.LocationManager;
import android.text.TextUtils;
import com.fimi.kernel.utils.v;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.NetUtil;
import com.google.firebase.a.a.b;
import com.loopj.android.http.AsyncHttpClient;
import com.tencent.mm.sdk.contact.RContact;

public class a {
    public static final String A = "1465961173";
    public static final String B = "f423350548790693b784577448fd7d15";
    public static final String C = "miserver_preferen_";
    public static final String D = "temp_update.apk";
    public static final int E = 0;
    public static final int F = 1;
    public static final String G = "check_firmware_model";
    public static final int H = 0;
    public static final int I = 1;
    public static final String J = "connect_success";
    public static final int K = 0;
    public static final String L = "is_setting_enter";
    public static final int M = 1;
    public static final int N = 2;
    public static final String O = "wifiDistanceFile";
    public static final String P = "ispopDialog";
    public static final String Q = "isdeleteTF";
    public static final String R = "isdirectcalicompass";
    public static final String S = "sava_flight_all_time";
    public static final String T = "save_total_flight_time";
    public static final String U = "sava_flight_cur_time";
    public static final String V = "sava_flight_cur_count";
    public static final String W = "sava_flight_cur_range";
    public static final String X = "sava_flight_all_range";
    public static final int Y = 4;
    public static final String Z = "sp_upgrade_xml";
    public static final boolean a = false;
    private static User aa = new User();
    public static final int b = 1;
    public static final int c = 2;
    public static final String d = "MiPlaneApp";
    public static final boolean e = true;
    public static final boolean f = false;
    public static final String g = "https://fimiservice-us.mi-ae.com";
    public static final String h = "https://fimiservice-us.mi-ae.com/statement.html";
    public static final String i = "https://fimiservice-us.mi-ae.com/privacy.html";
    public static final String j = "https://fimiservice-us.mi-ae.com/android/fimi.service";
    public static final String k = "";
    public static final String l = "yyyy-MM-dd HH:mm:ss";
    public static final String m = "MM-dd HH:mm";
    public static final String n = "https://awsusor0.fds.api.xiaomi.com";
    public static final String o = "bucket-app-us";
    public static final String p = "HmacSHA1";
    public static final String q = "2882303761517518920";
    public static final String r = "5761751863920";
    public static final String s = "sp_new_hand";
    public static final String t = "wx63bc994fd4e454c2";
    public static final String u = "18665971360";
    public static final String v = "fimi12345";
    public static final String w = "b2d5437b351877d9";
    public static final String x = "5c4873e37f2de34e4900cff10349ce6c";
    public static final String y = "XiaoMi";
    public static final String z = "2882303761517518920";

    public static void a(Context context) {
        v a = v.a(context);
        String f = a.f(User.FN_NAME);
        if (f == null || "".equals(f)) {
            aa.setName("小飞");
        } else {
            aa.setName(f);
        }
        f = a.f(RContact.COL_NICKNAME);
        if (f == null || "".equals(f)) {
            aa.setNickName("飞飞");
        } else {
            aa.setNickName(f);
        }
        f = a.f("sex");
        if (f == null || "".equals(f)) {
            aa.setSex("男");
        } else {
            aa.setSex(f);
        }
        aa.setSignature(a.f("signature"));
        aa.setXiaomiID(a.f("xiaomiId"));
        aa.setUserIDs(a.f("userIDs"));
        aa.setUserID(a.f("userID"));
        aa.setUserImgUrl(a.f("userImgUrl"));
        aa.setCurLatitude(a.f("curLatitude"));
        aa.setCurLongitude(a.f("curLongitude"));
        aa.setPhone(a.f("phone"));
    }

    public static void a(Context context, User user) {
        a(user);
        v a = v.a(context);
        a.a(User.FN_NAME, aa.getName());
        a.a(RContact.COL_NICKNAME, aa.getNickName());
        a.a("sex", aa.getSex());
        a.a("device", aa.getDevice());
        a.a("signature", aa.getSignature());
        a.a("userIDs", aa.getUserIDs());
        a.a("phone", aa.getPhone());
        a.a("xiaomiId", aa.getXiaomiID());
        a.a("userID", aa.getUserID());
        a.a("isfirstloading", "");
        a.a("userImgUrl", aa.getUserImgUrl());
        a.a("objectName", aa.getObjectName());
        a.a("curLongitude", aa.getCurLongitude());
        a.a("curLatitude", aa.getCurLatitude());
    }

    public static void a(User user) {
        aa.setCountry(user.getCountry());
        aa.setCurLatitude(user.getCurLatitude());
        aa.setCurLongitude(user.getCurLongitude());
        aa.setDevice(user.getDevice());
        aa.setPhone(user.getPhone());
        aa.setName(user.getName());
        aa.setNickName(user.getNickName());
        aa.setSex(user.getSex());
        aa.setSignature(user.getSignature());
        aa.setUserIDs(user.getUserIDs());
        aa.setUserImgUrl(user.getUserImgUrl());
        aa.setXiaomiID(user.getXiaomiID());
        aa.setUserID(user.getUserID());
        aa.setCurLatitude(user.getCurLatitude());
        aa.setCurLongitude(user.getCurLongitude());
    }

    public static void a(AsyncHttpClient asyncHttpClient, SharedPreferences sharedPreferences) {
        asyncHttpClient.addHeader("Cookie", "name=" + sharedPreferences.getString("cookie_name", ""));
        asyncHttpClient.addHeader("Cookie", "password=" + sharedPreferences.getString("cookie_password", ""));
        asyncHttpClient.addHeader("Cookie", "JSESSIONID=" + NetUtil.a);
        asyncHttpClient.addHeader("Cookie", "key=" + sharedPreferences.getString("cookie_key", ""));
        asyncHttpClient.addHeader("Cookie", "datasourceName=" + sharedPreferences.getString("cookie_datasourceName", ""));
    }

    public static void a(String str, Class cls) {
    }

    public static User b(Context context) {
        if (TextUtils.isEmpty(aa.getUserID())) {
            a(context);
        }
        return aa;
    }

    public static void c(Context context) {
        v.a(context).a().edit().remove("userID").commit();
        aa.setUserID("");
        aa.setName("");
        aa.setNickName("");
        aa.setSignature("");
        aa.setCountry("");
    }

    public static final boolean d(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService(b.p);
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }
}
