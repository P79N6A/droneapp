package com.google.android.gms.internal;

import java.io.IOException;

public class rc extends IOException {
    public rc(String str) {
        super(str);
    }

    static rc a() {
        return new rc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static rc b() {
        return new rc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static rc c() {
        return new rc("CodedInputStream encountered a malformed varint.");
    }

    static rc d() {
        return new rc("Protocol message contained an invalid tag (zero).");
    }

    static rc e() {
        return new rc("Protocol message end-group tag did not match expected tag.");
    }

    static rc f() {
        return new rc("Protocol message tag had invalid wire type.");
    }

    static rc g() {
        return new rc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
