package com.google.android.gms.drive.events.internal;

import com.google.android.gms.common.internal.c;
import com.google.android.gms.drive.events.j;
import com.google.android.gms.drive.events.l;

public class a implements j {
    private final l a;
    private final long b;
    private final long c;

    public a(TransferProgressData transferProgressData) {
        this.a = new b(transferProgressData);
        this.b = transferProgressData.d();
        this.c = transferProgressData.e();
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        return c.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
    }

    public int hashCode() {
        return c.a(new Object[]{Long.valueOf(this.c), Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    public String toString() {
        return String.format("FileTransferProgress[FileTransferState: %s, BytesTransferred: %d, TotalBytes: %d]", new Object[]{this.a.toString(), Long.valueOf(this.b), Long.valueOf(this.c)});
    }
}
