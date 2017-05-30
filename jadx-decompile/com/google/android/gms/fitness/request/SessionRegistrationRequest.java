package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alq;
import com.google.android.gms.internal.alq.a;

public class SessionRegistrationRequest extends AbstractSafeParcelable {
    public static final Creator<SessionRegistrationRequest> CREATOR = new g();
    private final int a;
    private final PendingIntent b;
    private final alq c;
    private final int d;

    SessionRegistrationRequest(int i, PendingIntent pendingIntent, IBinder iBinder, int i2) {
        this.a = i;
        this.b = pendingIntent;
        this.c = iBinder == null ? null : a.a(iBinder);
        this.d = i2;
    }

    public SessionRegistrationRequest(PendingIntent pendingIntent, alq com_google_android_gms_internal_alq, int i) {
        this.a = 6;
        this.b = pendingIntent;
        this.c = com_google_android_gms_internal_alq;
        this.d = i;
    }

    private boolean a(SessionRegistrationRequest sessionRegistrationRequest) {
        return this.d == sessionRegistrationRequest.d && c.a(this.b, sessionRegistrationRequest.b);
    }

    public PendingIntent a() {
        return this.b;
    }

    public IBinder b() {
        return this.c == null ? null : this.c.asBinder();
    }

    public int c() {
        return this.d;
    }

    int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SessionRegistrationRequest) && a((SessionRegistrationRequest) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, Integer.valueOf(this.d)});
    }

    public String toString() {
        return c.a(this).a("pendingIntent", this.b).a("sessionRegistrationOption", Integer.valueOf(this.d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
