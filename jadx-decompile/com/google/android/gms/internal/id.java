package com.google.android.gms.internal;

import com.google.firebase.b;
import com.google.firebase.database.j.a;

public class id extends ic {
    public synchronized void a(b bVar) {
        this.j = bVar;
    }

    public synchronized void a(a aVar) {
        e();
        switch (aVar) {
            case DEBUG:
                this.g = kt.a.DEBUG;
                break;
            case INFO:
                this.g = kt.a.INFO;
                break;
            case WARN:
                this.g = kt.a.WARN;
                break;
            case ERROR:
                this.g = kt.a.ERROR;
                break;
            case NONE:
                this.g = kt.a.NONE;
                break;
            default:
                String valueOf = String.valueOf(aVar);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Unknown log level: ").append(valueOf).toString());
        }
    }

    public synchronized void a(boolean z) {
        e();
        this.h = z;
    }

    public synchronized void c(String str) {
        e();
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
        this.e = str;
    }
}
