package m.framework.b;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.fimi.soul.entity.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

public class b {
    private static b b;
    private Context a;

    public b(Context context) {
        this.a = context.getApplicationContext();
    }

    public static b a(Context context) {
        if (b == null) {
            b = new b(context);
        }
        return b;
    }

    private boolean a(PackageInfo packageInfo) {
        return ((packageInfo.applicationInfo.flags & 1) == 1) || ((packageInfo.applicationInfo.flags & 128) == 1);
    }

    private boolean w() {
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
        if (telephonyManager == null) {
            return false;
        }
        switch (telephonyManager.getNetworkType()) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
                return false;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return false;
            case 8:
                return true;
            case 9:
                return true;
            case 10:
                return true;
            case 11:
                return false;
            case 12:
                return true;
            case 13:
                return true;
            case 14:
                return true;
            case 15:
                return true;
            default:
                return false;
        }
    }

    public String a(String str, String str2) {
        String encodeToString;
        Throwable th;
        try {
            encodeToString = Base64.encodeToString(a.a(str2, str), 0);
            try {
                if (encodeToString.contains("\n")) {
                    encodeToString = encodeToString.replace("\n", "");
                }
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                return encodeToString;
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            encodeToString = null;
            th = th4;
            th.printStackTrace();
            return encodeToString;
        }
        return encodeToString;
    }

    public ArrayList<HashMap<String, String>> a(boolean z) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList();
        try {
            PackageManager packageManager = this.a.getPackageManager();
            for (PackageInfo packageInfo : packageManager.getInstalledPackages(0)) {
                if (z || !a(packageInfo)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("pkg", packageInfo.packageName);
                    hashMap.put(User.FN_NAME, packageInfo.applicationInfo.loadLabel(packageManager).toString());
                    hashMap.put("version", packageInfo.versionName);
                    arrayList.add(hashMap);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    public boolean a() {
        return false;
    }

    public String b() {
        WifiManager wifiManager = (WifiManager) this.a.getSystemService("wifi");
        if (wifiManager == null) {
            return null;
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo == null) {
            return null;
        }
        String macAddress = connectionInfo.getMacAddress();
        if (macAddress == null) {
            macAddress = null;
        }
        return macAddress;
    }

    public String c() {
        return Build.MODEL;
    }

    public String d() {
        return Build.MANUFACTURER;
    }

    public String e() {
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        String deviceId = telephonyManager.getDeviceId();
        String str = "";
        if (deviceId != null) {
            str = new String(deviceId).replace("0", "");
        }
        if ((deviceId == null || r2.length() <= 0) && VERSION.SDK_INT >= 9) {
            try {
                Class cls = Class.forName("android.os.SystemProperties");
                deviceId = (String) cls.getMethod("get", new Class[]{String.class, String.class}).invoke(cls, new Object[]{"ro.serialno", "unknown"});
            } catch (Throwable th) {
                th.printStackTrace();
                deviceId = null;
            }
        }
        return deviceId;
    }

    public String f() {
        return a(c() + "|" + g() + "|" + d() + "|" + i() + "|" + h(), n().substring(0, 16));
    }

    public String g() {
        return String.valueOf(VERSION.SDK_INT);
    }

    public String h() {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        return this.a.getResources().getConfiguration().orientation == 1 ? displayMetrics.widthPixels + "x" + displayMetrics.heightPixels : displayMetrics.heightPixels + "x" + displayMetrics.widthPixels;
    }

    public String i() {
        Object simOperator = ((TelephonyManager) this.a.getSystemService("phone")).getSimOperator();
        return TextUtils.isEmpty(simOperator) ? "-1" : simOperator;
    }

    public String j() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        if (1 == type) {
            return "wifi";
        }
        if (type != 0) {
            return null;
        }
        String defaultHost = Proxy.getDefaultHost();
        String str = "";
        if (defaultHost != null && defaultHost.length() > 0) {
            str = " wap";
        }
        return new StringBuilder(String.valueOf(w() ? "3G" : "2G")).append(str).toString();
    }

    public int k() {
        return 1;
    }

    public JSONArray l() {
        JSONArray jSONArray = new JSONArray();
        ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
        if (activityManager == null) {
            return jSONArray;
        }
        List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return jSONArray;
        }
        for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            jSONArray.put(runningAppProcessInfo.processName);
        }
        return jSONArray;
    }

    public String m() {
        JSONArray l = l();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < l.length(); i++) {
            if (i > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(String.valueOf(l.get(i)));
        }
        return stringBuilder.toString();
    }

    public String n() {
        try {
            String b = b();
            String e = e();
            return a.a(a.a(new StringBuilder(String.valueOf(b)).append(":").append(e).append(":").append(c()).toString()));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public String o() {
        return this.a.getPackageName();
    }

    public String p() {
        String str = this.a.getApplicationInfo().name;
        if (str != null) {
            return str;
        }
        int i = this.a.getApplicationInfo().labelRes;
        return i > 0 ? this.a.getString(i) : str;
    }

    public int q() {
        int i = 0;
        try {
            return this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode;
        } catch (Throwable th) {
            th.printStackTrace();
            return i;
        }
    }

    public String r() {
        try {
            return this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            th.printStackTrace();
            return "1.0";
        }
    }

    public String s() {
        return ((TelephonyManager) this.a.getSystemService("phone")).getNetworkOperator();
    }

    public String t() {
        try {
            return ((RunningTaskInfo) ((ActivityManager) this.a.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getPackageName();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public boolean u() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public String v() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }
}
