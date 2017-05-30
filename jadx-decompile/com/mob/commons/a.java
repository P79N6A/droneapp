package com.mob.commons;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.firebase.appindexing.g;
import com.mi.live.openlivesdk.b;
import com.mob.tools.MobLog;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper.NetworkTimeOut;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.R;
import com.mob.tools.utils.ReflectHelper;
import com.tencent.mm.sdk.platformtools.Util;
import com.xiaomi.market.sdk.j;
import java.util.ArrayList;
import java.util.HashMap;

public class a {
    private static HashMap<String, Object> a;
    private static long b;
    private static long c;
    private static boolean d;

    public static long a(Context context) {
        long longValue;
        o(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            longValue = Long.valueOf(String.valueOf(a.get("deviceTime"))).longValue();
        } catch (Throwable th) {
            longValue = 0;
        }
        return ((Long) R.forceCast(a.get("serverTime"), Long.valueOf(0))).longValue() + (elapsedRealtime - longValue);
    }

    private static void b() {
        a = new HashMap();
        a.put("in", Integer.valueOf(0));
        a.put("all", Integer.valueOf(0));
        a.put("aspa", Long.valueOf(2592000));
        a.put("un", Integer.valueOf(0));
        a.put("rt", Integer.valueOf(0));
        a.put("rtsr", Integer.valueOf(300000));
        a.put("mi", Integer.valueOf(0));
        a.put("ext", Integer.valueOf(0));
        a.put("bs", Integer.valueOf(0));
        a.put("bsgap", Integer.valueOf(Strategy.g));
        a.put("di", Integer.valueOf(0));
        a.put("l", Integer.valueOf(0));
        a.put("lgap", Integer.valueOf(Strategy.g));
        a.put("wi", Integer.valueOf(0));
        a.put("adle", Integer.valueOf(172800));
    }

    private static void b(String str) {
        try {
            a = new Hashon().fromJson(str);
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
        }
    }

    public static boolean b(Context context) {
        o(context);
        return 1 == ((Integer) R.forceCast(a.get("rt"), Integer.valueOf(1))).intValue();
    }

    public static int c(Context context) {
        o(context);
        return ((Integer) R.forceCast(a.get("rtsr"), Integer.valueOf(300000))).intValue();
    }

    public static boolean d(Context context) {
        o(context);
        return 1 == ((Integer) R.forceCast(a.get("all"), Integer.valueOf(1))).intValue();
    }

    public static long e(Context context) {
        o(context);
        return ((Long) R.forceCast(a.get("aspa"), Long.valueOf(2592000))).longValue();
    }

    public static boolean f(Context context) {
        o(context);
        return 1 == ((Integer) R.forceCast(a.get("di"), Integer.valueOf(1))).intValue();
    }

    public static boolean g(Context context) {
        o(context);
        return 1 == ((Integer) R.forceCast(a.get("ext"), Integer.valueOf(1))).intValue();
    }

    public static boolean h(Context context) {
        o(context);
        return 1 == ((Integer) R.forceCast(a.get("bs"), Integer.valueOf(1))).intValue();
    }

    public static int i(Context context) {
        o(context);
        return ((Integer) R.forceCast(a.get("bsgap"), Integer.valueOf(Strategy.g))).intValue();
    }

    public static boolean j(Context context) {
        o(context);
        return 1 == ((Integer) R.forceCast(a.get("l"), Integer.valueOf(0))).intValue();
    }

    public static int k(Context context) {
        o(context);
        return ((Integer) R.forceCast(a.get("lgap"), Integer.valueOf(Strategy.g))).intValue();
    }

    public static boolean l(Context context) {
        o(context);
        return 1 == ((Integer) R.forceCast(a.get("wi"), Integer.valueOf(1))).intValue();
    }

    public static long m(Context context) {
        o(context);
        return (((long) ((Integer) R.forceCast(a.get("adle"), Integer.valueOf(172800))).intValue()) * 1000) + a(context);
    }

    private static synchronized void o(Context context) {
        synchronized (a.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (a == null) {
                if (p(context)) {
                    b = elapsedRealtime;
                }
            } else if (elapsedRealtime - b >= Util.MILLSECONDS_OF_MINUTE && q(context)) {
                b = elapsedRealtime;
            }
        }
    }

    private static boolean p(Context context) {
        String r = r(context);
        if (TextUtils.isEmpty(r)) {
            b();
            return false;
        }
        b(r);
        f.d(context, new Hashon().fromHashMap(a));
        return true;
    }

    private static boolean q(Context context) {
        String e = f.e(context);
        if (TextUtils.isEmpty(e)) {
            return p(context);
        }
        b(e);
        if (((Long) R.forceCast(a.get("timestamp"), Long.valueOf(0))).longValue() - c >= 86400000) {
            s(context);
        }
        return true;
    }

    private static String r(Context context) {
        try {
            b a = b.a(context);
            ArrayList a2 = a.a();
            if (a2.isEmpty()) {
                return null;
            }
            Object invokeStaticMethod = ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", new Object[]{context});
            ArrayList arrayList = new ArrayList();
            arrayList.add(new KVPair(b.f, ((MobProduct) a2.get(0)).getProductAppkey()));
            arrayList.add(new KVPair("plat", String.valueOf(ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getPlatformCode", new Object[0]))));
            arrayList.add(new KVPair("apppkg", String.valueOf(ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getPackageName", new Object[0]))));
            arrayList.add(new KVPair("appver", String.valueOf(ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getAppVersionName", new Object[0]))));
            arrayList.add(new KVPair("networktype", String.valueOf(ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getDetailNetworkTypeForStatic", new Object[0]))));
            CharSequence a3 = new com.mob.commons.authorize.a().a(context);
            if (!TextUtils.isEmpty(a3)) {
                arrayList.add(new KVPair("duid", a3));
            }
            NetworkTimeOut networkTimeOut = new NetworkTimeOut();
            networkTimeOut.readTimout = g.g;
            networkTimeOut.connectionTimeout = g.g;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new KVPair("User-Identity", a.a(a2)));
            String httpGet = a.httpGet(t(context), arrayList, arrayList2, networkTimeOut);
            Hashon hashon = new Hashon();
            HashMap fromJson = hashon.fromJson(httpGet);
            if (fromJson == null) {
                return null;
            }
            if ("200".equals(String.valueOf(fromJson.get("status")))) {
                String str = (String) R.forceCast(fromJson.get("sr"));
                if (str != null) {
                    HashMap fromJson2 = hashon.fromJson(Data.AES128Decode("FYsAXMqlWJLCDpnc", Base64.decode(str, 2)));
                    if (fromJson2 != null) {
                        String str2;
                        int intValue;
                        HashMap hashMap = (HashMap) R.forceCast(fromJson2.get("cdata"));
                        if (hashMap != null) {
                            str2 = (String) R.forceCast(hashMap.get(j.HOST));
                            intValue = ((Integer) R.forceCast(hashMap.get("httpport"), Integer.valueOf(0))).intValue();
                            str = (String) R.forceCast(hashMap.get("path"));
                            if (str2 == null || intValue == 0 || str == null) {
                                f.e(context, null);
                            } else {
                                f.e(context, "http://" + str2 + ":" + intValue + str);
                            }
                        } else {
                            f.e(context, null);
                        }
                        hashMap = (HashMap) R.forceCast(fromJson2.get("cconf"));
                        if (hashMap != null) {
                            str2 = (String) R.forceCast(hashMap.get(j.HOST));
                            intValue = ((Integer) R.forceCast(hashMap.get("httpport"), Integer.valueOf(0))).intValue();
                            str = (String) R.forceCast(hashMap.get("path"));
                            if (str2 == null || intValue == 0 || str == null) {
                                f.f(context, null);
                            } else {
                                f.f(context, "http://" + str2 + ":" + intValue + str);
                            }
                        } else {
                            f.f(context, null);
                        }
                    }
                }
                str = (String) R.forceCast(fromJson.get("sc"));
                if (str == null) {
                    throw new Throwable("response is illegal: " + httpGet);
                }
                HashMap fromJson3 = hashon.fromJson(Data.AES128Decode("FYsAXMqlWJLCDpnc", Base64.decode(str, 2)));
                if (fromJson3 == null) {
                    throw new Throwable("response is illegal: " + httpGet);
                }
                long longValue = ((Long) R.forceCast(fromJson.get("timestamp"), Long.valueOf(0))).longValue();
                fromJson3.put("deviceTime", Long.valueOf(SystemClock.elapsedRealtime()));
                fromJson3.put("serverTime", Long.valueOf(longValue));
                return hashon.fromHashMap(fromJson3);
            }
            f.e(context, null);
            f.f(context, null);
            throw new Throwable("response is illegal: " + httpGet);
        } catch (Throwable th) {
            f.e(context, null);
            f.f(context, null);
            MobLog.getInstance().w(th);
            return null;
        }
    }

    private static void s(final Context context) {
        if (!d) {
            d = true;
            new Thread() {
                public void run() {
                    String n = a.r(context);
                    if (!TextUtils.isEmpty(n)) {
                        a.b(n);
                        f.d(context, new Hashon().fromHashMap(a.a));
                    }
                    a.d = false;
                }
            }.start();
        }
    }

    private static String t(Context context) {
        Object obj = null;
        try {
            obj = f.g(context);
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
        }
        return TextUtils.isEmpty(obj) ? "http://m.data.mob.com/v2/cconf" : obj;
    }
}
