package com.google.android.gms.nearby.messages;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;

public final class k {
    public static final k a = new a().a();
    private final Strategy b;
    @Nullable
    private final j c;

    public static class a {
        private Strategy a = Strategy.i;
        @Nullable
        private j b;

        public a a(Strategy strategy) {
            this.a = (Strategy) d.a(strategy);
            return this;
        }

        public a a(j jVar) {
            this.b = (j) d.a(jVar);
            return this;
        }

        public k a() {
            return new k(this.a, this.b);
        }
    }

    private k(Strategy strategy, @Nullable j jVar) {
        this.b = strategy;
        this.c = jVar;
    }

    public Strategy a() {
        return this.b;
    }

    @Nullable
    public j b() {
        return this.c;
    }
}
