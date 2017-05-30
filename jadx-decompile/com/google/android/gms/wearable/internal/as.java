package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.e.b;
import com.google.android.gms.wearable.g;
import com.google.android.gms.wearable.internal.x.a;
import com.google.android.gms.wearable.m;
import com.google.android.gms.wearable.p.c;
import java.util.List;

public class as<T> extends a {
    private ail<Object> a;
    private ail<Object> b;
    private ail<b> c;
    private ail<m.b> d;
    private ail<c> e;
    private ail<Object> f;
    private ail<com.google.android.gms.wearable.c.a> g;
    private ail<com.google.android.gms.wearable.a.c> h;
    private final IntentFilter[] i;
    private final String j;

    class AnonymousClass1 implements ail.c<b> {
        final /* synthetic */ DataHolder a;

        AnonymousClass1(DataHolder dataHolder) {
            this.a = dataHolder;
        }

        public void a() {
            this.a.close();
        }

        public void a(b bVar) {
            try {
                bVar.a(new g(this.a));
            } finally {
                this.a.close();
            }
        }

        public /* synthetic */ void a(Object obj) {
            a((b) obj);
        }
    }

    class AnonymousClass2 implements ail.c<m.b> {
        final /* synthetic */ MessageEventParcelable a;

        AnonymousClass2(MessageEventParcelable messageEventParcelable) {
            this.a = messageEventParcelable;
        }

        public void a() {
        }

        public void a(m.b bVar) {
            bVar.a(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((m.b) obj);
        }
    }

    class AnonymousClass3 implements ail.c<c> {
        final /* synthetic */ NodeParcelable a;

        AnonymousClass3(NodeParcelable nodeParcelable) {
            this.a = nodeParcelable;
        }

        public void a() {
        }

        public void a(c cVar) {
            cVar.a(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((c) obj);
        }
    }

    class AnonymousClass4 implements ail.c<c> {
        final /* synthetic */ NodeParcelable a;

        AnonymousClass4(NodeParcelable nodeParcelable) {
            this.a = nodeParcelable;
        }

        public void a() {
        }

        public void a(c cVar) {
            cVar.b(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((c) obj);
        }
    }

    class AnonymousClass5 implements ail.c<com.google.android.gms.wearable.c.a> {
        final /* synthetic */ ChannelEventParcelable a;

        AnonymousClass5(ChannelEventParcelable channelEventParcelable) {
            this.a = channelEventParcelable;
        }

        public void a() {
        }

        public void a(com.google.android.gms.wearable.c.a aVar) {
            this.a.a(aVar);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.wearable.c.a) obj);
        }
    }

    class AnonymousClass6 implements ail.c<com.google.android.gms.wearable.a.c> {
        final /* synthetic */ CapabilityInfoParcelable a;

        AnonymousClass6(CapabilityInfoParcelable capabilityInfoParcelable) {
            this.a = capabilityInfoParcelable;
        }

        public void a() {
        }

        public void a(com.google.android.gms.wearable.a.c cVar) {
            cVar.a(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.wearable.a.c) obj);
        }
    }

    private as(IntentFilter[] intentFilterArr, String str) {
        this.i = (IntentFilter[]) d.a(intentFilterArr);
        this.j = str;
    }

    public static as<com.google.android.gms.wearable.c.a> a(ail<com.google.android.gms.wearable.c.a> com_google_android_gms_internal_ail_com_google_android_gms_wearable_c_a, String str, IntentFilter[] intentFilterArr) {
        as<com.google.android.gms.wearable.c.a> asVar = new as(intentFilterArr, (String) d.a(str));
        asVar.g = (ail) d.a(com_google_android_gms_internal_ail_com_google_android_gms_wearable_c_a);
        return asVar;
    }

    public static as<b> a(ail<b> com_google_android_gms_internal_ail_com_google_android_gms_wearable_e_b, IntentFilter[] intentFilterArr) {
        as<b> asVar = new as(intentFilterArr, null);
        asVar.c = (ail) d.a(com_google_android_gms_internal_ail_com_google_android_gms_wearable_e_b);
        return asVar;
    }

    private static void a(ail<?> com_google_android_gms_internal_ail_) {
        if (com_google_android_gms_internal_ail_ != null) {
            com_google_android_gms_internal_ail_.a();
        }
    }

    private static ail.c<b> b(DataHolder dataHolder) {
        return new AnonymousClass1(dataHolder);
    }

    private static ail.c<com.google.android.gms.wearable.a.c> b(CapabilityInfoParcelable capabilityInfoParcelable) {
        return new AnonymousClass6(capabilityInfoParcelable);
    }

    private static ail.c<com.google.android.gms.wearable.c.a> b(ChannelEventParcelable channelEventParcelable) {
        return new AnonymousClass5(channelEventParcelable);
    }

    private static ail.c<m.b> b(MessageEventParcelable messageEventParcelable) {
        return new AnonymousClass2(messageEventParcelable);
    }

    public static as<m.b> b(ail<m.b> com_google_android_gms_internal_ail_com_google_android_gms_wearable_m_b, IntentFilter[] intentFilterArr) {
        as<m.b> asVar = new as(intentFilterArr, null);
        asVar.d = (ail) d.a(com_google_android_gms_internal_ail_com_google_android_gms_wearable_m_b);
        return asVar;
    }

    private static ail.c<c> c(NodeParcelable nodeParcelable) {
        return new AnonymousClass3(nodeParcelable);
    }

    public static as<c> c(ail<c> com_google_android_gms_internal_ail_com_google_android_gms_wearable_p_c, IntentFilter[] intentFilterArr) {
        as<c> asVar = new as(intentFilterArr, null);
        asVar.e = (ail) d.a(com_google_android_gms_internal_ail_com_google_android_gms_wearable_p_c);
        return asVar;
    }

    private static ail.c<c> d(NodeParcelable nodeParcelable) {
        return new AnonymousClass4(nodeParcelable);
    }

    public static as<com.google.android.gms.wearable.c.a> d(ail<com.google.android.gms.wearable.c.a> com_google_android_gms_internal_ail_com_google_android_gms_wearable_c_a, IntentFilter[] intentFilterArr) {
        as<com.google.android.gms.wearable.c.a> asVar = new as(intentFilterArr, null);
        asVar.g = (ail) d.a(com_google_android_gms_internal_ail_com_google_android_gms_wearable_c_a);
        return asVar;
    }

    public static as<com.google.android.gms.wearable.a.c> e(ail<com.google.android.gms.wearable.a.c> com_google_android_gms_internal_ail_com_google_android_gms_wearable_a_c, IntentFilter[] intentFilterArr) {
        as<com.google.android.gms.wearable.a.c> asVar = new as(intentFilterArr, null);
        asVar.h = (ail) d.a(com_google_android_gms_internal_ail_com_google_android_gms_wearable_a_c);
        return asVar;
    }

    public void a() {
        a(null);
        this.a = null;
        a(null);
        this.b = null;
        a(this.c);
        this.c = null;
        a(this.d);
        this.d = null;
        a(this.e);
        this.e = null;
        a(null);
        this.f = null;
        a(this.g);
        this.g = null;
        a(this.h);
        this.h = null;
    }

    public void a(DataHolder dataHolder) {
        if (this.c != null) {
            this.c.a(b(dataHolder));
        } else {
            dataHolder.close();
        }
    }

    public void a(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
    }

    public void a(AncsNotificationParcelable ancsNotificationParcelable) {
    }

    public void a(CapabilityInfoParcelable capabilityInfoParcelable) {
        if (this.h != null) {
            this.h.a(b(capabilityInfoParcelable));
        }
    }

    public void a(ChannelEventParcelable channelEventParcelable) {
        if (this.g != null) {
            this.g.a(b(channelEventParcelable));
        }
    }

    public void a(MessageEventParcelable messageEventParcelable) {
        if (this.d != null) {
            this.d.a(b(messageEventParcelable));
        }
    }

    public void a(NodeParcelable nodeParcelable) {
        if (this.e != null) {
            this.e.a(c(nodeParcelable));
        }
    }

    public void a(List<NodeParcelable> list) {
    }

    public void b(NodeParcelable nodeParcelable) {
        if (this.e != null) {
            this.e.a(d(nodeParcelable));
        }
    }

    public IntentFilter[] b() {
        return this.i;
    }

    public String c() {
        return this.j;
    }
}
