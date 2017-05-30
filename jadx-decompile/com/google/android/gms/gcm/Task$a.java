package com.google.android.gms.gcm;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import com.google.android.gms.common.internal.d;

public abstract class Task$a {
    protected int a;
    protected String b;
    protected String c;
    protected boolean d;
    protected boolean e;
    protected boolean f;
    protected g g = g.a;
    protected Bundle h;

    @CallSuper
    protected void a() {
        d.b(this.b != null, "Must provide an endpoint for this task by calling setService(ComponentName).");
        a.a(this.c);
        Task.a(this.g);
        if (this.e) {
            Task.b(this.h);
        }
    }

    public abstract Task$a b(int i);

    public abstract Task$a b(Bundle bundle);

    public abstract Task$a b(Class<? extends GcmTaskService> cls);

    public abstract Task$a b(String str);

    public abstract Task c();

    public abstract Task$a d(boolean z);

    public abstract Task$a e(boolean z);

    public abstract Task$a f(boolean z);
}
