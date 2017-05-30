package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.google.android.gms.R;
import com.google.android.gms.cast.a.d;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.a.a;
import com.google.android.gms.cast.internal.m;
import java.io.IOException;

public class aga extends a {
    private static final m a = new m("MuteToggleUIController");
    private final ImageView b;
    private final String c = this.e.getString(R.string.cast_mute);
    private final String d = this.e.getString(R.string.cast_unmute);
    private final Context e;
    private final d f = new d(this) {
        final /* synthetic */ aga a;

        {
            this.a = r1;
        }

        public void b() {
            this.a.f();
        }
    };
    private final OnClickListener g = new OnClickListener(this) {
        final /* synthetic */ aga a;

        {
            this.a = r1;
        }

        public void onClick(View view) {
            com.google.android.gms.cast.framework.d b = c.a(this.a.e).b().b();
            if (b != null && b.o()) {
                try {
                    if (b.i()) {
                        b.b(false);
                        this.a.a(true);
                        return;
                    }
                    b.b(true);
                    this.a.a(false);
                } catch (IOException e) {
                    IOException e2 = e;
                    aga.a.e("Unable to call CastSession.setMute(boolean).", new Object[]{e2});
                } catch (IllegalArgumentException e3) {
                    e2 = e3;
                    aga.a.e("Unable to call CastSession.setMute(boolean).", new Object[]{e2});
                }
            }
        }
    };

    public aga(ImageView imageView, Context context) {
        this.b = imageView;
        this.e = context.getApplicationContext();
    }

    private void a(boolean z) {
        this.b.setSelected(z);
        this.b.setContentDescription(z ? this.c : this.d);
    }

    private void f() {
        com.google.android.gms.cast.framework.d b = c.a(this.e).b().b();
        if (b == null || !b.o()) {
            this.b.setEnabled(false);
            return;
        }
        this.b.setEnabled(true);
        if (b.i()) {
            a(false);
        } else {
            a(true);
        }
    }

    public void a(com.google.android.gms.cast.framework.d dVar) {
        super.a(dVar);
        this.b.setOnClickListener(this.g);
        dVar.a(this.f);
        f();
    }

    public void b() {
        this.b.setOnClickListener(null);
        super.b();
    }

    public void c() {
        this.b.setEnabled(true);
    }

    public void d() {
        this.b.setEnabled(false);
    }
}
