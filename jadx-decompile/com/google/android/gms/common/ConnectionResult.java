package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.iid.a;
import com.tencent.mm.sdk.message.RMsgInfoDB;
import com.xiaomi.market.sdk.j;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Creator<ConnectionResult> CREATOR = new i();
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 13;
    public static final int n = 14;
    public static final int o = 15;
    public static final int p = 16;
    public static final int q = 17;
    public static final int r = 18;
    public static final int s = 19;
    public static final int t = 20;
    @Deprecated
    public static final int u = 1500;
    public static final ConnectionResult v = new ConnectionResult(0);
    final int w;
    private final int x;
    private final PendingIntent y;
    private final String z;

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.w = i;
        this.x = i2;
        this.y = pendingIntent;
        this.z = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    static String a(int i) {
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            case 13:
                return "CANCELED";
            case 14:
                return a.b;
            case 15:
                return "INTERRUPTED";
            case 16:
                return "API_UNAVAILABLE";
            case 17:
                return "SIGN_IN_FAILED";
            case 18:
                return "SERVICE_UPDATING";
            case 19:
                return "SERVICE_MISSING_PERMISSION";
            case 20:
                return "RESTRICTED_PROFILE";
            case 21:
                return "API_VERSION_UPDATE_REQUIRED";
            case 42:
                return "UPDATE_ANDROID_WEAR";
            case 99:
                return "UNFINISHED";
            case 1500:
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            default:
                return "UNKNOWN_ERROR_CODE(" + i + ")";
        }
    }

    public void a(Activity activity, int i) {
        if (a()) {
            activity.startIntentSenderForResult(this.y.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public boolean a() {
        return (this.x == 0 || this.y == null) ? false : true;
    }

    public boolean b() {
        return this.x == 0;
    }

    public int c() {
        return this.x;
    }

    @Nullable
    public PendingIntent d() {
        return this.y;
    }

    @Nullable
    public String e() {
        return this.z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.x == connectionResult.x && c.a(this.y, connectionResult.y) && c.a(this.z, connectionResult.z);
    }

    public int hashCode() {
        return c.a(Integer.valueOf(this.x), this.y, this.z);
    }

    public String toString() {
        return c.a((Object) this).a("statusCode", a(this.x)).a(j.ai, this.y).a(RMsgInfoDB.TABLE, this.z).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
