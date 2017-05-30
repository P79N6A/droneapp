package com.google.android.gms.measurement.internal;

import a.k;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.fimi.soul.entity.User;
import com.google.android.gms.internal.amu.b;
import com.google.android.gms.internal.amu.c;
import com.google.android.gms.internal.amu.d;
import com.google.android.gms.internal.amu.e;
import com.google.android.gms.internal.amu.f;
import com.google.android.gms.internal.amw;
import com.google.android.gms.internal.amw.a;
import com.google.android.gms.internal.amw.g;
import com.google.android.gms.internal.qw;
import com.google.android.gms.measurement.AppMeasurement$a;
import com.google.android.gms.measurement.AppMeasurement$e;
import com.tencent.connect.common.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class m extends al {
    m(aj ajVar) {
        super(ajVar);
    }

    private Object a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (!(obj instanceof Boolean)) {
            return obj instanceof Float ? Double.valueOf(((Float) obj).doubleValue()) : ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) ? a(String.valueOf(obj), i, z) : null;
        } else {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
    }

    public static String a(b bVar) {
        int i = 0;
        if (bVar == null) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nevent_filter {\n");
        a(stringBuilder, 0, "filter_id", bVar.a);
        a(stringBuilder, 0, k.b, bVar.b);
        a(stringBuilder, 1, "event_count_filter", bVar.e);
        stringBuilder.append("  filters {\n");
        c[] cVarArr = bVar.c;
        int length = cVarArr.length;
        while (i < length) {
            a(stringBuilder, 2, cVarArr[i]);
            i++;
        }
        a(stringBuilder, 1);
        stringBuilder.append("}\n}\n");
        return stringBuilder.toString();
    }

    public static String a(e eVar) {
        if (eVar == null) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nproperty_filter {\n");
        a(stringBuilder, 0, "filter_id", eVar.a);
        a(stringBuilder, 0, "property_name", eVar.b);
        a(stringBuilder, 1, eVar.c);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append("  ");
        }
    }

    private static void a(StringBuilder stringBuilder, int i, c cVar) {
        if (cVar != null) {
            a(stringBuilder, i);
            stringBuilder.append("filter {\n");
            a(stringBuilder, i, "complement", cVar.c);
            a(stringBuilder, i, "param_name", cVar.d);
            a(stringBuilder, i + 1, "string_filter", cVar.a);
            a(stringBuilder, i + 1, "number_filter", cVar.b);
            a(stringBuilder, i);
            stringBuilder.append("}\n");
        }
    }

    private static void a(StringBuilder stringBuilder, int i, amw.e eVar) {
        if (eVar != null) {
            a(stringBuilder, i);
            stringBuilder.append("bundle {\n");
            a(stringBuilder, i, "protocol_version", eVar.a);
            a(stringBuilder, i, Constants.PARAM_PLATFORM, eVar.i);
            a(stringBuilder, i, "gmp_version", eVar.q);
            a(stringBuilder, i, "uploading_gmp_version", eVar.r);
            a(stringBuilder, i, "gmp_app_id", eVar.y);
            a(stringBuilder, i, "app_id", eVar.o);
            a(stringBuilder, i, com.xiaomi.mipush.sdk.Constants.EXTRA_KEY_APP_VERSION, eVar.p);
            a(stringBuilder, i, "app_version_major", eVar.C);
            a(stringBuilder, i, "firebase_instance_id", eVar.B);
            a(stringBuilder, i, "dev_cert_hash", eVar.v);
            a(stringBuilder, i, "app_store", eVar.n);
            a(stringBuilder, i, "upload_timestamp_millis", eVar.d);
            a(stringBuilder, i, "start_timestamp_millis", eVar.e);
            a(stringBuilder, i, "end_timestamp_millis", eVar.f);
            a(stringBuilder, i, "previous_bundle_start_timestamp_millis", eVar.g);
            a(stringBuilder, i, "previous_bundle_end_timestamp_millis", eVar.h);
            a(stringBuilder, i, "app_instance_id", eVar.u);
            a(stringBuilder, i, "resettable_device_id", eVar.s);
            a(stringBuilder, i, "device_id", eVar.F);
            a(stringBuilder, i, "limited_ad_tracking", eVar.t);
            a(stringBuilder, i, "os_version", eVar.j);
            a(stringBuilder, i, "device_model", eVar.k);
            a(stringBuilder, i, "user_default_language", eVar.l);
            a(stringBuilder, i, "time_zone_offset_minutes", eVar.m);
            a(stringBuilder, i, "bundle_sequential_index", eVar.w);
            a(stringBuilder, i, "service_upload", eVar.z);
            a(stringBuilder, i, "health_monitor", eVar.x);
            a(stringBuilder, i, eVar.c);
            a(stringBuilder, i, eVar.A);
            a(stringBuilder, i, eVar.b);
            a(stringBuilder, i);
            stringBuilder.append("}\n");
        }
    }

    private static void a(StringBuilder stringBuilder, int i, String str, d dVar) {
        if (dVar != null) {
            a(stringBuilder, i);
            stringBuilder.append(str);
            stringBuilder.append(" {\n");
            if (dVar.a != null) {
                Object obj = "UNKNOWN_COMPARISON_TYPE";
                switch (dVar.a.intValue()) {
                    case 1:
                        obj = "LESS_THAN";
                        break;
                    case 2:
                        obj = "GREATER_THAN";
                        break;
                    case 3:
                        obj = "EQUAL";
                        break;
                    case 4:
                        obj = "BETWEEN";
                        break;
                }
                a(stringBuilder, i, "comparison_type", obj);
            }
            a(stringBuilder, i, "match_as_float", dVar.b);
            a(stringBuilder, i, "comparison_value", dVar.c);
            a(stringBuilder, i, "min_comparison_value", dVar.d);
            a(stringBuilder, i, "max_comparison_value", dVar.e);
            a(stringBuilder, i);
            stringBuilder.append("}\n");
        }
    }

    private static void a(StringBuilder stringBuilder, int i, String str, f fVar) {
        if (fVar != null) {
            a(stringBuilder, i);
            stringBuilder.append(str);
            stringBuilder.append(" {\n");
            if (fVar.a != null) {
                Object obj = "UNKNOWN_MATCH_TYPE";
                switch (fVar.a.intValue()) {
                    case 1:
                        obj = "REGEXP";
                        break;
                    case 2:
                        obj = "BEGINS_WITH";
                        break;
                    case 3:
                        obj = "ENDS_WITH";
                        break;
                    case 4:
                        obj = "PARTIAL";
                        break;
                    case 5:
                        obj = "EXACT";
                        break;
                    case 6:
                        obj = "IN_LIST";
                        break;
                }
                a(stringBuilder, i, "match_type", obj);
            }
            a(stringBuilder, i, "expression", fVar.b);
            a(stringBuilder, i, "case_sensitive", fVar.c);
            if (fVar.d.length > 0) {
                a(stringBuilder, i + 1);
                stringBuilder.append("expression_list {\n");
                for (String str2 : fVar.d) {
                    a(stringBuilder, i + 2);
                    stringBuilder.append(str2);
                    stringBuilder.append("\n");
                }
                stringBuilder.append("}\n");
            }
            a(stringBuilder, i);
            stringBuilder.append("}\n");
        }
    }

    private static void a(StringBuilder stringBuilder, int i, String str, amw.f fVar) {
        int i2 = 0;
        if (fVar != null) {
            int i3;
            int i4;
            int i5 = i + 1;
            a(stringBuilder, i5);
            stringBuilder.append(str);
            stringBuilder.append(" {\n");
            if (fVar.b != null) {
                a(stringBuilder, i5 + 1);
                stringBuilder.append("results: ");
                long[] jArr = fVar.b;
                int length = jArr.length;
                i3 = 0;
                i4 = 0;
                while (i3 < length) {
                    Long valueOf = Long.valueOf(jArr[i3]);
                    int i6 = i4 + 1;
                    if (i4 != 0) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(valueOf);
                    i3++;
                    i4 = i6;
                }
                stringBuilder.append('\n');
            }
            if (fVar.a != null) {
                a(stringBuilder, i5 + 1);
                stringBuilder.append("status: ");
                long[] jArr2 = fVar.a;
                int length2 = jArr2.length;
                i3 = 0;
                while (i2 < length2) {
                    Long valueOf2 = Long.valueOf(jArr2[i2]);
                    i4 = i3 + 1;
                    if (i3 != 0) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(valueOf2);
                    i2++;
                    i3 = i4;
                }
                stringBuilder.append('\n');
            }
            a(stringBuilder, i5);
            stringBuilder.append("}\n");
        }
    }

    private static void a(StringBuilder stringBuilder, int i, String str, Object obj) {
        if (obj != null) {
            a(stringBuilder, i + 1);
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(obj);
            stringBuilder.append('\n');
        }
    }

    private static void a(StringBuilder stringBuilder, int i, a[] aVarArr) {
        if (aVarArr != null) {
            int i2 = i + 1;
            for (a aVar : aVarArr) {
                if (aVar != null) {
                    a(stringBuilder, i2);
                    stringBuilder.append("audience_membership {\n");
                    a(stringBuilder, i2, "audience_id", aVar.a);
                    a(stringBuilder, i2, "new_audience", aVar.d);
                    a(stringBuilder, i2, "current_data", aVar.b);
                    a(stringBuilder, i2, "previous_data", aVar.c);
                    a(stringBuilder, i2);
                    stringBuilder.append("}\n");
                }
            }
        }
    }

    private static void a(StringBuilder stringBuilder, int i, amw.b[] bVarArr) {
        if (bVarArr != null) {
            int i2 = i + 1;
            for (amw.b bVar : bVarArr) {
                if (bVar != null) {
                    a(stringBuilder, i2);
                    stringBuilder.append("event {\n");
                    a(stringBuilder, i2, User.FN_NAME, bVar.b);
                    a(stringBuilder, i2, "timestamp_millis", bVar.c);
                    a(stringBuilder, i2, "previous_timestamp_millis", bVar.d);
                    a(stringBuilder, i2, "count", bVar.e);
                    a(stringBuilder, i2, bVar.a);
                    a(stringBuilder, i2);
                    stringBuilder.append("}\n");
                }
            }
        }
    }

    private static void a(StringBuilder stringBuilder, int i, amw.c[] cVarArr) {
        if (cVarArr != null) {
            int i2 = i + 1;
            for (amw.c cVar : cVarArr) {
                if (cVar != null) {
                    a(stringBuilder, i2);
                    stringBuilder.append("param {\n");
                    a(stringBuilder, i2, User.FN_NAME, cVar.a);
                    a(stringBuilder, i2, "string_value", cVar.b);
                    a(stringBuilder, i2, "int_value", cVar.c);
                    a(stringBuilder, i2, "double_value", cVar.e);
                    a(stringBuilder, i2);
                    stringBuilder.append("}\n");
                }
            }
        }
    }

    private static void a(StringBuilder stringBuilder, int i, g[] gVarArr) {
        if (gVarArr != null) {
            int i2 = i + 1;
            for (g gVar : gVarArr) {
                if (gVar != null) {
                    a(stringBuilder, i2);
                    stringBuilder.append("user_property {\n");
                    a(stringBuilder, i2, "set_timestamp_millis", gVar.a);
                    a(stringBuilder, i2, User.FN_NAME, gVar.b);
                    a(stringBuilder, i2, "string_value", gVar.c);
                    a(stringBuilder, i2, "int_value", gVar.d);
                    a(stringBuilder, i2, "double_value", gVar.f);
                    a(stringBuilder, i2);
                    stringBuilder.append("}\n");
                }
            }
        }
    }

    public static boolean a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 4);
            return serviceInfo != null && serviceInfo.enabled;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, str), 2);
            return (receiverInfo == null || !receiverInfo.enabled) ? false : !z || receiverInfo.exported;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    static boolean a(String str) {
        com.google.android.gms.common.internal.d.a(str);
        return str.charAt(0) != '_';
    }

    public static boolean a(long[] jArr, int i) {
        return i < jArr.length * 64 && (jArr[i / 64] & (1 << (i % 64))) != 0;
    }

    public static long[] a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        int i = 0;
        while (i < length) {
            jArr[i] = 0;
            int i2 = 0;
            while (i2 < 64 && (i * 64) + i2 < bitSet.length()) {
                if (bitSet.get((i * 64) + i2)) {
                    jArr[i] = jArr[i] | (1 << i2);
                }
                i2++;
            }
            i++;
        }
        return jArr;
    }

    public static String b(amw.d dVar) {
        if (dVar == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nbatch {\n");
        if (dVar.a != null) {
            for (amw.e eVar : dVar.a) {
                if (eVar != null) {
                    a(stringBuilder, 1, eVar);
                }
            }
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    static long c(byte[] bArr) {
        long j = null;
        com.google.android.gms.common.internal.d.a(bArr);
        com.google.android.gms.common.internal.d.a(bArr.length > 0);
        long j2 = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j2 += (((long) bArr[length]) & 255) << j;
            j += 8;
            length--;
        }
        return j2;
    }

    public static boolean c(String str, String str2) {
        return (str == null && str2 == null) ? true : str == null ? false : str.equals(str2);
    }

    static MessageDigest j(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    public static boolean l(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean n(String str) {
        return str != null && str.matches("(\\+|-)?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    private int o(String str) {
        return "_ldl".equals(str) ? y().A() : y().z();
    }

    public Bundle a(@NonNull Uri uri) {
        Bundle bundle = null;
        if (uri != null) {
            try {
                Object queryParameter;
                Object queryParameter2;
                Object queryParameter3;
                Object queryParameter4;
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                } else {
                    queryParameter4 = null;
                    queryParameter3 = null;
                    queryParameter2 = null;
                    queryParameter = null;
                }
                if (!(TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4))) {
                    bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("campaign", queryParameter);
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("source", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("medium", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("gclid", queryParameter4);
                    }
                    queryParameter4 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("term", queryParameter4);
                    }
                    queryParameter4 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("content", queryParameter4);
                    }
                    queryParameter4 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("aclid", queryParameter4);
                    }
                    queryParameter4 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("cp1", queryParameter4);
                    }
                    queryParameter4 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("anid", queryParameter4);
                    }
                }
            } catch (UnsupportedOperationException e) {
                w().z().a("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return bundle;
    }

    public Bundle a(String str, Bundle bundle, @Nullable List<String> list, boolean z) {
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int b = y().b();
        int i = 0;
        for (String str2 : bundle.keySet()) {
            int f;
            if (list == null || !list.contains(str2)) {
                f = z ? f(str2) : 0;
                if (f == 0) {
                    f = g(str2);
                }
            } else {
                f = 0;
            }
            if (f != 0) {
                if (a(bundle2, f)) {
                    bundle2.putString("_ev", a(str2, y().e(), true));
                    if (f == 3) {
                        a(bundle2, (Object) str2);
                    }
                }
                bundle2.remove(str2);
            } else if (a(str2, bundle.get(str2)) || "_ev".equals(str2)) {
                if (a(str2)) {
                    i++;
                    if (i > b) {
                        w().f().a("Event can't contain more then " + b + " params", str, bundle);
                        a(bundle2, 5);
                        bundle2.remove(str2);
                    }
                }
                i = i;
            } else {
                if (a(bundle2, 4)) {
                    bundle2.putString("_ev", a(str2, y().e(), true));
                    a(bundle2, bundle.get(str2));
                }
                bundle2.remove(str2);
            }
        }
        return bundle2;
    }

    public String a(String str, int i, boolean z) {
        return str.length() > i ? z ? String.valueOf(str.substring(0, i)).concat("...") : null : str;
    }

    public void a(int i, String str, String str2, int i2) {
        Bundle bundle = new Bundle();
        a(bundle, i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(str, str2);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.n.l().a("auto", "_err", bundle);
    }

    public void a(Bundle bundle, Object obj) {
        com.google.android.gms.common.internal.d.a(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    public void a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (str != null) {
                w().B().a("Not putting event parameter. Invalid value type. name, type", str, obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public void a(amw.c cVar, Object obj) {
        com.google.android.gms.common.internal.d.a(obj);
        cVar.b = null;
        cVar.c = null;
        cVar.e = null;
        if (obj instanceof String) {
            cVar.b = (String) obj;
        } else if (obj instanceof Long) {
            cVar.c = (Long) obj;
        } else if (obj instanceof Double) {
            cVar.e = (Double) obj;
        } else {
            w().f().a("Ignoring invalid (type) event param value", obj);
        }
    }

    public void a(g gVar, Object obj) {
        com.google.android.gms.common.internal.d.a(obj);
        gVar.c = null;
        gVar.d = null;
        gVar.f = null;
        if (obj instanceof String) {
            gVar.c = (String) obj;
        } else if (obj instanceof Long) {
            gVar.d = (Long) obj;
        } else if (obj instanceof Double) {
            gVar.f = (Double) obj;
        } else {
            w().f().a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public boolean a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(p().a() - j) > j2;
    }

    public boolean a(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    boolean a(String str, int i, String str2) {
        if (str2 == null) {
            w().f().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() <= i) {
            return true;
        } else {
            w().f().a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    public boolean a(String str, Object obj) {
        return l(str) ? a("param", str, y().g(), obj) : a("param", str, y().f(), obj);
    }

    boolean a(String str, String str2) {
        if (str2 == null) {
            w().f().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            w().f().a("Name is required and can't be empty. Type", str);
            return false;
        } else if (Character.isLetter(str2.charAt(0))) {
            int i = 1;
            while (i < str2.length()) {
                char charAt = str2.charAt(i);
                if (charAt == '_' || Character.isLetterOrDigit(charAt)) {
                    i++;
                } else {
                    w().f().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        } else {
            w().f().a("Name must start with a letter. Type, name", str, str2);
            return false;
        }
    }

    boolean a(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String valueOf = String.valueOf(obj);
        if (valueOf.length() <= i) {
            return true;
        }
        w().z().a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
        return false;
    }

    boolean a(String str, Map<String, String> map, String str2) {
        if (str2 == null) {
            w().f().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.startsWith("firebase_")) {
            w().f().a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (map == null || !map.containsKey(str2)) {
            return true;
        } else {
            w().f().a("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    public byte[] a(amw.d dVar) {
        try {
            byte[] bArr = new byte[dVar.g()];
            qw a = qw.a(bArr);
            dVar.a(a);
            a.b();
            return bArr;
        } catch (IOException e) {
            w().f().a("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    public byte[] a(byte[] bArr) {
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            w().f().a("Failed to gzip content", e);
            throw e;
        }
    }

    public int b(String str) {
        return !a(com.google.android.gms.tagmanager.e.b, str) ? 2 : !a(com.google.android.gms.tagmanager.e.b, AppMeasurement$a.a, str) ? 13 : a(com.google.android.gms.tagmanager.e.b, y().c(), str) ? 0 : 2;
    }

    public Object b(String str, Object obj) {
        if ("_ev".equals(str)) {
            return a(y().g(), obj, true);
        }
        return a(l(str) ? y().g() : y().f(), obj, false);
    }

    boolean b(String str, String str2) {
        if (str2 == null) {
            w().f().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            w().f().a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            char charAt = str2.charAt(0);
            if (Character.isLetter(charAt) || charAt == '_') {
                int i = 1;
                while (i < str2.length()) {
                    char charAt2 = str2.charAt(i);
                    if (charAt2 == '_' || Character.isLetterOrDigit(charAt2)) {
                        i++;
                    } else {
                        w().f().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            w().f().a("Name must start with a letter or _ (underscores). Type, name", str, str2);
            return false;
        }
    }

    public byte[] b(byte[] bArr) {
        try {
            InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e) {
            w().f().a("Failed to ungzip content", e);
            throw e;
        }
    }

    public int c(String str) {
        return !b(com.google.android.gms.tagmanager.e.b, str) ? 2 : !a(com.google.android.gms.tagmanager.e.b, AppMeasurement$a.a, str) ? 13 : a(com.google.android.gms.tagmanager.e.b, y().c(), str) ? 0 : 2;
    }

    public int c(String str, Object obj) {
        return "_ldl".equals(str) ? a("user property referrer", str, o(str), obj) : a("user property", str, o(str), obj) ? 0 : 7;
    }

    public int d(String str) {
        return !a("user property", str) ? 6 : !a("user property", AppMeasurement$e.a, str) ? 15 : a("user property", y().d(), str) ? 0 : 6;
    }

    public long d(byte[] bArr) {
        com.google.android.gms.common.internal.d.a(bArr);
        MessageDigest j = j("MD5");
        if (j != null) {
            return c(j.digest(bArr));
        }
        w().f().a("Failed to get MD5");
        return 0;
    }

    public Object d(String str, Object obj) {
        return "_ldl".equals(str) ? a(o(str), obj, true) : a(o(str), obj, false);
    }

    public int e(String str) {
        return !b("user property", str) ? 6 : !a("user property", AppMeasurement$e.a, str) ? 15 : a("user property", y().d(), str) ? 0 : 6;
    }

    public int f(String str) {
        return !a("event param", str) ? 3 : !a("event param", null, str) ? 14 : a("event param", y().e(), str) ? 0 : 3;
    }

    public int g(String str) {
        return !b("event param", str) ? 3 : !a("event param", null, str) ? 14 : a("event param", y().e(), str) ? 0 : 3;
    }

    public /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            w().f().a("Measurement Service called without google_app_id");
            return false;
        } else if (!str.startsWith("1:")) {
            w().z().a("Measurement Service called with unknown id version", str);
            return true;
        } else if (i(str)) {
            return true;
        } else {
            w().f().a("Invalid google_app_id. Firebase Analytics disabled. See", "https://goo.gl/FZRIUV");
            return false;
        }
    }

    public /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    boolean i(String str) {
        com.google.android.gms.common.internal.d.a(str);
        return str.matches("^1:\\d+:android:[a-f0-9]+$");
    }

    public /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public /* bridge */ /* synthetic */ o k() {
        return super.k();
    }

    @WorkerThread
    public boolean k(String str) {
        j();
        if (q().checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        w().D().a("Permission not granted", str);
        return false;
    }

    public /* bridge */ /* synthetic */ d l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ z m() {
        return super.m();
    }

    public boolean m(String str) {
        return TextUtils.isEmpty(str) ? false : y().aj().equals(str);
    }

    public /* bridge */ /* synthetic */ s n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ e o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.common.util.e p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ Context q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ q r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ m s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ ah t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ g u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ ai v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ ab w() {
        return super.w();
    }

    public /* bridge */ /* synthetic */ af x() {
        return super.x();
    }

    public /* bridge */ /* synthetic */ p y() {
        return super.y();
    }
}
