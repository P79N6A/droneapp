package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.k.a;
import com.google.android.gms.ads.internal.request.l;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.wx.b;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public final class aae extends a {
    private static final Object a = new Object();
    private static aae b;
    private final Context c;
    private final aad d;
    private final ty e;
    private final wx f;

    aae(Context context, ty tyVar, aad com_google_android_gms_internal_aad) {
        this.c = context;
        this.d = com_google_android_gms_internal_aad;
        this.e = tyVar;
        this.f = new wx(context.getApplicationContext() != null ? context.getApplicationContext() : context, VersionInfoParcel.a(), tyVar.a(), new 4(this), new b());
    }

    private static Location a(aco<Location> com_google_android_gms_internal_aco_android_location_Location) {
        try {
            return (Location) com_google_android_gms_internal_aco_android_location_Location.get(((Long) uf.bZ.c()).longValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Exception caught while getting location", e);
            return null;
        }
    }

    private static AdResponseParcel a(Context context, wx wxVar, ty tyVar, aad com_google_android_gms_internal_aad, AdRequestInfoParcel adRequestInfoParcel) {
        Bundle bundle;
        Future future;
        Throwable e;
        com.google.android.gms.ads.internal.util.client.b.a("Starting ad request from service using: AFMA_getAd");
        uf.a(context);
        aco a = com_google_android_gms_internal_aad.i.a();
        un unVar = new un(((Boolean) uf.N.c()).booleanValue(), "load_ad", adRequestInfoParcel.d.b);
        if (adRequestInfoParcel.a > 10 && adRequestInfoParcel.B != -1) {
            unVar.a(unVar.a(adRequestInfoParcel.B), "cts");
        }
        ul a2 = unVar.a();
        Bundle bundle2 = (adRequestInfoParcel.a < 4 || adRequestInfoParcel.o == null) ? null : adRequestInfoParcel.o;
        if (!((Boolean) uf.W.c()).booleanValue() || com_google_android_gms_internal_aad.a == null) {
            bundle = bundle2;
            future = null;
        } else {
            if (bundle2 == null && ((Boolean) uf.X.c()).booleanValue()) {
                abr.e("contentInfo is not present, but we'll still launch the app index task");
                bundle2 = new Bundle();
            }
            if (bundle2 != null) {
                bundle = bundle2;
                future = abu.a(new 1(com_google_android_gms_internal_aad, context, adRequestInfoParcel, bundle2));
            } else {
                bundle = bundle2;
                future = null;
            }
        }
        acm com_google_android_gms_internal_acm = new acm(null);
        Bundle bundle3 = adRequestInfoParcel.c.c;
        Object obj = (bundle3 == null || bundle3.getString("_ad") == null) ? null : 1;
        if (adRequestInfoParcel.I && obj == null) {
            aco a3 = com_google_android_gms_internal_aad.f.a(adRequestInfoParcel.f);
        } else {
            Object obj2 = com_google_android_gms_internal_acm;
        }
        aak a4 = u.n().a(context);
        if (a4.m == -1) {
            com.google.android.gms.ads.internal.util.client.b.a("Device is offline.");
            return new AdResponseParcel(2);
        }
        String uuid = adRequestInfoParcel.a >= 7 ? adRequestInfoParcel.w : UUID.randomUUID().toString();
        aag com_google_android_gms_internal_aag = new aag(uuid, adRequestInfoParcel.f.packageName);
        if (adRequestInfoParcel.c.c != null) {
            String string = adRequestInfoParcel.c.c.getString("_ad");
            if (string != null) {
                return aaf.a(context, adRequestInfoParcel, string);
            }
        }
        List a5 = com_google_android_gms_internal_aad.d.a(adRequestInfoParcel);
        String a6 = com_google_android_gms_internal_aad.j.a(adRequestInfoParcel);
        aao.a a7 = com_google_android_gms_internal_aad.h.a(context);
        if (future != null) {
            try {
                abr.e("Waiting for app index fetching task.");
                future.get(((Long) uf.Y.c()).longValue(), TimeUnit.MILLISECONDS);
                abr.e("App index fetching task completed.");
            } catch (ExecutionException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.client.b.d("Failed to fetch app index signal", e);
            } catch (InterruptedException e3) {
                e = e3;
                com.google.android.gms.ads.internal.util.client.b.d("Failed to fetch app index signal", e);
            } catch (TimeoutException e4) {
                com.google.android.gms.ads.internal.util.client.b.a("Timed out waiting for app index fetching task");
            }
        }
        String a8 = com_google_android_gms_internal_aad.c.a(adRequestInfoParcel.g.packageName);
        b(a);
        JSONObject a9 = aaf.a(context, new aab().a(adRequestInfoParcel).a(a4).a(a7).a(a(a3)).a(b(a)).a(a6).a(a5).b(bundle).b(a8).a(com_google_android_gms_internal_aad.b.a(context)));
        if (a9 == null) {
            return new AdResponseParcel(0);
        }
        if (adRequestInfoParcel.a < 7) {
            try {
                a9.put("request_id", uuid);
            } catch (JSONException e5) {
            }
        }
        try {
            a9.put("prefetch_mode", "url");
        } catch (Throwable e6) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed putting prefetch parameters to ad request.", e6);
        }
        String jSONObject = a9.toString();
        unVar.a(a2, "arc");
        abv.a.post(new 2(wxVar, com_google_android_gms_internal_aag, unVar, unVar.a(), jSONObject));
        AdResponseParcel adResponseParcel;
        try {
            aaj com_google_android_gms_internal_aaj = (aaj) com_google_android_gms_internal_aag.b().get(10, TimeUnit.SECONDS);
            if (com_google_android_gms_internal_aaj == null) {
                adResponseParcel = new AdResponseParcel(0);
                return adResponseParcel;
            } else if (com_google_android_gms_internal_aaj.a() != -2) {
                adResponseParcel = new AdResponseParcel(com_google_android_gms_internal_aaj.a());
                abv.a.post(new 3(com_google_android_gms_internal_aad, context, com_google_android_gms_internal_aag, adRequestInfoParcel));
                return adResponseParcel;
            } else {
                if (unVar.e() != null) {
                    unVar.a(unVar.e(), "rur");
                }
                adResponseParcel = null;
                if (!TextUtils.isEmpty(com_google_android_gms_internal_aaj.h())) {
                    adResponseParcel = aaf.a(context, adRequestInfoParcel, com_google_android_gms_internal_aaj.h());
                }
                if (adResponseParcel == null && !TextUtils.isEmpty(com_google_android_gms_internal_aaj.d())) {
                    adResponseParcel = a(adRequestInfoParcel, context, adRequestInfoParcel.k.b, com_google_android_gms_internal_aaj.d(), a8, com_google_android_gms_internal_aaj, unVar, com_google_android_gms_internal_aad);
                }
                if (adResponseParcel == null) {
                    adResponseParcel = new AdResponseParcel(0);
                }
                unVar.a(a2, "tts");
                adResponseParcel.y = unVar.c();
                abv.a.post(new 3(com_google_android_gms_internal_aad, context, com_google_android_gms_internal_aag, adRequestInfoParcel));
                return adResponseParcel;
            }
        } catch (Exception e7) {
            adResponseParcel = new AdResponseParcel(0);
            return adResponseParcel;
        } finally {
            abv.a.post(new 3(com_google_android_gms_internal_aad, context, com_google_android_gms_internal_aag, adRequestInfoParcel));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.ads.internal.request.AdResponseParcel a(com.google.android.gms.ads.internal.request.AdRequestInfoParcel r13, android.content.Context r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, com.google.android.gms.internal.aaj r18, com.google.android.gms.internal.un r19, com.google.android.gms.internal.aad r20) {
        /*
        if (r19 == 0) goto L_0x00e9;
    L_0x0002:
        r2 = r19.a();
        r3 = r2;
    L_0x0007:
        r8 = new com.google.android.gms.internal.aah;	 Catch:{ IOException -> 0x00f4 }
        r8.<init>(r13);	 Catch:{ IOException -> 0x00f4 }
        r4 = "AdRequestServiceImpl: Sending request: ";
        r2 = java.lang.String.valueOf(r16);	 Catch:{ IOException -> 0x00f4 }
        r5 = r2.length();	 Catch:{ IOException -> 0x00f4 }
        if (r5 == 0) goto L_0x00ed;
    L_0x0018:
        r2 = r4.concat(r2);	 Catch:{ IOException -> 0x00f4 }
    L_0x001c:
        com.google.android.gms.ads.internal.util.client.b.a(r2);	 Catch:{ IOException -> 0x00f4 }
        r4 = new java.net.URL;	 Catch:{ IOException -> 0x00f4 }
        r0 = r16;
        r4.<init>(r0);	 Catch:{ IOException -> 0x00f4 }
        r2 = 0;
        r5 = com.google.android.gms.ads.internal.u.k();	 Catch:{ IOException -> 0x00f4 }
        r10 = r5.b();	 Catch:{ IOException -> 0x00f4 }
        r6 = r2;
        r7 = r4;
    L_0x0031:
        if (r20 == 0) goto L_0x003a;
    L_0x0033:
        r0 = r20;
        r2 = r0.g;	 Catch:{ IOException -> 0x00f4 }
        r2.a();	 Catch:{ IOException -> 0x00f4 }
    L_0x003a:
        r2 = r7.openConnection();	 Catch:{ IOException -> 0x00f4 }
        r2 = (java.net.HttpURLConnection) r2;	 Catch:{ IOException -> 0x00f4 }
        r4 = com.google.android.gms.ads.internal.u.e();	 Catch:{ all -> 0x0119 }
        r5 = 0;
        r4.a(r14, r15, r5, r2);	 Catch:{ all -> 0x0119 }
        r4 = android.text.TextUtils.isEmpty(r17);	 Catch:{ all -> 0x0119 }
        if (r4 != 0) goto L_0x005b;
    L_0x004e:
        r4 = r18.f();	 Catch:{ all -> 0x0119 }
        if (r4 == 0) goto L_0x005b;
    L_0x0054:
        r4 = "x-afma-drt-cookie";
        r0 = r17;
        r2.addRequestProperty(r4, r0);	 Catch:{ all -> 0x0119 }
    L_0x005b:
        r4 = r13.J;	 Catch:{ all -> 0x0119 }
        r5 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0119 }
        if (r5 != 0) goto L_0x006d;
    L_0x0063:
        r5 = "Sending webview cookie in ad request header.";
        com.google.android.gms.ads.internal.util.client.b.a(r5);	 Catch:{ all -> 0x0119 }
        r5 = "Cookie";
        r2.addRequestProperty(r5, r4);	 Catch:{ all -> 0x0119 }
    L_0x006d:
        if (r18 == 0) goto L_0x0099;
    L_0x006f:
        r4 = r18.c();	 Catch:{ all -> 0x0119 }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0119 }
        if (r4 != 0) goto L_0x0099;
    L_0x0079:
        r4 = 1;
        r2.setDoOutput(r4);	 Catch:{ all -> 0x0119 }
        r4 = r18.c();	 Catch:{ all -> 0x0119 }
        r9 = r4.getBytes();	 Catch:{ all -> 0x0119 }
        r4 = r9.length;	 Catch:{ all -> 0x0119 }
        r2.setFixedLengthStreamingMode(r4);	 Catch:{ all -> 0x0119 }
        r5 = 0;
        r4 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x0113 }
        r12 = r2.getOutputStream();	 Catch:{ all -> 0x0113 }
        r4.<init>(r12);	 Catch:{ all -> 0x0113 }
        r4.write(r9);	 Catch:{ all -> 0x01d0 }
        com.google.android.gms.common.util.o.a(r4);	 Catch:{ all -> 0x0119 }
    L_0x0099:
        r9 = r2.getResponseCode();	 Catch:{ all -> 0x0119 }
        r12 = r2.getHeaderFields();	 Catch:{ all -> 0x0119 }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r9 < r4) goto L_0x012d;
    L_0x00a5:
        r4 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r9 >= r4) goto L_0x012d;
    L_0x00a9:
        r6 = r7.toString();	 Catch:{ all -> 0x0119 }
        r5 = 0;
        r4 = new java.io.InputStreamReader;	 Catch:{ all -> 0x0127 }
        r7 = r2.getInputStream();	 Catch:{ all -> 0x0127 }
        r4.<init>(r7);	 Catch:{ all -> 0x0127 }
        r5 = com.google.android.gms.ads.internal.u.e();	 Catch:{ all -> 0x01cd }
        r5 = r5.a(r4);	 Catch:{ all -> 0x01cd }
        com.google.android.gms.common.util.o.a(r4);	 Catch:{ all -> 0x0119 }
        a(r6, r12, r5, r9);	 Catch:{ all -> 0x0119 }
        r8.a(r6, r12, r5);	 Catch:{ all -> 0x0119 }
        if (r19 == 0) goto L_0x00d7;
    L_0x00ca:
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x0119 }
        r5 = 0;
        r6 = "ufe";
        r4[r5] = r6;	 Catch:{ all -> 0x0119 }
        r0 = r19;
        r0.a(r3, r4);	 Catch:{ all -> 0x0119 }
    L_0x00d7:
        r3 = r8.a(r10);	 Catch:{ all -> 0x0119 }
        r2.disconnect();	 Catch:{ IOException -> 0x00f4 }
        if (r20 == 0) goto L_0x00e7;
    L_0x00e0:
        r0 = r20;
        r2 = r0.g;	 Catch:{ IOException -> 0x00f4 }
        r2.b();	 Catch:{ IOException -> 0x00f4 }
    L_0x00e7:
        r2 = r3;
    L_0x00e8:
        return r2;
    L_0x00e9:
        r2 = 0;
        r3 = r2;
        goto L_0x0007;
    L_0x00ed:
        r2 = new java.lang.String;	 Catch:{ IOException -> 0x00f4 }
        r2.<init>(r4);	 Catch:{ IOException -> 0x00f4 }
        goto L_0x001c;
    L_0x00f4:
        r2 = move-exception;
        r3 = "Error while connecting to ad server: ";
        r2 = r2.getMessage();
        r2 = java.lang.String.valueOf(r2);
        r4 = r2.length();
        if (r4 == 0) goto L_0x01c6;
    L_0x0105:
        r2 = r3.concat(r2);
    L_0x0109:
        com.google.android.gms.ads.internal.util.client.b.d(r2);
        r2 = new com.google.android.gms.ads.internal.request.AdResponseParcel;
        r3 = 2;
        r2.<init>(r3);
        goto L_0x00e8;
    L_0x0113:
        r3 = move-exception;
        r4 = r5;
    L_0x0115:
        com.google.android.gms.common.util.o.a(r4);	 Catch:{ all -> 0x0119 }
        throw r3;	 Catch:{ all -> 0x0119 }
    L_0x0119:
        r3 = move-exception;
        r2.disconnect();	 Catch:{ IOException -> 0x00f4 }
        if (r20 == 0) goto L_0x0126;
    L_0x011f:
        r0 = r20;
        r2 = r0.g;	 Catch:{ IOException -> 0x00f4 }
        r2.b();	 Catch:{ IOException -> 0x00f4 }
    L_0x0126:
        throw r3;	 Catch:{ IOException -> 0x00f4 }
    L_0x0127:
        r3 = move-exception;
        r4 = r5;
    L_0x0129:
        com.google.android.gms.common.util.o.a(r4);	 Catch:{ all -> 0x0119 }
        throw r3;	 Catch:{ all -> 0x0119 }
    L_0x012d:
        r4 = r7.toString();	 Catch:{ all -> 0x0119 }
        r5 = 0;
        a(r4, r12, r5, r9);	 Catch:{ all -> 0x0119 }
        r4 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r9 < r4) goto L_0x0186;
    L_0x0139:
        r4 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r9 >= r4) goto L_0x0186;
    L_0x013d:
        r4 = "Location";
        r4 = r2.getHeaderField(r4);	 Catch:{ all -> 0x0119 }
        r5 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0119 }
        if (r5 == 0) goto L_0x0162;
    L_0x0149:
        r3 = "No location header to follow redirect.";
        com.google.android.gms.ads.internal.util.client.b.d(r3);	 Catch:{ all -> 0x0119 }
        r3 = new com.google.android.gms.ads.internal.request.AdResponseParcel;	 Catch:{ all -> 0x0119 }
        r4 = 0;
        r3.<init>(r4);	 Catch:{ all -> 0x0119 }
        r2.disconnect();	 Catch:{ IOException -> 0x00f4 }
        if (r20 == 0) goto L_0x0160;
    L_0x0159:
        r0 = r20;
        r2 = r0.g;	 Catch:{ IOException -> 0x00f4 }
        r2.b();	 Catch:{ IOException -> 0x00f4 }
    L_0x0160:
        r2 = r3;
        goto L_0x00e8;
    L_0x0162:
        r5 = new java.net.URL;	 Catch:{ all -> 0x0119 }
        r5.<init>(r4);	 Catch:{ all -> 0x0119 }
        r4 = r6 + 1;
        r6 = 5;
        if (r4 <= r6) goto L_0x01b3;
    L_0x016c:
        r3 = "Too many redirects.";
        com.google.android.gms.ads.internal.util.client.b.d(r3);	 Catch:{ all -> 0x0119 }
        r3 = new com.google.android.gms.ads.internal.request.AdResponseParcel;	 Catch:{ all -> 0x0119 }
        r4 = 0;
        r3.<init>(r4);	 Catch:{ all -> 0x0119 }
        r2.disconnect();	 Catch:{ IOException -> 0x00f4 }
        if (r20 == 0) goto L_0x0183;
    L_0x017c:
        r0 = r20;
        r2 = r0.g;	 Catch:{ IOException -> 0x00f4 }
        r2.b();	 Catch:{ IOException -> 0x00f4 }
    L_0x0183:
        r2 = r3;
        goto L_0x00e8;
    L_0x0186:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0119 }
        r4 = 46;
        r3.<init>(r4);	 Catch:{ all -> 0x0119 }
        r4 = "Received error HTTP response code: ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x0119 }
        r3 = r3.append(r9);	 Catch:{ all -> 0x0119 }
        r3 = r3.toString();	 Catch:{ all -> 0x0119 }
        com.google.android.gms.ads.internal.util.client.b.d(r3);	 Catch:{ all -> 0x0119 }
        r3 = new com.google.android.gms.ads.internal.request.AdResponseParcel;	 Catch:{ all -> 0x0119 }
        r4 = 0;
        r3.<init>(r4);	 Catch:{ all -> 0x0119 }
        r2.disconnect();	 Catch:{ IOException -> 0x00f4 }
        if (r20 == 0) goto L_0x01b0;
    L_0x01a9:
        r0 = r20;
        r2 = r0.g;	 Catch:{ IOException -> 0x00f4 }
        r2.b();	 Catch:{ IOException -> 0x00f4 }
    L_0x01b0:
        r2 = r3;
        goto L_0x00e8;
    L_0x01b3:
        r8.a(r12);	 Catch:{ all -> 0x0119 }
        r2.disconnect();	 Catch:{ IOException -> 0x00f4 }
        if (r20 == 0) goto L_0x01c2;
    L_0x01bb:
        r0 = r20;
        r2 = r0.g;	 Catch:{ IOException -> 0x00f4 }
        r2.b();	 Catch:{ IOException -> 0x00f4 }
    L_0x01c2:
        r6 = r4;
        r7 = r5;
        goto L_0x0031;
    L_0x01c6:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x0109;
    L_0x01cd:
        r3 = move-exception;
        goto L_0x0129;
    L_0x01d0:
        r3 = move-exception;
        goto L_0x0115;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aae.a(com.google.android.gms.ads.internal.request.AdRequestInfoParcel, android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.aaj, com.google.android.gms.internal.un, com.google.android.gms.internal.aad):com.google.android.gms.ads.internal.request.AdResponseParcel");
    }

    public static aae a(Context context, ty tyVar, aad com_google_android_gms_internal_aad) {
        aae com_google_android_gms_internal_aae;
        synchronized (a) {
            if (b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                b = new aae(context, tyVar, com_google_android_gms_internal_aad);
            }
            com_google_android_gms_internal_aae = b;
        }
        return com_google_android_gms_internal_aae;
    }

    private static void a(String str, Map<String, List<String>> map, String str2, int i) {
        if (com.google.android.gms.ads.internal.util.client.b.a(2)) {
            abr.e(new StringBuilder(String.valueOf(str).length() + 39).append("Http Response: {\n  URL:\n    ").append(str).append("\n  Headers:").toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    String str32;
                    abr.e(new StringBuilder(String.valueOf(str32).length() + 5).append("    ").append(str32).append(":").toString());
                    for (String str322 : (List) map.get(str322)) {
                        String str4 = "      ";
                        str322 = String.valueOf(str322);
                        abr.e(str322.length() != 0 ? str4.concat(str322) : new String(str4));
                    }
                }
            }
            abr.e("  Body:");
            if (str2 != null) {
                for (int i2 = 0; i2 < Math.min(str2.length(), 100000); i2 += 1000) {
                    abr.e(str2.substring(i2, Math.min(str2.length(), i2 + 1000)));
                }
            } else {
                abr.e("    null");
            }
            abr.e("  Response Code:\n    " + i + "\n}");
        }
    }

    private static Bundle b(aco<Bundle> com_google_android_gms_internal_aco_android_os_Bundle) {
        Bundle bundle = new Bundle();
        try {
            return (Bundle) com_google_android_gms_internal_aco_android_os_Bundle.get(((Long) uf.cq.c()).longValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Exception caught while getting parental controls.", e);
            return bundle;
        }
    }

    public AdResponseParcel a(AdRequestInfoParcel adRequestInfoParcel) {
        return a(this.c, this.f, this.e, this.d, adRequestInfoParcel);
    }

    public void a(AdRequestInfoParcel adRequestInfoParcel, l lVar) {
        u.i().a(this.c, adRequestInfoParcel.k);
        abu.a(new 5(this, adRequestInfoParcel, lVar));
    }
}
