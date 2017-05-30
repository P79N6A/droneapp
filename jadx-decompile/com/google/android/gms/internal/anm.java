package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;

public class anm implements com.google.android.gms.e.b {

    private static abstract class c<R extends m> extends com.google.android.gms.internal.ahl.a<R, ann> {
        protected c(g gVar) {
            super(com.google.android.gms.e.a.a, gVar);
        }

        protected abstract void a(Context context, anl com_google_android_gms_internal_anl);

        protected final void a(ann com_google_android_gms_internal_ann) {
            a(com_google_android_gms_internal_ann.B(), (anl) com_google_android_gms_internal_ann.G());
        }
    }

    private static abstract class a extends c<com.google.android.gms.e.b.a> {
        public a(g gVar) {
            super(gVar);
        }

        protected com.google.android.gms.e.b.a a(Status status) {
            return new ano(status, null);
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass3 extends com.google.android.gms.internal.anj.a {
        final /* synthetic */ Context a;
        final /* synthetic */ Uri b;
        final /* synthetic */ anj c;

        AnonymousClass3(Context context, Uri uri, anj com_google_android_gms_internal_anj) {
            this.a = context;
            this.b = uri;
            this.c = com_google_android_gms_internal_anj;
        }

        public void a(int i, Bundle bundle, int i2, Intent intent) {
            anm.b(this.a, this.b);
            this.c.a(i, bundle, i2, intent);
        }
    }

    private static final class b extends com.google.android.gms.internal.anj.a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.e.b.a> a;

        public b(com.google.android.gms.internal.ahl.b<com.google.android.gms.e.b.a> bVar) {
            this.a = bVar;
        }

        public void a(int i, Bundle bundle, int i2, Intent intent) {
            this.a.a(new ano(new Status(i, null, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null), intent));
        }
    }

    private static void b(Context context, Uri uri) {
        context.revokeUriPermission(uri, 1);
    }

    private static void b(Context context, anl com_google_android_gms_internal_anl, anj com_google_android_gms_internal_anj, Uri uri, Bundle bundle) {
        context.grantUriPermission("com.google.android.gms", uri, 1);
        try {
            com_google_android_gms_internal_anl.a(new AnonymousClass3(context, uri, com_google_android_gms_internal_anj), uri, bundle, true);
        } catch (RemoteException e) {
            b(context, uri);
            throw e;
        } catch (RuntimeException e2) {
            b(context, uri);
            throw e2;
        }
    }

    public i<com.google.android.gms.e.b.a> a(g gVar, final Uri uri) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ anm b;

            protected void a(Context context, anl com_google_android_gms_internal_anl) {
                com_google_android_gms_internal_anl.a(new b(this), uri, null, false);
            }
        });
    }

    public i<com.google.android.gms.e.b.a> b(g gVar, final Uri uri) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ anm b;

            protected void a(Context context, anl com_google_android_gms_internal_anl) {
                anm.b(context, com_google_android_gms_internal_anl, new b(this), uri, null);
            }
        });
    }
}
