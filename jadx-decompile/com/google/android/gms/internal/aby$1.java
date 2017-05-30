package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.gms.ads.internal.u;

class aby$1 implements OnClickListener {
    final /* synthetic */ aby a;

    aby$1(aby com_google_android_gms_internal_aby) {
        this.a = com_google_android_gms_internal_aby;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case 0:
                aby.a(this.a);
                return;
            case 1:
                abr.a("Debug mode [Creative Preview] selected.");
                abu.a(new Runnable(this) {
                    final /* synthetic */ aby$1 a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        u.m().a(aby.b(this.a.a), aby.c(this.a.a));
                    }
                });
                return;
            case 2:
                abr.a("Debug mode [Troubleshooting] selected.");
                abu.a(new Runnable(this) {
                    final /* synthetic */ aby$1 a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        u.m().b(aby.b(this.a.a), aby.c(this.a.a));
                    }
                });
                return;
            default:
                return;
        }
    }
}
