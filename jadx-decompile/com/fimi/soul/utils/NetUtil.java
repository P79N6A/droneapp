package com.fimi.soul.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import com.fimi.kernel.utils.f;
import com.fimi.kernel.utils.v;
import com.fimi.soul.base.a;
import com.google.firebase.appindexing.g;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.a.a.f.c.i;
import org.a.a.f.c.n;
import org.a.a.i.b.t;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class NetUtil {
    public static String a = null;
    public static Header b = null;
    public static final String c = "admin";
    private static NetUtil d;

    static {
        System.loadLibrary("server-jni");
    }

    public static NetUtil a() {
        if (d == null) {
            d = new NetUtil();
        }
        return d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r5, java.util.List<org.apache.http.NameValuePair> r6, android.content.Context r7) {
        /*
        r0 = b(r6);
        r0 = a(r0);
        if (r0 == 0) goto L_0x000c;
    L_0x000a:
        r5 = "";
    L_0x000c:
        com.fimi.kernel.utils.v.a(r7);
        a(r6, r7);
        r1 = new org.apache.http.client.methods.HttpPost;
        r1.<init>(r5);
        if (r6 == 0) goto L_0x0029;
    L_0x0019:
        r0 = r6.size();	 Catch:{ UnsupportedEncodingException -> 0x0061 }
        if (r0 <= 0) goto L_0x0029;
    L_0x001f:
        r0 = new org.apache.http.client.entity.UrlEncodedFormEntity;	 Catch:{ UnsupportedEncodingException -> 0x0061 }
        r2 = "UTF-8";
        r0.<init>(r6, r2);	 Catch:{ UnsupportedEncodingException -> 0x0061 }
        r1.setEntity(r0);	 Catch:{ UnsupportedEncodingException -> 0x0061 }
    L_0x0029:
        r2 = b();
        r0 = "";
        r1 = r2.execute(r1);	 Catch:{ Exception -> 0x006e }
        r3 = "Content-Encoding";
        r3 = r1.getFirstHeader(r3);	 Catch:{ Exception -> 0x006e }
        b = r3;	 Catch:{ Exception -> 0x006e }
        r3 = r1.getStatusLine();	 Catch:{ Exception -> 0x006e }
        r3 = r3.getStatusCode();	 Catch:{ Exception -> 0x006e }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r3 != r4) goto L_0x0066;
    L_0x0047:
        r1 = r1.getEntity();	 Catch:{ Exception -> 0x006e }
        r3 = "utf-8";
        r1 = org.apache.http.util.EntityUtils.toString(r1, r3);	 Catch:{ Exception -> 0x006e }
        r3 = getNetKey();	 Catch:{ Exception -> 0x006e }
        r0 = com.fimi.kernel.utils.r.a(r1, r3);	 Catch:{ Exception -> 0x006e }
    L_0x0059:
        r1 = r2.getConnectionManager();
        r1.shutdown();
    L_0x0060:
        return r0;
    L_0x0061:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0029;
    L_0x0066:
        r1 = " request  timeout ";
        r3 = com.fimi.soul.utils.NetUtil.class;
        com.fimi.soul.base.a.a(r1, r3);	 Catch:{ Exception -> 0x006e }
        goto L_0x0059;
    L_0x006e:
        r1 = move-exception;
        r1.printStackTrace();	 Catch:{ all -> 0x007a }
        r1 = r2.getConnectionManager();
        r1.shutdown();
        goto L_0x0060;
    L_0x007a:
        r0 = move-exception;
        r1 = r2.getConnectionManager();
        r1.shutdown();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fimi.soul.utils.NetUtil.a(java.lang.String, java.util.List, android.content.Context):java.lang.String");
    }

    public static String a(String str, List<NameValuePair> list, Context context, boolean z) {
        String entityUtils;
        Exception e;
        if (!z) {
            return a(str, list, context);
        }
        a(list, context);
        v vVar = new v(context);
        if (list != null && list.size() > 0) {
            str = str + "?" + URLEncodedUtils.format(list, "UTF-8");
        }
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
        defaultHttpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(g.g));
        defaultHttpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(120000));
        String str2 = "";
        try {
            HttpResponse execute = defaultHttpClient.execute(new HttpGet(str));
            int statusCode = execute.getStatusLine().getStatusCode();
            b = execute.getFirstHeader("Content-Encoding");
            if (statusCode == 200) {
                List cookies = defaultHttpClient.getCookieStore().getCookies();
                for (int i = 0; i < cookies.size(); i++) {
                    if ("JSESSIONID".equals(((Cookie) cookies.get(i)).getName())) {
                        a = ((Cookie) cookies.get(i)).getValue();
                        break;
                    }
                }
                entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
                try {
                    a.a("data... json: " + entityUtils, NetUtil.class);
                } catch (Exception e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        return entityUtils;
                    } finally {
                        defaultHttpClient.getConnectionManager().shutdown();
                    }
                }
            } else {
                entityUtils = str2;
            }
            defaultHttpClient.getConnectionManager().shutdown();
            return entityUtils;
        } catch (Exception e3) {
            Exception exception = e3;
            entityUtils = str2;
            e = exception;
            e.printStackTrace();
            return entityUtils;
        }
    }

    public static String a(List<NameValuePair> list) {
        Map treeMap = new TreeMap();
        StringBuffer stringBuffer = new StringBuffer();
        if (list != null && list.size() > 0) {
            for (NameValuePair nameValuePair : list) {
                treeMap.put(nameValuePair.getName(), nameValuePair.getValue());
            }
        }
        if (treeMap == null || treeMap.size() == 0) {
            return null;
        }
        for (String str : treeMap.keySet()) {
            if (!(treeMap.get(str) == null || treeMap.get(str) == "")) {
                stringBuffer.append(str + "=" + ((String) treeMap.get(str)) + "&");
            }
        }
        try {
            return at.a(URLEncoder.encode(stringBuffer.toString() + "key=", "utf-8"), getServerTokenKey()).toUpperCase();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void a(List<NameValuePair> list, Context context) {
        list.add(new BasicNameValuePair("req", f.a(new Date(), f.e) + ((int) (Math.random() * 1000000.0d)) + "10"));
        list.add(new BasicNameValuePair("channel", SystemMediaRouteProvider.PACKAGE_NAME));
        list.add(new BasicNameValuePair("deviceID", ao.g(context)));
        list.add(new BasicNameValuePair("visitID", a.b(context).getUserID().equals("") ? "0" : a.b(context).getUserID()));
        list.add(new BasicNameValuePair("local", ao.d()));
        list.add(new BasicNameValuePair("appVersion", ao.d(context)));
        list.add(new BasicNameValuePair("encrypt", "0"));
        list.add(new BasicNameValuePair("signMsg", a((List) list)));
    }

    public static boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
        if (allNetworkInfo == null) {
            return false;
        }
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (networkInfo.isAvailable() && networkInfo.getState() == State.CONNECTED) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String str) {
        boolean z = false;
        for (n nVar : n.values()) {
            if (nVar.toString().equals(str)) {
                z = true;
            }
        }
        return z;
    }

    public static String b(String str, List<NameValuePair> list, Context context) {
        return a(str, list, context);
    }

    public static String b(List<NameValuePair> list) {
        String str = null;
        if (list != null && list.size() > 0) {
            for (NameValuePair nameValuePair : list) {
                str = nameValuePair.getName().equals("commandCode") ? nameValuePair.getValue() : str;
            }
        }
        return str;
    }

    private static HttpClient b() {
        HttpClient httpClient = null;
        try {
            httpClient = t.a().a(new org.a.a.f.c.g(i.c().a().a(null, new n() {
                public boolean a(X509Certificate[] x509CertificateArr, String str) {
                    return true;
                }
            }).c())).i();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e2) {
            e2.printStackTrace();
        } catch (KeyStoreException e3) {
            e3.printStackTrace();
        }
        return httpClient;
    }

    public static native String getLogTokenKey();

    public static native String getNetKey();

    public static native String getSSL1234Key();

    public static native String getServerTokenKey();
}
