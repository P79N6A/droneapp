package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.R;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final q CREATOR = new q();
    public final LatLng a;
    public final LatLng b;
    private final int c;

    public static final class a {
        private double a = MediaQueueItem.b;
        private double b = Double.NEGATIVE_INFINITY;
        private double c = Double.NaN;
        private double d = Double.NaN;

        private boolean a(double d) {
            boolean z = false;
            if (this.c <= this.d) {
                return this.c <= d && d <= this.d;
            } else {
                if (this.c <= d || d <= this.d) {
                    z = true;
                }
                return z;
            }
        }

        public a a(LatLng latLng) {
            this.a = Math.min(this.a, latLng.a);
            this.b = Math.max(this.b, latLng.a);
            double d = latLng.b;
            if (Double.isNaN(this.c)) {
                this.c = d;
                this.d = d;
            } else if (!a(d)) {
                if (LatLngBounds.c(this.c, d) < LatLngBounds.d(this.d, d)) {
                    this.c = d;
                } else {
                    this.d = d;
                }
            }
            return this;
        }

        public LatLngBounds a() {
            d.a(!Double.isNaN(this.c), "no included points");
            return new LatLngBounds(new LatLng(this.a, this.c), new LatLng(this.b, this.d));
        }
    }

    LatLngBounds(int i, LatLng latLng, LatLng latLng2) {
        d.a(latLng, "null southwest");
        d.a(latLng2, "null northeast");
        d.b(latLng2.a >= latLng.a, "southern latitude exceeds northern latitude (%s > %s)", new Object[]{Double.valueOf(latLng.a), Double.valueOf(latLng2.a)});
        this.c = i;
        this.a = latLng;
        this.b = latLng2;
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        this(1, latLng, latLng2);
    }

    public static LatLngBounds a(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        Float valueOf = obtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(obtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        Float valueOf2 = obtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(obtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        Float valueOf3 = obtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(obtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        Float valueOf4 = obtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(obtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        return (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) ? null : new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
    }

    private boolean a(double d) {
        return this.a.a <= d && d <= this.b.a;
    }

    public static a b() {
        return new a();
    }

    private boolean b(double d) {
        boolean z = false;
        if (this.a.b <= this.b.b) {
            return this.a.b <= d && d <= this.b.b;
        } else {
            if (this.a.b <= d || d <= this.b.b) {
                z = true;
            }
            return z;
        }
    }

    private static double c(double d, double d2) {
        return ((d - d2) + 360.0d) % 360.0d;
    }

    private static double d(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    int a() {
        return this.c;
    }

    public boolean a(LatLng latLng) {
        return a(latLng.a) && b(latLng.b);
    }

    public LatLngBounds b(LatLng latLng) {
        double min = Math.min(this.a.a, latLng.a);
        double max = Math.max(this.b.a, latLng.a);
        double d = this.b.b;
        double d2 = this.a.b;
        double d3 = latLng.b;
        if (b(d3)) {
            d3 = d2;
            d2 = d;
        } else if (c(d2, d3) < d(d, d3)) {
            d2 = d;
        } else {
            double d4 = d2;
            d2 = d3;
            d3 = d4;
        }
        return new LatLngBounds(new LatLng(min, d3), new LatLng(max, d2));
    }

    public LatLng c() {
        double d = (this.a.a + this.b.a) / 2.0d;
        double d2 = this.b.b;
        double d3 = this.a.b;
        return new LatLng(d, d3 <= d2 ? (d2 + d3) / 2.0d : ((d2 + 360.0d) + d3) / 2.0d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b);
    }

    public int hashCode() {
        return c.a(new Object[]{this.a, this.b});
    }

    public String toString() {
        return c.a(this).a("southwest", this.a).a("northeast", this.b).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
