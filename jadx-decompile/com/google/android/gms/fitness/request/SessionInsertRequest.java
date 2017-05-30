package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.ake;
import com.google.android.gms.internal.alq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionInsertRequest extends AbstractSafeParcelable {
    public static final Creator<SessionInsertRequest> CREATOR = new e();
    private final int a;
    private final Session b;
    private final List<DataSet> c;
    private final List<DataPoint> d;
    private final alq e;

    public static class a {
        private Session a;
        private List<DataSet> b = new ArrayList();
        private List<DataPoint> c = new ArrayList();
        private List<DataSource> d = new ArrayList();

        private void b() {
            for (DataSet d : this.b) {
                for (DataPoint b : d.d()) {
                    b(b);
                }
            }
            for (DataPoint b2 : this.c) {
                b(b2);
            }
        }

        private void b(DataPoint dataPoint) {
            d(dataPoint);
            c(dataPoint);
        }

        private void c(DataPoint dataPoint) {
            long a = this.a.a(TimeUnit.NANOSECONDS);
            long b = this.a.b(TimeUnit.NANOSECONDS);
            long b2 = dataPoint.b(TimeUnit.NANOSECONDS);
            long c = dataPoint.c(TimeUnit.NANOSECONDS);
            if (b2 != 0 && c != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (c > b) {
                    c = ake.a(c, TimeUnit.NANOSECONDS, timeUnit);
                }
                boolean z = b2 >= a && c <= b;
                d.a(z, "Data point %s has start and end times outside session interval [%d, %d]", new Object[]{dataPoint, Long.valueOf(a), Long.valueOf(b)});
                if (c != dataPoint.c(TimeUnit.NANOSECONDS)) {
                    Log.w("Fitness", String.format("Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[]{Long.valueOf(dataPoint.c(TimeUnit.NANOSECONDS)), Long.valueOf(c), timeUnit}));
                    dataPoint.a(b2, c, TimeUnit.NANOSECONDS);
                }
            }
        }

        private void d(DataPoint dataPoint) {
            long a = this.a.a(TimeUnit.NANOSECONDS);
            long b = this.a.b(TimeUnit.NANOSECONDS);
            long a2 = dataPoint.a(TimeUnit.NANOSECONDS);
            if (a2 != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (a2 < a || a2 > b) {
                    a2 = ake.a(a2, TimeUnit.NANOSECONDS, timeUnit);
                }
                boolean z = a2 >= a && a2 <= b;
                d.a(z, "Data point %s has time stamp outside session interval [%d, %d]", new Object[]{dataPoint, Long.valueOf(a), Long.valueOf(b)});
                if (dataPoint.a(TimeUnit.NANOSECONDS) != a2) {
                    Log.w("Fitness", String.format("Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[]{Long.valueOf(dataPoint.a(TimeUnit.NANOSECONDS)), Long.valueOf(a2), timeUnit}));
                    dataPoint.a(a2, TimeUnit.NANOSECONDS);
                }
            }
        }

        public a a(DataPoint dataPoint) {
            d.b(dataPoint != null, "Must specify a valid aggregate data point.");
            DataSource c = dataPoint.c();
            d.a(!this.d.contains(c), "Data set/Aggregate data point for this data source %s is already added.", new Object[]{c});
            DataSet.c(dataPoint);
            this.d.add(c);
            this.c.add(dataPoint);
            return this;
        }

        public a a(DataSet dataSet) {
            boolean z = true;
            d.b(dataSet != null, "Must specify a valid data set.");
            DataSource b = dataSet.b();
            d.a(!this.d.contains(b), "Data set for this data source %s is already added.", new Object[]{b});
            if (dataSet.d().isEmpty()) {
                z = false;
            }
            d.b(z, "No data points specified in the input data set.");
            this.d.add(b);
            this.b.add(dataSet);
            return this;
        }

        public a a(Session session) {
            this.a = session;
            return this;
        }

        public SessionInsertRequest a() {
            boolean z = true;
            d.a(this.a != null, "Must specify a valid session.");
            if (this.a.b(TimeUnit.MILLISECONDS) == 0) {
                z = false;
            }
            d.a(z, "Must specify a valid end time, cannot insert a continuing session.");
            b();
            return new SessionInsertRequest();
        }
    }

    SessionInsertRequest(int i, Session session, List<DataSet> list, List<DataPoint> list2, IBinder iBinder) {
        this.a = i;
        this.b = session;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = com.google.android.gms.internal.alq.a.a(iBinder);
    }

    public SessionInsertRequest(Session session, List<DataSet> list, List<DataPoint> list2, alq com_google_android_gms_internal_alq) {
        this.a = 3;
        this.b = session;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = com_google_android_gms_internal_alq;
    }

    private SessionInsertRequest(a aVar) {
        this(aVar.a, aVar.b, aVar.c, null);
    }

    public SessionInsertRequest(SessionInsertRequest sessionInsertRequest, alq com_google_android_gms_internal_alq) {
        this(sessionInsertRequest.b, sessionInsertRequest.c, sessionInsertRequest.d, com_google_android_gms_internal_alq);
    }

    private boolean a(SessionInsertRequest sessionInsertRequest) {
        return c.a(this.b, sessionInsertRequest.b) && c.a(this.c, sessionInsertRequest.c) && c.a(this.d, sessionInsertRequest.d);
    }

    public Session a() {
        return this.b;
    }

    public List<DataSet> b() {
        return this.c;
    }

    public List<DataPoint> c() {
        return this.d;
    }

    public IBinder d() {
        return this.e == null ? null : this.e.asBinder();
    }

    int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof SessionInsertRequest) && a((SessionInsertRequest) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c, this.d});
    }

    public String toString() {
        return c.a(this).a("session", this.b).a("dataSets", this.c).a("aggregateDataPoints", this.d).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
