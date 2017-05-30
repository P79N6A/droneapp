package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.SessionDataSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SessionReadResult extends AbstractSafeParcelable implements m {
    public static final Creator<SessionReadResult> CREATOR = new l();
    private final int a;
    private final List<Session> b;
    private final List<SessionDataSet> c;
    private final Status d;

    SessionReadResult(int i, List<Session> list, List<SessionDataSet> list2, Status status) {
        this.a = i;
        this.b = list;
        this.c = Collections.unmodifiableList(list2);
        this.d = status;
    }

    public SessionReadResult(List<Session> list, List<SessionDataSet> list2, Status status) {
        this.a = 3;
        this.b = list;
        this.c = Collections.unmodifiableList(list2);
        this.d = status;
    }

    public static SessionReadResult a(Status status) {
        return new SessionReadResult(new ArrayList(), new ArrayList(), status);
    }

    private boolean a(SessionReadResult sessionReadResult) {
        return this.d.equals(sessionReadResult.d) && c.a(this.b, sessionReadResult.b) && c.a(this.c, sessionReadResult.c);
    }

    public Status a() {
        return this.d;
    }

    public List<DataSet> a(Session session) {
        d.b(this.b.contains(session), "Attempting to read data for session %s which was not returned", new Object[]{session});
        List<DataSet> arrayList = new ArrayList();
        for (SessionDataSet sessionDataSet : this.c) {
            if (c.a(session, sessionDataSet.a())) {
                arrayList.add(sessionDataSet.b());
            }
        }
        return arrayList;
    }

    public List<DataSet> a(Session session, DataType dataType) {
        d.b(this.b.contains(session), "Attempting to read data for session %s which was not returned", new Object[]{session});
        List<DataSet> arrayList = new ArrayList();
        for (SessionDataSet sessionDataSet : this.c) {
            if (c.a(session, sessionDataSet.a()) && dataType.equals(sessionDataSet.b().c())) {
                arrayList.add(sessionDataSet.b());
            }
        }
        return arrayList;
    }

    public List<Session> b() {
        return this.b;
    }

    public List<SessionDataSet> c() {
        return this.c;
    }

    int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SessionReadResult) && a((SessionReadResult) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.d, this.b, this.c});
    }

    public String toString() {
        return c.a(this).a("status", this.d).a("sessions", this.b).a("sessionDataSets", this.c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
