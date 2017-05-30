package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Comparator;

public class DetectedActivity extends AbstractSafeParcelable {
    public static final d CREATOR = new d();
    public static final Comparator<DetectedActivity> a = new Comparator<DetectedActivity>() {
        public int a(DetectedActivity detectedActivity, DetectedActivity detectedActivity2) {
            int compareTo = Integer.valueOf(detectedActivity2.b()).compareTo(Integer.valueOf(detectedActivity.b()));
            return compareTo == 0 ? Integer.valueOf(detectedActivity.a()).compareTo(Integer.valueOf(detectedActivity2.a())) : compareTo;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((DetectedActivity) obj, (DetectedActivity) obj2);
        }
    };
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 7;
    public static final int i = 8;
    public static final int[] j = new int[]{9, 10};
    public static final int[] k = new int[]{0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14};
    int l;
    int m;
    private final int n;

    public DetectedActivity(int i, int i2) {
        this.n = 1;
        this.l = i;
        this.m = i2;
    }

    public DetectedActivity(int i, int i2, int i3) {
        this.n = i;
        this.l = i2;
        this.m = i3;
    }

    public static String a(int i) {
        switch (i) {
            case 0:
                return "IN_VEHICLE";
            case 1:
                return "ON_BICYCLE";
            case 2:
                return "ON_FOOT";
            case 3:
                return "STILL";
            case 4:
                return "UNKNOWN";
            case 5:
                return "TILTING";
            case 7:
                return "WALKING";
            case 8:
                return "RUNNING";
            default:
                return Integer.toString(i);
        }
    }

    private int b(int i) {
        return i > 15 ? 4 : i;
    }

    public int a() {
        return b(this.l);
    }

    public int b() {
        return this.m;
    }

    public int c() {
        return this.n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        return this.l == detectedActivity.l && this.m == detectedActivity.m;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.l), Integer.valueOf(this.m)});
    }

    public String toString() {
        String valueOf = String.valueOf(a(a()));
        return new StringBuilder(String.valueOf(valueOf).length() + 48).append("DetectedActivity [type=").append(valueOf).append(", confidence=").append(this.m).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
