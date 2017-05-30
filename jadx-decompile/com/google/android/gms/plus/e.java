package com.google.android.gms.plus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.plus.a.a.a;
import com.google.android.gms.plus.internal.model.people.PersonEntity;

public final class e {
    public static final String a = "com.google.android.apps.plus.CONTENT_URL";
    public static final String b = "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID";
    public static final String c = "com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA";
    public static final String d = "title";
    public static final String e = "description";
    public static final String f = "thumbnailUrl";
    public static final String g = "com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST";
    public static final String h = "com.google.android.apps.plus.CALL_TO_ACTION";
    public static final String i = "label";
    public static final String j = "url";
    public static final String k = "deepLinkId";
    public static final String l = "com.google.android.apps.plus.SENDER_ID";
    public static final String m = "deep_link_id";

    @Deprecated
    protected e() {
        throw new AssertionError();
    }

    public static Bundle a(String str, String str2, Uri uri) {
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putString("description", str2);
        if (uri != null) {
            bundle.putString(f, uri.toString());
        }
        return bundle;
    }

    public static a a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("MinimalPerson ID must not be empty.");
        } else if (!TextUtils.isEmpty(str2)) {
            return new PersonEntity(str2, str, null, 0, null);
        } else {
            throw new IllegalArgumentException("Display name must not be empty.");
        }
    }

    public static String a(Intent intent) {
        return (intent == null || intent.getData() == null) ? null : intent.getData().getQueryParameter(m);
    }

    protected static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e("GooglePlusPlatform", "The provided deep-link ID is empty.");
            return false;
        } else if (!str.contains(" ")) {
            return true;
        } else {
            Log.e("GooglePlusPlatform", "Spaces are not allowed in deep-link IDs.");
            return false;
        }
    }
}
