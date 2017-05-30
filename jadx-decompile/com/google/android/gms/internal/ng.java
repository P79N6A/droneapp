package com.google.android.gms.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.g.i;
import com.google.firebase.auth.o;
import com.google.firebase.b;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ng {
    public static long a(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        String replaceAll = str.replaceAll("Z$", "-0000");
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(replaceAll).getTime();
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "StorageUtil";
            String str3 = "unable to parse datetime:";
            String valueOf = String.valueOf(replaceAll);
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), th);
            return 0;
        }
    }

    @Nullable
    public static Uri a(@NonNull b bVar, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.toLowerCase().startsWith("gs://")) {
            String str2 = "gs://";
            String valueOf = String.valueOf(nc.a(nc.c(str.substring(5))));
            return Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        Uri parse = Uri.parse(str);
        Object toLowerCase = parse.getScheme().toLowerCase();
        if (a(toLowerCase, UriUtil.HTTP_SCHEME) || a(toLowerCase, UriUtil.HTTPS_SCHEME)) {
            try {
                int indexOf = parse.getAuthority().toLowerCase().indexOf(b(bVar));
                valueOf = nc.b(parse.getEncodedPath());
                if (indexOf == 0 && valueOf.startsWith("/")) {
                    int indexOf2 = valueOf.indexOf("/b/", 0);
                    indexOf = valueOf.indexOf("/", indexOf2 + 3);
                    int indexOf3 = valueOf.indexOf("/o/", 0);
                    if (indexOf2 == -1 || indexOf == -1) {
                        Log.w("StorageUtil", "Only URLs to firebasestorage.googleapis.com are supported.");
                        throw new IllegalArgumentException("Only URLs to firebasestorage.googleapis.com are supported.");
                    }
                    str2 = valueOf.substring(indexOf2 + 3, indexOf);
                    valueOf = indexOf3 != -1 ? valueOf.substring(indexOf3 + 3) : "";
                } else if (indexOf > 1) {
                    str2 = parse.getAuthority().substring(0, indexOf - 1);
                } else {
                    Log.w("StorageUtil", "Only URLs to firebasestorage.googleapis.com are supported.");
                    throw new IllegalArgumentException("Only URLs to firebasestorage.googleapis.com are supported.");
                }
                d.a(str2, "No bucket specified");
                return new Builder().scheme("gs").authority(str2).encodedPath(valueOf).build();
            } catch (RemoteException e) {
                throw new UnsupportedEncodingException("Could not parse Url because the Storage network layer did not load");
            }
        }
        str2 = "StorageUtil";
        String str3 = "FirebaseStorage is unable to support the scheme:";
        valueOf = String.valueOf(toLowerCase);
        Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        throw new IllegalArgumentException("Uri scheme");
    }

    @Nullable
    public static String a(b bVar) {
        Object a;
        String valueOf;
        try {
            a = ((o) i.a(bVar.b(false), NotificationOptions.b, TimeUnit.MILLISECONDS)).a();
            if (!TextUtils.isEmpty(a)) {
                return a;
            }
            Log.w("StorageUtil", "no auth token for request");
            return null;
        } catch (ExecutionException e) {
            a = e;
            valueOf = String.valueOf(a);
            Log.e("StorageUtil", new StringBuilder(String.valueOf(valueOf).length() + 20).append("error getting token ").append(valueOf).toString());
            return null;
        } catch (InterruptedException e2) {
            a = e2;
            valueOf = String.valueOf(a);
            Log.e("StorageUtil", new StringBuilder(String.valueOf(valueOf).length() + 20).append("error getting token ").append(valueOf).toString());
            return null;
        } catch (TimeoutException e3) {
            a = e3;
            valueOf = String.valueOf(a);
            Log.e("StorageUtil", new StringBuilder(String.valueOf(valueOf).length() + 20).append("error getting token ").append(valueOf).toString());
            return null;
        }
    }

    public static boolean a(@Nullable Object obj, @Nullable Object obj2) {
        return c.a(obj, obj2);
    }

    private static String b(b bVar) {
        return nj.a(bVar).a();
    }
}
