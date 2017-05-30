package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.alq;
import com.google.android.gms.internal.alq.a;
import java.util.concurrent.TimeUnit;

public class SessionStartRequest extends AbstractSafeParcelable {
    public static final Creator<SessionStartRequest> CREATOR = new h();
    private final int a;
    private final Session b;
    private final alq c;

    SessionStartRequest(int i, Session session, IBinder iBinder) {
        this.a = i;
        this.b = session;
        this.c = a.a(iBinder);
    }

    public SessionStartRequest(Session session, alq com_google_android_gms_internal_alq) {
        d.b(session.a(TimeUnit.MILLISECONDS) < System.currentTimeMillis(), "Cannot start a session in the future");
        d.b(session.b(), "Cannot start a session which has already ended");
        this.a = 3;
        this.b = session;
        this.c = com_google_android_gms_internal_alq;
    }

    private boolean a(SessionStartRequest sessionStartRequest) {
        return c.a(this.b, sessionStartRequest.b);
    }

    public Session a() {
        return this.b;
    }

    public IBinder b() {
        return this.c == null ? null : this.c.asBinder();
    }

    int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof SessionStartRequest) && a((SessionStartRequest) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.b});
    }

    public String toString() {
        return c.a(this).a("session", this.b).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
