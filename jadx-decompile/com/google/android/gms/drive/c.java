package com.google.android.gms.drive;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.drive.query.Query;
import java.util.List;

public interface c {
    i<a> a(g gVar);

    i<c> a(g gVar, Query query);

    i<b> a(g gVar, String str);

    @Deprecated
    i<Status> a(g gVar, List<String> list);

    @Deprecated
    e a(g gVar, DriveId driveId);

    o a();

    a b();

    f b(g gVar);

    @Deprecated
    f b(g gVar, DriveId driveId);

    f c(g gVar);

    i<Status> d(g gVar);

    @Deprecated
    i<e> e(g gVar);
}
