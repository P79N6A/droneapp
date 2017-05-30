package com.google.android.gms.drive.events;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.util.y;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.by;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class DriveEventService extends Service implements a, b, e, s {
    public static final String a = "com.google.android.gms.drive.events.HANDLE_EVENT";
    a b;
    boolean c;
    int d;
    private final String e;
    private CountDownLatch f;

    final class a extends Handler {
        final /* synthetic */ DriveEventService a;

        a(DriveEventService driveEventService) {
            this.a = driveEventService;
        }

        private Message a() {
            return obtainMessage(2);
        }

        private Message a(OnEventResponse onEventResponse) {
            return obtainMessage(1, onEventResponse);
        }

        public void handleMessage(Message message) {
            by.a("DriveEventService", "handleMessage message type:" + message.what);
            switch (message.what) {
                case 1:
                    this.a.a((OnEventResponse) message.obj);
                    return;
                case 2:
                    getLooper().quit();
                    return;
                default:
                    by.b("DriveEventService", "Unexpected message type:" + message.what);
                    return;
            }
        }
    }

    final class b extends com.google.android.gms.drive.internal.p.a {
        final /* synthetic */ DriveEventService a;

        b(DriveEventService driveEventService) {
            this.a = driveEventService;
        }

        public void a(OnEventResponse onEventResponse) {
            synchronized (this.a) {
                String valueOf = String.valueOf(onEventResponse);
                by.a("DriveEventService", new StringBuilder(String.valueOf(valueOf).length() + 9).append("onEvent: ").append(valueOf).toString());
                this.a.b();
                if (this.a.b != null) {
                    this.a.b.sendMessage(this.a.b.a(onEventResponse));
                } else {
                    by.c("DriveEventService", "Receiving event before initialize is completed.");
                }
            }
        }
    }

    protected DriveEventService() {
        this("DriveEventService");
    }

    protected DriveEventService(String str) {
        this.c = false;
        this.d = -1;
        this.e = str;
    }

    private void a(OnEventResponse onEventResponse) {
        String valueOf;
        DriveEvent a = onEventResponse.a();
        String valueOf2 = String.valueOf(a);
        by.a("DriveEventService", new StringBuilder(String.valueOf(valueOf2).length() + 20).append("handleEventMessage: ").append(valueOf2).toString());
        try {
            switch (a.a()) {
                case 1:
                    a((ChangeEvent) a);
                    return;
                case 2:
                    a((CompletionEvent) a);
                    return;
                case 4:
                    a((ChangesAvailableEvent) a);
                    return;
                case 7:
                    a((TransferStateEvent) a);
                    return;
                default:
                    String str = this.e;
                    valueOf2 = String.valueOf(a);
                    by.b(str, new StringBuilder(String.valueOf(valueOf2).length() + 17).append("Unhandled event: ").append(valueOf2).toString());
                    return;
            }
        } catch (Throwable e) {
            valueOf2 = this.e;
            valueOf = String.valueOf(a);
            by.a(valueOf2, e, new StringBuilder(String.valueOf(valueOf).length() + 22).append("Error handling event: ").append(valueOf).toString());
        }
        valueOf2 = this.e;
        valueOf = String.valueOf(a);
        by.a(valueOf2, e, new StringBuilder(String.valueOf(valueOf).length() + 22).append("Error handling event: ").append(valueOf).toString());
    }

    private void b() {
        int a = a();
        if (a != this.d) {
            if (y.a(this, a)) {
                this.d = a;
                return;
            }
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    protected int a() {
        return Binder.getCallingUid();
    }

    public void a(ChangeEvent changeEvent) {
        String str = this.e;
        String valueOf = String.valueOf(changeEvent);
        by.b(str, new StringBuilder(String.valueOf(valueOf).length() + 24).append("Unhandled change event: ").append(valueOf).toString());
    }

    public void a(ChangesAvailableEvent changesAvailableEvent) {
        String str = this.e;
        String valueOf = String.valueOf(changesAvailableEvent);
        by.b(str, new StringBuilder(String.valueOf(valueOf).length() + 35).append("Unhandled changes available event: ").append(valueOf).toString());
    }

    public void a(CompletionEvent completionEvent) {
        String str = this.e;
        String valueOf = String.valueOf(completionEvent);
        by.b(str, new StringBuilder(String.valueOf(valueOf).length() + 28).append("Unhandled completion event: ").append(valueOf).toString());
    }

    public void a(TransferStateEvent transferStateEvent) {
        String str = this.e;
        String valueOf = String.valueOf(transferStateEvent);
        by.b(str, new StringBuilder(String.valueOf(valueOf).length() + 32).append("Unhandled transfer state event: ").append(valueOf).toString());
    }

    public final synchronized IBinder onBind(Intent intent) {
        IBinder asBinder;
        if (a.equals(intent.getAction())) {
            if (this.b == null && !this.c) {
                this.c = true;
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                this.f = new CountDownLatch(1);
                new Thread(this) {
                    final /* synthetic */ DriveEventService b;

                    public void run() {
                        try {
                            Looper.prepare();
                            this.b.b = new a(this.b);
                            this.b.c = false;
                            countDownLatch.countDown();
                            by.a("DriveEventService", "Bound and starting loop");
                            Looper.loop();
                            by.a("DriveEventService", "Finished loop");
                        } finally {
                            if (this.b.f != null) {
                                this.b.f.countDown();
                            }
                        }
                    }
                }.start();
                try {
                    if (!countDownLatch.await(5000, TimeUnit.MILLISECONDS)) {
                        by.c("DriveEventService", "Failed to synchronously initialize event handler.");
                    }
                } catch (Throwable e) {
                    throw new RuntimeException("Unable to start event handler", e);
                }
            }
            asBinder = new b(this).asBinder();
        } else {
            asBinder = null;
        }
        return asBinder;
    }

    public synchronized void onDestroy() {
        by.a("DriveEventService", "onDestroy");
        if (this.b != null) {
            this.b.sendMessage(this.b.a());
            this.b = null;
            try {
                if (!this.f.await(5000, TimeUnit.MILLISECONDS)) {
                    by.b("DriveEventService", "Failed to synchronously quit event handler. Will quit itself");
                }
            } catch (InterruptedException e) {
            }
            this.f = null;
        }
        super.onDestroy();
    }

    public boolean onUnbind(Intent intent) {
        return true;
    }
}
