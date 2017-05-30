package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.d;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class h implements ServiceConnection {
    boolean a = false;
    private final BlockingQueue<IBinder> b = new LinkedBlockingQueue();

    public IBinder a() {
        d.c("BlockingServiceConnection.getService() called on main thread");
        if (this.a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.a = true;
        return (IBinder) this.b.take();
    }

    public IBinder a(long j, TimeUnit timeUnit) {
        d.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.a = true;
        IBinder iBinder = (IBinder) this.b.poll(j, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
