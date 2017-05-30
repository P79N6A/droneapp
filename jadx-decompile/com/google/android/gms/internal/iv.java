package com.google.android.gms.internal;

public class iv {
    private final long a;

    public iv(long j) {
        this.a = j;
    }

    public long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a == ((iv) obj).a;
    }

    public int hashCode() {
        return (int) (this.a ^ (this.a >>> 32));
    }

    public String toString() {
        return "Tag{tagNumber=" + this.a + "}";
    }
}
