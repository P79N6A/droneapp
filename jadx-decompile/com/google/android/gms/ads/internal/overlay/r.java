package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.view.Surface;

public class r {
    @TargetApi(14)
    public Surface a(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }
}
