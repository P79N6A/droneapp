package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.g.c;
import com.google.android.gms.g.d;
import com.google.android.gms.internal.hy.a;
import com.google.firebase.auth.o;
import com.google.firebase.b;
import com.google.firebase.b$a;
import java.util.concurrent.ScheduledExecutorService;

public class gu implements hy {
    private final ScheduledExecutorService a;
    private final b b;

    public gu(@NonNull b bVar, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.b = bVar;
        this.a = scheduledExecutorService;
    }

    private b$a b(final hy.b bVar) {
        return new b$a(this) {
            final /* synthetic */ gu b;

            public void a(@NonNull final mr mrVar) {
                this.b.a.execute(new Runnable(this) {
                    final /* synthetic */ AnonymousClass3 b;

                    public void run() {
                        bVar.a(mrVar.a());
                    }
                });
            }
        };
    }

    public void a(hy.b bVar) {
        this.b.a(b(bVar));
    }

    public void a(boolean z, @NonNull final a aVar) {
        this.b.b(z).a(this.a, new d<o>(this) {
            final /* synthetic */ gu b;

            public void a(o oVar) {
                aVar.a(oVar.a());
            }

            public /* synthetic */ void a(Object obj) {
                a((o) obj);
            }
        }).a(this.a, new c(this) {
            final /* synthetic */ gu b;

            private boolean b(Exception exception) {
                return (exception instanceof com.google.firebase.a) || (exception instanceof ms);
            }

            public void a(@NonNull Exception exception) {
                if (b(exception)) {
                    aVar.a(null);
                } else {
                    aVar.b(exception.getMessage());
                }
            }
        });
    }
}
