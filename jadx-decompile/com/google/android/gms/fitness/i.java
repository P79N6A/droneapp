package com.google.android.gms.fitness;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;

public interface i {

    public static class a {
        private final Context a;
        private Session b;
        private String c;
        private boolean d = false;

        public a(Context context) {
            this.a = context;
        }

        private Intent a(Intent intent) {
            if (this.c == null) {
                return intent;
            }
            Intent intent2 = new Intent(intent).setPackage(this.c);
            ResolveInfo resolveActivity = this.a.getPackageManager().resolveActivity(intent2, 0);
            if (resolveActivity == null) {
                return intent;
            }
            intent2.setComponent(new ComponentName(this.c, resolveActivity.activityInfo.name));
            return intent2;
        }

        public Intent a() {
            d.a(this.b != null, "Session must be set");
            Intent intent = new Intent(c.A);
            intent.setType(Session.a(this.b.f()));
            c.a(this.b, intent, Session.a);
            if (!this.d) {
                this.c = this.b.i();
            }
            return a(intent);
        }

        public a a(Session session) {
            this.b = session;
            return this;
        }

        public a a(String str) {
            this.c = str;
            this.d = true;
            return this;
        }
    }

    com.google.android.gms.common.api.i<Status> a(g gVar, PendingIntent pendingIntent);

    com.google.android.gms.common.api.i<Status> a(g gVar, Session session);

    com.google.android.gms.common.api.i<Status> a(g gVar, SessionInsertRequest sessionInsertRequest);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    com.google.android.gms.common.api.i<SessionReadResult> a(g gVar, SessionReadRequest sessionReadRequest);

    com.google.android.gms.common.api.i<SessionStopResult> a(g gVar, String str);

    com.google.android.gms.common.api.i<Status> b(g gVar, PendingIntent pendingIntent);
}
