package com.google.android.gms.nearby.messages;

import android.support.annotation.NonNull;
import com.google.android.gms.nearby.messages.internal.DistanceImpl;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface b extends Comparable<b> {
    public static final b a = new DistanceImpl(1, Double.NaN);

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        public static final int a = 1;
    }

    int a();

    int a(@NonNull b bVar);

    double b();
}
