package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.os.RemoteException;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.agu.a;
import com.google.android.gms.internal.agu.b;
import com.google.android.gms.internal.agu.c;

@TargetApi(19)
protected final class agu$b$a extends a {
    final /* synthetic */ b b;
    private final agv c;

    public agu$b$a(b bVar, agv com_google_android_gms_internal_agv) {
        this.b = bVar;
        super(bVar.c);
        this.c = com_google_android_gms_internal_agv;
    }

    private int a(int i, int i2) {
        if (i >= i2) {
            i = i2;
        }
        return (i * 320) / 1080;
    }

    public void a(int i) {
        agu.a().b("onError: %d", new Object[]{Integer.valueOf(i)});
        agu.a(this.b.c);
        this.b.b(new c(Status.c));
    }

    public void a(int i, int i2, Surface surface) {
        agu.a().b("onConnected", new Object[0]);
        DisplayManager displayManager = (DisplayManager) this.c.B().getSystemService("display");
        if (displayManager == null) {
            agu.a().e("Unable to get the display manager", new Object[0]);
            this.b.b(new c(Status.c));
            return;
        }
        agu.a(this.b.c);
        agu.a(this.b.c, displayManager.createVirtualDisplay("private_display", i, i2, a(i, i2), surface, 2));
        if (agu.d(this.b.c) == null) {
            agu.a().e("Unable to create virtual display", new Object[0]);
            this.b.b(new c(Status.c));
        } else if (agu.d(this.b.c).getDisplay() == null) {
            agu.a().e("Virtual display does not have a display", new Object[0]);
            this.b.b(new c(Status.c));
        } else {
            try {
                this.c.a(this, agu.d(this.b.c).getDisplay().getDisplayId());
            } catch (RemoteException e) {
                agu.a().e("Unable to provision the route's new virtual Display", new Object[0]);
                this.b.b(new c(Status.c));
            } catch (IllegalStateException e2) {
                agu.a().e("Unable to provision the route's new virtual Display", new Object[0]);
                this.b.b(new c(Status.c));
            }
        }
    }

    public void b() {
        agu.a().b("onConnectedWithDisplay", new Object[0]);
        if (agu.d(this.b.c) == null) {
            agu.a().e("There is no virtual display", new Object[0]);
            this.b.b(new c(Status.c));
            return;
        }
        Display display = agu.d(this.b.c).getDisplay();
        if (display != null) {
            this.b.b(new c(display));
            return;
        }
        agu.a().e("Virtual display no longer has a display", new Object[0]);
        this.b.b(new c(Status.c));
    }
}
