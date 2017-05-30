package com.google.android.gms.nearby.messages;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;

public final class n {
    public static final n a = new a().a();
    public final boolean b;
    private final Strategy c;
    private final MessageFilter d;
    @Nullable
    private final m e;

    public static class a {
        private Strategy a = Strategy.i;
        private MessageFilter b = MessageFilter.a;
        @Nullable
        private m c;

        public a a(MessageFilter messageFilter) {
            this.b = messageFilter;
            return this;
        }

        public a a(Strategy strategy) {
            this.a = strategy;
            return this;
        }

        public a a(m mVar) {
            this.c = (m) d.a(mVar);
            return this;
        }

        public n a() {
            return new n(this.a, this.b, this.c, false);
        }
    }

    private n(Strategy strategy, MessageFilter messageFilter, @Nullable m mVar, boolean z) {
        this.c = strategy;
        this.d = messageFilter;
        this.e = mVar;
        this.b = z;
    }

    public Strategy a() {
        return this.c;
    }

    public MessageFilter b() {
        return this.d;
    }

    @Nullable
    public m c() {
        return this.e;
    }
}
