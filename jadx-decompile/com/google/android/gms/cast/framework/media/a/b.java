package com.google.android.gms.cast.framework.media.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.j;
import com.google.android.gms.cast.framework.k;
import com.google.android.gms.cast.framework.l;
import com.google.android.gms.cast.framework.media.c;
import com.google.android.gms.cast.framework.media.c.a;
import com.google.android.gms.internal.afs;
import com.google.android.gms.internal.aft;
import com.google.android.gms.internal.afu;
import com.google.android.gms.internal.afv;
import com.google.android.gms.internal.afx;
import com.google.android.gms.internal.afy;
import com.google.android.gms.internal.afz;
import com.google.android.gms.internal.aga;
import com.google.android.gms.internal.agb;
import com.google.android.gms.internal.agc;
import com.google.android.gms.internal.agd;
import com.google.android.gms.internal.age;
import com.google.android.gms.internal.agf;
import com.google.android.gms.internal.agg;
import com.google.android.gms.internal.agi;
import com.google.android.gms.internal.agj;
import com.google.android.gms.internal.agk;
import com.google.android.gms.internal.agl;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class b implements l<d>, a {
    private final Activity a;
    private final k b;
    private final Map<View, a> c = new HashMap();
    private final Set<agj> d = new HashSet();
    private a e;
    private c f;

    public b(Activity activity) {
        this.a = activity;
        this.b = com.google.android.gms.cast.framework.c.a((Context) activity).b();
        this.b.a(this, d.class);
        c(this.b.b());
    }

    private void b(View view, a aVar) {
        this.c.put(view, aVar);
        if (f()) {
            aVar.a(this.b.b());
            j();
        }
    }

    private void c(j jVar) {
        if (!f() && (jVar instanceof d) && jVar.o()) {
            d dVar = (d) jVar;
            this.f = dVar.a();
            if (this.f != null) {
                this.f.a((a) this);
                for (a a : this.c.values()) {
                    a.a(dVar);
                }
                j();
            }
        }
    }

    private void i() {
        if (f()) {
            for (a b : this.c.values()) {
                b.b();
            }
            this.f.b((a) this);
            this.f = null;
        }
    }

    private void j() {
        for (a c : this.c.values()) {
            c.c();
        }
    }

    public void a() {
        j();
        if (this.e != null) {
            this.e.a();
        }
    }

    public void a(View view) {
        b(view, new afx(view));
    }

    public void a(View view, int i) {
        b(view, new agf(view, i));
    }

    public void a(View view, long j) {
        b(view, new age(view, j));
    }

    public void a(View view, a aVar) {
        b(view, aVar);
    }

    public void a(ImageView imageView) {
        b((View) imageView, new aga(imageView, this.a));
    }

    public void a(ImageView imageView, int i, @DrawableRes int i2) {
        b((View) imageView, new afu(imageView, this.a, i, i2));
    }

    public void a(ImageView imageView, int i, View view) {
        b((View) imageView, new afu(imageView, this.a, i, view));
    }

    public void a(@NonNull ImageView imageView, @NonNull Drawable drawable, @NonNull Drawable drawable2, Drawable drawable3, View view, boolean z) {
        b((View) imageView, new agb(imageView, this.a, drawable, drawable2, drawable3, view, z));
    }

    public void a(ProgressBar progressBar) {
        a(progressBar, 1000);
    }

    public void a(ProgressBar progressBar, long j) {
        b((View) progressBar, new agc(progressBar, j));
    }

    public void a(SeekBar seekBar) {
        a(seekBar, 1000);
    }

    public void a(SeekBar seekBar, long j) {
        b((View) seekBar, new agd(seekBar, j, new OnSeekBarChangeListener(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    for (agj a : this.a.d) {
                        a.a((long) i);
                    }
                }
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                for (agj a : this.a.d) {
                    a.a(false);
                }
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                for (agj a : this.a.d) {
                    a.a(true);
                }
            }
        }));
    }

    public void a(TextView textView) {
        b((View) textView, new agi(textView, this.a.getString(R.string.cast_invalid_stream_duration_text), null));
    }

    public void a(TextView textView, View view) {
        b((View) textView, new agi(textView, this.a.getString(R.string.cast_invalid_stream_duration_text), view));
    }

    public void a(TextView textView, String str) {
        a(textView, Collections.singletonList(str));
    }

    public void a(TextView textView, List<String> list) {
        b((View) textView, new afz(textView, list));
    }

    public void a(TextView textView, boolean z) {
        a(textView, z, 1000);
    }

    public void a(TextView textView, boolean z, long j) {
        a com_google_android_gms_internal_agj = new agj(textView, j, this.a.getString(R.string.cast_invalid_stream_position_text));
        if (z) {
            this.d.add(com_google_android_gms_internal_agj);
        }
        b((View) textView, com_google_android_gms_internal_agj);
    }

    public void a(d dVar) {
    }

    public void a(d dVar, int i) {
        i();
    }

    public void a(d dVar, String str) {
        c((j) dVar);
    }

    public void a(d dVar, boolean z) {
        c((j) dVar);
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    public void b() {
        j();
        if (this.e != null) {
            this.e.b();
        }
    }

    public void b(View view) {
        b(view, new afv(view, this.a));
    }

    public void b(View view, int i) {
        b(view, new agg(view, i));
    }

    public void b(View view, long j) {
        a(view, -j);
    }

    public void b(ImageView imageView, int i, @DrawableRes int i2) {
        b((View) imageView, new aft(imageView, this.a, i, i2));
    }

    public void b(TextView textView, String str) {
        b(textView, Collections.singletonList(str));
    }

    public void b(TextView textView, List<String> list) {
        b((View) textView, new afy(textView, list));
    }

    public void b(d dVar) {
    }

    public void b(d dVar, int i) {
        i();
    }

    public void b(d dVar, String str) {
    }

    public void c() {
        j();
        if (this.e != null) {
            this.e.c();
        }
    }

    public void c(View view) {
        b(view, new afs(view, this.a));
    }

    public void c(View view, int i) {
        b(view, new agl(view, i));
    }

    public void c(d dVar, int i) {
        i();
    }

    public void d() {
        j();
        if (this.e != null) {
            this.e.d();
        }
    }

    public void d(View view, int i) {
        b(view, new agk(view, i));
    }

    public void d(d dVar, int i) {
    }

    public void e() {
        for (a d : this.c.values()) {
            d.d();
        }
        if (this.e != null) {
            this.e.e();
        }
    }

    public boolean f() {
        return this.f != null;
    }

    public c g() {
        return this.f;
    }

    public void h() {
        i();
        this.c.clear();
        this.b.b(this, d.class);
        this.e = null;
    }
}
