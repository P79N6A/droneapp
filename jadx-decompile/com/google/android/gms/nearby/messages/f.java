package com.google.android.gms.nearby.messages;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

public interface f {
    @Deprecated
    i<Status> a(g gVar);

    i<Status> a(g gVar, PendingIntent pendingIntent);

    i<Status> a(g gVar, PendingIntent pendingIntent, n nVar);

    i<Status> a(g gVar, Message message);

    i<Status> a(g gVar, Message message, k kVar);

    i<Status> a(g gVar, e eVar);

    i<Status> a(g gVar, e eVar, n nVar);

    i<Status> a(g gVar, l lVar);

    void a(Intent intent, e eVar);

    i<Status> b(g gVar, PendingIntent pendingIntent);

    i<Status> b(g gVar, Message message);

    i<Status> b(g gVar, e eVar);

    i<Status> b(g gVar, l lVar);
}
