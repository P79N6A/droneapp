package com.mining.app.zxing.b;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;

public final class e implements OnCancelListener, OnClickListener, Runnable {
    private final Activity a;

    public e(Activity activity) {
        this.a = activity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        run();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        run();
    }

    public void run() {
        this.a.finish();
    }
}
