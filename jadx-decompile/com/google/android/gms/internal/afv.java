package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.a.a;
import java.lang.ref.WeakReference;

public class afv extends a {
    private final View a;
    private final WeakReference<Activity> b;
    private final OnClickListener c;
    private final ComponentName d;

    public afv(View view, Activity activity) {
        this.a = view;
        this.b = new WeakReference(activity);
        CastMediaOptions g = c.a(activity).a().g();
        if (g == null || TextUtils.isEmpty(g.d())) {
            this.d = null;
            this.c = null;
            return;
        }
        this.d = new ComponentName(activity.getApplicationContext(), g.d());
        this.c = new OnClickListener(this) {
            final /* synthetic */ afv a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                Activity activity = (Activity) this.a.b.get();
                if (activity != null) {
                    Intent intent = new Intent();
                    intent.setComponent(this.a.d);
                    activity.startActivity(intent);
                }
            }
        };
    }

    public void a(d dVar) {
        super.a(dVar);
        this.a.setOnClickListener(this.c);
    }

    public void b() {
        this.a.setOnClickListener(null);
        super.b();
    }
}
