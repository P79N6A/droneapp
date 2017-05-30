package com.google.android.gms.internal;

import com.google.android.gms.internal.lh.a;

public class lo extends le<lo> {
    private final String a;

    public lo(String str, lh lhVar) {
        super(lhVar);
        this.a = str;
    }

    protected int a(lo loVar) {
        return this.a.compareTo(loVar.a);
    }

    public lo a(lh lhVar) {
        return new lo(this.a, lhVar);
    }

    public Object a() {
        return this.a;
    }

    public String a(a aVar) {
        String valueOf;
        String str;
        switch (aVar) {
            case V1:
                valueOf = String.valueOf(b(aVar));
                str = this.a;
                return new StringBuilder((String.valueOf(valueOf).length() + 7) + String.valueOf(str).length()).append(valueOf).append("string:").append(str).toString();
            case V2:
                valueOf = String.valueOf(b(aVar));
                str = String.valueOf(mk.c(this.a));
                return new StringBuilder((String.valueOf(valueOf).length() + 7) + String.valueOf(str).length()).append(valueOf).append("string:").append(str).toString();
            default:
                str = String.valueOf(aVar);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 38).append("Invalid hash version for string node: ").append(str).toString());
        }
    }

    public /* synthetic */ lh b(lh lhVar) {
        return a(lhVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof lo)) {
            return false;
        }
        lo loVar = (lo) obj;
        return this.a.equals(loVar.a) && this.b.equals(loVar.b);
    }

    public int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    protected a p_() {
        return a.String;
    }
}
