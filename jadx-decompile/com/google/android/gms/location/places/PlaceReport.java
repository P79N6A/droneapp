package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.c.a;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<PlaceReport> CREATOR = new w();
    final int a;
    private final String b;
    private final String c;
    private final String d;

    PlaceReport(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public static PlaceReport a(String str, String str2) {
        return a(str, str2, "unknown");
    }

    public static PlaceReport a(String str, String str2, String str3) {
        d.a(str);
        d.a(str2);
        d.a(str3);
        d.b(a(str3), "Invalid source");
        return new PlaceReport(1, str, str2, str3);
    }

    private static boolean a(String str) {
        boolean z = true;
        switch (str.hashCode()) {
            case -1436706272:
                if (str.equals("inferredGeofencing")) {
                    z = true;
                    break;
                }
                break;
            case -1194968642:
                if (str.equals("userReported")) {
                    z = true;
                    break;
                }
                break;
            case -284840886:
                if (str.equals("unknown")) {
                    z = false;
                    break;
                }
                break;
            case -262743844:
                if (str.equals("inferredReverseGeocoding")) {
                    z = true;
                    break;
                }
                break;
            case 1164924125:
                if (str.equals("inferredSnappedToRoad")) {
                    z = true;
                    break;
                }
                break;
            case 1287171955:
                if (str.equals("inferredRadioSignals")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
            case true:
            case true:
            case true:
            case true:
            case true:
                return true;
            default:
                return false;
        }
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return c.a(this.b, placeReport.b) && c.a(this.c, placeReport.c) && c.a(this.d, placeReport.d);
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c, this.d});
    }

    public String toString() {
        a a = c.a(this);
        a.a("placeId", this.b);
        a.a("tag", this.c);
        if (!"unknown".equals(this.d)) {
            a.a("source", this.d);
        }
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        w.a(this, parcel, i);
    }
}
