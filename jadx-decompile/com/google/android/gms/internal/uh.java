package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.tencent.mm.sdk.platformtools.LocaleUtil;
import com.tencent.tauth.AuthActivity;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@aaa
public class uh {
    BlockingQueue<un> a;
    ExecutorService b;
    LinkedHashMap<String, String> c = new LinkedHashMap();
    Map<String, uk> d = new HashMap();
    String e;
    final Context f;
    final String g;
    private AtomicBoolean h;
    private File i;

    public uh(Context context, String str, String str2, Map<String, String> map) {
        this.f = context;
        this.g = str;
        this.e = str2;
        this.h = new AtomicBoolean(false);
        this.h.set(((Boolean) uf.P.c()).booleanValue());
        if (this.h.get()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                this.i = new File(externalStorageDirectory, "sdk_csi_data.txt");
            }
        }
        for (Entry entry : map.entrySet()) {
            this.c.put((String) entry.getKey(), (String) entry.getValue());
        }
        this.a = new ArrayBlockingQueue(30);
        this.b = Executors.newSingleThreadExecutor();
        this.b.execute(new 1(this));
        this.d.put(AuthActivity.ACTION_KEY, uk.b);
        this.d.put("ad_format", uk.b);
        this.d.put("e", uk.c);
    }

    private void a() {
        while (true) {
            try {
                un unVar = (un) this.a.take();
                String c = unVar.c();
                if (!TextUtils.isEmpty(c)) {
                    a(a(this.c, unVar.d()), c);
                }
            } catch (Throwable e) {
                b.d("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    private void a(@Nullable File file, String str) {
        FileOutputStream fileOutputStream;
        Throwable e;
        if (file != null) {
            try {
                fileOutputStream = new FileOutputStream(file, true);
                try {
                    fileOutputStream.write(str.getBytes());
                    fileOutputStream.write(10);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            return;
                        } catch (Throwable e2) {
                            b.d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                            return;
                        }
                    }
                    return;
                } catch (IOException e3) {
                    e2 = e3;
                    try {
                        b.d("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e2);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                return;
                            } catch (Throwable e22) {
                                b.d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e22);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        e22 = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable e4) {
                                b.d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                            }
                        }
                        throw e22;
                    }
                }
            } catch (IOException e5) {
                e22 = e5;
                fileOutputStream = null;
                b.d("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e22);
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                    return;
                }
                return;
            } catch (Throwable th2) {
                e22 = th2;
                fileOutputStream = null;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw e22;
            }
        }
        b.d("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
    }

    private void a(Map<String, String> map, String str) {
        String a = a(this.e, map, str);
        if (this.h.get()) {
            a(this.i, a);
        } else {
            u.e().a(this.f, this.g, a);
        }
    }

    public uk a(String str) {
        uk ukVar = (uk) this.d.get(str);
        return ukVar != null ? ukVar : uk.a;
    }

    String a(String str, Map<String, String> map, @NonNull String str2) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        StringBuilder stringBuilder = new StringBuilder(buildUpon.build().toString());
        stringBuilder.append("&").append(LocaleUtil.ITALIAN).append("=").append(str2);
        return stringBuilder.toString();
    }

    Map<String, String> a(Map<String, String> map, @Nullable Map<String, String> map2) {
        Map<String, String> linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, a(str).a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public void a(@Nullable List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.c.put("e", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, list));
        }
    }

    public boolean a(un unVar) {
        return this.a.offer(unVar);
    }
}
