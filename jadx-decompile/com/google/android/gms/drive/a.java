package com.google.android.gms.drive;

import android.content.IntentSender;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.drive.internal.bk;
import com.google.android.gms.drive.internal.bu;

public class a {
    public static final String a = "response_drive_id";
    private final bk b = new bk(0);
    private d c;
    private boolean d;

    public IntentSender a(g gVar) {
        d.a(Boolean.valueOf(this.d), "Must call setInitialDriveContents to CreateFileActivityBuilder.");
        d.a(gVar.j(), "Client must be connected");
        if (this.c != null) {
            this.c.g();
        }
        return this.b.a(gVar);
    }

    public a a(DriveId driveId) {
        this.b.a(driveId);
        return this;
    }

    public a a(d dVar) {
        if (dVar == null) {
            this.b.a(1);
        } else if (!(dVar instanceof bu)) {
            throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
        } else if (dVar.a() != null) {
            throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
        } else if (dVar.h()) {
            throw new IllegalArgumentException("DriveContents are already closed.");
        } else {
            this.b.a(dVar.f().f());
            this.c = dVar;
        }
        this.d = true;
        return this;
    }

    public a a(n nVar) {
        this.b.a(nVar);
        return this;
    }

    public a a(String str) {
        this.b.a(str);
        return this;
    }
}
