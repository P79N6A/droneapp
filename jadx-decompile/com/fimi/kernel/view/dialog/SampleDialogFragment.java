package com.fimi.kernel.view.dialog;

import android.animation.Animator;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.fimi.kernel.utils.w;

public class SampleDialogFragment extends DialogFragment {
    protected w a;
    private int b;
    private int c;
    private View d;
    private OnCancelListener e = null;
    private OnDismissListener f = null;
    private int g;
    private int h;

    public static SampleDialogFragment a(int i, int i2) {
        return a(i, i2, 17);
    }

    public static SampleDialogFragment a(int i, int i2, int i3) {
        SampleDialogFragment sampleDialogFragment = new SampleDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("style", i);
        bundle.putInt("theme", i2);
        bundle.putInt("gravity", i3);
        sampleDialogFragment.setArguments(bundle);
        return sampleDialogFragment;
    }

    public static SampleDialogFragment a(int i, int i2, int i3, int i4) {
        SampleDialogFragment sampleDialogFragment = new SampleDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("style", i);
        bundle.putInt("theme", i2);
        bundle.putInt("gravity", i3);
        bundle.putInt("color", i4);
        sampleDialogFragment.setArguments(bundle);
        return sampleDialogFragment;
    }

    public View a() {
        return this.d;
    }

    public void a(int i) {
        this.a.c(i);
    }

    public void a(OnCancelListener onCancelListener) {
        this.e = onCancelListener;
    }

    public void a(OnDismissListener onDismissListener) {
        this.f = onDismissListener;
    }

    public void a(View view) {
        this.d = view;
    }

    protected void a(boolean z) {
        Window window = getActivity().getWindow();
        LayoutParams attributes = window.getAttributes();
        if (z) {
            attributes.flags |= 67108864;
        } else {
            attributes.flags &= -67108865;
        }
        window.setAttributes(attributes);
    }

    public OnCancelListener b() {
        return this.e;
    }

    public OnDismissListener c() {
        return this.f;
    }

    public void onActivityCreated(Bundle bundle) {
        Window window = getDialog().getWindow();
        window.getAttributes().gravity = this.g;
        window.setLayout(-1, -2);
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#88838B8B")));
        super.onActivityCreated(bundle);
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.e != null) {
            this.e.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dismiss();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = getArguments().getInt("style");
        this.b = getArguments().getInt("theme");
        this.g = getArguments().getInt("gravity");
        this.h = getArguments().getInt("color");
        setStyle(this.c, this.b);
        this.a = new w(getActivity());
        if (VERSION.SDK_INT >= 19) {
            a(true);
        }
        this.a.a(true);
        a(this.h);
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return super.onCreateAnimator(i, z, i2);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.d;
    }

    public void onDestroy() {
        super.onDestroy();
        dismiss();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f != null) {
            this.f.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }
}
