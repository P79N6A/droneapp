package com.baidu.tts.e;

import android.content.Context;
import android.database.Cursor;
import com.baidu.android.common.net.ConnectManager;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.h.b.b;
import com.tencent.connect.common.Constants;
import com.tencent.open.GameAppOperation;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.market.sdk.k;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.a.a.c.f.j;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    private static List<Integer> a(JSONObject jSONObject, Cursor cursor, int i, int i2) {
        if (cursor == null) {
            return null;
        }
        List<Integer> arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        int i3 = 0;
        boolean moveToPosition = cursor.moveToPosition(i);
        while (moveToPosition) {
            int i4 = cursor.getInt(cursor.getColumnIndex(k._ID));
            String string = cursor.getString(cursor.getColumnIndex(com.fimi.soul.utils.a.b.a.i));
            int i5 = cursor.getInt(cursor.getColumnIndex(XiaomiOAuthConstants.EXTRA_CODE_2));
            int i6 = cursor.getInt(cursor.getColumnIndex("cmd_type"));
            int i7 = cursor.getInt(cursor.getColumnIndex("cmd_id"));
            String string2 = cursor.getString(cursor.getColumnIndex("result"));
            arrayList.add(Integer.valueOf(i4));
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(com.fimi.soul.utils.a.b.a.i, Long.parseLong(string));
                jSONObject2.put("error_code", i5);
                if (i5 == 0) {
                    jSONObject2.put("cmd_type", i6);
                    jSONObject2.put("cmd_id", i7);
                    jSONObject2.put("voice_to_text_result", string2);
                }
                jSONArray.put(jSONObject2);
            } catch (JSONException e) {
                LoggerProxy.d("StatHelper", "je:" + e);
            } catch (NumberFormatException e2) {
                LoggerProxy.d("StatHelper", "e " + e2);
            }
            i3++;
            if (i3 < i2) {
                moveToPosition = cursor.moveToNext();
            }
        }
        try {
            jSONObject.put("recog_results", jSONArray);
            return arrayList;
        } catch (JSONException e3) {
            LoggerProxy.d("StatHelper", "je:" + e3);
            return arrayList;
        }
    }

    private static UrlEncodedFormEntity a(String str) {
        UrlEncodedFormEntity urlEncodedFormEntity;
        UnsupportedEncodingException e;
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("records", str));
        try {
            urlEncodedFormEntity = new UrlEncodedFormEntity(arrayList, "utf-8");
            try {
                urlEncodedFormEntity.setContentType(j.a);
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                e.printStackTrace();
                return urlEncodedFormEntity;
            }
        } catch (UnsupportedEncodingException e3) {
            UnsupportedEncodingException unsupportedEncodingException = e3;
            urlEncodedFormEntity = null;
            e = unsupportedEncodingException;
            e.printStackTrace();
            return urlEncodedFormEntity;
        }
        return urlEncodedFormEntity;
    }

    public static synchronized void a(Context context, String str) {
        synchronized (a.class) {
            if (ConnectManager.isNetworkConnected(context)) {
                long a = d.a(context);
                int b = d.b(context);
                long j = 86400000;
                if (b > 0) {
                    j = (long) b;
                }
                LoggerProxy.d("StatHelper", "lastTime " + a + ", curTime " + System.currentTimeMillis() + ", lastPeriod " + b);
                long currentTimeMillis = System.currentTimeMillis();
                Date date = new Date(a);
                Date date2 = new Date(currentTimeMillis);
                if (currentTimeMillis - a < j) {
                    LoggerProxy.d("StatHelper", "lastTime " + a + ", curTime " + System.currentTimeMillis());
                    LoggerProxy.d("StatHelper", "lastDate " + date + "\ncurDate " + date2);
                } else if (b(context, str)) {
                    c(context, str);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
        r0 = 0;
        r2 = new com.baidu.android.common.net.ProxyHttpClient;
        r2.<init>(r6);
        r1 = d(r6, r7);
        r3 = "StatHelper";
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "url:";
        r4 = r4.append(r5);
        r4 = r4.append(r1);
        r4 = r4.toString();
        com.baidu.tts.chainofresponsibility.logger.LoggerProxy.d(r3, r4);
        r3 = new org.apache.http.client.methods.HttpPost;
        r3.<init>(r1);
        r1 = "Content-Type";
        r4 = "application/x-www-form-urlencoded";
        r3.addHeader(r1, r4);
        r1 = a(r8);
        r3.setEntity(r1);
        r1 = r2.execute(r3);	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r3 = "StatHelper";
        r4 = new java.lang.StringBuilder;	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r4.<init>();	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r5 = "response.getStatusLine().getStatusCode():";
        r4 = r4.append(r5);	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r5 = r1.getStatusLine();	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r5 = r5.getStatusCode();	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r4 = r4.append(r5);	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r4 = r4.toString();	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        com.baidu.tts.chainofresponsibility.logger.LoggerProxy.d(r3, r4);	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r3 = r1.getStatusLine();	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r3 = r3.getStatusCode();	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r3 != r4) goto L_0x00a1;
    L_0x0065:
        r1 = r1.getEntity();	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r3 = "utf-8";
        r1 = org.apache.http.util.EntityUtils.toString(r1, r3);	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r3 = "StatHelper";
        r4 = new java.lang.StringBuilder;	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r4.<init>();	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r5 = "entity:";
        r4 = r4.append(r5);	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r4 = r4.append(r1);	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r4 = r4.toString();	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        com.baidu.tts.chainofresponsibility.logger.LoggerProxy.d(r3, r4);	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r3 = android.text.TextUtils.isEmpty(r1);	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        if (r3 != 0) goto L_0x00a1;
    L_0x008d:
        r3 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00a5, Exception -> 0x00cb }
        r3.<init>(r1);	 Catch:{ JSONException -> 0x00a5, Exception -> 0x00cb }
        r1 = "errno";
        r1 = r3.optString(r1);	 Catch:{ JSONException -> 0x00a5, Exception -> 0x00cb }
        r3 = "0";
        r1 = r3.equals(r1);	 Catch:{ JSONException -> 0x00a5, Exception -> 0x00cb }
        if (r1 == 0) goto L_0x00a1;
    L_0x00a0:
        r0 = 1;
    L_0x00a1:
        r2.close();
    L_0x00a4:
        return r0;
    L_0x00a5:
        r1 = move-exception;
        r3 = "StatHelper";
        r4 = new java.lang.StringBuilder;	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r4.<init>();	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r5 = "parse:";
        r4 = r4.append(r5);	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r1 = r1.toString();	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r1 = r4.append(r1);	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r1 = r1.toString();	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        com.baidu.tts.chainofresponsibility.logger.LoggerProxy.d(r3, r1);	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        goto L_0x00a1;
    L_0x00c3:
        r1 = move-exception;
        r1.printStackTrace();	 Catch:{ all -> 0x00f1 }
        r2.close();
        goto L_0x00a4;
    L_0x00cb:
        r1 = move-exception;
        r3 = "StatHelper";
        r4 = new java.lang.StringBuilder;	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r4.<init>();	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r5 = "parse:";
        r4 = r4.append(r5);	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r1 = r1.toString();	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r1 = r4.append(r1);	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        r1 = r1.toString();	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        com.baidu.tts.chainofresponsibility.logger.LoggerProxy.d(r3, r1);	 Catch:{ ClientProtocolException -> 0x00c3, IOException -> 0x00e9 }
        goto L_0x00a1;
    L_0x00e9:
        r1 = move-exception;
        r1.printStackTrace();	 Catch:{ all -> 0x00f1 }
        r2.close();
        goto L_0x00a4;
    L_0x00f1:
        r0 = move-exception;
        r2.close();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.tts.e.a.a(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(android.content.Context r12, java.lang.String r13) {
        /*
        r3 = 1;
        r2 = 0;
        r5 = com.baidu.tts.e.c.a(r12);
        monitor-enter(r5);
        r0 = r5.d();	 Catch:{ all -> 0x00bf }
        if (r0 != 0) goto L_0x00bd;
    L_0x000d:
        r6 = r5.b();	 Catch:{ all -> 0x00bf }
        monitor-exit(r5);	 Catch:{ all -> 0x00bf }
        if (r6 == 0) goto L_0x00d9;
    L_0x0014:
        r0 = r6.getCount();	 Catch:{ SQLiteException -> 0x00d5, Exception -> 0x00d7 }
        if (r0 < r3) goto L_0x00cf;
    L_0x001a:
        r0 = "StatHelper";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = "cursor.getCount: ";
        r1 = r1.append(r4);
        r4 = r6.getCount();
        r1 = r1.append(r4);
        r1 = r1.toString();
        com.baidu.tts.chainofresponsibility.logger.LoggerProxy.d(r0, r1);
        r0 = r6.getCount();
        r0 = r0 % 500;
        if (r0 != 0) goto L_0x00c2;
    L_0x003e:
        r0 = r6.getCount();
        r0 = r0 / 500;
    L_0x0044:
        r4 = r2;
        r1 = r2;
    L_0x0046:
        if (r4 >= r0) goto L_0x00d0;
    L_0x0048:
        r7 = new org.json.JSONObject;
        r7.<init>();
        r8 = r4 * 500;
        r9 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r8 = a(r7, r6, r8, r9);
        r9 = "StatHelper";
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r11 = "jsonObj all: ";
        r10 = r10.append(r11);
        r11 = r7.toString();
        r10 = r10.append(r11);
        r10 = r10.toString();
        com.baidu.tts.chainofresponsibility.logger.LoggerProxy.d(r9, r10);
        r7 = r7.toString();
        r7 = com.baidu.tts.e.d.a(r7);
        r9 = r7.length;
        r10 = 2;
        if (r9 < r10) goto L_0x0085;
    L_0x007d:
        r9 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r7[r2] = r9;
        r9 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r7[r3] = r9;
    L_0x0085:
        r7 = com.baidu.tts.e.d.a(r7);
        r9 = "StatHelper";
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r11 = " postContent:";
        r10 = r10.append(r11);
        r10 = r10.append(r7);
        r10 = r10.toString();
        com.baidu.tts.chainofresponsibility.logger.LoggerProxy.d(r9, r10);
        r7 = a(r12, r13, r7);
        if (r7 == 0) goto L_0x00ba;
    L_0x00a7:
        monitor-enter(r5);
        r7 = r5.d();	 Catch:{ all -> 0x00cc }
        if (r7 != 0) goto L_0x00b9;
    L_0x00ae:
        r5.a(r8);	 Catch:{ all -> 0x00cc }
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x00cc }
        com.baidu.tts.e.d.a(r12, r8);	 Catch:{ all -> 0x00cc }
        r1 = r3;
    L_0x00b9:
        monitor-exit(r5);	 Catch:{ all -> 0x00cc }
    L_0x00ba:
        r4 = r4 + 1;
        goto L_0x0046;
    L_0x00bd:
        monitor-exit(r5);	 Catch:{ all -> 0x00bf }
    L_0x00be:
        return r2;
    L_0x00bf:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x00bf }
        throw r0;
    L_0x00c2:
        r0 = r6.getCount();
        r0 = r0 / 500;
        r0 = r0 + 1;
        goto L_0x0044;
    L_0x00cc:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x00cc }
        throw r0;
    L_0x00cf:
        r1 = r2;
    L_0x00d0:
        r6.close();
    L_0x00d3:
        r2 = r1;
        goto L_0x00be;
    L_0x00d5:
        r0 = move-exception;
        goto L_0x00be;
    L_0x00d7:
        r0 = move-exception;
        goto L_0x00be;
    L_0x00d9:
        r1 = r2;
        goto L_0x00d3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.tts.e.a.b(android.content.Context, java.lang.String):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(android.content.Context r7, java.lang.String r8) {
        /*
        r0 = 0;
        r2 = new com.baidu.android.common.net.ProxyHttpClient;
        r2.<init>(r7);
        r1 = e(r7, r8);
        r3 = "StatHelper";
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "url:";
        r4 = r4.append(r5);
        r4 = r4.append(r1);
        r4 = r4.toString();
        com.baidu.tts.chainofresponsibility.logger.LoggerProxy.d(r3, r4);
        r3 = new org.apache.http.client.methods.HttpGet;
        r3.<init>(r1);
        r1 = r2.execute(r3);	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r3 = "StatHelper";
        r4 = new java.lang.StringBuilder;	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r4.<init>();	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r5 = "response.getStatusLine().getStatusCode():";
        r4 = r4.append(r5);	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r5 = r1.getStatusLine();	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r5 = r5.getStatusCode();	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r4 = r4.append(r5);	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r4 = r4.toString();	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        com.baidu.tts.chainofresponsibility.logger.LoggerProxy.d(r3, r4);	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r3 = r1.getStatusLine();	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r3 = r3.getStatusCode();	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r3 != r4) goto L_0x00d0;
    L_0x0057:
        r1 = r1.getEntity();	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r3 = "utf-8";
        r1 = org.apache.http.util.EntityUtils.toString(r1, r3);	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r3 = "StatHelper";
        r4 = new java.lang.StringBuilder;	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r4.<init>();	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r5 = "entity:";
        r4 = r4.append(r5);	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r4 = r4.append(r1);	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r4 = r4.toString();	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        com.baidu.tts.chainofresponsibility.logger.LoggerProxy.d(r3, r4);	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r3 = android.text.TextUtils.isEmpty(r1);	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        if (r3 != 0) goto L_0x00cf;
    L_0x007f:
        r3 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        r3.<init>(r1);	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        r1 = "data";
        r1 = r3.optJSONObject(r1);	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        if (r1 == 0) goto L_0x00cf;
    L_0x008c:
        r3 = "secs";
        r1 = r1.optInt(r3);	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        r3 = "StatHelper";
        r4 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        r4.<init>();	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        r5 = "period:";
        r4 = r4.append(r5);	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        r4 = r4.append(r1);	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        r4 = r4.toString();	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        com.baidu.tts.chainofresponsibility.logger.LoggerProxy.d(r3, r4);	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        r1 = r1 * 1000;
        if (r1 <= 0) goto L_0x00cf;
    L_0x00ae:
        r3 = com.baidu.tts.e.d.b(r7);	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        r4 = "StatHelper";
        r5 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        r5.<init>();	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        r6 = "oldPeriod:";
        r5 = r5.append(r6);	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        r5 = r5.append(r3);	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        r5 = r5.toString();	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        com.baidu.tts.chainofresponsibility.logger.LoggerProxy.d(r4, r5);	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
        if (r1 == r3) goto L_0x00cf;
    L_0x00cc:
        com.baidu.tts.e.d.a(r7, r1);	 Catch:{ JSONException -> 0x00d4, Exception -> 0x00fa }
    L_0x00cf:
        r0 = 1;
    L_0x00d0:
        r2.close();
    L_0x00d3:
        return r0;
    L_0x00d4:
        r1 = move-exception;
        r3 = "StatHelper";
        r4 = new java.lang.StringBuilder;	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r4.<init>();	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r5 = "parse:";
        r4 = r4.append(r5);	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r1 = r1.toString();	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r1 = r4.append(r1);	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r1 = r1.toString();	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        com.baidu.tts.chainofresponsibility.logger.LoggerProxy.d(r3, r1);	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        goto L_0x00cf;
    L_0x00f2:
        r1 = move-exception;
        r1.printStackTrace();	 Catch:{ all -> 0x0120 }
        r2.close();
        goto L_0x00d3;
    L_0x00fa:
        r1 = move-exception;
        r3 = "StatHelper";
        r4 = new java.lang.StringBuilder;	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r4.<init>();	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r5 = "parse:";
        r4 = r4.append(r5);	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r1 = r1.toString();	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r1 = r4.append(r1);	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        r1 = r1.toString();	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        com.baidu.tts.chainofresponsibility.logger.LoggerProxy.d(r3, r1);	 Catch:{ ClientProtocolException -> 0x00f2, IOException -> 0x0118 }
        goto L_0x00cf;
    L_0x0118:
        r1 = move-exception;
        r1.printStackTrace();	 Catch:{ all -> 0x0120 }
        r2.close();
        goto L_0x00d3;
    L_0x0120:
        r0 = move-exception;
        r2.close();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.tts.e.a.c(android.content.Context, java.lang.String):boolean");
    }

    private static String d(Context context, String str) {
        List linkedList = new LinkedList();
        linkedList.add(new BasicNameValuePair("wise_cuid", b.a().i()));
        linkedList.add(new BasicNameValuePair("sdk_version", d.a()));
        linkedList.add(new BasicNameValuePair(GameAppOperation.QQFAV_DATALINE_APPNAME, d.c(context)));
        linkedList.add(new BasicNameValuePair(Constants.PARAM_PLATFORM, d.d(context)));
        linkedList.add(new BasicNameValuePair(com.xiaomi.market.sdk.j.ac, d.b()));
        linkedList.add(new BasicNameValuePair("net_type", d.e(context) + ""));
        linkedList.add(new BasicNameValuePair("appid", str));
        linkedList.add(new BasicNameValuePair("screen", d.f(context)));
        linkedList.add(new BasicNameValuePair("sdk_name", d.c()));
        linkedList.add(new BasicNameValuePair("app_signature", d.g(context)));
        return "http://yuyin.baidu.com/voice?osname=voiceopen&action=usereventflow&" + URLEncodedUtils.format(linkedList, "utf-8");
    }

    private static String e(Context context, String str) {
        List linkedList = new LinkedList();
        linkedList.add(new BasicNameValuePair("appid", str));
        return "http://uil.cbs.baidu.com/voiceLog/getconfig?" + URLEncodedUtils.format(linkedList, "utf-8");
    }
}
