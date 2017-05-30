package com.google.android.gms.nearby.messages.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.ail;
import com.google.android.gms.nearby.messages.j;
import com.google.android.gms.nearby.messages.k;
import com.google.android.gms.nearby.messages.l;
import com.google.android.gms.nearby.messages.m;
import com.google.android.gms.nearby.messages.n;
import java.util.List;

class s extends w<l> {
    private final ClientAppContext a;
    private final int e;
    private final h<l, f> f = new h<l, f>(this) {
        final /* synthetic */ s a;

        {
            this.a = r2;
        }

        protected f a(ail<l> com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_l) {
            return new f(com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_l);
        }

        protected /* synthetic */ a b(ail com_google_android_gms_internal_ail) {
            return a(com_google_android_gms_internal_ail);
        }
    };
    private final h<com.google.android.gms.nearby.messages.e, c> g = new h<com.google.android.gms.nearby.messages.e, c>(this) {
        final /* synthetic */ s a;

        {
            this.a = r2;
        }

        protected c a(ail<com.google.android.gms.nearby.messages.e> com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_e) {
            return new c(com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_e);
        }

        protected /* synthetic */ a b(ail com_google_android_gms_internal_ail) {
            return a(com_google_android_gms_internal_ail);
        }
    };

    private static abstract class h<C, W extends a<C>> {
        private final SimpleArrayMap<C, W> a;

        private h() {
            this.a = new SimpleArrayMap(1);
        }

        W a(ail<C> com_google_android_gms_internal_ail_C, C c) {
            a aVar = (a) this.a.get(c);
            if (aVar != null) {
                com_google_android_gms_internal_ail_C.a();
                return aVar;
            }
            W b = b((ail) com_google_android_gms_internal_ail_C);
            this.a.put(c, b);
            return b;
        }

        @Nullable
        W a(C c) {
            return (a) this.a.get(c);
        }

        protected abstract W b(ail<C> com_google_android_gms_internal_ail_C);

        @Nullable
        W b(C c) {
            a aVar = (a) this.a.remove(c);
            if (aVar != null) {
                aVar.a().a();
            }
            return aVar;
        }
    }

    private interface a<C> {
        ail<C> a();
    }

    @TargetApi(14)
    private static class b implements ActivityLifecycleCallbacks {
        private final Activity a;
        private final s b;

        private b(Activity activity, s sVar) {
            this.a = activity;
            this.b = sVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (activity == this.a) {
                Log.v("NearbyMessagesClient", String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[]{activity.getPackageName()}));
                activity.getApplication().unregisterActivityLifecycleCallbacks(this);
            }
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
            if (activity == this.a) {
                try {
                    this.b.c(1);
                } catch (RemoteException e) {
                    Log.v("NearbyMessagesClient", String.format("Failed to emit ACTIVITY_STOPPED from ClientLifecycleSafetyNet for Activity %s: %s", new Object[]{activity.getPackageName(), e}));
                }
            }
        }
    }

    private static abstract class d<T> implements com.google.android.gms.internal.ail.c<T> {
        private d() {
        }

        public void a() {
        }
    }

    private static class c extends com.google.android.gms.nearby.messages.internal.j.a implements a<com.google.android.gms.nearby.messages.e> {
        private final ail<com.google.android.gms.nearby.messages.e> a;

        private c(ail<com.google.android.gms.nearby.messages.e> com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_e) {
            this.a = com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_e;
        }

        public ail<com.google.android.gms.nearby.messages.e> a() {
            return this.a;
        }

        public void a(MessageWrapper messageWrapper) {
        }

        public void a(final List<Update> list) {
            this.a.a(new d<com.google.android.gms.nearby.messages.e>(this) {
                final /* synthetic */ c b;

                public void a(com.google.android.gms.nearby.messages.e eVar) {
                    t.a(list, eVar);
                }

                public /* synthetic */ void a(Object obj) {
                    a((com.google.android.gms.nearby.messages.e) obj);
                }
            });
        }

        public void b(MessageWrapper messageWrapper) {
        }
    }

    private static class e extends com.google.android.gms.nearby.messages.internal.m.a {
        private final j a;

        private e(j jVar) {
            this.a = jVar;
        }

        @Nullable
        private static e b(@Nullable j jVar) {
            return jVar == null ? null : new e(jVar);
        }

        public void a() {
            this.a.a();
        }
    }

    private static class f extends com.google.android.gms.nearby.messages.internal.n.a implements a<l> {
        private final ail<l> a;

        private f(ail<l> com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_l) {
            this.a = com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_l;
        }

        public ail<l> a() {
            return this.a;
        }

        public void a(final boolean z) {
            this.a.a(new d<l>(this) {
                final /* synthetic */ f b;

                public void a(l lVar) {
                    lVar.a(z);
                }

                public /* synthetic */ void a(Object obj) {
                    a((l) obj);
                }
            });
        }
    }

    private static class g extends com.google.android.gms.nearby.messages.internal.o.a {
        private final m a;

        private g(m mVar) {
            this.a = mVar;
        }

        @Nullable
        private static g b(@Nullable m mVar) {
            return mVar == null ? null : new g(mVar);
        }

        public void a() {
            this.a.a();
        }
    }

    @TargetApi(14)
    s(Context context, Looper looper, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar, com.google.android.gms.common.internal.s sVar, com.google.android.gms.nearby.messages.g gVar) {
        super(context, looper, 62, sVar, bVar, cVar);
        String h = sVar.h();
        int a = a(context);
        if (gVar != null) {
            this.a = new ClientAppContext(h, gVar.a, gVar.b, gVar.d, a);
            this.e = gVar.c;
        } else {
            this.a = new ClientAppContext(h, null, false, null, a);
            this.e = -1;
        }
        if (a == 1 && com.google.android.gms.common.util.s.d()) {
            Activity activity = (Activity) context;
            Log.v("NearbyMessagesClient", String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[]{activity.getPackageName()}));
            activity.getApplication().registerActivityLifecycleCallbacks(new b(activity, this));
        }
    }

    private static int a(Context context) {
        return context instanceof Activity ? 1 : context instanceof Application ? 2 : context instanceof Service ? 3 : 0;
    }

    private static <C> ail<C> a(com.google.android.gms.common.api.g gVar, C c, h<C, ? extends a<C>> hVar) {
        a a = hVar.a(c);
        return a != null ? a.a() : gVar.a(c);
    }

    ail<com.google.android.gms.nearby.messages.e> a(com.google.android.gms.common.api.g gVar, com.google.android.gms.nearby.messages.e eVar) {
        return a(gVar, (Object) eVar, this.g);
    }

    ail<l> a(com.google.android.gms.common.api.g gVar, l lVar) {
        return a(gVar, (Object) lVar, this.f);
    }

    protected l a(IBinder iBinder) {
        return com.google.android.gms.nearby.messages.internal.l.a.a(iBinder);
    }

    @NonNull
    protected String a() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    void a(com.google.android.gms.internal.ahl.b<Status> bVar) {
        ((l) G()).a(new GetPermissionStatusRequest(v.a((com.google.android.gms.internal.ahl.b) bVar)));
    }

    void a(com.google.android.gms.internal.ahl.b<Status> bVar, PendingIntent pendingIntent) {
        ((l) G()).a(new UnsubscribeRequest(null, v.a((com.google.android.gms.internal.ahl.b) bVar), pendingIntent, 0));
    }

    void a(com.google.android.gms.internal.ahl.b<Status> bVar, PendingIntent pendingIntent, n nVar) {
        ((l) G()).a(new SubscribeRequest(null, nVar.a(), v.a((com.google.android.gms.internal.ahl.b) bVar), nVar.b(), pendingIntent, 0, null, g.b(nVar.c()), nVar.b));
    }

    void a(com.google.android.gms.internal.ahl.b<Status> bVar, ail<com.google.android.gms.nearby.messages.e> com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_e, com.google.android.gms.nearby.messages.e eVar) {
        if (this.g.a(eVar) != null) {
            ((l) G()).a(new UnsubscribeRequest((IBinder) this.g.a(com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_e, eVar), v.a((com.google.android.gms.internal.ahl.b) bVar), null, 0));
            this.g.b((Object) eVar);
        }
    }

    void a(com.google.android.gms.internal.ahl.b<Status> bVar, ail<com.google.android.gms.nearby.messages.e> com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_e, com.google.android.gms.nearby.messages.e eVar, n nVar, @Nullable byte[] bArr) {
        ((l) G()).a(new SubscribeRequest((IBinder) this.g.a(com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_e, eVar), nVar.a(), v.a((com.google.android.gms.internal.ahl.b) bVar), nVar.b(), null, 0, bArr, g.b(nVar.c()), nVar.b));
    }

    void a(com.google.android.gms.internal.ahl.b<Status> bVar, ail<l> com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_l, l lVar) {
        RegisterStatusCallbackRequest registerStatusCallbackRequest = new RegisterStatusCallbackRequest(v.a((com.google.android.gms.internal.ahl.b) bVar), (IBinder) this.f.a(com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_l, lVar));
        registerStatusCallbackRequest.d = true;
        ((l) G()).a(registerStatusCallbackRequest);
    }

    void a(com.google.android.gms.internal.ahl.b<Status> bVar, MessageWrapper messageWrapper) {
        ((l) G()).a(new UnpublishRequest(messageWrapper, v.a((com.google.android.gms.internal.ahl.b) bVar), this.a));
    }

    void a(com.google.android.gms.internal.ahl.b<Status> bVar, MessageWrapper messageWrapper, k kVar) {
        ((l) G()).a(new PublishRequest(messageWrapper, kVar.a(), v.a((com.google.android.gms.internal.ahl.b) bVar), e.b(kVar.b())));
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    @NonNull
    protected String b() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    void b(com.google.android.gms.internal.ahl.b<Status> bVar, ail<l> com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_l, l lVar) {
        if (this.f.a(lVar) != null) {
            RegisterStatusCallbackRequest registerStatusCallbackRequest = new RegisterStatusCallbackRequest(v.a((com.google.android.gms.internal.ahl.b) bVar), (IBinder) this.f.a(com_google_android_gms_internal_ail_com_google_android_gms_nearby_messages_l, lVar));
            registerStatusCallbackRequest.d = false;
            ((l) G()).a(registerStatusCallbackRequest);
            this.f.b((Object) lVar);
        }
    }

    @NonNull
    protected Bundle c() {
        Bundle c = super.c();
        c.putInt("NearbyPermissions", this.e);
        c.putParcelable("ClientAppContext", this.a);
        return c;
    }

    void c(int i) {
        String str;
        switch (i) {
            case 1:
                str = "ACTIVITY_STOPPED";
                break;
            case 2:
                str = "CLIENT_DISCONNECTED";
                break;
            default:
                Log.w("NearbyMessagesClient", String.format("Received unknown/unforeseen client lifecycle event %d, can't do anything with it.", new Object[]{Integer.valueOf(i)}));
                return;
        }
        if (t()) {
            HandleClientLifecycleEventRequest handleClientLifecycleEventRequest = new HandleClientLifecycleEventRequest(i);
            Log.d("NearbyMessagesClient", String.format("Emitting client lifecycle event %s", new Object[]{str}));
            ((l) G()).a(handleClientLifecycleEventRequest);
            return;
        }
        Log.d("NearbyMessagesClient", String.format("Failed to emit client lifecycle event %s due to GmsClient being disconnected", new Object[]{str}));
    }

    public void f() {
        try {
            c(2);
        } catch (RemoteException e) {
            Log.v("NearbyMessagesClient", String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", new Object[]{e}));
        }
        super.f();
    }
}
