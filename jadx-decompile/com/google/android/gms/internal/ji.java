package com.google.android.gms.internal;

public class ji {
    public static final ji a = new ji(a.User, null, false);
    public static final ji b = new ji(a.Server, null, false);
    static final /* synthetic */ boolean c = (!ji.class.desiredAssertionStatus());
    private final a d;
    private final kf e;
    private final boolean f;

    private enum a {
        User,
        Server
    }

    public ji(a aVar, kf kfVar, boolean z) {
        this.d = aVar;
        this.e = kfVar;
        this.f = z;
        if (!c && z && !b()) {
            throw new AssertionError();
        }
    }

    public static ji a(kf kfVar) {
        return new ji(a.Server, kfVar, true);
    }

    public boolean a() {
        return this.d == a.User;
    }

    public boolean b() {
        return this.d == a.Server;
    }

    public boolean c() {
        return this.f;
    }

    public kf d() {
        return this.e;
    }

    public String toString() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        return new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf2).length()).append("OperationSource{source=").append(valueOf).append(", queryParams=").append(valueOf2).append(", tagged=").append(this.f).append("}").toString();
    }
}
