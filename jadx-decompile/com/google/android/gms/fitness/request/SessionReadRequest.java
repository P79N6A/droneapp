package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.alo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionReadRequest extends AbstractSafeParcelable {
    public static final Creator<SessionReadRequest> CREATOR = new f();
    private final int a;
    private final String b;
    private final String c;
    private final long d;
    private final long e;
    private final List<DataType> f;
    private final List<DataSource> g;
    private boolean h;
    private final boolean i;
    private final List<String> j;
    private final alo k;

    public static class a {
        private String a;
        private String b;
        private long c = 0;
        private long d = 0;
        private List<DataType> e = new ArrayList();
        private List<DataSource> f = new ArrayList();
        private boolean g = false;
        private boolean h = false;
        private List<String> i = new ArrayList();

        public a a() {
            this.g = true;
            return this;
        }

        public a a(long j, long j2, TimeUnit timeUnit) {
            this.c = timeUnit.toMillis(j);
            this.d = timeUnit.toMillis(j2);
            return this;
        }

        public a a(DataSource dataSource) {
            d.a(dataSource, "Attempting to add a null data source");
            if (!this.f.contains(dataSource)) {
                this.f.add(dataSource);
            }
            return this;
        }

        public a a(DataType dataType) {
            d.a(dataType, "Attempting to use a null data type");
            if (!this.e.contains(dataType)) {
                this.e.add(dataType);
            }
            return this;
        }

        public a a(String str) {
            this.a = str;
            return this;
        }

        public a b() {
            this.h = true;
            return this;
        }

        public a b(String str) {
            this.b = str;
            return this;
        }

        public a c(String str) {
            d.a(str, "Attempting to use a null package name");
            if (!this.i.contains(str)) {
                this.i.add(str);
            }
            return this;
        }

        public SessionReadRequest c() {
            d.b(this.c > 0, "Invalid start time: %s", new Object[]{Long.valueOf(this.c)});
            boolean z = this.d > 0 && this.d > this.c;
            d.b(z, "Invalid end time: %s", new Object[]{Long.valueOf(this.d)});
            return new SessionReadRequest();
        }
    }

    SessionReadRequest(int i, String str, String str2, long j, long j2, List<DataType> list, List<DataSource> list2, boolean z, boolean z2, List<String> list3, IBinder iBinder) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = list;
        this.g = list2;
        this.h = z;
        this.i = z2;
        this.j = list3;
        this.k = com.google.android.gms.internal.alo.a.a(iBinder);
    }

    private SessionReadRequest(a aVar) {
        this(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, null);
    }

    public SessionReadRequest(SessionReadRequest sessionReadRequest, alo com_google_android_gms_internal_alo) {
        this(sessionReadRequest.b, sessionReadRequest.c, sessionReadRequest.d, sessionReadRequest.e, sessionReadRequest.f, sessionReadRequest.g, sessionReadRequest.h, sessionReadRequest.i, sessionReadRequest.j, com_google_android_gms_internal_alo);
    }

    public SessionReadRequest(String str, String str2, long j, long j2, List<DataType> list, List<DataSource> list2, boolean z, boolean z2, List<String> list3, alo com_google_android_gms_internal_alo) {
        this(5, str, str2, j, j2, list, list2, z, z2, list3, com_google_android_gms_internal_alo == null ? null : com_google_android_gms_internal_alo.asBinder());
    }

    private boolean a(SessionReadRequest sessionReadRequest) {
        return c.a(this.b, sessionReadRequest.b) && this.c.equals(sessionReadRequest.c) && this.d == sessionReadRequest.d && this.e == sessionReadRequest.e && c.a(this.f, sessionReadRequest.f) && c.a(this.g, sessionReadRequest.g) && this.h == sessionReadRequest.h && this.j.equals(sessionReadRequest.j) && this.i == sessionReadRequest.i;
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.d, TimeUnit.MILLISECONDS);
    }

    public String a() {
        return this.b;
    }

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(this.e, TimeUnit.MILLISECONDS);
    }

    public String b() {
        return this.c;
    }

    public List<DataType> c() {
        return this.f;
    }

    public List<DataSource> d() {
        return this.g;
    }

    public boolean e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SessionReadRequest) && a((SessionReadRequest) obj));
    }

    public List<String> f() {
        return this.j;
    }

    public boolean g() {
        return this.i;
    }

    public long h() {
        return this.e;
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e)});
    }

    public long i() {
        return this.d;
    }

    public boolean j() {
        return this.h;
    }

    public IBinder k() {
        return this.k == null ? null : this.k.asBinder();
    }

    int l() {
        return this.a;
    }

    public String toString() {
        return c.a(this).a("sessionName", this.b).a("sessionId", this.c).a("startTimeMillis", Long.valueOf(this.d)).a("endTimeMillis", Long.valueOf(this.e)).a("dataTypes", this.f).a("dataSources", this.g).a("sessionsFromAllApps", Boolean.valueOf(this.h)).a("excludedPackages", this.j).a("useServer", Boolean.valueOf(this.i)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
