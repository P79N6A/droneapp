package com.fimi.soul.base;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.LocationManager;
import android.text.TextUtils;
import com.fimi.kernel.utils.v;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.NetUtil;
import com.loopj.android.http.AsyncHttpClient;

public class a
{
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
  
  public static void a(Context paramContext)
  {
    paramContext = v.a(paramContext);
    String str = paramContext.f("name");
    if ((str != null) && (!"".equals(str)))
    {
      aa.setName(str);
      str = paramContext.f("nickname");
      if ((str == null) || ("".equals(str))) {
        break label196;
      }
      aa.setNickName(str);
      label59:
      str = paramContext.f("sex");
      if ((str == null) || ("".equals(str))) {
        break label207;
      }
      aa.setSex(str);
    }
    for (;;)
    {
      str = paramContext.f("signature");
      aa.setSignature(str);
      aa.setXiaomiID(paramContext.f("xiaomiId"));
      aa.setUserIDs(paramContext.f("userIDs"));
      aa.setUserID(paramContext.f("userID"));
      aa.setUserImgUrl(paramContext.f("userImgUrl"));
      aa.setCurLatitude(paramContext.f("curLatitude"));
      aa.setCurLongitude(paramContext.f("curLongitude"));
      aa.setPhone(paramContext.f("phone"));
      return;
      aa.setName("小飞");
      break;
      label196:
      aa.setNickName("飞飞");
      break label59;
      label207:
      aa.setSex("男");
    }
  }
  
  public static void a(Context paramContext, User paramUser)
  {
    a(paramUser);
    paramContext = v.a(paramContext);
    paramContext.a("name", aa.getName());
    paramContext.a("nickname", aa.getNickName());
    paramContext.a("sex", aa.getSex());
    paramContext.a("device", aa.getDevice());
    paramContext.a("signature", aa.getSignature());
    paramContext.a("userIDs", aa.getUserIDs());
    paramContext.a("phone", aa.getPhone());
    paramContext.a("xiaomiId", aa.getXiaomiID());
    paramContext.a("userID", aa.getUserID());
    paramContext.a("isfirstloading", "");
    paramContext.a("userImgUrl", aa.getUserImgUrl());
    paramContext.a("objectName", aa.getObjectName());
    paramContext.a("curLongitude", aa.getCurLongitude());
    paramContext.a("curLatitude", aa.getCurLatitude());
  }
  
  public static void a(User paramUser)
  {
    aa.setCountry(paramUser.getCountry());
    aa.setCurLatitude(paramUser.getCurLatitude());
    aa.setCurLongitude(paramUser.getCurLongitude());
    aa.setDevice(paramUser.getDevice());
    aa.setPhone(paramUser.getPhone());
    aa.setName(paramUser.getName());
    aa.setNickName(paramUser.getNickName());
    aa.setSex(paramUser.getSex());
    aa.setSignature(paramUser.getSignature());
    aa.setUserIDs(paramUser.getUserIDs());
    aa.setUserImgUrl(paramUser.getUserImgUrl());
    aa.setXiaomiID(paramUser.getXiaomiID());
    aa.setUserID(paramUser.getUserID());
    aa.setCurLatitude(paramUser.getCurLatitude());
    aa.setCurLongitude(paramUser.getCurLongitude());
  }
  
  public static void a(AsyncHttpClient paramAsyncHttpClient, SharedPreferences paramSharedPreferences)
  {
    paramAsyncHttpClient.addHeader("Cookie", "name=" + paramSharedPreferences.getString("cookie_name", ""));
    paramAsyncHttpClient.addHeader("Cookie", "password=" + paramSharedPreferences.getString("cookie_password", ""));
    paramAsyncHttpClient.addHeader("Cookie", "JSESSIONID=" + NetUtil.a);
    paramAsyncHttpClient.addHeader("Cookie", "key=" + paramSharedPreferences.getString("cookie_key", ""));
    paramAsyncHttpClient.addHeader("Cookie", "datasourceName=" + paramSharedPreferences.getString("cookie_datasourceName", ""));
  }
  
  public static void a(String paramString, Class paramClass) {}
  
  public static User b(Context paramContext)
  {
    if (TextUtils.isEmpty(aa.getUserID())) {
      a(paramContext);
    }
    return aa;
  }
  
  public static void c(Context paramContext)
  {
    v.a(paramContext).a().edit().remove("userID").commit();
    aa.setUserID("");
    aa.setName("");
    aa.setNickName("");
    aa.setSignature("");
    aa.setCountry("");
  }
  
  public static final boolean d(Context paramContext)
  {
    paramContext = (LocationManager)paramContext.getSystemService("location");
    boolean bool = paramContext.isProviderEnabled("network");
    return (paramContext.isProviderEnabled("gps")) || (bool);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/base/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */