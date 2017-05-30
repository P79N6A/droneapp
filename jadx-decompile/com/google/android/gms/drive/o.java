package com.google.android.gms.drive;

import android.content.IntentSender;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.internal.bt;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FilterHolder;

public class o {
    public static final String a = "response_drive_id";
    private String b;
    private String[] c;
    private Filter d;
    private DriveId e;

    public IntentSender a(g gVar) {
        d.a(gVar.j(), "Client must be connected");
        if (this.c == null) {
            this.c = new String[0];
        }
        if (this.c.length <= 0 || this.d == null) {
            try {
                return ((bt) gVar.a(b.a)).i().a(new OpenFileIntentSenderRequest(this.b, this.c, this.e, this.d == null ? null : new FilterHolder(this.d)));
            } catch (Throwable e) {
                throw new RuntimeException("Unable to connect Drive Play Service", e);
            }
        }
        throw new IllegalStateException("Cannot use a selection filter and set mimetypes simultaneously");
    }

    public o a(DriveId driveId) {
        this.e = (DriveId) d.a(driveId);
        return this;
    }

    public o a(Filter filter) {
        boolean z = true;
        d.b(filter != null, "filter may not be null");
        if (com.google.android.gms.drive.query.internal.g.a(filter)) {
            z = false;
        }
        d.b(z, "FullTextSearchFilter cannot be used as a selection filter");
        this.d = filter;
        return this;
    }

    public o a(String str) {
        this.b = (String) d.a(str);
        return this;
    }

    public o a(String[] strArr) {
        d.b(strArr != null, "mimeTypes may not be null");
        this.c = strArr;
        return this;
    }
}
