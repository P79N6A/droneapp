package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alq;
import com.google.android.gms.internal.alq.a;

public class SessionUnregistrationRequest extends AbstractSafeParcelable {
    public static final Creator<SessionUnregistrationRequest> CREATOR = new j();
    private final int a;
    private final PendingIntent b;
    private final alq c;

    SessionUnregistrationRequest(int i, PendingIntent pendingIntent, IBinder iBinder) {
        this.a = i;
        this.b = pendingIntent;
        this.c = a.a(iBinder);
    }

    public SessionUnregistrationRequest(PendingIntent pendingIntent, alq com_google_android_gms_internal_alq) {
        this.a = 5;
        this.b = pendingIntent;
        this.c = com_google_android_gms_internal_alq;
    }

    private boolean a(SessionUnregistrationRequest sessionUnregistrationRequest) {
        return c.a(this.b, sessionUnregistrationRequest.b);
    }

    public PendingIntent a() {
        return this.b;
    }

    public IBinder b() {
        return this.c == null ? null : this.c.asBinder();
    }

    int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SessionUnregistrationRequest) && a((SessionUnregistrationRequest) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.b});
    }

    public String toString() {
        return c.a(this).a("pendingIntent", this.b).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
