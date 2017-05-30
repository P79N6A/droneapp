package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;

@aaa
public class a {
    public boolean a(Context context, Intent intent, p pVar) {
        try {
            String str = "Launching an intent: ";
            String valueOf = String.valueOf(intent.toURI());
            abr.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            u.e().a(context, intent);
            if (pVar != null) {
                pVar.m();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            b.d(e.getMessage());
            return false;
        }
    }

    public boolean a(Context context, AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, p pVar) {
        if (adLauncherIntentInfoParcel == null) {
            b.d("No intent data for launcher overlay.");
            return false;
        } else if (adLauncherIntentInfoParcel.i != null) {
            return a(context, adLauncherIntentInfoParcel.i, pVar);
        } else {
            Intent intent = new Intent();
            if (TextUtils.isEmpty(adLauncherIntentInfoParcel.c)) {
                b.d("Open GMSG did not contain a URL.");
                return false;
            }
            if (TextUtils.isEmpty(adLauncherIntentInfoParcel.d)) {
                intent.setData(Uri.parse(adLauncherIntentInfoParcel.c));
            } else {
                intent.setDataAndType(Uri.parse(adLauncherIntentInfoParcel.c), adLauncherIntentInfoParcel.d);
            }
            intent.setAction("android.intent.action.VIEW");
            if (!TextUtils.isEmpty(adLauncherIntentInfoParcel.e)) {
                intent.setPackage(adLauncherIntentInfoParcel.e);
            }
            if (!TextUtils.isEmpty(adLauncherIntentInfoParcel.f)) {
                String[] split = adLauncherIntentInfoParcel.f.split("/", 2);
                if (split.length < 2) {
                    String str = "Could not parse component name from open GMSG: ";
                    String valueOf = String.valueOf(adLauncherIntentInfoParcel.f);
                    b.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    return false;
                }
                intent.setClassName(split[0], split[1]);
            }
            Object obj = adLauncherIntentInfoParcel.g;
            if (!TextUtils.isEmpty(obj)) {
                int parseInt;
                try {
                    parseInt = Integer.parseInt(obj);
                } catch (NumberFormatException e) {
                    b.d("Could not parse intent flags.");
                    parseInt = 0;
                }
                intent.addFlags(parseInt);
            }
            return a(context, intent, pVar);
        }
    }
}
