package com.baidu.tts.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.DisplayMetrics;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.zip.GZIPOutputStream;

public class d {
    public static long a(Context context) {
        return context.getSharedPreferences("tts", 0).getLong("last_upload_stat_time", 0);
    }

    public static String a() {
        return "1.0.0-20140804";
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return new String(Base64.encode(bArr, 0, bArr.length, 0), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void a(Context context, int i) {
        Editor edit = context.getSharedPreferences("tts", 0).edit();
        edit.putInt("last_download_stat_period", i);
        edit.commit();
    }

    public static void a(Context context, long j) {
        Editor edit = context.getSharedPreferences("tts", 0).edit();
        edit.putLong("last_upload_stat_time", j);
        edit.commit();
    }

    public static byte[] a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("utf-8"));
            gZIPOutputStream.close();
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return toByteArray;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static int b(Context context) {
        return context.getSharedPreferences("tts", 0).getInt("last_download_stat_period", 0);
    }

    public static String b() {
        return "Android";
    }

    private static String b(byte[] bArr) {
        try {
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(x509Certificate.getEncoded());
            return c(instance.digest());
        } catch (CertificateException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String c() {
        return "离线TTS SDK";
    }

    public static String c(Context context) {
        return h(context);
    }

    private static String c(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String toHexString = Integer.toHexString(b & 255);
            if (toHexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(toHexString);
        }
        return stringBuffer.toString();
    }

    public static String d(Context context) {
        return b() + "&" + Build.MODEL + "&" + VERSION.RELEASE + "&" + VERSION.SDK_INT + "&" + e(context);
    }

    @SuppressLint({"DefaultLocale"})
    public static int e(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return (activeNetworkInfo == null || !"wifi".equals(activeNetworkInfo.getTypeName().toLowerCase())) ? 3 : 1;
    }

    public static String f(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        return i + "*" + displayMetrics.heightPixels;
    }

    public static String g(Context context) {
        String str = null;
        try {
            str = b(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    private static String h(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo = null;
        try {
            packageManager = context.getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            } catch (NameNotFoundException e) {
            }
        } catch (NameNotFoundException e2) {
            Object obj = applicationInfo;
        }
        return (String) packageManager.getApplicationLabel(applicationInfo);
    }
}
