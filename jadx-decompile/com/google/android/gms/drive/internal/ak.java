package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.c$a;
import com.google.android.gms.drive.e.a;
import com.google.android.gms.internal.ahl.b;

class ak extends bc {
    private final b<c$a> a;
    private final a b;

    ak(b<c$a> bVar, a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    public void a(Status status) {
        this.a.a(new b(status, null));
    }

    public void a(OnContentsResponse onContentsResponse) {
        this.a.a(new b(onContentsResponse.b() ? new Status(-1) : Status.a, new bu(onContentsResponse.a())));
    }

    public void a(OnDownloadProgressResponse onDownloadProgressResponse) {
        if (this.b != null) {
            this.b.a(onDownloadProgressResponse.a(), onDownloadProgressResponse.b());
        }
    }
}
