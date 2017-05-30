package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface c {
    public static final String a = "com.google.android.gms.wearable.CHANNEL_EVENT";

    public interface a {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;

        void a(Channel channel);

        void a(Channel channel, int i, int i2);

        void b(Channel channel, int i, int i2);

        void c(Channel channel, int i, int i2);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public interface c extends m {
        Channel b();
    }

    i<Status> a(g gVar, a aVar);

    i<c> a(g gVar, String str, String str2);

    i<Status> b(g gVar, a aVar);
}
