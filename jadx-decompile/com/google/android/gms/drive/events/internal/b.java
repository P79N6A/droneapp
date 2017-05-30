package com.google.android.gms.drive.events.internal;

import com.google.android.gms.common.internal.c;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.l;

public class b implements l {
    private final DriveId a;
    private final int b;
    private final int c;

    public b(TransferProgressData transferProgressData) {
        this.a = transferProgressData.b();
        this.b = transferProgressData.a();
        this.c = transferProgressData.c();
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        return c.a(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
    }

    public int hashCode() {
        return c.a(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public String toString() {
        return String.format("FileTransferState[TransferType: %d, DriveId: %s, status: %d]", new Object[]{Integer.valueOf(this.b), this.a, Integer.valueOf(this.c)});
    }
}
