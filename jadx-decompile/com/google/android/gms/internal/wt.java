package com.google.android.gms.internal;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@aaa
class wt {
    final AdRequestParcel a;
    final String b;
    final int c;

    wt(AdRequestParcel adRequestParcel, String str, int i) {
        this.a = adRequestParcel;
        this.b = str;
        this.c = i;
    }

    wt(wr wrVar) {
        this(wrVar.a(), wrVar.c(), wrVar.b());
    }

    static wt a(String str) {
        String[] split = str.split("\u0000");
        if (split.length != 3) {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
        Parcel obtain = Parcel.obtain();
        try {
            String str2 = new String(Base64.decode(split[0], 0), "UTF-8");
            int parseInt = Integer.parseInt(split[1]);
            byte[] decode = Base64.decode(split[2], 0);
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            wt wtVar = new wt((AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(obtain), str2, parseInt);
            obtain.recycle();
            return wtVar;
        } catch (Throwable th) {
            obtain.recycle();
        }
    }

    String a() {
        Parcel obtain = Parcel.obtain();
        String encodeToString;
        try {
            encodeToString = Base64.encodeToString(this.b.getBytes("UTF-8"), 0);
            String num = Integer.toString(this.c);
            this.a.writeToParcel(obtain, 0);
            String encodeToString2 = Base64.encodeToString(obtain.marshall(), 0);
            encodeToString = new StringBuilder(((String.valueOf(encodeToString).length() + 2) + String.valueOf(num).length()) + String.valueOf(encodeToString2).length()).append(encodeToString).append("\u0000").append(num).append("\u0000").append(encodeToString2).toString();
            return encodeToString;
        } catch (UnsupportedEncodingException e) {
            encodeToString = "QueueSeed encode failed because UTF-8 is not available.";
            b.b(encodeToString);
            return "";
        } finally {
            obtain.recycle();
        }
    }
}
