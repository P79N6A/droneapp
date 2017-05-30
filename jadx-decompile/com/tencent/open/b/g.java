package com.tencent.open.b;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.baidu.tts.loopj.AsyncHttpClient;
import com.facebook.common.util.UriUtil;
import com.mi.live.openlivesdk.b;
import com.tencent.connect.common.Constants;
import com.tencent.open.a.f;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.OpenConfig;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.ThreadManager;
import com.tencent.open.utils.Util;
import com.xiaomi.market.sdk.j;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.entity.ByteArrayEntity;
import org.json.JSONArray;
import org.json.JSONObject;

public class g {
    protected static final String a = (f.d + ".ReportManager");
    protected static g b;
    protected Random c = new Random();
    protected List<Serializable> d = Collections.synchronizedList(new ArrayList());
    protected List<Serializable> e = Collections.synchronizedList(new ArrayList());
    protected HandlerThread f = null;
    protected Handler g;

    private g() {
        if (this.f == null) {
            this.f = new HandlerThread("opensdk.report.handlerthread", 10);
            this.f.start();
        }
        if (this.f.isAlive() && this.f.getLooper() != null) {
            this.g = new Handler(this, this.f.getLooper()) {
                final /* synthetic */ g a;

                public void handleMessage(Message message) {
                    switch (message.what) {
                        case 1000:
                            this.a.b();
                            break;
                        case 1001:
                            this.a.e();
                            break;
                    }
                    super.handleMessage(message);
                }
            };
        }
    }

    public static synchronized g a() {
        g gVar;
        synchronized (g.class) {
            if (b == null) {
                b = new g();
            }
            gVar = b;
        }
        return gVar;
    }

    protected int a(int i) {
        int i2;
        if (i == 0) {
            i2 = OpenConfig.getInstance(Global.getContext(), null).getInt("Common_CGIReportFrequencySuccess");
            return i2 == 0 ? 10 : i2;
        } else {
            i2 = OpenConfig.getInstance(Global.getContext(), null).getInt("Common_CGIReportFrequencyFailed");
            return i2 == 0 ? 100 : i2;
        }
    }

    public void a(final Bundle bundle, String str, final boolean z) {
        if (bundle != null) {
            f.b(a, "-->reportVia, bundle: " + bundle.toString());
            if (a("report_via", str) || z) {
                this.g.post(new Runnable(this) {
                    final /* synthetic */ g c;

                    public void run() {
                        try {
                            Bundle bundle = new Bundle();
                            bundle.putString("uin", Constants.DEFAULT_UIN);
                            bundle.putString("imei", c.b(Global.getContext()));
                            bundle.putString("imsi", c.c(Global.getContext()));
                            bundle.putString("android_id", c.d(Global.getContext()));
                            bundle.putString("mac", c.a());
                            bundle.putString(Constants.PARAM_PLATFORM, "1");
                            bundle.putString("os_ver", VERSION.RELEASE);
                            bundle.putString("position", Util.getLocation(Global.getContext()));
                            bundle.putString("network", a.a(Global.getContext()));
                            bundle.putString("language", c.b());
                            bundle.putString(j.ai, c.a(Global.getContext()));
                            bundle.putString("apn", a.b(Global.getContext()));
                            bundle.putString("model_name", Build.MODEL);
                            bundle.putString("timezone", TimeZone.getDefault().getID());
                            bundle.putString("sdk_ver", Constants.SDK_VERSION);
                            bundle.putString("qz_ver", Util.getAppVersionName(Global.getContext(), Constants.PACKAGE_QZONE));
                            bundle.putString("qq_ver", Util.getVersionName(Global.getContext(), "com.tencent.mobileqq"));
                            bundle.putString("qua", Util.getQUA3(Global.getContext(), Global.getPackageName()));
                            bundle.putString(b.g, Global.getPackageName());
                            bundle.putString("app_ver", Util.getAppVersionName(Global.getContext(), Global.getPackageName()));
                            if (bundle != null) {
                                bundle.putAll(bundle);
                            }
                            this.c.e.add(new b(bundle));
                            int size = this.c.e.size();
                            int i = OpenConfig.getInstance(Global.getContext(), null).getInt("Agent_ReportTimeInterval");
                            if (i == 0) {
                                i = 10000;
                            }
                            if (this.c.a("report_via", size) || z) {
                                this.c.e();
                                this.c.g.removeMessages(1001);
                            } else if (!this.c.g.hasMessages(1001)) {
                                Message obtain = Message.obtain();
                                obtain.what = 1001;
                                this.c.g.sendMessageDelayed(obtain, (long) i);
                            }
                        } catch (Throwable e) {
                            f.b(g.a, "--> reporVia, exception in sub thread.", e);
                        }
                    }
                });
            }
        }
    }

    public void a(String str, long j, long j2, long j3, int i) {
        a(str, j, j2, j3, i, "", false);
    }

    public void a(String str, long j, long j2, long j3, int i, String str2, boolean z) {
        f.b(a, "-->reportCgi, command: " + str + " | startTime: " + j + " | reqSize:" + j2 + " | rspSize: " + j3 + " | responseCode: " + i + " | detail: " + str2);
        if (a("report_cgi", "" + i) || z) {
            final long j4 = j;
            final String str3 = str;
            final String str4 = str2;
            final int i2 = i;
            final long j5 = j2;
            final long j6 = j3;
            final boolean z2 = z;
            this.g.post(new Runnable(this) {
                final /* synthetic */ g h;

                public void run() {
                    int i = 1;
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - j4;
                        Bundle bundle = new Bundle();
                        String a = a.a(Global.getContext());
                        bundle.putString("apn", a);
                        bundle.putString("appid", "1000067");
                        bundle.putString("commandid", str3);
                        bundle.putString(com.google.android.gms.analytics.a.b.a, str4);
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("network=").append(a).append('&');
                        stringBuilder.append("sdcard=").append(Environment.getExternalStorageState().equals("mounted") ? 1 : 0).append('&');
                        stringBuilder.append("wifi=").append(a.e(Global.getContext()));
                        bundle.putString("deviceInfo", stringBuilder.toString());
                        int a2 = 100 / this.h.a(i2);
                        if (a2 > 0) {
                            i = a2 > 100 ? 100 : a2;
                        }
                        bundle.putString("frequency", i + "");
                        bundle.putString("reqSize", j5 + "");
                        bundle.putString("resultCode", i2 + "");
                        bundle.putString("rspSize", j6 + "");
                        bundle.putString("timeCost", elapsedRealtime + "");
                        bundle.putString("uin", Constants.DEFAULT_UIN);
                        this.h.d.add(new b(bundle));
                        int size = this.h.d.size();
                        i = OpenConfig.getInstance(Global.getContext(), null).getInt("Agent_ReportTimeInterval");
                        if (i == 0) {
                            i = 10000;
                        }
                        if (this.h.a("report_cgi", size) || z2) {
                            this.h.b();
                            this.h.g.removeMessages(1000);
                        } else if (!this.h.g.hasMessages(1000)) {
                            Message obtain = Message.obtain();
                            obtain.what = 1000;
                            this.h.g.sendMessageDelayed(obtain, (long) i);
                        }
                    } catch (Throwable e) {
                        f.b(g.a, "--> reportCGI, exception in sub thread.", e);
                    }
                }
            });
        }
    }

    public void a(String str, String str2, Bundle bundle, boolean z) {
        final Bundle bundle2 = bundle;
        final String str3 = str;
        final boolean z2 = z;
        final String str4 = str2;
        ThreadManager.executeOnSubThread(new Runnable(this) {
            final /* synthetic */ g e;

            public void run() {
                int i;
                Object obj = null;
                if (bundle2 == null) {
                    f.e(g.a, "-->httpRequest, params is null!");
                    return;
                }
                HttpUriRequest httpGet;
                int a = e.a();
                int i2 = a == 0 ? 3 : a;
                f.b(g.a, "-->httpRequest, retryCount: " + i2);
                HttpClient httpClient = HttpUtils.getHttpClient(Global.getContext(), null, str3);
                String encodeUrl = HttpUtils.encodeUrl(bundle2);
                String encode = z2 ? URLEncoder.encode(encodeUrl) : encodeUrl;
                if (str4.toUpperCase().equals("GET")) {
                    StringBuffer stringBuffer = new StringBuffer(str3);
                    stringBuffer.append(encode);
                    httpGet = new HttpGet(stringBuffer.toString());
                } else if (str4.toUpperCase().equals("POST")) {
                    HttpPost httpPost = new HttpPost(str3);
                    httpPost.setEntity(new ByteArrayEntity(encode.getBytes()));
                    Object obj2 = httpPost;
                } else {
                    f.e(g.a, "-->httpRequest unkonw request method return.");
                    return;
                }
                httpGet.addHeader("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
                httpGet.addHeader("Content-Type", org.a.a.c.f.j.a);
                a = 0;
                do {
                    a++;
                    try {
                        int statusCode = httpClient.execute(httpGet).getStatusLine().getStatusCode();
                        f.b(g.a, "-->httpRequest, statusCode: " + statusCode);
                        if (statusCode != 200) {
                            f.b(g.a, "-->ReportCenter httpRequest : HttpStatuscode != 200");
                            break;
                        }
                        try {
                            f.b(g.a, "-->ReportCenter httpRequest Thread success");
                            i = 1;
                            break;
                        } catch (ConnectTimeoutException e) {
                            i = 1;
                        } catch (SocketTimeoutException e2) {
                            i = 1;
                            f.b(g.a, "-->ReportCenter httpRequest SocketTimeoutException");
                            continue;
                            if (a >= i2) {
                                if (obj == 1) {
                                    f.b(g.a, "-->ReportCenter httpRequest Thread request failed");
                                } else {
                                    f.b(g.a, "-->ReportCenter httpRequest Thread request success");
                                }
                            }
                        } catch (Exception e3) {
                            i = 1;
                        }
                    } catch (ConnectTimeoutException e4) {
                        try {
                            f.b(g.a, "-->ReportCenter httpRequest ConnectTimeoutException");
                            continue;
                            if (a >= i2) {
                                if (obj == 1) {
                                    f.b(g.a, "-->ReportCenter httpRequest Thread request failed");
                                } else {
                                    f.b(g.a, "-->ReportCenter httpRequest Thread request success");
                                }
                            }
                        } catch (Exception e5) {
                            f.b(g.a, "-->httpRequest, exception in serial executor.");
                            return;
                        }
                    } catch (SocketTimeoutException e6) {
                        f.b(g.a, "-->ReportCenter httpRequest SocketTimeoutException");
                        continue;
                        if (a >= i2) {
                            if (obj == 1) {
                                f.b(g.a, "-->ReportCenter httpRequest Thread request success");
                            } else {
                                f.b(g.a, "-->ReportCenter httpRequest Thread request failed");
                            }
                        }
                    } catch (Exception e7) {
                    }
                } while (a >= i2);
                if (obj == 1) {
                    f.b(g.a, "-->ReportCenter httpRequest Thread request success");
                } else {
                    f.b(g.a, "-->ReportCenter httpRequest Thread request failed");
                }
                f.b(g.a, "-->ReportCenter httpRequest Exception");
                if (obj == 1) {
                    f.b(g.a, "-->ReportCenter httpRequest Thread request success");
                } else {
                    f.b(g.a, "-->ReportCenter httpRequest Thread request failed");
                }
            }
        });
    }

    protected boolean a(String str, int i) {
        int i2 = 5;
        int i3;
        if (str.equals("report_cgi")) {
            i3 = OpenConfig.getInstance(Global.getContext(), null).getInt("Common_CGIReportMaxcount");
            if (i3 != 0) {
                i2 = i3;
            }
        } else if (str.equals("report_via")) {
            i3 = OpenConfig.getInstance(Global.getContext(), null).getInt("Agent_ReportBatchCount");
            if (i3 != 0) {
                i2 = i3;
            }
        } else {
            i2 = 0;
        }
        f.b(a, "-->availableCount, report: " + str + " | dataSize: " + i + " | maxcount: " + i2);
        return i >= i2;
    }

    protected boolean a(String str, String str2) {
        boolean z = true;
        boolean z2 = false;
        f.b(a, "-->availableFrequency, report: " + str + " | ext: " + str2);
        if (!TextUtils.isEmpty(str)) {
            int i;
            int a;
            if (str.equals("report_cgi")) {
                try {
                    a = a(Integer.parseInt(str2));
                    if (this.c.nextInt(100) >= a) {
                        z = false;
                    }
                    z2 = z;
                    i = a;
                } catch (Exception e) {
                }
            } else if (str.equals("report_via")) {
                a = e.a(str2);
                if (this.c.nextInt(100) < a) {
                    z2 = true;
                    i = a;
                } else {
                    i = a;
                }
            } else {
                i = 100;
            }
            f.b(a, "-->availableFrequency, result: " + z2 + " | frequency: " + i);
        }
        return z2;
    }

    protected void b() {
        ThreadManager.executeOnNetWorkThread(new Runnable(this) {
            final /* synthetic */ g a;

            {
                this.a = r1;
            }

            public void run() {
                Object obj = null;
                Bundle c = this.a.c();
                if (c != null) {
                    int i = OpenConfig.getInstance(Global.getContext(), null).getInt("Common_HttpRetryCount");
                    int i2 = i == 0 ? 3 : i;
                    f.b(g.a, "-->doReportCgi, retryCount: " + i2);
                    i = 0;
                    do {
                        i++;
                        try {
                            HttpClient httpClient = HttpUtils.getHttpClient(Global.getContext(), null, ServerSetting.DEFAULT_URL_REPORT);
                            HttpUriRequest httpPost = new HttpPost(ServerSetting.DEFAULT_URL_REPORT);
                            httpPost.addHeader("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
                            httpPost.setHeader("Content-Type", org.a.a.c.f.j.a);
                            httpPost.setEntity(new ByteArrayEntity(HttpUtils.encodeUrl(c).getBytes()));
                            int statusCode = httpClient.execute(httpPost).getStatusLine().getStatusCode();
                            f.b(g.a, "-->doReportCgi, statusCode: " + statusCode);
                            if (statusCode == 200) {
                                f.a().b("report_cgi");
                                obj = 1;
                            }
                        } catch (Throwable e) {
                            try {
                                f.a(g.a, "-->doReportCgi, doupload exception", e);
                                continue;
                            } catch (Throwable e2) {
                                f.a(g.a, "-->doReportCgi, doupload exception out.", e2);
                                return;
                            }
                        } catch (Throwable e3) {
                            f.a(g.a, "-->doReportCgi, doupload exception", e3);
                            continue;
                        } catch (Throwable e22) {
                            f.a(g.a, "-->doReportCgi, doupload exception", e22);
                        }
                        if (obj == null) {
                            f.a().a("report_cgi", this.a.d);
                        }
                        this.a.d.clear();
                    } while (i < i2);
                    if (obj == null) {
                        f.a().a("report_cgi", this.a.d);
                    }
                    this.a.d.clear();
                }
            }
        });
    }

    protected Bundle c() {
        if (this.d.size() == 0) {
            return null;
        }
        b bVar = (b) this.d.get(0);
        if (bVar == null) {
            f.b(a, "-->prepareCgiData, the 0th cgireportitem is null.");
            return null;
        }
        String str = (String) bVar.a.get("appid");
        Collection a = f.a().a("report_cgi");
        if (a != null) {
            this.d.addAll(a);
        }
        f.b(a, "-->prepareCgiData, mCgiList size: " + this.d.size());
        if (this.d.size() == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        try {
            bundle.putString("appid", str);
            bundle.putString("releaseversion", Constants.SDK_VERSION_REPORT);
            bundle.putString("device", Build.DEVICE);
            bundle.putString("qua", Constants.SDK_QUA);
            bundle.putString("key", "apn,frequency,commandid,resultcode,tmcost,reqsize,rspsize,detail,touin,deviceinfo");
            for (int i = 0; i < this.d.size(); i++) {
                bVar = (b) this.d.get(i);
                bundle.putString(i + "_1", (String) bVar.a.get("apn"));
                bundle.putString(i + "_2", (String) bVar.a.get("frequency"));
                bundle.putString(i + "_3", (String) bVar.a.get("commandid"));
                bundle.putString(i + "_4", (String) bVar.a.get("resultCode"));
                bundle.putString(i + "_5", (String) bVar.a.get("timeCost"));
                bundle.putString(i + "_6", (String) bVar.a.get("reqSize"));
                bundle.putString(i + "_7", (String) bVar.a.get("rspSize"));
                bundle.putString(i + "_8", (String) bVar.a.get(com.google.android.gms.analytics.a.b.a));
                bundle.putString(i + "_9", (String) bVar.a.get("uin"));
                bundle.putString(i + "_10", c.e(Global.getContext()) + "&" + ((String) bVar.a.get("deviceInfo")));
            }
            f.b(a, "-->prepareCgiData, end. params: " + bundle.toString());
            return bundle;
        } catch (Throwable e) {
            f.b(a, "-->prepareCgiData, exception.", e);
            return null;
        }
    }

    protected Bundle d() {
        Collection a = f.a().a("report_via");
        if (a != null) {
            this.e.addAll(a);
        }
        f.b(a, "-->prepareViaData, mViaList size: " + this.e.size());
        if (this.e.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Serializable serializable : this.e) {
            JSONObject jSONObject = new JSONObject();
            b bVar = (b) serializable;
            for (String str : bVar.a.keySet()) {
                try {
                    Object obj = (String) bVar.a.get(str);
                    if (obj == null) {
                        obj = "";
                    }
                    jSONObject.put(str, obj);
                } catch (Throwable e) {
                    f.a(a, "-->prepareViaData, put bundle to json array exception", e);
                }
            }
            jSONArray.put(jSONObject);
        }
        f.b(a, "-->prepareViaData, JSONArray array: " + jSONArray.toString());
        Bundle bundle = new Bundle();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(UriUtil.DATA_SCHEME, jSONArray);
            bundle.putString(UriUtil.DATA_SCHEME, jSONObject2.toString());
            return bundle;
        } catch (Throwable e2) {
            f.a(a, "-->prepareViaData, put bundle to json array exception", e2);
            return null;
        }
    }

    protected void e() {
        ThreadManager.executeOnNetWorkThread(new Runnable(this) {
            final /* synthetic */ g a;

            {
                this.a = r1;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                r18 = this;
                r0 = r18;
                r2 = r0.a;	 Catch:{ Exception -> 0x00a3 }
                r14 = r2.d();	 Catch:{ Exception -> 0x00a3 }
                if (r14 != 0) goto L_0x000b;
            L_0x000a:
                return;
            L_0x000b:
                r2 = com.tencent.open.b.g.a;	 Catch:{ Exception -> 0x00a3 }
                r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00a3 }
                r3.<init>();	 Catch:{ Exception -> 0x00a3 }
                r4 = "-->doReportVia, params: ";
                r3 = r3.append(r4);	 Catch:{ Exception -> 0x00a3 }
                r4 = r14.toString();	 Catch:{ Exception -> 0x00a3 }
                r3 = r3.append(r4);	 Catch:{ Exception -> 0x00a3 }
                r3 = r3.toString();	 Catch:{ Exception -> 0x00a3 }
                com.tencent.open.a.f.b(r2, r3);	 Catch:{ Exception -> 0x00a3 }
                r11 = com.tencent.open.b.e.a();	 Catch:{ Exception -> 0x00a3 }
                r10 = 0;
                r3 = 0;
                r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Exception -> 0x00a3 }
                r6 = 0;
                r4 = 0;
                r2 = 0;
            L_0x0036:
                r10 = r10 + 1;
                r12 = com.tencent.open.utils.Global.getContext();	 Catch:{ ConnectTimeoutException -> 0x00b0, SocketTimeoutException -> 0x00c0, JSONException -> 0x00cb, NetworkUnavailableException -> 0x00d2, HttpStatusException -> 0x00e5, IOException -> 0x0104, Exception -> 0x010f }
                r13 = "http://appsupport.qq.com/cgi-bin/appstage/mstats_batch_report";
                r15 = "POST";
                r15 = com.tencent.open.utils.HttpUtils.openUrl2(r12, r13, r15, r14);	 Catch:{ ConnectTimeoutException -> 0x00b0, SocketTimeoutException -> 0x00c0, JSONException -> 0x00cb, NetworkUnavailableException -> 0x00d2, HttpStatusException -> 0x00e5, IOException -> 0x0104, Exception -> 0x010f }
                r12 = r15.response;	 Catch:{ ConnectTimeoutException -> 0x00b0, SocketTimeoutException -> 0x00c0, JSONException -> 0x00cb, NetworkUnavailableException -> 0x00d2, HttpStatusException -> 0x00e5, IOException -> 0x0104, Exception -> 0x010f }
                r12 = com.tencent.open.utils.Util.parseJson(r12);	 Catch:{ ConnectTimeoutException -> 0x00b0, SocketTimeoutException -> 0x00c0, JSONException -> 0x00cb, NetworkUnavailableException -> 0x00d2, HttpStatusException -> 0x00e5, IOException -> 0x0104, Exception -> 0x010f }
                r13 = "ret";
                r12 = r12.getInt(r13);	 Catch:{ JSONException -> 0x00ad, ConnectTimeoutException -> 0x00b0, SocketTimeoutException -> 0x00c0, NetworkUnavailableException -> 0x00d2, HttpStatusException -> 0x00e5, IOException -> 0x0104, Exception -> 0x010f }
            L_0x0050:
                if (r12 == 0) goto L_0x005a;
            L_0x0052:
                r12 = r15.response;	 Catch:{ ConnectTimeoutException -> 0x00b0, SocketTimeoutException -> 0x00c0, JSONException -> 0x00cb, NetworkUnavailableException -> 0x00d2, HttpStatusException -> 0x00e5, IOException -> 0x0104, Exception -> 0x010f }
                r12 = android.text.TextUtils.isEmpty(r12);	 Catch:{ ConnectTimeoutException -> 0x00b0, SocketTimeoutException -> 0x00c0, JSONException -> 0x00cb, NetworkUnavailableException -> 0x00d2, HttpStatusException -> 0x00e5, IOException -> 0x0104, Exception -> 0x010f }
                if (r12 != 0) goto L_0x005c;
            L_0x005a:
                r3 = 1;
                r10 = r11;
            L_0x005c:
                r12 = r15.reqSize;	 Catch:{ ConnectTimeoutException -> 0x00b0, SocketTimeoutException -> 0x00c0, JSONException -> 0x00cb, NetworkUnavailableException -> 0x00d2, HttpStatusException -> 0x00e5, IOException -> 0x0104, Exception -> 0x010f }
                r4 = r15.rspSize;	 Catch:{ ConnectTimeoutException -> 0x00b0, SocketTimeoutException -> 0x00c0, JSONException -> 0x00cb, NetworkUnavailableException -> 0x00d2, HttpStatusException -> 0x012b, IOException -> 0x0104, Exception -> 0x010f }
                r6 = r12;
            L_0x0061:
                if (r10 < r11) goto L_0x0036;
            L_0x0063:
                r10 = r2;
                r13 = r3;
                r16 = r8;
                r8 = r4;
                r4 = r16;
            L_0x006a:
                r0 = r18;
                r2 = r0.a;	 Catch:{ Exception -> 0x00a3 }
                r3 = "mapp_apptrace_sdk";
                r11 = 0;
                r12 = 0;
                r2.a(r3, r4, r6, r8, r10, r11, r12);	 Catch:{ Exception -> 0x00a3 }
                if (r13 == 0) goto L_0x0118;
            L_0x0077:
                r2 = com.tencent.open.b.f.a();	 Catch:{ Exception -> 0x00a3 }
                r3 = "report_via";
                r2.b(r3);	 Catch:{ Exception -> 0x00a3 }
            L_0x0080:
                r0 = r18;
                r2 = r0.a;	 Catch:{ Exception -> 0x00a3 }
                r2 = r2.e;	 Catch:{ Exception -> 0x00a3 }
                r2.clear();	 Catch:{ Exception -> 0x00a3 }
                r2 = com.tencent.open.b.g.a;	 Catch:{ Exception -> 0x00a3 }
                r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00a3 }
                r3.<init>();	 Catch:{ Exception -> 0x00a3 }
                r4 = "-->doReportVia, uploadSuccess: ";
                r3 = r3.append(r4);	 Catch:{ Exception -> 0x00a3 }
                r3 = r3.append(r13);	 Catch:{ Exception -> 0x00a3 }
                r3 = r3.toString();	 Catch:{ Exception -> 0x00a3 }
                com.tencent.open.a.f.b(r2, r3);	 Catch:{ Exception -> 0x00a3 }
                goto L_0x000a;
            L_0x00a3:
                r2 = move-exception;
                r3 = com.tencent.open.b.g.a;
                r4 = "-->doReportVia, exception in serial executor.";
                com.tencent.open.a.f.b(r3, r4, r2);
                goto L_0x000a;
            L_0x00ad:
                r12 = move-exception;
                r12 = -4;
                goto L_0x0050;
            L_0x00b0:
                r2 = move-exception;
                r2 = r10;
                r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Exception -> 0x00a3 }
                r12 = 0;
                r6 = 0;
                r4 = -7;
                r10 = r2;
                r2 = r4;
                r4 = r6;
                r6 = r12;
                goto L_0x0061;
            L_0x00c0:
                r2 = move-exception;
                r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Exception -> 0x00a3 }
                r6 = 0;
                r4 = 0;
                r2 = -8;
                goto L_0x0061;
            L_0x00cb:
                r2 = move-exception;
                r6 = 0;
                r4 = 0;
                r2 = -4;
                goto L_0x0061;
            L_0x00d2:
                r2 = move-exception;
                r0 = r18;
                r2 = r0.a;	 Catch:{ Exception -> 0x00a3 }
                r2 = r2.e;	 Catch:{ Exception -> 0x00a3 }
                r2.clear();	 Catch:{ Exception -> 0x00a3 }
                r2 = com.tencent.open.b.g.a;	 Catch:{ Exception -> 0x00a3 }
                r3 = "doReportVia, NetworkUnavailableException.";
                com.tencent.open.a.f.b(r2, r3);	 Catch:{ Exception -> 0x00a3 }
                goto L_0x000a;
            L_0x00e5:
                r10 = move-exception;
                r16 = r10;
                r10 = r3;
                r3 = r16;
            L_0x00eb:
                r3 = r3.getMessage();	 Catch:{ Exception -> 0x0129 }
                r11 = "http status code error:";
                r12 = "";
                r3 = r3.replace(r11, r12);	 Catch:{ Exception -> 0x0129 }
                r2 = java.lang.Integer.parseInt(r3);	 Catch:{ Exception -> 0x0129 }
            L_0x00fb:
                r13 = r10;
                r10 = r2;
                r16 = r8;
                r8 = r4;
                r4 = r16;
                goto L_0x006a;
            L_0x0104:
                r2 = move-exception;
                r6 = 0;
                r4 = 0;
                r2 = com.tencent.open.utils.HttpUtils.getErrorCodeFromException(r2);	 Catch:{ Exception -> 0x00a3 }
                goto L_0x0061;
            L_0x010f:
                r2 = move-exception;
                r6 = 0;
                r4 = 0;
                r2 = -6;
                r10 = r11;
                goto L_0x0061;
            L_0x0118:
                r2 = com.tencent.open.b.f.a();	 Catch:{ Exception -> 0x00a3 }
                r3 = "report_via";
                r0 = r18;
                r4 = r0.a;	 Catch:{ Exception -> 0x00a3 }
                r4 = r4.e;	 Catch:{ Exception -> 0x00a3 }
                r2.a(r3, r4);	 Catch:{ Exception -> 0x00a3 }
                goto L_0x0080;
            L_0x0129:
                r3 = move-exception;
                goto L_0x00fb;
            L_0x012b:
                r6 = move-exception;
                r10 = r3;
                r3 = r6;
                r6 = r12;
                goto L_0x00eb;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.b.g.5.run():void");
            }
        });
    }
}
