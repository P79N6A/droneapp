package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.j;
import com.google.android.gms.cast.framework.k;

public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String a = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String b = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String c = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String d = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String e = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String f = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String g = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String h = "googlecast-extra_skip_step_ms";

    private void a(d dVar) {
        c b = b(dVar);
        if (b != null) {
            b.s();
        }
    }

    private void a(d dVar, long j) {
        if (j != 0) {
            c b = b(dVar);
            if (b != null && !b.k() && !b.u()) {
                b.a(b.e() + j);
            }
        }
    }

    private c b(d dVar) {
        return (dVar == null || !dVar.o()) ? null : dVar.a();
    }

    protected void a(j jVar) {
        if (jVar instanceof d) {
            a((d) jVar);
        }
    }

    protected void a(j jVar, long j) {
        if (jVar instanceof d) {
            a((d) jVar, j);
        }
    }

    protected void a(j jVar, Intent intent) {
        if ((jVar instanceof d) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            KeyEvent keyEvent = (KeyEvent) intent.getExtras().get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                a((d) jVar);
            }
        }
    }

    protected void a(String str, Intent intent) {
    }

    protected void b(j jVar) {
        if (jVar instanceof d) {
            c b = b((d) jVar);
            if (b != null && !b.u()) {
                b.e(null);
            }
        }
    }

    protected void b(j jVar, long j) {
        if (jVar instanceof d) {
            a((d) jVar, -j);
        }
    }

    protected void c(j jVar) {
        if (jVar instanceof d) {
            c b = b((d) jVar);
            if (b != null && !b.u()) {
                b.d(null);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            k b = c.a(context).b();
            boolean z = true;
            switch (action.hashCode()) {
                case -1699820260:
                    if (action.equals(e)) {
                        z = true;
                        break;
                    }
                    break;
                case -945151566:
                    if (action.equals(b)) {
                        z = true;
                        break;
                    }
                    break;
                case -945080078:
                    if (action.equals(c)) {
                        z = true;
                        break;
                    }
                    break;
                case -668151673:
                    if (action.equals(f)) {
                        z = true;
                        break;
                    }
                    break;
                case -124479363:
                    if (action.equals(g)) {
                        z = true;
                        break;
                    }
                    break;
                case 235550565:
                    if (action.equals(a)) {
                        z = false;
                        break;
                    }
                    break;
                case 1362116196:
                    if (action.equals(d)) {
                        z = true;
                        break;
                    }
                    break;
                case 1997055314:
                    if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                        z = true;
                        break;
                    }
                    break;
            }
            switch (z) {
                case false:
                    a(b.a());
                    return;
                case true:
                    b(b.a());
                    return;
                case true:
                    c(b.a());
                    return;
                case true:
                    a(b.a(), intent.getLongExtra(h, 0));
                    return;
                case true:
                    b(b.a(), intent.getLongExtra(h, 0));
                    return;
                case true:
                    b.a(true);
                    return;
                case true:
                    b.a(false);
                    return;
                case true:
                    a(b.a(), intent);
                    return;
                default:
                    a(action, intent);
                    return;
            }
        }
    }
}
