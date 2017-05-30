package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alp;
import com.google.android.gms.internal.alp.a;

public class SessionStopRequest extends AbstractSafeParcelable {
    public static final Creator<SessionStopRequest> CREATOR = new i();
    private final int a;
    private final String b;
    private final String c;
    private final alp d;

    SessionStopRequest(int i, String str, String str2, IBinder iBinder) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = a.a(iBinder);
    }

    public SessionStopRequest(String str, String str2, alp com_google_android_gms_internal_alp) {
        this.a = 3;
        this.b = str;
        this.c = str2;
        this.d = com_google_android_gms_internal_alp;
    }

    private boolean a(SessionStopRequest sessionStopRequest) {
        return c.a(this.b, sessionStopRequest.b) && c.a(this.c, sessionStopRequest.c);
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public IBinder c() {
        return this.d == null ? null : this.d.asBinder();
    }

    int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof SessionStopRequest) && a((SessionStopRequest) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c});
    }

    public String toString() {
        return c.a(this).a(User.FN_NAME, this.b).a("identifier", this.c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
