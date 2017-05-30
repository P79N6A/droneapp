package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Session;
import java.util.Collections;
import java.util.List;

public class SessionStopResult extends AbstractSafeParcelable implements m {
    public static final Creator<SessionStopResult> CREATOR = new m();
    private final int a;
    private final Status b;
    private final List<Session> c;

    SessionStopResult(int i, Status status, List<Session> list) {
        this.a = i;
        this.b = status;
        this.c = Collections.unmodifiableList(list);
    }

    public SessionStopResult(Status status, List<Session> list) {
        this.a = 3;
        this.b = status;
        this.c = Collections.unmodifiableList(list);
    }

    public static SessionStopResult a(Status status) {
        return new SessionStopResult(status, Collections.emptyList());
    }

    private boolean a(SessionStopResult sessionStopResult) {
        return this.b.equals(sessionStopResult.b) && c.a(this.c, sessionStopResult.c);
    }

    public Status a() {
        return this.b;
    }

    public List<Session> b() {
        return this.c;
    }

    int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SessionStopResult) && a((SessionStopResult) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c});
    }

    public String toString() {
        return c.a(this).a("status", this.b).a("sessions", this.c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel, i);
    }
}
