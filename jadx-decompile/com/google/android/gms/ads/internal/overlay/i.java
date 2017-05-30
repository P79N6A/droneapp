package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;
import com.google.android.gms.internal.aaa;

@TargetApi(14)
@aaa
public abstract class i extends TextureView {
    public i(Context context) {
        super(context);
    }

    public abstract String a();

    public abstract void a(float f);

    public abstract void a(float f, float f2);

    public abstract void a(int i);

    public abstract void a(h hVar);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);
}
