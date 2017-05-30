package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.b;
import com.google.android.gms.drive.events.e;
import com.google.android.gms.drive.events.h;
import com.google.android.gms.drive.events.k;
import com.google.android.gms.drive.events.m;
import com.google.android.gms.drive.events.o;
import java.util.ArrayList;
import java.util.List;

public class f extends com.google.android.gms.drive.internal.p.a {
    private final int a;
    private final h b;
    private final a c;
    private final List<Integer> d = new ArrayList();

    private static class a extends Handler {
        private final Context a;

        class AnonymousClass1 implements m {
            final /* synthetic */ com.google.android.gms.drive.m a;

            AnonymousClass1(com.google.android.gms.drive.m mVar) {
                this.a = mVar;
            }
        }

        private a(Looper looper, Context context) {
            super(looper);
            this.a = context;
        }

        private static void a(o oVar, QueryResultEventParcelable queryResultEventParcelable) {
            DataHolder b = queryResultEventParcelable.b();
            if (b != null) {
                oVar.a(new AnonymousClass1(new com.google.android.gms.drive.m(b)));
            }
            if (queryResultEventParcelable.c()) {
                oVar.a(queryResultEventParcelable.d());
            }
        }

        public void a(h hVar, DriveEvent driveEvent) {
            sendMessage(obtainMessage(1, new Pair(hVar, driveEvent)));
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    h hVar = (h) pair.first;
                    DriveEvent driveEvent = (DriveEvent) pair.second;
                    switch (driveEvent.a()) {
                        case 1:
                            ((com.google.android.gms.drive.events.a) hVar).a((ChangeEvent) driveEvent);
                            return;
                        case 2:
                            ((b) hVar).a((CompletionEvent) driveEvent);
                            return;
                        case 3:
                            a((o) hVar, (QueryResultEventParcelable) driveEvent);
                            return;
                        case 4:
                            ((e) hVar).a((ChangesAvailableEvent) driveEvent);
                            return;
                        case 8:
                            ((k) hVar).a(new com.google.android.gms.drive.events.internal.a(((TransferProgressEvent) driveEvent).b()));
                            return;
                        default:
                            String valueOf = String.valueOf(driveEvent);
                            by.b("EventCallback", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unexpected event: ").append(valueOf).toString());
                            return;
                    }
                default:
                    by.a(this.a, "EventCallback", "Don't know how to handle this event");
                    return;
            }
        }
    }

    public f(Looper looper, Context context, int i, h hVar) {
        this.a = i;
        this.b = hVar;
        this.c = new a(looper, context);
    }

    public void a(int i) {
        this.d.add(Integer.valueOf(i));
    }

    public void a(OnEventResponse onEventResponse) {
        DriveEvent a = onEventResponse.a();
        d.a(this.a == a.a());
        d.a(this.d.contains(Integer.valueOf(a.a())));
        this.c.a(this.b, a);
    }

    public boolean b(int i) {
        return this.d.contains(Integer.valueOf(i));
    }
}
