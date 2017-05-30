package com.fimi.soul.receiver;

import android.content.Context;
import com.fimi.kernel.d.b;
import com.fimi.kernel.utils.x;
import com.fimi.soul.receiver.NetworkStateReceiver.a;

public class SpeekSignReceiver extends NetworkStateReceiver {
    public void a(a aVar, Context context) {
        if (aVar == a.Wifi || aVar == a.Mobile) {
            final b a = b.a(context);
            if (!a.d()) {
                x.b(new Runnable(this) {
                    final /* synthetic */ SpeekSignReceiver b;

                    public void run() {
                        a.a();
                    }
                });
            }
        }
    }
}
