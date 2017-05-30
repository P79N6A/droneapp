package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v4.app.Fragment;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.a.b;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.internal.d;

public class MiniControllerFragment extends Fragment implements a {
    private static final m a = new m("MiniControllerFragment");
    private boolean b;
    private int c;
    private int d;
    private int[] e;
    private ImageView[] f = new ImageView[3];
    private int g;
    private b h;

    private void a(Context context, AttributeSet attributeSet) {
        boolean z = true;
        int i = 0;
        if (this.e == null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CastMiniController, R.attr.castMiniControllerStyle, R.style.CastMiniController);
            this.b = obtainStyledAttributes.getBoolean(R.styleable.CastMiniController_castShowImageThumbnail, true);
            this.c = obtainStyledAttributes.getResourceId(R.styleable.CastMiniController_castTitleTextAppearance, 0);
            this.d = obtainStyledAttributes.getResourceId(R.styleable.CastMiniController_castSubtitleTextAppearance, 0);
            int resourceId = obtainStyledAttributes.getResourceId(R.styleable.CastMiniController_castControlButtons, 0);
            if (resourceId != 0) {
                TypedArray obtainTypedArray = context.getResources().obtainTypedArray(resourceId);
                if (obtainTypedArray.length() != 3) {
                    z = false;
                }
                d.b(z);
                this.e = new int[obtainTypedArray.length()];
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    this.e[i2] = obtainTypedArray.getResourceId(i2, 0);
                }
                obtainTypedArray.recycle();
                if (this.b) {
                    this.e[0] = R.id.cast_button_type_empty;
                }
                this.g = 0;
                int[] iArr = this.e;
                resourceId = iArr.length;
                while (i < resourceId) {
                    if (iArr[i] != R.id.cast_button_type_empty) {
                        this.g++;
                    }
                    i++;
                }
            } else {
                a.d("Unable to read attribute castControlButtons.", new Object[0]);
                this.e = new int[]{R.id.cast_button_type_empty, R.id.cast_button_type_empty, R.id.cast_button_type_empty};
            }
            obtainStyledAttributes.recycle();
        }
    }

    private void a(RelativeLayout relativeLayout, int i, int i2) {
        View view = (ImageView) relativeLayout.findViewById(i);
        int i3 = this.e[i2];
        if (i3 == R.id.cast_button_type_empty) {
            view.setVisibility(4);
        } else if (i3 == R.id.cast_button_type_custom) {
        } else {
            if (i3 == R.id.cast_button_type_play_pause_toggle) {
                int i4 = R.drawable.cast_ic_mini_controller_play;
                int i5 = R.drawable.cast_ic_mini_controller_pause;
                i3 = R.drawable.cast_ic_mini_controller_stop;
                int i6;
                if (this.g == 1) {
                    i4 = R.drawable.cast_ic_mini_controller_play_large;
                    i5 = R.drawable.cast_ic_mini_controller_pause_large;
                    i3 = R.drawable.cast_ic_mini_controller_stop_large;
                    i6 = i5;
                    i5 = i4;
                    i4 = i6;
                } else {
                    i6 = i5;
                    i5 = i4;
                    i4 = i6;
                }
                Drawable drawable = getResources().getDrawable(i5);
                Drawable drawable2 = getResources().getDrawable(i4);
                Drawable drawable3 = getResources().getDrawable(i3);
                view.setImageDrawable(drawable2);
                View c = c(i);
                relativeLayout.addView(c);
                this.h.a(view, drawable, drawable2, drawable3, c, true);
            } else if (i3 == R.id.cast_button_type_skip_previous) {
                view.setImageDrawable(d(R.drawable.cast_ic_mini_controller_skip_prev));
                view.setContentDescription(getResources().getString(R.string.cast_skip_prev));
                this.h.b(view, 0);
            } else if (i3 == R.id.cast_button_type_skip_next) {
                view.setImageDrawable(d(R.drawable.cast_ic_mini_controller_skip_next));
                view.setContentDescription(getResources().getString(R.string.cast_skip_next));
                this.h.a(view, 0);
            } else if (i3 == R.id.cast_button_type_rewind_30_seconds) {
                view.setImageDrawable(d(R.drawable.cast_ic_mini_controller_rewind30));
                view.setContentDescription(getResources().getString(R.string.cast_rewind_30));
                this.h.b(view, (long) NotificationOptions.b);
            } else if (i3 == R.id.cast_button_type_forward_30_seconds) {
                view.setImageDrawable(d(R.drawable.cast_ic_mini_controller_forward30));
                view.setContentDescription(getResources().getString(R.string.cast_forward_30));
                this.h.a(view, (long) NotificationOptions.b);
            } else if (i3 == R.id.cast_button_type_mute_toggle) {
                view.setImageDrawable(getResources().getDrawable(R.drawable.cast_ic_mini_controller_mute));
                this.h.a((ImageView) view);
            } else if (i3 == R.id.cast_button_type_closed_caption) {
                view.setImageDrawable(d(R.drawable.cast_ic_mini_controller_closed_caption));
                this.h.c(view);
            }
        }
    }

    private ProgressBar c(int i) {
        ProgressBar progressBar = new ProgressBar(getContext());
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(8, i);
        layoutParams.addRule(6, i);
        layoutParams.addRule(5, i);
        layoutParams.addRule(7, i);
        layoutParams.addRule(15);
        progressBar.setLayoutParams(layoutParams);
        progressBar.setVisibility(8);
        return progressBar;
    }

    private Drawable d(@DrawableRes int i) {
        Drawable drawable = getResources().getDrawable(i);
        Drawable wrap = DrawableCompat.wrap(getResources().getDrawable(i).mutate());
        DrawableCompat.setTintMode(wrap, Mode.MULTIPLY);
        DrawableCompat.setTint(wrap, getResources().getColor(R.color.cast_mini_controller_disabled_button_drawable_tint_color));
        Drawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842910}, drawable);
        stateListDrawable.addState(new int[]{-16842910}, wrap);
        return stateListDrawable;
    }

    public final int a() {
        return 3;
    }

    public final int a(int i) {
        return this.e[i];
    }

    public void a(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        a(context, attributeSet);
    }

    public final ImageView b(int i) {
        return this.f[i];
    }

    public b b() {
        return this.h;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.h = new b(getActivity());
        View inflate = layoutInflater.inflate(R.layout.cast_mini_controller, viewGroup);
        inflate.setVisibility(8);
        this.h.c(inflate, 8);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.container_current);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon_view);
        TextView textView = (TextView) inflate.findViewById(R.id.title_view);
        if (this.c != 0) {
            textView.setTextAppearance(getActivity(), this.c);
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.subtitle_view);
        if (this.d != 0) {
            textView2.setTextAppearance(getActivity(), this.d);
        }
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progressBar);
        this.h.c((View) relativeLayout, 8);
        this.h.a(textView, MediaMetadata.k);
        this.h.a(textView2, MediaMetadata.l);
        this.h.a(progressBar);
        this.h.b((View) relativeLayout);
        if (this.b) {
            this.h.a(imageView, -1, R.drawable.cast_album_art_placeholder);
        } else {
            imageView.setVisibility(8);
        }
        this.f[0] = (ImageView) relativeLayout.findViewById(R.id.button_0);
        this.f[1] = (ImageView) relativeLayout.findViewById(R.id.button_1);
        this.f[2] = (ImageView) relativeLayout.findViewById(R.id.button_2);
        a(relativeLayout, R.id.button_0, 0);
        a(relativeLayout, R.id.button_1, 1);
        a(relativeLayout, R.id.button_2, 2);
        return inflate;
    }

    public void onDestroy() {
        if (this.h != null) {
            this.h.h();
            this.h = null;
        }
        super.onDestroy();
    }
}
