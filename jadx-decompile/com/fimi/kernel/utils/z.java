package com.fimi.kernel.utils;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

public class z {
    public static final int a = 0;
    public static int b = 1;
    public static int c = 0;
    private static Context d = null;
    private static Toast e;
    private static Handler f = null;
    private static Runnable g = new Runnable() {
        public void run() {
            z.e.cancel();
        }
    };
    private static Handler h = new Handler() {
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    z.a(z.d, message.getData().getString("TEXT"), 1000);
                    return;
                default:
                    return;
            }
        }
    };

    public static void a(Context context, int i) {
        d = context;
        Toast.makeText(context, "" + context.getResources().getText(i), 0).show();
    }

    public static void a(Context context, int i, int i2) {
        a(context, context.getResources().getString(i), i2);
    }

    public static void a(Context context, String str) {
        d = context;
        if (!n.b(str)) {
            Toast.makeText(context, str, 0).show();
        }
    }

    public static void a(Context context, String str, int i) {
        if (context != null) {
            f = new Handler(context.getMainLooper());
            f.removeCallbacks(g);
            if (e != null) {
                e.setText(str);
            } else if (i == 0) {
                e = Toast.makeText(context, str, 0);
            } else {
                e = Toast.makeText(context, str, 1);
            }
            if (1 == i) {
                f.postDelayed(g, 3500);
            } else if (i == 0) {
                f.postDelayed(g, 2000);
            } else {
                f.postDelayed(g, (long) i);
            }
            e.show();
        }
    }

    public static void b(Context context, int i) {
        d = context;
        Message obtainMessage = h.obtainMessage(0);
        Bundle bundle = new Bundle();
        if (context != null && bundle != null) {
            bundle.putString("TEXT", context.getResources().getString(i));
            obtainMessage.setData(bundle);
            h.sendMessage(obtainMessage);
        }
    }

    public static void b(Context context, String str) {
        d = context;
        Message obtainMessage = h.obtainMessage(0);
        Bundle bundle = new Bundle();
        bundle.putString("TEXT", str);
        obtainMessage.setData(bundle);
        h.sendMessage(obtainMessage);
    }
}
