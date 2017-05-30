package com.google.android.gms.appinvite;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.internal.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public final class c {
    private static final String[] a = new String[]{"jpg", "jpeg", "png"};

    public static final class a {
        public static final int a = 100;
        public static final int b = 512000;
        public static final int c = 2;
        public static final int d = 20;
        private final Intent e = new Intent("com.google.android.gms.appinvite.ACTION_APP_INVITE");
        private String f;
        private String g;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
            public static final int a = 1;
            public static final int b = 2;
        }

        public a(@NonNull CharSequence charSequence) {
            d.a((Object) charSequence);
            this.e.putExtra("com.google.android.gms.appinvite.TITLE", charSequence);
            this.e.setPackage("com.google.android.gms");
        }

        public Intent a() {
            if (!TextUtils.isEmpty(this.f)) {
                d.a(this.g, (Object) "Email html content must be set when email subject is set.");
                d.b(this.e.getData() == null, "Custom image must not be set when email html content is set.");
                d.b(TextUtils.isEmpty(this.e.getCharSequenceExtra("com.google.android.gms.appinvite.BUTTON_TEXT")), "Call to action text must not be set when email html content is set.");
                this.e.putExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT", this.f);
                this.e.putExtra("com.google.android.gms.appinvite.EMAIL_CONTENT", this.g);
            } else if (!TextUtils.isEmpty(this.g)) {
                throw new IllegalArgumentException("Email subject must be set when email html content is set.");
            }
            return this.e;
        }

        public a a(int i) {
            this.e.putExtra("com.google.android.gms.appinvite.appMinimumVersionCode", i);
            return this;
        }

        public a a(int i, String str) {
            switch (i) {
                case 1:
                    this.e.putExtra("com.google.android.gms.appinvite.iosTargetApplication", str);
                    break;
                case 2:
                    this.e.putExtra("com.google.android.gms.appinvite.androidTargetApplication", str);
                    break;
                default:
                    throw new IllegalArgumentException("targetPlatform must be either PROJECT_PLATFORM_IOS or PROJECT_PLATFORM_ANDROID.");
            }
            return this;
        }

        public a a(Account account) {
            if (account == null || !"com.google".equals(account.type)) {
                this.e.removeExtra("com.google.android.gms.appinvite.ACCOUNT_NAME");
            } else {
                this.e.putExtra("com.google.android.gms.appinvite.ACCOUNT_NAME", account);
            }
            return this;
        }

        public a a(Uri uri) {
            if (uri != null) {
                this.e.putExtra("com.google.android.gms.appinvite.DEEP_LINK_URL", uri);
            } else {
                this.e.removeExtra("com.google.android.gms.appinvite.DEEP_LINK_URL");
            }
            return this;
        }

        public a a(CharSequence charSequence) {
            if (charSequence == null || charSequence.length() <= 100) {
                this.e.putExtra("com.google.android.gms.appinvite.MESSAGE", charSequence);
                return this;
            }
            throw new IllegalArgumentException(String.format("Message must be %d chars or less.", new Object[]{Integer.valueOf(100)}));
        }

        public a a(String str) {
            this.f = str;
            return this;
        }

        public a a(Map<String, String> map) {
            if (map != null) {
                this.e.putExtra("com.google.android.gms.appinvite.REFERRAL_PARAMETERS_URI", c.b((Map) map));
            } else {
                this.e.removeExtra("com.google.android.gms.appinvite.REFERRAL_PARAMETERS_URI");
            }
            return this;
        }

        public a b(Uri uri) {
            boolean z = false;
            d.a((Object) uri);
            d.b(uri.isAbsolute(), "Image uri is not an absolute uri. Did you forget to add a scheme to the Uri?");
            String toLowerCase = uri.getScheme().toLowerCase();
            boolean z2 = toLowerCase.equals("android.resource") || toLowerCase.equals("content") || toLowerCase.equals(UriUtil.LOCAL_FILE_SCHEME);
            boolean z3 = z2 || toLowerCase.equals(UriUtil.HTTP_SCHEME) || toLowerCase.equals(UriUtil.HTTPS_SCHEME);
            d.b(z3, "Image uri must be a content URI with scheme \"android.resource\", \"content\" or \"file\", or a network url with scheme \"http\" or \"https\".");
            if (!z2) {
                String uri2 = uri.toString();
                uri2 = uri2.substring(uri2.lastIndexOf("/") + 1, uri2.length());
                uri2 = uri2 == null ? null : uri2.lastIndexOf(".") == -1 ? null : uri2.substring(uri2.lastIndexOf(".") + 1, uri2.length()).toLowerCase();
                if (TextUtils.isEmpty(uri2) || c.b(uri2)) {
                    z = true;
                }
                d.b(z, String.valueOf(uri2).concat(" images are not supported. Only jpg, jpeg, or png images are supported."));
            }
            this.e.setData(uri.buildUpon().scheme(toLowerCase).build());
            if (z2) {
                this.e.addFlags(1);
            }
            return this;
        }

        public a b(CharSequence charSequence) {
            if (charSequence == null || charSequence.length() < 2 || charSequence.length() > 20) {
                throw new IllegalArgumentException(String.format("Text must be between %d and %d chars in length.", new Object[]{Integer.valueOf(2), Integer.valueOf(20)}));
            }
            this.e.putExtra("com.google.android.gms.appinvite.BUTTON_TEXT", charSequence);
            return this;
        }

        public a b(String str) {
            if (str == null || str.getBytes().length <= 512000) {
                this.g = str;
                return this;
            }
            throw new IllegalArgumentException(String.format("Email html content must be %d bytes or less.", new Object[]{Integer.valueOf(512000)}));
        }

        public a c(String str) {
            this.e.putExtra("com.google.android.gms.appinvite.GOOGLE_ANALYTICS_TRACKING_ID", str);
            return this;
        }
    }

    private c() {
    }

    public static String[] a(int i, @NonNull Intent intent) {
        return i == -1 ? intent.getStringArrayExtra("com.google.android.gms.appinvite.RESULT_INVITATION_IDS") : null;
    }

    private static Bundle b(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    private static boolean b(String str) {
        for (String equals : a) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
