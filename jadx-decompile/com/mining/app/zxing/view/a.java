package com.mining.app.zxing.view;

import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;

public final class a implements ResultPointCallback {
    private final ViewfinderView a;

    public a(ViewfinderView viewfinderView) {
        this.a = viewfinderView;
    }

    public void foundPossibleResultPoint(ResultPoint resultPoint) {
        this.a.a(resultPoint);
    }
}
