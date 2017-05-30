package com.google.android.gms.awareness.fence;

import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class FenceState extends AbstractSafeParcelable {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static FenceState a(Intent intent) {
        return FenceStateImpl.b(intent);
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract String d();
}
