package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.v4.util.LongSparseArray;
import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import com.google.android.gms.drive.metadata.internal.e.a;
import com.google.android.gms.drive.metadata.internal.k;
import java.util.Arrays;

public class ajx extends k<AppVisibleCustomProperties> {
    public static final a a = new a() {
        public String a() {
            return "customPropertiesExtraHolder";
        }

        public void a(DataHolder dataHolder) {
            ajx.d(dataHolder);
        }
    };

    public ajx(int i) {
        super("customProperties", Arrays.asList(new String[]{"hasCustomProperties", "sqlId"}), Arrays.asList(new String[]{"customPropertiesExtra", "customPropertiesExtraHolder"}), i);
    }

    private static LongSparseArray<AppVisibleCustomProperties.a> b(DataHolder dataHolder) {
        Bundle f = dataHolder.f();
        String string = f.getString("entryIdColumn");
        String string2 = f.getString("keyColumn");
        String string3 = f.getString("visibilityColumn");
        String string4 = f.getString("valueColumn");
        LongSparseArray<AppVisibleCustomProperties.a> longSparseArray = new LongSparseArray();
        for (int i = 0; i < dataHolder.g(); i++) {
            int a = dataHolder.a(i);
            long a2 = dataHolder.a(string, i, a);
            String c = dataHolder.c(string2, i, a);
            int b = dataHolder.b(string3, i, a);
            CustomProperty customProperty = new CustomProperty(new CustomPropertyKey(c, b), dataHolder.c(string4, i, a));
            AppVisibleCustomProperties.a aVar = (AppVisibleCustomProperties.a) longSparseArray.get(a2);
            if (aVar == null) {
                aVar = new AppVisibleCustomProperties.a();
                longSparseArray.put(a2, aVar);
            }
            aVar.a(customProperty);
        }
        return longSparseArray;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(com.google.android.gms.common.data.DataHolder r8) {
        /*
        monitor-enter(r8);
        r0 = r8.f();	 Catch:{ all -> 0x0056 }
        r1 = "customPropertiesExtraHolder";
        r0 = r0.getParcelable(r1);	 Catch:{ all -> 0x0056 }
        r0 = (com.google.android.gms.common.data.DataHolder) r0;	 Catch:{ all -> 0x0056 }
        if (r0 != 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r8);	 Catch:{ all -> 0x0056 }
    L_0x0010:
        return;
    L_0x0011:
        r3 = b(r0);	 Catch:{ all -> 0x0059 }
        r4 = new android.util.SparseArray;	 Catch:{ all -> 0x0059 }
        r4.<init>();	 Catch:{ all -> 0x0059 }
        r1 = 0;
        r2 = r1;
    L_0x001c:
        r1 = r8.g();	 Catch:{ all -> 0x0059 }
        if (r2 >= r1) goto L_0x003f;
    L_0x0022:
        r1 = "sqlId";
        r5 = r8.a(r2);	 Catch:{ all -> 0x0059 }
        r6 = r8.a(r1, r2, r5);	 Catch:{ all -> 0x0059 }
        r1 = r3.get(r6);	 Catch:{ all -> 0x0059 }
        r1 = (com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.a) r1;	 Catch:{ all -> 0x0059 }
        if (r1 == 0) goto L_0x003b;
    L_0x0034:
        r1 = r1.a();	 Catch:{ all -> 0x0059 }
        r4.append(r2, r1);	 Catch:{ all -> 0x0059 }
    L_0x003b:
        r1 = r2 + 1;
        r2 = r1;
        goto L_0x001c;
    L_0x003f:
        r1 = r8.f();	 Catch:{ all -> 0x0059 }
        r2 = "customPropertiesExtra";
        r1.putSparseParcelableArray(r2, r4);	 Catch:{ all -> 0x0059 }
        r0.close();	 Catch:{ all -> 0x0056 }
        r0 = r8.f();	 Catch:{ all -> 0x0056 }
        r1 = "customPropertiesExtraHolder";
        r0.remove(r1);	 Catch:{ all -> 0x0056 }
        monitor-exit(r8);	 Catch:{ all -> 0x0056 }
        goto L_0x0010;
    L_0x0056:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0056 }
        throw r0;
    L_0x0059:
        r1 = move-exception;
        r0.close();	 Catch:{ all -> 0x0056 }
        r0 = r8.f();	 Catch:{ all -> 0x0056 }
        r2 = "customPropertiesExtraHolder";
        r0.remove(r2);	 Catch:{ all -> 0x0056 }
        throw r1;	 Catch:{ all -> 0x0056 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ajx.c(com.google.android.gms.common.data.DataHolder):void");
    }

    private static void d(DataHolder dataHolder) {
        Bundle f = dataHolder.f();
        if (f != null) {
            synchronized (dataHolder) {
                DataHolder dataHolder2 = (DataHolder) f.getParcelable("customPropertiesExtraHolder");
                if (dataHolder2 != null) {
                    dataHolder2.close();
                    f.remove("customPropertiesExtraHolder");
                }
            }
        }
    }

    protected /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return d(dataHolder, i, i2);
    }

    protected AppVisibleCustomProperties d(DataHolder dataHolder, int i, int i2) {
        Bundle f = dataHolder.f();
        SparseArray sparseParcelableArray = f.getSparseParcelableArray("customPropertiesExtra");
        if (sparseParcelableArray == null) {
            if (f.getParcelable("customPropertiesExtraHolder") != null) {
                c(dataHolder);
                sparseParcelableArray = f.getSparseParcelableArray("customPropertiesExtra");
            }
            if (sparseParcelableArray == null) {
                return AppVisibleCustomProperties.a;
            }
        }
        return (AppVisibleCustomProperties) sparseParcelableArray.get(i, AppVisibleCustomProperties.a);
    }
}
