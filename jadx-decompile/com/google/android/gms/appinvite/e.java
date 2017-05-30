package com.google.android.gms.appinvite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class e {
    private e() {
    }

    @Deprecated
    public static Intent a(Intent intent, Intent intent2) {
        Bundle e = e(intent);
        if (!(e == null || intent2 == null)) {
            intent2.putExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE", e);
        }
        return intent2;
    }

    @Deprecated
    public static Intent a(String str, String str2, Intent intent) {
        return intent == null ? null : intent.putExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE", a(str, str2, false));
    }

    private static Bundle a(String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.appinvite.INVITATION_ID", str);
        if (str2 != null) {
            bundle.putString("com.google.android.gms.appinvite.DEEP_LINK", str2);
        }
        bundle.putBoolean("com.google.android.gms.appinvite.OPENED_FROM_PLAY_STORE", z);
        return bundle;
    }

    public static boolean a(Intent intent) {
        return (intent == null || intent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE") == null) ? false : true;
    }

    public static boolean b(Intent intent) {
        return a(intent) && intent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE").getBoolean("com.google.android.gms.appinvite.OPENED_FROM_PLAY_STORE", false);
    }

    public static String c(Intent intent) {
        if (intent != null) {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE");
            if (bundleExtra != null) {
                return bundleExtra.getString("com.google.android.gms.appinvite.INVITATION_ID");
            }
        }
        return null;
    }

    public static String d(Intent intent) {
        if (intent != null) {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE");
            if (bundleExtra != null) {
                return bundleExtra.getString("com.google.android.gms.appinvite.DEEP_LINK");
            }
        }
        return null;
    }

    private static Bundle e(Intent intent) {
        if (intent == null || !intent.getAction().equals("com.android.vending.INSTALL_REFERRER") || intent.getStringExtra("referrer") == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("referrer");
        String decode;
        String str;
        try {
            decode = URLDecoder.decode(stringExtra, "UTF-8");
            str = "s://a.b.c?";
            stringExtra = String.valueOf(decode);
            Uri parse = Uri.parse(stringExtra.length() != 0 ? str.concat(stringExtra) : new String(str));
            str = parse.getQueryParameter("invitation_id");
            stringExtra = parse.getQueryParameter(com.google.android.gms.plus.e.m);
            if (str != null || stringExtra != null) {
                return a(str, stringExtra, true);
            }
            str = "AppInviteRef";
            String str2 = "Missing  Referrer query params: ";
            stringExtra = String.valueOf(decode);
            Log.w(str, stringExtra.length() != 0 ? str2.concat(stringExtra) : new String(str2));
            return null;
        } catch (UnsupportedEncodingException e) {
            decode = "AppInviteRef";
            str = "Error parsing Play Store referrer URL: ";
            stringExtra = String.valueOf(stringExtra);
            Log.e(decode, stringExtra.length() != 0 ? str.concat(stringExtra) : new String(str));
            return null;
        }
    }
}
