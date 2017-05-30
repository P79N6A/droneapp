package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.R;
import com.google.android.gms.ads.d;
import com.google.android.gms.internal.aaa;

@aaa
public final class zzk {
    private final d[] a;
    private final String b;

    public zzk(Context context, AttributeSet attributeSet) {
        Object obj = 1;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.AdsAttrs);
        String string = obtainAttributes.getString(R.styleable.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(R.styleable.AdsAttrs_adSizes);
        Object obj2 = !TextUtils.isEmpty(string) ? 1 : null;
        if (TextUtils.isEmpty(string2)) {
            obj = null;
        }
        if (obj2 != null && r1 == null) {
            this.a = a(string);
        } else if (obj2 == null && r1 != null) {
            this.a = a(string2);
        } else if (obj2 != null) {
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        this.b = obtainAttributes.getString(R.styleable.AdsAttrs_adUnitId);
        if (TextUtils.isEmpty(this.b)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static d[] a(String str) {
        String[] split = str.split("\\s*,\\s*");
        d[] dVarArr = new d[split.length];
        for (int i = 0; i < split.length; i++) {
            String str2;
            String valueOf;
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    dVarArr[i] = new d("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException e) {
                    str2 = "Could not parse XML attribute \"adSize\": ";
                    valueOf = String.valueOf(trim);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            } else if ("BANNER".equals(trim)) {
                dVarArr[i] = d.c;
            } else if ("LARGE_BANNER".equals(trim)) {
                dVarArr[i] = d.e;
            } else if ("FULL_BANNER".equals(trim)) {
                dVarArr[i] = d.d;
            } else if ("LEADERBOARD".equals(trim)) {
                dVarArr[i] = d.f;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                dVarArr[i] = d.g;
            } else if ("SMART_BANNER".equals(trim)) {
                dVarArr[i] = d.i;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                dVarArr[i] = d.h;
            } else if ("FLUID".equals(trim)) {
                dVarArr[i] = d.j;
            } else {
                str2 = "Could not parse XML attribute \"adSize\": ";
                valueOf = String.valueOf(trim);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        }
        if (dVarArr.length != 0) {
            return dVarArr;
        }
        str2 = "Could not parse XML attribute \"adSize\": ";
        valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public String a() {
        return this.b;
    }

    public d[] a(boolean z) {
        if (z || this.a.length == 1) {
            return this.a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
