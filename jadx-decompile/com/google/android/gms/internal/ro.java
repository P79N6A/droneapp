package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.mm.sdk.platformtools.LocaleUtil;
import com.xiaomi.mipush.sdk.Constants;

public class ro {
    private static final String[] e = new String[]{"/aclk", "/pcs/click"};
    private String a = "googleads.g.doubleclick.net";
    private String b = "/pagead/ads";
    private String c = "ad.doubleclick.net";
    private String[] d = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private oq f;

    public ro(oq oqVar) {
        this.f = oqVar;
    }

    private Uri a(Uri uri, Context context, String str, boolean z, View view) {
        try {
            boolean b = b(uri);
            if (b) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new rp("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter(LocaleUtil.MALAY) != null) {
                throw new rp("Query parameter already exists: ms");
            }
            String a = z ? this.f.a(context, str, view) : this.f.a(context);
            return b ? b(uri, "dc_ms", a) : a(uri, LocaleUtil.MALAY, a);
        } catch (UnsupportedOperationException e) {
            throw new rp("Provided Uri is not in a valid state");
        }
    }

    private Uri a(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl");
        }
        return indexOf != -1 ? Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str).append("=").append(str2).append("&").append(uri2.substring(indexOf + 1)).toString()) : uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private Uri b(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf(";adurl");
        if (indexOf != -1) {
            return Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str).append("=").append(str2).append(";").append(uri2.substring(indexOf + 1)).toString());
        }
        String encodedPath = uri.getEncodedPath();
        int indexOf2 = uri2.indexOf(encodedPath);
        return Uri.parse(new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2)).append(";").append(str).append("=").append(str2).append(";").append(uri2.substring(encodedPath.length() + indexOf2)).toString());
    }

    public Uri a(Uri uri, Context context) {
        return a(uri, context, null, false, null);
    }

    public Uri a(Uri uri, Context context, View view) {
        try {
            return a(uri, context, uri.getQueryParameter("ai"), true, view);
        } catch (UnsupportedOperationException e) {
            throw new rp("Provided Uri is not in a valid state");
        }
    }

    public oq a() {
        return this.f;
    }

    public void a(MotionEvent motionEvent) {
        this.f.a(motionEvent);
    }

    public void a(String str) {
        this.d = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
    }

    public void a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public boolean a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.a) && uri.getPath().equals(this.b);
        } catch (NullPointerException e) {
            return false;
        }
    }

    @Deprecated
    public Uri b(Uri uri, Context context) {
        return a(uri, context, null);
    }

    public boolean b(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.c);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public boolean c(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String endsWith : this.d) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public boolean d(Uri uri) {
        if (!c(uri)) {
            return false;
        }
        for (String endsWith : e) {
            if (uri.getPath().endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }
}
