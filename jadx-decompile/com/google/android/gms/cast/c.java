package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.app.Presentation;
import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.view.Display;
import android.view.Window;
import com.google.android.gms.drive.e;

@TargetApi(19)
public abstract class c extends Presentation {
    public c(Context context, Display display) {
        super(context, display);
        a();
    }

    public c(Context context, Display display, int i) {
        super(context, display, i);
        a();
    }

    private void a() {
        Window window = getWindow();
        if (window != null) {
            window.setType(2030);
            window.addFlags(e.a_);
            window.addFlags(ViewCompat.MEASURED_STATE_TOO_SMALL);
            window.addFlags(1024);
        }
    }
}
