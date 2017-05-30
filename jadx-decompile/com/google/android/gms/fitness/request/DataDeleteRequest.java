package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.alq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataDeleteRequest extends AbstractSafeParcelable {
    public static final Creator<DataDeleteRequest> CREATOR = new r();
    private final int a;
    private final long b;
    private final long c;
    private final List<DataSource> d;
    private final List<DataType> e;
    private final List<Session> f;
    private final boolean g;
    private final boolean h;
    private final alq i;

    public static class a {
        private long a;
        private long b;
        private List<DataSource> c = new ArrayList();
        private List<DataType> d = new ArrayList();
        private List<Session> e = new ArrayList();
        private boolean f = false;
        private boolean g = false;

        private void d() {
            if (!this.e.isEmpty()) {
                for (Session session : this.e) {
                    boolean z = session.a(TimeUnit.MILLISECONDS) >= this.a && session.b(TimeUnit.MILLISECONDS) <= this.b;
                    d.a(z, "Session %s is outside the time interval [%d, %d]", new Object[]{session, Long.valueOf(this.a), Long.valueOf(this.b)});
                }
            }
        }

        public a a() {
            d.b(this.d.isEmpty(), "Specific data type already added for deletion. deleteAllData() will delete all data types and cannot be combined with addDataType()");
            d.b(this.c.isEmpty(), "Specific data source already added for deletion. deleteAllData() will delete all data sources and cannot be combined with addDataSource()");
            this.f = true;
            return this;
        }

        public a a(long j, long j2, TimeUnit timeUnit) {
            d.b(j > 0, "Invalid start time :%d", new Object[]{Long.valueOf(j)});
            d.b(j2 > j, "Invalid end time :%d", new Object[]{Long.valueOf(j2)});
            this.a = timeUnit.toMillis(j);
            this.b = timeUnit.toMillis(j2);
            return this;
        }

        public a a(DataSource dataSource) {
            boolean z = true;
            d.b(!this.f, "All data is already marked for deletion.  addDataSource() cannot be combined with deleteAllData()");
            if (dataSource == null) {
                z = false;
            }
            d.b(z, "Must specify a valid data source");
            if (!this.c.contains(dataSource)) {
                this.c.add(dataSource);
            }
            return this;
        }

        public a a(DataType dataType) {
            boolean z = true;
            d.b(!this.f, "All data is already marked for deletion.  addDataType() cannot be combined with deleteAllData()");
            if (dataType == null) {
                z = false;
            }
            d.b(z, "Must specify a valid data type");
            if (!this.d.contains(dataType)) {
                this.d.add(dataType);
            }
            return this;
        }

        public a a(Session session) {
            boolean z = true;
            d.b(!this.g, "All sessions already marked for deletion.  addSession() cannot be combined with deleteAllSessions()");
            d.b(session != null, "Must specify a valid session");
            if (session.b(TimeUnit.MILLISECONDS) <= 0) {
                z = false;
            }
            d.b(z, "Cannot delete an ongoing session. Please stop the session prior to deleting it");
            this.e.add(session);
            return this;
        }

        public a b() {
            d.b(this.e.isEmpty(), "Specific session already added for deletion. deleteAllData() will delete all sessions and cannot be combined with addSession()");
            this.g = true;
            return this;
        }

        public DataDeleteRequest c() {
            boolean z = false;
            boolean z2 = this.a > 0 && this.b > this.a;
            d.a(z2, "Must specify a valid time interval");
            z2 = (!this.f && this.c.isEmpty() && this.d.isEmpty()) ? false : true;
            boolean z3 = this.g || !this.e.isEmpty();
            if (z2 || z3) {
                z = true;
            }
            d.a(z, "No data or session marked for deletion");
            d();
            return new DataDeleteRequest();
        }
    }

    DataDeleteRequest(int i, long j, long j2, List<DataSource> list, List<DataType> list2, List<Session> list3, boolean z, boolean z2, IBinder iBinder) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
        this.f = list3;
        this.g = z;
        this.h = z2;
        this.i = com.google.android.gms.internal.alq.a.a(iBinder);
    }

    public DataDeleteRequest(long j, long j2, List<DataSource> list, List<DataType> list2, List<Session> list3, boolean z, boolean z2, alq com_google_android_gms_internal_alq) {
        this.a = 3;
        this.b = j;
        this.c = j2;
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
        this.f = list3;
        this.g = z;
        this.h = z2;
        this.i = com_google_android_gms_internal_alq;
    }

    private DataDeleteRequest(a aVar) {
        this(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, null);
    }

    public DataDeleteRequest(DataDeleteRequest dataDeleteRequest, alq com_google_android_gms_internal_alq) {
        this(dataDeleteRequest.b, dataDeleteRequest.c, dataDeleteRequest.d, dataDeleteRequest.e, dataDeleteRequest.f, dataDeleteRequest.g, dataDeleteRequest.h, com_google_android_gms_internal_alq);
    }

    private boolean a(DataDeleteRequest dataDeleteRequest) {
        return this.b == dataDeleteRequest.b && this.c == dataDeleteRequest.c && c.a(this.d, dataDeleteRequest.d) && c.a(this.e, dataDeleteRequest.e) && c.a(this.f, dataDeleteRequest.f) && this.g == dataDeleteRequest.g && this.h == dataDeleteRequest.h;
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.b, TimeUnit.MILLISECONDS);
    }

    public List<DataSource> a() {
        return this.d;
    }

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(this.c, TimeUnit.MILLISECONDS);
    }

    public List<DataType> b() {
        return this.e;
    }

    public List<Session> c() {
        return this.f;
    }

    public boolean d() {
        return this.g;
    }

    public boolean e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataDeleteRequest) && a((DataDeleteRequest) obj));
    }

    int f() {
        return this.a;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public int hashCode() {
        return c.a(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    public long i() {
        return this.c;
    }

    public long j() {
        return this.b;
    }

    public IBinder k() {
        return this.i == null ? null : this.i.asBinder();
    }

    public String toString() {
        return c.a(this).a("startTimeMillis", Long.valueOf(this.b)).a("endTimeMillis", Long.valueOf(this.c)).a("dataSources", this.d).a("dateTypes", this.e).a("sessions", this.f).a("deleteAllData", Boolean.valueOf(this.g)).a("deleteAllSessions", Boolean.valueOf(this.h)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        r.a(this, parcel, i);
    }
}
