package com.google.android.gms.wearable.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.p.f;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.j;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c.a;
import com.google.android.gms.wearable.e;
import com.google.android.gms.wearable.e.b;
import com.google.android.gms.wearable.i;
import com.google.android.gms.wearable.m;
import com.google.android.gms.wearable.p$a;
import com.google.android.gms.wearable.p$b;
import com.google.android.gms.wearable.p.c;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ar extends w<y> {
    private final ExecutorService a;
    private final z<Object> e;
    private final z<Object> f;
    private final z<a> g;
    private final z<b> h;
    private final z<m.b> i;
    private final z<c> j;
    private final z<Object> k;
    private final z<com.google.android.gms.wearable.a.c> l;
    private com.google.android.gms.common.m m;

    public ar(Context context, Looper looper, g.b bVar, g.c cVar, s sVar) {
        this(context, looper, bVar, cVar, sVar, Executors.newCachedThreadPool(), com.google.android.gms.common.m.a(context));
    }

    ar(Context context, Looper looper, g.b bVar, g.c cVar, s sVar, ExecutorService executorService, com.google.android.gms.common.m mVar) {
        super(context, looper, 14, sVar, bVar, cVar);
        this.e = new z();
        this.f = new z();
        this.g = new z();
        this.h = new z();
        this.i = new z();
        this.j = new z();
        this.k = new z();
        this.l = new z();
        this.a = (ExecutorService) d.a(executorService);
        this.m = mVar;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            return intent;
        }
        return new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
    }

    private FutureTask<Boolean> a(final ParcelFileDescriptor parcelFileDescriptor, final byte[] bArr) {
        return new FutureTask(new Callable<Boolean>(this) {
            final /* synthetic */ ar c;

            public java.lang.Boolean a() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0105 in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
                /*
                r6 = this;
                r1 = 3;
                r0 = "WearableClient";
                r0 = android.util.Log.isLoggable(r0, r1);
                if (r0 == 0) goto L_0x0031;
            L_0x0009:
                r0 = "WearableClient";
                r1 = r3;
                r1 = java.lang.String.valueOf(r1);
                r2 = new java.lang.StringBuilder;
                r3 = java.lang.String.valueOf(r1);
                r3 = r3.length();
                r3 = r3 + 36;
                r2.<init>(r3);
                r3 = "processAssets: writing data to FD : ";
                r2 = r2.append(r3);
                r1 = r2.append(r1);
                r1 = r1.toString();
                android.util.Log.d(r0, r1);
            L_0x0031:
                r1 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream;
                r0 = r3;
                r1.<init>(r0);
                r0 = r4;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r1.write(r0);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r1.flush();	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r0 = "WearableClient";	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = 3;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r0 = android.util.Log.isLoggable(r0, r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                if (r0 == 0) goto L_0x0071;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
            L_0x0049:
                r0 = "WearableClient";	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = r3;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = r4.length();	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = r4 + 27;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r3.<init>(r4);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = "processAssets: wrote data: ";	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r3 = r3.append(r4);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = r3.append(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = r2.toString();	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                android.util.Log.d(r0, r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
            L_0x0071:
                r0 = 1;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = "WearableClient";	 Catch:{ IOException -> 0x0148 }
                r3 = 3;	 Catch:{ IOException -> 0x0148 }
                r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ IOException -> 0x0148 }
                if (r2 == 0) goto L_0x00a7;	 Catch:{ IOException -> 0x0148 }
            L_0x007f:
                r2 = "WearableClient";	 Catch:{ IOException -> 0x0148 }
                r3 = r3;	 Catch:{ IOException -> 0x0148 }
                r3 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x0148 }
                r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0148 }
                r5 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x0148 }
                r5 = r5.length();	 Catch:{ IOException -> 0x0148 }
                r5 = r5 + 24;	 Catch:{ IOException -> 0x0148 }
                r4.<init>(r5);	 Catch:{ IOException -> 0x0148 }
                r5 = "processAssets: closing: ";	 Catch:{ IOException -> 0x0148 }
                r4 = r4.append(r5);	 Catch:{ IOException -> 0x0148 }
                r3 = r4.append(r3);	 Catch:{ IOException -> 0x0148 }
                r3 = r3.toString();	 Catch:{ IOException -> 0x0148 }
                android.util.Log.d(r2, r3);	 Catch:{ IOException -> 0x0148 }
            L_0x00a7:
                r1.close();	 Catch:{ IOException -> 0x0148 }
            L_0x00aa:
                return r0;
            L_0x00ab:
                r0 = move-exception;
                r0 = "WearableClient";	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = r3;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = r4.length();	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = r4 + 36;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r3.<init>(r4);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = "processAssets: writing data failed: ";	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r3 = r3.append(r4);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = r3.append(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = r2.toString();	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                android.util.Log.w(r0, r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r0 = "WearableClient";
                r2 = 3;
                r0 = android.util.Log.isLoggable(r0, r2);
                if (r0 == 0) goto L_0x0105;
            L_0x00dd:
                r0 = "WearableClient";
                r2 = r3;
                r2 = java.lang.String.valueOf(r2);
                r3 = new java.lang.StringBuilder;
                r4 = java.lang.String.valueOf(r2);
                r4 = r4.length();
                r4 = r4 + 24;
                r3.<init>(r4);
                r4 = "processAssets: closing: ";
                r3 = r3.append(r4);
                r2 = r3.append(r2);
                r2 = r2.toString();
                android.util.Log.d(r0, r2);
            L_0x0105:
                r1.close();
            L_0x0108:
                r0 = 0;
                r0 = java.lang.Boolean.valueOf(r0);
                goto L_0x00aa;
            L_0x010e:
                r0 = move-exception;
                r2 = "WearableClient";	 Catch:{ IOException -> 0x0144 }
                r3 = 3;	 Catch:{ IOException -> 0x0144 }
                r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ IOException -> 0x0144 }
                if (r2 == 0) goto L_0x0140;	 Catch:{ IOException -> 0x0144 }
            L_0x0118:
                r2 = "WearableClient";	 Catch:{ IOException -> 0x0144 }
                r3 = r3;	 Catch:{ IOException -> 0x0144 }
                r3 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x0144 }
                r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0144 }
                r5 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x0144 }
                r5 = r5.length();	 Catch:{ IOException -> 0x0144 }
                r5 = r5 + 24;	 Catch:{ IOException -> 0x0144 }
                r4.<init>(r5);	 Catch:{ IOException -> 0x0144 }
                r5 = "processAssets: closing: ";	 Catch:{ IOException -> 0x0144 }
                r4 = r4.append(r5);	 Catch:{ IOException -> 0x0144 }
                r3 = r4.append(r3);	 Catch:{ IOException -> 0x0144 }
                r3 = r3.toString();	 Catch:{ IOException -> 0x0144 }
                android.util.Log.d(r2, r3);	 Catch:{ IOException -> 0x0144 }
            L_0x0140:
                r1.close();	 Catch:{ IOException -> 0x0144 }
            L_0x0143:
                throw r0;
            L_0x0144:
                r1 = move-exception;
                goto L_0x0143;
            L_0x0146:
                r0 = move-exception;
                goto L_0x0108;
            L_0x0148:
                r1 = move-exception;
                goto L_0x00aa;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.ar.1.a():java.lang.Boolean");
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    private Runnable b(ahl.b<Status> bVar, String str, Uri uri, long j, long j2) {
        d.a(bVar);
        d.a(str);
        d.a(uri);
        d.b(j >= 0, "startOffset is negative: %s", new Object[]{Long.valueOf(j)});
        d.b(j2 >= -1, "invalid length: %s", new Object[]{Long.valueOf(j2)});
        final Uri uri2 = uri;
        final ahl.b<Status> bVar2 = bVar;
        final String str2 = str;
        final long j3 = j;
        final long j4 = j2;
        return new Runnable(this) {
            final /* synthetic */ ar f;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                r8 = this;
                r0 = "WearableClient";
                r1 = 2;
                r0 = android.util.Log.isLoggable(r0, r1);
                if (r0 == 0) goto L_0x0010;
            L_0x0009:
                r0 = "WearableClient";
                r1 = "Executing sendFileToChannelTask";
                android.util.Log.v(r0, r1);
            L_0x0010:
                r0 = "file";
                r1 = r3;
                r1 = r1.getScheme();
                r0 = r0.equals(r1);
                if (r0 != 0) goto L_0x0034;
            L_0x001e:
                r0 = "WearableClient";
                r1 = "Channel.sendFile used with non-file URI";
                android.util.Log.w(r0, r1);
                r0 = r4;
                r1 = new com.google.android.gms.common.api.Status;
                r2 = 10;
                r3 = "Channel.sendFile used with non-file URI";
                r1.<init>(r2, r3);
                r0.c(r1);
            L_0x0033:
                return;
            L_0x0034:
                r0 = new java.io.File;
                r1 = r3;
                r1 = r1.getPath();
                r0.<init>(r1);
                r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
                r3 = android.os.ParcelFileDescriptor.open(r0, r1);	 Catch:{ FileNotFoundException -> 0x006a }
                r0 = r8.f;	 Catch:{ RemoteException -> 0x009e }
                r0 = r0.G();	 Catch:{ RemoteException -> 0x009e }
                r0 = (com.google.android.gms.wearable.internal.y) r0;	 Catch:{ RemoteException -> 0x009e }
                r1 = new com.google.android.gms.wearable.internal.aq$r;	 Catch:{ RemoteException -> 0x009e }
                r2 = r4;	 Catch:{ RemoteException -> 0x009e }
                r1.<init>(r2);	 Catch:{ RemoteException -> 0x009e }
                r2 = r5;	 Catch:{ RemoteException -> 0x009e }
                r4 = r6;	 Catch:{ RemoteException -> 0x009e }
                r6 = r8;	 Catch:{ RemoteException -> 0x009e }
                r0.a(r1, r2, r3, r4, r6);	 Catch:{ RemoteException -> 0x009e }
                r3.close();	 Catch:{ IOException -> 0x0061 }
                goto L_0x0033;
            L_0x0061:
                r0 = move-exception;
                r1 = "WearableClient";
                r2 = "Failed to close sourceFd";
                android.util.Log.w(r1, r2, r0);
                goto L_0x0033;
            L_0x006a:
                r1 = move-exception;
                r1 = "WearableClient";
                r0 = java.lang.String.valueOf(r0);
                r2 = new java.lang.StringBuilder;
                r3 = java.lang.String.valueOf(r0);
                r3 = r3.length();
                r3 = r3 + 46;
                r2.<init>(r3);
                r3 = "File couldn't be opened for Channel.sendFile: ";
                r2 = r2.append(r3);
                r0 = r2.append(r0);
                r0 = r0.toString();
                android.util.Log.w(r1, r0);
                r0 = r4;
                r1 = new com.google.android.gms.common.api.Status;
                r2 = 13;
                r1.<init>(r2);
                r0.c(r1);
                goto L_0x0033;
            L_0x009e:
                r0 = move-exception;
                r1 = "WearableClient";
                r2 = "Channel.sendFile failed.";
                android.util.Log.w(r1, r2, r0);	 Catch:{ all -> 0x00c1 }
                r0 = r4;	 Catch:{ all -> 0x00c1 }
                r1 = new com.google.android.gms.common.api.Status;	 Catch:{ all -> 0x00c1 }
                r2 = 8;
                r1.<init>(r2);	 Catch:{ all -> 0x00c1 }
                r0.c(r1);	 Catch:{ all -> 0x00c1 }
                r3.close();	 Catch:{ IOException -> 0x00b7 }
                goto L_0x0033;
            L_0x00b7:
                r0 = move-exception;
                r1 = "WearableClient";
                r2 = "Failed to close sourceFd";
                android.util.Log.w(r1, r2, r0);
                goto L_0x0033;
            L_0x00c1:
                r0 = move-exception;
                r3.close();	 Catch:{ IOException -> 0x00c6 }
            L_0x00c5:
                throw r0;
            L_0x00c6:
                r1 = move-exception;
                r2 = "WearableClient";
                r3 = "Failed to close sourceFd";
                android.util.Log.w(r2, r3, r1);
                goto L_0x00c5;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.ar.3.run():void");
            }
        };
    }

    private Runnable b(ahl.b<Status> bVar, String str, Uri uri, boolean z) {
        d.a(bVar);
        d.a(str);
        d.a(uri);
        final Uri uri2 = uri;
        final ahl.b<Status> bVar2 = bVar;
        final boolean z2 = z;
        final String str2 = str;
        return new Runnable(this) {
            final /* synthetic */ ar e;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                r4 = this;
                r0 = "WearableClient";
                r1 = 2;
                r0 = android.util.Log.isLoggable(r0, r1);
                if (r0 == 0) goto L_0x0010;
            L_0x0009:
                r0 = "WearableClient";
                r1 = "Executing receiveFileFromChannelTask";
                android.util.Log.v(r0, r1);
            L_0x0010:
                r0 = "file";
                r1 = r2;
                r1 = r1.getScheme();
                r0 = r0.equals(r1);
                if (r0 != 0) goto L_0x0034;
            L_0x001e:
                r0 = "WearableClient";
                r1 = "Channel.receiveFile used with non-file URI";
                android.util.Log.w(r0, r1);
                r0 = r3;
                r1 = new com.google.android.gms.common.api.Status;
                r2 = 10;
                r3 = "Channel.receiveFile used with non-file URI";
                r1.<init>(r2, r3);
                r0.c(r1);
            L_0x0033:
                return;
            L_0x0034:
                r1 = new java.io.File;
                r0 = r2;
                r0 = r0.getPath();
                r1.<init>(r0);
                r2 = 671088640; // 0x28000000 float:7.1054274E-15 double:3.315618423E-315;
                r0 = r4;
                if (r0 == 0) goto L_0x006d;
            L_0x0045:
                r0 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
            L_0x0047:
                r0 = r0 | r2;
                r1 = android.os.ParcelFileDescriptor.open(r1, r0);	 Catch:{ FileNotFoundException -> 0x006f }
                r0 = r4.e;	 Catch:{ RemoteException -> 0x00a3 }
                r0 = r0.G();	 Catch:{ RemoteException -> 0x00a3 }
                r0 = (com.google.android.gms.wearable.internal.y) r0;	 Catch:{ RemoteException -> 0x00a3 }
                r2 = new com.google.android.gms.wearable.internal.aq$u;	 Catch:{ RemoteException -> 0x00a3 }
                r3 = r3;	 Catch:{ RemoteException -> 0x00a3 }
                r2.<init>(r3);	 Catch:{ RemoteException -> 0x00a3 }
                r3 = r5;	 Catch:{ RemoteException -> 0x00a3 }
                r0.a(r2, r3, r1);	 Catch:{ RemoteException -> 0x00a3 }
                r1.close();	 Catch:{ IOException -> 0x0064 }
                goto L_0x0033;
            L_0x0064:
                r0 = move-exception;
                r1 = "WearableClient";
                r2 = "Failed to close targetFd";
                android.util.Log.w(r1, r2, r0);
                goto L_0x0033;
            L_0x006d:
                r0 = 0;
                goto L_0x0047;
            L_0x006f:
                r0 = move-exception;
                r0 = "WearableClient";
                r1 = java.lang.String.valueOf(r1);
                r2 = new java.lang.StringBuilder;
                r3 = java.lang.String.valueOf(r1);
                r3 = r3.length();
                r3 = r3 + 49;
                r2.<init>(r3);
                r3 = "File couldn't be opened for Channel.receiveFile: ";
                r2 = r2.append(r3);
                r1 = r2.append(r1);
                r1 = r1.toString();
                android.util.Log.w(r0, r1);
                r0 = r3;
                r1 = new com.google.android.gms.common.api.Status;
                r2 = 13;
                r1.<init>(r2);
                r0.c(r1);
                goto L_0x0033;
            L_0x00a3:
                r0 = move-exception;
                r2 = "WearableClient";
                r3 = "Channel.receiveFile failed.";
                android.util.Log.w(r2, r3, r0);	 Catch:{ all -> 0x00c6 }
                r0 = r3;	 Catch:{ all -> 0x00c6 }
                r2 = new com.google.android.gms.common.api.Status;	 Catch:{ all -> 0x00c6 }
                r3 = 8;
                r2.<init>(r3);	 Catch:{ all -> 0x00c6 }
                r0.c(r2);	 Catch:{ all -> 0x00c6 }
                r1.close();	 Catch:{ IOException -> 0x00bc }
                goto L_0x0033;
            L_0x00bc:
                r0 = move-exception;
                r1 = "WearableClient";
                r2 = "Failed to close targetFd";
                android.util.Log.w(r1, r2, r0);
                goto L_0x0033;
            L_0x00c6:
                r0 = move-exception;
                r1.close();	 Catch:{ IOException -> 0x00cb }
            L_0x00ca:
                throw r0;
            L_0x00cb:
                r1 = move-exception;
                r2 = "WearableClient";
                r3 = "Failed to close targetFd";
                android.util.Log.w(r2, r3, r1);
                goto L_0x00ca;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.ar.2.run():void");
            }
        };
    }

    protected y a(IBinder iBinder) {
        return y.a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.wearable.BIND";
    }

    protected void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.d("WearableClient", "onPostInitHandler: statusCode " + i);
        }
        if (i == 0) {
            this.e.a(iBinder);
            this.f.a(iBinder);
            this.g.a(iBinder);
            this.h.a(iBinder);
            this.i.a(iBinder);
            this.j.a(iBinder);
            this.k.a(iBinder);
            this.l.a(iBinder);
        }
        super.a(i, iBinder, bundle, i2);
    }

    public void a(@NonNull f fVar) {
        int i = 0;
        if (!w()) {
            try {
                Bundle bundle = B().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if (bundle != null) {
                    i = bundle.getInt("com.google.android.wearable.api.version", 0);
                }
                if (i < j.c) {
                    Log.w("WearableClient", "Android Wear out of date. Requires API version " + j.c + " but found " + i);
                    a(fVar, new ConnectionResult(6, PendingIntent.getActivity(B(), 0, a(B()), 0)));
                    return;
                }
            } catch (NameNotFoundException e) {
                a(fVar, new ConnectionResult(16));
                return;
            }
        }
        super.a(fVar);
    }

    public void a(ahl.b<com.google.android.gms.wearable.j> bVar) {
        ((y) G()).b(new l(bVar));
    }

    public void a(ahl.b<com.google.android.gms.wearable.a.d> bVar, int i) {
        ((y) G()).a(new f(bVar), i);
    }

    public void a(ahl.b<e.a> bVar, Uri uri) {
        ((y) G()).a(new k(bVar), uri);
    }

    public void a(ahl.b<com.google.android.gms.wearable.j> bVar, Uri uri, int i) {
        ((y) G()).a(new l(bVar), uri, i);
    }

    public void a(ahl.b<e.e> bVar, Asset asset) {
        ((y) G()).a(new m(bVar), asset);
    }

    public void a(ahl.b<e.a> bVar, PutDataRequest putDataRequest) {
        for (Entry value : putDataRequest.c().entrySet()) {
            Asset asset = (Asset) value.getValue();
            if (asset.a() == null && asset.b() == null && asset.c() == null && asset.d() == null) {
                String valueOf = String.valueOf(putDataRequest.a());
                String valueOf2 = String.valueOf(asset);
                throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()).append("Put for ").append(valueOf).append(" contains invalid asset: ").append(valueOf2).toString());
            }
        }
        PutDataRequest a = PutDataRequest.a(putDataRequest.a());
        a.a(putDataRequest.b());
        if (putDataRequest.f()) {
            a.g();
        }
        List arrayList = new ArrayList();
        for (Entry value2 : putDataRequest.c().entrySet()) {
            Asset asset2 = (Asset) value2.getValue();
            if (asset2.a() != null) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        String valueOf3 = String.valueOf(asset2);
                        String valueOf4 = String.valueOf(createPipe[0]);
                        String valueOf5 = String.valueOf(createPipe[1]);
                        Log.d("WearableClient", new StringBuilder(((String.valueOf(valueOf3).length() + 61) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()).append("processAssets: replacing data with FD in asset: ").append(valueOf3).append(" read:").append(valueOf4).append(" write:").append(valueOf5).toString());
                    }
                    a.a((String) value2.getKey(), Asset.a(createPipe[0]));
                    Runnable a2 = a(createPipe[1], asset2.a());
                    arrayList.add(a2);
                    this.a.submit(a2);
                } catch (Throwable e) {
                    valueOf = String.valueOf(putDataRequest);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 60).append("Unable to create ParcelFileDescriptor for asset in request: ").append(valueOf).toString(), e);
                }
            } else if (asset2.d() != null) {
                try {
                    a.a((String) value2.getKey(), Asset.a(B().getContentResolver().openFileDescriptor(asset2.d(), "r")));
                } catch (FileNotFoundException e2) {
                    new q(bVar, arrayList).a(new PutDataResponse(4005, null));
                    String valueOf6 = String.valueOf(asset2.d());
                    Log.w("WearableClient", new StringBuilder(String.valueOf(valueOf6).length() + 28).append("Couldn't resolve asset URI: ").append(valueOf6).toString());
                    return;
                }
            } else {
                a.a((String) value2.getKey(), asset2);
            }
        }
        ((y) G()).a(new q(bVar, arrayList), a);
    }

    public void a(ahl.b<Status> bVar, com.google.android.gms.wearable.a.c cVar) {
        this.l.a(this, bVar, cVar);
    }

    public void a(ahl.b<Status> bVar, com.google.android.gms.wearable.a.c cVar, ail<com.google.android.gms.wearable.a.c> com_google_android_gms_internal_ail_com_google_android_gms_wearable_a_c, IntentFilter[] intentFilterArr) {
        this.l.a(this, bVar, cVar, as.e(com_google_android_gms_internal_ail_com_google_android_gms_wearable_a_c, intentFilterArr));
    }

    public void a(ahl.b<Status> bVar, a aVar, ail<a> com_google_android_gms_internal_ail_com_google_android_gms_wearable_c_a, String str, IntentFilter[] intentFilterArr) {
        if (str == null) {
            this.g.a(this, bVar, aVar, as.d(com_google_android_gms_internal_ail_com_google_android_gms_wearable_c_a, intentFilterArr));
            return;
        }
        this.g.a(this, bVar, new al(str, aVar), as.a(com_google_android_gms_internal_ail_com_google_android_gms_wearable_c_a, str, intentFilterArr));
    }

    public void a(ahl.b<Status> bVar, a aVar, String str) {
        if (str == null) {
            this.g.a(this, bVar, aVar);
            return;
        }
        this.g.a(this, bVar, new al(str, aVar));
    }

    public void a(ahl.b<Status> bVar, b bVar2) {
        this.h.a(this, bVar, bVar2);
    }

    public void a(ahl.b<Status> bVar, b bVar2, ail<b> com_google_android_gms_internal_ail_com_google_android_gms_wearable_e_b, IntentFilter[] intentFilterArr) {
        this.h.a(this, bVar, bVar2, as.a(com_google_android_gms_internal_ail_com_google_android_gms_wearable_e_b, intentFilterArr));
    }

    public void a(ahl.b<e.e> bVar, i iVar) {
        a((ahl.b) bVar, Asset.a(iVar.c()));
    }

    public void a(ahl.b<Status> bVar, m.b bVar2) {
        this.i.a(this, bVar, bVar2);
    }

    public void a(ahl.b<Status> bVar, m.b bVar2, ail<m.b> com_google_android_gms_internal_ail_com_google_android_gms_wearable_m_b, IntentFilter[] intentFilterArr) {
        this.i.a(this, bVar, bVar2, as.b(com_google_android_gms_internal_ail_com_google_android_gms_wearable_m_b, intentFilterArr));
    }

    public void a(ahl.b<Status> bVar, c cVar) {
        this.j.a(this, bVar, cVar);
    }

    public void a(ahl.b<Status> bVar, c cVar, ail<c> com_google_android_gms_internal_ail_com_google_android_gms_wearable_p_c, IntentFilter[] intentFilterArr) {
        this.j.a(this, bVar, cVar, as.c(com_google_android_gms_internal_ail_com_google_android_gms_wearable_p_c, intentFilterArr));
    }

    public void a(ahl.b<com.google.android.gms.wearable.a.a> bVar, String str) {
        ((y) G()).d(new a(bVar), str);
    }

    public void a(ahl.b<com.google.android.gms.wearable.a.e> bVar, String str, int i) {
        ((y) G()).a(new g(bVar), str, i);
    }

    public void a(ahl.b<Status> bVar, String str, Uri uri, long j, long j2) {
        try {
            this.a.execute(b(bVar, str, uri, j, j2));
        } catch (RuntimeException e) {
            bVar.c(new Status(8));
            throw e;
        }
    }

    public void a(ahl.b<Status> bVar, String str, Uri uri, boolean z) {
        try {
            this.a.execute(b(bVar, str, uri, z));
        } catch (RuntimeException e) {
            bVar.c(new Status(8));
            throw e;
        }
    }

    public void a(ahl.b<com.google.android.gms.wearable.c.c> bVar, String str, String str2) {
        ((y) G()).a(new p(bVar), str, str2);
    }

    public void a(ahl.b<m.c> bVar, String str, String str2, byte[] bArr) {
        ((y) G()).a(new t(bVar), str, str2, bArr);
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    public void b(ahl.b<p$b> bVar) {
        ((y) G()).c(new n(bVar));
    }

    public void b(ahl.b<e.c> bVar, Uri uri, int i) {
        ((y) G()).b(new e(bVar), uri, i);
    }

    public void b(ahl.b<com.google.android.gms.wearable.a.g> bVar, String str) {
        ((y) G()).e(new s(bVar), str);
    }

    public void b(ahl.b<Status> bVar, String str, int i) {
        ((y) G()).b(new d(bVar), str, i);
    }

    public void c(ahl.b<p$a> bVar) {
        ((y) G()).d(new j(bVar));
    }

    public void c(ahl.b<Status> bVar, String str) {
        ((y) G()).f(new c(bVar), str);
    }

    public void d(ahl.b<Channel.a> bVar, String str) {
        v blVar = new bl();
        ((y) G()).a(new h(bVar, blVar), blVar, str);
    }

    public void e(ahl.b<Channel.b> bVar, String str) {
        v blVar = new bl();
        ((y) G()).b(new i(bVar, blVar), blVar, str);
    }

    public boolean w() {
        return !this.m.a(B().getPackageManager(), "com.google.android.wearable.app.cn");
    }

    protected String y() {
        return this.m.a(B().getPackageManager(), "com.google.android.wearable.app.cn") ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }
}
