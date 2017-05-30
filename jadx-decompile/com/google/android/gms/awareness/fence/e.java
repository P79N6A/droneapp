package com.google.android.gms.awareness.fence;

import android.app.PendingIntent;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import java.util.ArrayList;

public interface e {

    public static class a {
        private final ArrayList<UpdateFenceOperation> a = new ArrayList();

        public a a(PendingIntent pendingIntent) {
            d.a((Object) pendingIntent);
            this.a.add(UpdateFenceOperation.a(pendingIntent));
            return this;
        }

        public a a(String str) {
            d.a(str);
            this.a.add(UpdateFenceOperation.a(str));
            return this;
        }

        public a a(String str, AwarenessFence awarenessFence, PendingIntent pendingIntent) {
            d.a(str);
            d.a((Object) awarenessFence);
            d.a((Object) pendingIntent);
            this.a.add(UpdateFenceOperation.a(str, (ContextFenceStub) awarenessFence, pendingIntent));
            return this;
        }

        public e a() {
            return new FenceUpdateRequestImpl(this.a);
        }
    }
}
