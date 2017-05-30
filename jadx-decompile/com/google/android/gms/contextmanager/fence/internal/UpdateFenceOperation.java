package com.google.android.gms.contextmanager.fence.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.fence.i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.fence.internal.m.a;
import com.google.android.gms.internal.sx;

public class UpdateFenceOperation extends AbstractSafeParcelable {
    public static final Creator<UpdateFenceOperation> CREATOR = new q();
    private final int a;
    private final int b;
    private final ContextFenceRegistrationStub c;
    private m d;
    private final i e;
    private final PendingIntent f;
    private final String g;
    private final long h;
    private final long i;

    UpdateFenceOperation(int i, int i2, ContextFenceRegistrationStub contextFenceRegistrationStub, IBinder iBinder, PendingIntent pendingIntent, String str, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = contextFenceRegistrationStub;
        this.d = iBinder == null ? null : a.a(iBinder);
        this.e = null;
        this.f = pendingIntent;
        this.g = str;
        this.h = j;
        this.i = j2;
    }

    private UpdateFenceOperation(int i, ContextFenceRegistrationStub contextFenceRegistrationStub, i iVar, PendingIntent pendingIntent, String str, long j, long j2) {
        this.a = 1;
        this.b = i;
        this.c = contextFenceRegistrationStub;
        this.d = null;
        this.e = iVar;
        this.f = pendingIntent;
        this.g = str;
        this.h = j;
        this.i = j2;
    }

    public static final UpdateFenceOperation a(PendingIntent pendingIntent) {
        return new UpdateFenceOperation(4, null, null, pendingIntent, null, -1, -1);
    }

    public static final UpdateFenceOperation a(String str) {
        return new UpdateFenceOperation(5, null, null, null, str, -1, -1);
    }

    public static final UpdateFenceOperation a(String str, ContextFenceStub contextFenceStub, PendingIntent pendingIntent) {
        return new UpdateFenceOperation(2, ContextFenceRegistrationStub.a(str, contextFenceStub), null, pendingIntent, null, -1, -1);
    }

    int a() {
        return this.a;
    }

    void a(sx<i, e> sxVar) {
        if (this.d == null && this.e != null) {
            this.d = (m) sxVar.a(this.e);
        }
    }

    IBinder b() {
        return this.d == null ? null : this.d.asBinder();
    }

    public int c() {
        return this.b;
    }

    public ContextFenceRegistrationStub d() {
        return this.c;
    }

    public PendingIntent e() {
        return this.f;
    }

    public String f() {
        return this.g;
    }

    public long g() {
        return this.h;
    }

    public long h() {
        return this.i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
