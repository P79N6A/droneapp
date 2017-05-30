package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.support.annotation.BinderThread;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.l;
import com.google.android.gms.common.util.y;
import com.google.android.gms.measurement.internal.y.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class ak extends a {
    private final aj a;
    private Boolean b;
    @Nullable
    private String c;

    public ak(aj ajVar) {
        this(ajVar, null);
    }

    public ak(aj ajVar, @Nullable String str) {
        d.a(ajVar);
        this.a = ajVar;
        this.c = str;
    }

    @BinderThread
    private void c(AppMetadata appMetadata) {
        d.a(appMetadata);
        c(appMetadata.b);
        this.a.o().h(appMetadata.c);
    }

    @BinderThread
    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            this.a.f().f().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        try {
            b(str);
        } catch (SecurityException e) {
            this.a.f().f().a("Measurement Service called with invalid calling package", str);
            throw e;
        }
    }

    @BinderThread
    public List<UserAttributeParcel> a(final AppMetadata appMetadata, boolean z) {
        Object e;
        c(appMetadata);
        try {
            List<l> list = (List) this.a.h().a(new Callable<List<l>>(this) {
                final /* synthetic */ ak b;

                public List<l> a() {
                    this.b.a.K();
                    return this.b.a.p().a(appMetadata.b);
                }

                public /* synthetic */ Object call() {
                    return a();
                }
            }).get();
            List<UserAttributeParcel> arrayList = new ArrayList(list.size());
            for (l lVar : list) {
                if (z || !m.l(lVar.b)) {
                    arrayList.add(new UserAttributeParcel(lVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            this.a.f().f().a("Failed to get user attributes", e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            this.a.f().f().a("Failed to get user attributes", e);
            return null;
        }
    }

    @BinderThread
    public void a(final AppMetadata appMetadata) {
        c(appMetadata);
        this.a.h().a(new Runnable(this) {
            final /* synthetic */ ak b;

            public void run() {
                this.b.a.K();
                this.b.a(appMetadata.h);
                this.b.a.b(appMetadata);
            }
        });
    }

    @BinderThread
    public void a(final EventParcel eventParcel, final AppMetadata appMetadata) {
        d.a(eventParcel);
        c(appMetadata);
        this.a.h().a(new Runnable(this) {
            final /* synthetic */ ak c;

            public void run() {
                this.c.a.K();
                this.c.a(appMetadata.h);
                this.c.a.a(eventParcel, appMetadata);
            }
        });
    }

    @BinderThread
    public void a(final EventParcel eventParcel, final String str, final String str2) {
        d.a(eventParcel);
        d.a(str);
        c(str);
        this.a.h().a(new Runnable(this) {
            final /* synthetic */ ak d;

            public void run() {
                this.d.a.K();
                this.d.a(str2);
                this.d.a.a(eventParcel, str);
            }
        });
    }

    @BinderThread
    public void a(final UserAttributeParcel userAttributeParcel, final AppMetadata appMetadata) {
        d.a(userAttributeParcel);
        c(appMetadata);
        if (userAttributeParcel.a() == null) {
            this.a.h().a(new Runnable(this) {
                final /* synthetic */ ak c;

                public void run() {
                    this.c.a.K();
                    this.c.a(appMetadata.h);
                    this.c.a.b(userAttributeParcel, appMetadata);
                }
            });
        } else {
            this.a.h().a(new Runnable(this) {
                final /* synthetic */ ak c;

                public void run() {
                    this.c.a.K();
                    this.c.a(appMetadata.h);
                    this.c.a.a(userAttributeParcel, appMetadata);
                }
            });
        }
    }

    @WorkerThread
    void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(":", 2);
            if (split.length == 2) {
                try {
                    long longValue = Long.valueOf(split[0]).longValue();
                    if (longValue > 0) {
                        this.a.e().b.a(split[1], longValue);
                    } else {
                        this.a.f().z().a("Combining sample with a non-positive weight", Long.valueOf(longValue));
                    }
                } catch (NumberFormatException e) {
                    this.a.f().z().a("Combining sample with a non-number weight", split[0]);
                }
            }
        }
    }

    @BinderThread
    public byte[] a(final EventParcel eventParcel, final String str) {
        Object e;
        d.a(str);
        d.a(eventParcel);
        c(str);
        this.a.f().D().a("Log and bundle. event", eventParcel.b);
        long c = this.a.s().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.h().b(new Callable<byte[]>(this) {
                final /* synthetic */ ak c;

                public byte[] a() {
                    this.c.a.K();
                    return this.c.a.b(eventParcel, str);
                }

                public /* synthetic */ Object call() {
                    return a();
                }
            }).get();
            if (bArr == null) {
                this.a.f().f().a("Log and bundle returned null");
                bArr = new byte[0];
            }
            this.a.f().D().a("Log and bundle processed. event, size, time_ms", eventParcel.b, Integer.valueOf(bArr.length), Long.valueOf((this.a.s().c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException e2) {
            e = e2;
            this.a.f().f().a("Failed to log and bundle. event, error", eventParcel.b, e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            this.a.f().f().a("Failed to log and bundle. event, error", eventParcel.b, e);
            return null;
        }
    }

    @BinderThread
    public void b(final AppMetadata appMetadata) {
        c(appMetadata);
        this.a.h().a(new Runnable(this) {
            final /* synthetic */ ak b;

            public void run() {
                this.b.a.K();
                this.b.a(appMetadata.h);
                this.b.a.a(appMetadata);
            }
        });
    }

    protected void b(String str) {
        if (this.c == null && l.a(this.a.r(), Binder.getCallingUid(), str)) {
            this.c = str;
        }
        if (!str.equals(this.c)) {
            if (this.b == null) {
                boolean z = ("com.google.android.gms".equals(this.c) || y.a(this.a.r(), Binder.getCallingUid())) && !this.a.D();
                this.b = Boolean.valueOf(z);
            }
            if (!this.b.booleanValue()) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
        }
    }
}
