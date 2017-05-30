package com.fimi.kernel.b.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.fimi.kernel.utils.g;
import com.fimi.soul.media.player.FimiMediaMeta;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b {
    private static ExecutorService b = Executors.newCachedThreadPool();
    private static final int c = 1;
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 3;
    float a;
    private e g;
    private d h;
    private d i;
    private long j;
    private long k;
    private long l;
    private long m;
    private String n;
    private String o;
    private String p;
    private List<d> q;
    private List<c> r;
    private Context s;
    private f t;
    private a u;
    private Object v;
    private Bitmap w;
    private String x;
    private long y;

    public enum a {
        Error,
        Pause,
        Wait,
        Downloading,
        Completed
    }

    private class b extends Thread {
        Boolean a;
        Boolean b;
        final /* synthetic */ b c;

        public b(b bVar) {
            this.c = bVar;
            this.a = Boolean.valueOf(false);
            this.b = Boolean.valueOf(true);
            this.a = Boolean.valueOf(true);
        }

        public b(b bVar, long j) {
            this.c = bVar;
            this.a = Boolean.valueOf(false);
            this.b = Boolean.valueOf(true);
            bVar.j = j;
            this.a = Boolean.valueOf(false);
        }

        public void run() {
            int i = 0;
            Message message = new Message();
            message.what = 1;
            if (this.a.booleanValue()) {
                this.b = Boolean.valueOf(this.c.q());
            } else {
                this.b = Boolean.valueOf(this.c.r());
            }
            if (this.b.booleanValue()) {
                long d = this.c.j / ((long) 1);
                this.c.q = new ArrayList();
                while (i < 1) {
                    this.c.q.add(new d(i, ((long) i) * d, ((long) (i + 1)) * d, 0, this.c.o));
                    i++;
                }
                f a = f.a(this.c.s);
                a.a(this.c.q);
                a.a(this.c);
                this.c.k = 0;
                message.arg1 = 1;
            } else {
                message.arg1 = 0;
            }
            if (this.c.t != null) {
                this.c.t.sendMessage(message);
            }
        }
    }

    private class c implements Runnable {
        final /* synthetic */ b a;
        private boolean b = false;
        private d c;

        public c(b bVar, d dVar) {
            this.a = bVar;
            this.c = dVar;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            r19 = this;
            r3 = 0;
            r4 = 0;
            r0 = r19;
            r2 = r0.c;
            r6 = r2.e();
            r0 = r19;
            r2 = r0.c;	 Catch:{ Exception -> 0x02ab, all -> 0x02a2 }
            r8 = r2.c();	 Catch:{ Exception -> 0x02ab, all -> 0x02a2 }
            r0 = r19;
            r2 = r0.c;	 Catch:{ Exception -> 0x02ab, all -> 0x02a2 }
            r10 = r2.d();	 Catch:{ Exception -> 0x02ab, all -> 0x02a2 }
            r2 = new java.net.URL;	 Catch:{ Exception -> 0x02ab, all -> 0x02a2 }
            r0 = r19;
            r5 = r0.c;	 Catch:{ Exception -> 0x02ab, all -> 0x02a2 }
            r5 = r5.a();	 Catch:{ Exception -> 0x02ab, all -> 0x02a2 }
            r2.<init>(r5);	 Catch:{ Exception -> 0x02ab, all -> 0x02a2 }
            r2 = r2.openConnection();	 Catch:{ Exception -> 0x02ab, all -> 0x02a2 }
            r2 = (java.net.HttpURLConnection) r2;	 Catch:{ Exception -> 0x02ab, all -> 0x02a2 }
            r3 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
            r2.setConnectTimeout(r3);	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r3 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
            r2.setReadTimeout(r3);	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r3 = "GET";
            r2.setRequestMethod(r3);	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r3 = "Range";
            r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r5.<init>();	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r12 = "bytes=";
            r5 = r5.append(r12);	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r12 = r8 + r6;
            r5 = r5.append(r12);	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r12 = "-";
            r5 = r5.append(r12);	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r5 = r5.append(r10);	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r5 = r5.toString();	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r2.setRequestProperty(r3, r5);	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r10 = new java.io.RandomAccessFile;	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r0 = r19;
            r3 = r0.a;	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r3 = r3.h();	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r5 = "rwd";
            r10.<init>(r3, r5);	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r8 = r8 + r6;
            r10.seek(r8);	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r4 = r2.getInputStream();	 Catch:{ Exception -> 0x02b3, all -> 0x028a }
            r3 = 5120; // 0x1400 float:7.175E-42 double:2.5296E-320;
            r8 = new byte[r3];	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
        L_0x007b:
            r9 = r4.read(r8);	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3 = -1;
            if (r9 == r3) goto L_0x0088;
        L_0x0082:
            r0 = r19;
            r3 = r0.b;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            if (r3 == 0) goto L_0x008f;
        L_0x0088:
            r2.disconnect();	 Catch:{ Exception -> 0x0297 }
            r4.close();	 Catch:{ Exception -> 0x0297 }
        L_0x008e:
            return;
        L_0x008f:
            r3 = 0;
            r10.write(r8, r3, r9);	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r12 = (long) r9;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r6 = r6 + r12;
            r0 = r19;
            r3 = r0.c;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3.c(r6);	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3 = 0;
            r0 = r19;
            r5 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r11 = r5.q;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            monitor-enter(r11);	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r5 = r0.a;	 Catch:{ all -> 0x01fb }
            r5 = r5.q;	 Catch:{ all -> 0x01fb }
            r12 = r5.iterator();	 Catch:{ all -> 0x01fb }
            r5 = r3;
        L_0x00b3:
            r3 = r12.hasNext();	 Catch:{ all -> 0x01fb }
            if (r3 == 0) goto L_0x00c9;
        L_0x00b9:
            r3 = r12.next();	 Catch:{ all -> 0x01fb }
            r3 = (com.fimi.kernel.b.b.d) r3;	 Catch:{ all -> 0x01fb }
            r14 = (long) r5;	 Catch:{ all -> 0x01fb }
            r16 = r3.e();	 Catch:{ all -> 0x01fb }
            r14 = r14 + r16;
            r3 = (int) r14;	 Catch:{ all -> 0x01fb }
            r5 = r3;
            goto L_0x00b3;
        L_0x00c9:
            monitor-exit(r11);	 Catch:{ all -> 0x01fb }
            r0 = r19;
            r3 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r12 = (long) r5;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3.k = r12;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r3 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r12 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r5 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r14 = r5.y;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r12 = r12 - r14;
            r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r12 = r12 / r14;
            r5 = (float) r12;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3.a = r5;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r3 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3 = r3.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
            if (r3 < 0) goto L_0x013a;
        L_0x00f5:
            r0 = r19;
            r3 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r12 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3.y = r12;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r3 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r5 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r12 = r5.k;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r5 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r14 = r5.l;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r12 = r12 - r14;
            r5 = (float) r12;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r11 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r11 = r11.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r5 = r5 / r11;
            r12 = (long) r5;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3.m = r12;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r3 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r5 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r12 = r5.k;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3.l = r12;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3 = new com.fimi.kernel.b.b.b$c$1;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r3.<init>(r0);	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            com.fimi.kernel.utils.x.a(r3);	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
        L_0x013a:
            r5 = android.os.Message.obtain();	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3 = 2;
            r5.what = r3;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r5.arg1 = r9;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r3 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r12 = r3.k;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r3 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r14 = r3.j;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
            if (r3 < 0) goto L_0x01d8;
        L_0x0157:
            r0 = r19;
            r3 = r0.a;	 Catch:{ IOException -> 0x0284 }
            r3 = r3.w;	 Catch:{ IOException -> 0x0284 }
            if (r3 != 0) goto L_0x019e;
        L_0x0161:
            r0 = r19;
            r3 = r0.a;	 Catch:{ IOException -> 0x0284 }
            r3 = r3.n;	 Catch:{ IOException -> 0x0284 }
            r3 = com.fimi.kernel.utils.g.g(r3);	 Catch:{ IOException -> 0x0284 }
            if (r3 == 0) goto L_0x0265;
        L_0x016f:
            r0 = r19;
            r3 = r0.a;	 Catch:{ IOException -> 0x0284 }
            r0 = r19;
            r9 = r0.a;	 Catch:{ IOException -> 0x0284 }
            r9 = r9.n;	 Catch:{ IOException -> 0x0284 }
            r11 = 1;
            r9 = android.media.ThumbnailUtils.createVideoThumbnail(r9, r11);	 Catch:{ IOException -> 0x0284 }
            r3.w = r9;	 Catch:{ IOException -> 0x0284 }
            r0 = r19;
            r3 = r0.a;	 Catch:{ IOException -> 0x0284 }
            r0 = r19;
            r9 = r0.a;	 Catch:{ IOException -> 0x0284 }
            r9 = r9.s;	 Catch:{ IOException -> 0x0284 }
            r0 = r19;
            r11 = r0.a;	 Catch:{ IOException -> 0x0284 }
            r11 = r11.n;	 Catch:{ IOException -> 0x0284 }
            r9 = com.fimi.kernel.utils.s.a(r9, r11);	 Catch:{ IOException -> 0x0284 }
            r3.x = r9;	 Catch:{ IOException -> 0x0284 }
        L_0x019e:
            r0 = r19;
            r3 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3 = r3.s;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3 = com.fimi.kernel.b.b.f.a(r3);	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r9 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r9 = r9.o;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3.d(r9);	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3 = new java.io.File;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r9 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r9 = r9.h();	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3.<init>(r9);	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3 = android.net.Uri.fromFile(r3);	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r9 = new android.content.Intent;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r11 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE";
            r9.<init>(r11, r3);	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r0 = r19;
            r3 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3 = r3.s;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3.sendBroadcast(r9);	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
        L_0x01d8:
            r0 = r19;
            r3 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3 = r3.t;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            if (r3 == 0) goto L_0x01ed;
        L_0x01e2:
            r0 = r19;
            r3 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3 = r3.t;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3.sendMessage(r5);	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
        L_0x01ed:
            r0 = r19;
            r3 = r0.a;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r3 = r3.u;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            r5 = com.fimi.kernel.b.b.b.a.Pause;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            if (r3 != r5) goto L_0x007b;
        L_0x01f9:
            goto L_0x0088;
        L_0x01fb:
            r3 = move-exception;
            monitor-exit(r11);	 Catch:{ all -> 0x01fb }
            throw r3;	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
        L_0x01fe:
            r3 = move-exception;
            r18 = r3;
            r3 = r4;
            r4 = r2;
            r2 = r18;
        L_0x0205:
            r2.printStackTrace();	 Catch:{ all -> 0x02a4 }
            r5 = "Good";
            r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02a4 }
            r6.<init>();	 Catch:{ all -> 0x02a4 }
            r7 = "DOWNLOADING ERROR ";
            r6 = r6.append(r7);	 Catch:{ all -> 0x02a4 }
            r2 = r6.append(r2);	 Catch:{ all -> 0x02a4 }
            r6 = ",id";
            r2 = r2.append(r6);	 Catch:{ all -> 0x02a4 }
            r0 = r19;
            r6 = r0.c;	 Catch:{ all -> 0x02a4 }
            r6 = r6.b();	 Catch:{ all -> 0x02a4 }
            r2 = r2.append(r6);	 Catch:{ all -> 0x02a4 }
            r2 = r2.toString();	 Catch:{ all -> 0x02a4 }
            android.util.Log.d(r5, r2);	 Catch:{ all -> 0x02a4 }
            r2 = android.os.Message.obtain();	 Catch:{ all -> 0x02a4 }
            r0 = r19;
            r5 = r0.a;	 Catch:{ all -> 0x02a4 }
            r6 = com.fimi.kernel.b.b.b.a.Error;	 Catch:{ all -> 0x02a4 }
            r5.u = r6;	 Catch:{ all -> 0x02a4 }
            r5 = 3;
            r2.what = r5;	 Catch:{ all -> 0x02a4 }
            r0 = r19;
            r5 = r0.a;	 Catch:{ all -> 0x02a4 }
            r5 = r5.t;	 Catch:{ all -> 0x02a4 }
            if (r5 == 0) goto L_0x0257;
        L_0x024c:
            r0 = r19;
            r5 = r0.a;	 Catch:{ all -> 0x02a4 }
            r5 = r5.t;	 Catch:{ all -> 0x02a4 }
            r5.sendMessage(r2);	 Catch:{ all -> 0x02a4 }
        L_0x0257:
            r4.disconnect();	 Catch:{ Exception -> 0x025f }
            r3.close();	 Catch:{ Exception -> 0x025f }
            goto L_0x008e;
        L_0x025f:
            r2 = move-exception;
            r2.printStackTrace();
            goto L_0x008e;
        L_0x0265:
            r0 = r19;
            r3 = r0.a;	 Catch:{ IOException -> 0x0284 }
            r0 = r19;
            r9 = r0.a;	 Catch:{ IOException -> 0x0284 }
            r9 = r9.s;	 Catch:{ IOException -> 0x0284 }
            r0 = r19;
            r11 = r0.a;	 Catch:{ IOException -> 0x0284 }
            r11 = r11.n;	 Catch:{ IOException -> 0x0284 }
            r12 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
            r9 = com.fimi.kernel.utils.s.a(r9, r11, r12);	 Catch:{ IOException -> 0x0284 }
            r3.w = r9;	 Catch:{ IOException -> 0x0284 }
            goto L_0x019e;
        L_0x0284:
            r3 = move-exception;
            r3.printStackTrace();	 Catch:{ Exception -> 0x01fe, all -> 0x028a }
            goto L_0x019e;
        L_0x028a:
            r3 = move-exception;
            r18 = r3;
            r3 = r2;
            r2 = r18;
        L_0x0290:
            r3.disconnect();	 Catch:{ Exception -> 0x029d }
            r4.close();	 Catch:{ Exception -> 0x029d }
        L_0x0296:
            throw r2;
        L_0x0297:
            r2 = move-exception;
            r2.printStackTrace();
            goto L_0x008e;
        L_0x029d:
            r3 = move-exception;
            r3.printStackTrace();
            goto L_0x0296;
        L_0x02a2:
            r2 = move-exception;
            goto L_0x0290;
        L_0x02a4:
            r2 = move-exception;
            r18 = r3;
            r3 = r4;
            r4 = r18;
            goto L_0x0290;
        L_0x02ab:
            r2 = move-exception;
            r18 = r4;
            r4 = r3;
            r3 = r18;
            goto L_0x0205;
        L_0x02b3:
            r3 = move-exception;
            r18 = r3;
            r3 = r4;
            r4 = r2;
            r2 = r18;
            goto L_0x0205;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fimi.kernel.b.b.b.c.run():void");
        }
    }

    public interface d {
        void a(a aVar, b bVar);
    }

    public interface e {
        void a(b bVar);
    }

    private class f extends Handler {
        final /* synthetic */ b a;

        private f(b bVar) {
            this.a = bVar;
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                b bVar = null;
                if (message.arg1 == 1) {
                    bVar = this.a;
                }
                this.a.g.a(bVar);
            }
            if (message.what == 2) {
                if (this.a.k >= this.a.j) {
                    this.a.u = a.Completed;
                }
                if (this.a.i != null) {
                    this.a.i.a(this.a.u, this.a);
                }
                if (this.a.h != null) {
                    this.a.h.a(this.a.u, this.a);
                }
            }
            if (message.what == 3 && this.a.h != null) {
                this.a.h.a(this.a.u, this.a);
            }
        }
    }

    private b() {
        this.l = this.k;
        this.m = 0;
        this.r = new ArrayList();
        this.u = a.Wait;
        this.y = System.currentTimeMillis();
        this.a = 1.0f;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            this.t = new f();
        }
    }

    protected b(String str, String str2) {
        this();
        this.n = str2;
        this.o = str;
    }

    protected static b a(Context context, String str) {
        b b = f.a(context).b(str);
        if (b != null) {
            b.s = context;
            b.q = f.a(context).c(b.m());
            long j = 0;
            long j2 = 0;
            for (d dVar : b.q) {
                j2 += dVar.e();
                j = (dVar.d() - dVar.c()) + j;
            }
            b.k = j2;
            b.j = j;
        }
        return b;
    }

    protected static b a(Context context, String str, long j, Boolean bool, String str2, e eVar) {
        if (eVar == null || context == null) {
            return null;
        }
        b a = a(context, str);
        if (a != null) {
            a.p = str.substring(str.lastIndexOf("/") + 1);
            a.s = context;
            eVar.a(a);
            return a;
        }
        a = new b();
        a.s = context;
        a.o = str;
        a.n = str2;
        a.p = str.substring(str.lastIndexOf("/") + 1);
        a.g = eVar;
        if (bool.booleanValue()) {
            a.p();
            return a;
        }
        a.a(Long.valueOf(j));
        return a;
    }

    protected static b a(Context context, String str, String str2, long j, Boolean bool, String str3, e eVar) {
        if (eVar == null || context == null) {
            return null;
        }
        b bVar = new b();
        bVar.s = context;
        bVar.o = str;
        bVar.n = str3;
        bVar.p = str.substring(str.lastIndexOf("/") + 1);
        bVar.g = eVar;
        if (g.g(str3)) {
            bVar.x = str2;
        }
        if (bool.booleanValue()) {
            bVar.p();
            return bVar;
        }
        bVar.a(Long.valueOf(j));
        return bVar;
    }

    private void a(Long l) {
        new b(this, l.longValue()).start();
    }

    protected static void b(Context context, String str, long j, Boolean bool, String str2, e eVar) {
        if (eVar != null && context != null) {
            b a = a(context, str);
            if (a != null) {
                a.s = context;
                eVar.a(a);
                return;
            }
            a = new b();
            a.s = context;
            a.o = str;
            a.n = str2;
            a.p = str.substring(str.lastIndexOf("/") + 1);
            a.g = eVar;
            if (bool.booleanValue()) {
                a.p();
            } else {
                a.a(Long.valueOf(j));
            }
        }
    }

    private void p() {
        new b(this).start();
    }

    private boolean q() {
        File file = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.o).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod("GET");
            this.j = (long) httpURLConnection.getContentLength();
            Log.d("Good", "获取文件大小" + this.o + ":" + this.j);
            file = g.f(this.n);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            randomAccessFile.setLength(FimiMediaMeta.AV_CH_SIDE_RIGHT);
            randomAccessFile.close();
            httpURLConnection.disconnect();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("Good", "File 获取文件错误" + e);
            if (file != null) {
                file.delete();
            }
            return false;
        }
    }

    private boolean r() {
        File file = null;
        try {
            file = g.f(this.n);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            randomAccessFile.setLength(FimiMediaMeta.AV_CH_SIDE_RIGHT);
            randomAccessFile.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("Good", "File 获取文件错误" + e);
            if (file != null) {
                file.delete();
            }
            return false;
        }
    }

    public String a() {
        return this.x;
    }

    public void a(Handler handler) {
        handler.post(new Runnable(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.t = new f();
            }
        });
    }

    public void a(d dVar) {
        this.h = dVar;
    }

    public void a(b bVar) {
        if (bVar != null && bVar.r != null && bVar.r.size() > 0) {
            for (int size = this.r.size() - 1; size >= 0; size--) {
                ((c) this.r.get(size)).b = true;
            }
            this.r.clear();
        }
    }

    public void a(Object obj) {
        this.v = obj;
    }

    public void a(String str) {
        this.x = str;
    }

    public String b() {
        return this.p;
    }

    protected void b(d dVar) {
        this.i = dVar;
    }

    public void c() {
        if (this.q != null) {
            if (this.u != a.Downloading) {
                this.u = a.Downloading;
                for (d dVar : this.q) {
                    if (dVar.c() + dVar.e() < dVar.d()) {
                        Runnable cVar = new c(this, dVar);
                        b.execute(cVar);
                        this.r.add(cVar);
                    }
                }
            } else {
                return;
            }
        }
        if (this.u == a.Error) {
            Log.d("Good", "重新初始化任务信息");
            p();
        }
    }

    public void d() {
        this.u = a.Wait;
    }

    public void e() {
        this.u = a.Pause;
    }

    public void f() {
        this.u = a.Completed;
    }

    public a g() {
        return this.u;
    }

    public String h() {
        return this.n;
    }

    public long i() {
        return this.j;
    }

    public Object j() {
        return this.v;
    }

    public long k() {
        return this.k;
    }

    public long l() {
        return this.m;
    }

    public String m() {
        return this.o;
    }

    public Bitmap n() {
        return this.w;
    }

    public d o() {
        return this.h;
    }

    public String toString() {
        return "DownloadTaskInfo{fileSize=" + this.j + ", complete=" + this.k + ", urlstring='" + this.o + '\'' + '}';
    }
}
