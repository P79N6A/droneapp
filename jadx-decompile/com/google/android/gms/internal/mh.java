package com.google.android.gms.internal;

import com.xiaomi.mipush.sdk.Constants;

public class mh<T, U> {
    private final T a;
    private final U b;

    public mh(T t, U u) {
        this.a = t;
        this.b = u;
    }

    public T a() {
        return this.a;
    }

    public U b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mh mhVar = (mh) obj;
        if (this.a == null ? mhVar.a != null : !this.a.equals(mhVar.a)) {
            return false;
        }
        if (this.b != null) {
            if (this.b.equals(mhVar.b)) {
                return true;
            }
        } else if (mhVar.b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.a != null ? this.a.hashCode() : 0) * 31;
        if (this.b != null) {
            i = this.b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder((String.valueOf(valueOf).length() + 7) + String.valueOf(valueOf2).length()).append("Pair(").append(valueOf).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(valueOf2).append(")").toString();
    }
}
