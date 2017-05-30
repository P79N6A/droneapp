package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.j;
import com.google.android.gms.cast.framework.k;
import com.google.android.gms.cast.framework.l;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.c;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.afr;
import com.google.android.gms.internal.afw;

public abstract class ExpandedControllerActivity extends AppCompatActivity implements a {
    private final l<d> a = new b();
    private final com.google.android.gms.cast.framework.media.c.a b = new a();
    private int c;
    private TextView d;
    private SeekBar e;
    private afr f;
    private int[] g;
    private ImageView[] h = new ImageView[4];
    private View i;
    private com.google.android.gms.cast.framework.media.a.b j;
    private k k;

    private class a implements com.google.android.gms.cast.framework.media.c.a {
        final /* synthetic */ ExpandedControllerActivity a;

        private a(ExpandedControllerActivity expandedControllerActivity) {
            this.a = expandedControllerActivity;
        }

        public void a() {
            c a = this.a.i();
            if (a == null || !a.t()) {
                this.a.finish();
                return;
            }
            this.a.k();
            this.a.l();
        }

        public void b() {
            this.a.j();
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
            this.a.d.setText(this.a.getResources().getString(R.string.cast_expanded_controller_loading));
        }
    }

    private class b implements l<d> {
        final /* synthetic */ ExpandedControllerActivity a;

        private b(ExpandedControllerActivity expandedControllerActivity) {
            this.a = expandedControllerActivity;
        }

        public void a(d dVar) {
        }

        public void a(d dVar, int i) {
            this.a.finish();
        }

        public void a(d dVar, String str) {
        }

        public void a(d dVar, boolean z) {
        }

        public /* synthetic */ void a(j jVar, int i) {
            b((d) jVar, i);
        }

        public void b(d dVar) {
        }

        public void b(d dVar, int i) {
        }

        public void b(d dVar, String str) {
        }

        public /* synthetic */ void b(j jVar, int i) {
            a((d) jVar, i);
        }

        public void c(d dVar, int i) {
        }

        public void d(d dVar, int i) {
        }
    }

    private afr a(RelativeLayout relativeLayout) {
        View com_google_android_gms_internal_afr = new afr(this);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(0, R.id.end_text);
        layoutParams.addRule(1, R.id.start_text);
        layoutParams.addRule(6, R.id.seek_bar);
        layoutParams.addRule(7, R.id.seek_bar);
        layoutParams.addRule(5, R.id.seek_bar);
        layoutParams.addRule(8, R.id.seek_bar);
        com_google_android_gms_internal_afr.setLayoutParams(layoutParams);
        com_google_android_gms_internal_afr.setPadding(this.e.getPaddingLeft(), this.e.getPaddingTop(), this.e.getPaddingRight(), this.e.getPaddingBottom());
        com_google_android_gms_internal_afr.setContentDescription(getResources().getString(R.string.cast_seek_bar));
        com_google_android_gms_internal_afr.setBackgroundColor(0);
        relativeLayout.addView(com_google_android_gms_internal_afr);
        return com_google_android_gms_internal_afr;
    }

    private void a(Toolbar toolbar) {
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.quantum_ic_keyboard_arrow_down_white_36);
        }
    }

    private void a(View view, int i, int i2, com.google.android.gms.cast.framework.media.a.b bVar) {
        ImageView imageView = (ImageView) view.findViewById(i);
        if (i2 == R.id.cast_button_type_empty) {
            imageView.setVisibility(4);
        } else if (i2 == R.id.cast_button_type_custom) {
        } else {
            if (i2 == R.id.cast_button_type_play_pause_toggle) {
                a(imageView, bVar);
            } else if (i2 == R.id.cast_button_type_skip_previous) {
                b(imageView, bVar);
            } else if (i2 == R.id.cast_button_type_skip_next) {
                c(imageView, bVar);
            } else if (i2 == R.id.cast_button_type_rewind_30_seconds) {
                d(imageView, bVar);
            } else if (i2 == R.id.cast_button_type_forward_30_seconds) {
                e(imageView, bVar);
            } else if (i2 == R.id.cast_button_type_mute_toggle) {
                f(imageView, bVar);
            } else if (i2 == R.id.cast_button_type_closed_caption) {
                g(imageView, bVar);
            }
        }
    }

    private void a(View view, com.google.android.gms.cast.framework.media.a.b bVar) {
        bVar.a((ImageView) view.findViewById(R.id.background_image_view), -1, view.findViewById(R.id.background_place_holder_image_view));
        this.d = (TextView) view.findViewById(R.id.status_text);
        bVar.a((ProgressBar) view.findViewById(R.id.loading_indicator));
        TextView textView = (TextView) view.findViewById(R.id.start_text);
        TextView textView2 = (TextView) view.findViewById(R.id.end_text);
        View view2 = (ImageView) view.findViewById(R.id.live_stream_indicator);
        this.e = (SeekBar) view.findViewById(R.id.seek_bar);
        g();
        View view3 = (SeekBar) view.findViewById(R.id.live_stream_seek_bar);
        bVar.a(textView, true);
        bVar.a(textView2, view2);
        bVar.a(this.e);
        bVar.a(view3, new afw(view3, this.e));
        this.h[0] = (ImageView) view.findViewById(R.id.button_0);
        this.h[1] = (ImageView) view.findViewById(R.id.button_1);
        this.h[2] = (ImageView) view.findViewById(R.id.button_2);
        this.h[3] = (ImageView) view.findViewById(R.id.button_3);
        a(view, R.id.button_0, this.g[0], bVar);
        a(view, R.id.button_1, this.g[1], bVar);
        a(view, R.id.button_play_pause_toggle, R.id.cast_button_type_play_pause_toggle, bVar);
        a(view, R.id.button_2, this.g[2], bVar);
        a(view, R.id.button_3, this.g[3], bVar);
        this.i = findViewById(R.id.ad_container);
        this.f = a((RelativeLayout) view.findViewById(R.id.seek_bar_controls));
    }

    private void a(ImageView imageView, com.google.android.gms.cast.framework.media.a.b bVar) {
        imageView.setBackgroundResource(this.c);
        Drawable drawable = getResources().getDrawable(R.drawable.cast_ic_expanded_controller_pause);
        Drawable drawable2 = getResources().getDrawable(R.drawable.cast_ic_expanded_controller_play);
        Drawable drawable3 = getResources().getDrawable(R.drawable.cast_ic_expanded_controller_stop);
        imageView.setImageDrawable(drawable2);
        bVar.a(imageView, drawable2, drawable, drawable3, null, false);
    }

    private void b(ImageView imageView, com.google.android.gms.cast.framework.media.a.b bVar) {
        imageView.setBackgroundResource(this.c);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.cast_ic_expanded_controller_skip_previous));
        imageView.setContentDescription(getResources().getString(R.string.cast_skip_prev));
        bVar.b((View) imageView, 0);
    }

    private void c(ImageView imageView, com.google.android.gms.cast.framework.media.a.b bVar) {
        imageView.setBackgroundResource(this.c);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.cast_ic_expanded_controller_skip_next));
        imageView.setContentDescription(getResources().getString(R.string.cast_skip_next));
        bVar.a((View) imageView, 0);
    }

    private void d(ImageView imageView, com.google.android.gms.cast.framework.media.a.b bVar) {
        imageView.setBackgroundResource(this.c);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.cast_ic_expanded_controller_rewind30));
        imageView.setContentDescription(getResources().getString(R.string.cast_rewind_30));
        bVar.b((View) imageView, (long) NotificationOptions.b);
    }

    private int e() {
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{android.support.v7.appcompat.R.attr.selectableItemBackgroundBorderless});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void e(ImageView imageView, com.google.android.gms.cast.framework.media.a.b bVar) {
        imageView.setBackgroundResource(this.c);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.cast_ic_expanded_controller_forward30));
        imageView.setContentDescription(getResources().getString(R.string.cast_forward_30));
        bVar.a((View) imageView, (long) NotificationOptions.b);
    }

    private void f(ImageView imageView, com.google.android.gms.cast.framework.media.a.b bVar) {
        imageView.setBackgroundResource(this.c);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.cast_ic_expanded_controller_mute));
        bVar.a(imageView);
    }

    private int[] f() {
        boolean z = true;
        TypedArray obtainStyledAttributes = obtainStyledAttributes(null, R.styleable.CastExpandedController, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.CastExpandedController_castControlButtons, 0);
        if (resourceId != 0) {
            TypedArray obtainTypedArray = getResources().obtainTypedArray(resourceId);
            if (obtainTypedArray.length() != 4) {
                z = false;
            }
            com.google.android.gms.common.internal.d.b(z);
            int[] iArr = new int[obtainTypedArray.length()];
            for (int i = 0; i < obtainTypedArray.length(); i++) {
                iArr[i] = obtainTypedArray.getResourceId(i, 0);
            }
            obtainTypedArray.recycle();
            return iArr;
        }
        obtainStyledAttributes.recycle();
        return new int[]{R.id.cast_button_type_empty, R.id.cast_button_type_empty, R.id.cast_button_type_empty, R.id.cast_button_type_empty};
    }

    @TargetApi(21)
    private void g() {
        if (s.k()) {
            this.e.setProgressBackgroundTintMode(Mode.MULTIPLY);
            this.e.setProgressBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.cast_expanded_controller_seek_bar_progress_background_tint_color)));
            this.e.setSplitTrack(false);
        }
    }

    private void g(ImageView imageView, com.google.android.gms.cast.framework.media.a.b bVar) {
        imageView.setBackgroundResource(this.c);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.cast_ic_expanded_controller_closed_caption));
        bVar.c((View) imageView);
    }

    @TargetApi(19)
    private void h() {
        if (s.a()) {
            int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
            if (s.d()) {
                systemUiVisibility ^= 2;
            }
            if (s.e()) {
                systemUiVisibility ^= 4;
            }
            if (s.h()) {
                systemUiVisibility ^= 4096;
            }
            getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
            if (s.g()) {
                setImmersive(true);
            }
        }
    }

    private c i() {
        d b = this.k.b();
        return (b == null || !b.o()) ? null : b.a();
    }

    private void j() {
        c i = i();
        if (i != null && i.t()) {
            MediaInfo h = i.h();
            if (h != null) {
                MediaMetadata e = h.e();
                if (e != null) {
                    ActionBar supportActionBar = getSupportActionBar();
                    if (supportActionBar != null) {
                        supportActionBar.setTitle(e.b(MediaMetadata.k));
                    }
                }
            }
        }
    }

    private void k() {
        d b = this.k.b();
        if (b != null) {
            CastDevice b2 = b.b();
            if (b2 != null) {
                if (!TextUtils.isEmpty(b2.e())) {
                    this.d.setText(getResources().getString(R.string.cast_casting_to_device, new Object[]{r0}));
                    return;
                }
            }
        }
        this.d.setText("");
    }

    private void l() {
        MediaInfo mediaInfo = null;
        c i = i();
        MediaStatus g = i == null ? null : i.g();
        boolean z = g != null && g.r();
        if (z) {
            this.e.setEnabled(false);
            this.i.setVisibility(0);
        } else {
            this.e.setEnabled(true);
            this.i.setVisibility(8);
        }
        if (i != null) {
            mediaInfo = i.h();
        }
        if (mediaInfo != null) {
            this.f.a(this.e.getMax());
            this.f.a(mediaInfo.j(), -1);
        }
    }

    public final int a() {
        return 4;
    }

    public final int a(int i) {
        return this.g[i];
    }

    public final ImageView b(int i) {
        return this.h[i];
    }

    public com.google.android.gms.cast.framework.media.a.b b() {
        return this.j;
    }

    public TextView c() {
        return this.d;
    }

    public SeekBar d() {
        return this.e;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.google.android.gms.cast.framework.c.a((Context) this).a(this, bundle);
        this.k = com.google.android.gms.cast.framework.c.a((Context) this).b();
        if (this.k.b() == null) {
            finish();
        }
        this.j = new com.google.android.gms.cast.framework.media.a.b(this);
        this.j.a(this.b);
        setContentView(R.layout.cast_expanded_controller_activity);
        this.c = e();
        this.g = f();
        a(findViewById(R.id.expanded_controller_layout), this.j);
        a((Toolbar) findViewById(R.id.toolbar));
        k();
        j();
    }

    protected void onDestroy() {
        if (this.j != null) {
            this.j.a(null);
            this.j.h();
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return true;
    }

    protected void onPause() {
        com.google.android.gms.cast.framework.c.a((Context) this).b().b(this.a, d.class);
        super.onPause();
    }

    protected void onResume() {
        com.google.android.gms.cast.framework.c.a((Context) this).b().a(this.a, d.class);
        d b = com.google.android.gms.cast.framework.c.a((Context) this).b().b();
        if (b == null || !(b.o() || b.p())) {
            finish();
        }
        super.onResume();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            h();
        }
    }
}
