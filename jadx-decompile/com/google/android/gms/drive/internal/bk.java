package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.b;
import com.google.android.gms.drive.n;

public class bk {
    protected n a;
    private Integer b;
    private String c;
    private DriveId d;
    private final int e;

    public bk(int i) {
        this.e = i;
    }

    public IntentSender a(g gVar) {
        d.a(this.a, "Must provide initial metadata to CreateFileActivityBuilder.");
        d.a(gVar.j(), "Client must be connected");
        bt btVar = (bt) gVar.a(b.a);
        this.a.j().a(btVar.B());
        try {
            return btVar.i().a(new CreateFileIntentSenderRequest(this.a.j(), this.b == null ? 0 : this.b.intValue(), this.c, this.d, this.e));
        } catch (Throwable e) {
            throw new RuntimeException("Unable to connect Drive Play Service", e);
        }
    }

    public void a(int i) {
        this.b = Integer.valueOf(i);
    }

    public void a(DriveId driveId) {
        this.d = (DriveId) d.a(driveId);
    }

    public void a(n nVar) {
        this.a = (n) d.a(nVar);
    }

    public void a(String str) {
        this.c = (String) d.a(str);
    }
}
